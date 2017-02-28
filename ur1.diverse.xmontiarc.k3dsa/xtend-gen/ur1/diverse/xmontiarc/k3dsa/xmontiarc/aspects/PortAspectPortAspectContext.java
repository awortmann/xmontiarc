package ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects;

import java.util.Map;
import ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.PortAspectPortAspectProperties;
import xmontiarc.Port;

@SuppressWarnings("all")
public class PortAspectPortAspectContext {
  public final static PortAspectPortAspectContext INSTANCE = new PortAspectPortAspectContext();
  
  public static PortAspectPortAspectProperties getSelf(final Port _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.PortAspectPortAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Port, PortAspectPortAspectProperties> map = new java.util.WeakHashMap<xmontiarc.Port, ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.PortAspectPortAspectProperties>();
  
  public Map<Port, PortAspectPortAspectProperties> getMap() {
    return map;
  }
}
