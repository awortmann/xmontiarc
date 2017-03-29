package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.XMontiArcFSMMTAdaptersFactory;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.BooleanAction;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.BooleanVariable;

@SuppressWarnings("all")
public class BooleanActionAdapter extends EObjectAdapter<BooleanAction> implements org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.BooleanAction {
  private XMontiArcFSMMTAdaptersFactory adaptersFactory;
  
  public BooleanActionAdapter() {
    super(org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.XMontiArcFSMMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.XMontiArcFSMMTAdaptersFactory.getInstance();
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
  public BooleanVariable getTarget() {
    return (BooleanVariable) adaptersFactory.createAdapter(adaptee.getTarget(), eResource);
  }
  
  @Override
  public void setTarget(final BooleanVariable o) {
    if (o != null)
    	adaptee.setTarget(((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.BooleanVariableAdapter) o).getAdaptee());
    else adaptee.setTarget(null);
  }
  
  protected final static boolean VALUE_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.eINSTANCE.getBooleanAction();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.BOOLEAN_ACTION__VALUE:
    		return isValue() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.BOOLEAN_ACTION__TARGET:
    		return getTarget();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.BOOLEAN_ACTION__VALUE:
    		return isValue() != VALUE_EDEFAULT;
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.BOOLEAN_ACTION__TARGET:
    		return getTarget() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.BOOLEAN_ACTION__VALUE:
    		setValue(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.BOOLEAN_ACTION__TARGET:
    		setTarget(
    		(org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.BooleanVariable)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
