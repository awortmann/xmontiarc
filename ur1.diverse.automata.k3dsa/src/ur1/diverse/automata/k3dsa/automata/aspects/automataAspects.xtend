package ur1.diverse.automata.k3dsa.automata.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import automata.Automaton
import automata.State
import automata.Transition
import automata.Variable
import automata.Guard
import automata.BooleanGuard
import automata.StringGuard
import automata.NumberGuard
import automata.Action

import static extension ur1.diverse.automata.k3dsa.automata.aspects.AutomatonAspect.*
import static extension ur1.diverse.automata.k3dsa.automata.aspects.StateAspect.*
import static extension ur1.diverse.automata.k3dsa.automata.aspects.TransitionAspect.*
import static extension ur1.diverse.automata.k3dsa.automata.aspects.VariableAspect.*
import static extension ur1.diverse.automata.k3dsa.automata.aspects.BooleanVariableAspect.*
import static extension ur1.diverse.automata.k3dsa.automata.aspects.StringVariableAspect.*
import static extension ur1.diverse.automata.k3dsa.automata.aspects.NumberVariableAspect.*
import static extension ur1.diverse.automata.k3dsa.automata.aspects.GuardAspect.*
import static extension ur1.diverse.automata.k3dsa.automata.aspects.BooleanGuardAspect.*
import static extension ur1.diverse.automata.k3dsa.automata.aspects.StringGuardAspect.*
import static extension ur1.diverse.automata.k3dsa.automata.aspects.NumberGuardAspect.*
import static extension ur1.diverse.automata.k3dsa.automata.aspects.ActionAspect.*
import org.eclipse.emf.ecore.EObject
import fr.inria.diverse.k3.al.annotationprocessor.Step
import automata.StringVariable
import automata.NumberVariable
import automata.BooleanVariable
import automata.BooleanAction
import automata.NumberAction
import automata.StringAction
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import org.eclipse.emf.common.util.EList
import fr.inria.diverse.k3.al.annotationprocessor.Main
import java.util.ArrayList
import org.eclipse.emf.common.util.BasicEList
import java.util.Random

@Aspect(className=Automaton)
class AutomatonAspect {
    
    private State currentState
    
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
    
    @Step
    def public void determineInitialState() {
        var EList<State> possibleInitialStates = new BasicEList<State>
        for (State s : _self.states) {
            if (s.initial) {
                possibleInitialStates.add(s)
            }
        }
        val Random r = new Random()
        _self.currentState = possibleInitialStates.get(r.nextInt(possibleInitialStates.size))
    }

    @InitializeModel
    @Step
    def public void initializeModel(EList<String> args) {
        println("Initializing automaton")
        
    }

    @Main
    def void main() {
        while (true) {
            var boolean executed = false
            for (Transition t : _self.transitions) {
                if (!executed && t.guard.holds()) {
                   t.execute()
                   executed = true
                }
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
        val int op = _self.operator.value
        val BooleanVariable source = _self.source
        val boolean value = _self.value
        if (op == 0) { // ==
            return value == source.value
        } else if (op == 1) { // !=
            return value != source.value
        } else {
            throw new UnsupportedOperationException("There is no StringOperator of literal ' " + op + "'.")
        }
    }
}

@Aspect(className=StringGuard)
class StringGuardAspect extends GuardAspect {
    def boolean holds() {
        val int op = _self.operator.value
        val StringVariable source = _self.source
        val String value = _self.value
        if (op == 0) { // ==
            return value == source.value
        } else if (op == 1) { // !=
            return value != source.value
        } else {
            throw new UnsupportedOperationException("There is no BooleanOperator of literal ' " + op + "'.")
        }
    }
}

@Aspect(className=NumberGuard)
class NumberGuardAspect extends GuardAspect {
    def boolean holds() {
        val int op = _self.operator.value
        val NumberVariable source = _self.source
        val Long value = _self.value
        if (op == 0) { // ==
            return value == source.value
        } else if (op == 1) { // !=
            return value != source.value
        } else if (op == 2) { // <
            return value < source.value
        } else if (op == 3) { // >
            return value > source.value
        } else if (op == 4) { // <=
            return value <= source.value
        } else if (op == 5) { // >=
            return value >= source.value
        } else {
            throw new UnsupportedOperationException("There is no NumberOperator of literal ' " + op + "'.")
        }
    }
}

@Aspect(className=Action)
abstract class ActionAspect {
    def abstract void execute();
}

@Aspect(className=BooleanAction)
abstract class BooleanActionAspect {
    @Step
    def void execute() {
        val BooleanVariable target = _self.target
        target.value = _self.value
    }
}

@Aspect(className=NumberAction)
abstract class NumberActionAspect {
    @Step
    def void execute() {
        val NumberVariable target = _self.target
        target.value = _self.value
    }
}

@Aspect(className=StringAction)
abstract class StringActionAspect {
    @Step
    def void execute() {
        val StringVariable target = _self.target
        target.value = _self.value
    }
}
