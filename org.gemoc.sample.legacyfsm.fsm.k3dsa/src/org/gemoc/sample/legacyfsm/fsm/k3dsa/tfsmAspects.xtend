package org.gemoc.sample.legacyfsm.fsm.k3dsa

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step

import org.gemoc.sample.legacyfsm.fsm.State
import org.gemoc.sample.legacyfsm.fsm.StateMachine
import org.gemoc.sample.legacyfsm.fsm.Transition

import static extension org.gemoc.sample.legacyfsm.fsm.k3dsa.StateAspect.*
import static extension org.gemoc.sample.legacyfsm.fsm.k3dsa.StateMachineAspect.*
import static extension org.gemoc.sample.legacyfsm.fsm.k3dsa.TransitionAspect.*
import static extension org.gemoc.sample.legacyfsm.fsm.k3dsa.BooleanVariableAspect.*
import static extension org.gemoc.sample.legacyfsm.fsm.k3dsa.StringVariableAspect.*
import static extension org.gemoc.sample.legacyfsm.fsm.k3dsa.NumberVariableAspect.*
import static extension org.gemoc.sample.legacyfsm.fsm.k3dsa.GuardAspect.*
import static extension org.gemoc.sample.legacyfsm.fsm.k3dsa.BooleanGuardAspect.*
import static extension org.gemoc.sample.legacyfsm.fsm.k3dsa.StringGuardAspect.*
import static extension org.gemoc.sample.legacyfsm.fsm.k3dsa.EqualNumberGuardAspect.*
import static extension org.gemoc.sample.legacyfsm.fsm.k3dsa.LessThanNumberGuardAspect.*
import static extension org.gemoc.sample.legacyfsm.fsm.k3dsa.LessOrEqualThanNumberGuardAspect.*
import static extension org.gemoc.sample.legacyfsm.fsm.k3dsa.GreaterOrEqualThanNumberGuardAspect.*
import static extension org.gemoc.sample.legacyfsm.fsm.k3dsa.GreaterThanNumberGuardAspect.*



import static extension org.gemoc.sample.legacyfsm.fsm.k3dsa.ActionAspect.*

import org.eclipse.emf.common.util.EList
import org.gemoc.sample.legacyfsm.fsm.Variable
import org.gemoc.sample.legacyfsm.fsm.BooleanVariable
import org.gemoc.sample.legacyfsm.fsm.NumberVariable
import org.gemoc.sample.legacyfsm.fsm.StringVariable

import fr.inria.diverse.k3.al.annotationprocessor.Aspect 

import org.eclipse.emf.ecore.EObject
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import org.eclipse.emf.common.util.EList
import fr.inria.diverse.k3.al.annotationprocessor.Main
import java.util.ArrayList
import org.eclipse.emf.common.util.BasicEList
import java.util.Random
import org.gemoc.sample.legacyfsm.fsm.Guard
import org.gemoc.sample.legacyfsm.fsm.BooleanGuard
import org.gemoc.sample.legacyfsm.fsm.StringGuard
import org.gemoc.sample.legacyfsm.fsm.NumberGuard
import org.gemoc.sample.legacyfsm.fsm.*

@Aspect(className=StateMachine)
class StateMachineAspect {

	public State currentState

	public String unprocessedString
	public String consummedString
	public String producedString

	@Main
	def public void main() {
		
		println("Start the main")
		try {

			while (!_self.currentState.outgoingTransitions.isEmpty) {
				_self.currentState.step(_self.unprocessedString)
			}
		} catch (Exception nt) {
			println("Stopped due to " + nt.message)
		}
	}

	@Step
	@InitializeModel
	def public void initializeModel(EList<String> args) {
		println("Start the init")
		_self.currentState = _self.initialState;
		_self.unprocessedString = args.get(0)
		_self.consummedString = ""
		_self.producedString = ""
		_self.assignInitialValues()
	}

	@Step
	def public void assignInitialValues() {
		for (Variable v : _self.variables) {
			if (v instanceof BooleanVariable) {
				val BooleanVariable ref = v as BooleanVariable
				ref.value = ref.initialValue
			} else if (v instanceof NumberVariable) {
				val NumberVariable ref = v as NumberVariable
				ref.value = ref.initialValue
			} else if (v instanceof StringVariable) {
				val StringVariable ref = v as StringVariable
				ref.value = ref.initialValue
			} else {
				throw new Error("Found unsupported variable subtype")
			}
		}
	}

}

@Aspect(className=State)
class StateAspect {
	@Step
	def public void step(String inputString) {
		// Get the valid transitions	
		if (inputString != null && !inputString.equals("")) {
			val validTransitions = _self.outgoingTransitions.filter[t|inputString.startsWith(t.input)]
			if (validTransitions.empty) {
				// throw new NoTransition()
				throw new Exception("No Transition")
			}
			if (validTransitions.size > 1) {
				// throw new NonDeterminism()
				throw new Exception("Non Determinism")

			}
			// Fire transition
				var boolean executed = false
                while(!executed){
	                if (!executed && validTransitions.get(0).guard.holds()) {
	                   validTransitions.get(0).fire()
	                   executed = true
	                }
                }
            }
		else{
            val validTransitions = _self.outgoingTransitions.filter[t|t.input == null || "".equals("")]            
            //var toexecute  = new ArrayList<Transition>
            //toexecute.addAll(validTransitions)
            var executed = false
            while (!executed) {            
            for (Transition t : validTransitions) {
                if (!executed && t.guard.holds()) {
                   t.fire
                   executed = true
                }
            }
        }				
		}
	}
}

@Aspect(className=Transition)
class TransitionAspect {
	
	@Step
	def public void fire() {
		println("Firing " + _self.name + " and entering " + _self.target.name)
		val fsm = _self.source.owningFSM
		fsm.currentState = _self.target
		if (_self.output != null)
			fsm.producedString = fsm.producedString + _self.output
		if (_self.input != null) {
			fsm.consummedString = fsm.consummedString + _self.input
			fsm.unprocessedString = fsm.unprocessedString.substring(_self.input.length)
		}

		_self.action.execute()
	}
}

/* need to be enabled when feature request  */
/*class NoTransition extends Exception {
}*/

/*class NonDeterminism extends Exception {
}*/

@Aspect(className=Variable)
class VariableAspect {
}

@Aspect(className=StringVariable)
class StringVariableAspect {
	public String value;
}

@Aspect(className=NumberVariable)
class NumberVariableAspect {
	public Long value;
}

@Aspect(className=BooleanVariable)
class BooleanVariableAspect {
	public Boolean value;
}

@Aspect(className=Guard)
abstract class GuardAspect {
	@Step
	def abstract boolean holds();

}

@Aspect(className=BooleanGuard)
class BooleanGuardAspect extends GuardAspect {
	def boolean holds() {
		val BooleanVariable source = _self.source
		val boolean value = _self.value
		if (_self.not) { // ==
			return value != source.value
		} else  { // !=
			return value == source.value
		} 
	}
}

@Aspect(className=StringGuard)
class StringGuardAspect extends GuardAspect {
	def boolean holds() {
		val StringVariable source = _self.source
		val String value = _self.value
		if (_self.not) { // ==
			return value != source.value
		} else  { // !=
			return value == source.value
		} 
	}
}


@Aspect(className=NumberGuard)
class NumberGuardAspect extends GuardAspect {
	def boolean holds() {
		val NumberVariable source = _self.source
		val Long value = _self.value
		return value == source.value		
	}
}
 
@Aspect(className=EqualNumberGuard)
class EqualNumberGuardAspect extends NumberGuardAspect {
	def boolean holds() {
		val NumberVariable source = _self.source
		val Long value = _self.value
		return value == source.value		
	}
}


@Aspect(className=GreaterThanNumberGuard)
class GreaterThanNumberGuardAspect extends NumberGuardAspect {
	def boolean holds() {
		val NumberVariable source = _self.source
		val Long value = _self.value
		return value > source.value		
	}
}


@Aspect(className=GreaterOrEqualThanNumberGuard)
class GreaterOrEqualThanNumberGuardAspect extends NumberGuardAspect {
	def boolean holds() {
		val NumberVariable source = _self.source
		val Long value = _self.value
		return value >= source.value		
	}
}

@Aspect(className=LessThanNumberGuard)
class LessThanNumberGuardAspect extends NumberGuardAspect {
	def boolean holds() {
		val NumberVariable source = _self.source
		val Long value = _self.value
		return value > source.value		
	}
}


@Aspect(className=LessOrEqualThanNumberGuard)
class LessOrEqualThanNumberGuardAspect extends NumberGuardAspect {
	def boolean holds() {
		val NumberVariable source = _self.source
		val Long value = _self.value
		return value >= source.value		
	}
}

 

@Aspect(className=Action)
abstract class ActionAspect {
	def abstract void execute();
}

@Aspect(className=BooleanAction)
class BooleanActionAspect extends ActionAspect{
	@Step
	def void execute() {
		val BooleanVariable target = _self.target
		target.value = _self.value
	}
}
 
@Aspect(className=NumberAction)
class NumberActionAspect extends ActionAspect{
	@Step
	def void execute() {
		println("execute numerical value")
		val NumberVariable target = _self.target
		target.value = _self.value
	}
}

@Aspect(className=StringAction)
class StringActionAspect extends ActionAspect{
	@Step
	def void execute() {
		val StringVariable target = _self.target
		target.value = _self.value
	}
}
