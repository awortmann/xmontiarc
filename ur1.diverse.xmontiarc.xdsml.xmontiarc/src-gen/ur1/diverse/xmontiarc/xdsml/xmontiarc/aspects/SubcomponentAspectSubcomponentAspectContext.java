package ur1.diverse.xmontiarc.xdsml.xmontiarc.aspects;

import java.util.Map;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.aspects.SubcomponentAspectSubcomponentAspectProperties;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.Subcomponent;

@SuppressWarnings("all")
public class SubcomponentAspectSubcomponentAspectContext {
  public final static SubcomponentAspectSubcomponentAspectContext INSTANCE = new SubcomponentAspectSubcomponentAspectContext();
  
  public static SubcomponentAspectSubcomponentAspectProperties getSelf(final Subcomponent _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ur1.diverse.xmontiarc.xdsml.xmontiarc.aspects.SubcomponentAspectSubcomponentAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Subcomponent, SubcomponentAspectSubcomponentAspectProperties> map = new java.util.WeakHashMap<ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.Subcomponent, ur1.diverse.xmontiarc.xdsml.xmontiarc.aspects.SubcomponentAspectSubcomponentAspectProperties>();
  
  public Map<Subcomponent, SubcomponentAspectSubcomponentAspectProperties> getMap() {
    return map;
  }
}
