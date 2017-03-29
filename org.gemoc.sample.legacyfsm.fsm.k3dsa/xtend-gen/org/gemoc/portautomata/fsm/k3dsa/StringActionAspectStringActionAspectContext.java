package org.gemoc.portautomata.fsm.k3dsa;

import java.util.Map;
import org.gemoc.portautomata.fsm.StringAction;
import org.gemoc.portautomata.fsm.k3dsa.StringActionAspectStringActionAspectProperties;

@SuppressWarnings("all")
public class StringActionAspectStringActionAspectContext {
  public final static StringActionAspectStringActionAspectContext INSTANCE = new StringActionAspectStringActionAspectContext();
  
  public static StringActionAspectStringActionAspectProperties getSelf(final StringAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.portautomata.fsm.k3dsa.StringActionAspectStringActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StringAction, StringActionAspectStringActionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.portautomata.fsm.StringAction, org.gemoc.portautomata.fsm.k3dsa.StringActionAspectStringActionAspectProperties>();
  
  public Map<StringAction, StringActionAspectStringActionAspectProperties> getMap() {
    return map;
  }
}
