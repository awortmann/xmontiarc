package ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ComponentTypeHelperAspect;
import ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ConnectorHelperAspectConnectorAspectProperties;
import xmontiarc.ComponentType;
import xmontiarc.Connector;
import xmontiarc.Port;
import xmontiarc.Subcomponent;

@Aspect(className = Connector.class)
@SuppressWarnings("all")
public class ConnectorHelperAspect {
  public static String getSourceRepresentation(final Connector _self) {
    final ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ConnectorHelperAspectConnectorAspectProperties _self_ = ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ConnectorHelperAspectConnectorAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getSourceRepresentation(_self_, _self);;
    return (java.lang.String)result;
  }
  
  public static String getTargetRepresentation(final Connector _self) {
    final ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ConnectorHelperAspectConnectorAspectProperties _self_ = ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ConnectorHelperAspectConnectorAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getTargetRepresentation(_self_, _self);;
    return (java.lang.String)result;
  }
  
  public static String getRepresentation(final Connector _self) {
    final ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ConnectorHelperAspectConnectorAspectProperties _self_ = ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ConnectorHelperAspectConnectorAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getRepresentation(_self_, _self);;
    return (java.lang.String)result;
  }
  
  protected static String _privk3_getSourceRepresentation(final ConnectorHelperAspectConnectorAspectProperties _self_, final Connector _self) {
    ComponentType _parent = _self.getParent();
    boolean _notEquals = (!Objects.equal(_parent, null));
    if (_notEquals) {
      ComponentType _parent_1 = _self.getParent();
      Port _source = _self.getSource();
      Subcomponent sc = ComponentTypeHelperAspect.findOwnerOf(_parent_1, _source);
      boolean _notEquals_1 = (!Objects.equal(sc, null));
      if (_notEquals_1) {
        return sc.getName();
      }
    }
    return "N/A";
  }
  
  protected static String _privk3_getTargetRepresentation(final ConnectorHelperAspectConnectorAspectProperties _self_, final Connector _self) {
    ComponentType _parent = _self.getParent();
    boolean _notEquals = (!Objects.equal(_parent, null));
    if (_notEquals) {
      ComponentType _parent_1 = _self.getParent();
      Port _target = _self.getTarget();
      final Subcomponent sc = ComponentTypeHelperAspect.findOwnerOf(_parent_1, _target);
      boolean _notEquals_1 = (!Objects.equal(sc, null));
      if (_notEquals_1) {
        return sc.getName();
      }
    }
    return "N/A";
  }
  
  protected static String _privk3_getRepresentation(final ConnectorHelperAspectConnectorAspectProperties _self_, final Connector _self) {
    String _sourceRepresentation = ConnectorHelperAspect.getSourceRepresentation(_self);
    String _plus = (_sourceRepresentation + " -> ");
    String _targetRepresentation = ConnectorHelperAspect.getTargetRepresentation(_self);
    return (_plus + _targetRepresentation);
  }
}
