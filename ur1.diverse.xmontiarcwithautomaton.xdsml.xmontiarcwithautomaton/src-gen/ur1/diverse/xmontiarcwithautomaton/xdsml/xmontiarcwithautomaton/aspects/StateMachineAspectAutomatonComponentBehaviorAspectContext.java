package ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects;

import java.util.Map;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.AutomatonComponentBehavior;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StateMachineAspectAutomatonComponentBehaviorAspectProperties;

@SuppressWarnings("all")
public class StateMachineAspectAutomatonComponentBehaviorAspectContext {
  public final static StateMachineAspectAutomatonComponentBehaviorAspectContext INSTANCE = new StateMachineAspectAutomatonComponentBehaviorAspectContext();
  
  public static StateMachineAspectAutomatonComponentBehaviorAspectProperties getSelf(final AutomatonComponentBehavior _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StateMachineAspectAutomatonComponentBehaviorAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<AutomatonComponentBehavior, StateMachineAspectAutomatonComponentBehaviorAspectProperties> map = new java.util.WeakHashMap<ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.AutomatonComponentBehavior, ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StateMachineAspectAutomatonComponentBehaviorAspectProperties>();
  
  public Map<AutomatonComponentBehavior, StateMachineAspectAutomatonComponentBehaviorAspectProperties> getMap() {
    return map;
  }
}
