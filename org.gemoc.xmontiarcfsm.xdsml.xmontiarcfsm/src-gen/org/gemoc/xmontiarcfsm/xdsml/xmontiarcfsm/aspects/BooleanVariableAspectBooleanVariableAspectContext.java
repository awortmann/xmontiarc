package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects;

import java.util.Map;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.BooleanVariable;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.BooleanVariableAspectBooleanVariableAspectProperties;

@SuppressWarnings("all")
public class BooleanVariableAspectBooleanVariableAspectContext {
  public final static BooleanVariableAspectBooleanVariableAspectContext INSTANCE = new BooleanVariableAspectBooleanVariableAspectContext();
  
  public static BooleanVariableAspectBooleanVariableAspectProperties getSelf(final BooleanVariable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.BooleanVariableAspectBooleanVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanVariable, BooleanVariableAspectBooleanVariableAspectProperties> map = new java.util.WeakHashMap<org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.BooleanVariable, org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.BooleanVariableAspectBooleanVariableAspectProperties>();
  
  public Map<BooleanVariable, BooleanVariableAspectBooleanVariableAspectProperties> getMap() {
    return map;
  }
}
