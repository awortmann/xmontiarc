package ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.ComponentType;
import ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.ComponentBehavior;
import ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Connector;
import ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.IncomingPort;
import ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.OutgoingPort;
import ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Port;
import ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Subcomponent;

@SuppressWarnings("all")
public class ComponentTypeAdapter extends EObjectAdapter<ComponentType> implements ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.ComponentType {
  private XMontiArcMTAdaptersFactory adaptersFactory;
  
  public ComponentTypeAdapter() {
    super(ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory.getInstance());
    adaptersFactory = ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory.getInstance();
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
    	adaptee.setBehavior(((ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.ComponentBehaviorAdapter) o).getAdaptee());
    else adaptee.setBehavior(null);
  }
  
  @Override
  public void compute() {
    ur1.diverse.xmontiarc.xdsml.xmontiarc.aspects.ComponentTypeAspect.compute(adaptee);
  }
  
  @Override
  public Subcomponent findOwnerOf(final Port p) {
    return (Subcomponent) adaptersFactory.createAdapter(ur1.diverse.xmontiarc.xdsml.xmontiarc.aspects.ComponentTypeAspect.findOwnerOf(adaptee, (ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.Port)((EObjectAdapter)p).getAdaptee()
    ), eResource);
  }
  
  @Override
  public EList<Port> getDirectedPortsOfSubcomponents(final boolean collectIncoming) {
    return fr.inria.diverse.melange.adapters.EListAdapter.newInstance(ur1.diverse.xmontiarc.xdsml.xmontiarc.aspects.ComponentTypeAspect.getDirectedPortsOfSubcomponents(adaptee, collectIncoming
    ), adaptersFactory, eResource);
  }
  
  @Override
  public EList<Port> getIncomingPortsOfSubcomponents() {
    return fr.inria.diverse.melange.adapters.EListAdapter.newInstance(ur1.diverse.xmontiarc.xdsml.xmontiarc.aspects.ComponentTypeAspect.getIncomingPortsOfSubcomponents(adaptee), adaptersFactory, eResource);
  }
  
  @Override
  public EList<Port> getOutgoingPortsOfSubcomponents() {
    return fr.inria.diverse.melange.adapters.EListAdapter.newInstance(ur1.diverse.xmontiarc.xdsml.xmontiarc.aspects.ComponentTypeAspect.getOutgoingPortsOfSubcomponents(adaptee), adaptersFactory, eResource);
  }
  
  @Override
  public void initializeModel(final org.eclipse.emf.common.util.EList<java.lang.String> args) {
    ur1.diverse.xmontiarc.xdsml.xmontiarc.aspects.ComponentTypeAspect.initializeModel(adaptee, args
    );
  }
  
  @Override
  public void main() {
    ur1.diverse.xmontiarc.xdsml.xmontiarc.aspects.ComponentTypeAspect.main(adaptee);
  }
  
  @Override
  public void update() {
    ur1.diverse.xmontiarc.xdsml.xmontiarc.aspects.ComponentTypeAspect.update(adaptee);
  }
  
  protected final static String NAME_EDEFAULT = "UnnamedComponentType";
  
  @Override
  public EClass eClass() {
    return ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.eINSTANCE.getComponentType();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.COMPONENT_TYPE__NAME:
    		return getName();
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.COMPONENT_TYPE__CONNECTORS:
    		return getConnectors();
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS:
    		return getSubcomponents();
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.COMPONENT_TYPE__INCOMING_PORTS:
    		return getIncomingPorts();
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.COMPONENT_TYPE__OUTGOING_PORTS:
    		return getOutgoingPorts();
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.COMPONENT_TYPE__BEHAVIOR:
    		return getBehavior();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.COMPONENT_TYPE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.COMPONENT_TYPE__CONNECTORS:
    		return getConnectors() != null && !getConnectors().isEmpty();
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS:
    		return getSubcomponents() != null && !getSubcomponents().isEmpty();
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.COMPONENT_TYPE__INCOMING_PORTS:
    		return getIncomingPorts() != null && !getIncomingPorts().isEmpty();
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.COMPONENT_TYPE__OUTGOING_PORTS:
    		return getOutgoingPorts() != null && !getOutgoingPorts().isEmpty();
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.COMPONENT_TYPE__BEHAVIOR:
    		return getBehavior() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.COMPONENT_TYPE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.COMPONENT_TYPE__CONNECTORS:
    		getConnectors().clear();
    		getConnectors().addAll((Collection) newValue);
    		return;
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS:
    		getSubcomponents().clear();
    		getSubcomponents().addAll((Collection) newValue);
    		return;
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.COMPONENT_TYPE__INCOMING_PORTS:
    		getIncomingPorts().clear();
    		getIncomingPorts().addAll((Collection) newValue);
    		return;
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.COMPONENT_TYPE__OUTGOING_PORTS:
    		getOutgoingPorts().clear();
    		getOutgoingPorts().addAll((Collection) newValue);
    		return;
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.COMPONENT_TYPE__BEHAVIOR:
    		setBehavior(
    		(ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.ComponentBehavior)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
