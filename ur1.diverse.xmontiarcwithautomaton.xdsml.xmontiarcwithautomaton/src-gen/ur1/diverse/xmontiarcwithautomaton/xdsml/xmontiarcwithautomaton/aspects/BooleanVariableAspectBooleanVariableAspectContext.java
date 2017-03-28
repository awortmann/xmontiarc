package ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects;

import java.util.Map;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.BooleanVariable;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.BooleanVariableAspectBooleanVariableAspectProperties;

@SuppressWarnings("all")
public class BooleanVariableAspectBooleanVariableAspectContext {
  public final static BooleanVariableAspectBooleanVariableAspectContext INSTANCE = new BooleanVariableAspectBooleanVariableAspectContext();
  
  public static BooleanVariableAspectBooleanVariableAspectProperties getSelf(final BooleanVariable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.BooleanVariableAspectBooleanVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanVariable, BooleanVariableAspectBooleanVariableAspectProperties> map = new java.util.WeakHashMap<ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.BooleanVariable, ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.BooleanVariableAspectBooleanVariableAspectProperties>();
  
  public Map<BooleanVariable, BooleanVariableAspectBooleanVariableAspectProperties> getMap() {
    return map;
  }
}
