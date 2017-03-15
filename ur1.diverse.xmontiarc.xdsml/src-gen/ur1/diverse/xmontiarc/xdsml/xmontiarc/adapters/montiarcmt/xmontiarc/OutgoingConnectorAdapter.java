package ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.xmontiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.MontiArcMTAdaptersFactory;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.OutgoingConnector;
import xmontiarc.ComponentType;
import xmontiarc.OutgoingPort;

@SuppressWarnings("all")
public class OutgoingConnectorAdapter extends EObjectAdapter<OutgoingConnector> implements xmontiarc.OutgoingConnector {
  private MontiArcMTAdaptersFactory adaptersFactory;
  
  public OutgoingConnectorAdapter() {
    super(ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.MontiArcMTAdaptersFactory.getInstance());
    adaptersFactory = ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.MontiArcMTAdaptersFactory.getInstance();
  }
  
  @Override
  public ComponentType getParent() {
    return (ComponentType) adaptersFactory.createAdapter(adaptee.getParent(), eResource);
  }
  
  @Override
  public void setParent(final ComponentType o) {
    if (o != null)
    	adaptee.setParent(((ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.xmontiarc.ComponentTypeAdapter) o).getAdaptee());
    else adaptee.setParent(null);
  }
  
  @Override
  public OutgoingPort getSource() {
    return (OutgoingPort) adaptersFactory.createAdapter(adaptee.getSource(), eResource);
  }
  
  @Override
  public void setSource(final OutgoingPort o) {
    if (o != null)
    	adaptee.setSource(((ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.xmontiarc.OutgoingPortAdapter) o).getAdaptee());
    else adaptee.setSource(null);
  }
  
  @Override
  public OutgoingPort getTarget() {
    return (OutgoingPort) adaptersFactory.createAdapter(adaptee.getTarget(), eResource);
  }
  
  @Override
  public void setTarget(final OutgoingPort o) {
    if (o != null)
    	adaptee.setTarget(((ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.xmontiarc.OutgoingPortAdapter) o).getAdaptee());
    else adaptee.setTarget(null);
  }
  
  @Override
  public EClass eClass() {
    return xmontiarc.XmontiarcPackage.eINSTANCE.getOutgoingConnector();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case xmontiarc.XmontiarcPackage.OUTGOING_CONNECTOR__PARENT:
    		return getParent();
    	case xmontiarc.XmontiarcPackage.OUTGOING_CONNECTOR__SOURCE:
    		return getSource();
    	case xmontiarc.XmontiarcPackage.OUTGOING_CONNECTOR__TARGET:
    		return getTarget();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case xmontiarc.XmontiarcPackage.OUTGOING_CONNECTOR__PARENT:
    		return getParent() != null;
    	case xmontiarc.XmontiarcPackage.OUTGOING_CONNECTOR__SOURCE:
    		return getSource() != null;
    	case xmontiarc.XmontiarcPackage.OUTGOING_CONNECTOR__TARGET:
    		return getTarget() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case xmontiarc.XmontiarcPackage.OUTGOING_CONNECTOR__PARENT:
    		setParent(
    		(xmontiarc.ComponentType)
    		 newValue);
    		return;
    	case xmontiarc.XmontiarcPackage.OUTGOING_CONNECTOR__SOURCE:
    		setSource(
    		(xmontiarc.OutgoingPort)
    		 newValue);
    		return;
    	case xmontiarc.XmontiarcPackage.OUTGOING_CONNECTOR__TARGET:
    		setTarget(
    		(xmontiarc.OutgoingPort)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
