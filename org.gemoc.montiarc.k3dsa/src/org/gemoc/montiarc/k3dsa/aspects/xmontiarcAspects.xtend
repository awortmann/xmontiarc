package org.gemoc.montiarc.k3dsa.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step
import java.util.Random
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EcorePackage
import org.gemoc.montiarc.montiarc.AutomatonComponentBehavior
import org.gemoc.montiarc.montiarc.ComponentBehavior
import org.gemoc.montiarc.montiarc.ComponentType
import org.gemoc.montiarc.montiarc.Connector
import org.gemoc.montiarc.montiarc.DataType
import org.gemoc.montiarc.montiarc.GroovyComponentBehavior
import org.gemoc.montiarc.montiarc.IncomingConnector
import org.gemoc.montiarc.montiarc.IntermediateConnector
import org.gemoc.montiarc.montiarc.OutgoingConnector
import org.gemoc.montiarc.montiarc.Port
import org.gemoc.montiarc.montiarc.Subcomponent

import static extension org.gemoc.montiarc.k3dsa.aspects.ComponentTypeAspect.*
import static extension org.gemoc.montiarc.k3dsa.aspects.PortAspect.*
import static extension org.gemoc.montiarc.k3dsa.aspects.ConnectorAspect.*
import static extension org.gemoc.montiarc.k3dsa.aspects.SubcomponentAspect.*
import static extension org.gemoc.montiarc.k3dsa.aspects.AutomatonComponentBehaviorAspect.*
import fr.inria.diverse.k3.al.annotationprocessor.Containment
import org.eclipse.emf.common.util.EMap
import groovy.lang.Binding
import groovy.lang.GroovyShell

//import automata.Automaton

@Aspect(className=AutomatonComponentBehavior)
abstract class AutomatonComponentBehaviorAspect {
 	abstract def void wrapPortValuesToAutomaton()
 	abstract def void process()
 	abstract def void unwrapPortValuesFromAutomaton()
}

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
        println("=== Computing behavior for component type '" + _self.name + "' ===")
        for (Subcomponent sc : _self.subcomponents) {
            sc.compute();
        }
    }

    // Composed components update all their subcomponents via the respective connectors
    @Step
    def void update() {
        if (!_self.subcomponents.isEmpty) {
            for (Connector con : _self.connectors) {
                println("-> Propagating message over connector '" + con.getRepresentation() + "'.")
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
    public EDataType value;
    
    def String toString() {
        return _self.value.name
    }
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
    
 //   private static Random rand = new Random();
    
    def void createDefaultBehavior() {
    	val binding = new Binding();

		//Binding setVariable allow to pass a variable from the moonti arc model to the groovy interpreter
		//binding.setVariable(name, value);
		val groovyScript  = (_self.type.behavior as GroovyComponentBehavior).scriptBody
		

		val shell = new GroovyShell(binding);		    
		val result = shell.evaluate(groovyScript);
    	
    	
        for (Port p : _self.outgoingPorts) {
            var EDataType data
            if (p.getType().equals(DataType.BOOLEAN)) {
                data =  EcorePackage.eINSTANCE.getEBoolean();
                if (result == true){
	                data.setName("true");
	                
	                }
	            else{
	                data.setName("false");	            	
	            }
	            
            }
            else if (p.getType().equals(DataType.NUMBER)) {
	            data =  EcorePackage.eINSTANCE.getELong();
                if (result instanceof Integer){
	                data.setName(""+result);
	                
	                }
	            else{
	                data.setName("0");	            	
	            }
            }
            else if (p.getType().equals(DataType.STRING)) {
                data =  EcorePackage.eINSTANCE.getEString();
                data.setName(""+result);
            }
            p.value = data
        }
    }
    
    @Step
    def void compute() {
        // println("SubcomponentAspect.compute()")
        println("### Computing behavior for subcomponent '" + _self.type.name + "." + _self.name + "'.");
        // for atomic components: delegate behavior computation to their Groovy script
        if (_self.type.subcomponents.isEmpty) { // assume an atomic component
        // println("Subcomponent '" + _self.name + "' is atomic.");
           val ComponentBehavior behavior = _self.type.behavior  
            if (behavior instanceof GroovyComponentBehavior) {
                _self.createDefaultBehavior()
            } 
            else if (behavior instanceof AutomatonComponentBehavior && _self.localBehavior instanceof AutomatonComponentBehavior ) {
            	val localBehavior =  _self.localBehavior as AutomatonComponentBehavior
                // actually each subcomponent has its own copy of the behavior in order to have independent diagram
                localBehavior.wrapPortValuesToAutomaton()
                localBehavior.process()
                localBehavior.unwrapPortValuesFromAutomaton()
            }
            else {
               // Should never occurs !
            }
            
        } // for composed components, propagate computation to subcomponents
        else {
            println("=> Computing behavior for composed subcomponent '" + _self.type.name + "." + _self.name + "'.");
            for (Subcomponent ci : _self.type.subcomponents) {
                
                ci.compute();
            }
        }
    }
}
