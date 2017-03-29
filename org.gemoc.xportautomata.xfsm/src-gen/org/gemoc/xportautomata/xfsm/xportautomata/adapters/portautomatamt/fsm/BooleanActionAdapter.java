package org.gemoc.xportautomata.xfsm.xportautomata.adapters.portautomatamt.fsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.portautomata.fsm.BooleanVariable;
import org.gemoc.xportautomata.xfsm.xportautomata.adapters.portautomatamt.PortAutomataMTAdaptersFactory;
import org.gemoc.xportautomata.xfsm.xportautomata.fsm.BooleanAction;

@SuppressWarnings("all")
public class BooleanActionAdapter extends EObjectAdapter<BooleanAction> implements org.gemoc.portautomata.fsm.BooleanAction {
  private PortAutomataMTAdaptersFactory adaptersFactory;
  
  public BooleanActionAdapter() {
    super(org.gemoc.xportautomata.xfsm.xportautomata.adapters.portautomatamt.PortAutomataMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.xportautomata.xfsm.xportautomata.adapters.portautomatamt.PortAutomataMTAdaptersFactory.getInstance();
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
    	adaptee.setTarget(((org.gemoc.xportautomata.xfsm.xportautomata.adapters.portautomatamt.fsm.BooleanVariableAdapter) o).getAdaptee());
    else adaptee.setTarget(null);
  }
  
  protected final static boolean VALUE_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.gemoc.portautomata.fsm.fsmPackage.eINSTANCE.getBooleanAction();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.portautomata.fsm.fsmPackage.BOOLEAN_ACTION__VALUE:
    		return isValue() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.portautomata.fsm.fsmPackage.BOOLEAN_ACTION__TARGET:
    		return getTarget();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.portautomata.fsm.fsmPackage.BOOLEAN_ACTION__VALUE:
    		return isValue() != VALUE_EDEFAULT;
    	case org.gemoc.portautomata.fsm.fsmPackage.BOOLEAN_ACTION__TARGET:
    		return getTarget() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.portautomata.fsm.fsmPackage.BOOLEAN_ACTION__VALUE:
    		setValue(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.portautomata.fsm.fsmPackage.BOOLEAN_ACTION__TARGET:
    		setTarget(
    		(org.gemoc.portautomata.fsm.BooleanVariable)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
