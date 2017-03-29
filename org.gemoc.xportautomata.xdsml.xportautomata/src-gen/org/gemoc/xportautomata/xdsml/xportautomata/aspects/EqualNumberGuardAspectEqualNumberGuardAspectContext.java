package org.gemoc.xportautomata.xdsml.xportautomata.aspects;

import java.util.Map;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.EqualNumberGuard;
import org.gemoc.xportautomata.xdsml.xportautomata.aspects.EqualNumberGuardAspectEqualNumberGuardAspectProperties;

@SuppressWarnings("all")
public class EqualNumberGuardAspectEqualNumberGuardAspectContext {
  public final static EqualNumberGuardAspectEqualNumberGuardAspectContext INSTANCE = new EqualNumberGuardAspectEqualNumberGuardAspectContext();
  
  public static EqualNumberGuardAspectEqualNumberGuardAspectProperties getSelf(final EqualNumberGuard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.xportautomata.xdsml.xportautomata.aspects.EqualNumberGuardAspectEqualNumberGuardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<EqualNumberGuard, EqualNumberGuardAspectEqualNumberGuardAspectProperties> map = new java.util.WeakHashMap<org.gemoc.xportautomata.xdsml.xportautomata.fsm.EqualNumberGuard, org.gemoc.xportautomata.xdsml.xportautomata.aspects.EqualNumberGuardAspectEqualNumberGuardAspectProperties>();
  
  public Map<EqualNumberGuard, EqualNumberGuardAspectEqualNumberGuardAspectProperties> getMap() {
    return map;
  }
}
