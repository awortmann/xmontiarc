package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects;

import java.util.Map;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.PortAspectPortAspectProperties;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.Port;

@SuppressWarnings("all")
public class PortAspectPortAspectContext {
  public final static PortAspectPortAspectContext INSTANCE = new PortAspectPortAspectContext();
  
  public static PortAspectPortAspectProperties getSelf(final Port _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.PortAspectPortAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Port, PortAspectPortAspectProperties> map = new java.util.WeakHashMap<org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.Port, org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.PortAspectPortAspectProperties>();
  
  public Map<Port, PortAspectPortAspectProperties> getMap() {
    return map;
  }
}
