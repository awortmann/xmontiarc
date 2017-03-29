package org.gemoc.portautomata.fsm.k3dsa;

import java.util.Map;
import org.gemoc.portautomata.fsm.NumberAction;
import org.gemoc.portautomata.fsm.k3dsa.NumberActionAspectNumberActionAspectProperties;

@SuppressWarnings("all")
public class NumberActionAspectNumberActionAspectContext {
  public final static NumberActionAspectNumberActionAspectContext INSTANCE = new NumberActionAspectNumberActionAspectContext();
  
  public static NumberActionAspectNumberActionAspectProperties getSelf(final NumberAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.portautomata.fsm.k3dsa.NumberActionAspectNumberActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<NumberAction, NumberActionAspectNumberActionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.portautomata.fsm.NumberAction, org.gemoc.portautomata.fsm.k3dsa.NumberActionAspectNumberActionAspectProperties>();
  
  public Map<NumberAction, NumberActionAspectNumberActionAspectProperties> getMap() {
    return map;
  }
}
