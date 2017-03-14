package ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.SubcomponentHelperAspectSubcomponentAspectProperties;
import xmontiarc.Port;
import xmontiarc.Subcomponent;

@Aspect(className = Subcomponent.class)
@SuppressWarnings("all")
public class SubcomponentHelperAspect {
  public static EList<Port> getIncomingPorts(final Subcomponent _self) {
    final ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.SubcomponentHelperAspectSubcomponentAspectProperties _self_ = ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.SubcomponentHelperAspectSubcomponentAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getIncomingPorts(_self_, _self);;
    return (org.eclipse.emf.common.util.EList<xmontiarc.Port>)result;
  }
  
  public static EList<Port> getOutgoingPorts(final Subcomponent _self) {
    final ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.SubcomponentHelperAspectSubcomponentAspectProperties _self_ = ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.SubcomponentHelperAspectSubcomponentAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getOutgoingPorts(_self_, _self);;
    return (org.eclipse.emf.common.util.EList<xmontiarc.Port>)result;
  }
  
  public static EList<Port> getDirectedPorts(final Subcomponent _self, final boolean collectIncomingPorts) {
    final ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.SubcomponentHelperAspectSubcomponentAspectProperties _self_ = ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.SubcomponentHelperAspectSubcomponentAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getDirectedPorts(_self_, _self,collectIncomingPorts);;
    return (org.eclipse.emf.common.util.EList<xmontiarc.Port>)result;
  }
  
  protected static EList<Port> _privk3_getIncomingPorts(final SubcomponentHelperAspectSubcomponentAspectProperties _self_, final Subcomponent _self) {
    return SubcomponentHelperAspect.getDirectedPorts(_self, true);
  }
  
  protected static EList<Port> _privk3_getOutgoingPorts(final SubcomponentHelperAspectSubcomponentAspectProperties _self_, final Subcomponent _self) {
    return SubcomponentHelperAspect.getDirectedPorts(_self, false);
  }
  
  protected static EList<Port> _privk3_getDirectedPorts(final SubcomponentHelperAspectSubcomponentAspectProperties _self_, final Subcomponent _self, final boolean collectIncomingPorts) {
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
