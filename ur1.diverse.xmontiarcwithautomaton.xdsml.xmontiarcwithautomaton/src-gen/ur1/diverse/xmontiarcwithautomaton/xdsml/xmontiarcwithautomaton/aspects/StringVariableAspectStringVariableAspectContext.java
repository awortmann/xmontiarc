package ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects;

import java.util.Map;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.StringVariable;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StringVariableAspectStringVariableAspectProperties;

@SuppressWarnings("all")
public class StringVariableAspectStringVariableAspectContext {
  public final static StringVariableAspectStringVariableAspectContext INSTANCE = new StringVariableAspectStringVariableAspectContext();
  
  public static StringVariableAspectStringVariableAspectProperties getSelf(final StringVariable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StringVariableAspectStringVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StringVariable, StringVariableAspectStringVariableAspectProperties> map = new java.util.WeakHashMap<ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.StringVariable, ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StringVariableAspectStringVariableAspectProperties>();
  
  public Map<StringVariable, StringVariableAspectStringVariableAspectProperties> getMap() {
    return map;
  }
}
