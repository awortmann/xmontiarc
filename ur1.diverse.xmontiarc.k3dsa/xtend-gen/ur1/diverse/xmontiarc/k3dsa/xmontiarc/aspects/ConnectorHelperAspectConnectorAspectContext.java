package ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects;

import java.util.Map;
import ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ConnectorHelperAspectConnectorAspectProperties;
import xmontiarc.Connector;

@SuppressWarnings("all")
public class ConnectorHelperAspectConnectorAspectContext {
  public final static ConnectorHelperAspectConnectorAspectContext INSTANCE = new ConnectorHelperAspectConnectorAspectContext();
  
  public static ConnectorHelperAspectConnectorAspectProperties getSelf(final Connector _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ConnectorHelperAspectConnectorAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Connector, ConnectorHelperAspectConnectorAspectProperties> map = new java.util.WeakHashMap<xmontiarc.Connector, ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ConnectorHelperAspectConnectorAspectProperties>();
  
  public Map<Connector, ConnectorHelperAspectConnectorAspectProperties> getMap() {
    return map;
  }
}
