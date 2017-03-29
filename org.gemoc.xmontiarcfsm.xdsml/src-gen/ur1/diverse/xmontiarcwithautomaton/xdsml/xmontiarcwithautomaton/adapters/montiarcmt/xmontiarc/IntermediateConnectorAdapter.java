package ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.MontiArcMTAdaptersFactory;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.IntermediateConnector;
import xmontiarc.ComponentType;
import xmontiarc.IncomingPort;
import xmontiarc.OutgoingPort;

@SuppressWarnings("all")
public class IntermediateConnectorAdapter extends EObjectAdapter<IntermediateConnector> implements xmontiarc.IntermediateConnector {
  private MontiArcMTAdaptersFactory adaptersFactory;
  
  public IntermediateConnectorAdapter() {
    super(ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.MontiArcMTAdaptersFactory.getInstance());
    adaptersFactory = ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.MontiArcMTAdaptersFactory.getInstance();
  }
  
  @Override
  public ComponentType getParent() {
    return (ComponentType) adaptersFactory.createAdapter(adaptee.getParent(), eResource);
  }
  
  @Override
  public void setParent(final ComponentType o) {
    if (o != null)
    	adaptee.setParent(((ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.ComponentTypeAdapter) o).getAdaptee());
    else adaptee.setParent(null);
  }
  
  @Override
  public OutgoingPort getSource() {
    return (OutgoingPort) adaptersFactory.createAdapter(adaptee.getSource(), eResource);
  }
  
  @Override
  public void setSource(final OutgoingPort o) {
    if (o != null)
    	adaptee.setSource(((ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.OutgoingPortAdapter) o).getAdaptee());
    else adaptee.setSource(null);
  }
  
  @Override
  public IncomingPort getTarget() {
    return (IncomingPort) adaptersFactory.createAdapter(adaptee.getTarget(), eResource);
  }
  
  @Override
  public void setTarget(final IncomingPort o) {
    if (o != null)
    	adaptee.setTarget(((ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc.IncomingPortAdapter) o).getAdaptee());
    else adaptee.setTarget(null);
  }
  
  @Override
  public EClass eClass() {
    return xmontiarc.XmontiarcPackage.eINSTANCE.getIntermediateConnector();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case xmontiarc.XmontiarcPackage.INTERMEDIATE_CONNECTOR__PARENT:
    		return getParent();
    	case xmontiarc.XmontiarcPackage.INTERMEDIATE_CONNECTOR__SOURCE:
    		return getSource();
    	case xmontiarc.XmontiarcPackage.INTERMEDIATE_CONNECTOR__TARGET:
    		return getTarget();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case xmontiarc.XmontiarcPackage.INTERMEDIATE_CONNECTOR__PARENT:
    		return getParent() != null;
    	case xmontiarc.XmontiarcPackage.INTERMEDIATE_CONNECTOR__SOURCE:
    		return getSource() != null;
    	case xmontiarc.XmontiarcPackage.INTERMEDIATE_CONNECTOR__TARGET:
    		return getTarget() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case xmontiarc.XmontiarcPackage.INTERMEDIATE_CONNECTOR__PARENT:
    		setParent(
    		(xmontiarc.ComponentType)
    		 newValue);
    		return;
    	case xmontiarc.XmontiarcPackage.INTERMEDIATE_CONNECTOR__SOURCE:
    		setSource(
    		(xmontiarc.OutgoingPort)
    		 newValue);
    		return;
    	case xmontiarc.XmontiarcPackage.INTERMEDIATE_CONNECTOR__TARGET:
    		setTarget(
    		(xmontiarc.IncomingPort)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
