package ur1.diverse.montiarc.xdsml.montiarc.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step
import java.util.Random
import montiarc.ComponentInstance
import montiarc.ComponentType
import montiarc.Connector
import montiarc.ConnectorType
import montiarc.PortInstance
import montiarcruntime.MontiarcruntimeFactory
import montiarcruntime.PortValue
import org.eclipse.emf.common.util.EList
import montiarc.IntermediateConnectorType
import montiarc.IncomingConnectorType

@Aspect(className=ComponentType)
class ComponentTypeAspect {

	// @InitializeModel
	public def void init(EList<String> args) {
		println('''Initializing '«_self.name»''')
	}

	 // Computes behavior for the composed top-level component type 
	@Main
	@Step
	def void compute() {
		for (ComponentInstance ci : _self.subcomponents) {
			ci.compute();
		}
	}

	// Composed components update all their subcomponents via the respective connectors
	@Step
	def void update() {
		if (!_self.subcomponents.isEmpty) {
			for (ConnectorType con : _self.connectors) {
				println('''Propagating message over connector '«con.toString»'.''')
				con.update();
			}
		}
	}
}

@Aspect(className=ComponentInstance)
class ComponentInstanceAspect {


	private Random r = new Random
	
	@Step
	def void compute() {
		println('''Currently computing '«_self.instanceName»''')
//		_self.inputs.clear;
//		_self.computationResults.clear;
		
		// for atomic components: delegate behavior computation to their Groovy script
		if (_self.type.subcomponents.isEmpty) { // assume an atomic component
			// invoke _self.groovyBehavior
			// for each groovy behavior result
			// iterate over Hashmap and assign values to ports of the same name
			for (PortInstance pi : _self.ports) {
				pi.portValue = MontiarcruntimeFactory.eINSTANCE.createPortValue
				pi.portValue.value = _self.r.nextInt
				pi.portValue.type = pi.type
			}
		} // for composed components, propagate computation to subcomponents
		else {
			for (ComponentInstance ci : _self.type.subcomponents) {
				ci.compute();
			}
		}
	}

}

@Aspect(className=PortInstance)
class PortInstanceAspect {
	public PortValue portValue;
}

@Aspect(className=IntermediateConnectorType)
class IntermediateConnectorTypeAspect {
	// Moves data from source port to target port
	def void update() {
		_self.targetPort.portValue = _self.sourcePort.portValue;
		_self.targetPort.portValue = null;
	}
}

@Aspect(className=IncomingConnectorType)
class IncomingConnectorTypeAspect {
	// Moves data from source port to target port
	def void update() {
		_self.targetPort.portValue = _self.sourcePort.portValue;
		_self.targetPort.portValue = null;
	}
}