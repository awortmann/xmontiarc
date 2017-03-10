package ur1.diverse.montiarc.xdsml.xmontiarc.aspects;

import java.util.Map;
import ur1.diverse.montiarc.xdsml.xmontiarc.montiarc.Connector;
import ur1.diverse.montiarc.xdsml.xmontiarc.aspects.ConnectorAspectConnectorAspectProperties;

@SuppressWarnings("all")
public class ConnectorAspectConnectorAspectContext {
  public final static ConnectorAspectConnectorAspectContext INSTANCE = new ConnectorAspectConnectorAspectContext();
  
  public static ConnectorAspectConnectorAspectProperties getSelf(final Connector _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ur1.diverse.montiarc.xdsml.xmontiarc.aspects.ConnectorAspectConnectorAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Connector, ConnectorAspectConnectorAspectProperties> map = new java.util.WeakHashMap<ur1.diverse.montiarc.xdsml.xmontiarc.montiarc.Connector, ur1.diverse.montiarc.xdsml.xmontiarc.aspects.ConnectorAspectConnectorAspectProperties>();
  
  public Map<Connector, ConnectorAspectConnectorAspectProperties> getMap() {
    return map;
  }
}
