package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects;

import java.util.Map;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.BooleanAction;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.BooleanActionAspectBooleanActionAspectProperties;

@SuppressWarnings("all")
public class BooleanActionAspectBooleanActionAspectContext {
  public final static BooleanActionAspectBooleanActionAspectContext INSTANCE = new BooleanActionAspectBooleanActionAspectContext();
  
  public static BooleanActionAspectBooleanActionAspectProperties getSelf(final BooleanAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.BooleanActionAspectBooleanActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanAction, BooleanActionAspectBooleanActionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.BooleanAction, org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.BooleanActionAspectBooleanActionAspectProperties>();
  
  public Map<BooleanAction, BooleanActionAspectBooleanActionAspectProperties> getMap() {
    return map;
  }
}
