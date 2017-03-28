package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.BooleanVariable;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.NumberVariable;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.State;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StringVariable;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Variable;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.BooleanVariableAspect;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.NumberVariableAspect;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateAspect;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspectStateMachineAspectProperties;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StringVariableAspect;

@Aspect(className = StateMachine.class)
@SuppressWarnings("all")
public class StateMachineAspect {
  @Main
  public static void main(final StateMachine _self) {
	final org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspectStateMachineAspectContext
			.getSelf(_self);
	_privk3_main(_self_, _self);
	;
}
  
  @Step
  @InitializeModel
  public static void initializeModel(final StateMachine _self, final EList<String> args) {
    final org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_initializeModel(_self_, _self,args);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"StateMachine","initializeModel");
    } else {
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry.getInstance().findEventManager(_self);
    	if (eventManager != null) {
    		eventManager.manageEvents();
    	}
    	command.execute();
    }
    ;;
  }
  
  @Step
  public static void assignInitialValues(final StateMachine _self) {
	final org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspectStateMachineAspectContext
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
	final org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspectStateMachineAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_currentState(_self_, _self);
	;
	return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.State) result;
}
  
  public static void currentState(final StateMachine _self, final State currentState) {
	final org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspectStateMachineAspectContext
			.getSelf(_self);
	_privk3_currentState(_self_, _self, currentState);
	;
}
  
  public static String unprocessedString(final StateMachine _self) {
	final org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspectStateMachineAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_unprocessedString(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  public static void unprocessedString(final StateMachine _self, final String unprocessedString) {
	final org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspectStateMachineAspectContext
			.getSelf(_self);
	_privk3_unprocessedString(_self_, _self, unprocessedString);
	;
}
  
  public static String consummedString(final StateMachine _self) {
	final org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspectStateMachineAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_consummedString(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  public static void consummedString(final StateMachine _self, final String consummedString) {
	final org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspectStateMachineAspectContext
			.getSelf(_self);
	_privk3_consummedString(_self_, _self, consummedString);
	;
}
  
  public static String producedString(final StateMachine _self) {
	final org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspectStateMachineAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_producedString(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  public static void producedString(final StateMachine _self, final String producedString) {
	final org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspectStateMachineAspectContext
			.getSelf(_self);
	_privk3_producedString(_self_, _self, producedString);
	;
}
  
  protected static void _privk3_main(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    InputOutput.<String>println("Start the main");
    try {
      while ((!StateMachineAspect.currentState(_self).getOutgoingTransitions().isEmpty())) {
        State _currentState = StateMachineAspect.currentState(_self);
        String _unprocessedString = StateMachineAspect.unprocessedString(_self);
        StateAspect.step(_currentState, _unprocessedString);
      }
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception nt = (Exception)_t;
        String _message = nt.getMessage();
        String _plus = ("Stopped due to " + _message);
        InputOutput.<String>println(_plus);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  protected static void _privk3_initializeModel(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final EList<String> args) {
    InputOutput.<String>println("Start the init");
    State _initialState = _self.getInitialState();
    StateMachineAspect.currentState(_self, _initialState);
    String _get = args.get(0);
    StateMachineAspect.unprocessedString(_self, _get);
    StateMachineAspect.consummedString(_self, "");
    StateMachineAspect.producedString(_self, "");
    StateMachineAspect.assignInitialValues(_self);
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
    					return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.State) ret;
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
  
  protected static String _privk3_unprocessedString(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getUnprocessedString") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.String) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.unprocessedString;
  }
  
  protected static void _privk3_unprocessedString(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final String unprocessedString) {
    _self_.unprocessedString = unprocessedString; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setUnprocessedString")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, unprocessedString);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static String _privk3_consummedString(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getConsummedString") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.String) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.consummedString;
  }
  
  protected static void _privk3_consummedString(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final String consummedString) {
    _self_.consummedString = consummedString; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setConsummedString")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, consummedString);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static String _privk3_producedString(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getProducedString") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.String) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.producedString;
  }
  
  protected static void _privk3_producedString(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final String producedString) {
    _self_.producedString = producedString; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setProducedString")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, producedString);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
