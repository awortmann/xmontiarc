package ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ConnectorAspectConnectorAspectProperties;
import xmontiarc.Connector;
import xmontiarc.Port;

@Aspect(className = Connector.class)
@SuppressWarnings("all")
public class ConnectorAspect {
  public static void update(final Connector _self) {
    final ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ConnectorAspectConnectorAspectProperties _self_ = ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ConnectorAspectConnectorAspectContext.getSelf(_self);
    _privk3_update(_self_, _self);;
  }
  
  protected static void _privk3_update(final ConnectorAspectConnectorAspectProperties _self_, final Connector _self) {
    Port _target = _self.getTarget();
    Port _source = _self.getSource();
    String _value = _source.getValue();
    _target.setValue(_value);
    Port _target_1 = _self.getTarget();
    _target_1.setValue(null);
  }
}
