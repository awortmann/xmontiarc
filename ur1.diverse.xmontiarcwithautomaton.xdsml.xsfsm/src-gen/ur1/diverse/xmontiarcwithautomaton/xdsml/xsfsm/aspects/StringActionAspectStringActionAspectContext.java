package ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects;

import java.util.Map;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.StringAction;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.StringActionAspectStringActionAspectProperties;

@SuppressWarnings("all")
public class StringActionAspectStringActionAspectContext {
  public final static StringActionAspectStringActionAspectContext INSTANCE = new StringActionAspectStringActionAspectContext();
  
  public static StringActionAspectStringActionAspectProperties getSelf(final StringAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.StringActionAspectStringActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StringAction, StringActionAspectStringActionAspectProperties> map = new java.util.WeakHashMap<ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.StringAction, ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.StringActionAspectStringActionAspectProperties>();
  
  public Map<StringAction, StringActionAspectStringActionAspectProperties> getMap() {
    return map;
  }
}
