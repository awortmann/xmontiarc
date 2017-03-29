package org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.ActionAdapter;
import org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.BooleanActionAdapter;
import org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.BooleanGuardAdapter;
import org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.BooleanVariableAdapter;
import org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.EqualNumberGuardAdapter;
import org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.GreaterOrEqualThanNumberGuardAdapter;
import org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.GreaterThanNumberGuardAdapter;
import org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.GuardAdapter;
import org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.LessOrEqualThanNumberGuardAdapter;
import org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.LessThanNumberGuardAdapter;
import org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.NamedElementAdapter;
import org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.NumberActionAdapter;
import org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.NumberGuardAdapter;
import org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.NumberVariableAdapter;
import org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.StateAdapter;
import org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.StateMachineAdapter;
import org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.StringActionAdapter;
import org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.StringGuardAdapter;
import org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.StringVariableAdapter;
import org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.TransitionAdapter;
import org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.VariableAdapter;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.Action;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.BooleanAction;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.BooleanGuard;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.BooleanVariable;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.EqualNumberGuard;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.GreaterOrEqualThanNumberGuard;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.GreaterThanNumberGuard;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.Guard;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.LessOrEqualThanNumberGuard;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.LessThanNumberGuard;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.NamedElement;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.NumberAction;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.NumberGuard;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.NumberVariable;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.State;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.StateMachine;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.StringAction;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.StringGuard;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.StringVariable;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.Transition;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.Variable;

@SuppressWarnings("all")
public class PortAutomataMTAdaptersFactory implements AdaptersFactory {
  private static PortAutomataMTAdaptersFactory instance;
  
  public static PortAutomataMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.PortAutomataMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public PortAutomataMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof org.gemoc.xportautomata.xdsml.xportautomata.fsm.StateMachine){
    	return createStateMachineAdapter((org.gemoc.xportautomata.xdsml.xportautomata.fsm.StateMachine) o, res);
    }
    if (o instanceof org.gemoc.xportautomata.xdsml.xportautomata.fsm.State){
    	return createStateAdapter((org.gemoc.xportautomata.xdsml.xportautomata.fsm.State) o, res);
    }
    if (o instanceof org.gemoc.xportautomata.xdsml.xportautomata.fsm.Transition){
    	return createTransitionAdapter((org.gemoc.xportautomata.xdsml.xportautomata.fsm.Transition) o, res);
    }
    if (o instanceof org.gemoc.xportautomata.xdsml.xportautomata.fsm.StringVariable){
    	return createStringVariableAdapter((org.gemoc.xportautomata.xdsml.xportautomata.fsm.StringVariable) o, res);
    }
    if (o instanceof org.gemoc.xportautomata.xdsml.xportautomata.fsm.NumberVariable){
    	return createNumberVariableAdapter((org.gemoc.xportautomata.xdsml.xportautomata.fsm.NumberVariable) o, res);
    }
    if (o instanceof org.gemoc.xportautomata.xdsml.xportautomata.fsm.BooleanVariable){
    	return createBooleanVariableAdapter((org.gemoc.xportautomata.xdsml.xportautomata.fsm.BooleanVariable) o, res);
    }
    if (o instanceof org.gemoc.xportautomata.xdsml.xportautomata.fsm.BooleanGuard){
    	return createBooleanGuardAdapter((org.gemoc.xportautomata.xdsml.xportautomata.fsm.BooleanGuard) o, res);
    }
    if (o instanceof org.gemoc.xportautomata.xdsml.xportautomata.fsm.StringGuard){
    	return createStringGuardAdapter((org.gemoc.xportautomata.xdsml.xportautomata.fsm.StringGuard) o, res);
    }
    if (o instanceof org.gemoc.xportautomata.xdsml.xportautomata.fsm.EqualNumberGuard){
    	return createEqualNumberGuardAdapter((org.gemoc.xportautomata.xdsml.xportautomata.fsm.EqualNumberGuard) o, res);
    }
    if (o instanceof org.gemoc.xportautomata.xdsml.xportautomata.fsm.StringAction){
    	return createStringActionAdapter((org.gemoc.xportautomata.xdsml.xportautomata.fsm.StringAction) o, res);
    }
    if (o instanceof org.gemoc.xportautomata.xdsml.xportautomata.fsm.NumberAction){
    	return createNumberActionAdapter((org.gemoc.xportautomata.xdsml.xportautomata.fsm.NumberAction) o, res);
    }
    if (o instanceof org.gemoc.xportautomata.xdsml.xportautomata.fsm.BooleanAction){
    	return createBooleanActionAdapter((org.gemoc.xportautomata.xdsml.xportautomata.fsm.BooleanAction) o, res);
    }
    if (o instanceof org.gemoc.xportautomata.xdsml.xportautomata.fsm.LessThanNumberGuard){
    	return createLessThanNumberGuardAdapter((org.gemoc.xportautomata.xdsml.xportautomata.fsm.LessThanNumberGuard) o, res);
    }
    if (o instanceof org.gemoc.xportautomata.xdsml.xportautomata.fsm.GreaterThanNumberGuard){
    	return createGreaterThanNumberGuardAdapter((org.gemoc.xportautomata.xdsml.xportautomata.fsm.GreaterThanNumberGuard) o, res);
    }
    if (o instanceof org.gemoc.xportautomata.xdsml.xportautomata.fsm.GreaterOrEqualThanNumberGuard){
    	return createGreaterOrEqualThanNumberGuardAdapter((org.gemoc.xportautomata.xdsml.xportautomata.fsm.GreaterOrEqualThanNumberGuard) o, res);
    }
    if (o instanceof org.gemoc.xportautomata.xdsml.xportautomata.fsm.LessOrEqualThanNumberGuard){
    	return createLessOrEqualThanNumberGuardAdapter((org.gemoc.xportautomata.xdsml.xportautomata.fsm.LessOrEqualThanNumberGuard) o, res);
    }
    
    return null;
  }
  
  public StateMachineAdapter createStateMachineAdapter(final StateMachine adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.StateMachineAdapter) adapter;
    else {
    	adapter = new org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.StateMachineAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.StateMachineAdapter) adapter;
    }
  }
  
  public StateAdapter createStateAdapter(final State adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.StateAdapter) adapter;
    else {
    	adapter = new org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.StateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.StateAdapter) adapter;
    }
  }
  
  public TransitionAdapter createTransitionAdapter(final Transition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.TransitionAdapter) adapter;
    else {
    	adapter = new org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.TransitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.TransitionAdapter) adapter;
    }
  }
  
  public NamedElementAdapter createNamedElementAdapter(final NamedElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.NamedElementAdapter) adapter;
    else {
    	adapter = new org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.NamedElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.NamedElementAdapter) adapter;
    }
  }
  
  public VariableAdapter createVariableAdapter(final Variable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.VariableAdapter) adapter;
    else {
    	adapter = new org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.VariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.VariableAdapter) adapter;
    }
  }
  
  public StringVariableAdapter createStringVariableAdapter(final StringVariable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.StringVariableAdapter) adapter;
    else {
    	adapter = new org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.StringVariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.StringVariableAdapter) adapter;
    }
  }
  
  public NumberVariableAdapter createNumberVariableAdapter(final NumberVariable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.NumberVariableAdapter) adapter;
    else {
    	adapter = new org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.NumberVariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.NumberVariableAdapter) adapter;
    }
  }
  
  public BooleanVariableAdapter createBooleanVariableAdapter(final BooleanVariable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.BooleanVariableAdapter) adapter;
    else {
    	adapter = new org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.BooleanVariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.BooleanVariableAdapter) adapter;
    }
  }
  
  public GuardAdapter createGuardAdapter(final Guard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.GuardAdapter) adapter;
    else {
    	adapter = new org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.GuardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.GuardAdapter) adapter;
    }
  }
  
  public BooleanGuardAdapter createBooleanGuardAdapter(final BooleanGuard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.BooleanGuardAdapter) adapter;
    else {
    	adapter = new org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.BooleanGuardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.BooleanGuardAdapter) adapter;
    }
  }
  
  public StringGuardAdapter createStringGuardAdapter(final StringGuard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.StringGuardAdapter) adapter;
    else {
    	adapter = new org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.StringGuardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.StringGuardAdapter) adapter;
    }
  }
  
  public NumberGuardAdapter createNumberGuardAdapter(final NumberGuard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.NumberGuardAdapter) adapter;
    else {
    	adapter = new org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.NumberGuardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.NumberGuardAdapter) adapter;
    }
  }
  
  public EqualNumberGuardAdapter createEqualNumberGuardAdapter(final EqualNumberGuard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.EqualNumberGuardAdapter) adapter;
    else {
    	adapter = new org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.EqualNumberGuardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.EqualNumberGuardAdapter) adapter;
    }
  }
  
  public ActionAdapter createActionAdapter(final Action adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.ActionAdapter) adapter;
    else {
    	adapter = new org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.ActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.ActionAdapter) adapter;
    }
  }
  
  public StringActionAdapter createStringActionAdapter(final StringAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.StringActionAdapter) adapter;
    else {
    	adapter = new org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.StringActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.StringActionAdapter) adapter;
    }
  }
  
  public NumberActionAdapter createNumberActionAdapter(final NumberAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.NumberActionAdapter) adapter;
    else {
    	adapter = new org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.NumberActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.NumberActionAdapter) adapter;
    }
  }
  
  public BooleanActionAdapter createBooleanActionAdapter(final BooleanAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.BooleanActionAdapter) adapter;
    else {
    	adapter = new org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.BooleanActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.BooleanActionAdapter) adapter;
    }
  }
  
  public LessThanNumberGuardAdapter createLessThanNumberGuardAdapter(final LessThanNumberGuard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.LessThanNumberGuardAdapter) adapter;
    else {
    	adapter = new org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.LessThanNumberGuardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.LessThanNumberGuardAdapter) adapter;
    }
  }
  
  public GreaterThanNumberGuardAdapter createGreaterThanNumberGuardAdapter(final GreaterThanNumberGuard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.GreaterThanNumberGuardAdapter) adapter;
    else {
    	adapter = new org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.GreaterThanNumberGuardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.GreaterThanNumberGuardAdapter) adapter;
    }
  }
  
  public GreaterOrEqualThanNumberGuardAdapter createGreaterOrEqualThanNumberGuardAdapter(final GreaterOrEqualThanNumberGuard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.GreaterOrEqualThanNumberGuardAdapter) adapter;
    else {
    	adapter = new org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.GreaterOrEqualThanNumberGuardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.GreaterOrEqualThanNumberGuardAdapter) adapter;
    }
  }
  
  public LessOrEqualThanNumberGuardAdapter createLessOrEqualThanNumberGuardAdapter(final LessOrEqualThanNumberGuard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.LessOrEqualThanNumberGuardAdapter) adapter;
    else {
    	adapter = new org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.LessOrEqualThanNumberGuardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.fsm.LessOrEqualThanNumberGuardAdapter) adapter;
    }
  }
}
