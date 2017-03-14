package ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.Connector;
import ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.ComponentType;
import ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Port;

@SuppressWarnings("all")
public class ConnectorAdapter extends EObjectAdapter<Connector> implements ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Connector {
  private XMontiArcMTAdaptersFactory adaptersFactory;
  
  public ConnectorAdapter() {
    super(ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory.getInstance());
    adaptersFactory = ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Port getSource() {
    return (Port) adaptersFactory.createAdapter(adaptee.getSource(), eResource);
  }
  
  @Override
  public void setSource(final Port o) {
    if (o != null)
    	adaptee.setSource(((ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.PortAdapter) o).getAdaptee());
    else adaptee.setSource(null);
  }
  
  @Override
  public Port getTarget() {
    return (Port) adaptersFactory.createAdapter(adaptee.getTarget(), eResource);
  }
  
  @Override
  public void setTarget(final Port o) {
    if (o != null)
    	adaptee.setTarget(((ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.PortAdapter) o).getAdaptee());
    else adaptee.setTarget(null);
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
  public void update() {
    ur1.diverse.xmontiarc.xdsml.xmontiarc.aspects.ConnectorAspect.update(adaptee);
  }
  
  @Override
  public String getRepresentation() {
    return ur1.diverse.xmontiarc.xdsml.xmontiarc.aspects.ConnectorHelperAspect.getRepresentation(adaptee);
  }
  
  @Override
  public String getSourceRepresentation() {
    return ur1.diverse.xmontiarc.xdsml.xmontiarc.aspects.ConnectorHelperAspect.getSourceRepresentation(adaptee);
  }
  
  @Override
  public String getTargetRepresentation() {
    return ur1.diverse.xmontiarc.xdsml.xmontiarc.aspects.ConnectorHelperAspect.getTargetRepresentation(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.eINSTANCE.getConnector();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.CONNECTOR__SOURCE:
    		return getSource();
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.CONNECTOR__TARGET:
    		return getTarget();
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.CONNECTOR__PARENT:
    		return getParent();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.CONNECTOR__SOURCE:
    		return getSource() != null;
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.CONNECTOR__TARGET:
    		return getTarget() != null;
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.CONNECTOR__PARENT:
    		return getParent() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.CONNECTOR__SOURCE:
    		setSource(
    		(ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Port)
    		 newValue);
    		return;
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.CONNECTOR__TARGET:
    		setTarget(
    		(ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Port)
    		 newValue);
    		return;
    	case ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.CONNECTOR__PARENT:
    		setParent(
    		(ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.ComponentType)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
