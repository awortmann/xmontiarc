package ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.adapters.montiarcmt.xmontiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.adapters.montiarcmt.MontiArcMTAdaptersFactory;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.xmontiarc.IncomingConnector;
import xmontiarc.ComponentType;
import xmontiarc.IncomingPort;

@SuppressWarnings("all")
public class IncomingConnectorAdapter extends EObjectAdapter<IncomingConnector> implements xmontiarc.IncomingConnector {
  private MontiArcMTAdaptersFactory adaptersFactory;
  
  public IncomingConnectorAdapter() {
    super(ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.adapters.montiarcmt.MontiArcMTAdaptersFactory.getInstance());
    adaptersFactory = ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.adapters.montiarcmt.MontiArcMTAdaptersFactory.getInstance();
  }
  
  @Override
  public ComponentType getParent() {
    return (ComponentType) adaptersFactory.createAdapter(adaptee.getParent(), eResource);
  }
  
  @Override
  public void setParent(final ComponentType o) {
    if (o != null)
    	adaptee.setParent(((ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.adapters.montiarcmt.xmontiarc.ComponentTypeAdapter) o).getAdaptee());
    else adaptee.setParent(null);
  }
  
  @Override
  public IncomingPort getSource() {
    return (IncomingPort) adaptersFactory.createAdapter(adaptee.getSource(), eResource);
  }
  
  @Override
  public void setSource(final IncomingPort o) {
    if (o != null)
    	adaptee.setSource(((ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.adapters.montiarcmt.xmontiarc.IncomingPortAdapter) o).getAdaptee());
    else adaptee.setSource(null);
  }
  
  @Override
  public IncomingPort getTarget() {
    return (IncomingPort) adaptersFactory.createAdapter(adaptee.getTarget(), eResource);
  }
  
  @Override
  public void setTarget(final IncomingPort o) {
    if (o != null)
    	adaptee.setTarget(((ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.adapters.montiarcmt.xmontiarc.IncomingPortAdapter) o).getAdaptee());
    else adaptee.setTarget(null);
  }
  
  @Override
  public EClass eClass() {
    return xmontiarc.XmontiarcPackage.eINSTANCE.getIncomingConnector();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case xmontiarc.XmontiarcPackage.INCOMING_CONNECTOR__PARENT:
    		return getParent();
    	case xmontiarc.XmontiarcPackage.INCOMING_CONNECTOR__SOURCE:
    		return getSource();
    	case xmontiarc.XmontiarcPackage.INCOMING_CONNECTOR__TARGET:
    		return getTarget();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case xmontiarc.XmontiarcPackage.INCOMING_CONNECTOR__PARENT:
    		return getParent() != null;
    	case xmontiarc.XmontiarcPackage.INCOMING_CONNECTOR__SOURCE:
    		return getSource() != null;
    	case xmontiarc.XmontiarcPackage.INCOMING_CONNECTOR__TARGET:
    		return getTarget() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case xmontiarc.XmontiarcPackage.INCOMING_CONNECTOR__PARENT:
    		setParent(
    		(xmontiarc.ComponentType)
    		 newValue);
    		return;
    	case xmontiarc.XmontiarcPackage.INCOMING_CONNECTOR__SOURCE:
    		setSource(
    		(xmontiarc.IncomingPort)
    		 newValue);
    		return;
    	case xmontiarc.XmontiarcPackage.INCOMING_CONNECTOR__TARGET:
    		setTarget(
    		(xmontiarc.IncomingPort)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
