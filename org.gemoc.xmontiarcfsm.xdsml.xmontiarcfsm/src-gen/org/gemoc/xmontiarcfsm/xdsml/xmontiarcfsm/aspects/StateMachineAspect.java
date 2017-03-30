package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.BooleanVariable;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.NumberVariable;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.State;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.StateMachine;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.StringVariable;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.Transition;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.Variable;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.BooleanVariableAspect;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.GuardAspect;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.NumberVariableAspect;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.StateMachineAspectStateMachineAspectProperties;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.StringVariableAspect;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.TransitionAspect;

@Aspect(className = StateMachine.class)
@SuppressWarnings("all")
public class StateMachineAspect {
  @Main
  public static void main(final StateMachine _self) {
	final org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.StateMachineAspectStateMachineAspectContext
			.getSelf(_self);
	_privk3_main(_self_, _self);
	;
}
  
  /**
   * @Step
   * def public Map<String, Object> process(Map<String, Object> inputValues) {
   * _self.mapInputsToVariables(inputValues)
   * _self.process()
   * return _self.mapVariablesToOutputs()
   * }
   * 
   * def public Map<String, Object> mapVariablesToOutputs() {
   * var Map<String, Object> result = new HashMap<String, Object>();
   * 
   * for (Variable v : _self.variables) {
   * if (v instanceof StringVariable) {
   * var StringVariable sv = (v as StringVariable)
   * result.put(v.name, sv.value)
   * } else if (v instanceof BooleanVariable) {
   * var BooleanVariable bv = (v as BooleanVariable)
   * result.put(v.name, bv.value)
   * } else if (v instanceof NumberVariable) {
   * var NumberVariable nv = (v as NumberVariable)
   * result.put(v.name, nv.value)
   * }
   * }
   * 
   * return result;
   * }
   * 
   * def public void mapInputsToVariables(Map<String, Object> inputValues) {
   * for (Map.Entry<String,Object> entry : inputValues.entrySet) {
   * for (Variable v : _self.variables) {
   * if (v.name == entry.key) {
   * if (v instanceof StringVariable) {
   * var StringVariable sv = (v as StringVariable)
   * sv.value = (entry.value as String)
   * } else if (v instanceof BooleanVariable) {
   * var BooleanVariable bv = (v as BooleanVariable)
   * bv.value = (entry.value as Boolean)
   * 
   * } else if (v instanceof NumberVariable) {
   * var NumberVariable nv = (v as NumberVariable)
   * nv.value = (entry.value as Long)
   * }
   * }
   * }
   * }
   * }
   */
  @Step
  public static void process(final StateMachine _self) {
	final org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.StateMachineAspectStateMachineAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_process(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "StateMachine", "process");
	} else {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry
				.getInstance().findEventManager(null);
		if (eventManager != null) {
			eventManager.manageEvents();
		}
		command.execute();
	}
	;
	;
}
  
  @Step
  @InitializeModel
  public static void assignInitialValues(final StateMachine _self) {
	final org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.StateMachineAspectStateMachineAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_assignInitialValues(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "StateMachine", "assignInitialValues");
	} else {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry
				.getInstance().findEventManager(null);
		if (eventManager != null) {
			eventManager.manageEvents();
		}
		command.execute();
	}
	;
	;
}
  
  public static State currentState(final StateMachine _self) {
	final org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.StateMachineAspectStateMachineAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_currentState(_self_, _self);
	;
	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.State) result;
}
  
  public static void currentState(final StateMachine _self, final State currentState) {
	final org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.StateMachineAspectStateMachineAspectContext
			.getSelf(_self);
	_privk3_currentState(_self_, _self, currentState);
	;
}
  
  protected static void _privk3_main(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    while (true) {
      {
        boolean executed = false;
        State _currentState = StateMachineAspect.currentState(_self);
        EList<Transition> _outgoingTransitions = _currentState.getOutgoingTransitions();
        for (final Transition t : _outgoingTransitions) {
          if (((!executed) && GuardAspect.holds(t.getGuard()))) {
            TransitionAspect.execute(t);
            executed = true;
          }
        }
      }
    }
  }
  
  protected static void _privk3_process(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    boolean executed = false;
    State _currentState = StateMachineAspect.currentState(_self);
    EList<Transition> _outgoingTransitions = _currentState.getOutgoingTransitions();
    for (final Transition t : _outgoingTransitions) {
      if (((!executed) && GuardAspect.holds(t.getGuard()))) {
        TransitionAspect.execute(t);
        executed = true;
        State _target = t.getTarget();
        StateMachineAspect.currentState(_self, _target);
      }
    }
  }
  
  protected static void _privk3_assignInitialValues(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    EList<Variable> _variables = _self.getVariables();
    for (final Variable v : _variables) {
      if ((v instanceof BooleanVariable)) {
        final BooleanVariable ref = ((BooleanVariable) v);
        boolean _isInitialValue = ref.isInitialValue();
        BooleanVariableAspect.value(ref, Boolean.valueOf(_isInitialValue));
      } else {
        if ((v instanceof NumberVariable)) {
          final NumberVariable ref_1 = ((NumberVariable) v);
          long _initialValue = ref_1.getInitialValue();
          NumberVariableAspect.value(ref_1, Long.valueOf(_initialValue));
        } else {
          if ((v instanceof StringVariable)) {
            final StringVariable ref_2 = ((StringVariable) v);
            String _initialValue_1 = ref_2.getInitialValue();
            StringVariableAspect.value(ref_2, _initialValue_1);
          } else {
            throw new Error("Found unsupported variable subtype");
          }
        }
      }
    }
  }
  
  protected static State _privk3_currentState(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentState") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.State) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentState;
  }
  
  protected static void _privk3_currentState(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final State currentState) {
    _self_.currentState = currentState; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrentState")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, currentState);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
