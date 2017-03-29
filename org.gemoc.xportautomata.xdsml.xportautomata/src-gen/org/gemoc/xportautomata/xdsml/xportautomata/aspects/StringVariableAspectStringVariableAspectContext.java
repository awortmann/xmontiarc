package org.gemoc.xportautomata.xdsml.xportautomata.aspects;

import java.util.Map;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.StringVariable;
import org.gemoc.xportautomata.xdsml.xportautomata.aspects.StringVariableAspectStringVariableAspectProperties;

@SuppressWarnings("all")
public class StringVariableAspectStringVariableAspectContext {
  public final static StringVariableAspectStringVariableAspectContext INSTANCE = new StringVariableAspectStringVariableAspectContext();
  
  public static StringVariableAspectStringVariableAspectProperties getSelf(final StringVariable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.xportautomata.xdsml.xportautomata.aspects.StringVariableAspectStringVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StringVariable, StringVariableAspectStringVariableAspectProperties> map = new java.util.WeakHashMap<org.gemoc.xportautomata.xdsml.xportautomata.fsm.StringVariable, org.gemoc.xportautomata.xdsml.xportautomata.aspects.StringVariableAspectStringVariableAspectProperties>();
  
  public Map<StringVariable, StringVariableAspectStringVariableAspectProperties> getMap() {
    return map;
  }
}
