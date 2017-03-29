package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcmt.montiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.ComponentBehavior;
import org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.Connector;
import org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.IncomingPort;
import org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.OutgoingPort;
import org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.Port;
import org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.Subcomponent;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.ComponentType;

@SuppressWarnings("all")
public class ComponentTypeAdapter extends EObjectAdapter<ComponentType> implements org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.ComponentType {
  private XMontiArcMTAdaptersFactory adaptersFactory;
  
  public ComponentTypeAdapter() {
    super(org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  private EList<Connector> connectors_;
  
  @Override
  public EList<Connector> getConnectors() {
    if (connectors_ == null)
    	connectors_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getConnectors(), adaptersFactory, eResource);
    return connectors_;
  }
  
  private EList<Subcomponent> subcomponents_;
  
  @Override
  public EList<Subcomponent> getSubcomponents() {
    if (subcomponents_ == null)
    	subcomponents_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSubcomponents(), adaptersFactory, eResource);
    return subcomponents_;
  }
  
  private EList<IncomingPort> incomingPorts_;
  
  @Override
  public EList<IncomingPort> getIncomingPorts() {
    if (incomingPorts_ == null)
    	incomingPorts_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncomingPorts(), adaptersFactory, eResource);
    return incomingPorts_;
  }
  
  private EList<OutgoingPort> outgoingPorts_;
  
  @Override
  public EList<OutgoingPort> getOutgoingPorts() {
    if (outgoingPorts_ == null)
    	outgoingPorts_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoingPorts(), adaptersFactory, eResource);
    return outgoingPorts_;
  }
  
  @Override
  public ComponentBehavior getBehavior() {
    return (ComponentBehavior) adaptersFactory.createAdapter(adaptee.getBehavior(), eResource);
  }
  
  @Override
  public void setBehavior(final ComponentBehavior o) {
    if (o != null)
    	adaptee.setBehavior(((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcmt.montiarc.ComponentBehaviorAdapter) o).getAdaptee());
    else adaptee.setBehavior(null);
  }
  
  @Override
  public void compute() {
    org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.ComponentTypeAspect.compute(adaptee);
  }
  
  @Override
  public Subcomponent findOwnerOf(final Port p) {
    return (Subcomponent) adaptersFactory.createAdapter(org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.ComponentTypeAspect.findOwnerOf(adaptee, (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.Port)((EObjectAdapter)p).getAdaptee()
    ), eResource);
  }
  
  @Override
  public EList<Port> getDirectedPortsOfSubcomponents(final boolean collectIncoming) {
    return fr.inria.diverse.melange.adapters.EListAdapter.newInstance(org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.ComponentTypeAspect.getDirectedPortsOfSubcomponents(adaptee, collectIncoming
    ), adaptersFactory, eResource);
  }
  
  @Override
  public EList<Port> getIncomingPortsOfSubcomponents() {
    return fr.inria.diverse.melange.adapters.EListAdapter.newInstance(org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.ComponentTypeAspect.getIncomingPortsOfSubcomponents(adaptee), adaptersFactory, eResource);
  }
  
  @Override
  public EList<Port> getOutgoingPortsOfSubcomponents() {
    return fr.inria.diverse.melange.adapters.EListAdapter.newInstance(org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.ComponentTypeAspect.getOutgoingPortsOfSubcomponents(adaptee), adaptersFactory, eResource);
  }
  
  @Override
  public void initializeModel(final org.eclipse.emf.common.util.EList<java.lang.String> args) {
    org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.ComponentTypeAspect.initializeModel(adaptee, args
    );
  }
  
  @Override
  public void main() {
    org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.ComponentTypeAspect.main(adaptee);
  }
  
  @Override
  public void update() {
    org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.ComponentTypeAspect.update(adaptee);
  }
  
  protected final static String NAME_EDEFAULT = "UnnamedComponentType";
  
  @Override
  public EClass eClass() {
    return org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.eINSTANCE.getComponentType();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.COMPONENT_TYPE__NAME:
    		return getName();
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.COMPONENT_TYPE__CONNECTORS:
    		return getConnectors();
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS:
    		return getSubcomponents();
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.COMPONENT_TYPE__INCOMING_PORTS:
    		return getIncomingPorts();
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.COMPONENT_TYPE__OUTGOING_PORTS:
    		return getOutgoingPorts();
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.COMPONENT_TYPE__BEHAVIOR:
    		return getBehavior();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.COMPONENT_TYPE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.COMPONENT_TYPE__CONNECTORS:
    		return getConnectors() != null && !getConnectors().isEmpty();
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS:
    		return getSubcomponents() != null && !getSubcomponents().isEmpty();
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.COMPONENT_TYPE__INCOMING_PORTS:
    		return getIncomingPorts() != null && !getIncomingPorts().isEmpty();
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.COMPONENT_TYPE__OUTGOING_PORTS:
    		return getOutgoingPorts() != null && !getOutgoingPorts().isEmpty();
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.COMPONENT_TYPE__BEHAVIOR:
    		return getBehavior() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.COMPONENT_TYPE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.COMPONENT_TYPE__CONNECTORS:
    		getConnectors().clear();
    		getConnectors().addAll((Collection) newValue);
    		return;
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS:
    		getSubcomponents().clear();
    		getSubcomponents().addAll((Collection) newValue);
    		return;
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.COMPONENT_TYPE__INCOMING_PORTS:
    		getIncomingPorts().clear();
    		getIncomingPorts().addAll((Collection) newValue);
    		return;
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.COMPONENT_TYPE__OUTGOING_PORTS:
    		getOutgoingPorts().clear();
    		getOutgoingPorts().addAll((Collection) newValue);
    		return;
    	case org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.COMPONENT_TYPE__BEHAVIOR:
    		setBehavior(
    		(org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.ComponentBehavior)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
