package ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects;

import java.util.Map;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.BooleanAction;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.BooleanActionAspectBooleanActionAspectProperties;

@SuppressWarnings("all")
public class BooleanActionAspectBooleanActionAspectContext {
  public final static BooleanActionAspectBooleanActionAspectContext INSTANCE = new BooleanActionAspectBooleanActionAspectContext();
  
  public static BooleanActionAspectBooleanActionAspectProperties getSelf(final BooleanAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.BooleanActionAspectBooleanActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanAction, BooleanActionAspectBooleanActionAspectProperties> map = new java.util.WeakHashMap<ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.BooleanAction, ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.BooleanActionAspectBooleanActionAspectProperties>();
  
  public Map<BooleanAction, BooleanActionAspectBooleanActionAspectProperties> getMap() {
    return map;
  }
}
