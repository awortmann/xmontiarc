package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.sample.legacyfsm.fsm.BooleanVariable;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.FSMMTAdaptersFactory;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.BooleanGuard;

@SuppressWarnings("all")
public class BooleanGuardAdapter extends EObjectAdapter<BooleanGuard> implements org.gemoc.sample.legacyfsm.fsm.BooleanGuard {
  private FSMMTAdaptersFactory adaptersFactory;
  
  public BooleanGuardAdapter() {
    super(org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.FSMMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.FSMMTAdaptersFactory.getInstance();
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
  public boolean isValue() {
    return adaptee.isValue();
  }
  
  @Override
  public void setValue(final boolean o) {
    adaptee.setValue(o);
  }
  
  @Override
  public BooleanVariable getSource() {
    return (BooleanVariable) adaptersFactory.createAdapter(adaptee.getSource(), eResource);
  }
  
  @Override
  public void setSource(final BooleanVariable o) {
    if (o != null)
    	adaptee.setSource(((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.BooleanVariableAdapter) o).getAdaptee());
    else adaptee.setSource(null);
  }
  
  protected final static boolean NOT_EDEFAULT = false;
  
  protected final static boolean VALUE_EDEFAULT = true;
  
  @Override
  public EClass eClass() {
    return org.gemoc.sample.legacyfsm.fsm.FsmPackage.eINSTANCE.getBooleanGuard();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.sample.legacyfsm.fsm.FsmPackage.BOOLEAN_GUARD__NOT:
    		return isNot() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.sample.legacyfsm.fsm.FsmPackage.BOOLEAN_GUARD__VALUE:
    		return isValue() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.sample.legacyfsm.fsm.FsmPackage.BOOLEAN_GUARD__SOURCE:
    		return getSource();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.sample.legacyfsm.fsm.FsmPackage.BOOLEAN_GUARD__NOT:
    		return isNot() != NOT_EDEFAULT;
    	case org.gemoc.sample.legacyfsm.fsm.FsmPackage.BOOLEAN_GUARD__VALUE:
    		return isValue() != VALUE_EDEFAULT;
    	case org.gemoc.sample.legacyfsm.fsm.FsmPackage.BOOLEAN_GUARD__SOURCE:
    		return getSource() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.sample.legacyfsm.fsm.FsmPackage.BOOLEAN_GUARD__NOT:
    		setNot(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.sample.legacyfsm.fsm.FsmPackage.BOOLEAN_GUARD__VALUE:
    		setValue(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.sample.legacyfsm.fsm.FsmPackage.BOOLEAN_GUARD__SOURCE:
    		setSource(
    		(org.gemoc.sample.legacyfsm.fsm.BooleanVariable)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
