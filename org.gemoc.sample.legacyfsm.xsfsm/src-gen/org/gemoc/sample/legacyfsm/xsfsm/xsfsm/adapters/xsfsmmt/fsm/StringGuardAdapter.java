package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.XSFSMMTAdaptersFactory;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StringGuard;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.StringVariable;

@SuppressWarnings("all")
public class StringGuardAdapter extends EObjectAdapter<StringGuard> implements org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.StringGuard {
  private XSFSMMTAdaptersFactory adaptersFactory;
  
  public StringGuardAdapter() {
    super(org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.XSFSMMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.XSFSMMTAdaptersFactory.getInstance();
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
  public String getValue() {
    return adaptee.getValue();
  }
  
  @Override
  public void setValue(final String o) {
    adaptee.setValue(o);
  }
  
  @Override
  public StringVariable getSource() {
    return (StringVariable) adaptersFactory.createAdapter(adaptee.getSource(), eResource);
  }
  
  @Override
  public void setSource(final StringVariable o) {
    if (o != null)
    	adaptee.setSource(((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.StringVariableAdapter) o).getAdaptee());
    else adaptee.setSource(null);
  }
  
  @Override
  public boolean holds() {
    return org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StringGuardAspect.holds(adaptee);
  }
  
  protected final static boolean NOT_EDEFAULT = false;
  
  protected final static String VALUE_EDEFAULT = "UnnamedVariable";
  
  @Override
  public EClass eClass() {
    return org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.eINSTANCE.getStringGuard();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.STRING_GUARD__NOT:
    		return isNot() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.STRING_GUARD__VALUE:
    		return getValue();
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.STRING_GUARD__SOURCE:
    		return getSource();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.STRING_GUARD__NOT:
    		return isNot() != NOT_EDEFAULT;
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.STRING_GUARD__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.STRING_GUARD__SOURCE:
    		return getSource() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.STRING_GUARD__NOT:
    		setNot(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.STRING_GUARD__VALUE:
    		setValue(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.STRING_GUARD__SOURCE:
    		setSource(
    		(org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.StringVariable)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
