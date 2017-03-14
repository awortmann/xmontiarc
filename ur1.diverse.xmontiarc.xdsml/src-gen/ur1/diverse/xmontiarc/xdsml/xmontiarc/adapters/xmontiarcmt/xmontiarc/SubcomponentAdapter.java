package ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.Subcomponent;
import ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.ComponentType;
import ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Port;

@SuppressWarnings("all")
public class SubcomponentAdapter extends EObjectAdapter<Subcomponent> implements ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Subcomponent {
  private XMontiArcMTAdaptersFactory adaptersFactory;
  
  public SubcomponentAdapter() {
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
  public ComponentType getType() {
    return (ComponentType) adaptersFactory.createAdapter(adaptee.getType(), eResource);
  }
  
  @Override
  public void setType(final ComponentType o) {
    if (o != null)
    	adaptee.setType(((ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.ComponentTypeAdapter) o).getAdaptee());
    else adaptee.setType(null);
  }
  
  private EList<Port> ports_;
  
  @Override
  public EList<Port> getPorts() {
    if (ports_ == null)
    	ports_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getPorts(), adaptersFactory, eResource);
    return ports_;
  }
  
  @Override
  public ComponentType getParent() {
    return (ComponentType) adaptersFactory.createAdapter(adaptee.getParent(), eResource);
  }
  
  @Override
  public void setParent(final ComponentType o) {
    if (o != null)
    	adaptee.setParent(((ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.ComponentTypeAdapter) o).getAdaptee());
    else adaptee.setParent(null);
  }
  
  @Override
  public void compute() {
    ur1.diverse.xmontiarc.xdsml.xmontiarc.aspects.SubcomponentAspect.compute(adaptee);
  }
  
  @Override
  public EList<Port> getDirectedPorts(final boolean collectIncomingPorts) {
    return fr.inria.diverse.melange.adapters.EListAdapter.newInstance(ur1.diverse.xmontiarc.xdsml.xmontiarc.aspects.SubcomponentHelperAspect.getDirectedPorts(adaptee, collectIncomingPorts
    ), adaptersFactory, eResource);
  }
  
  @Override
  public EList<Port> getIncomingPorts() {
    return fr.inria.diverse.melange.adapters.EListAdapter.newInstance(ur1.diverse.xmontiarc.xdsml.xmontiarc.aspects.SubcomponentHelperAspect.getIncomingPorts(adaptee), adaptersFactory, eResource);
  }
  
  @Override
  public EList<Port> getOutgoingPorts() {
    return fr.inria.diverse.melange.adapters.EListAdapter.newInstance(ur1.diverse.xmontiarc.xdsml.xmontiarc.aspects.SubcomponentHelperAspect.getOutgoingPorts(adaptee), adaptersFactory, eResource);
  }
  
  protected final static String NAME_EDEFAULT = "UnnamedSubcomponent";
  
  @Override
  public EClass eClass() {
    return ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.eINSTANCE.getSubcomponent();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.SUBCOMPONENT__NAME:
    		return getName();
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.SUBCOMPONENT__TYPE:
    		return getType();
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.SUBCOMPONENT__PORTS:
    		return getPorts();
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.SUBCOMPONENT__PARENT:
    		return getParent();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.SUBCOMPONENT__NAME:
    		return getName() != NAME_EDEFAULT;
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.SUBCOMPONENT__TYPE:
    		return getType() != null;
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.SUBCOMPONENT__PORTS:
    		return getPorts() != null && !getPorts().isEmpty();
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.SUBCOMPONENT__PARENT:
    		return getParent() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.SUBCOMPONENT__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.SUBCOMPONENT__TYPE:
    		setType(
    		(ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.ComponentType)
    		 newValue);
    		return;
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.SUBCOMPONENT__PORTS:
    		getPorts().clear();
    		getPorts().addAll((Collection) newValue);
    		return;
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.SUBCOMPONENT__PARENT:
    		setParent(
    		(ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.ComponentType)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
