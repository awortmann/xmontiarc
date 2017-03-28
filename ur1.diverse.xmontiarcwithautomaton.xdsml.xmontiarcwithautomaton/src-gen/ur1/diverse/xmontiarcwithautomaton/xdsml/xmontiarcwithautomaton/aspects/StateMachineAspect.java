package ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.BooleanVariable;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.NumberVariable;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.State;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.AutomatonComponentBehavior;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.StringVariable;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.Variable;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.BooleanVariableAspect;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.NumberVariableAspect;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StateAspect;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StateMachineAspectAutomatonComponentBehaviorAspectProperties;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StringVariableAspect;

@Aspect(className = AutomatonComponentBehavior.class)
@SuppressWarnings("all")
public class StateMachineAspect {
  @Main
  public static void main(final AutomatonComponentBehavior _self) {
	final ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StateMachineAspectAutomatonComponentBehaviorAspectProperties _self_ = ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StateMachineAspectAutomatonComponentBehaviorAspectContext
			.getSelf(_self);
	_privk3_main(_self_, _self);
	;
}
  
  @Step
  @InitializeModel
  public static void initializeModel(final AutomatonComponentBehavior _self, final EList<String> args) {
    final ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StateMachineAspectAutomatonComponentBehaviorAspectProperties _self_ = ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StateMachineAspectAutomatonComponentBehaviorAspectContext.getSelf(_self);
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
  public static void assignInitialValues(final AutomatonComponentBehavior _self) {
	final ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StateMachineAspectAutomatonComponentBehaviorAspectProperties _self_ = ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StateMachineAspectAutomatonComponentBehaviorAspectContext
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
		manager.executeStep(_self, command, "AutomatonComponentBehavior", "assignInitialValues");
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
  
  public static State currentState(final AutomatonComponentBehavior _self) {
	final ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StateMachineAspectAutomatonComponentBehaviorAspectProperties _self_ = ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StateMachineAspectAutomatonComponentBehaviorAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_currentState(_self_, _self);
	;
	return (ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.State) result;
}
  
  public static void currentState(final AutomatonComponentBehavior _self, final State currentState) {
	final ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StateMachineAspectAutomatonComponentBehaviorAspectProperties _self_ = ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StateMachineAspectAutomatonComponentBehaviorAspectContext
			.getSelf(_self);
	_privk3_currentState(_self_, _self, currentState);
	;
}
  
  public static String unprocessedString(final AutomatonComponentBehavior _self) {
	final ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StateMachineAspectAutomatonComponentBehaviorAspectProperties _self_ = ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StateMachineAspectAutomatonComponentBehaviorAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_unprocessedString(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  public static void unprocessedString(final AutomatonComponentBehavior _self, final String unprocessedString) {
	final ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StateMachineAspectAutomatonComponentBehaviorAspectProperties _self_ = ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StateMachineAspectAutomatonComponentBehaviorAspectContext
			.getSelf(_self);
	_privk3_unprocessedString(_self_, _self, unprocessedString);
	;
}
  
  public static String consummedString(final AutomatonComponentBehavior _self) {
	final ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StateMachineAspectAutomatonComponentBehaviorAspectProperties _self_ = ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StateMachineAspectAutomatonComponentBehaviorAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_consummedString(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  public static void consummedString(final AutomatonComponentBehavior _self, final String consummedString) {
	final ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StateMachineAspectAutomatonComponentBehaviorAspectProperties _self_ = ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StateMachineAspectAutomatonComponentBehaviorAspectContext
			.getSelf(_self);
	_privk3_consummedString(_self_, _self, consummedString);
	;
}
  
  public static String producedString(final AutomatonComponentBehavior _self) {
	final ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StateMachineAspectAutomatonComponentBehaviorAspectProperties _self_ = ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StateMachineAspectAutomatonComponentBehaviorAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_producedString(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  public static void producedString(final AutomatonComponentBehavior _self, final String producedString) {
	final ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StateMachineAspectAutomatonComponentBehaviorAspectProperties _self_ = ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StateMachineAspectAutomatonComponentBehaviorAspectContext
			.getSelf(_self);
	_privk3_producedString(_self_, _self, producedString);
	;
}
  
  protected static void _privk3_main(final StateMachineAspectAutomatonComponentBehaviorAspectProperties _self_, final AutomatonComponentBehavior _self) {
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
  
  protected static void _privk3_initializeModel(final StateMachineAspectAutomatonComponentBehaviorAspectProperties _self_, final AutomatonComponentBehavior _self, final EList<String> args) {
    InputOutput.<String>println("Start the init");
    State _initialState = _self.getInitialState();
    StateMachineAspect.currentState(_self, _initialState);
    String _get = args.get(0);
    StateMachineAspect.unprocessedString(_self, _get);
    StateMachineAspect.consummedString(_self, "");
    StateMachineAspect.producedString(_self, "");
    StateMachineAspect.assignInitialValues(_self);
  }
  
  protected static void _privk3_assignInitialValues(final StateMachineAspectAutomatonComponentBehaviorAspectProperties _self_, final AutomatonComponentBehavior _self) {
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
  
  protected static State _privk3_currentState(final StateMachineAspectAutomatonComponentBehaviorAspectProperties _self_, final AutomatonComponentBehavior _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentState") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.State) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentState;
  }
  
  protected static void _privk3_currentState(final StateMachineAspectAutomatonComponentBehaviorAspectProperties _self_, final AutomatonComponentBehavior _self, final State currentState) {
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
  
  protected static String _privk3_unprocessedString(final StateMachineAspectAutomatonComponentBehaviorAspectProperties _self_, final AutomatonComponentBehavior _self) {
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
  
  protected static void _privk3_unprocessedString(final StateMachineAspectAutomatonComponentBehaviorAspectProperties _self_, final AutomatonComponentBehavior _self, final String unprocessedString) {
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
  
  protected static String _privk3_consummedString(final StateMachineAspectAutomatonComponentBehaviorAspectProperties _self_, final AutomatonComponentBehavior _self) {
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
  
  protected static void _privk3_consummedString(final StateMachineAspectAutomatonComponentBehaviorAspectProperties _self_, final AutomatonComponentBehavior _self, final String consummedString) {
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
  
  protected static String _privk3_producedString(final StateMachineAspectAutomatonComponentBehaviorAspectProperties _self_, final AutomatonComponentBehavior _self) {
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
  
  protected static void _privk3_producedString(final StateMachineAspectAutomatonComponentBehaviorAspectProperties _self_, final AutomatonComponentBehavior _self, final String producedString) {
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
