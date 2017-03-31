package org.gemoc.xportautomata.xdsml.xportautomata.adapters.xportautomatamt.fsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.xportautomata.xdsml.xportautomata.adapters.xportautomatamt.XPortAutomataMTAdaptersFactory;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.BooleanVariable;

@SuppressWarnings("all")
public class BooleanVariableAdapter extends EObjectAdapter<BooleanVariable> implements org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.BooleanVariable {
  private XPortAutomataMTAdaptersFactory adaptersFactory;
  
  public BooleanVariableAdapter() {
    super(org.gemoc.xportautomata.xdsml.xportautomata.adapters.xportautomatamt.XPortAutomataMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.xportautomata.xdsml.xportautomata.adapters.xportautomatamt.XPortAutomataMTAdaptersFactory.getInstance();
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
  
  @Override
  public Boolean getValue() {
    return org.gemoc.xportautomata.xdsml.xportautomata.aspects.BooleanVariableAspect.value(adaptee);
  }
  
  @Override
  public void setValue(final Boolean value) {
    org.gemoc.xportautomata.xdsml.xportautomata.aspects.BooleanVariableAspect.value(adaptee, value
    );
  }
  
  protected final static String NAME_EDEFAULT = "UnnamedVariable";
  
  protected final static boolean INITIAL_VALUE_EDEFAULT = false;
  
  protected final static Boolean VALUE_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.FsmPackage.eINSTANCE.getBooleanVariable();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.FsmPackage.BOOLEAN_VARIABLE__NAME:
    		return getName();
    	case org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.FsmPackage.BOOLEAN_VARIABLE__INITIAL_VALUE:
    		return isInitialValue() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.FsmPackage.BOOLEAN_VARIABLE__VALUE:
    		return getValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.FsmPackage.BOOLEAN_VARIABLE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.FsmPackage.BOOLEAN_VARIABLE__INITIAL_VALUE:
    		return isInitialValue() != INITIAL_VALUE_EDEFAULT;
    	case org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.FsmPackage.BOOLEAN_VARIABLE__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.FsmPackage.BOOLEAN_VARIABLE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.FsmPackage.BOOLEAN_VARIABLE__INITIAL_VALUE:
    		setInitialValue(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.FsmPackage.BOOLEAN_VARIABLE__VALUE:
    		setValue(
    		(java.lang.Boolean)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}