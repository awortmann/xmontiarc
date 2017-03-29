package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.XMontiArcFSMMTAdaptersFactory;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.StringAction;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.StringVariable;

@SuppressWarnings("all")
public class StringActionAdapter extends EObjectAdapter<StringAction> implements org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.StringAction {
  private XMontiArcFSMMTAdaptersFactory adaptersFactory;
  
  public StringActionAdapter() {
    super(org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.XMontiArcFSMMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.XMontiArcFSMMTAdaptersFactory.getInstance();
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
    	adaptee.setTarget(((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.StringVariableAdapter) o).getAdaptee());
    else adaptee.setTarget(null);
  }
  
  protected final static String VALUE_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.eINSTANCE.getStringAction();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.STRING_ACTION__VALUE:
    		return getValue();
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.STRING_ACTION__TARGET:
    		return getTarget();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.STRING_ACTION__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.STRING_ACTION__TARGET:
    		return getTarget() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.STRING_ACTION__VALUE:
    		setValue(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.STRING_ACTION__TARGET:
    		setTarget(
    		(org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.StringVariable)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
