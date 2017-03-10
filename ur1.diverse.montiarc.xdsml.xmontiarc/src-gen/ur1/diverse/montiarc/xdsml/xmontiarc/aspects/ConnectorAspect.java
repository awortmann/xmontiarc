package ur1.diverse.montiarc.xdsml.xmontiarc.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import ur1.diverse.montiarc.xdsml.xmontiarc.montiarc.Connector;
import ur1.diverse.montiarc.xdsml.xmontiarc.montiarc.Port;
import ur1.diverse.montiarc.xdsml.xmontiarc.montiarcruntime.PortValue;
import ur1.diverse.montiarc.xdsml.xmontiarc.aspects.ConnectorAspectConnectorAspectProperties;
import ur1.diverse.montiarc.xdsml.xmontiarc.aspects.PortAspect;

@Aspect(className = Connector.class)
@SuppressWarnings("all")
public class ConnectorAspect {
  public static void update(final Connector _self) {
	final ur1.diverse.montiarc.xdsml.xmontiarc.aspects.ConnectorAspectConnectorAspectProperties _self_ = ur1.diverse.montiarc.xdsml.xmontiarc.aspects.ConnectorAspectConnectorAspectContext
			.getSelf(_self);
	_privk3_update(_self_, _self);
	;
}
  
  protected static void _privk3_update(final ConnectorAspectConnectorAspectProperties _self_, final Connector _self) {
    Port _targetPort = _self.getTargetPort();
    Port _sourcePort = _self.getSourcePort();
    PortValue _portValue = PortAspect.portValue(_sourcePort);
    PortAspect.portValue(_targetPort, _portValue);
    Port _targetPort_1 = _self.getTargetPort();
    PortAspect.portValue(_targetPort_1, null);
  }
}
