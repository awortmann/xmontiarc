package org.gemoc.xportautomata.xdsml.xportautomata.adapters.xportautomatamt.fsm;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.gemoc.xportautomata.xdsml.xportautomata.adapters.xportautomatamt.XPortAutomataMTAdaptersFactory;
import org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.BooleanAction;
import org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.BooleanGuard;
import org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.BooleanVariable;
import org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.EqualNumberGuard;
import org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.FsmFactory;
import org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.FsmPackage;
import org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.GreaterOrEqualThanNumberGuard;
import org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.GreaterThanNumberGuard;
import org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.LessOrEqualThanNumberGuard;
import org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.LessThanNumberGuard;
import org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.NumberAction;
import org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.NumberVariable;
import org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.State;
import org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.StateMachine;
import org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.StringAction;
import org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.StringGuard;
import org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.StringVariable;
import org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.Transition;

@SuppressWarnings("all")
public class FsmFactoryAdapter extends EFactoryImpl implements FsmFactory {
  private XPortAutomataMTAdaptersFactory adaptersFactory = org.gemoc.xportautomata.xdsml.xportautomata.adapters.xportautomatamt.XPortAutomataMTAdaptersFactory.getInstance();
  
  private org.gemoc.xportautomata.xdsml.xportautomata.fsm.FsmFactory fsmAdaptee = org.gemoc.xportautomata.xdsml.xportautomata.fsm.FsmFactory.eINSTANCE;
  
  @Override
  public StateMachine createStateMachine() {
    return adaptersFactory.createStateMachineAdapter(fsmAdaptee.createStateMachine(), null);
  }
  
  @Override
  public State createState() {
    return adaptersFactory.createStateAdapter(fsmAdaptee.createState(), null);
  }
  
  @Override
  public Transition createTransition() {
    return adaptersFactory.createTransitionAdapter(fsmAdaptee.createTransition(), null);
  }
  
  @Override
  public StringVariable createStringVariable() {
    return adaptersFactory.createStringVariableAdapter(fsmAdaptee.createStringVariable(), null);
  }
  
  @Override
  public NumberVariable createNumberVariable() {
    return adaptersFactory.createNumberVariableAdapter(fsmAdaptee.createNumberVariable(), null);
  }
  
  @Override
  public BooleanVariable createBooleanVariable() {
    return adaptersFactory.createBooleanVariableAdapter(fsmAdaptee.createBooleanVariable(), null);
  }
  
  @Override
  public BooleanGuard createBooleanGuard() {
    return adaptersFactory.createBooleanGuardAdapter(fsmAdaptee.createBooleanGuard(), null);
  }
  
  @Override
  public StringGuard createStringGuard() {
    return adaptersFactory.createStringGuardAdapter(fsmAdaptee.createStringGuard(), null);
  }
  
  @Override
  public EqualNumberGuard createEqualNumberGuard() {
    return adaptersFactory.createEqualNumberGuardAdapter(fsmAdaptee.createEqualNumberGuard(), null);
  }
  
  @Override
  public StringAction createStringAction() {
    return adaptersFactory.createStringActionAdapter(fsmAdaptee.createStringAction(), null);
  }
  
  @Override
  public NumberAction createNumberAction() {
    return adaptersFactory.createNumberActionAdapter(fsmAdaptee.createNumberAction(), null);
  }
  
  @Override
  public BooleanAction createBooleanAction() {
    return adaptersFactory.createBooleanActionAdapter(fsmAdaptee.createBooleanAction(), null);
  }
  
  @Override
  public LessThanNumberGuard createLessThanNumberGuard() {
    return adaptersFactory.createLessThanNumberGuardAdapter(fsmAdaptee.createLessThanNumberGuard(), null);
  }
  
  @Override
  public GreaterThanNumberGuard createGreaterThanNumberGuard() {
    return adaptersFactory.createGreaterThanNumberGuardAdapter(fsmAdaptee.createGreaterThanNumberGuard(), null);
  }
  
  @Override
  public GreaterOrEqualThanNumberGuard createGreaterOrEqualThanNumberGuard() {
    return adaptersFactory.createGreaterOrEqualThanNumberGuardAdapter(fsmAdaptee.createGreaterOrEqualThanNumberGuard(), null);
  }
  
  @Override
  public LessOrEqualThanNumberGuard createLessOrEqualThanNumberGuard() {
    return adaptersFactory.createLessOrEqualThanNumberGuardAdapter(fsmAdaptee.createLessOrEqualThanNumberGuard(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getFsmPackage();
  }
  
  public FsmPackage getFsmPackage() {
    return org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.FsmPackage.eINSTANCE;
  }
}
