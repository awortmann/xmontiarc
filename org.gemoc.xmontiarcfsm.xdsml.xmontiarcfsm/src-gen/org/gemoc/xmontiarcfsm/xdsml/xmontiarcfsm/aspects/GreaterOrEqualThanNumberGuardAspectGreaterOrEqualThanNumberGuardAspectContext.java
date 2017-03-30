package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects;

import java.util.Map;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.GreaterOrEqualThanNumberGuard;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectProperties;

@SuppressWarnings("all")
public class GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectContext {
  public final static GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectContext INSTANCE = new GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectContext();
  
  public static GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectProperties getSelf(final GreaterOrEqualThanNumberGuard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<GreaterOrEqualThanNumberGuard, GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectProperties> map = new java.util.WeakHashMap<org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.GreaterOrEqualThanNumberGuard, org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectProperties>();
  
  public Map<GreaterOrEqualThanNumberGuard, GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectProperties> getMap() {
    return map;
  }
}
