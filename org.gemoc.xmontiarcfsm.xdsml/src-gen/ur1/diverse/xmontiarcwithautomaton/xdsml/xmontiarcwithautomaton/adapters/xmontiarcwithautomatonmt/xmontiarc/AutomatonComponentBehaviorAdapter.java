package ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.xmontiarcwithautomatonmt.xmontiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.xmontiarcwithautomatonmt.XMontiArcWithAutomatonMTAdaptersFactory;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.AutomatonComponentBehavior;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.State;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.Transition;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.Variable;

@SuppressWarnings("all")
public class AutomatonComponentBehaviorAdapter extends EObjectAdapter<AutomatonComponentBehavior> implements ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.AutomatonComponentBehavior {
  private XMontiArcWithAutomatonMTAdaptersFactory adaptersFactory;
  
  public AutomatonComponentBehaviorAdapter() {
    super(ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.xmontiarcwithautomatonmt.XMontiArcWithAutomatonMTAdaptersFactory.getInstance());
    adaptersFactory = ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.xmontiarcwithautomatonmt.XMontiArcWithAutomatonMTAdaptersFactory.getInstance();
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
    	adaptee.setInitialState(((ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.xmontiarcwithautomatonmt.xmontiarc.StateAdapter) o).getAdaptee());
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
  
  @Override
  public void assignInitialValues() {
    ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StateMachineAspect.assignInitialValues(adaptee);
  }
  
  @Override
  public String getConsummedString() {
    return ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StateMachineAspect.consummedString(adaptee);
  }
  
  @Override
  public void setConsummedString(final String consummedString) {
    ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StateMachineAspect.consummedString(adaptee, consummedString
    );
  }
  
  @Override
  public State getCurrentState() {
    return (State) adaptersFactory.createAdapter(ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StateMachineAspect.currentState(adaptee), eResource);
  }
  
  @Override
  public void setCurrentState(final State currentState) {
    ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StateMachineAspect.currentState(adaptee, (ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.State)((EObjectAdapter)currentState).getAdaptee()
    );
  }
  
  @Override
  public void initializeModel(final org.eclipse.emf.common.util.EList<java.lang.String> args) {
    ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StateMachineAspect.initializeModel(adaptee, args
    );
  }
  
  @Override
  public void main() {
    ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StateMachineAspect.main(adaptee);
  }
  
  @Override
  public String getProducedString() {
    return ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StateMachineAspect.producedString(adaptee);
  }
  
  @Override
  public void setProducedString(final String producedString) {
    ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StateMachineAspect.producedString(adaptee, producedString
    );
  }
  
  @Override
  public String getUnprocessedString() {
    return ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StateMachineAspect.unprocessedString(adaptee);
  }
  
  @Override
  public void setUnprocessedString(final String unprocessedString) {
    ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StateMachineAspect.unprocessedString(adaptee, unprocessedString
    );
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static String UNPROCESSED_STRING_EDEFAULT = null;
  
  protected final static String CONSUMMED_STRING_EDEFAULT = null;
  
  protected final static String PRODUCED_STRING_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.eINSTANCE.getAutomatonComponentBehavior();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__NAME:
    		return getName();
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__OWNED_STATES:
    		return getOwnedStates();
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__INITIAL_STATE:
    		return getInitialState();
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__OWNED_TRANSITIONS:
    		return getOwnedTransitions();
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__VARIABLES:
    		return getVariables();
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__CURRENT_STATE:
    		return getCurrentState();
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__UNPROCESSED_STRING:
    		return getUnprocessedString();
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__CONSUMMED_STRING:
    		return getConsummedString();
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__PRODUCED_STRING:
    		return getProducedString();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__NAME:
    		return getName() != NAME_EDEFAULT;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__OWNED_STATES:
    		return getOwnedStates() != null && !getOwnedStates().isEmpty();
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__INITIAL_STATE:
    		return getInitialState() != null;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__OWNED_TRANSITIONS:
    		return getOwnedTransitions() != null && !getOwnedTransitions().isEmpty();
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__VARIABLES:
    		return getVariables() != null && !getVariables().isEmpty();
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__CURRENT_STATE:
    		return getCurrentState() != null;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__UNPROCESSED_STRING:
    		return getUnprocessedString() != UNPROCESSED_STRING_EDEFAULT;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__CONSUMMED_STRING:
    		return getConsummedString() != CONSUMMED_STRING_EDEFAULT;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__PRODUCED_STRING:
    		return getProducedString() != PRODUCED_STRING_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__OWNED_STATES:
    		getOwnedStates().clear();
    		getOwnedStates().addAll((Collection) newValue);
    		return;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__INITIAL_STATE:
    		setInitialState(
    		(ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.State)
    		 newValue);
    		return;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__OWNED_TRANSITIONS:
    		getOwnedTransitions().clear();
    		getOwnedTransitions().addAll((Collection) newValue);
    		return;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__VARIABLES:
    		getVariables().clear();
    		getVariables().addAll((Collection) newValue);
    		return;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__CURRENT_STATE:
    		setCurrentState(
    		(ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.State)
    		 newValue);
    		return;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__UNPROCESSED_STRING:
    		setUnprocessedString(
    		(java.lang.String)
    		 newValue);
    		return;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__CONSUMMED_STRING:
    		setConsummedString(
    		(java.lang.String)
    		 newValue);
    		return;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__PRODUCED_STRING:
    		setProducedString(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.NamedElement.class) {
    	switch (derivedFeatureID) {
    		case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__NAME:
    			return ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.NAMED_ELEMENT__NAME;
    		default: return -1;
    	}
    }
    
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }
  
  @Override
  public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
    if (baseClass == ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.NamedElement.class) {
    	switch (baseFeatureID) {
    		case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.NAMED_ELEMENT__NAME:
    			return ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__NAME;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
