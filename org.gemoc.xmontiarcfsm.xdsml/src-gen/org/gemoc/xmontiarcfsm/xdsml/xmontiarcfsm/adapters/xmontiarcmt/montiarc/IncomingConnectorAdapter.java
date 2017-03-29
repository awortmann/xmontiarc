package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcmt.montiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.ComponentType;
import org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.IncomingPort;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.IncomingConnector;

@SuppressWarnings("all")
public class IncomingConnectorAdapter extends EObjectAdapter<IncomingConnector> implements org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.IncomingConnector {
  private XMontiArcMTAdaptersFactory adaptersFactory;
  
  public IncomingConnectorAdapter() {
    super(org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory.getInstance();
  }
  
  @Override
  public ComponentType getParent() {
    return (ComponentType) adaptersFactory.createAdapter(adaptee.getParent(), eResource);
  }
  
  @Override
  public void setParent(final ComponentType o) {
    if (o != null)
    	adaptee.setParent(((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcmt.montiarc.ComponentTypeAdapter) o).getAdaptee());
    else adaptee.setParent(null);
  }
  
  @Override
  public IncomingPort getSource() {
    return (IncomingPort) adaptersFactory.createAdapter(adaptee.getSource(), eResource);
  }
  
  @Override
  public void setSource(final IncomingPort o) {
    if (o != null)
    	adaptee.setSource(((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcmt.montiarc.IncomingPortAdapter) o).getAdaptee());
    else adaptee.setSource(null);
  }
  
  @Override
  public IncomingPort getTarget() {
    return (IncomingPort) adaptersFactory.createAdapter(adaptee.getTarget(), eResource);
  }
  
  @Override
  public void setTarget(final IncomingPort o) {
    if (o != null)
    	adaptee.setTarget(((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcmt.montiarc.IncomingPortAdapter) o).getAdaptee());
    else adaptee.setTarget(null);
  }
  
  @Override
  public String getRepresentation() {
    return org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.ConnectorAspect.getRepresentation(adaptee);
  }
  
  @Override
  public String getSourceRepresentation() {
    return org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.ConnectorAspect.getSourceRepresentation(adaptee);
  }
  
  @Override
  public String getTargetRepresentation() {
    return org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.ConnectorAspect.getTargetRepresentation(adaptee);
  }
  
  @Override
  public void update() {
    org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.ConnectorAspect.update(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.eINSTANCE.getIncomingConnector();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.INCOMING_CONNECTOR__PARENT:
    		return getParent();
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.INCOMING_CONNECTOR__SOURCE:
    		return getSource();
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.INCOMING_CONNECTOR__TARGET:
    		return getTarget();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.INCOMING_CONNECTOR__PARENT:
    		return getParent() != null;
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.INCOMING_CONNECTOR__SOURCE:
    		return getSource() != null;
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.INCOMING_CONNECTOR__TARGET:
    		return getTarget() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.INCOMING_CONNECTOR__PARENT:
    		setParent(
    		(org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.ComponentType)
    		 newValue);
    		return;
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.INCOMING_CONNECTOR__SOURCE:
    		setSource(
    		(org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.IncomingPort)
    		 newValue);
    		return;
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.INCOMING_CONNECTOR__TARGET:
    		setTarget(
    		(org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.IncomingPort)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
