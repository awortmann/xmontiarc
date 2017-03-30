package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects;

import java.util.Map;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.LessOrEqualThanNumberGuard;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectProperties;

@SuppressWarnings("all")
public class LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectContext {
  public final static LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectContext INSTANCE = new LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectContext();
  
  public static LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectProperties getSelf(final LessOrEqualThanNumberGuard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<LessOrEqualThanNumberGuard, LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectProperties> map = new java.util.WeakHashMap<org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.LessOrEqualThanNumberGuard, org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectProperties>();
  
  public Map<LessOrEqualThanNumberGuard, LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectProperties> getMap() {
    return map;
  }
}
