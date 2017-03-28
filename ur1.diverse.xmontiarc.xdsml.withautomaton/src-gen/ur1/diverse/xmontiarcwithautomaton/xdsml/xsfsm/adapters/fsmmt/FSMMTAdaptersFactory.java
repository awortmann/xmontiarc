package ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.ActionAdapter;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.BooleanActionAdapter;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.BooleanGuardAdapter;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.BooleanVariableAdapter;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.EqualNumberGuardAdapter;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.GreaterOrEqualThanNumberGuardAdapter;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.GreaterThanNumberGuardAdapter;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.GuardAdapter;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.LessOrEqualThanNumberGuardAdapter;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.LessThanNumberGuardAdapter;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.NamedElementAdapter;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.NumberActionAdapter;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.NumberGuardAdapter;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.NumberVariableAdapter;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.StateAdapter;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.StateMachineAdapter;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.StringActionAdapter;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.StringGuardAdapter;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.StringVariableAdapter;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.TransitionAdapter;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.VariableAdapter;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.Action;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.BooleanAction;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.BooleanGuard;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.BooleanVariable;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.EqualNumberGuard;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.GreaterOrEqualThanNumberGuard;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.GreaterThanNumberGuard;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.Guard;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.LessOrEqualThanNumberGuard;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.LessThanNumberGuard;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.NamedElement;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.NumberAction;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.NumberGuard;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.NumberVariable;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.State;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.StateMachine;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.StringAction;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.StringGuard;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.StringVariable;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.Transition;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.Variable;

@SuppressWarnings("all")
public class FSMMTAdaptersFactory implements AdaptersFactory {
  private static FSMMTAdaptersFactory instance;
  
  public static FSMMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.FSMMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public FSMMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.StateMachine){
    	return createStateMachineAdapter((ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.StateMachine) o, res);
    }
    if (o instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.State){
    	return createStateAdapter((ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.State) o, res);
    }
    if (o instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.Transition){
    	return createTransitionAdapter((ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.Transition) o, res);
    }
    if (o instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.StringVariable){
    	return createStringVariableAdapter((ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.StringVariable) o, res);
    }
    if (o instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.NumberVariable){
    	return createNumberVariableAdapter((ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.NumberVariable) o, res);
    }
    if (o instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.BooleanVariable){
    	return createBooleanVariableAdapter((ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.BooleanVariable) o, res);
    }
    if (o instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.BooleanGuard){
    	return createBooleanGuardAdapter((ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.BooleanGuard) o, res);
    }
    if (o instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.StringGuard){
    	return createStringGuardAdapter((ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.StringGuard) o, res);
    }
    if (o instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.EqualNumberGuard){
    	return createEqualNumberGuardAdapter((ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.EqualNumberGuard) o, res);
    }
    if (o instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.StringAction){
    	return createStringActionAdapter((ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.StringAction) o, res);
    }
    if (o instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.NumberAction){
    	return createNumberActionAdapter((ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.NumberAction) o, res);
    }
    if (o instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.BooleanAction){
    	return createBooleanActionAdapter((ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.BooleanAction) o, res);
    }
    if (o instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.LessThanNumberGuard){
    	return createLessThanNumberGuardAdapter((ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.LessThanNumberGuard) o, res);
    }
    if (o instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.GreaterThanNumberGuard){
    	return createGreaterThanNumberGuardAdapter((ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.GreaterThanNumberGuard) o, res);
    }
    if (o instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.GreaterOrEqualThanNumberGuard){
    	return createGreaterOrEqualThanNumberGuardAdapter((ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.GreaterOrEqualThanNumberGuard) o, res);
    }
    if (o instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.LessOrEqualThanNumberGuard){
    	return createLessOrEqualThanNumberGuardAdapter((ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.LessOrEqualThanNumberGuard) o, res);
    }
    
    return null;
  }
  
  public StateMachineAdapter createStateMachineAdapter(final StateMachine adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.StateMachineAdapter) adapter;
    else {
    	adapter = new ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.StateMachineAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.StateMachineAdapter) adapter;
    }
  }
  
  public StateAdapter createStateAdapter(final State adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.StateAdapter) adapter;
    else {
    	adapter = new ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.StateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.StateAdapter) adapter;
    }
  }
  
  public TransitionAdapter createTransitionAdapter(final Transition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.TransitionAdapter) adapter;
    else {
    	adapter = new ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.TransitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.TransitionAdapter) adapter;
    }
  }
  
  public NamedElementAdapter createNamedElementAdapter(final NamedElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.NamedElementAdapter) adapter;
    else {
    	adapter = new ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.NamedElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.NamedElementAdapter) adapter;
    }
  }
  
  public VariableAdapter createVariableAdapter(final Variable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.VariableAdapter) adapter;
    else {
    	adapter = new ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.VariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.VariableAdapter) adapter;
    }
  }
  
  public StringVariableAdapter createStringVariableAdapter(final StringVariable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.StringVariableAdapter) adapter;
    else {
    	adapter = new ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.StringVariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.StringVariableAdapter) adapter;
    }
  }
  
  public NumberVariableAdapter createNumberVariableAdapter(final NumberVariable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.NumberVariableAdapter) adapter;
    else {
    	adapter = new ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.NumberVariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.NumberVariableAdapter) adapter;
    }
  }
  
  public BooleanVariableAdapter createBooleanVariableAdapter(final BooleanVariable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.BooleanVariableAdapter) adapter;
    else {
    	adapter = new ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.BooleanVariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.BooleanVariableAdapter) adapter;
    }
  }
  
  public GuardAdapter createGuardAdapter(final Guard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.GuardAdapter) adapter;
    else {
    	adapter = new ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.GuardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.GuardAdapter) adapter;
    }
  }
  
  public BooleanGuardAdapter createBooleanGuardAdapter(final BooleanGuard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.BooleanGuardAdapter) adapter;
    else {
    	adapter = new ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.BooleanGuardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.BooleanGuardAdapter) adapter;
    }
  }
  
  public StringGuardAdapter createStringGuardAdapter(final StringGuard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.StringGuardAdapter) adapter;
    else {
    	adapter = new ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.StringGuardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.StringGuardAdapter) adapter;
    }
  }
  
  public NumberGuardAdapter createNumberGuardAdapter(final NumberGuard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.NumberGuardAdapter) adapter;
    else {
    	adapter = new ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.NumberGuardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.NumberGuardAdapter) adapter;
    }
  }
  
  public EqualNumberGuardAdapter createEqualNumberGuardAdapter(final EqualNumberGuard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.EqualNumberGuardAdapter) adapter;
    else {
    	adapter = new ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.EqualNumberGuardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.EqualNumberGuardAdapter) adapter;
    }
  }
  
  public ActionAdapter createActionAdapter(final Action adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.ActionAdapter) adapter;
    else {
    	adapter = new ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.ActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.ActionAdapter) adapter;
    }
  }
  
  public StringActionAdapter createStringActionAdapter(final StringAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.StringActionAdapter) adapter;
    else {
    	adapter = new ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.StringActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.StringActionAdapter) adapter;
    }
  }
  
  public NumberActionAdapter createNumberActionAdapter(final NumberAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.NumberActionAdapter) adapter;
    else {
    	adapter = new ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.NumberActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.NumberActionAdapter) adapter;
    }
  }
  
  public BooleanActionAdapter createBooleanActionAdapter(final BooleanAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.BooleanActionAdapter) adapter;
    else {
    	adapter = new ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.BooleanActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.BooleanActionAdapter) adapter;
    }
  }
  
  public LessThanNumberGuardAdapter createLessThanNumberGuardAdapter(final LessThanNumberGuard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.LessThanNumberGuardAdapter) adapter;
    else {
    	adapter = new ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.LessThanNumberGuardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.LessThanNumberGuardAdapter) adapter;
    }
  }
  
  public GreaterThanNumberGuardAdapter createGreaterThanNumberGuardAdapter(final GreaterThanNumberGuard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.GreaterThanNumberGuardAdapter) adapter;
    else {
    	adapter = new ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.GreaterThanNumberGuardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.GreaterThanNumberGuardAdapter) adapter;
    }
  }
  
  public GreaterOrEqualThanNumberGuardAdapter createGreaterOrEqualThanNumberGuardAdapter(final GreaterOrEqualThanNumberGuard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.GreaterOrEqualThanNumberGuardAdapter) adapter;
    else {
    	adapter = new ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.GreaterOrEqualThanNumberGuardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.GreaterOrEqualThanNumberGuardAdapter) adapter;
    }
  }
  
  public LessOrEqualThanNumberGuardAdapter createLessOrEqualThanNumberGuardAdapter(final LessOrEqualThanNumberGuard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.LessOrEqualThanNumberGuardAdapter) adapter;
    else {
    	adapter = new ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.LessOrEqualThanNumberGuardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm.LessOrEqualThanNumberGuardAdapter) adapter;
    }
  }
}
