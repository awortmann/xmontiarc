package org.gemoc.xmontiarc.xdsml.xmontiarc.aspects;

import java.util.Map;
import org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.ConnectorAspectConnectorAspectProperties;
import org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.Connector;

@SuppressWarnings("all")
public class ConnectorAspectConnectorAspectContext {
  public final static ConnectorAspectConnectorAspectContext INSTANCE = new ConnectorAspectConnectorAspectContext();
  
  public static ConnectorAspectConnectorAspectProperties getSelf(final Connector _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.ConnectorAspectConnectorAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Connector, ConnectorAspectConnectorAspectProperties> map = new java.util.WeakHashMap<org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.Connector, org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.ConnectorAspectConnectorAspectProperties>();
  
  public Map<Connector, ConnectorAspectConnectorAspectProperties> getMap() {
    return map;
  }
}
