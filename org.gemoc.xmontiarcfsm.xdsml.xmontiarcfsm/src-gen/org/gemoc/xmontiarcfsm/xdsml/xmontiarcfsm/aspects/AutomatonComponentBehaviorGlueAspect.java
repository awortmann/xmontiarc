package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Containment;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.AutomatonComponentBehaviorAspect;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.AutomatonComponentBehavior;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.AutomatonComponentBehaviorGlueAspectAutomatonComponentBehaviorAspectProperties;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.StateMachine;

@Aspect(className = AutomatonComponentBehavior.class)
@SuppressWarnings("all")
public class AutomatonComponentBehaviorGlueAspect extends AutomatonComponentBehaviorAspect {
  public static void sendPortValuesToAutomaton(final AutomatonComponentBehavior _self) {
	final org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.AutomatonComponentBehaviorGlueAspectAutomatonComponentBehaviorAspectProperties _self_ = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.AutomatonComponentBehaviorGlueAspectAutomatonComponentBehaviorAspectContext
			.getSelf(_self);
	_privk3_sendPortValuesToAutomaton(_self_, _self);
	;
}
  
  public static void process(final AutomatonComponentBehavior _self) {
	final org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.AutomatonComponentBehaviorGlueAspectAutomatonComponentBehaviorAspectProperties _self_ = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.AutomatonComponentBehaviorGlueAspectAutomatonComponentBehaviorAspectContext
			.getSelf(_self);
	_privk3_process(_self_, _self);
	;
}
  
  public static void setPortValuesFromAutomaton(final AutomatonComponentBehavior _self) {
	final org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.AutomatonComponentBehaviorGlueAspectAutomatonComponentBehaviorAspectProperties _self_ = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.AutomatonComponentBehaviorGlueAspectAutomatonComponentBehaviorAspectContext
			.getSelf(_self);
	_privk3_setPortValuesFromAutomaton(_self_, _self);
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
  
  protected static void _privk3_sendPortValuesToAutomaton(final AutomatonComponentBehaviorGlueAspectAutomatonComponentBehaviorAspectProperties _self_, final AutomatonComponentBehavior _self) {
  }
  
  protected static void _privk3_process(final AutomatonComponentBehaviorGlueAspectAutomatonComponentBehaviorAspectProperties _self_, final AutomatonComponentBehavior _self) {
  }
  
  protected static void _privk3_setPortValuesFromAutomaton(final AutomatonComponentBehaviorGlueAspectAutomatonComponentBehaviorAspectProperties _self_, final AutomatonComponentBehavior _self) {
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
