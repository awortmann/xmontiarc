package ur1.diverse.montiarc.xdsml.montiarc.aspects;

import java.util.Map;
import montiarc.PortInstance;
import ur1.diverse.montiarc.xdsml.montiarc.aspects.PortInstanceAspectPortInstanceAspectProperties;

@SuppressWarnings("all")
public class PortInstanceAspectPortInstanceAspectContext {
  public final static PortInstanceAspectPortInstanceAspectContext INSTANCE = new PortInstanceAspectPortInstanceAspectContext();
  
  public static PortInstanceAspectPortInstanceAspectProperties getSelf(final PortInstance _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ur1.diverse.montiarc.xdsml.montiarc.aspects.PortInstanceAspectPortInstanceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<PortInstance, PortInstanceAspectPortInstanceAspectProperties> map = new java.util.WeakHashMap<montiarc.PortInstance, ur1.diverse.montiarc.xdsml.montiarc.aspects.PortInstanceAspectPortInstanceAspectProperties>();
  
  public Map<PortInstance, PortInstanceAspectPortInstanceAspectProperties> getMap() {
    return map;
  }
}
