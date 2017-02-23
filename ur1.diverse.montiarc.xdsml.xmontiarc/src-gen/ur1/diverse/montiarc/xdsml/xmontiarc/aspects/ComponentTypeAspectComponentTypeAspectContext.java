package ur1.diverse.montiarc.xdsml.xmontiarc.aspects;

import java.util.Map;
import ur1.diverse.montiarc.xdsml.xmontiarc.montiarc.ComponentType;
import ur1.diverse.montiarc.xdsml.xmontiarc.aspects.ComponentTypeAspectComponentTypeAspectProperties;

@SuppressWarnings("all")
public class ComponentTypeAspectComponentTypeAspectContext {
  public final static ComponentTypeAspectComponentTypeAspectContext INSTANCE = new ComponentTypeAspectComponentTypeAspectContext();
  
  public static ComponentTypeAspectComponentTypeAspectProperties getSelf(final ComponentType _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ur1.diverse.montiarc.xdsml.xmontiarc.aspects.ComponentTypeAspectComponentTypeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ComponentType, ComponentTypeAspectComponentTypeAspectProperties> map = new java.util.WeakHashMap<ur1.diverse.montiarc.xdsml.xmontiarc.montiarc.ComponentType, ur1.diverse.montiarc.xdsml.xmontiarc.aspects.ComponentTypeAspectComponentTypeAspectProperties>();
  
  public Map<ComponentType, ComponentTypeAspectComponentTypeAspectProperties> getMap() {
    return map;
  }
}
