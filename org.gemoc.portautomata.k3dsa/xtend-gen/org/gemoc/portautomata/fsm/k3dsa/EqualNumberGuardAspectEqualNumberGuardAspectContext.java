package org.gemoc.portautomata.fsm.k3dsa;

import java.util.Map;
import org.gemoc.portautomata.fsm.EqualNumberGuard;
import org.gemoc.portautomata.fsm.k3dsa.EqualNumberGuardAspectEqualNumberGuardAspectProperties;

@SuppressWarnings("all")
public class EqualNumberGuardAspectEqualNumberGuardAspectContext {
  public final static EqualNumberGuardAspectEqualNumberGuardAspectContext INSTANCE = new EqualNumberGuardAspectEqualNumberGuardAspectContext();
  
  public static EqualNumberGuardAspectEqualNumberGuardAspectProperties getSelf(final EqualNumberGuard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.portautomata.fsm.k3dsa.EqualNumberGuardAspectEqualNumberGuardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<EqualNumberGuard, EqualNumberGuardAspectEqualNumberGuardAspectProperties> map = new java.util.WeakHashMap<org.gemoc.portautomata.fsm.EqualNumberGuard, org.gemoc.portautomata.fsm.k3dsa.EqualNumberGuardAspectEqualNumberGuardAspectProperties>();
  
  public Map<EqualNumberGuard, EqualNumberGuardAspectEqualNumberGuardAspectProperties> getMap() {
    return map;
  }
}
