package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects;

import java.util.Map;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.LessThanNumberGuard;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.LessThanNumberGuardAspectLessThanNumberGuardAspectProperties;

@SuppressWarnings("all")
public class LessThanNumberGuardAspectLessThanNumberGuardAspectContext {
  public final static LessThanNumberGuardAspectLessThanNumberGuardAspectContext INSTANCE = new LessThanNumberGuardAspectLessThanNumberGuardAspectContext();
  
  public static LessThanNumberGuardAspectLessThanNumberGuardAspectProperties getSelf(final LessThanNumberGuard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.LessThanNumberGuardAspectLessThanNumberGuardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<LessThanNumberGuard, LessThanNumberGuardAspectLessThanNumberGuardAspectProperties> map = new java.util.WeakHashMap<org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.LessThanNumberGuard, org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.LessThanNumberGuardAspectLessThanNumberGuardAspectProperties>();
  
  public Map<LessThanNumberGuard, LessThanNumberGuardAspectLessThanNumberGuardAspectProperties> getMap() {
    return map;
  }
}
