package org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory;
import org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.OutgoingConnector;
import org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.ComponentType;
import org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.OutgoingPort;

@SuppressWarnings("all")
public class OutgoingConnectorAdapter extends EObjectAdapter<OutgoingConnector> implements org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.OutgoingConnector {
  private XMontiArcMTAdaptersFactory adaptersFactory;
  
  public OutgoingConnectorAdapter() {
    super(org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory.getInstance();
  }
  
  @Override
  public ComponentType getParent() {
    return (ComponentType) adaptersFactory.createAdapter(adaptee.getParent(), eResource);
  }
  
  @Override
  public void setParent(final ComponentType o) {
    if (o != null)
    	adaptee.setParent(((org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.ComponentTypeAdapter) o).getAdaptee());
    else adaptee.setParent(null);
  }
  
  @Override
  public OutgoingPort getSource() {
    return (OutgoingPort) adaptersFactory.createAdapter(adaptee.getSource(), eResource);
  }
  
  @Override
  public void setSource(final OutgoingPort o) {
    if (o != null)
    	adaptee.setSource(((org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.OutgoingPortAdapter) o).getAdaptee());
    else adaptee.setSource(null);
  }
  
  @Override
  public OutgoingPort getTarget() {
    return (OutgoingPort) adaptersFactory.createAdapter(adaptee.getTarget(), eResource);
  }
  
  @Override
  public void setTarget(final OutgoingPort o) {
    if (o != null)
    	adaptee.setTarget(((org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.OutgoingPortAdapter) o).getAdaptee());
    else adaptee.setTarget(null);
  }
  
  @Override
  public String getRepresentation() {
    return org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.ConnectorAspect.getRepresentation(adaptee);
  }
  
  @Override
  public String getSourceRepresentation() {
    return org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.ConnectorAspect.getSourceRepresentation(adaptee);
  }
  
  @Override
  public String getTargetRepresentation() {
    return org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.ConnectorAspect.getTargetRepresentation(adaptee);
  }
  
  @Override
  public void update() {
    org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.ConnectorAspect.update(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.eINSTANCE.getOutgoingConnector();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.OUTGOING_CONNECTOR__PARENT:
    		return getParent();
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.OUTGOING_CONNECTOR__SOURCE:
    		return getSource();
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.OUTGOING_CONNECTOR__TARGET:
    		return getTarget();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.OUTGOING_CONNECTOR__PARENT:
    		return getParent() != null;
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.OUTGOING_CONNECTOR__SOURCE:
    		return getSource() != null;
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.OUTGOING_CONNECTOR__TARGET:
    		return getTarget() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.OUTGOING_CONNECTOR__PARENT:
    		setParent(
    		(org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.ComponentType)
    		 newValue);
    		return;
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.OUTGOING_CONNECTOR__SOURCE:
    		setSource(
    		(org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.OutgoingPort)
    		 newValue);
    		return;
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.OUTGOING_CONNECTOR__TARGET:
    		setTarget(
    		(org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.OutgoingPort)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}