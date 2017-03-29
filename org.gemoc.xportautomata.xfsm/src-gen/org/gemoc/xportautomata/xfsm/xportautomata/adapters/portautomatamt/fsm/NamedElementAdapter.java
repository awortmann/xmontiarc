package org.gemoc.xportautomata.xfsm.xportautomata.adapters.portautomatamt.fsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.xportautomata.xfsm.xportautomata.adapters.portautomatamt.PortAutomataMTAdaptersFactory;
import org.gemoc.xportautomata.xfsm.xportautomata.fsm.NamedElement;

@SuppressWarnings("all")
public class NamedElementAdapter extends EObjectAdapter<NamedElement> implements org.gemoc.portautomata.fsm.NamedElement {
  private PortAutomataMTAdaptersFactory adaptersFactory;
  
  public NamedElementAdapter() {
    super(org.gemoc.xportautomata.xfsm.xportautomata.adapters.portautomatamt.PortAutomataMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.xportautomata.xfsm.xportautomata.adapters.portautomatamt.PortAutomataMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.gemoc.portautomata.fsm.fsmPackage.eINSTANCE.getNamedElement();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.portautomata.fsm.fsmPackage.NAMED_ELEMENT__NAME:
    		return getName();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.portautomata.fsm.fsmPackage.NAMED_ELEMENT__NAME:
    		return getName() != NAME_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.portautomata.fsm.fsmPackage.NAMED_ELEMENT__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
