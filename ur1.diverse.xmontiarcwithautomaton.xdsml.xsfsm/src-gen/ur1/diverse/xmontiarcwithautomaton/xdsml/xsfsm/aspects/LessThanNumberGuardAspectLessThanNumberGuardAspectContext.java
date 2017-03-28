package ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects;

import java.util.Map;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.LessThanNumberGuard;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.LessThanNumberGuardAspectLessThanNumberGuardAspectProperties;

@SuppressWarnings("all")
public class LessThanNumberGuardAspectLessThanNumberGuardAspectContext {
  public final static LessThanNumberGuardAspectLessThanNumberGuardAspectContext INSTANCE = new LessThanNumberGuardAspectLessThanNumberGuardAspectContext();
  
  public static LessThanNumberGuardAspectLessThanNumberGuardAspectProperties getSelf(final LessThanNumberGuard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.LessThanNumberGuardAspectLessThanNumberGuardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<LessThanNumberGuard, LessThanNumberGuardAspectLessThanNumberGuardAspectProperties> map = new java.util.WeakHashMap<ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.LessThanNumberGuard, ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.LessThanNumberGuardAspectLessThanNumberGuardAspectProperties>();
  
  public Map<LessThanNumberGuard, LessThanNumberGuardAspectLessThanNumberGuardAspectProperties> getMap() {
    return map;
  }
}
