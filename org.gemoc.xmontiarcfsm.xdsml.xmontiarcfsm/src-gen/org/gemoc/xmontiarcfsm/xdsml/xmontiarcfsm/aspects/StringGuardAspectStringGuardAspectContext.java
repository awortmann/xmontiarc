package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects;

import java.util.Map;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.StringGuard;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.StringGuardAspectStringGuardAspectProperties;

@SuppressWarnings("all")
public class StringGuardAspectStringGuardAspectContext {
  public final static StringGuardAspectStringGuardAspectContext INSTANCE = new StringGuardAspectStringGuardAspectContext();
  
  public static StringGuardAspectStringGuardAspectProperties getSelf(final StringGuard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.StringGuardAspectStringGuardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StringGuard, StringGuardAspectStringGuardAspectProperties> map = new java.util.WeakHashMap<org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.StringGuard, org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.StringGuardAspectStringGuardAspectProperties>();
  
  public Map<StringGuard, StringGuardAspectStringGuardAspectProperties> getMap() {
    return map;
  }
}
