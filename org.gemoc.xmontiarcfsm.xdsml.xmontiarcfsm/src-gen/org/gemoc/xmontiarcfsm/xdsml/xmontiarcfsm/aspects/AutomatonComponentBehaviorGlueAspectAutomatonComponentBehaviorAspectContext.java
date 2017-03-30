package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects;

import java.util.Map;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.AutomatonComponentBehavior;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.AutomatonComponentBehaviorGlueAspectAutomatonComponentBehaviorAspectProperties;

@SuppressWarnings("all")
public class AutomatonComponentBehaviorGlueAspectAutomatonComponentBehaviorAspectContext {
  public final static AutomatonComponentBehaviorGlueAspectAutomatonComponentBehaviorAspectContext INSTANCE = new AutomatonComponentBehaviorGlueAspectAutomatonComponentBehaviorAspectContext();
  
  public static AutomatonComponentBehaviorGlueAspectAutomatonComponentBehaviorAspectProperties getSelf(final AutomatonComponentBehavior _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.AutomatonComponentBehaviorGlueAspectAutomatonComponentBehaviorAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<AutomatonComponentBehavior, AutomatonComponentBehaviorGlueAspectAutomatonComponentBehaviorAspectProperties> map = new java.util.WeakHashMap<org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.AutomatonComponentBehavior, org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.AutomatonComponentBehaviorGlueAspectAutomatonComponentBehaviorAspectProperties>();
  
  public Map<AutomatonComponentBehavior, AutomatonComponentBehaviorGlueAspectAutomatonComponentBehaviorAspectProperties> getMap() {
    return map;
  }
}
