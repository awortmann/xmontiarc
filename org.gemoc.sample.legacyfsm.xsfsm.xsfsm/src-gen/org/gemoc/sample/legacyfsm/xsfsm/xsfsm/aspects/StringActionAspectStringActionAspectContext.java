package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects;

import java.util.Map;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StringAction;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StringActionAspectStringActionAspectProperties;

@SuppressWarnings("all")
public class StringActionAspectStringActionAspectContext {
  public final static StringActionAspectStringActionAspectContext INSTANCE = new StringActionAspectStringActionAspectContext();
  
  public static StringActionAspectStringActionAspectProperties getSelf(final StringAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StringActionAspectStringActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StringAction, StringActionAspectStringActionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StringAction, org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StringActionAspectStringActionAspectProperties>();
  
  public Map<StringAction, StringActionAspectStringActionAspectProperties> getMap() {
    return map;
  }
}
