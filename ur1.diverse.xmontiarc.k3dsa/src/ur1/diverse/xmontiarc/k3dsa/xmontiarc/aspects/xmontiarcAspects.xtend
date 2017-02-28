package ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Main
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
import ur1.diverse.xmontiarc.runtime.GroovyInterpreter
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel

@Aspect(className=ComponentType)
class ComponentTypeAspect {
	
	@InitializeModel
	public def void init(EList<String> args) {
		println("Initializing component type " + _self.name);
	}

	// Computes behavior for the composed top-level component type 
	@Main
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
				println("Propagating message over connector '" + con.toString + "'.")
				con.update();
			}
		}
	}
}

@Aspect(className=Port)
class PortAspect {
	public String value;
}

@Aspect(className=Connector)
class ConnectorAspect {
	// Moves data from source port to target port
	def void update() {
		_self.target.value = _self.source.value;
		_self.target.value = null;
	}
}

@Aspect(className=Subcomponent)
class SubcomponentAspect {
	@Step
	def void compute() {
		println("Computing behavior for subcomponent '" + _self.name + "'.");
		// for atomic components: delegate behavior computation to their Groovy script
		if (_self.type.subcomponents.isEmpty) { // assume an atomic component
			for (Port p : _self.ports) {
				if (!p.isIncoming) {
					p.value = GroovyInterpreter.interpret(_self.type.behavior);
				}
			}
		} // for composed components, propagate computation to subcomponents
		else {
			for (Subcomponent ci : _self.type.subcomponents) {
				ci.compute();
			}
		}
	}
}
