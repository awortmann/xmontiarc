package org.gemoc.portautomata.fsm.k3dsa;

import java.util.Map;
import org.gemoc.portautomata.fsm.BooleanGuard;
import org.gemoc.portautomata.fsm.k3dsa.BooleanGuardAspectBooleanGuardAspectProperties;

@SuppressWarnings("all")
public class BooleanGuardAspectBooleanGuardAspectContext {
  public final static BooleanGuardAspectBooleanGuardAspectContext INSTANCE = new BooleanGuardAspectBooleanGuardAspectContext();
  
  public static BooleanGuardAspectBooleanGuardAspectProperties getSelf(final BooleanGuard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.portautomata.fsm.k3dsa.BooleanGuardAspectBooleanGuardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanGuard, BooleanGuardAspectBooleanGuardAspectProperties> map = new java.util.WeakHashMap<org.gemoc.portautomata.fsm.BooleanGuard, org.gemoc.portautomata.fsm.k3dsa.BooleanGuardAspectBooleanGuardAspectProperties>();
  
  public Map<BooleanGuard, BooleanGuardAspectBooleanGuardAspectProperties> getMap() {
    return map;
  }
}
