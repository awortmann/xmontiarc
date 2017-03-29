package org.gemoc.portautomata.fsm.k3dsa;

import java.util.Map;
import org.gemoc.portautomata.fsm.StringGuard;
import org.gemoc.portautomata.fsm.k3dsa.StringGuardAspectStringGuardAspectProperties;

@SuppressWarnings("all")
public class StringGuardAspectStringGuardAspectContext {
  public final static StringGuardAspectStringGuardAspectContext INSTANCE = new StringGuardAspectStringGuardAspectContext();
  
  public static StringGuardAspectStringGuardAspectProperties getSelf(final StringGuard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.portautomata.fsm.k3dsa.StringGuardAspectStringGuardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StringGuard, StringGuardAspectStringGuardAspectProperties> map = new java.util.WeakHashMap<org.gemoc.portautomata.fsm.StringGuard, org.gemoc.portautomata.fsm.k3dsa.StringGuardAspectStringGuardAspectProperties>();
  
  public Map<StringGuard, StringGuardAspectStringGuardAspectProperties> getMap() {
    return map;
  }
}
