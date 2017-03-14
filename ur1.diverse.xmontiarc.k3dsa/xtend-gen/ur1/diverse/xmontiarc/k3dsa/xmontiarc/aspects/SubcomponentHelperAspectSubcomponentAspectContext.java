package ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects;

import java.util.Map;
import ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.SubcomponentHelperAspectSubcomponentAspectProperties;
import xmontiarc.Subcomponent;

@SuppressWarnings("all")
public class SubcomponentHelperAspectSubcomponentAspectContext {
  public final static SubcomponentHelperAspectSubcomponentAspectContext INSTANCE = new SubcomponentHelperAspectSubcomponentAspectContext();
  
  public static SubcomponentHelperAspectSubcomponentAspectProperties getSelf(final Subcomponent _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.SubcomponentHelperAspectSubcomponentAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Subcomponent, SubcomponentHelperAspectSubcomponentAspectProperties> map = new java.util.WeakHashMap<xmontiarc.Subcomponent, ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.SubcomponentHelperAspectSubcomponentAspectProperties>();
  
  public Map<Subcomponent, SubcomponentHelperAspectSubcomponentAspectProperties> getMap() {
    return map;
  }
}
