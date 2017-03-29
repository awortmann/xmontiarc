package org.gemoc.portautomata.fsm.k3dsa;

import java.util.Map;
import org.gemoc.portautomata.fsm.Guard;
import org.gemoc.portautomata.fsm.k3dsa.GuardAspectGuardAspectProperties;

@SuppressWarnings("all")
public class GuardAspectGuardAspectContext {
  public final static GuardAspectGuardAspectContext INSTANCE = new GuardAspectGuardAspectContext();
  
  public static GuardAspectGuardAspectProperties getSelf(final Guard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.portautomata.fsm.k3dsa.GuardAspectGuardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Guard, GuardAspectGuardAspectProperties> map = new java.util.WeakHashMap<org.gemoc.portautomata.fsm.Guard, org.gemoc.portautomata.fsm.k3dsa.GuardAspectGuardAspectProperties>();
  
  public Map<Guard, GuardAspectGuardAspectProperties> getMap() {
    return map;
  }
}
