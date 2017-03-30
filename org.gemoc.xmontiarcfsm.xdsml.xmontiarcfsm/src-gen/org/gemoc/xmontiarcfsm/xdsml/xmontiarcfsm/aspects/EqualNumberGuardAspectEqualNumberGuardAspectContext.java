package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects;

import java.util.Map;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.EqualNumberGuard;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.EqualNumberGuardAspectEqualNumberGuardAspectProperties;

@SuppressWarnings("all")
public class EqualNumberGuardAspectEqualNumberGuardAspectContext {
  public final static EqualNumberGuardAspectEqualNumberGuardAspectContext INSTANCE = new EqualNumberGuardAspectEqualNumberGuardAspectContext();
  
  public static EqualNumberGuardAspectEqualNumberGuardAspectProperties getSelf(final EqualNumberGuard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.EqualNumberGuardAspectEqualNumberGuardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<EqualNumberGuard, EqualNumberGuardAspectEqualNumberGuardAspectProperties> map = new java.util.WeakHashMap<org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.EqualNumberGuard, org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.EqualNumberGuardAspectEqualNumberGuardAspectProperties>();
  
  public Map<EqualNumberGuard, EqualNumberGuardAspectEqualNumberGuardAspectProperties> getMap() {
    return map;
  }
}
