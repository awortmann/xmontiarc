package ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects;

import java.util.Map;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.LessOrEqualThanNumberGuard;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectProperties;

@SuppressWarnings("all")
public class LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectContext {
  public final static LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectContext INSTANCE = new LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectContext();
  
  public static LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectProperties getSelf(final LessOrEqualThanNumberGuard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<LessOrEqualThanNumberGuard, LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectProperties> map = new java.util.WeakHashMap<ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.LessOrEqualThanNumberGuard, ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectProperties>();
  
  public Map<LessOrEqualThanNumberGuard, LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectProperties> getMap() {
    return map;
  }
}
