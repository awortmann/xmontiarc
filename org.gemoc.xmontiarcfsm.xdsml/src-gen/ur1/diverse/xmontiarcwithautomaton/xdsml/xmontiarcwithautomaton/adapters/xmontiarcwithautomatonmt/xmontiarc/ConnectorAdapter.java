package ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.xmontiarcwithautomatonmt.xmontiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.xmontiarcwithautomatonmt.XMontiArcWithAutomatonMTAdaptersFactory;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.Connector;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.ComponentType;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.Port;

@SuppressWarnings("all")
public class ConnectorAdapter extends EObjectAdapter<Connector> implements ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.Connector {
  private XMontiArcWithAutomatonMTAdaptersFactory adaptersFactory;
  
  public ConnectorAdapter() {
    super(ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.xmontiarcwithautomatonmt.XMontiArcWithAutomatonMTAdaptersFactory.getInstance());
    adaptersFactory = ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.xmontiarcwithautomatonmt.XMontiArcWithAutomatonMTAdaptersFactory.getInstance();
  }
  
  @Override
  public ComponentType getParent() {
    return (ComponentType) adaptersFactory.createAdapter(adaptee.getParent(), eResource);
  }
  
  @Override
  public void setParent(final ComponentType o) {
    if (o != null)
    	adaptee.setParent(((ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.xmontiarcwithautomatonmt.xmontiarc.ComponentTypeAdapter) o).getAdaptee());
    else adaptee.setParent(null);
  }
  
  @Override
  public String getRepresentation() {
    return ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.ConnectorAspect.getRepresentation(adaptee);
  }
  
  @Override
  public Port getSource() {
    return (Port) adaptersFactory.createAdapter(ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.ConnectorAspect.getSource(adaptee), eResource);
  }
  
  @Override
  public String getSourceRepresentation() {
    return ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.ConnectorAspect.getSourceRepresentation(adaptee);
  }
  
  @Override
  public Port getTarget() {
    return (Port) adaptersFactory.createAdapter(ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.ConnectorAspect.getTarget(adaptee), eResource);
  }
  
  @Override
  public String getTargetRepresentation() {
    return ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.ConnectorAspect.getTargetRepresentation(adaptee);
  }
  
  @Override
  public void update() {
    ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.ConnectorAspect.update(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.eINSTANCE.getConnector();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.CONNECTOR__PARENT:
    		return getParent();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.CONNECTOR__PARENT:
    		return getParent() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.CONNECTOR__PARENT:
    		setParent(
    		(ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.ComponentType)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
