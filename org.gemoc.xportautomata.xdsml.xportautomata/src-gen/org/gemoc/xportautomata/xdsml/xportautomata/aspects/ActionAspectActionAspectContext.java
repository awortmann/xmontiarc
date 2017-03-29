package org.gemoc.xportautomata.xdsml.xportautomata.aspects;

import java.util.Map;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.Action;
import org.gemoc.xportautomata.xdsml.xportautomata.aspects.ActionAspectActionAspectProperties;

@SuppressWarnings("all")
public class ActionAspectActionAspectContext {
  public final static ActionAspectActionAspectContext INSTANCE = new ActionAspectActionAspectContext();
  
  public static ActionAspectActionAspectProperties getSelf(final Action _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.xportautomata.xdsml.xportautomata.aspects.ActionAspectActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Action, ActionAspectActionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.xportautomata.xdsml.xportautomata.fsm.Action, org.gemoc.xportautomata.xdsml.xportautomata.aspects.ActionAspectActionAspectProperties>();
  
  public Map<Action, ActionAspectActionAspectProperties> getMap() {
    return map;
  }
}
