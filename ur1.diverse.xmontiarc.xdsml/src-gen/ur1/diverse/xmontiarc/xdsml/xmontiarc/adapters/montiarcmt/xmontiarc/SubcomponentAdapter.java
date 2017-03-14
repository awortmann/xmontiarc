package ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.xmontiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.MontiArcMTAdaptersFactory;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.Subcomponent;
import xmontiarc.ComponentType;
import xmontiarc.Port;

@SuppressWarnings("all")
public class SubcomponentAdapter extends EObjectAdapter<Subcomponent> implements xmontiarc.Subcomponent {
  private MontiArcMTAdaptersFactory adaptersFactory;
  
  public SubcomponentAdapter() {
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
  public ComponentType getType() {
    return (ComponentType) adaptersFactory.createAdapter(adaptee.getType(), eResource);
  }
  
  @Override
  public void setType(final ComponentType o) {
    if (o != null)
    	adaptee.setType(((ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.xmontiarc.ComponentTypeAdapter) o).getAdaptee());
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
    	adaptee.setParent(((ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.xmontiarc.ComponentTypeAdapter) o).getAdaptee());
    else adaptee.setParent(null);
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
    	case xmontiarc.XmontiarcPackage.SUBCOMPONENT__PORTS:
    		return getPorts();
    	case xmontiarc.XmontiarcPackage.SUBCOMPONENT__PARENT:
    		return getParent();
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
    	case xmontiarc.XmontiarcPackage.SUBCOMPONENT__PORTS:
    		return getPorts() != null && !getPorts().isEmpty();
    	case xmontiarc.XmontiarcPackage.SUBCOMPONENT__PARENT:
    		return getParent() != null;
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
    	case xmontiarc.XmontiarcPackage.SUBCOMPONENT__PORTS:
    		getPorts().clear();
    		getPorts().addAll((Collection) newValue);
    		return;
    	case xmontiarc.XmontiarcPackage.SUBCOMPONENT__PARENT:
    		setParent(
    		(xmontiarc.ComponentType)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
