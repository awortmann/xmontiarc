package ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects;

import java.util.Map;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.SubcomponentAspectSubcomponentAspectProperties;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.Subcomponent;

@SuppressWarnings("all")
public class SubcomponentAspectSubcomponentAspectContext {
  public final static SubcomponentAspectSubcomponentAspectContext INSTANCE = new SubcomponentAspectSubcomponentAspectContext();
  
  public static SubcomponentAspectSubcomponentAspectProperties getSelf(final Subcomponent _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.SubcomponentAspectSubcomponentAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Subcomponent, SubcomponentAspectSubcomponentAspectProperties> map = new java.util.WeakHashMap<ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.Subcomponent, ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.SubcomponentAspectSubcomponentAspectProperties>();
  
  public Map<Subcomponent, SubcomponentAspectSubcomponentAspectProperties> getMap() {
    return map;
  }
}