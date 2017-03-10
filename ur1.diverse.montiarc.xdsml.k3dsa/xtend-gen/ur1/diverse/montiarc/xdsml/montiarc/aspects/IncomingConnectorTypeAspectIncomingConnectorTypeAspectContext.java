package ur1.diverse.montiarc.xdsml.montiarc.aspects;

import java.util.Map;
import montiarc.IncomingConnectorType;
import ur1.diverse.montiarc.xdsml.montiarc.aspects.IncomingConnectorTypeAspectIncomingConnectorTypeAspectProperties;

@SuppressWarnings("all")
public class IncomingConnectorTypeAspectIncomingConnectorTypeAspectContext {
  public final static IncomingConnectorTypeAspectIncomingConnectorTypeAspectContext INSTANCE = new IncomingConnectorTypeAspectIncomingConnectorTypeAspectContext();
  
  public static IncomingConnectorTypeAspectIncomingConnectorTypeAspectProperties getSelf(final IncomingConnectorType _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ur1.diverse.montiarc.xdsml.montiarc.aspects.IncomingConnectorTypeAspectIncomingConnectorTypeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IncomingConnectorType, IncomingConnectorTypeAspectIncomingConnectorTypeAspectProperties> map = new java.util.WeakHashMap<montiarc.IncomingConnectorType, ur1.diverse.montiarc.xdsml.montiarc.aspects.IncomingConnectorTypeAspectIncomingConnectorTypeAspectProperties>();
  
  public Map<IncomingConnectorType, IncomingConnectorTypeAspectIncomingConnectorTypeAspectProperties> getMap() {
    return map;
  }
}
