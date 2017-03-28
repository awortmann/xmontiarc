package ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects;

import java.util.Map;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.NumberVariable;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.NumberVariableAspectNumberVariableAspectProperties;

@SuppressWarnings("all")
public class NumberVariableAspectNumberVariableAspectContext {
  public final static NumberVariableAspectNumberVariableAspectContext INSTANCE = new NumberVariableAspectNumberVariableAspectContext();
  
  public static NumberVariableAspectNumberVariableAspectProperties getSelf(final NumberVariable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.NumberVariableAspectNumberVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<NumberVariable, NumberVariableAspectNumberVariableAspectProperties> map = new java.util.WeakHashMap<ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.NumberVariable, ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.NumberVariableAspectNumberVariableAspectProperties>();
  
  public Map<NumberVariable, NumberVariableAspectNumberVariableAspectProperties> getMap() {
    return map;
  }
}
