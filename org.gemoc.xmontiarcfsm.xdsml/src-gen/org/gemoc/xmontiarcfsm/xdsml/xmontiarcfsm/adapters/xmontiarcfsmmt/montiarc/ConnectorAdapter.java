package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.XMontiArcFSMMTAdaptersFactory;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.Connector;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.montiarc.ComponentType;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.montiarc.Port;

@SuppressWarnings("all")
public class ConnectorAdapter extends EObjectAdapter<Connector> implements org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.montiarc.Connector {
  private XMontiArcFSMMTAdaptersFactory adaptersFactory;
  
  public ConnectorAdapter() {
    super(org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.XMontiArcFSMMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.XMontiArcFSMMTAdaptersFactory.getInstance();
  }
  
  @Override
  public ComponentType getParent() {
    return (ComponentType) adaptersFactory.createAdapter(adaptee.getParent(), eResource);
  }
  
  @Override
  public void setParent(final ComponentType o) {
    if (o != null)
    	adaptee.setParent(((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.ComponentTypeAdapter) o).getAdaptee());
    else adaptee.setParent(null);
  }
  
  @Override
  public String getRepresentation() {
    return org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.ConnectorAspect.getRepresentation(adaptee);
  }
  
  @Override
  public Port getSource() {
    return (Port) adaptersFactory.createAdapter(org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.ConnectorAspect.getSource(adaptee), eResource);
  }
  
  @Override
  public String getSourceRepresentation() {
    return org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.ConnectorAspect.getSourceRepresentation(adaptee);
  }
  
  @Override
  public Port getTarget() {
    return (Port) adaptersFactory.createAdapter(org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.ConnectorAspect.getTarget(adaptee), eResource);
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
    return org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.montiarc.MontiarcPackage.eINSTANCE.getConnector();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.montiarc.MontiarcPackage.CONNECTOR__PARENT:
    		return getParent();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.montiarc.MontiarcPackage.CONNECTOR__PARENT:
    		return getParent() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.montiarc.MontiarcPackage.CONNECTOR__PARENT:
    		setParent(
    		(org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.montiarc.ComponentType)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
