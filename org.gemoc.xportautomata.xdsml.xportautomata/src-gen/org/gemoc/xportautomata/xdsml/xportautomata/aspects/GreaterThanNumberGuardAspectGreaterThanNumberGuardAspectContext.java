package org.gemoc.xportautomata.xdsml.xportautomata.aspects;

import java.util.Map;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.GreaterThanNumberGuard;
import org.gemoc.xportautomata.xdsml.xportautomata.aspects.GreaterThanNumberGuardAspectGreaterThanNumberGuardAspectProperties;

@SuppressWarnings("all")
public class GreaterThanNumberGuardAspectGreaterThanNumberGuardAspectContext {
  public final static GreaterThanNumberGuardAspectGreaterThanNumberGuardAspectContext INSTANCE = new GreaterThanNumberGuardAspectGreaterThanNumberGuardAspectContext();
  
  public static GreaterThanNumberGuardAspectGreaterThanNumberGuardAspectProperties getSelf(final GreaterThanNumberGuard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.xportautomata.xdsml.xportautomata.aspects.GreaterThanNumberGuardAspectGreaterThanNumberGuardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<GreaterThanNumberGuard, GreaterThanNumberGuardAspectGreaterThanNumberGuardAspectProperties> map = new java.util.WeakHashMap<org.gemoc.xportautomata.xdsml.xportautomata.fsm.GreaterThanNumberGuard, org.gemoc.xportautomata.xdsml.xportautomata.aspects.GreaterThanNumberGuardAspectGreaterThanNumberGuardAspectProperties>();
  
  public Map<GreaterThanNumberGuard, GreaterThanNumberGuardAspectGreaterThanNumberGuardAspectProperties> getMap() {
    return map;
  }
}
