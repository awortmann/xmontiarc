package org.gemoc.portautomata.fsm.k3dsa;

import java.util.Map;
import org.gemoc.portautomata.fsm.NumberVariable;
import org.gemoc.portautomata.fsm.k3dsa.NumberVariableAspectNumberVariableAspectProperties;

@SuppressWarnings("all")
public class NumberVariableAspectNumberVariableAspectContext {
  public final static NumberVariableAspectNumberVariableAspectContext INSTANCE = new NumberVariableAspectNumberVariableAspectContext();
  
  public static NumberVariableAspectNumberVariableAspectProperties getSelf(final NumberVariable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.portautomata.fsm.k3dsa.NumberVariableAspectNumberVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<NumberVariable, NumberVariableAspectNumberVariableAspectProperties> map = new java.util.WeakHashMap<org.gemoc.portautomata.fsm.NumberVariable, org.gemoc.portautomata.fsm.k3dsa.NumberVariableAspectNumberVariableAspectProperties>();
  
  public Map<NumberVariable, NumberVariableAspectNumberVariableAspectProperties> getMap() {
    return map;
  }
}
