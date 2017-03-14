package ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects;

import java.util.Map;
import ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ComponentTypeHelperAspectComponentTypeAspectProperties;
import xmontiarc.ComponentType;

@SuppressWarnings("all")
public class ComponentTypeHelperAspectComponentTypeAspectContext {
  public final static ComponentTypeHelperAspectComponentTypeAspectContext INSTANCE = new ComponentTypeHelperAspectComponentTypeAspectContext();
  
  public static ComponentTypeHelperAspectComponentTypeAspectProperties getSelf(final ComponentType _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ComponentTypeHelperAspectComponentTypeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ComponentType, ComponentTypeHelperAspectComponentTypeAspectProperties> map = new java.util.WeakHashMap<xmontiarc.ComponentType, ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ComponentTypeHelperAspectComponentTypeAspectProperties>();
  
  public Map<ComponentType, ComponentTypeHelperAspectComponentTypeAspectProperties> getMap() {
    return map;
  }
}
