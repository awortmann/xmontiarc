package org.gemoc.portautomata.fsm.k3dsa;

import java.util.Map;
import org.gemoc.portautomata.fsm.StringVariable;
import org.gemoc.portautomata.fsm.k3dsa.StringVariableAspectStringVariableAspectProperties;

@SuppressWarnings("all")
public class StringVariableAspectStringVariableAspectContext {
  public final static StringVariableAspectStringVariableAspectContext INSTANCE = new StringVariableAspectStringVariableAspectContext();
  
  public static StringVariableAspectStringVariableAspectProperties getSelf(final StringVariable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.portautomata.fsm.k3dsa.StringVariableAspectStringVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StringVariable, StringVariableAspectStringVariableAspectProperties> map = new java.util.WeakHashMap<org.gemoc.portautomata.fsm.StringVariable, org.gemoc.portautomata.fsm.k3dsa.StringVariableAspectStringVariableAspectProperties>();
  
  public Map<StringVariable, StringVariableAspectStringVariableAspectProperties> getMap() {
    return map;
  }
}
