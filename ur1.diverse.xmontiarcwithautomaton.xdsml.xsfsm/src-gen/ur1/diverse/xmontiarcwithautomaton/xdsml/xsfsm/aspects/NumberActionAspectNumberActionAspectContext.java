package ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects;

import java.util.Map;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.NumberAction;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.NumberActionAspectNumberActionAspectProperties;

@SuppressWarnings("all")
public class NumberActionAspectNumberActionAspectContext {
  public final static NumberActionAspectNumberActionAspectContext INSTANCE = new NumberActionAspectNumberActionAspectContext();
  
  public static NumberActionAspectNumberActionAspectProperties getSelf(final NumberAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.NumberActionAspectNumberActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<NumberAction, NumberActionAspectNumberActionAspectProperties> map = new java.util.WeakHashMap<ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.NumberAction, ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.NumberActionAspectNumberActionAspectProperties>();
  
  public Map<NumberAction, NumberActionAspectNumberActionAspectProperties> getMap() {
    return map;
  }
}
