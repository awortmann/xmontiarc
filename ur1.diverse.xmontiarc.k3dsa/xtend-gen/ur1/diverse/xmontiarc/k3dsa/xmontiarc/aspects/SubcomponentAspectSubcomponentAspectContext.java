package ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects;

import java.util.Map;
import ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.SubcomponentAspectSubcomponentAspectProperties;
import xmontiarc.Subcomponent;

@SuppressWarnings("all")
public class SubcomponentAspectSubcomponentAspectContext {
  public final static SubcomponentAspectSubcomponentAspectContext INSTANCE = new SubcomponentAspectSubcomponentAspectContext();
  
  public static SubcomponentAspectSubcomponentAspectProperties getSelf(final Subcomponent _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.SubcomponentAspectSubcomponentAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Subcomponent, SubcomponentAspectSubcomponentAspectProperties> map = new java.util.WeakHashMap<xmontiarc.Subcomponent, ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.SubcomponentAspectSubcomponentAspectProperties>();
  
  public Map<Subcomponent, SubcomponentAspectSubcomponentAspectProperties> getMap() {
    return map;
  }
}
