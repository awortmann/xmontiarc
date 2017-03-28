package ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.adapters.montiarcmt.xmontiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.adapters.montiarcmt.MontiArcMTAdaptersFactory;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.xmontiarc.Subcomponent;
import xmontiarc.ComponentType;
import xmontiarc.IncomingPort;
import xmontiarc.OutgoingPort;

@SuppressWarnings("all")
public class SubcomponentAdapter extends EObjectAdapter<Subcomponent> implements xmontiarc.Subcomponent {
  private MontiArcMTAdaptersFactory adaptersFactory;
  
  public SubcomponentAdapter() {
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
  
  @Override
  public ComponentType getType() {
    return (ComponentType) adaptersFactory.createAdapter(adaptee.getType(), eResource);
  }
  
  @Override
  public void setType(final ComponentType o) {
    if (o != null)
    	adaptee.setType(((ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.adapters.montiarcmt.xmontiarc.ComponentTypeAdapter) o).getAdaptee());
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
    	adaptee.setParent(((ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.adapters.montiarcmt.xmontiarc.ComponentTypeAdapter) o).getAdaptee());
    else adaptee.setParent(null);
  }
  
  private EList<OutgoingPort> outgoingPorts_;
  
  @Override
  public EList<OutgoingPort> getOutgoingPorts() {
    if (outgoingPorts_ == null)
    	outgoingPorts_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoingPorts(), adaptersFactory, eResource);
    return outgoingPorts_;
  }
  
  protected final static String NAME_EDEFAULT = "UnnamedSubcomponent";
  
  @Override
  public EClass eClass() {
    return xmontiarc.XmontiarcPackage.eINSTANCE.getSubcomponent();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case xmontiarc.XmontiarcPackage.SUBCOMPONENT__NAME:
    		return getName();
    	case xmontiarc.XmontiarcPackage.SUBCOMPONENT__TYPE:
    		return getType();
    	case xmontiarc.XmontiarcPackage.SUBCOMPONENT__INCOMING_PORTS:
    		return getIncomingPorts();
    	case xmontiarc.XmontiarcPackage.SUBCOMPONENT__PARENT:
    		return getParent();
    	case xmontiarc.XmontiarcPackage.SUBCOMPONENT__OUTGOING_PORTS:
    		return getOutgoingPorts();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case xmontiarc.XmontiarcPackage.SUBCOMPONENT__NAME:
    		return getName() != NAME_EDEFAULT;
    	case xmontiarc.XmontiarcPackage.SUBCOMPONENT__TYPE:
    		return getType() != null;
    	case xmontiarc.XmontiarcPackage.SUBCOMPONENT__INCOMING_PORTS:
    		return getIncomingPorts() != null && !getIncomingPorts().isEmpty();
    	case xmontiarc.XmontiarcPackage.SUBCOMPONENT__PARENT:
    		return getParent() != null;
    	case xmontiarc.XmontiarcPackage.SUBCOMPONENT__OUTGOING_PORTS:
    		return getOutgoingPorts() != null && !getOutgoingPorts().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case xmontiarc.XmontiarcPackage.SUBCOMPONENT__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case xmontiarc.XmontiarcPackage.SUBCOMPONENT__TYPE:
    		setType(
    		(xmontiarc.ComponentType)
    		 newValue);
    		return;
    	case xmontiarc.XmontiarcPackage.SUBCOMPONENT__INCOMING_PORTS:
    		getIncomingPorts().clear();
    		getIncomingPorts().addAll((Collection) newValue);
    		return;
    	case xmontiarc.XmontiarcPackage.SUBCOMPONENT__PARENT:
    		setParent(
    		(xmontiarc.ComponentType)
    		 newValue);
    		return;
    	case xmontiarc.XmontiarcPackage.SUBCOMPONENT__OUTGOING_PORTS:
    		getOutgoingPorts().clear();
    		getOutgoingPorts().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
