package ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects;

import java.util.Map;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.Action;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.ActionAspectActionAspectProperties;

@SuppressWarnings("all")
public class ActionAspectActionAspectContext {
  public final static ActionAspectActionAspectContext INSTANCE = new ActionAspectActionAspectContext();
  
  public static ActionAspectActionAspectProperties getSelf(final Action _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.ActionAspectActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Action, ActionAspectActionAspectProperties> map = new java.util.WeakHashMap<ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.Action, ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.ActionAspectActionAspectProperties>();
  
  public Map<Action, ActionAspectActionAspectProperties> getMap() {
    return map;
  }
}
