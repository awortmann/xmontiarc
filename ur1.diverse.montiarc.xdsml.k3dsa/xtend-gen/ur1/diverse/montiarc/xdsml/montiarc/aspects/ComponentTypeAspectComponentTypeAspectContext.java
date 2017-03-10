package ur1.diverse.montiarc.xdsml.montiarc.aspects;

import java.util.Map;
import montiarc.ComponentType;
import ur1.diverse.montiarc.xdsml.montiarc.aspects.ComponentTypeAspectComponentTypeAspectProperties;

@SuppressWarnings("all")
public class ComponentTypeAspectComponentTypeAspectContext {
  public final static ComponentTypeAspectComponentTypeAspectContext INSTANCE = new ComponentTypeAspectComponentTypeAspectContext();
  
  public static ComponentTypeAspectComponentTypeAspectProperties getSelf(final ComponentType _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ur1.diverse.montiarc.xdsml.montiarc.aspects.ComponentTypeAspectComponentTypeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ComponentType, ComponentTypeAspectComponentTypeAspectProperties> map = new java.util.WeakHashMap<montiarc.ComponentType, ur1.diverse.montiarc.xdsml.montiarc.aspects.ComponentTypeAspectComponentTypeAspectProperties>();
  
  public Map<ComponentType, ComponentTypeAspectComponentTypeAspectProperties> getMap() {
    return map;
  }
}
