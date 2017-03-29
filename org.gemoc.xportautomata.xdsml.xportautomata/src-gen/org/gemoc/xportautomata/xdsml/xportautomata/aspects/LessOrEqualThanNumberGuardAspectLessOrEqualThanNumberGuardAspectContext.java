package org.gemoc.xportautomata.xdsml.xportautomata.aspects;

import java.util.Map;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.LessOrEqualThanNumberGuard;
import org.gemoc.xportautomata.xdsml.xportautomata.aspects.LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectProperties;

@SuppressWarnings("all")
public class LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectContext {
  public final static LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectContext INSTANCE = new LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectContext();
  
  public static LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectProperties getSelf(final LessOrEqualThanNumberGuard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.xportautomata.xdsml.xportautomata.aspects.LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<LessOrEqualThanNumberGuard, LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectProperties> map = new java.util.WeakHashMap<org.gemoc.xportautomata.xdsml.xportautomata.fsm.LessOrEqualThanNumberGuard, org.gemoc.xportautomata.xdsml.xportautomata.aspects.LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectProperties>();
  
  public Map<LessOrEqualThanNumberGuard, LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectProperties> getMap() {
    return map;
  }
}
