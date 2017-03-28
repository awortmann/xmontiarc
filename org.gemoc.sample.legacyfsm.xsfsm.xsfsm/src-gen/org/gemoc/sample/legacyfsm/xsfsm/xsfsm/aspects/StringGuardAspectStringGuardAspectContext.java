package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects;

import java.util.Map;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StringGuard;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StringGuardAspectStringGuardAspectProperties;

@SuppressWarnings("all")
public class StringGuardAspectStringGuardAspectContext {
  public final static StringGuardAspectStringGuardAspectContext INSTANCE = new StringGuardAspectStringGuardAspectContext();
  
  public static StringGuardAspectStringGuardAspectProperties getSelf(final StringGuard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StringGuardAspectStringGuardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StringGuard, StringGuardAspectStringGuardAspectProperties> map = new java.util.WeakHashMap<org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StringGuard, org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StringGuardAspectStringGuardAspectProperties>();
  
  public Map<StringGuard, StringGuardAspectStringGuardAspectProperties> getMap() {
    return map;
  }
}
