package org.gemoc.xportautomata.xfsm.xportautomata.adapters.xportautomatamt.fsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.xportautomata.xfsm.xportautomata.adapters.xportautomatamt.XPortAutomataMTAdaptersFactory;
import org.gemoc.xportautomata.xfsm.xportautomata.fsm.Variable;

@SuppressWarnings("all")
public class VariableAdapter extends EObjectAdapter<Variable> implements org.gemoc.xportautomata.xfsm.xportautomatamt.fsm.Variable {
  private XPortAutomataMTAdaptersFactory adaptersFactory;
  
  public VariableAdapter() {
    super(org.gemoc.xportautomata.xfsm.xportautomata.adapters.xportautomatamt.XPortAutomataMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.xportautomata.xfsm.xportautomata.adapters.xportautomatamt.XPortAutomataMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  protected final static String NAME_EDEFAULT = "UnnamedVariable";
  
  @Override
  public EClass eClass() {
    return org.gemoc.xportautomata.xfsm.xportautomatamt.fsm.FsmPackage.eINSTANCE.getVariable();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.xportautomata.xfsm.xportautomatamt.fsm.FsmPackage.VARIABLE__NAME:
    		return getName();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.xportautomata.xfsm.xportautomatamt.fsm.FsmPackage.VARIABLE__NAME:
    		return getName() != NAME_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.xportautomata.xfsm.xportautomatamt.fsm.FsmPackage.VARIABLE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
