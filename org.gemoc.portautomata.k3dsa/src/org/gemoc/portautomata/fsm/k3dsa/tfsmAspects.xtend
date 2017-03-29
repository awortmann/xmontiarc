package org.gemoc.portautomata.fsm.k3dsa

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step


import static extension org.gemoc.portautomata.fsm.k3dsa.StateAspect.*
import static extension org.gemoc.portautomata.fsm.k3dsa.StateMachineAspect.*
import static extension org.gemoc.portautomata.fsm.k3dsa.TransitionAspect.*
import static extension org.gemoc.portautomata.fsm.k3dsa.BooleanVariableAspect.*
import static extension org.gemoc.portautomata.fsm.k3dsa.StringVariableAspect.*
import static extension org.gemoc.portautomata.fsm.k3dsa.NumberVariableAspect.*
import static extension org.gemoc.portautomata.fsm.k3dsa.GuardAspect.*
import static extension org.gemoc.portautomata.fsm.k3dsa.BooleanGuardAspect.*
import static extension org.gemoc.portautomata.fsm.k3dsa.StringGuardAspect.*
import static extension org.gemoc.portautomata.fsm.k3dsa.EqualNumberGuardAspect.*
import static extension org.gemoc.portautomata.fsm.k3dsa.LessThanNumberGuardAspect.*
import static extension org.gemoc.portautomata.fsm.k3dsa.LessOrEqualThanNumberGuardAspect.*
import static extension org.gemoc.portautomata.fsm.k3dsa.GreaterOrEqualThanNumberGuardAspect.*
import static extension org.gemoc.portautomata.fsm.k3dsa.GreaterThanNumberGuardAspect.*
import static extension org.gemoc.portautomata.fsm.k3dsa.ActionAspect.*

import org.eclipse.emf.common.util.EList
import org.gemoc.portautomata.fsm.Variable
import org.gemoc.portautomata.fsm.BooleanVariable
import org.gemoc.portautomata.fsm.NumberVariable
import org.gemoc.portautomata.fsm.StringVariable

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import org.eclipse.emf.ecore.EObject
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import org.eclipse.emf.common.util.EList
import fr.inria.diverse.k3.al.annotationprocessor.Main
import java.util.ArrayList
import org.eclipse.emf.common.util.BasicEList
import java.util.Random
import org.gemoc.portautomata.fsm.Guard
import org.gemoc.portautomata.fsm.BooleanGuard
import org.gemoc.portautomata.fsm.StringGuard
import org.gemoc.portautomata.fsm.NumberGuard
import org.gemoc.portautomata.fsm.*
import java.util.Map
import java.util.HashMap

@Aspect(className=StateMachine)
class StateMachineAspect {

    public State currentState

    @Main
    def void main() {
        while (true) {
            var boolean executed = false
            for (Transition t : _self.currentState.outgoingTransitions) {
                if (!executed && t.guard.holds()) {
                    t.execute()
                    executed = true
                }
            }
        }
    }
/*
    @Step
    def public Map<String, Object> process(Map<String, Object> inputValues) {
        _self.mapInputsToVariables(inputValues)
        _self.process()
        return _self.mapVariablesToOutputs()
    }

    def public Map<String, Object> mapVariablesToOutputs() {
        var Map<String, Object> result = new HashMap<String, Object>();

        for (Variable v : _self.variables) {
            if (v instanceof StringVariable) {
                var StringVariable sv = (v as StringVariable)
                result.put(v.name, sv.value)
            } else if (v instanceof BooleanVariable) {
                var BooleanVariable bv = (v as BooleanVariable)
                result.put(v.name, bv.value)
            } else if (v instanceof NumberVariable) {
                var NumberVariable nv = (v as NumberVariable)
                result.put(v.name, nv.value)
            }
        }

        return result;
    }

    def public void mapInputsToVariables(Map<String, Object> inputValues) {
        for (Map.Entry<String,Object> entry : inputValues.entrySet) {
            for (Variable v : _self.variables) {
                if (v.name == entry.key) {
                    if (v instanceof StringVariable) {
                        var StringVariable sv = (v as StringVariable)
                        sv.value = (entry.value as String)
                    } else if (v instanceof BooleanVariable) {
                        var BooleanVariable bv = (v as BooleanVariable)
                        bv.value = (entry.value as Boolean)

                    } else if (v instanceof NumberVariable) {
                        var NumberVariable nv = (v as NumberVariable)
                        nv.value = (entry.value as Long)
                    }
                }
            }
        }
    }
*/
    @Step
    def public void process() {
        var boolean executed = false;
        for (Transition t : _self.currentState.outgoingTransitions) {
            if (!executed && t.guard.holds()) {
                t.execute()
                executed = true
                _self.currentState = t.getTarget()
            }
        }
    }

    @Step
    @InitializeModel
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
}

@Aspect(className=Transition)
class TransitionAspect {

    @Step
    def void execute() {
        _self.action.execute()
    }
}

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
        if (_self.not) { // !=
            return value != source.value
        } else { // ==
            return value == source.value
        }
    }
}

@Aspect(className=StringGuard)
class StringGuardAspect extends GuardAspect {
    def boolean holds() {
        val StringVariable source = _self.source
        val String value = _self.value
        if (_self.not) { // !=
            return value != source.value
        } else { // ==
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
class BooleanActionAspect extends ActionAspect {
    @Step
    def void execute() {
        val BooleanVariable target = _self.target
        target.value = _self.value
    }
}

@Aspect(className=NumberAction)
class NumberActionAspect extends ActionAspect {
    @Step
    def void execute() {
        println("execute numerical value")
        val NumberVariable target = _self.target
        target.value = _self.value
    }
}

@Aspect(className=StringAction)
class StringActionAspect extends ActionAspect {
    @Step
    def void execute() {
        val StringVariable target = _self.target
        target.value = _self.value
    }
}
