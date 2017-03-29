package org.gemoc.xmontiarc.xdsml.xmontiarc.aspects;

import java.util.Map;
import org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.PortAspectPortAspectProperties;
import org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.Port;

@SuppressWarnings("all")
public class PortAspectPortAspectContext {
  public final static PortAspectPortAspectContext INSTANCE = new PortAspectPortAspectContext();
  
  public static PortAspectPortAspectProperties getSelf(final Port _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.PortAspectPortAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Port, PortAspectPortAspectProperties> map = new java.util.WeakHashMap<org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.Port, org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.PortAspectPortAspectProperties>();
  
  public Map<Port, PortAspectPortAspectProperties> getMap() {
    return map;
  }
}
