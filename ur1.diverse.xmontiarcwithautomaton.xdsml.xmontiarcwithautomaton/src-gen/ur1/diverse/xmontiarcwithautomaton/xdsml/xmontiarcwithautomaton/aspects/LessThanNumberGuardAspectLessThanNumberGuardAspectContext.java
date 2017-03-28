package ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects;

import java.util.Map;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.LessThanNumberGuard;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.LessThanNumberGuardAspectLessThanNumberGuardAspectProperties;

@SuppressWarnings("all")
public class LessThanNumberGuardAspectLessThanNumberGuardAspectContext {
  public final static LessThanNumberGuardAspectLessThanNumberGuardAspectContext INSTANCE = new LessThanNumberGuardAspectLessThanNumberGuardAspectContext();
  
  public static LessThanNumberGuardAspectLessThanNumberGuardAspectProperties getSelf(final LessThanNumberGuard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.LessThanNumberGuardAspectLessThanNumberGuardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<LessThanNumberGuard, LessThanNumberGuardAspectLessThanNumberGuardAspectProperties> map = new java.util.WeakHashMap<ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.LessThanNumberGuard, ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.LessThanNumberGuardAspectLessThanNumberGuardAspectProperties>();
  
  public Map<LessThanNumberGuard, LessThanNumberGuardAspectLessThanNumberGuardAspectProperties> getMap() {
    return map;
  }
}
