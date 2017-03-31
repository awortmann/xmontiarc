package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Containment;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.AutomatonComponentBehaviorAspect;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.PortAspect;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.AutomatonComponentBehavior;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.ComponentType;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.DataType;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.IncomingPort;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.Subcomponent;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.AutomatonComponentBehaviorGlueAspectAutomatonComponentBehaviorAspectProperties;
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
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.StateMachineAspect;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.StringVariableAspect;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.TransitionAspect;

@Aspect(className = AutomatonComponentBehavior.class)
@SuppressWarnings("all")
public class AutomatonComponentBehaviorGlueAspect extends AutomatonComponentBehaviorAspect {
  public static void wrapPortValuesToAutomaton(final AutomatonComponentBehavior _self) {
	final org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.AutomatonComponentBehaviorGlueAspectAutomatonComponentBehaviorAspectProperties _self_ = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.AutomatonComponentBehaviorGlueAspectAutomatonComponentBehaviorAspectContext
			.getSelf(_self);
	_privk3_wrapPortValuesToAutomaton(_self_, _self);
	;
}
  
  public static void process(final AutomatonComponentBehavior _self) {
	final org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.AutomatonComponentBehaviorGlueAspectAutomatonComponentBehaviorAspectProperties _self_ = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.AutomatonComponentBehaviorGlueAspectAutomatonComponentBehaviorAspectContext
			.getSelf(_self);
	_privk3_process(_self_, _self);
	;
}
  
  public static void unwrapPortValuesFromAutomaton(final AutomatonComponentBehavior _self) {
	final org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.AutomatonComponentBehaviorGlueAspectAutomatonComponentBehaviorAspectProperties _self_ = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.AutomatonComponentBehaviorGlueAspectAutomatonComponentBehaviorAspectContext
			.getSelf(_self);
	_privk3_unwrapPortValuesFromAutomaton(_self_, _self);
	;
}
  
  @Containment
  public static StateMachine delegateFSM(final AutomatonComponentBehavior _self) {
	final org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.AutomatonComponentBehaviorGlueAspectAutomatonComponentBehaviorAspectProperties _self_ = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.AutomatonComponentBehaviorGlueAspectAutomatonComponentBehaviorAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_delegateFSM(_self_, _self);
	;
	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.StateMachine) result;
}
  
  @Containment
  public static void delegateFSM(final AutomatonComponentBehavior _self, final StateMachine delegateFSM) {
	final org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.AutomatonComponentBehaviorGlueAspectAutomatonComponentBehaviorAspectProperties _self_ = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.AutomatonComponentBehaviorGlueAspectAutomatonComponentBehaviorAspectContext
			.getSelf(_self);
	_privk3_delegateFSM(_self_, _self, delegateFSM);
	;
}
  
  protected static void _privk3_wrapPortValuesToAutomaton(final AutomatonComponentBehaviorGlueAspectAutomatonComponentBehaviorAspectProperties _self_, final AutomatonComponentBehavior _self) {
    final EObject c = _self.eContainer();
    EList<IncomingPort> ports = null;
    if ((c instanceof ComponentType)) {
      EList<IncomingPort> _incomingPorts = ((ComponentType)c).getIncomingPorts();
      ports = _incomingPorts;
    } else {
      if ((c instanceof Subcomponent)) {
        EList<IncomingPort> _incomingPorts_1 = ((Subcomponent)c).getIncomingPorts();
        ports = _incomingPorts_1;
      }
    }
    for (final IncomingPort p : ports) {
      {
        StateMachine _delegateFSM = AutomatonComponentBehaviorGlueAspect.delegateFSM(_self);
        EList<Variable> _variables = _delegateFSM.getVariables();
        final Function1<Variable, Boolean> _function = (Variable v) -> {
          String _name = p.getName();
          String _name_1 = v.getName();
          return Boolean.valueOf(Objects.equal(_name, _name_1));
        };
        final Variable v = IterableExtensions.<Variable>findFirst(_variables, _function);
        boolean _matched = false;
        if (v instanceof StringVariable) {
          DataType _type = p.getType();
          boolean _equals = Objects.equal(_type, "String");
          if (_equals) {
            _matched=true;
            EDataType _value = PortAspect.value(p);
            String _string = _value.toString();
            StringVariableAspect.value(((StringVariable)v), _string);
          }
        }
        if (!_matched) {
          if (v instanceof NumberVariable) {
            DataType _type = p.getType();
            boolean _equals = Objects.equal(_type, "Number");
            if (_equals) {
              _matched=true;
              EDataType _value = PortAspect.value(p);
              String _name = _value.getName();
              long _parseLong = Long.parseLong(_name);
              NumberVariableAspect.value(((NumberVariable)v), Long.valueOf(_parseLong));
            }
          }
        }
        if (!_matched) {
          if (v instanceof BooleanVariable) {
            DataType _type = p.getType();
            boolean _equals = Objects.equal(_type, "Boolean");
            if (_equals) {
              _matched=true;
              EDataType _value = PortAspect.value(p);
              String _name = _value.getName();
              boolean _equals_1 = Objects.equal(_name, "true");
              BooleanVariableAspect.value(((BooleanVariable)v), Boolean.valueOf(_equals_1));
            }
          }
        }
        if (!_matched) {
        }
      }
    }
  }
  
  protected static void _privk3_process(final AutomatonComponentBehaviorGlueAspectAutomatonComponentBehaviorAspectProperties _self_, final AutomatonComponentBehavior _self) {
    boolean executed = false;
    StateMachine _delegateFSM = AutomatonComponentBehaviorGlueAspect.delegateFSM(_self);
    State _currentState = StateMachineAspect.currentState(_delegateFSM);
    EList<Transition> _outgoingTransitions = _currentState.getOutgoingTransitions();
    for (final Transition t : _outgoingTransitions) {
      if (((!executed) && GuardAspect.holds(t.getGuard()))) {
        TransitionAspect.execute(t);
        executed = true;
      }
    }
  }
  
  protected static void _privk3_unwrapPortValuesFromAutomaton(final AutomatonComponentBehaviorGlueAspectAutomatonComponentBehaviorAspectProperties _self_, final AutomatonComponentBehavior _self) {
    final EObject c = _self.eContainer();
    EList<IncomingPort> ports = null;
    if ((c instanceof ComponentType)) {
      EList<IncomingPort> _incomingPorts = ((ComponentType)c).getIncomingPorts();
      ports = _incomingPorts;
    } else {
      if ((c instanceof Subcomponent)) {
        EList<IncomingPort> _incomingPorts_1 = ((Subcomponent)c).getIncomingPorts();
        ports = _incomingPorts_1;
      }
    }
    for (final IncomingPort p : ports) {
      {
        StateMachine _delegateFSM = AutomatonComponentBehaviorGlueAspect.delegateFSM(_self);
        EList<Variable> _variables = _delegateFSM.getVariables();
        final Function1<Variable, Boolean> _function = (Variable v) -> {
          String _name = p.getName();
          String _name_1 = v.getName();
          return Boolean.valueOf(Objects.equal(_name, _name_1));
        };
        final Variable v = IterableExtensions.<Variable>findFirst(_variables, _function);
        boolean _matched = false;
        if (v instanceof StringVariable) {
          DataType _type = p.getType();
          boolean _equals = Objects.equal(_type, "String");
          if (_equals) {
            _matched=true;
            EDataType _value = PortAspect.value(p);
            String _value_1 = StringVariableAspect.value(((StringVariable)v));
            _value.setName(_value_1);
          }
        }
        if (!_matched) {
          if (v instanceof NumberVariable) {
            DataType _type = p.getType();
            boolean _equals = Objects.equal(_type, "Number");
            if (_equals) {
              _matched=true;
              EDataType _value = PortAspect.value(p);
              Long _value_1 = NumberVariableAspect.value(((NumberVariable)v));
              String _plus = ("" + _value_1);
              _value.setName(_plus);
            }
          }
        }
        if (!_matched) {
          if (v instanceof BooleanVariable) {
            DataType _type = p.getType();
            boolean _equals = Objects.equal(_type, "Boolean");
            if (_equals) {
              _matched=true;
              Boolean _value = BooleanVariableAspect.value(((BooleanVariable)v));
              if ((_value).booleanValue()) {
                EDataType _value_1 = PortAspect.value(p);
                _value_1.setName("true");
              } else {
                EDataType _value_2 = PortAspect.value(p);
                _value_2.setName("false");
              }
            }
          }
        }
        if (!_matched) {
        }
      }
    }
  }
  
  protected static StateMachine _privk3_delegateFSM(final AutomatonComponentBehaviorGlueAspectAutomatonComponentBehaviorAspectProperties _self_, final AutomatonComponentBehavior _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getDelegateFSM") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.StateMachine) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.delegateFSM;
  }
  
  protected static void _privk3_delegateFSM(final AutomatonComponentBehaviorGlueAspectAutomatonComponentBehaviorAspectProperties _self_, final AutomatonComponentBehavior _self, final StateMachine delegateFSM) {
    _self_.delegateFSM = delegateFSM; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setDelegateFSM")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, delegateFSM);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
