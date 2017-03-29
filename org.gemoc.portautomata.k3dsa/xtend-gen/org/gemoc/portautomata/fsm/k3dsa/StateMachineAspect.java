package org.gemoc.portautomata.fsm.k3dsa;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.gemoc.portautomata.fsm.BooleanVariable;
import org.gemoc.portautomata.fsm.NumberVariable;
import org.gemoc.portautomata.fsm.State;
import org.gemoc.portautomata.fsm.StateMachine;
import org.gemoc.portautomata.fsm.StringVariable;
import org.gemoc.portautomata.fsm.Transition;
import org.gemoc.portautomata.fsm.Variable;
import org.gemoc.portautomata.fsm.k3dsa.BooleanVariableAspect;
import org.gemoc.portautomata.fsm.k3dsa.GuardAspect;
import org.gemoc.portautomata.fsm.k3dsa.NumberVariableAspect;
import org.gemoc.portautomata.fsm.k3dsa.StateMachineAspectStateMachineAspectProperties;
import org.gemoc.portautomata.fsm.k3dsa.StringVariableAspect;
import org.gemoc.portautomata.fsm.k3dsa.TransitionAspect;

@Aspect(className = StateMachine.class)
@SuppressWarnings("all")
public class StateMachineAspect {
  @Main
  public static void main(final StateMachine _self) {
    final org.gemoc.portautomata.fsm.k3dsa.StateMachineAspectStateMachineAspectProperties _self_ = org.gemoc.portautomata.fsm.k3dsa.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    _privk3_main(_self_, _self);;
  }
  
  @Step
  public static Map<String, Object> process(final StateMachine _self, final Map<String, Object> inputValues) {
    final org.gemoc.portautomata.fsm.k3dsa.StateMachineAspectStateMachineAspectProperties _self_ = org.gemoc.portautomata.fsm.k3dsa.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    Object result = null;
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		addToResult(_privk3_process(_self_, _self,inputValues));
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"StateMachine","process");
    } else {
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry.getInstance().findEventManager(_self);
    	if (eventManager != null) {
    		eventManager.manageEvents();
    	}
    	command.execute();
    }
    result = command.getResult();
    ;;
    return (java.util.Map<java.lang.String, java.lang.Object>)result;
  }
  
  public static Map<String, Object> mapVariablesToOutputs(final StateMachine _self) {
    final org.gemoc.portautomata.fsm.k3dsa.StateMachineAspectStateMachineAspectProperties _self_ = org.gemoc.portautomata.fsm.k3dsa.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_mapVariablesToOutputs(_self_, _self);;
    return (java.util.Map<java.lang.String, java.lang.Object>)result;
  }
  
  public static void mapInputsToVariables(final StateMachine _self, final Map<String, Object> inputValues) {
    final org.gemoc.portautomata.fsm.k3dsa.StateMachineAspectStateMachineAspectProperties _self_ = org.gemoc.portautomata.fsm.k3dsa.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    _privk3_mapInputsToVariables(_self_, _self,inputValues);;
  }
  
  @Step
  public static void process(final StateMachine _self) {
    final org.gemoc.portautomata.fsm.k3dsa.StateMachineAspectStateMachineAspectProperties _self_ = org.gemoc.portautomata.fsm.k3dsa.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_process(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"StateMachine","process");
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
  @InitializeModel
  public static void assignInitialValues(final StateMachine _self) {
    final org.gemoc.portautomata.fsm.k3dsa.StateMachineAspectStateMachineAspectProperties _self_ = org.gemoc.portautomata.fsm.k3dsa.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_assignInitialValues(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"StateMachine","assignInitialValues");
    } else {
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry.getInstance().findEventManager(_self);
    	if (eventManager != null) {
    		eventManager.manageEvents();
    	}
    	command.execute();
    }
    ;;
  }
  
  public static State currentState(final StateMachine _self) {
    final org.gemoc.portautomata.fsm.k3dsa.StateMachineAspectStateMachineAspectProperties _self_ = org.gemoc.portautomata.fsm.k3dsa.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_currentState(_self_, _self);;
    return (org.gemoc.portautomata.fsm.State)result;
  }
  
  public static void currentState(final StateMachine _self, final State currentState) {
    final org.gemoc.portautomata.fsm.k3dsa.StateMachineAspectStateMachineAspectProperties _self_ = org.gemoc.portautomata.fsm.k3dsa.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    _privk3_currentState(_self_, _self,currentState);;
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
  
  protected static Map<String, Object> _privk3_process(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final Map<String, Object> inputValues) {
    StateMachineAspect.mapInputsToVariables(_self, inputValues);
    StateMachineAspect.process(_self);
    return StateMachineAspect.mapVariablesToOutputs(_self);
  }
  
  protected static Map<String, Object> _privk3_mapVariablesToOutputs(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    Map<String, Object> result = new HashMap<String, Object>();
    EList<Variable> _variables = _self.getVariables();
    for (final Variable v : _variables) {
      if ((v instanceof StringVariable)) {
        StringVariable sv = ((StringVariable) v);
        String _name = ((StringVariable)v).getName();
        String _value = StringVariableAspect.value(sv);
        result.put(_name, _value);
      } else {
        if ((v instanceof BooleanVariable)) {
          BooleanVariable bv = ((BooleanVariable) v);
          String _name_1 = ((BooleanVariable)v).getName();
          Boolean _value_1 = BooleanVariableAspect.value(bv);
          result.put(_name_1, _value_1);
        } else {
          if ((v instanceof NumberVariable)) {
            NumberVariable nv = ((NumberVariable) v);
            String _name_2 = ((NumberVariable)v).getName();
            Long _value_2 = NumberVariableAspect.value(nv);
            result.put(_name_2, _value_2);
          }
        }
      }
    }
    return result;
  }
  
  protected static void _privk3_mapInputsToVariables(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final Map<String, Object> inputValues) {
    Set<Map.Entry<String, Object>> _entrySet = inputValues.entrySet();
    for (final Map.Entry<String, Object> entry : _entrySet) {
      EList<Variable> _variables = _self.getVariables();
      for (final Variable v : _variables) {
        String _name = v.getName();
        String _key = entry.getKey();
        boolean _equals = Objects.equal(_name, _key);
        if (_equals) {
          if ((v instanceof StringVariable)) {
            StringVariable sv = ((StringVariable) v);
            Object _value = entry.getValue();
            StringVariableAspect.value(sv, ((String) _value));
          } else {
            if ((v instanceof BooleanVariable)) {
              BooleanVariable bv = ((BooleanVariable) v);
              Object _value_1 = entry.getValue();
              BooleanVariableAspect.value(bv, ((Boolean) _value_1));
            } else {
              if ((v instanceof NumberVariable)) {
                NumberVariable nv = ((NumberVariable) v);
                Object _value_2 = entry.getValue();
                NumberVariableAspect.value(nv, ((Long) _value_2));
              }
            }
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
    					return (org.gemoc.portautomata.fsm.State) ret;
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
