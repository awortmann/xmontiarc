package org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory;
import org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.Subcomponent;
import org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.ComponentBehavior;
import org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.ComponentType;
import org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.IncomingPort;
import org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.OutgoingPort;

@SuppressWarnings("all")
public class SubcomponentAdapter extends EObjectAdapter<Subcomponent> implements org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.Subcomponent {
  private XMontiArcMTAdaptersFactory adaptersFactory;
  
  public SubcomponentAdapter() {
    super(org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  @Override
  public ComponentType getType() {
    return (ComponentType) adaptersFactory.createAdapter(adaptee.getType(), eResource);
  }
  
  @Override
  public void setType(final ComponentType o) {
    if (o != null)
    	adaptee.setType(((org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.ComponentTypeAdapter) o).getAdaptee());
    else adaptee.setType(null);
  }
  
  private EList<IncomingPort> incomingPorts_;
  
  @Override
  public EList<IncomingPort> getIncomingPorts() {
    if (incomingPorts_ == null)
    	incomingPorts_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncomingPorts(), adaptersFactory, eResource);
    return incomingPorts_;
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
  
  private EList<OutgoingPort> outgoingPorts_;
  
  @Override
  public EList<OutgoingPort> getOutgoingPorts() {
    if (outgoingPorts_ == null)
    	outgoingPorts_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoingPorts(), adaptersFactory, eResource);
    return outgoingPorts_;
  }
  
  @Override
  public ComponentBehavior getLocalBehavior() {
    return (ComponentBehavior) adaptersFactory.createAdapter(adaptee.getLocalBehavior(), eResource);
  }
  
  @Override
  public void setLocalBehavior(final ComponentBehavior o) {
    if (o != null)
    	adaptee.setLocalBehavior(((org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc.ComponentBehaviorAdapter) o).getAdaptee());
    else adaptee.setLocalBehavior(null);
  }
  
  @Override
  public void compute() {
    org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.SubcomponentAspect.compute(adaptee);
  }
  
  @Override
  public void createDefaultBehavior() {
    org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.SubcomponentAspect.createDefaultBehavior(adaptee);
  }
  
  protected final static String NAME_EDEFAULT = "UnnamedSubcomponent";
  
  @Override
  public EClass eClass() {
    return org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.eINSTANCE.getSubcomponent();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.SUBCOMPONENT__NAME:
    		return getName();
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.SUBCOMPONENT__TYPE:
    		return getType();
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.SUBCOMPONENT__INCOMING_PORTS:
    		return getIncomingPorts();
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.SUBCOMPONENT__PARENT:
    		return getParent();
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.SUBCOMPONENT__OUTGOING_PORTS:
    		return getOutgoingPorts();
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.SUBCOMPONENT__LOCAL_BEHAVIOR:
    		return getLocalBehavior();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.SUBCOMPONENT__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.SUBCOMPONENT__TYPE:
    		return getType() != null;
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.SUBCOMPONENT__INCOMING_PORTS:
    		return getIncomingPorts() != null && !getIncomingPorts().isEmpty();
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.SUBCOMPONENT__PARENT:
    		return getParent() != null;
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.SUBCOMPONENT__OUTGOING_PORTS:
    		return getOutgoingPorts() != null && !getOutgoingPorts().isEmpty();
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.SUBCOMPONENT__LOCAL_BEHAVIOR:
    		return getLocalBehavior() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.SUBCOMPONENT__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.SUBCOMPONENT__TYPE:
    		setType(
    		(org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.ComponentType)
    		 newValue);
    		return;
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.SUBCOMPONENT__INCOMING_PORTS:
    		getIncomingPorts().clear();
    		getIncomingPorts().addAll((Collection) newValue);
    		return;
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.SUBCOMPONENT__PARENT:
    		setParent(
    		(org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.ComponentType)
    		 newValue);
    		return;
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.SUBCOMPONENT__OUTGOING_PORTS:
    		getOutgoingPorts().clear();
    		getOutgoingPorts().addAll((Collection) newValue);
    		return;
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.SUBCOMPONENT__LOCAL_BEHAVIOR:
    		setLocalBehavior(
    		(org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.ComponentBehavior)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
