package ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.sample.legacyfsm.fsm.NumberVariable;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.FSMMTAdaptersFactory;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.NumberGuard;

@SuppressWarnings("all")
public class NumberGuardAdapter extends EObjectAdapter<NumberGuard> implements org.gemoc.sample.legacyfsm.fsm.NumberGuard {
  private FSMMTAdaptersFactory adaptersFactory;
  
  public NumberGuardAdapter() {
    super(ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.FSMMTAdaptersFactory.getInstance());
    adaptersFactory = ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.FSMMTAdaptersFactory.getInstance();
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
    	adaptee.setSource(((ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.NumberVariableAdapter) o).getAdaptee());
    else adaptee.setSource(null);
  }
  
  protected final static boolean NOT_EDEFAULT = false;
  
  protected final static long VALUE_EDEFAULT = -1L;
  
  @Override
  public EClass eClass() {
    return org.gemoc.sample.legacyfsm.fsm.FsmPackage.eINSTANCE.getNumberGuard();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.sample.legacyfsm.fsm.FsmPackage.NUMBER_GUARD__NOT:
    		return isNot() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.sample.legacyfsm.fsm.FsmPackage.NUMBER_GUARD__VALUE:
    		return new java.lang.Long(getValue());
    	case org.gemoc.sample.legacyfsm.fsm.FsmPackage.NUMBER_GUARD__SOURCE:
    		return getSource();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.sample.legacyfsm.fsm.FsmPackage.NUMBER_GUARD__NOT:
    		return isNot() != NOT_EDEFAULT;
    	case org.gemoc.sample.legacyfsm.fsm.FsmPackage.NUMBER_GUARD__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    	case org.gemoc.sample.legacyfsm.fsm.FsmPackage.NUMBER_GUARD__SOURCE:
    		return getSource() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.sample.legacyfsm.fsm.FsmPackage.NUMBER_GUARD__NOT:
    		setNot(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.sample.legacyfsm.fsm.FsmPackage.NUMBER_GUARD__VALUE:
    		setValue(((java.lang.Long) newValue).longValue());
    		return;
    	case org.gemoc.sample.legacyfsm.fsm.FsmPackage.NUMBER_GUARD__SOURCE:
    		setSource(
    		(org.gemoc.sample.legacyfsm.fsm.NumberVariable)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
