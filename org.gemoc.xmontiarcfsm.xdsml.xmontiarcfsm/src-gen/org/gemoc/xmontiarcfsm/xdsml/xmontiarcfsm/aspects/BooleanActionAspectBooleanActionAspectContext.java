package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects;

import java.util.Map;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.BooleanAction;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.BooleanActionAspectBooleanActionAspectProperties;

@SuppressWarnings("all")
public class BooleanActionAspectBooleanActionAspectContext {
  public final static BooleanActionAspectBooleanActionAspectContext INSTANCE = new BooleanActionAspectBooleanActionAspectContext();
  
  public static BooleanActionAspectBooleanActionAspectProperties getSelf(final BooleanAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.BooleanActionAspectBooleanActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanAction, BooleanActionAspectBooleanActionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.BooleanAction, org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.BooleanActionAspectBooleanActionAspectProperties>();
  
  public Map<BooleanAction, BooleanActionAspectBooleanActionAspectProperties> getMap() {
    return map;
  }
}
