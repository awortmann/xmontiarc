package org.gemoc.xmontiarc.xdsml.xmontiarc.aspects;

import java.util.Map;
import org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.ComponentTypeAspectComponentTypeAspectProperties;
import org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.ComponentType;

@SuppressWarnings("all")
public class ComponentTypeAspectComponentTypeAspectContext {
  public final static ComponentTypeAspectComponentTypeAspectContext INSTANCE = new ComponentTypeAspectComponentTypeAspectContext();
  
  public static ComponentTypeAspectComponentTypeAspectProperties getSelf(final ComponentType _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.ComponentTypeAspectComponentTypeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ComponentType, ComponentTypeAspectComponentTypeAspectProperties> map = new java.util.WeakHashMap<org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.ComponentType, org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.ComponentTypeAspectComponentTypeAspectProperties>();
  
  public Map<ComponentType, ComponentTypeAspectComponentTypeAspectProperties> getMap() {
    return map;
  }
}
