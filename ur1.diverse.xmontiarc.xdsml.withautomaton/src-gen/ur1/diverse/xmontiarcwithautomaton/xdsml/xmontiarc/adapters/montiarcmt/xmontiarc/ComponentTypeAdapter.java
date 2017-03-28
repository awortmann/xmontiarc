package ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.adapters.montiarcmt.xmontiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.adapters.montiarcmt.MontiArcMTAdaptersFactory;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.xmontiarc.ComponentType;
import xmontiarc.ComponentBehavior;
import xmontiarc.Connector;
import xmontiarc.IncomingPort;
import xmontiarc.OutgoingPort;
import xmontiarc.Subcomponent;

@SuppressWarnings("all")
public class ComponentTypeAdapter extends EObjectAdapter<ComponentType> implements xmontiarc.ComponentType {
  private MontiArcMTAdaptersFactory adaptersFactory;
  
  public ComponentTypeAdapter() {
    super(ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.adapters.montiarcmt.MontiArcMTAdaptersFactory.getInstance());
    adaptersFactory = ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.adapters.montiarcmt.MontiArcMTAdaptersFactory.getInstance();
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
    	adaptee.setBehavior(((ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.adapters.montiarcmt.xmontiarc.ComponentBehaviorAdapter) o).getAdaptee());
    else adaptee.setBehavior(null);
  }
  
  protected final static String NAME_EDEFAULT = "UnnamedComponentType";
  
  @Override
  public EClass eClass() {
    return xmontiarc.XmontiarcPackage.eINSTANCE.getComponentType();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case xmontiarc.XmontiarcPackage.COMPONENT_TYPE__NAME:
    		return getName();
    	case xmontiarc.XmontiarcPackage.COMPONENT_TYPE__CONNECTORS:
    		return getConnectors();
    	case xmontiarc.XmontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS:
    		return getSubcomponents();
    	case xmontiarc.XmontiarcPackage.COMPONENT_TYPE__INCOMING_PORTS:
    		return getIncomingPorts();
    	case xmontiarc.XmontiarcPackage.COMPONENT_TYPE__OUTGOING_PORTS:
    		return getOutgoingPorts();
    	case xmontiarc.XmontiarcPackage.COMPONENT_TYPE__BEHAVIOR:
    		return getBehavior();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case xmontiarc.XmontiarcPackage.COMPONENT_TYPE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case xmontiarc.XmontiarcPackage.COMPONENT_TYPE__CONNECTORS:
    		return getConnectors() != null && !getConnectors().isEmpty();
    	case xmontiarc.XmontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS:
    		return getSubcomponents() != null && !getSubcomponents().isEmpty();
    	case xmontiarc.XmontiarcPackage.COMPONENT_TYPE__INCOMING_PORTS:
    		return getIncomingPorts() != null && !getIncomingPorts().isEmpty();
    	case xmontiarc.XmontiarcPackage.COMPONENT_TYPE__OUTGOING_PORTS:
    		return getOutgoingPorts() != null && !getOutgoingPorts().isEmpty();
    	case xmontiarc.XmontiarcPackage.COMPONENT_TYPE__BEHAVIOR:
    		return getBehavior() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case xmontiarc.XmontiarcPackage.COMPONENT_TYPE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case xmontiarc.XmontiarcPackage.COMPONENT_TYPE__CONNECTORS:
    		getConnectors().clear();
    		getConnectors().addAll((Collection) newValue);
    		return;
    	case xmontiarc.XmontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS:
    		getSubcomponents().clear();
    		getSubcomponents().addAll((Collection) newValue);
    		return;
    	case xmontiarc.XmontiarcPackage.COMPONENT_TYPE__INCOMING_PORTS:
    		getIncomingPorts().clear();
    		getIncomingPorts().addAll((Collection) newValue);
    		return;
    	case xmontiarc.XmontiarcPackage.COMPONENT_TYPE__OUTGOING_PORTS:
    		getOutgoingPorts().clear();
    		getOutgoingPorts().addAll((Collection) newValue);
    		return;
    	case xmontiarc.XmontiarcPackage.COMPONENT_TYPE__BEHAVIOR:
    		setBehavior(
    		(xmontiarc.ComponentBehavior)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
