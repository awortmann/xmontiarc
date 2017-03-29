package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.ComponentBehaviorAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.ComponentTypeAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.ConnectorAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.GroovyComponentBehaviorAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.IncomingConnectorAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.IncomingPortAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.IntermediateConnectorAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.OutgoingConnectorAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.OutgoingPortAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.PortAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.SubcomponentAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.ActionAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.AutomatonComponentBehaviorAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.BooleanActionAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.BooleanGuardAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.BooleanVariableAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.EqualNumberGuardAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.GreaterOrEqualThanNumberGuardAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.GreaterThanNumberGuardAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.GuardAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.LessOrEqualThanNumberGuardAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.LessThanNumberGuardAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.NamedElementAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.NumberActionAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.NumberGuardAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.NumberVariableAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.StateAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.StringActionAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.StringGuardAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.StringVariableAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.TransitionAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.VariableAdapter;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.ComponentBehavior;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.ComponentType;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.Connector;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.GroovyComponentBehavior;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.IncomingConnector;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.IncomingPort;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.IntermediateConnector;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.OutgoingConnector;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.OutgoingPort;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.Port;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.Subcomponent;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.Action;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.AutomatonComponentBehavior;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.BooleanAction;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.BooleanGuard;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.BooleanVariable;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.EqualNumberGuard;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.GreaterOrEqualThanNumberGuard;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.GreaterThanNumberGuard;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.Guard;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.LessOrEqualThanNumberGuard;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.LessThanNumberGuard;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.NamedElement;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.NumberAction;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.NumberGuard;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.NumberVariable;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.State;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.StringAction;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.StringGuard;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.StringVariable;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.Transition;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.Variable;

@SuppressWarnings("all")
public class XMontiArcFSMMTAdaptersFactory implements AdaptersFactory {
  private static XMontiArcFSMMTAdaptersFactory instance;
  
  public static XMontiArcFSMMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.XMontiArcFSMMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public XMontiArcFSMMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.AutomatonComponentBehavior){
    	return createAutomatonComponentBehaviorAdapter((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.AutomatonComponentBehavior) o, res);
    }
    if (o instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.State){
    	return createStateAdapter((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.State) o, res);
    }
    if (o instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.Transition){
    	return createTransitionAdapter((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.Transition) o, res);
    }
    if (o instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.StringVariable){
    	return createStringVariableAdapter((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.StringVariable) o, res);
    }
    if (o instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.NumberVariable){
    	return createNumberVariableAdapter((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.NumberVariable) o, res);
    }
    if (o instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.BooleanVariable){
    	return createBooleanVariableAdapter((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.BooleanVariable) o, res);
    }
    if (o instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.BooleanGuard){
    	return createBooleanGuardAdapter((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.BooleanGuard) o, res);
    }
    if (o instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.StringGuard){
    	return createStringGuardAdapter((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.StringGuard) o, res);
    }
    if (o instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.EqualNumberGuard){
    	return createEqualNumberGuardAdapter((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.EqualNumberGuard) o, res);
    }
    if (o instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.StringAction){
    	return createStringActionAdapter((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.StringAction) o, res);
    }
    if (o instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.NumberAction){
    	return createNumberActionAdapter((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.NumberAction) o, res);
    }
    if (o instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.BooleanAction){
    	return createBooleanActionAdapter((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.BooleanAction) o, res);
    }
    if (o instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.LessThanNumberGuard){
    	return createLessThanNumberGuardAdapter((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.LessThanNumberGuard) o, res);
    }
    if (o instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.GreaterThanNumberGuard){
    	return createGreaterThanNumberGuardAdapter((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.GreaterThanNumberGuard) o, res);
    }
    if (o instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.GreaterOrEqualThanNumberGuard){
    	return createGreaterOrEqualThanNumberGuardAdapter((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.GreaterOrEqualThanNumberGuard) o, res);
    }
    if (o instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.LessOrEqualThanNumberGuard){
    	return createLessOrEqualThanNumberGuardAdapter((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.LessOrEqualThanNumberGuard) o, res);
    }
    if (o instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.ComponentType){
    	return createComponentTypeAdapter((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.ComponentType) o, res);
    }
    if (o instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.IncomingPort){
    	return createIncomingPortAdapter((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.IncomingPort) o, res);
    }
    if (o instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.OutgoingPort){
    	return createOutgoingPortAdapter((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.OutgoingPort) o, res);
    }
    if (o instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.Port){
    	return createPortAdapter((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.Port) o, res);
    }
    if (o instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.IntermediateConnector){
    	return createIntermediateConnectorAdapter((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.IntermediateConnector) o, res);
    }
    if (o instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.IncomingConnector){
    	return createIncomingConnectorAdapter((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.IncomingConnector) o, res);
    }
    if (o instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.OutgoingConnector){
    	return createOutgoingConnectorAdapter((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.OutgoingConnector) o, res);
    }
    if (o instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.Subcomponent){
    	return createSubcomponentAdapter((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.Subcomponent) o, res);
    }
    if (o instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.GroovyComponentBehavior){
    	return createGroovyComponentBehaviorAdapter((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.GroovyComponentBehavior) o, res);
    }
    if (o instanceof org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.AutomatonComponentBehavior){
    	return createAutomatonComponentBehaviorAdapter((org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.AutomatonComponentBehavior) o, res);
    }
    
    return null;
  }
  
  public AutomatonComponentBehaviorAdapter createAutomatonComponentBehaviorAdapter(final AutomatonComponentBehavior adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.AutomatonComponentBehaviorAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.AutomatonComponentBehaviorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.AutomatonComponentBehaviorAdapter) adapter;
    }
  }
  
  public StateAdapter createStateAdapter(final State adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.StateAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.StateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.StateAdapter) adapter;
    }
  }
  
  public TransitionAdapter createTransitionAdapter(final Transition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.TransitionAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.TransitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.TransitionAdapter) adapter;
    }
  }
  
  public NamedElementAdapter createNamedElementAdapter(final NamedElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.NamedElementAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.NamedElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.NamedElementAdapter) adapter;
    }
  }
  
  public VariableAdapter createVariableAdapter(final Variable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.VariableAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.VariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.VariableAdapter) adapter;
    }
  }
  
  public StringVariableAdapter createStringVariableAdapter(final StringVariable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.StringVariableAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.StringVariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.StringVariableAdapter) adapter;
    }
  }
  
  public NumberVariableAdapter createNumberVariableAdapter(final NumberVariable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.NumberVariableAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.NumberVariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.NumberVariableAdapter) adapter;
    }
  }
  
  public BooleanVariableAdapter createBooleanVariableAdapter(final BooleanVariable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.BooleanVariableAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.BooleanVariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.BooleanVariableAdapter) adapter;
    }
  }
  
  public GuardAdapter createGuardAdapter(final Guard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.GuardAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.GuardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.GuardAdapter) adapter;
    }
  }
  
  public BooleanGuardAdapter createBooleanGuardAdapter(final BooleanGuard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.BooleanGuardAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.BooleanGuardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.BooleanGuardAdapter) adapter;
    }
  }
  
  public StringGuardAdapter createStringGuardAdapter(final StringGuard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.StringGuardAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.StringGuardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.StringGuardAdapter) adapter;
    }
  }
  
  public NumberGuardAdapter createNumberGuardAdapter(final NumberGuard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.NumberGuardAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.NumberGuardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.NumberGuardAdapter) adapter;
    }
  }
  
  public EqualNumberGuardAdapter createEqualNumberGuardAdapter(final EqualNumberGuard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.EqualNumberGuardAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.EqualNumberGuardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.EqualNumberGuardAdapter) adapter;
    }
  }
  
  public ActionAdapter createActionAdapter(final Action adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.ActionAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.ActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.ActionAdapter) adapter;
    }
  }
  
  public StringActionAdapter createStringActionAdapter(final StringAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.StringActionAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.StringActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.StringActionAdapter) adapter;
    }
  }
  
  public NumberActionAdapter createNumberActionAdapter(final NumberAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.NumberActionAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.NumberActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.NumberActionAdapter) adapter;
    }
  }
  
  public BooleanActionAdapter createBooleanActionAdapter(final BooleanAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.BooleanActionAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.BooleanActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.BooleanActionAdapter) adapter;
    }
  }
  
  public LessThanNumberGuardAdapter createLessThanNumberGuardAdapter(final LessThanNumberGuard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.LessThanNumberGuardAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.LessThanNumberGuardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.LessThanNumberGuardAdapter) adapter;
    }
  }
  
  public GreaterThanNumberGuardAdapter createGreaterThanNumberGuardAdapter(final GreaterThanNumberGuard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.GreaterThanNumberGuardAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.GreaterThanNumberGuardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.GreaterThanNumberGuardAdapter) adapter;
    }
  }
  
  public GreaterOrEqualThanNumberGuardAdapter createGreaterOrEqualThanNumberGuardAdapter(final GreaterOrEqualThanNumberGuard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.GreaterOrEqualThanNumberGuardAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.GreaterOrEqualThanNumberGuardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.GreaterOrEqualThanNumberGuardAdapter) adapter;
    }
  }
  
  public LessOrEqualThanNumberGuardAdapter createLessOrEqualThanNumberGuardAdapter(final LessOrEqualThanNumberGuard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.LessOrEqualThanNumberGuardAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.LessOrEqualThanNumberGuardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc.LessOrEqualThanNumberGuardAdapter) adapter;
    }
  }
  
  public ComponentTypeAdapter createComponentTypeAdapter(final ComponentType adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.ComponentTypeAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.ComponentTypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.ComponentTypeAdapter) adapter;
    }
  }
  
  public PortAdapter createPortAdapter(final Port adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.PortAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.PortAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.PortAdapter) adapter;
    }
  }
  
  public IncomingPortAdapter createIncomingPortAdapter(final IncomingPort adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.IncomingPortAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.IncomingPortAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.IncomingPortAdapter) adapter;
    }
  }
  
  public OutgoingPortAdapter createOutgoingPortAdapter(final OutgoingPort adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.OutgoingPortAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.OutgoingPortAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.OutgoingPortAdapter) adapter;
    }
  }
  
  public ConnectorAdapter createConnectorAdapter(final Connector adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.ConnectorAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.ConnectorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.ConnectorAdapter) adapter;
    }
  }
  
  public IntermediateConnectorAdapter createIntermediateConnectorAdapter(final IntermediateConnector adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.IntermediateConnectorAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.IntermediateConnectorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.IntermediateConnectorAdapter) adapter;
    }
  }
  
  public IncomingConnectorAdapter createIncomingConnectorAdapter(final IncomingConnector adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.IncomingConnectorAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.IncomingConnectorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.IncomingConnectorAdapter) adapter;
    }
  }
  
  public OutgoingConnectorAdapter createOutgoingConnectorAdapter(final OutgoingConnector adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.OutgoingConnectorAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.OutgoingConnectorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.OutgoingConnectorAdapter) adapter;
    }
  }
  
  public SubcomponentAdapter createSubcomponentAdapter(final Subcomponent adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.SubcomponentAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.SubcomponentAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.SubcomponentAdapter) adapter;
    }
  }
  
  public ComponentBehaviorAdapter createComponentBehaviorAdapter(final ComponentBehavior adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.ComponentBehaviorAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.ComponentBehaviorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.ComponentBehaviorAdapter) adapter;
    }
  }
  
  public GroovyComponentBehaviorAdapter createGroovyComponentBehaviorAdapter(final GroovyComponentBehavior adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.GroovyComponentBehaviorAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.GroovyComponentBehaviorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.GroovyComponentBehaviorAdapter) adapter;
    }
  }
  
  public org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.AutomatonComponentBehaviorAdapter createAutomatonComponentBehaviorAdapter(final org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.AutomatonComponentBehavior adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.AutomatonComponentBehaviorAdapter) adapter;
    else {
    	adapter = new org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.AutomatonComponentBehaviorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc.AutomatonComponentBehaviorAdapter) adapter;
    }
  }
}
