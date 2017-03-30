package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects;

import java.util.Map;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.Action;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.ActionAspectActionAspectProperties;

@SuppressWarnings("all")
public class ActionAspectActionAspectContext {
  public final static ActionAspectActionAspectContext INSTANCE = new ActionAspectActionAspectContext();
  
  public static ActionAspectActionAspectProperties getSelf(final Action _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.ActionAspectActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Action, ActionAspectActionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.Action, org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.ActionAspectActionAspectProperties>();
  
  public Map<Action, ActionAspectActionAspectProperties> getMap() {
    return map;
  }
}
