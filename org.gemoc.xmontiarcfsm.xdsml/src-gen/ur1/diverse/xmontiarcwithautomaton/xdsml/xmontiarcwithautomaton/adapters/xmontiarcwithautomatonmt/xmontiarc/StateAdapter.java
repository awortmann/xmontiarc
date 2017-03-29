package ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.xmontiarcwithautomatonmt.xmontiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.xmontiarcwithautomatonmt.XMontiArcWithAutomatonMTAdaptersFactory;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.State;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.AutomatonComponentBehavior;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.Transition;

@SuppressWarnings("all")
public class StateAdapter extends EObjectAdapter<State> implements ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.State {
  private XMontiArcWithAutomatonMTAdaptersFactory adaptersFactory;
  
  public StateAdapter() {
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
  
  @Override
  public AutomatonComponentBehavior getOwningFSM() {
    return (AutomatonComponentBehavior) adaptersFactory.createAdapter(adaptee.getOwningFSM(), eResource);
  }
  
  @Override
  public void setOwningFSM(final AutomatonComponentBehavior o) {
    if (o != null)
    	adaptee.setOwningFSM(((ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.xmontiarcwithautomatonmt.xmontiarc.AutomatonComponentBehaviorAdapter) o).getAdaptee());
    else adaptee.setOwningFSM(null);
  }
  
  private EList<Transition> outgoingTransitions_;
  
  @Override
  public EList<Transition> getOutgoingTransitions() {
    if (outgoingTransitions_ == null)
    	outgoingTransitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoingTransitions(), adaptersFactory, eResource);
    return outgoingTransitions_;
  }
  
  private EList<Transition> incomingTransitions_;
  
  @Override
  public EList<Transition> getIncomingTransitions() {
    if (incomingTransitions_ == null)
    	incomingTransitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncomingTransitions(), adaptersFactory, eResource);
    return incomingTransitions_;
  }
  
  @Override
  public void step(final String inputString) {
    ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StateAspect.step(adaptee, inputString
    );
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.eINSTANCE.getState();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.STATE__NAME:
    		return getName();
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.STATE__OWNING_FSM:
    		return getOwningFSM();
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.STATE__OUTGOING_TRANSITIONS:
    		return getOutgoingTransitions();
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.STATE__INCOMING_TRANSITIONS:
    		return getIncomingTransitions();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.STATE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.STATE__OWNING_FSM:
    		return getOwningFSM() != null;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.STATE__OUTGOING_TRANSITIONS:
    		return getOutgoingTransitions() != null && !getOutgoingTransitions().isEmpty();
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.STATE__INCOMING_TRANSITIONS:
    		return getIncomingTransitions() != null && !getIncomingTransitions().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.STATE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.STATE__OWNING_FSM:
    		setOwningFSM(
    		(ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.AutomatonComponentBehavior)
    		 newValue);
    		return;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.STATE__OUTGOING_TRANSITIONS:
    		getOutgoingTransitions().clear();
    		getOutgoingTransitions().addAll((Collection) newValue);
    		return;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.STATE__INCOMING_TRANSITIONS:
    		getIncomingTransitions().clear();
    		getIncomingTransitions().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
