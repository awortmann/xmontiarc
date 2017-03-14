package ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.ComponentType;
import ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Connector;
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
  
  @Override
  public void compute() {
    ur1.diverse.xmontiarc.xdsml.xmontiarc.aspects.ComponentTypeAspect.compute(adaptee);
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
  
  @Override
  public Subcomponent findOwnerOf(final Port p) {
    return (Subcomponent) adaptersFactory.createAdapter(ur1.diverse.xmontiarc.xdsml.xmontiarc.aspects.ComponentTypeHelperAspect.findOwnerOf(adaptee, (ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.Port)((EObjectAdapter)p).getAdaptee()
    ), eResource);
  }
  
  @Override
  public EList<Port> getDirectedPorts(final boolean collectIncomingPorts) {
    return fr.inria.diverse.melange.adapters.EListAdapter.newInstance(ur1.diverse.xmontiarc.xdsml.xmontiarc.aspects.ComponentTypeHelperAspect.getDirectedPorts(adaptee, collectIncomingPorts
    ), adaptersFactory, eResource);
  }
  
  @Override
  public EList<Port> getDirectedPortsOfSubcomponents(final boolean collectIncoming) {
    return fr.inria.diverse.melange.adapters.EListAdapter.newInstance(ur1.diverse.xmontiarc.xdsml.xmontiarc.aspects.ComponentTypeHelperAspect.getDirectedPortsOfSubcomponents(adaptee, collectIncoming
    ), adaptersFactory, eResource);
  }
  
  @Override
  public EList<Port> getIncomingPorts() {
    return fr.inria.diverse.melange.adapters.EListAdapter.newInstance(ur1.diverse.xmontiarc.xdsml.xmontiarc.aspects.ComponentTypeHelperAspect.getIncomingPorts(adaptee), adaptersFactory, eResource);
  }
  
  @Override
  public EList<Port> getIncomingPortsOfSubcomponents() {
    return fr.inria.diverse.melange.adapters.EListAdapter.newInstance(ur1.diverse.xmontiarc.xdsml.xmontiarc.aspects.ComponentTypeHelperAspect.getIncomingPortsOfSubcomponents(adaptee), adaptersFactory, eResource);
  }
  
  @Override
  public EList<Port> getOutgoingPorts() {
    return fr.inria.diverse.melange.adapters.EListAdapter.newInstance(ur1.diverse.xmontiarc.xdsml.xmontiarc.aspects.ComponentTypeHelperAspect.getOutgoingPorts(adaptee), adaptersFactory, eResource);
  }
  
  @Override
  public EList<Port> getOutgoingPortsOfSubcomponents() {
    return fr.inria.diverse.melange.adapters.EListAdapter.newInstance(ur1.diverse.xmontiarc.xdsml.xmontiarc.aspects.ComponentTypeHelperAspect.getOutgoingPortsOfSubcomponents(adaptee), adaptersFactory, eResource);
  }
  
  protected final static String NAME_EDEFAULT = "UnnamedComponentType";
  
  protected final static String BEHAVIOR_EDEFAULT = "\"\"";
  
  @Override
  public EClass eClass() {
    return ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.eINSTANCE.getComponentType();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.COMPONENT_TYPE__NAME:
    		return getName();
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.COMPONENT_TYPE__PORTS:
    		return getPorts();
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.COMPONENT_TYPE__CONNECTORS:
    		return getConnectors();
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS:
    		return getSubcomponents();
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
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.COMPONENT_TYPE__PORTS:
    		return getPorts() != null && !getPorts().isEmpty();
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.COMPONENT_TYPE__CONNECTORS:
    		return getConnectors() != null && !getConnectors().isEmpty();
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS:
    		return getSubcomponents() != null && !getSubcomponents().isEmpty();
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.COMPONENT_TYPE__BEHAVIOR:
    		return getBehavior() != BEHAVIOR_EDEFAULT;
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
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.COMPONENT_TYPE__PORTS:
    		getPorts().clear();
    		getPorts().addAll((Collection) newValue);
    		return;
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.COMPONENT_TYPE__CONNECTORS:
    		getConnectors().clear();
    		getConnectors().addAll((Collection) newValue);
    		return;
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS:
    		getSubcomponents().clear();
    		getSubcomponents().addAll((Collection) newValue);
    		return;
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.COMPONENT_TYPE__BEHAVIOR:
    		setBehavior(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
