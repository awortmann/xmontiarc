package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects;

import java.util.Map;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.NumberVariable;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.NumberVariableAspectNumberVariableAspectProperties;

@SuppressWarnings("all")
public class NumberVariableAspectNumberVariableAspectContext {
  public final static NumberVariableAspectNumberVariableAspectContext INSTANCE = new NumberVariableAspectNumberVariableAspectContext();
  
  public static NumberVariableAspectNumberVariableAspectProperties getSelf(final NumberVariable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.NumberVariableAspectNumberVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<NumberVariable, NumberVariableAspectNumberVariableAspectProperties> map = new java.util.WeakHashMap<org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.NumberVariable, org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.NumberVariableAspectNumberVariableAspectProperties>();
  
  public Map<NumberVariable, NumberVariableAspectNumberVariableAspectProperties> getMap() {
    return map;
  }
}
