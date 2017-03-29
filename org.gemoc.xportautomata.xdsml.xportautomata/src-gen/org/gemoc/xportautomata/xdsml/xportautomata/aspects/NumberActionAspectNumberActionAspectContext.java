package org.gemoc.xportautomata.xdsml.xportautomata.aspects;

import java.util.Map;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.NumberAction;
import org.gemoc.xportautomata.xdsml.xportautomata.aspects.NumberActionAspectNumberActionAspectProperties;

@SuppressWarnings("all")
public class NumberActionAspectNumberActionAspectContext {
  public final static NumberActionAspectNumberActionAspectContext INSTANCE = new NumberActionAspectNumberActionAspectContext();
  
  public static NumberActionAspectNumberActionAspectProperties getSelf(final NumberAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.xportautomata.xdsml.xportautomata.aspects.NumberActionAspectNumberActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<NumberAction, NumberActionAspectNumberActionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.xportautomata.xdsml.xportautomata.fsm.NumberAction, org.gemoc.xportautomata.xdsml.xportautomata.aspects.NumberActionAspectNumberActionAspectProperties>();
  
  public Map<NumberAction, NumberActionAspectNumberActionAspectProperties> getMap() {
    return map;
  }
}
