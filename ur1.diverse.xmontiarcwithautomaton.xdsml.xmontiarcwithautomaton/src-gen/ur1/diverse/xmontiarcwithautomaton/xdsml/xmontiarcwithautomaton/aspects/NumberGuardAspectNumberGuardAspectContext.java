package ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects;

import java.util.Map;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.NumberGuard;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.NumberGuardAspectNumberGuardAspectProperties;

@SuppressWarnings("all")
public class NumberGuardAspectNumberGuardAspectContext {
  public final static NumberGuardAspectNumberGuardAspectContext INSTANCE = new NumberGuardAspectNumberGuardAspectContext();
  
  public static NumberGuardAspectNumberGuardAspectProperties getSelf(final NumberGuard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.NumberGuardAspectNumberGuardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<NumberGuard, NumberGuardAspectNumberGuardAspectProperties> map = new java.util.WeakHashMap<ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.NumberGuard, ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.NumberGuardAspectNumberGuardAspectProperties>();
  
  public Map<NumberGuard, NumberGuardAspectNumberGuardAspectProperties> getMap() {
    return map;
  }
}
