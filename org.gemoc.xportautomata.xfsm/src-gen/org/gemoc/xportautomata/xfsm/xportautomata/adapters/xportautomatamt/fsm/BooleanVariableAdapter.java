package org.gemoc.xportautomata.xfsm.xportautomata.adapters.xportautomatamt.fsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.xportautomata.xfsm.xportautomata.adapters.xportautomatamt.XPortAutomataMTAdaptersFactory;
import org.gemoc.xportautomata.xfsm.xportautomata.fsm.BooleanVariable;

@SuppressWarnings("all")
public class BooleanVariableAdapter extends EObjectAdapter<BooleanVariable> implements org.gemoc.xportautomata.xfsm.xportautomatamt.fsm.BooleanVariable {
  private XPortAutomataMTAdaptersFactory adaptersFactory;
  
  public BooleanVariableAdapter() {
    super(org.gemoc.xportautomata.xfsm.xportautomata.adapters.xportautomatamt.XPortAutomataMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.xportautomata.xfsm.xportautomata.adapters.xportautomatamt.XPortAutomataMTAdaptersFactory.getInstance();
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
  public boolean isInitialValue() {
    return adaptee.isInitialValue();
  }
  
  @Override
  public void setInitialValue(final boolean o) {
    adaptee.setInitialValue(o);
  }
  
  protected final static String NAME_EDEFAULT = "UnnamedVariable";
  
  protected final static boolean INITIAL_VALUE_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.gemoc.xportautomata.xfsm.xportautomatamt.fsm.FsmPackage.eINSTANCE.getBooleanVariable();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.xportautomata.xfsm.xportautomatamt.fsm.FsmPackage.BOOLEAN_VARIABLE__NAME:
    		return getName();
    	case org.gemoc.xportautomata.xfsm.xportautomatamt.fsm.FsmPackage.BOOLEAN_VARIABLE__INITIAL_VALUE:
    		return isInitialValue() ? Boolean.TRUE : Boolean.FALSE;
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.xportautomata.xfsm.xportautomatamt.fsm.FsmPackage.BOOLEAN_VARIABLE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.xportautomata.xfsm.xportautomatamt.fsm.FsmPackage.BOOLEAN_VARIABLE__INITIAL_VALUE:
    		return isInitialValue() != INITIAL_VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.xportautomata.xfsm.xportautomatamt.fsm.FsmPackage.BOOLEAN_VARIABLE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.xportautomata.xfsm.xportautomatamt.fsm.FsmPackage.BOOLEAN_VARIABLE__INITIAL_VALUE:
    		setInitialValue(((java.lang.Boolean) newValue).booleanValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
