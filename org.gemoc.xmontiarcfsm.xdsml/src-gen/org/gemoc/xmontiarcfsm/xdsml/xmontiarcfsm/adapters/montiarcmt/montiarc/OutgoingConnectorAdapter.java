package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.montiarc.montiarc.ComponentType;
import org.gemoc.montiarc.montiarc.OutgoingPort;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.MontiArcMTAdaptersFactory;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.OutgoingConnector;

@SuppressWarnings("all")
public class OutgoingConnectorAdapter extends EObjectAdapter<OutgoingConnector> implements org.gemoc.montiarc.montiarc.OutgoingConnector {
  private MontiArcMTAdaptersFactory adaptersFactory;
  
  public OutgoingConnectorAdapter() {
    super(org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.MontiArcMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.MontiArcMTAdaptersFactory.getInstance();
  }
  
  @Override
  public ComponentType getParent() {
    return (ComponentType) adaptersFactory.createAdapter(adaptee.getParent(), eResource);
  }
  
  @Override
  public void setParent(final ComponentType o) {
    if (o != null)
    	adaptee.setParent(((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.ComponentTypeAdapter) o).getAdaptee());
    else adaptee.setParent(null);
  }
  
  @Override
  public OutgoingPort getSource() {
    return (OutgoingPort) adaptersFactory.createAdapter(adaptee.getSource(), eResource);
  }
  
  @Override
  public void setSource(final OutgoingPort o) {
    if (o != null)
    	adaptee.setSource(((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.OutgoingPortAdapter) o).getAdaptee());
    else adaptee.setSource(null);
  }
  
  @Override
  public OutgoingPort getTarget() {
    return (OutgoingPort) adaptersFactory.createAdapter(adaptee.getTarget(), eResource);
  }
  
  @Override
  public void setTarget(final OutgoingPort o) {
    if (o != null)
    	adaptee.setTarget(((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.OutgoingPortAdapter) o).getAdaptee());
    else adaptee.setTarget(null);
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.montiarc.montiarc.MontiarcPackage.eINSTANCE.getOutgoingConnector();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.OUTGOING_CONNECTOR__PARENT:
    		return getParent();
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.OUTGOING_CONNECTOR__SOURCE:
    		return getSource();
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.OUTGOING_CONNECTOR__TARGET:
    		return getTarget();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.OUTGOING_CONNECTOR__PARENT:
    		return getParent() != null;
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.OUTGOING_CONNECTOR__SOURCE:
    		return getSource() != null;
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.OUTGOING_CONNECTOR__TARGET:
    		return getTarget() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.OUTGOING_CONNECTOR__PARENT:
    		setParent(
    		(org.gemoc.montiarc.montiarc.ComponentType)
    		 newValue);
    		return;
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.OUTGOING_CONNECTOR__SOURCE:
    		setSource(
    		(org.gemoc.montiarc.montiarc.OutgoingPort)
    		 newValue);
    		return;
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.OUTGOING_CONNECTOR__TARGET:
    		setTarget(
    		(org.gemoc.montiarc.montiarc.OutgoingPort)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
