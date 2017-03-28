package ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.sample.legacyfsm.fsm.Action;
import org.gemoc.sample.legacyfsm.fsm.Guard;
import org.gemoc.sample.legacyfsm.fsm.State;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.FSMMTAdaptersFactory;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.Transition;

@SuppressWarnings("all")
public class TransitionAdapter extends EObjectAdapter<Transition> implements org.gemoc.sample.legacyfsm.fsm.Transition {
  private FSMMTAdaptersFactory adaptersFactory;
  
  public TransitionAdapter() {
    super(ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.FSMMTAdaptersFactory.getInstance());
    adaptersFactory = ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.FSMMTAdaptersFactory.getInstance();
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
    	adaptee.setSource(((ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.StateAdapter) o).getAdaptee());
    else adaptee.setSource(null);
  }
  
  @Override
  public State getTarget() {
    return (State) adaptersFactory.createAdapter(adaptee.getTarget(), eResource);
  }
  
  @Override
  public void setTarget(final State o) {
    if (o != null)
    	adaptee.setTarget(((ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.StateAdapter) o).getAdaptee());
    else adaptee.setTarget(null);
  }
  
  @Override
  public Guard getGuard() {
    return (Guard) adaptersFactory.createAdapter(adaptee.getGuard(), eResource);
  }
  
  @Override
  public void setGuard(final Guard o) {
    if (o != null)
    	adaptee.setGuard(((ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.GuardAdapter) o).getAdaptee());
    else adaptee.setGuard(null);
  }
  
  @Override
  public Action getAction() {
    return (Action) adaptersFactory.createAdapter(adaptee.getAction(), eResource);
  }
  
  @Override
  public void setAction(final Action o) {
    if (o != null)
    	adaptee.setAction(((ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.ActionAdapter) o).getAdaptee());
    else adaptee.setAction(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static String INPUT_EDEFAULT = null;
  
  protected final static String OUTPUT_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.gemoc.sample.legacyfsm.fsm.FsmPackage.eINSTANCE.getTransition();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.sample.legacyfsm.fsm.FsmPackage.TRANSITION__NAME:
    		return getName();
    	case org.gemoc.sample.legacyfsm.fsm.FsmPackage.TRANSITION__SOURCE:
    		return getSource();
    	case org.gemoc.sample.legacyfsm.fsm.FsmPackage.TRANSITION__TARGET:
    		return getTarget();
    	case org.gemoc.sample.legacyfsm.fsm.FsmPackage.TRANSITION__INPUT:
    		return getInput();
    	case org.gemoc.sample.legacyfsm.fsm.FsmPackage.TRANSITION__OUTPUT:
    		return getOutput();
    	case org.gemoc.sample.legacyfsm.fsm.FsmPackage.TRANSITION__GUARD:
    		return getGuard();
    	case org.gemoc.sample.legacyfsm.fsm.FsmPackage.TRANSITION__ACTION:
    		return getAction();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.sample.legacyfsm.fsm.FsmPackage.TRANSITION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.sample.legacyfsm.fsm.FsmPackage.TRANSITION__SOURCE:
    		return getSource() != null;
    	case org.gemoc.sample.legacyfsm.fsm.FsmPackage.TRANSITION__TARGET:
    		return getTarget() != null;
    	case org.gemoc.sample.legacyfsm.fsm.FsmPackage.TRANSITION__INPUT:
    		return getInput() != INPUT_EDEFAULT;
    	case org.gemoc.sample.legacyfsm.fsm.FsmPackage.TRANSITION__OUTPUT:
    		return getOutput() != OUTPUT_EDEFAULT;
    	case org.gemoc.sample.legacyfsm.fsm.FsmPackage.TRANSITION__GUARD:
    		return getGuard() != null;
    	case org.gemoc.sample.legacyfsm.fsm.FsmPackage.TRANSITION__ACTION:
    		return getAction() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.sample.legacyfsm.fsm.FsmPackage.TRANSITION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.sample.legacyfsm.fsm.FsmPackage.TRANSITION__SOURCE:
    		setSource(
    		(org.gemoc.sample.legacyfsm.fsm.State)
    		 newValue);
    		return;
    	case org.gemoc.sample.legacyfsm.fsm.FsmPackage.TRANSITION__TARGET:
    		setTarget(
    		(org.gemoc.sample.legacyfsm.fsm.State)
    		 newValue);
    		return;
    	case org.gemoc.sample.legacyfsm.fsm.FsmPackage.TRANSITION__INPUT:
    		setInput(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.sample.legacyfsm.fsm.FsmPackage.TRANSITION__OUTPUT:
    		setOutput(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.sample.legacyfsm.fsm.FsmPackage.TRANSITION__GUARD:
    		setGuard(
    		(org.gemoc.sample.legacyfsm.fsm.Guard)
    		 newValue);
    		return;
    	case org.gemoc.sample.legacyfsm.fsm.FsmPackage.TRANSITION__ACTION:
    		setAction(
    		(org.gemoc.sample.legacyfsm.fsm.Action)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
