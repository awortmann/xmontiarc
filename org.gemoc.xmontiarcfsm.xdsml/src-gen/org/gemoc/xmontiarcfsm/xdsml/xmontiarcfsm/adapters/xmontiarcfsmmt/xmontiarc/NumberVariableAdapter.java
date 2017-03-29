package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.XMontiArcFSMMTAdaptersFactory;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.NumberVariable;

@SuppressWarnings("all")
public class NumberVariableAdapter extends EObjectAdapter<NumberVariable> implements org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.NumberVariable {
  private XMontiArcFSMMTAdaptersFactory adaptersFactory;
  
  public NumberVariableAdapter() {
    super(org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.XMontiArcFSMMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.XMontiArcFSMMTAdaptersFactory.getInstance();
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
  
  protected final static String NAME_EDEFAULT = "UnnamedVariable";
  
  protected final static long INITIAL_VALUE_EDEFAULT = 0L;
  
  @Override
  public EClass eClass() {
    return org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.eINSTANCE.getNumberVariable();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.NUMBER_VARIABLE__NAME:
    		return getName();
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.NUMBER_VARIABLE__INITIAL_VALUE:
    		return new java.lang.Long(getInitialValue());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.NUMBER_VARIABLE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.NUMBER_VARIABLE__INITIAL_VALUE:
    		return getInitialValue() != INITIAL_VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.NUMBER_VARIABLE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.NUMBER_VARIABLE__INITIAL_VALUE:
    		setInitialValue(((java.lang.Long) newValue).longValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
