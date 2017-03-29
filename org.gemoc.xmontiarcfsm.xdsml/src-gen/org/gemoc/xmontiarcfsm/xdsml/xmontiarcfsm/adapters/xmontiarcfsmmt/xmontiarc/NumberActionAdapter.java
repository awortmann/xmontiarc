package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.XMontiArcFSMMTAdaptersFactory;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.NumberAction;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.NumberVariable;

@SuppressWarnings("all")
public class NumberActionAdapter extends EObjectAdapter<NumberAction> implements org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.NumberAction {
  private XMontiArcFSMMTAdaptersFactory adaptersFactory;
  
  public NumberActionAdapter() {
    super(org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.XMontiArcFSMMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.XMontiArcFSMMTAdaptersFactory.getInstance();
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
  public String getExpression() {
    return adaptee.getExpression();
  }
  
  @Override
  public void setExpression(final String o) {
    adaptee.setExpression(o);
  }
  
  @Override
  public NumberVariable getTarget() {
    return (NumberVariable) adaptersFactory.createAdapter(adaptee.getTarget(), eResource);
  }
  
  @Override
  public void setTarget(final NumberVariable o) {
    if (o != null)
    	adaptee.setTarget(((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.NumberVariableAdapter) o).getAdaptee());
    else adaptee.setTarget(null);
  }
  
  protected final static long VALUE_EDEFAULT = 0L;
  
  protected final static String EXPRESSION_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.eINSTANCE.getNumberAction();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.NUMBER_ACTION__VALUE:
    		return new java.lang.Long(getValue());
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.NUMBER_ACTION__TARGET:
    		return getTarget();
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.NUMBER_ACTION__EXPRESSION:
    		return getExpression();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.NUMBER_ACTION__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.NUMBER_ACTION__TARGET:
    		return getTarget() != null;
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.NUMBER_ACTION__EXPRESSION:
    		return getExpression() != EXPRESSION_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.NUMBER_ACTION__VALUE:
    		setValue(((java.lang.Long) newValue).longValue());
    		return;
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.NUMBER_ACTION__TARGET:
    		setTarget(
    		(org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.NumberVariable)
    		 newValue);
    		return;
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.NUMBER_ACTION__EXPRESSION:
    		setExpression(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
