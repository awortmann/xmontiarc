package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects;

import java.util.Map;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.StringAction;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.StringActionAspectStringActionAspectProperties;

@SuppressWarnings("all")
public class StringActionAspectStringActionAspectContext {
  public final static StringActionAspectStringActionAspectContext INSTANCE = new StringActionAspectStringActionAspectContext();
  
  public static StringActionAspectStringActionAspectProperties getSelf(final StringAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.StringActionAspectStringActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StringAction, StringActionAspectStringActionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.StringAction, org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.StringActionAspectStringActionAspectProperties>();
  
  public Map<StringAction, StringActionAspectStringActionAspectProperties> getMap() {
    return map;
  }
}
