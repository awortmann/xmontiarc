package org.gemoc.portautomata.fsm.k3dsa;

import java.util.Map;
import org.gemoc.portautomata.fsm.LessThanNumberGuard;
import org.gemoc.portautomata.fsm.k3dsa.LessThanNumberGuardAspectLessThanNumberGuardAspectProperties;

@SuppressWarnings("all")
public class LessThanNumberGuardAspectLessThanNumberGuardAspectContext {
  public final static LessThanNumberGuardAspectLessThanNumberGuardAspectContext INSTANCE = new LessThanNumberGuardAspectLessThanNumberGuardAspectContext();
  
  public static LessThanNumberGuardAspectLessThanNumberGuardAspectProperties getSelf(final LessThanNumberGuard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.portautomata.fsm.k3dsa.LessThanNumberGuardAspectLessThanNumberGuardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<LessThanNumberGuard, LessThanNumberGuardAspectLessThanNumberGuardAspectProperties> map = new java.util.WeakHashMap<org.gemoc.portautomata.fsm.LessThanNumberGuard, org.gemoc.portautomata.fsm.k3dsa.LessThanNumberGuardAspectLessThanNumberGuardAspectProperties>();
  
  public Map<LessThanNumberGuard, LessThanNumberGuardAspectLessThanNumberGuardAspectProperties> getMap() {
    return map;
  }
}
