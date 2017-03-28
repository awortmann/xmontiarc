package ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects;

import java.util.Map;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.EqualNumberGuard;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.EqualNumberGuardAspectEqualNumberGuardAspectProperties;

@SuppressWarnings("all")
public class EqualNumberGuardAspectEqualNumberGuardAspectContext {
  public final static EqualNumberGuardAspectEqualNumberGuardAspectContext INSTANCE = new EqualNumberGuardAspectEqualNumberGuardAspectContext();
  
  public static EqualNumberGuardAspectEqualNumberGuardAspectProperties getSelf(final EqualNumberGuard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.EqualNumberGuardAspectEqualNumberGuardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<EqualNumberGuard, EqualNumberGuardAspectEqualNumberGuardAspectProperties> map = new java.util.WeakHashMap<ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.EqualNumberGuard, ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.EqualNumberGuardAspectEqualNumberGuardAspectProperties>();
  
  public Map<EqualNumberGuard, EqualNumberGuardAspectEqualNumberGuardAspectProperties> getMap() {
    return map;
  }
}
