package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.XMontiArcFSMMTAdaptersFactory;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.AutomatonComponentBehavior;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.State;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.Transition;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.Variable;

@SuppressWarnings("all")
public class AutomatonComponentBehaviorAdapter extends EObjectAdapter<AutomatonComponentBehavior> implements org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.AutomatonComponentBehavior {
  private XMontiArcFSMMTAdaptersFactory adaptersFactory;
  
  public AutomatonComponentBehaviorAdapter() {
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
  
  private EList<State> ownedStates_;
  
  @Override
  public EList<State> getOwnedStates() {
    if (ownedStates_ == null)
    	ownedStates_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedStates(), adaptersFactory, eResource);
    return ownedStates_;
  }
  
  @Override
  public State getInitialState() {
    return (State) adaptersFactory.createAdapter(adaptee.getInitialState(), eResource);
  }
  
  @Override
  public void setInitialState(final State o) {
    if (o != null)
    	adaptee.setInitialState(((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.StateAdapter) o).getAdaptee());
    else adaptee.setInitialState(null);
  }
  
  private EList<Transition> ownedTransitions_;
  
  @Override
  public EList<Transition> getOwnedTransitions() {
    if (ownedTransitions_ == null)
    	ownedTransitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedTransitions(), adaptersFactory, eResource);
    return ownedTransitions_;
  }
  
  private EList<Variable> variables_;
  
  @Override
  public EList<Variable> getVariables() {
    if (variables_ == null)
    	variables_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getVariables(), adaptersFactory, eResource);
    return variables_;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.eINSTANCE.getAutomatonComponentBehavior();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__NAME:
    		return getName();
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__OWNED_STATES:
    		return getOwnedStates();
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__INITIAL_STATE:
    		return getInitialState();
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__OWNED_TRANSITIONS:
    		return getOwnedTransitions();
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__VARIABLES:
    		return getVariables();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__OWNED_STATES:
    		return getOwnedStates() != null && !getOwnedStates().isEmpty();
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__INITIAL_STATE:
    		return getInitialState() != null;
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__OWNED_TRANSITIONS:
    		return getOwnedTransitions() != null && !getOwnedTransitions().isEmpty();
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__VARIABLES:
    		return getVariables() != null && !getVariables().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__OWNED_STATES:
    		getOwnedStates().clear();
    		getOwnedStates().addAll((Collection) newValue);
    		return;
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__INITIAL_STATE:
    		setInitialState(
    		(org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.State)
    		 newValue);
    		return;
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__OWNED_TRANSITIONS:
    		getOwnedTransitions().clear();
    		getOwnedTransitions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__VARIABLES:
    		getVariables().clear();
    		getVariables().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
