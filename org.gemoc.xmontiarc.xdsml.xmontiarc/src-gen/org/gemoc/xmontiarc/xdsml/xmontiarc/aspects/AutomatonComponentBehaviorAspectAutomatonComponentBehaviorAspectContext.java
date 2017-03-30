package org.gemoc.xmontiarc.xdsml.xmontiarc.aspects;

import java.util.Map;
import org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectProperties;
import org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.AutomatonComponentBehavior;

@SuppressWarnings("all")
public class AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectContext {
  public final static AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectContext INSTANCE = new AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectContext();
  
  public static AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectProperties getSelf(final AutomatonComponentBehavior _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<AutomatonComponentBehavior, AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectProperties> map = new java.util.WeakHashMap<org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.AutomatonComponentBehavior, org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectProperties>();
  
  public Map<AutomatonComponentBehavior, AutomatonComponentBehaviorAspectAutomatonComponentBehaviorAspectProperties> getMap() {
    return map;
  }
}
