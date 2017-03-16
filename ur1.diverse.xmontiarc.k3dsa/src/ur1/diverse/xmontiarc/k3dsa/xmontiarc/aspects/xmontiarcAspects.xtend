package ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import fr.inria.diverse.k3.al.annotationprocessor.Step
import org.eclipse.emf.common.util.EList
import xmontiarc.ComponentType
import xmontiarc.Connector
import xmontiarc.Port
import xmontiarc.Subcomponent

import static extension ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ComponentTypeAspect.*
import static extension ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.PortAspect.*
import static extension ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ConnectorAspect.*
import static extension ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.SubcomponentAspect.*

import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
// import runtime.Message
import runtime.RuntimeFactory
import fr.inria.diverse.k3.al.annotationprocessor.Main
import xmontiarc.impl.ConnectorImpl
import java.util.Optional
import xmontiarc.impl.ComponentTypeImpl
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.common.util.BasicEList
import xmontiarc.IntermediateConnector
import xmontiarc.IncomingConnector
import xmontiarc.OutgoingConnector

@Aspect(className=ComponentType)
class ComponentTypeAspect {

    @InitializeModel
    @Step
    def public void initializeModel(EList<String> args) {
        println("Initializing component type " + _self.name);
    }

    @Main
    def void main() {
        println("main()")
        try {
            if (_self.incomingPorts.empty && _self.outgoingPorts.empty) {
                while (true) {
                    println("=== Starting " + _self.name + " Main Loop ===")
                    // Thread.sleep(1000);
                    _self.compute
                    _self.update
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Computes behavior for the composed top-level component type 
    @Step
    def void compute() {
        for (Subcomponent sc : _self.subcomponents) {
            sc.compute();
        }
    }

    // Composed components update all their subcomponents via the respective connectors
    @Step
    def void update() {
        if (!_self.subcomponents.isEmpty) {
            for (Connector con : _self.connectors) {
                println("Propagating message over connector '" + con.getRepresentation() + "'.")
                con.update();
            }
        }
    }

    def Subcomponent findOwnerOf(Port p) {
        for (Subcomponent sc : _self.getSubcomponents()) {
            for (Port scp : sc.incomingPorts) {
                if (scp.equals(p)) {
                    return sc;
                }
            }
            for (Port scp : sc.outgoingPorts) {
                if (scp.equals(p)) {
                    return sc;
                }
            }
        }
        return null;
    }

    def EList<Port> getOutgoingPortsOfSubcomponents() {
        return _self.getDirectedPortsOfSubcomponents(false);
    }
    
    def EList<Port> getIncomingPortsOfSubcomponents() {
        return _self.getDirectedPortsOfSubcomponents(true);
    }
    
    def EList<Port> getDirectedPortsOfSubcomponents(boolean collectIncoming) {
        var EList<Port> ports = new BasicEList<Port>();
        for (Subcomponent sc : _self.getSubcomponents()) {
            if (collectIncoming) {
                ports.addAll(sc.incomingPorts)
            } else {
                ports.addAll(sc.outgoingPorts)
            }
        }
        return ports;
    }
   
}

@Aspect(className=Port)
class PortAspect {
    // public Message msgValue;
}

@Aspect(className=Connector)
class ConnectorAspect {
    // Moves data from source port to target port
    def void update() {
        if (_self instanceof IntermediateConnector) {
            val IntermediateConnector c = _self as IntermediateConnector
            c.target.value = c.source.value
            c.source.value = null
        }
        else if (_self instanceof IncomingConnector) {
            val IncomingConnector c = _self as IncomingConnector
            c.target.value = c.source.value
            c.source.value = null
        }
        else if (_self instanceof OutgoingConnector) {
            val OutgoingConnector c = _self as OutgoingConnector
            c.target.value = c.source.value
            c.source.value = null
        }
        else {
            throw new Error("Trying to pass a message over instance of abstract connector class")
        }
    }
    
    def Port getSource() {
        var Port source;
        if (_self instanceof IntermediateConnector) {
            val IntermediateConnector c = _self as IntermediateConnector
            source = c.getSource();
        }
        else if (_self instanceof IncomingConnector) {
            val IncomingConnector c = _self as IncomingConnector
            source = c.getSource();
        }
        else if (_self instanceof OutgoingConnector) {
            val OutgoingConnector c = _self as OutgoingConnector
            source = c.getSource();
        }
        else {
            throw new Error("Found instance of abstract class Connector.");
        }
        return source;
    }
    
     def Port getTarget() {
        var Port target;
        if (_self instanceof IntermediateConnector) {
            val IntermediateConnector c = _self as IntermediateConnector
            target = c.getTarget();
        }
        else if (_self instanceof IncomingConnector) {
            val IncomingConnector c = _self as IncomingConnector
            target = c.getTarget();
        }
        else if (_self instanceof OutgoingConnector) {
            val OutgoingConnector c = _self as OutgoingConnector
            target = c.getTarget();
        }
        else {
            throw new Error("Found instance of abstract class Connector.");
        }
        return target;
    }
    
    def String getSourceRepresentation() {
        if (_self.getParent() != null) {
            var Subcomponent sc = _self.getParent().findOwnerOf(_self.getSource);
            if (sc != null) {
                return sc.name + "." + _self.source.name
            }
        }
        return "N/A";
    }

    def String getTargetRepresentation() {
        if (_self.getParent() != null) {
            val Subcomponent sc = _self.getParent().findOwnerOf(_self.getTarget);
            if (sc != null) {
                return sc.name + "." + _self.target.name
            }
        }
        return "N/A";
    }

    def String getRepresentation() {
        return _self.getSourceRepresentation() + " -> " + _self.getTargetRepresentation();
    }
}

@Aspect(className=Subcomponent)
class SubcomponentAspect {
    @Step
    def void compute() {
        // println("SubcomponentAspect.compute()")
        println("Computing behavior for subcomponent '" + _self.name + "'.");
        // for atomic components: delegate behavior computation to their Groovy script
        if (_self.type.subcomponents.isEmpty) { // assume an atomic component
        // println("Subcomponent '" + _self.name + "' is atomic.");
            for (Port p : _self.outgoingPorts) {
                // println("Subcomponent '" + _self.name + "' has port '" + p.name + "'.");
                var behavior = _self.type.behavior
                // println("Behavior of '" + _self.name + "' is '" + behavior + "'.")
                // println("Computing next value of outgoing port " + _self.name + "." + p.name + ".")
                var result = ur1.diverse.xmontiarc.runtime.GroovyInterpreter.interpret(behavior);
                p.value = result
                println("Assigning value '" + p.value + "' to outgoing port " + _self.name + "." + p.name + ".")
            }
        } // for composed components, propagate computation to subcomponents
        else {
            for (Subcomponent ci : _self.type.subcomponents) {
                println("Subcomponent '" + _self.name + "' is composed.");
                ci.compute();
            }
        }
    }
}
