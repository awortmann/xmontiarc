package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects;

import java.util.Map;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StringVariable;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StringVariableAspectStringVariableAspectProperties;

@SuppressWarnings("all")
public class StringVariableAspectStringVariableAspectContext {
  public final static StringVariableAspectStringVariableAspectContext INSTANCE = new StringVariableAspectStringVariableAspectContext();
  
  public static StringVariableAspectStringVariableAspectProperties getSelf(final StringVariable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StringVariableAspectStringVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StringVariable, StringVariableAspectStringVariableAspectProperties> map = new java.util.WeakHashMap<org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StringVariable, org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StringVariableAspectStringVariableAspectProperties>();
  
  public Map<StringVariable, StringVariableAspectStringVariableAspectProperties> getMap() {
    return map;
  }
}
