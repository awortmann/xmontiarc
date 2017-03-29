package org.gemoc.portautomata.fsm.k3dsa;

import java.util.Map;
import org.gemoc.portautomata.fsm.LessOrEqualThanNumberGuard;
import org.gemoc.portautomata.fsm.k3dsa.LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectProperties;

@SuppressWarnings("all")
public class LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectContext {
  public final static LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectContext INSTANCE = new LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectContext();
  
  public static LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectProperties getSelf(final LessOrEqualThanNumberGuard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.portautomata.fsm.k3dsa.LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<LessOrEqualThanNumberGuard, LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectProperties> map = new java.util.WeakHashMap<org.gemoc.portautomata.fsm.LessOrEqualThanNumberGuard, org.gemoc.portautomata.fsm.k3dsa.LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectProperties>();
  
  public Map<LessOrEqualThanNumberGuard, LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectProperties> getMap() {
    return map;
  }
}
