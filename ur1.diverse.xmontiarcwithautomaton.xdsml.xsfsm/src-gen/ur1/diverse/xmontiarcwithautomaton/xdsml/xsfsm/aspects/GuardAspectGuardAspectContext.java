package ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects;

import java.util.Map;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.Guard;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.GuardAspectGuardAspectProperties;

@SuppressWarnings("all")
public class GuardAspectGuardAspectContext {
  public final static GuardAspectGuardAspectContext INSTANCE = new GuardAspectGuardAspectContext();
  
  public static GuardAspectGuardAspectProperties getSelf(final Guard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.GuardAspectGuardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Guard, GuardAspectGuardAspectProperties> map = new java.util.WeakHashMap<ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.Guard, ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.GuardAspectGuardAspectProperties>();
  
  public Map<Guard, GuardAspectGuardAspectProperties> getMap() {
    return map;
  }
}
