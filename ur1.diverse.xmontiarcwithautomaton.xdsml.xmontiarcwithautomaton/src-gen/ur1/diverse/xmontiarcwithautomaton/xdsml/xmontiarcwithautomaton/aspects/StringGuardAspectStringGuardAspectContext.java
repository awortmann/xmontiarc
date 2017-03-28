package ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects;

import java.util.Map;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.StringGuard;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StringGuardAspectStringGuardAspectProperties;

@SuppressWarnings("all")
public class StringGuardAspectStringGuardAspectContext {
  public final static StringGuardAspectStringGuardAspectContext INSTANCE = new StringGuardAspectStringGuardAspectContext();
  
  public static StringGuardAspectStringGuardAspectProperties getSelf(final StringGuard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StringGuardAspectStringGuardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StringGuard, StringGuardAspectStringGuardAspectProperties> map = new java.util.WeakHashMap<ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.StringGuard, ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StringGuardAspectStringGuardAspectProperties>();
  
  public Map<StringGuard, StringGuardAspectStringGuardAspectProperties> getMap() {
    return map;
  }
}
