package ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.xmontiarc.IncomingConnector;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcmt.xmontiarc.ComponentType;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcmt.xmontiarc.IncomingPort;

@SuppressWarnings("all")
public class IncomingConnectorAdapter extends EObjectAdapter<IncomingConnector> implements ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcmt.xmontiarc.IncomingConnector {
  private XMontiArcMTAdaptersFactory adaptersFactory;
  
  public IncomingConnectorAdapter() {
    super(ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory.getInstance());
    adaptersFactory = ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory.getInstance();
  }
  
  @Override
  public ComponentType getParent() {
    return (ComponentType) adaptersFactory.createAdapter(adaptee.getParent(), eResource);
  }
  
  @Override
  public void setParent(final ComponentType o) {
    if (o != null)
    	adaptee.setParent(((ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.ComponentTypeAdapter) o).getAdaptee());
    else adaptee.setParent(null);
  }
  
  @Override
  public IncomingPort getSource() {
    return (IncomingPort) adaptersFactory.createAdapter(adaptee.getSource(), eResource);
  }
  
  @Override
  public void setSource(final IncomingPort o) {
    if (o != null)
    	adaptee.setSource(((ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.IncomingPortAdapter) o).getAdaptee());
    else adaptee.setSource(null);
  }
  
  @Override
  public IncomingPort getTarget() {
    return (IncomingPort) adaptersFactory.createAdapter(adaptee.getTarget(), eResource);
  }
  
  @Override
  public void setTarget(final IncomingPort o) {
    if (o != null)
    	adaptee.setTarget(((ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc.IncomingPortAdapter) o).getAdaptee());
    else adaptee.setTarget(null);
  }
  
  @Override
  public String getRepresentation() {
    return ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.aspects.ConnectorAspect.getRepresentation(adaptee);
  }
  
  @Override
  public String getSourceRepresentation() {
    return ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.aspects.ConnectorAspect.getSourceRepresentation(adaptee);
  }
  
  @Override
  public String getTargetRepresentation() {
    return ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.aspects.ConnectorAspect.getTargetRepresentation(adaptee);
  }
  
  @Override
  public void update() {
    ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.aspects.ConnectorAspect.update(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.eINSTANCE.getIncomingConnector();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.INCOMING_CONNECTOR__PARENT:
    		return getParent();
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.INCOMING_CONNECTOR__SOURCE:
    		return getSource();
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.INCOMING_CONNECTOR__TARGET:
    		return getTarget();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.INCOMING_CONNECTOR__PARENT:
    		return getParent() != null;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.INCOMING_CONNECTOR__SOURCE:
    		return getSource() != null;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.INCOMING_CONNECTOR__TARGET:
    		return getTarget() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.INCOMING_CONNECTOR__PARENT:
    		setParent(
    		(ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcmt.xmontiarc.ComponentType)
    		 newValue);
    		return;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.INCOMING_CONNECTOR__SOURCE:
    		setSource(
    		(ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcmt.xmontiarc.IncomingPort)
    		 newValue);
    		return;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.INCOMING_CONNECTOR__TARGET:
    		setTarget(
    		(ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcmt.xmontiarc.IncomingPort)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
