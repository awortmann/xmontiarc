package org.gemoc.xportautomata.xdsml.xportautomata.aspects;

import java.util.Map;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.GreaterOrEqualThanNumberGuard;
import org.gemoc.xportautomata.xdsml.xportautomata.aspects.GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectProperties;

@SuppressWarnings("all")
public class GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectContext {
  public final static GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectContext INSTANCE = new GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectContext();
  
  public static GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectProperties getSelf(final GreaterOrEqualThanNumberGuard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.xportautomata.xdsml.xportautomata.aspects.GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<GreaterOrEqualThanNumberGuard, GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectProperties> map = new java.util.WeakHashMap<org.gemoc.xportautomata.xdsml.xportautomata.fsm.GreaterOrEqualThanNumberGuard, org.gemoc.xportautomata.xdsml.xportautomata.aspects.GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectProperties>();
  
  public Map<GreaterOrEqualThanNumberGuard, GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectProperties> getMap() {
    return map;
  }
}
