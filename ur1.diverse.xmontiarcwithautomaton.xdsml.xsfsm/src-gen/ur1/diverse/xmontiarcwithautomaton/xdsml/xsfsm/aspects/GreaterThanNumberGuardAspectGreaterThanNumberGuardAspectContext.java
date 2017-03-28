package ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects;

import java.util.Map;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.GreaterThanNumberGuard;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.GreaterThanNumberGuardAspectGreaterThanNumberGuardAspectProperties;

@SuppressWarnings("all")
public class GreaterThanNumberGuardAspectGreaterThanNumberGuardAspectContext {
  public final static GreaterThanNumberGuardAspectGreaterThanNumberGuardAspectContext INSTANCE = new GreaterThanNumberGuardAspectGreaterThanNumberGuardAspectContext();
  
  public static GreaterThanNumberGuardAspectGreaterThanNumberGuardAspectProperties getSelf(final GreaterThanNumberGuard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.GreaterThanNumberGuardAspectGreaterThanNumberGuardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<GreaterThanNumberGuard, GreaterThanNumberGuardAspectGreaterThanNumberGuardAspectProperties> map = new java.util.WeakHashMap<ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.GreaterThanNumberGuard, ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.GreaterThanNumberGuardAspectGreaterThanNumberGuardAspectProperties>();
  
  public Map<GreaterThanNumberGuard, GreaterThanNumberGuardAspectGreaterThanNumberGuardAspectProperties> getMap() {
    return map;
  }
}
