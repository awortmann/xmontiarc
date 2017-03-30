package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects;

import java.util.Map;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectProperties;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.AutomatonComponentBehavior;

@SuppressWarnings("all")
public class AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectContext {
  public final static AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectContext INSTANCE = new AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectContext();
  
  public static AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectProperties getSelf(final AutomatonComponentBehavior _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<AutomatonComponentBehavior, AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectProperties> map = new java.util.WeakHashMap<org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.AutomatonComponentBehavior, org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectProperties>();
  
  public Map<AutomatonComponentBehavior, AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectProperties> getMap() {
    return map;
  }
}
