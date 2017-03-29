package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects;

import java.util.Map;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.ConnectorAspectConnectorAspectProperties;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.Connector;

@SuppressWarnings("all")
public class ConnectorAspectConnectorAspectContext {
  public final static ConnectorAspectConnectorAspectContext INSTANCE = new ConnectorAspectConnectorAspectContext();
  
  public static ConnectorAspectConnectorAspectProperties getSelf(final Connector _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.ConnectorAspectConnectorAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Connector, ConnectorAspectConnectorAspectProperties> map = new java.util.WeakHashMap<org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.Connector, org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.ConnectorAspectConnectorAspectProperties>();
  
  public Map<Connector, ConnectorAspectConnectorAspectProperties> getMap() {
    return map;
  }
}
