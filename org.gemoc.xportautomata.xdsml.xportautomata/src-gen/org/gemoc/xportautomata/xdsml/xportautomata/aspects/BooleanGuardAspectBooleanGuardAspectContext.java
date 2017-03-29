package org.gemoc.xportautomata.xdsml.xportautomata.aspects;

import java.util.Map;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.BooleanGuard;
import org.gemoc.xportautomata.xdsml.xportautomata.aspects.BooleanGuardAspectBooleanGuardAspectProperties;

@SuppressWarnings("all")
public class BooleanGuardAspectBooleanGuardAspectContext {
  public final static BooleanGuardAspectBooleanGuardAspectContext INSTANCE = new BooleanGuardAspectBooleanGuardAspectContext();
  
  public static BooleanGuardAspectBooleanGuardAspectProperties getSelf(final BooleanGuard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.xportautomata.xdsml.xportautomata.aspects.BooleanGuardAspectBooleanGuardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanGuard, BooleanGuardAspectBooleanGuardAspectProperties> map = new java.util.WeakHashMap<org.gemoc.xportautomata.xdsml.xportautomata.fsm.BooleanGuard, org.gemoc.xportautomata.xdsml.xportautomata.aspects.BooleanGuardAspectBooleanGuardAspectProperties>();
  
  public Map<BooleanGuard, BooleanGuardAspectBooleanGuardAspectProperties> getMap() {
    return map;
  }
}
