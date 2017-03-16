package ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.ecore.EObject;
import ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ComponentTypeAspect;
import ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ConnectorAspectConnectorAspectProperties;
import ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.PortAspect;
import xmontiarc.ComponentType;
import xmontiarc.Connector;
import xmontiarc.IncomingConnector;
import xmontiarc.IncomingPort;
import xmontiarc.IntermediateConnector;
import xmontiarc.OutgoingConnector;
import xmontiarc.OutgoingPort;
import xmontiarc.Port;
import xmontiarc.Subcomponent;

@Aspect(className = Connector.class)
@SuppressWarnings("all")
public class ConnectorAspect {
  public static void update(final Connector _self) {
	final ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ConnectorAspectConnectorAspectProperties _self_ = ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ConnectorAspectConnectorAspectContext
			.getSelf(_self);
	_privk3_update(_self_, _self);
	;
}
  
  public static Port getSource(final Connector _self) {
	final ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ConnectorAspectConnectorAspectProperties _self_ = ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ConnectorAspectConnectorAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_getSource(_self_, _self);
	;
	return (xmontiarc.Port) result;
}
  
  public static Port getTarget(final Connector _self) {
	final ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ConnectorAspectConnectorAspectProperties _self_ = ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ConnectorAspectConnectorAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_getTarget(_self_, _self);
	;
	return (xmontiarc.Port) result;
}
  
  public static String getSourceRepresentation(final Connector _self) {
	final ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ConnectorAspectConnectorAspectProperties _self_ = ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ConnectorAspectConnectorAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_getSourceRepresentation(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  public static String getTargetRepresentation(final Connector _self) {
	final ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ConnectorAspectConnectorAspectProperties _self_ = ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ConnectorAspectConnectorAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_getTargetRepresentation(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  public static String getRepresentation(final Connector _self) {
	final ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ConnectorAspectConnectorAspectProperties _self_ = ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ConnectorAspectConnectorAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_getRepresentation(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  protected static void _privk3_update(final ConnectorAspectConnectorAspectProperties _self_, final Connector _self) {
    if ((_self instanceof IntermediateConnector)) {
      final IntermediateConnector c = ((IntermediateConnector) _self);
      IncomingPort _target = c.getTarget();
      OutgoingPort _source = c.getSource();
      EObject _value = PortAspect.value(_source);
      PortAspect.value(_target, _value);
      OutgoingPort _source_1 = c.getSource();
      PortAspect.value(_source_1, null);
    } else {
      if ((_self instanceof IncomingConnector)) {
        final IncomingConnector c_1 = ((IncomingConnector) _self);
        IncomingPort _target_1 = c_1.getTarget();
        IncomingPort _source_2 = c_1.getSource();
        EObject _value_1 = PortAspect.value(_source_2);
        PortAspect.value(_target_1, _value_1);
        IncomingPort _source_3 = c_1.getSource();
        PortAspect.value(_source_3, null);
      } else {
        if ((_self instanceof OutgoingConnector)) {
          final OutgoingConnector c_2 = ((OutgoingConnector) _self);
          OutgoingPort _target_2 = c_2.getTarget();
          OutgoingPort _source_4 = c_2.getSource();
          EObject _value_2 = PortAspect.value(_source_4);
          PortAspect.value(_target_2, _value_2);
          OutgoingPort _source_5 = c_2.getSource();
          PortAspect.value(_source_5, null);
        } else {
          throw new Error("Trying to pass a message over instance of abstract connector class");
        }
      }
    }
  }
  
  protected static Port _privk3_getSource(final ConnectorAspectConnectorAspectProperties _self_, final Connector _self) {
    Port source = null;
    if ((_self instanceof IntermediateConnector)) {
      final IntermediateConnector c = ((IntermediateConnector) _self);
      OutgoingPort _source = c.getSource();
      source = _source;
    } else {
      if ((_self instanceof IncomingConnector)) {
        final IncomingConnector c_1 = ((IncomingConnector) _self);
        IncomingPort _source_1 = c_1.getSource();
        source = _source_1;
      } else {
        if ((_self instanceof OutgoingConnector)) {
          final OutgoingConnector c_2 = ((OutgoingConnector) _self);
          OutgoingPort _source_2 = c_2.getSource();
          source = _source_2;
        } else {
          throw new Error("Found instance of abstract class Connector.");
        }
      }
    }
    return source;
  }
  
  protected static Port _privk3_getTarget(final ConnectorAspectConnectorAspectProperties _self_, final Connector _self) {
    Port target = null;
    if ((_self instanceof IntermediateConnector)) {
      final IntermediateConnector c = ((IntermediateConnector) _self);
      IncomingPort _target = c.getTarget();
      target = _target;
    } else {
      if ((_self instanceof IncomingConnector)) {
        final IncomingConnector c_1 = ((IncomingConnector) _self);
        IncomingPort _target_1 = c_1.getTarget();
        target = _target_1;
      } else {
        if ((_self instanceof OutgoingConnector)) {
          final OutgoingConnector c_2 = ((OutgoingConnector) _self);
          OutgoingPort _target_2 = c_2.getTarget();
          target = _target_2;
        } else {
          throw new Error("Found instance of abstract class Connector.");
        }
      }
    }
    return target;
  }
  
  protected static String _privk3_getSourceRepresentation(final ConnectorAspectConnectorAspectProperties _self_, final Connector _self) {
    ComponentType _parent = _self.getParent();
    boolean _notEquals = (!Objects.equal(_parent, null));
    if (_notEquals) {
      ComponentType _parent_1 = _self.getParent();
      Port _source = ConnectorAspect.getSource(_self);
      Subcomponent sc = ComponentTypeAspect.findOwnerOf(_parent_1, _source);
      boolean _notEquals_1 = (!Objects.equal(sc, null));
      if (_notEquals_1) {
        String _name = sc.getName();
        String _plus = (_name + ".");
        Port _source_1 = ConnectorAspect.getSource(_self);
        String _name_1 = _source_1.getName();
        return (_plus + _name_1);
      }
    }
    return "N/A";
  }
  
  protected static String _privk3_getTargetRepresentation(final ConnectorAspectConnectorAspectProperties _self_, final Connector _self) {
    ComponentType _parent = _self.getParent();
    boolean _notEquals = (!Objects.equal(_parent, null));
    if (_notEquals) {
      ComponentType _parent_1 = _self.getParent();
      Port _target = ConnectorAspect.getTarget(_self);
      final Subcomponent sc = ComponentTypeAspect.findOwnerOf(_parent_1, _target);
      boolean _notEquals_1 = (!Objects.equal(sc, null));
      if (_notEquals_1) {
        String _name = sc.getName();
        String _plus = (_name + ".");
        Port _target_1 = ConnectorAspect.getTarget(_self);
        String _name_1 = _target_1.getName();
        return (_plus + _name_1);
      }
    }
    return "N/A";
  }
  
  protected static String _privk3_getRepresentation(final ConnectorAspectConnectorAspectProperties _self_, final Connector _self) {
    String _sourceRepresentation = ConnectorAspect.getSourceRepresentation(_self);
    String _plus = (_sourceRepresentation + " -> ");
    String _targetRepresentation = ConnectorAspect.getTargetRepresentation(_self);
    return (_plus + _targetRepresentation);
  }
}
