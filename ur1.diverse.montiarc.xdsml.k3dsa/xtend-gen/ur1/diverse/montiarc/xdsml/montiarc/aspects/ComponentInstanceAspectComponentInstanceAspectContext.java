package ur1.diverse.montiarc.xdsml.montiarc.aspects;

import java.util.Map;
import montiarc.ComponentInstance;
import ur1.diverse.montiarc.xdsml.montiarc.aspects.ComponentInstanceAspectComponentInstanceAspectProperties;

@SuppressWarnings("all")
public class ComponentInstanceAspectComponentInstanceAspectContext {
  public final static ComponentInstanceAspectComponentInstanceAspectContext INSTANCE = new ComponentInstanceAspectComponentInstanceAspectContext();
  
  public static ComponentInstanceAspectComponentInstanceAspectProperties getSelf(final ComponentInstance _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ur1.diverse.montiarc.xdsml.montiarc.aspects.ComponentInstanceAspectComponentInstanceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ComponentInstance, ComponentInstanceAspectComponentInstanceAspectProperties> map = new java.util.WeakHashMap<montiarc.ComponentInstance, ur1.diverse.montiarc.xdsml.montiarc.aspects.ComponentInstanceAspectComponentInstanceAspectProperties>();
  
  public Map<ComponentInstance, ComponentInstanceAspectComponentInstanceAspectProperties> getMap() {
    return map;
  }
}
