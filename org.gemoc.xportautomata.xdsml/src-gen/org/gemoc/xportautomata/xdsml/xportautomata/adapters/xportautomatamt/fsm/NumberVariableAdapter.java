package org.gemoc.xportautomata.xdsml.xportautomata.adapters.xportautomatamt.fsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.xportautomata.xdsml.xportautomata.adapters.xportautomatamt.XPortAutomataMTAdaptersFactory;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.NumberVariable;

@SuppressWarnings("all")
public class NumberVariableAdapter extends EObjectAdapter<NumberVariable> implements org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.NumberVariable {
  private XPortAutomataMTAdaptersFactory adaptersFactory;
  
  public NumberVariableAdapter() {
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
  public long getInitialValue() {
    return adaptee.getInitialValue();
  }
  
  @Override
  public void setInitialValue(final long o) {
    adaptee.setInitialValue(o);
  }
  
  @Override
  public Long getValue() {
    return org.gemoc.xportautomata.xdsml.xportautomata.aspects.NumberVariableAspect.value(adaptee);
  }
  
  @Override
  public void setValue(final Long value) {
    org.gemoc.xportautomata.xdsml.xportautomata.aspects.NumberVariableAspect.value(adaptee, value
    );
  }
  
  protected final static String NAME_EDEFAULT = "UnnamedVariable";
  
  protected final static long INITIAL_VALUE_EDEFAULT = 0L;
  
  protected final static Long VALUE_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.FsmPackage.eINSTANCE.getNumberVariable();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.FsmPackage.NUMBER_VARIABLE__NAME:
    		return getName();
    	case org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.FsmPackage.NUMBER_VARIABLE__INITIAL_VALUE:
    		return new java.lang.Long(getInitialValue());
    	case org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.FsmPackage.NUMBER_VARIABLE__VALUE:
    		return getValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.FsmPackage.NUMBER_VARIABLE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.FsmPackage.NUMBER_VARIABLE__INITIAL_VALUE:
    		return getInitialValue() != INITIAL_VALUE_EDEFAULT;
    	case org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.FsmPackage.NUMBER_VARIABLE__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.FsmPackage.NUMBER_VARIABLE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.FsmPackage.NUMBER_VARIABLE__INITIAL_VALUE:
    		setInitialValue(((java.lang.Long) newValue).longValue());
    		return;
    	case org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.FsmPackage.NUMBER_VARIABLE__VALUE:
    		setValue(
    		(java.lang.Long)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
