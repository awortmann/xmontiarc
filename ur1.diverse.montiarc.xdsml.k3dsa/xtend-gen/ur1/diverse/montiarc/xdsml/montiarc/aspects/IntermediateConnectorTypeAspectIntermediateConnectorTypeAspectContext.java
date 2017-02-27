package ur1.diverse.montiarc.xdsml.montiarc.aspects;

import java.util.Map;
import montiarc.IntermediateConnectorType;
import ur1.diverse.montiarc.xdsml.montiarc.aspects.IntermediateConnectorTypeAspectIntermediateConnectorTypeAspectProperties;

@SuppressWarnings("all")
public class IntermediateConnectorTypeAspectIntermediateConnectorTypeAspectContext {
  public final static IntermediateConnectorTypeAspectIntermediateConnectorTypeAspectContext INSTANCE = new IntermediateConnectorTypeAspectIntermediateConnectorTypeAspectContext();
  
  public static IntermediateConnectorTypeAspectIntermediateConnectorTypeAspectProperties getSelf(final IntermediateConnectorType _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ur1.diverse.montiarc.xdsml.montiarc.aspects.IntermediateConnectorTypeAspectIntermediateConnectorTypeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntermediateConnectorType, IntermediateConnectorTypeAspectIntermediateConnectorTypeAspectProperties> map = new java.util.WeakHashMap<montiarc.IntermediateConnectorType, ur1.diverse.montiarc.xdsml.montiarc.aspects.IntermediateConnectorTypeAspectIntermediateConnectorTypeAspectProperties>();
  
  public Map<IntermediateConnectorType, IntermediateConnectorTypeAspectIntermediateConnectorTypeAspectProperties> getMap() {
    return map;
  }
}
