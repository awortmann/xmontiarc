package org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.montiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.montiarc.montiarc.ComponentType;
import org.gemoc.montiarc.montiarc.IncomingPort;
import org.gemoc.montiarc.montiarc.OutgoingPort;
import org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.MontiArcMTAdaptersFactory;
import org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.IntermediateConnector;

@SuppressWarnings("all")
public class IntermediateConnectorAdapter extends EObjectAdapter<IntermediateConnector> implements org.gemoc.montiarc.montiarc.IntermediateConnector {
  private MontiArcMTAdaptersFactory adaptersFactory;
  
  public IntermediateConnectorAdapter() {
    super(org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.MontiArcMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.MontiArcMTAdaptersFactory.getInstance();
  }
  
  @Override
  public ComponentType getParent() {
    return (ComponentType) adaptersFactory.createAdapter(adaptee.getParent(), eResource);
  }
  
  @Override
  public void setParent(final ComponentType o) {
    if (o != null)
    	adaptee.setParent(((org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.montiarc.ComponentTypeAdapter) o).getAdaptee());
    else adaptee.setParent(null);
  }
  
  @Override
  public OutgoingPort getSource() {
    return (OutgoingPort) adaptersFactory.createAdapter(adaptee.getSource(), eResource);
  }
  
  @Override
  public void setSource(final OutgoingPort o) {
    if (o != null)
    	adaptee.setSource(((org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.montiarc.OutgoingPortAdapter) o).getAdaptee());
    else adaptee.setSource(null);
  }
  
  @Override
  public IncomingPort getTarget() {
    return (IncomingPort) adaptersFactory.createAdapter(adaptee.getTarget(), eResource);
  }
  
  @Override
  public void setTarget(final IncomingPort o) {
    if (o != null)
    	adaptee.setTarget(((org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.montiarc.IncomingPortAdapter) o).getAdaptee());
    else adaptee.setTarget(null);
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.montiarc.montiarc.MontiarcPackage.eINSTANCE.getIntermediateConnector();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.INTERMEDIATE_CONNECTOR__PARENT:
    		return getParent();
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.INTERMEDIATE_CONNECTOR__SOURCE:
    		return getSource();
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.INTERMEDIATE_CONNECTOR__TARGET:
    		return getTarget();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.INTERMEDIATE_CONNECTOR__PARENT:
    		return getParent() != null;
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.INTERMEDIATE_CONNECTOR__SOURCE:
    		return getSource() != null;
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.INTERMEDIATE_CONNECTOR__TARGET:
    		return getTarget() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.INTERMEDIATE_CONNECTOR__PARENT:
    		setParent(
    		(org.gemoc.montiarc.montiarc.ComponentType)
    		 newValue);
    		return;
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.INTERMEDIATE_CONNECTOR__SOURCE:
    		setSource(
    		(org.gemoc.montiarc.montiarc.OutgoingPort)
    		 newValue);
    		return;
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.INTERMEDIATE_CONNECTOR__TARGET:
    		setTarget(
    		(org.gemoc.montiarc.montiarc.IncomingPort)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
