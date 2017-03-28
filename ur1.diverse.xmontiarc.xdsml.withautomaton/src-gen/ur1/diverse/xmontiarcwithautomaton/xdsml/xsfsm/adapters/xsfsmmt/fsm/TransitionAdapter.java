package ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.xsfsmmt.fsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.xsfsmmt.XSFSMMTAdaptersFactory;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.Transition;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.Action;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.Guard;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.State;

@SuppressWarnings("all")
public class TransitionAdapter extends EObjectAdapter<Transition> implements ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.Transition {
  private XSFSMMTAdaptersFactory adaptersFactory;
  
  public TransitionAdapter() {
    super(ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.xsfsmmt.XSFSMMTAdaptersFactory.getInstance());
    adaptersFactory = ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.xsfsmmt.XSFSMMTAdaptersFactory.getInstance();
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
    	adaptee.setSource(((ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.xsfsmmt.fsm.StateAdapter) o).getAdaptee());
    else adaptee.setSource(null);
  }
  
  @Override
  public State getTarget() {
    return (State) adaptersFactory.createAdapter(adaptee.getTarget(), eResource);
  }
  
  @Override
  public void setTarget(final State o) {
    if (o != null)
    	adaptee.setTarget(((ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.xsfsmmt.fsm.StateAdapter) o).getAdaptee());
    else adaptee.setTarget(null);
  }
  
  @Override
  public Guard getGuard() {
    return (Guard) adaptersFactory.createAdapter(adaptee.getGuard(), eResource);
  }
  
  @Override
  public void setGuard(final Guard o) {
    if (o != null)
    	adaptee.setGuard(((ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.xsfsmmt.fsm.GuardAdapter) o).getAdaptee());
    else adaptee.setGuard(null);
  }
  
  @Override
  public Action getAction() {
    return (Action) adaptersFactory.createAdapter(adaptee.getAction(), eResource);
  }
  
  @Override
  public void setAction(final Action o) {
    if (o != null)
    	adaptee.setAction(((ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.xsfsmmt.fsm.ActionAdapter) o).getAdaptee());
    else adaptee.setAction(null);
  }
  
  @Override
  public void fire() {
    ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.TransitionAspect.fire(adaptee);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static String INPUT_EDEFAULT = null;
  
  protected final static String OUTPUT_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.FsmPackage.eINSTANCE.getTransition();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.FsmPackage.TRANSITION__NAME:
    		return getName();
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.FsmPackage.TRANSITION__SOURCE:
    		return getSource();
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.FsmPackage.TRANSITION__TARGET:
    		return getTarget();
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.FsmPackage.TRANSITION__INPUT:
    		return getInput();
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.FsmPackage.TRANSITION__OUTPUT:
    		return getOutput();
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.FsmPackage.TRANSITION__GUARD:
    		return getGuard();
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.FsmPackage.TRANSITION__ACTION:
    		return getAction();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.FsmPackage.TRANSITION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.FsmPackage.TRANSITION__SOURCE:
    		return getSource() != null;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.FsmPackage.TRANSITION__TARGET:
    		return getTarget() != null;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.FsmPackage.TRANSITION__INPUT:
    		return getInput() != INPUT_EDEFAULT;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.FsmPackage.TRANSITION__OUTPUT:
    		return getOutput() != OUTPUT_EDEFAULT;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.FsmPackage.TRANSITION__GUARD:
    		return getGuard() != null;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.FsmPackage.TRANSITION__ACTION:
    		return getAction() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.FsmPackage.TRANSITION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.FsmPackage.TRANSITION__SOURCE:
    		setSource(
    		(ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.State)
    		 newValue);
    		return;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.FsmPackage.TRANSITION__TARGET:
    		setTarget(
    		(ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.State)
    		 newValue);
    		return;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.FsmPackage.TRANSITION__INPUT:
    		setInput(
    		(java.lang.String)
    		 newValue);
    		return;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.FsmPackage.TRANSITION__OUTPUT:
    		setOutput(
    		(java.lang.String)
    		 newValue);
    		return;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.FsmPackage.TRANSITION__GUARD:
    		setGuard(
    		(ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.Guard)
    		 newValue);
    		return;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.FsmPackage.TRANSITION__ACTION:
    		setAction(
    		(ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.Action)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
