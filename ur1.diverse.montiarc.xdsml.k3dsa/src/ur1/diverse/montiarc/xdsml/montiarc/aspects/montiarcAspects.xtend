package ur1.diverse.montiarc.xdsml.montiarc.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import montiarc.ComponentType
import montiarc.Connector
import montiarc.Port
import montiarc.SubcomponentDeclaration

import static extension ur1.diverse.montiarc.xdsml.montiarc.aspects.ComponentTypeAspect.*
import static extension ur1.diverse.montiarc.xdsml.montiarc.aspects.PortAspect.*
import static extension ur1.diverse.montiarc.xdsml.montiarc.aspects.ConnectorAspect.*
import static extension ur1.diverse.montiarc.xdsml.montiarc.aspects.SubcomponentDeclarationAspect.*
import montiarcruntime.PortValue
import fr.inria.diverse.k3.al.annotationprocessor.Main
import montiarcruntime.MontiarcruntimeFactory
import fr.inria.diverse.k3.al.annotationprocessor.Step
import org.eclipse.emf.common.util.EList
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import java.util.Random

@Aspect(className=ComponentType)
class ComponentTypeAspect {

	private Random r = new Random
	
	//@InitializeModel
	public def void init(EList<String> args) {
		println('''Initializing '«_self.name»''')
	}
	
//	Map<String,Object> inputs = new HashMap();
//	Map<String,Object> computationResults = new HashMap();
	
	// All components compute their output based on previous input stored in Port.currentValue 
	// All outputs are stored in variables Port.nextValue
	@Main
	@Step
	def void compute() {
//		_self.inputs.clear;
//		_self.computationResults.clear;
		println('''Currently computing '«_self.name»''')
		if (_self.subcomponents.isEmpty) { // assume an atomic component
			// invoke _self.groovyBehavior
			//foreach groovey behavior result
			//iterate over hashmap and assign values to ports of the same name
			
			for (Port p : _self.ports) {
				p.portValue = MontiarcruntimeFactory.eINSTANCE.createPortValue
				p.portValue.value=_self.r.nextInt
				p.portValue.type=p.type
			}
	   }
	   // for composed components, propagate computation to subcomponents
	   else { 
			for (SubcomponentDeclaration scd : _self.subcomponents) {
				scd.componentType.compute();
			}
	   }
	}

    // Composed components update all their subcomponents via the respective connectors
    @Step
  	def void update() {
   		if (!_self.subcomponents.isEmpty) { // assume a composed component
   			for (Connector con : _self.connectors) {
   				con.update();
   				println('''Propagating message over connector '«con.toString»'.''')
   			}
  		}
  	}
}

@Aspect(className=Port)
class PortAspect {
	public PortValue portValue;
}

@Aspect(className=Connector)
class ConnectorAspect {
	
	// Moves data from source port to target port
	def void update() {
		_self.targetPort.portValue = _self.sourcePort.portValue;
		_self.targetPort.portValue = null;
	}
	
}

@Aspect(className=SubcomponentDeclaration)
class SubcomponentDeclarationAspect {

}

