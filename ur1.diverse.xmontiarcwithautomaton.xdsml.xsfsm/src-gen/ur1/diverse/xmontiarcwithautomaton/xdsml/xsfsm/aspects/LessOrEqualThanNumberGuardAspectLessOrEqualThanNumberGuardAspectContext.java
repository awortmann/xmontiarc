package ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects;

import java.util.Map;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.LessOrEqualThanNumberGuard;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectProperties;

@SuppressWarnings("all")
public class LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectContext {
  public final static LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectContext INSTANCE = new LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectContext();
  
  public static LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectProperties getSelf(final LessOrEqualThanNumberGuard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<LessOrEqualThanNumberGuard, LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectProperties> map = new java.util.WeakHashMap<ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.LessOrEqualThanNumberGuard, ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectProperties>();
  
  public Map<LessOrEqualThanNumberGuard, LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectProperties> getMap() {
    return map;
  }
}
