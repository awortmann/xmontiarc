package org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.portautomata.fsm.StringVariable;
import org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.PortAutomataMTAdaptersFactory;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.StringAction;

@SuppressWarnings("all")
public class StringActionAdapter extends EObjectAdapter<StringAction> implements org.gemoc.portautomata.fsm.StringAction {
  private PortAutomataMTAdaptersFactory adaptersFactory;
  
  public StringActionAdapter() {
    super(org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.PortAutomataMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.PortAutomataMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getValue() {
    return adaptee.getValue();
  }
  
  @Override
  public void setValue(final String o) {
    adaptee.setValue(o);
  }
  
  @Override
  public StringVariable getTarget() {
    return (StringVariable) adaptersFactory.createAdapter(adaptee.getTarget(), eResource);
  }
  
  @Override
  public void setTarget(final StringVariable o) {
    if (o != null)
    	adaptee.setTarget(((org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.StringVariableAdapter) o).getAdaptee());
    else adaptee.setTarget(null);
  }
  
  protected final static String VALUE_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.gemoc.portautomata.fsm.fsmPackage.eINSTANCE.getStringAction();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.portautomata.fsm.fsmPackage.STRING_ACTION__VALUE:
    		return getValue();
    	case org.gemoc.portautomata.fsm.fsmPackage.STRING_ACTION__TARGET:
    		return getTarget();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.portautomata.fsm.fsmPackage.STRING_ACTION__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    	case org.gemoc.portautomata.fsm.fsmPackage.STRING_ACTION__TARGET:
    		return getTarget() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.portautomata.fsm.fsmPackage.STRING_ACTION__VALUE:
    		setValue(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.portautomata.fsm.fsmPackage.STRING_ACTION__TARGET:
    		setTarget(
    		(org.gemoc.portautomata.fsm.StringVariable)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
