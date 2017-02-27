package ur1.diverse.montiarc.xdsml.montiarc.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import montiarc.IncomingConnectorType;
import ur1.diverse.montiarc.xdsml.montiarc.aspects.IncomingConnectorTypeAspectIncomingConnectorTypeAspectProperties;

@Aspect(className = IncomingConnectorType.class)
@SuppressWarnings("all")
public class IncomingConnectorTypeAspect {
  public static void update(final IncomingConnectorType _self) {
    final ur1.diverse.montiarc.xdsml.montiarc.aspects.IncomingConnectorTypeAspectIncomingConnectorTypeAspectProperties _self_ = ur1.diverse.montiarc.xdsml.montiarc.aspects.IncomingConnectorTypeAspectIncomingConnectorTypeAspectContext.getSelf(_self);
    _privk3_update(_self_, _self);;
  }
  
  protected static void _privk3_update(final IncomingConnectorTypeAspectIncomingConnectorTypeAspectProperties _self_, final IncomingConnectorType _self) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method portValue(Object) is undefined for the type PortInstance"
      + "\nThe method or field sourcePort is undefined for the type IncomingConnectorType"
      + "\nThe method portValue(Object) is undefined for the type PortInstance"
      + "\nportValue cannot be resolved");
  }
}
