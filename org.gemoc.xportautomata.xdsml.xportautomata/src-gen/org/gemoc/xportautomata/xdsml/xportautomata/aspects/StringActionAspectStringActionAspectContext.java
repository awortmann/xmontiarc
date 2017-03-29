package org.gemoc.xportautomata.xdsml.xportautomata.aspects;

import java.util.Map;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.StringAction;
import org.gemoc.xportautomata.xdsml.xportautomata.aspects.StringActionAspectStringActionAspectProperties;

@SuppressWarnings("all")
public class StringActionAspectStringActionAspectContext {
  public final static StringActionAspectStringActionAspectContext INSTANCE = new StringActionAspectStringActionAspectContext();
  
  public static StringActionAspectStringActionAspectProperties getSelf(final StringAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.xportautomata.xdsml.xportautomata.aspects.StringActionAspectStringActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StringAction, StringActionAspectStringActionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.xportautomata.xdsml.xportautomata.fsm.StringAction, org.gemoc.xportautomata.xdsml.xportautomata.aspects.StringActionAspectStringActionAspectProperties>();
  
  public Map<StringAction, StringActionAspectStringActionAspectProperties> getMap() {
    return map;
  }
}
