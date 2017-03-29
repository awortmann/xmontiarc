package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects;

import java.util.Map;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.ComponentTypeAspectComponentTypeAspectProperties;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.ComponentType;

@SuppressWarnings("all")
public class ComponentTypeAspectComponentTypeAspectContext {
  public final static ComponentTypeAspectComponentTypeAspectContext INSTANCE = new ComponentTypeAspectComponentTypeAspectContext();
  
  public static ComponentTypeAspectComponentTypeAspectProperties getSelf(final ComponentType _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.ComponentTypeAspectComponentTypeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ComponentType, ComponentTypeAspectComponentTypeAspectProperties> map = new java.util.WeakHashMap<org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.ComponentType, org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.ComponentTypeAspectComponentTypeAspectProperties>();
  
  public Map<ComponentType, ComponentTypeAspectComponentTypeAspectProperties> getMap() {
    return map;
  }
}
