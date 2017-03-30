package org.gemoc.montiarcfsm.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import fr.inria.diverse.k3.al.annotationprocessor.Containment
import org.gemoc.montiarc.montiarc.AutomatonComponentBehavior
import org.gemoc.montiarc.k3dsa.aspects.AutomatonComponentBehaviorAspect
import org.gemoc.montiarc.montiarc.ComponentType
import org.gemoc.montiarc.montiarc.Subcomponent
import org.gemoc.portautomata.fsm.StringVariable
import org.gemoc.portautomata.fsm.NumberVariable
import org.gemoc.portautomata.fsm.BooleanVariable
import org.gemoc.montiarc.montiarc.IncomingPort
import org.eclipse.emf.common.util.EList
import org.gemoc.portautomata.fsm.Transition


import static extension org.gemoc.montiarcfsm.aspects.AutomatonComponentBehaviorGlueAspect.*

import static extension org.gemoc.montiarc.k3dsa.aspects.PortAspect.*

import static extension org.gemoc.portautomata.fsm.k3dsa.GuardAspect.*
import static extension org.gemoc.portautomata.fsm.k3dsa.StateAspect.*
import static extension org.gemoc.portautomata.fsm.k3dsa.StateMachineAspect.*
import static extension org.gemoc.portautomata.fsm.k3dsa.TransitionAspect.*

import static extension org.gemoc.portautomata.fsm.k3dsa.VariableAspect.*
import static extension org.gemoc.portautomata.fsm.k3dsa.BooleanVariableAspect.*
import static extension org.gemoc.portautomata.fsm.k3dsa.NumberVariableAspect.*
import static extension org.gemoc.portautomata.fsm.k3dsa.StringVariableAspect.*

@Aspect(className=AutomatonComponentBehavior)
class AutomatonComponentBehaviorGlueAspect extends  AutomatonComponentBehaviorAspect {

	@Containment
	public org.gemoc.portautomata.fsm.StateMachine delegateFSM
	
	override void wrapPortValuesToAutomaton(){
		val c = _self.eContainer
		var EList<IncomingPort> ports
		if(c instanceof ComponentType){
			ports = c.incomingPorts
		} else if ( c instanceof Subcomponent){
			ports = c.incomingPorts
		}
		for( p : ports) {
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
	}
 	override void process(){
 		var boolean executed = false
 		for (Transition t : _self.delegateFSM.currentState.outgoingTransitions) {
            if (!executed && t.guard.holds()) {
                t.execute()
                executed = true
            }
        }
 	}
 	override void unwrapPortValuesFromAutomaton(){
 		val c = _self.eContainer
		var EList<IncomingPort> ports
		if(c instanceof ComponentType){
			ports = c.incomingPorts
		} else if ( c instanceof Subcomponent){
			ports = c.incomingPorts
		}
		for( p : ports) {
			val v = _self.delegateFSM.variables.findFirst[v| p.name == v.name]
			switch (v) {
				StringVariable case p.type == "String" : {
					// TODO
					// p.value = v.value
				}
				NumberVariable case p.type == "Number" : {
					// TODO						
					//p.value = v.value.
				}
				BooleanVariable case p.type == "Boolean" : {
					// TODO
					//p.value = v.value.
				}
				default: {
					
				}
			}
		}
 	}
	
}



