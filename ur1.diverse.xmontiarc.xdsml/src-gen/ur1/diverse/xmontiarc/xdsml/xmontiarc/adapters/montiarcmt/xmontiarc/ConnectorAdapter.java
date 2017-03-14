package ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.xmontiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.MontiArcMTAdaptersFactory;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.Connector;
import xmontiarc.ComponentType;
import xmontiarc.Port;

@SuppressWarnings("all")
public class ConnectorAdapter extends EObjectAdapter<Connector> implements xmontiarc.Connector {
  private MontiArcMTAdaptersFactory adaptersFactory;
  
  public ConnectorAdapter() {
    super(ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.MontiArcMTAdaptersFactory.getInstance());
    adaptersFactory = ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.MontiArcMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Port getSource() {
    return (Port) adaptersFactory.createAdapter(adaptee.getSource(), eResource);
  }
  
  @Override
  public void setSource(final Port o) {
    if (o != null)
    	adaptee.setSource(((ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.xmontiarc.PortAdapter) o).getAdaptee());
    else adaptee.setSource(null);
  }
  
  @Override
  public Port getTarget() {
    return (Port) adaptersFactory.createAdapter(adaptee.getTarget(), eResource);
  }
  
  @Override
  public void setTarget(final Port o) {
    if (o != null)
    	adaptee.setTarget(((ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.xmontiarc.PortAdapter) o).getAdaptee());
    else adaptee.setTarget(null);
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
  
  @Override
  public EClass eClass() {
    return xmontiarc.XmontiarcPackage.eINSTANCE.getConnector();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case xmontiarc.XmontiarcPackage.CONNECTOR__SOURCE:
    		return getSource();
    	case xmontiarc.XmontiarcPackage.CONNECTOR__TARGET:
    		return getTarget();
    	case xmontiarc.XmontiarcPackage.CONNECTOR__PARENT:
    		return getParent();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case xmontiarc.XmontiarcPackage.CONNECTOR__SOURCE:
    		return getSource() != null;
    	case xmontiarc.XmontiarcPackage.CONNECTOR__TARGET:
    		return getTarget() != null;
    	case xmontiarc.XmontiarcPackage.CONNECTOR__PARENT:
    		return getParent() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case xmontiarc.XmontiarcPackage.CONNECTOR__SOURCE:
    		setSource(
    		(xmontiarc.Port)
    		 newValue);
    		return;
    	case xmontiarc.XmontiarcPackage.CONNECTOR__TARGET:
    		setTarget(
    		(xmontiarc.Port)
    		 newValue);
    		return;
    	case xmontiarc.XmontiarcPackage.CONNECTOR__PARENT:
    		setParent(
    		(xmontiarc.ComponentType)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
