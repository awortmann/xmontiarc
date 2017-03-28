package ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects;

import java.util.Map;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.StringVariable;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.StringVariableAspectStringVariableAspectProperties;

@SuppressWarnings("all")
public class StringVariableAspectStringVariableAspectContext {
  public final static StringVariableAspectStringVariableAspectContext INSTANCE = new StringVariableAspectStringVariableAspectContext();
  
  public static StringVariableAspectStringVariableAspectProperties getSelf(final StringVariable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.StringVariableAspectStringVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StringVariable, StringVariableAspectStringVariableAspectProperties> map = new java.util.WeakHashMap<ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.StringVariable, ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.StringVariableAspectStringVariableAspectProperties>();
  
  public Map<StringVariable, StringVariableAspectStringVariableAspectProperties> getMap() {
    return map;
  }
}
