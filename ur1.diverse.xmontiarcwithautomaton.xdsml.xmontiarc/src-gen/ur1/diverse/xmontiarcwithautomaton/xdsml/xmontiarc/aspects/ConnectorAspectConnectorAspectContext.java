package ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.aspects;

import java.util.Map;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.aspects.ConnectorAspectConnectorAspectProperties;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.xmontiarc.Connector;

@SuppressWarnings("all")
public class ConnectorAspectConnectorAspectContext {
  public final static ConnectorAspectConnectorAspectContext INSTANCE = new ConnectorAspectConnectorAspectContext();
  
  public static ConnectorAspectConnectorAspectProperties getSelf(final Connector _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.aspects.ConnectorAspectConnectorAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Connector, ConnectorAspectConnectorAspectProperties> map = new java.util.WeakHashMap<ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.xmontiarc.Connector, ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.aspects.ConnectorAspectConnectorAspectProperties>();
  
  public Map<Connector, ConnectorAspectConnectorAspectProperties> getMap() {
    return map;
  }
}
