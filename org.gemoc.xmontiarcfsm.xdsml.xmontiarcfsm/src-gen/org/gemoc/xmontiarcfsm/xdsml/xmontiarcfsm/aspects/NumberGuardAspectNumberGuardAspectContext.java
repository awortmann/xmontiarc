package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects;

import java.util.Map;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.NumberGuard;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.NumberGuardAspectNumberGuardAspectProperties;

@SuppressWarnings("all")
public class NumberGuardAspectNumberGuardAspectContext {
  public final static NumberGuardAspectNumberGuardAspectContext INSTANCE = new NumberGuardAspectNumberGuardAspectContext();
  
  public static NumberGuardAspectNumberGuardAspectProperties getSelf(final NumberGuard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.NumberGuardAspectNumberGuardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<NumberGuard, NumberGuardAspectNumberGuardAspectProperties> map = new java.util.WeakHashMap<org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.NumberGuard, org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.NumberGuardAspectNumberGuardAspectProperties>();
  
  public Map<NumberGuard, NumberGuardAspectNumberGuardAspectProperties> getMap() {
    return map;
  }
}
