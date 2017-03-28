package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects;

import java.util.Map;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.GreaterOrEqualThanNumberGuard;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectProperties;

@SuppressWarnings("all")
public class GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectContext {
  public final static GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectContext INSTANCE = new GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectContext();
  
  public static GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectProperties getSelf(final GreaterOrEqualThanNumberGuard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<GreaterOrEqualThanNumberGuard, GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectProperties> map = new java.util.WeakHashMap<org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.GreaterOrEqualThanNumberGuard, org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectProperties>();
  
  public Map<GreaterOrEqualThanNumberGuard, GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectProperties> getMap() {
    return map;
  }
}
