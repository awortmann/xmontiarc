package org.gemoc.montiarcfsm.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import static extension org.gemoc.montiarcfsm.aspects.AutomatonComponentBehaviorGlueAspect.*
import fr.inria.diverse.k3.al.annotationprocessor.Containment
import org.gemoc.montiarc.montiarc.AutomatonComponentBehavior
import org.gemoc.montiarc.k3dsa.aspects.AutomatonComponentBehaviorAspect

@Aspect(className=AutomatonComponentBehavior)
class AutomatonComponentBehaviorGlueAspect extends  AutomatonComponentBehaviorAspect {

	@Containment
	public org.gemoc.portautomata.fsm.StateMachine delegateFSM
	
	override void sendPortValuesToAutomaton(){
		
	}
 	override void process(){
 		
 	}
 	override void setPortValuesFromAutomaton(){
 		
 	}
	
}



