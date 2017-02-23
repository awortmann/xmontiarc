package ur1.diverse.montiarc.xdsml.xmontiarc.aspects;

import java.util.Map;
import ur1.diverse.montiarc.xdsml.xmontiarc.montiarc.SubcomponentDeclaration;
import ur1.diverse.montiarc.xdsml.xmontiarc.aspects.SubcomponentDeclarationAspectSubcomponentDeclarationAspectProperties;

@SuppressWarnings("all")
public class SubcomponentDeclarationAspectSubcomponentDeclarationAspectContext {
  public final static SubcomponentDeclarationAspectSubcomponentDeclarationAspectContext INSTANCE = new SubcomponentDeclarationAspectSubcomponentDeclarationAspectContext();
  
  public static SubcomponentDeclarationAspectSubcomponentDeclarationAspectProperties getSelf(final SubcomponentDeclaration _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ur1.diverse.montiarc.xdsml.xmontiarc.aspects.SubcomponentDeclarationAspectSubcomponentDeclarationAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<SubcomponentDeclaration, SubcomponentDeclarationAspectSubcomponentDeclarationAspectProperties> map = new java.util.WeakHashMap<ur1.diverse.montiarc.xdsml.xmontiarc.montiarc.SubcomponentDeclaration, ur1.diverse.montiarc.xdsml.xmontiarc.aspects.SubcomponentDeclarationAspectSubcomponentDeclarationAspectProperties>();
  
  public Map<SubcomponentDeclaration, SubcomponentDeclarationAspectSubcomponentDeclarationAspectProperties> getMap() {
    return map;
  }
}
