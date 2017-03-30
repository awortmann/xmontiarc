package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects;

import java.util.Map;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.StateMachine;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.StateMachineAspectStateMachineAspectProperties;

@SuppressWarnings("all")
public class StateMachineAspectStateMachineAspectContext {
  public final static StateMachineAspectStateMachineAspectContext INSTANCE = new StateMachineAspectStateMachineAspectContext();
  
  public static StateMachineAspectStateMachineAspectProperties getSelf(final StateMachine _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.StateMachineAspectStateMachineAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StateMachine, StateMachineAspectStateMachineAspectProperties> map = new java.util.WeakHashMap<org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.StateMachine, org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.StateMachineAspectStateMachineAspectProperties>();
  
  public Map<StateMachine, StateMachineAspectStateMachineAspectProperties> getMap() {
    return map;
  }
}
