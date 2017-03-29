package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.XMontiArcFSMMTAdaptersFactory;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.Transition;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.Action;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.Guard;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.State;

@SuppressWarnings("all")
public class TransitionAdapter extends EObjectAdapter<Transition> implements org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.Transition {
  private XMontiArcFSMMTAdaptersFactory adaptersFactory;
  
  public TransitionAdapter() {
    super(org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.XMontiArcFSMMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.XMontiArcFSMMTAdaptersFactory.getInstance();
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
    	adaptee.setSource(((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.StateAdapter) o).getAdaptee());
    else adaptee.setSource(null);
  }
  
  @Override
  public State getTarget() {
    return (State) adaptersFactory.createAdapter(adaptee.getTarget(), eResource);
  }
  
  @Override
  public void setTarget(final State o) {
    if (o != null)
    	adaptee.setTarget(((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.StateAdapter) o).getAdaptee());
    else adaptee.setTarget(null);
  }
  
  @Override
  public Guard getGuard() {
    return (Guard) adaptersFactory.createAdapter(adaptee.getGuard(), eResource);
  }
  
  @Override
  public void setGuard(final Guard o) {
    if (o != null)
    	adaptee.setGuard(((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.GuardAdapter) o).getAdaptee());
    else adaptee.setGuard(null);
  }
  
  @Override
  public Action getAction() {
    return (Action) adaptersFactory.createAdapter(adaptee.getAction(), eResource);
  }
  
  @Override
  public void setAction(final Action o) {
    if (o != null)
    	adaptee.setAction(((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.ActionAdapter) o).getAdaptee());
    else adaptee.setAction(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static String INPUT_EDEFAULT = null;
  
  protected final static String OUTPUT_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.eINSTANCE.getTransition();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.TRANSITION__NAME:
    		return getName();
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.TRANSITION__SOURCE:
    		return getSource();
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.TRANSITION__TARGET:
    		return getTarget();
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.TRANSITION__INPUT:
    		return getInput();
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.TRANSITION__OUTPUT:
    		return getOutput();
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.TRANSITION__GUARD:
    		return getGuard();
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.TRANSITION__ACTION:
    		return getAction();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.TRANSITION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.TRANSITION__SOURCE:
    		return getSource() != null;
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.TRANSITION__TARGET:
    		return getTarget() != null;
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.TRANSITION__INPUT:
    		return getInput() != INPUT_EDEFAULT;
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.TRANSITION__OUTPUT:
    		return getOutput() != OUTPUT_EDEFAULT;
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.TRANSITION__GUARD:
    		return getGuard() != null;
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.TRANSITION__ACTION:
    		return getAction() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.TRANSITION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.TRANSITION__SOURCE:
    		setSource(
    		(org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.State)
    		 newValue);
    		return;
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.TRANSITION__TARGET:
    		setTarget(
    		(org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.State)
    		 newValue);
    		return;
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.TRANSITION__INPUT:
    		setInput(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.TRANSITION__OUTPUT:
    		setOutput(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.TRANSITION__GUARD:
    		setGuard(
    		(org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.Guard)
    		 newValue);
    		return;
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.TRANSITION__ACTION:
    		setAction(
    		(org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.Action)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
