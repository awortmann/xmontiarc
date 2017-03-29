package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.montiarc.montiarc.ComponentType;
import org.gemoc.montiarc.montiarc.IncomingPort;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.MontiArcMTAdaptersFactory;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.IncomingConnector;

@SuppressWarnings("all")
public class IncomingConnectorAdapter extends EObjectAdapter<IncomingConnector> implements org.gemoc.montiarc.montiarc.IncomingConnector {
  private MontiArcMTAdaptersFactory adaptersFactory;
  
  public IncomingConnectorAdapter() {
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
  public IncomingPort getSource() {
    return (IncomingPort) adaptersFactory.createAdapter(adaptee.getSource(), eResource);
  }
  
  @Override
  public void setSource(final IncomingPort o) {
    if (o != null)
    	adaptee.setSource(((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.IncomingPortAdapter) o).getAdaptee());
    else adaptee.setSource(null);
  }
  
  @Override
  public IncomingPort getTarget() {
    return (IncomingPort) adaptersFactory.createAdapter(adaptee.getTarget(), eResource);
  }
  
  @Override
  public void setTarget(final IncomingPort o) {
    if (o != null)
    	adaptee.setTarget(((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc.IncomingPortAdapter) o).getAdaptee());
    else adaptee.setTarget(null);
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.montiarc.montiarc.MontiarcPackage.eINSTANCE.getIncomingConnector();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.INCOMING_CONNECTOR__PARENT:
    		return getParent();
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.INCOMING_CONNECTOR__SOURCE:
    		return getSource();
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.INCOMING_CONNECTOR__TARGET:
    		return getTarget();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.INCOMING_CONNECTOR__PARENT:
    		return getParent() != null;
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.INCOMING_CONNECTOR__SOURCE:
    		return getSource() != null;
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.INCOMING_CONNECTOR__TARGET:
    		return getTarget() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.INCOMING_CONNECTOR__PARENT:
    		setParent(
    		(org.gemoc.montiarc.montiarc.ComponentType)
    		 newValue);
    		return;
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.INCOMING_CONNECTOR__SOURCE:
    		setSource(
    		(org.gemoc.montiarc.montiarc.IncomingPort)
    		 newValue);
    		return;
    	case org.gemoc.montiarc.montiarc.MontiarcPackage.INCOMING_CONNECTOR__TARGET:
    		setTarget(
    		(org.gemoc.montiarc.montiarc.IncomingPort)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
