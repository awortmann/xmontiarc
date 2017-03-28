package ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects;

import java.util.Map;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.BooleanGuard;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.BooleanGuardAspectBooleanGuardAspectProperties;

@SuppressWarnings("all")
public class BooleanGuardAspectBooleanGuardAspectContext {
  public final static BooleanGuardAspectBooleanGuardAspectContext INSTANCE = new BooleanGuardAspectBooleanGuardAspectContext();
  
  public static BooleanGuardAspectBooleanGuardAspectProperties getSelf(final BooleanGuard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.BooleanGuardAspectBooleanGuardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanGuard, BooleanGuardAspectBooleanGuardAspectProperties> map = new java.util.WeakHashMap<ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.BooleanGuard, ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.BooleanGuardAspectBooleanGuardAspectProperties>();
  
  public Map<BooleanGuard, BooleanGuardAspectBooleanGuardAspectProperties> getMap() {
    return map;
  }
}
