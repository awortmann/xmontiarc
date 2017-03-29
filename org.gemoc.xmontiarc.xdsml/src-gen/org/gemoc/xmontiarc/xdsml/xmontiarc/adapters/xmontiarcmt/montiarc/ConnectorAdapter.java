package org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory;
import org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.Connector;
import org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.ComponentType;
import org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.Port;

@SuppressWarnings("all")
public class ConnectorAdapter extends EObjectAdapter<Connector> implements org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.Connector {
  private XMontiArcMTAdaptersFactory adaptersFactory;
  
  public ConnectorAdapter() {
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
  public String getRepresentation() {
    return org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.ConnectorAspect.getRepresentation(adaptee);
  }
  
  @Override
  public Port getSource() {
    return (Port) adaptersFactory.createAdapter(org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.ConnectorAspect.getSource(adaptee), eResource);
  }
  
  @Override
  public String getSourceRepresentation() {
    return org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.ConnectorAspect.getSourceRepresentation(adaptee);
  }
  
  @Override
  public Port getTarget() {
    return (Port) adaptersFactory.createAdapter(org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.ConnectorAspect.getTarget(adaptee), eResource);
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
    return org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.eINSTANCE.getConnector();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.CONNECTOR__PARENT:
    		return getParent();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.CONNECTOR__PARENT:
    		return getParent() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.CONNECTOR__PARENT:
    		setParent(
    		(org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.ComponentType)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
