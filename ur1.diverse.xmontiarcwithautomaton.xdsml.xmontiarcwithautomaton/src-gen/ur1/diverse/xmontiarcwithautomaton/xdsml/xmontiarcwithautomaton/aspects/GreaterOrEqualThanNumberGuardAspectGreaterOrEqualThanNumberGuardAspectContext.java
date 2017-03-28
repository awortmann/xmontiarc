package ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects;

import java.util.Map;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.GreaterOrEqualThanNumberGuard;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectProperties;

@SuppressWarnings("all")
public class GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectContext {
  public final static GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectContext INSTANCE = new GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectContext();
  
  public static GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectProperties getSelf(final GreaterOrEqualThanNumberGuard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<GreaterOrEqualThanNumberGuard, GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectProperties> map = new java.util.WeakHashMap<ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.GreaterOrEqualThanNumberGuard, ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectProperties>();
  
  public Map<GreaterOrEqualThanNumberGuard, GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectProperties> getMap() {
    return map;
  }
}
