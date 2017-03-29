package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects;

import java.util.Map;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.SubcomponentAspectSubcomponentAspectProperties;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.Subcomponent;

@SuppressWarnings("all")
public class SubcomponentAspectSubcomponentAspectContext {
  public final static SubcomponentAspectSubcomponentAspectContext INSTANCE = new SubcomponentAspectSubcomponentAspectContext();
  
  public static SubcomponentAspectSubcomponentAspectProperties getSelf(final Subcomponent _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.SubcomponentAspectSubcomponentAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Subcomponent, SubcomponentAspectSubcomponentAspectProperties> map = new java.util.WeakHashMap<org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.Subcomponent, org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.SubcomponentAspectSubcomponentAspectProperties>();
  
  public Map<Subcomponent, SubcomponentAspectSubcomponentAspectProperties> getMap() {
    return map;
  }
}
