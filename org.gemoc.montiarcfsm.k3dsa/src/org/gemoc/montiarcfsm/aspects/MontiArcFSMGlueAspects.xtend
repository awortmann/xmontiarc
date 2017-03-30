package org.gemoc.montiarcfsm.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import fr.inria.diverse.k3.al.annotationprocessor.Containment
import org.gemoc.montiarc.montiarc.AutomatonComponentBehavior
import org.gemoc.montiarc.k3dsa.aspects.AutomatonComponentBehaviorAspect
import org.gemoc.montiarc.montiarc.ComponentType
import org.gemoc.montiarc.montiarc.Subcomponent


import static extension org.gemoc.montiarcfsm.aspects.AutomatonComponentBehaviorGlueAspect.*
import static extension org.gemoc.montiarc.k3dsa.aspects.PortAspect.*
import static extension org.gemoc.portautomata.fsm.k3dsa.StateMachineAspect.*
import static extension org.gemoc.portautomata.fsm.k3dsa.VariableAspect.*
import static extension org.gemoc.portautomata.fsm.k3dsa.BooleanVariableAspect.*
import static extension org.gemoc.portautomata.fsm.k3dsa.NumberVariableAspect.*
import static extension org.gemoc.portautomata.fsm.k3dsa.StringVariableAspect.*
import org.gemoc.portautomata.fsm.StringVariable
import org.gemoc.portautomata.fsm.NumberVariable
import org.gemoc.portautomata.fsm.BooleanVariable

@Aspect(className=AutomatonComponentBehavior)
class AutomatonComponentBehaviorGlueAspect extends  AutomatonComponentBehaviorAspect {

	@Containment
	public org.gemoc.portautomata.fsm.StateMachine delegateFSM
	
	override void wrapPortValuesToAutomaton(){
		var c = _self.eContainer
		if(c instanceof ComponentType){
			for( p : c.incomingPorts) {
				val v = _self.delegateFSM.variables.findFirst[v| p.name == v.name]
				switch (v) {
					StringVariable case p.type == "String" : {
						v.value = p.value.toString
					}
					NumberVariable case p.type == "Number" : {
						// TODO						
						//v.value = p.value.
					}
					BooleanVariable case p.type == "Boolean" : {
						// TODO
						//v.value = p.value.
					}
					default: {
						
					}
				}
			}
		} else if ( c instanceof Subcomponent){
			
		}
	}
 	override void process(){
 		// TODO
 	}
 	override void unwrapPortValuesFromAutomaton(){
 		// TODO
 	}
	
}



