package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.XMontiArcFSMMTAdaptersFactory;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.StringGuard;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.StringVariable;

@SuppressWarnings("all")
public class StringGuardAdapter extends EObjectAdapter<StringGuard> implements org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.StringGuard {
  private XMontiArcFSMMTAdaptersFactory adaptersFactory;
  
  public StringGuardAdapter() {
    super(org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.XMontiArcFSMMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.XMontiArcFSMMTAdaptersFactory.getInstance();
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
    	adaptee.setSource(((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.StringVariableAdapter) o).getAdaptee());
    else adaptee.setSource(null);
  }
  
  protected final static boolean NOT_EDEFAULT = false;
  
  protected final static String VALUE_EDEFAULT = "UnnamedVariable";
  
  @Override
  public EClass eClass() {
    return org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.eINSTANCE.getStringGuard();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.STRING_GUARD__NOT:
    		return isNot() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.STRING_GUARD__VALUE:
    		return getValue();
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.STRING_GUARD__SOURCE:
    		return getSource();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.STRING_GUARD__NOT:
    		return isNot() != NOT_EDEFAULT;
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.STRING_GUARD__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.STRING_GUARD__SOURCE:
    		return getSource() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.STRING_GUARD__NOT:
    		setNot(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.STRING_GUARD__VALUE:
    		setValue(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.STRING_GUARD__SOURCE:
    		setSource(
    		(org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.StringVariable)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
