package org.gemoc.xportautomata.xdsml.xportautomata.adapters.xportautomatamt.fsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.xportautomata.xdsml.xportautomata.adapters.xportautomatamt.XPortAutomataMTAdaptersFactory;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.StringVariable;

@SuppressWarnings("all")
public class StringVariableAdapter extends EObjectAdapter<StringVariable> implements org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.StringVariable {
  private XPortAutomataMTAdaptersFactory adaptersFactory;
  
  public StringVariableAdapter() {
    super(org.gemoc.xportautomata.xdsml.xportautomata.adapters.xportautomatamt.XPortAutomataMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.xportautomata.xdsml.xportautomata.adapters.xportautomatamt.XPortAutomataMTAdaptersFactory.getInstance();
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
  public String getInitialValue() {
    return adaptee.getInitialValue();
  }
  
  @Override
  public void setInitialValue(final String o) {
    adaptee.setInitialValue(o);
  }
  
  @Override
  public String getValue() {
    return org.gemoc.xportautomata.xdsml.xportautomata.aspects.StringVariableAspect.value(adaptee);
  }
  
  @Override
  public void setValue(final String value) {
    org.gemoc.xportautomata.xdsml.xportautomata.aspects.StringVariableAspect.value(adaptee, value
    );
  }
  
  protected final static String NAME_EDEFAULT = "UnnamedVariable";
  
  protected final static String INITIAL_VALUE_EDEFAULT = null;
  
  protected final static String VALUE_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.FsmPackage.eINSTANCE.getStringVariable();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.FsmPackage.STRING_VARIABLE__NAME:
    		return getName();
    	case org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.FsmPackage.STRING_VARIABLE__INITIAL_VALUE:
    		return getInitialValue();
    	case org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.FsmPackage.STRING_VARIABLE__VALUE:
    		return getValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.FsmPackage.STRING_VARIABLE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.FsmPackage.STRING_VARIABLE__INITIAL_VALUE:
    		return getInitialValue() != INITIAL_VALUE_EDEFAULT;
    	case org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.FsmPackage.STRING_VARIABLE__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.FsmPackage.STRING_VARIABLE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.FsmPackage.STRING_VARIABLE__INITIAL_VALUE:
    		setInitialValue(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.FsmPackage.STRING_VARIABLE__VALUE:
    		setValue(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
