package org.gemoc.xportautomata.xfsm.xportautomata.adapters.portautomatamt.fsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.portautomata.fsm.Action;
import org.gemoc.portautomata.fsm.Guard;
import org.gemoc.portautomata.fsm.State;
import org.gemoc.xportautomata.xfsm.xportautomata.adapters.portautomatamt.PortAutomataMTAdaptersFactory;
import org.gemoc.xportautomata.xfsm.xportautomata.fsm.Transition;

@SuppressWarnings("all")
public class TransitionAdapter extends EObjectAdapter<Transition> implements org.gemoc.portautomata.fsm.Transition {
  private PortAutomataMTAdaptersFactory adaptersFactory;
  
  public TransitionAdapter() {
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
  
  @Override
  public String getInput() {
    return adaptee.getInput();
  }
  
  @Override
  public void setInput(final String o) {
    adaptee.setInput(o);
  }
  
  @Override
  public String getOutput() {
    return adaptee.getOutput();
  }
  
  @Override
  public void setOutput(final String o) {
    adaptee.setOutput(o);
  }
  
  @Override
  public State getSource() {
    return (State) adaptersFactory.createAdapter(adaptee.getSource(), eResource);
  }
  
  @Override
  public void setSource(final State o) {
    if (o != null)
    	adaptee.setSource(((org.gemoc.xportautomata.xfsm.xportautomata.adapters.portautomatamt.fsm.StateAdapter) o).getAdaptee());
    else adaptee.setSource(null);
  }
  
  @Override
  public State getTarget() {
    return (State) adaptersFactory.createAdapter(adaptee.getTarget(), eResource);
  }
  
  @Override
  public void setTarget(final State o) {
    if (o != null)
    	adaptee.setTarget(((org.gemoc.xportautomata.xfsm.xportautomata.adapters.portautomatamt.fsm.StateAdapter) o).getAdaptee());
    else adaptee.setTarget(null);
  }
  
  @Override
  public Guard getGuard() {
    return (Guard) adaptersFactory.createAdapter(adaptee.getGuard(), eResource);
  }
  
  @Override
  public void setGuard(final Guard o) {
    if (o != null)
    	adaptee.setGuard(((org.gemoc.xportautomata.xfsm.xportautomata.adapters.portautomatamt.fsm.GuardAdapter) o).getAdaptee());
    else adaptee.setGuard(null);
  }
  
  @Override
  public Action getAction() {
    return (Action) adaptersFactory.createAdapter(adaptee.getAction(), eResource);
  }
  
  @Override
  public void setAction(final Action o) {
    if (o != null)
    	adaptee.setAction(((org.gemoc.xportautomata.xfsm.xportautomata.adapters.portautomatamt.fsm.ActionAdapter) o).getAdaptee());
    else adaptee.setAction(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static String INPUT_EDEFAULT = null;
  
  protected final static String OUTPUT_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.gemoc.portautomata.fsm.fsmPackage.eINSTANCE.getTransition();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.portautomata.fsm.fsmPackage.TRANSITION__NAME:
    		return getName();
    	case org.gemoc.portautomata.fsm.fsmPackage.TRANSITION__SOURCE:
    		return getSource();
    	case org.gemoc.portautomata.fsm.fsmPackage.TRANSITION__TARGET:
    		return getTarget();
    	case org.gemoc.portautomata.fsm.fsmPackage.TRANSITION__INPUT:
    		return getInput();
    	case org.gemoc.portautomata.fsm.fsmPackage.TRANSITION__OUTPUT:
    		return getOutput();
    	case org.gemoc.portautomata.fsm.fsmPackage.TRANSITION__GUARD:
    		return getGuard();
    	case org.gemoc.portautomata.fsm.fsmPackage.TRANSITION__ACTION:
    		return getAction();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.portautomata.fsm.fsmPackage.TRANSITION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.portautomata.fsm.fsmPackage.TRANSITION__SOURCE:
    		return getSource() != null;
    	case org.gemoc.portautomata.fsm.fsmPackage.TRANSITION__TARGET:
    		return getTarget() != null;
    	case org.gemoc.portautomata.fsm.fsmPackage.TRANSITION__INPUT:
    		return getInput() != INPUT_EDEFAULT;
    	case org.gemoc.portautomata.fsm.fsmPackage.TRANSITION__OUTPUT:
    		return getOutput() != OUTPUT_EDEFAULT;
    	case org.gemoc.portautomata.fsm.fsmPackage.TRANSITION__GUARD:
    		return getGuard() != null;
    	case org.gemoc.portautomata.fsm.fsmPackage.TRANSITION__ACTION:
    		return getAction() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.portautomata.fsm.fsmPackage.TRANSITION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.portautomata.fsm.fsmPackage.TRANSITION__SOURCE:
    		setSource(
    		(org.gemoc.portautomata.fsm.State)
    		 newValue);
    		return;
    	case org.gemoc.portautomata.fsm.fsmPackage.TRANSITION__TARGET:
    		setTarget(
    		(org.gemoc.portautomata.fsm.State)
    		 newValue);
    		return;
    	case org.gemoc.portautomata.fsm.fsmPackage.TRANSITION__INPUT:
    		setInput(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.portautomata.fsm.fsmPackage.TRANSITION__OUTPUT:
    		setOutput(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.portautomata.fsm.fsmPackage.TRANSITION__GUARD:
    		setGuard(
    		(org.gemoc.portautomata.fsm.Guard)
    		 newValue);
    		return;
    	case org.gemoc.portautomata.fsm.fsmPackage.TRANSITION__ACTION:
    		setAction(
    		(org.gemoc.portautomata.fsm.Action)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
