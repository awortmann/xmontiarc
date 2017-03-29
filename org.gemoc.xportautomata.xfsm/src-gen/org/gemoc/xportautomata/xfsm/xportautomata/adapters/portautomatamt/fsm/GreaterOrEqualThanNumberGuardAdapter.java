package org.gemoc.xportautomata.xfsm.xportautomata.adapters.portautomatamt.fsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.portautomata.fsm.NumberVariable;
import org.gemoc.xportautomata.xfsm.xportautomata.adapters.portautomatamt.PortAutomataMTAdaptersFactory;
import org.gemoc.xportautomata.xfsm.xportautomata.fsm.GreaterOrEqualThanNumberGuard;

@SuppressWarnings("all")
public class GreaterOrEqualThanNumberGuardAdapter extends EObjectAdapter<GreaterOrEqualThanNumberGuard> implements org.gemoc.portautomata.fsm.GreaterOrEqualThanNumberGuard {
  private PortAutomataMTAdaptersFactory adaptersFactory;
  
  public GreaterOrEqualThanNumberGuardAdapter() {
    super(org.gemoc.xportautomata.xfsm.xportautomata.adapters.portautomatamt.PortAutomataMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.xportautomata.xfsm.xportautomata.adapters.portautomatamt.PortAutomataMTAdaptersFactory.getInstance();
  }
  
  @Override
  public boolean isNot() {
    return adaptee.isNot();
  }
  
  @Override
  public void setNot(final boolean o) {
    adaptee.setNot(o);
  }
  
  @Override
  public long getValue() {
    return adaptee.getValue();
  }
  
  @Override
  public void setValue(final long o) {
    adaptee.setValue(o);
  }
  
  @Override
  public NumberVariable getSource() {
    return (NumberVariable) adaptersFactory.createAdapter(adaptee.getSource(), eResource);
  }
  
  @Override
  public void setSource(final NumberVariable o) {
    if (o != null)
    	adaptee.setSource(((org.gemoc.xportautomata.xfsm.xportautomata.adapters.portautomatamt.fsm.NumberVariableAdapter) o).getAdaptee());
    else adaptee.setSource(null);
  }
  
  protected final static boolean NOT_EDEFAULT = false;
  
  protected final static long VALUE_EDEFAULT = -1L;
  
  @Override
  public EClass eClass() {
    return org.gemoc.portautomata.fsm.fsmPackage.eINSTANCE.getGreaterOrEqualThanNumberGuard();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.portautomata.fsm.fsmPackage.GREATER_OR_EQUAL_THAN_NUMBER_GUARD__NOT:
    		return isNot() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.portautomata.fsm.fsmPackage.GREATER_OR_EQUAL_THAN_NUMBER_GUARD__VALUE:
    		return new java.lang.Long(getValue());
    	case org.gemoc.portautomata.fsm.fsmPackage.GREATER_OR_EQUAL_THAN_NUMBER_GUARD__SOURCE:
    		return getSource();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.portautomata.fsm.fsmPackage.GREATER_OR_EQUAL_THAN_NUMBER_GUARD__NOT:
    		return isNot() != NOT_EDEFAULT;
    	case org.gemoc.portautomata.fsm.fsmPackage.GREATER_OR_EQUAL_THAN_NUMBER_GUARD__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    	case org.gemoc.portautomata.fsm.fsmPackage.GREATER_OR_EQUAL_THAN_NUMBER_GUARD__SOURCE:
    		return getSource() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.portautomata.fsm.fsmPackage.GREATER_OR_EQUAL_THAN_NUMBER_GUARD__NOT:
    		setNot(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.portautomata.fsm.fsmPackage.GREATER_OR_EQUAL_THAN_NUMBER_GUARD__VALUE:
    		setValue(((java.lang.Long) newValue).longValue());
    		return;
    	case org.gemoc.portautomata.fsm.fsmPackage.GREATER_OR_EQUAL_THAN_NUMBER_GUARD__SOURCE:
    		setSource(
    		(org.gemoc.portautomata.fsm.NumberVariable)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
