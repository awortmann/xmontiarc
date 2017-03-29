package org.gemoc.portautomata.fsm.k3dsa;

import java.util.Map;
import org.gemoc.portautomata.fsm.BooleanAction;
import org.gemoc.portautomata.fsm.k3dsa.BooleanActionAspectBooleanActionAspectProperties;

@SuppressWarnings("all")
public class BooleanActionAspectBooleanActionAspectContext {
  public final static BooleanActionAspectBooleanActionAspectContext INSTANCE = new BooleanActionAspectBooleanActionAspectContext();
  
  public static BooleanActionAspectBooleanActionAspectProperties getSelf(final BooleanAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.portautomata.fsm.k3dsa.BooleanActionAspectBooleanActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanAction, BooleanActionAspectBooleanActionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.portautomata.fsm.BooleanAction, org.gemoc.portautomata.fsm.k3dsa.BooleanActionAspectBooleanActionAspectProperties>();
  
  public Map<BooleanAction, BooleanActionAspectBooleanActionAspectProperties> getMap() {
    return map;
  }
}
