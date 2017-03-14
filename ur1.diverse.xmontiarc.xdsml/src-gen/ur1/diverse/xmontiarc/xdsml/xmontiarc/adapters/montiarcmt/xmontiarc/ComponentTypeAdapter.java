package ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.xmontiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.MontiArcMTAdaptersFactory;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.ComponentType;
import xmontiarc.Connector;
import xmontiarc.Port;
import xmontiarc.Subcomponent;

@SuppressWarnings("all")
public class ComponentTypeAdapter extends EObjectAdapter<ComponentType> implements xmontiarc.ComponentType {
  private MontiArcMTAdaptersFactory adaptersFactory;
  
  public ComponentTypeAdapter() {
    super(ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.MontiArcMTAdaptersFactory.getInstance());
    adaptersFactory = ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.MontiArcMTAdaptersFactory.getInstance();
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
  public String getBehavior() {
    return adaptee.getBehavior();
  }
  
  @Override
  public void setBehavior(final String o) {
    adaptee.setBehavior(o);
  }
  
  private EList<Port> ports_;
  
  @Override
  public EList<Port> getPorts() {
    if (ports_ == null)
    	ports_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getPorts(), adaptersFactory, eResource);
    return ports_;
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
  
  protected final static String NAME_EDEFAULT = "UnnamedComponentType";
  
  protected final static String BEHAVIOR_EDEFAULT = "\"\"";
  
  @Override
  public EClass eClass() {
    return xmontiarc.XmontiarcPackage.eINSTANCE.getComponentType();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case xmontiarc.XmontiarcPackage.COMPONENT_TYPE__NAME:
    		return getName();
    	case xmontiarc.XmontiarcPackage.COMPONENT_TYPE__PORTS:
    		return getPorts();
    	case xmontiarc.XmontiarcPackage.COMPONENT_TYPE__CONNECTORS:
    		return getConnectors();
    	case xmontiarc.XmontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS:
    		return getSubcomponents();
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
    	case xmontiarc.XmontiarcPackage.COMPONENT_TYPE__PORTS:
    		return getPorts() != null && !getPorts().isEmpty();
    	case xmontiarc.XmontiarcPackage.COMPONENT_TYPE__CONNECTORS:
    		return getConnectors() != null && !getConnectors().isEmpty();
    	case xmontiarc.XmontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS:
    		return getSubcomponents() != null && !getSubcomponents().isEmpty();
    	case xmontiarc.XmontiarcPackage.COMPONENT_TYPE__BEHAVIOR:
    		return getBehavior() != BEHAVIOR_EDEFAULT;
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
    	case xmontiarc.XmontiarcPackage.COMPONENT_TYPE__PORTS:
    		getPorts().clear();
    		getPorts().addAll((Collection) newValue);
    		return;
    	case xmontiarc.XmontiarcPackage.COMPONENT_TYPE__CONNECTORS:
    		getConnectors().clear();
    		getConnectors().addAll((Collection) newValue);
    		return;
    	case xmontiarc.XmontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS:
    		getSubcomponents().clear();
    		getSubcomponents().addAll((Collection) newValue);
    		return;
    	case xmontiarc.XmontiarcPackage.COMPONENT_TYPE__BEHAVIOR:
    		setBehavior(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
