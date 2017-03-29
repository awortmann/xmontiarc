package org.gemoc.xportautomata.xfsm.xportautomata.adapters.xportautomatamt.fsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.xportautomata.xfsm.xportautomata.adapters.xportautomatamt.XPortAutomataMTAdaptersFactory;
import org.gemoc.xportautomata.xfsm.xportautomata.fsm.StringAction;
import org.gemoc.xportautomata.xfsm.xportautomatamt.fsm.StringVariable;

@SuppressWarnings("all")
public class StringActionAdapter extends EObjectAdapter<StringAction> implements org.gemoc.xportautomata.xfsm.xportautomatamt.fsm.StringAction {
  private XPortAutomataMTAdaptersFactory adaptersFactory;
  
  public StringActionAdapter() {
    super(org.gemoc.xportautomata.xfsm.xportautomata.adapters.xportautomatamt.XPortAutomataMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.xportautomata.xfsm.xportautomata.adapters.xportautomatamt.XPortAutomataMTAdaptersFactory.getInstance();
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
    	adaptee.setTarget(((org.gemoc.xportautomata.xfsm.xportautomata.adapters.xportautomatamt.fsm.StringVariableAdapter) o).getAdaptee());
    else adaptee.setTarget(null);
  }
  
  protected final static String VALUE_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.gemoc.xportautomata.xfsm.xportautomatamt.fsm.FsmPackage.eINSTANCE.getStringAction();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.xportautomata.xfsm.xportautomatamt.fsm.FsmPackage.STRING_ACTION__VALUE:
    		return getValue();
    	case org.gemoc.xportautomata.xfsm.xportautomatamt.fsm.FsmPackage.STRING_ACTION__TARGET:
    		return getTarget();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.xportautomata.xfsm.xportautomatamt.fsm.FsmPackage.STRING_ACTION__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    	case org.gemoc.xportautomata.xfsm.xportautomatamt.fsm.FsmPackage.STRING_ACTION__TARGET:
    		return getTarget() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.xportautomata.xfsm.xportautomatamt.fsm.FsmPackage.STRING_ACTION__VALUE:
    		setValue(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.xportautomata.xfsm.xportautomatamt.fsm.FsmPackage.STRING_ACTION__TARGET:
    		setTarget(
    		(org.gemoc.xportautomata.xfsm.xportautomatamt.fsm.StringVariable)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
