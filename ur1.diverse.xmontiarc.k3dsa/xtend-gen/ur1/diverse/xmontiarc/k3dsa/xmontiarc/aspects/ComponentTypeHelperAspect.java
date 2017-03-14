package ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ComponentTypeHelperAspectComponentTypeAspectProperties;
import xmontiarc.ComponentType;
import xmontiarc.Port;
import xmontiarc.Subcomponent;

@Aspect(className = ComponentType.class)
@SuppressWarnings("all")
public class ComponentTypeHelperAspect {
  public static Subcomponent findOwnerOf(final ComponentType _self, final Port p) {
    final ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ComponentTypeHelperAspectComponentTypeAspectProperties _self_ = ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ComponentTypeHelperAspectComponentTypeAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_findOwnerOf(_self_, _self,p);;
    return (xmontiarc.Subcomponent)result;
  }
  
  public static EList<Port> getOutgoingPortsOfSubcomponents(final ComponentType _self) {
    final ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ComponentTypeHelperAspectComponentTypeAspectProperties _self_ = ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ComponentTypeHelperAspectComponentTypeAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getOutgoingPortsOfSubcomponents(_self_, _self);;
    return (org.eclipse.emf.common.util.EList<xmontiarc.Port>)result;
  }
  
  public static EList<Port> getIncomingPortsOfSubcomponents(final ComponentType _self) {
    final ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ComponentTypeHelperAspectComponentTypeAspectProperties _self_ = ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ComponentTypeHelperAspectComponentTypeAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getIncomingPortsOfSubcomponents(_self_, _self);;
    return (org.eclipse.emf.common.util.EList<xmontiarc.Port>)result;
  }
  
  public static EList<Port> getDirectedPortsOfSubcomponents(final ComponentType _self, final boolean collectIncoming) {
    final ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ComponentTypeHelperAspectComponentTypeAspectProperties _self_ = ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ComponentTypeHelperAspectComponentTypeAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getDirectedPortsOfSubcomponents(_self_, _self,collectIncoming);;
    return (org.eclipse.emf.common.util.EList<xmontiarc.Port>)result;
  }
  
  public static EList<Port> getIncomingPorts(final ComponentType _self) {
    final ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ComponentTypeHelperAspectComponentTypeAspectProperties _self_ = ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ComponentTypeHelperAspectComponentTypeAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getIncomingPorts(_self_, _self);;
    return (org.eclipse.emf.common.util.EList<xmontiarc.Port>)result;
  }
  
  public static EList<Port> getOutgoingPorts(final ComponentType _self) {
    final ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ComponentTypeHelperAspectComponentTypeAspectProperties _self_ = ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ComponentTypeHelperAspectComponentTypeAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getOutgoingPorts(_self_, _self);;
    return (org.eclipse.emf.common.util.EList<xmontiarc.Port>)result;
  }
  
  public static EList<Port> getDirectedPorts(final ComponentType _self, final boolean collectIncomingPorts) {
    final ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ComponentTypeHelperAspectComponentTypeAspectProperties _self_ = ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ComponentTypeHelperAspectComponentTypeAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getDirectedPorts(_self_, _self,collectIncomingPorts);;
    return (org.eclipse.emf.common.util.EList<xmontiarc.Port>)result;
  }
  
  protected static Subcomponent _privk3_findOwnerOf(final ComponentTypeHelperAspectComponentTypeAspectProperties _self_, final ComponentType _self, final Port p) {
    EList<Subcomponent> _subcomponents = _self.getSubcomponents();
    for (final Subcomponent sc : _subcomponents) {
      EList<Port> _ports = sc.getPorts();
      for (final Port scp : _ports) {
        boolean _equals = scp.equals(p);
        if (_equals) {
          return sc;
        }
      }
    }
    return null;
  }
  
  protected static EList<Port> _privk3_getOutgoingPortsOfSubcomponents(final ComponentTypeHelperAspectComponentTypeAspectProperties _self_, final ComponentType _self) {
    return ComponentTypeHelperAspect.getDirectedPortsOfSubcomponents(_self, false);
  }
  
  protected static EList<Port> _privk3_getIncomingPortsOfSubcomponents(final ComponentTypeHelperAspectComponentTypeAspectProperties _self_, final ComponentType _self) {
    return ComponentTypeHelperAspect.getDirectedPortsOfSubcomponents(_self, true);
  }
  
  protected static EList<Port> _privk3_getDirectedPortsOfSubcomponents(final ComponentTypeHelperAspectComponentTypeAspectProperties _self_, final ComponentType _self, final boolean collectIncoming) {
    EList<Port> incomingPorts = new BasicEList<Port>();
    EList<Subcomponent> _subcomponents = _self.getSubcomponents();
    for (final Subcomponent sc : _subcomponents) {
      EList<Port> _ports = sc.getPorts();
      for (final Port p : _ports) {
        boolean _isIncoming = p.isIncoming();
        boolean _equals = (_isIncoming == collectIncoming);
        if (_equals) {
          incomingPorts.add(p);
        }
      }
    }
    return incomingPorts;
  }
  
  protected static EList<Port> _privk3_getIncomingPorts(final ComponentTypeHelperAspectComponentTypeAspectProperties _self_, final ComponentType _self) {
    return ComponentTypeHelperAspect.getDirectedPorts(_self, true);
  }
  
  protected static EList<Port> _privk3_getOutgoingPorts(final ComponentTypeHelperAspectComponentTypeAspectProperties _self_, final ComponentType _self) {
    return ComponentTypeHelperAspect.getDirectedPorts(_self, false);
  }
  
  protected static EList<Port> _privk3_getDirectedPorts(final ComponentTypeHelperAspectComponentTypeAspectProperties _self_, final ComponentType _self, final boolean collectIncomingPorts) {
    final EList<Port> ports = new BasicEList<Port>();
    EList<Port> _ports = _self.getPorts();
    for (final Port p : _ports) {
      boolean _isIncoming = p.isIncoming();
      boolean _equals = (_isIncoming == collectIncomingPorts);
      if (_equals) {
        ports.add(p);
      }
    }
    return ports;
  }
}
