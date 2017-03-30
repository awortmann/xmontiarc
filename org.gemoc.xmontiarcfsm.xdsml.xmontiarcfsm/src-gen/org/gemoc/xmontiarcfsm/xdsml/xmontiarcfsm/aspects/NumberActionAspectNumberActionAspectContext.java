package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects;

import java.util.Map;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.NumberAction;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.NumberActionAspectNumberActionAspectProperties;

@SuppressWarnings("all")
public class NumberActionAspectNumberActionAspectContext {
  public final static NumberActionAspectNumberActionAspectContext INSTANCE = new NumberActionAspectNumberActionAspectContext();
  
  public static NumberActionAspectNumberActionAspectProperties getSelf(final NumberAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.NumberActionAspectNumberActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<NumberAction, NumberActionAspectNumberActionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.NumberAction, org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.NumberActionAspectNumberActionAspectProperties>();
  
  public Map<NumberAction, NumberActionAspectNumberActionAspectProperties> getMap() {
    return map;
  }
}
