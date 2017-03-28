package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.gemoc.sample.legacyfsm.fsm.BooleanAction;
import org.gemoc.sample.legacyfsm.fsm.BooleanGuard;
import org.gemoc.sample.legacyfsm.fsm.BooleanVariable;
import org.gemoc.sample.legacyfsm.fsm.EqualNumberGuard;
import org.gemoc.sample.legacyfsm.fsm.FsmFactory;
import org.gemoc.sample.legacyfsm.fsm.FsmPackage;
import org.gemoc.sample.legacyfsm.fsm.GreaterOrEqualThanNumberGuard;
import org.gemoc.sample.legacyfsm.fsm.GreaterThanNumberGuard;
import org.gemoc.sample.legacyfsm.fsm.LessOrEqualThanNumberGuard;
import org.gemoc.sample.legacyfsm.fsm.LessThanNumberGuard;
import org.gemoc.sample.legacyfsm.fsm.NumberAction;
import org.gemoc.sample.legacyfsm.fsm.NumberVariable;
import org.gemoc.sample.legacyfsm.fsm.State;
import org.gemoc.sample.legacyfsm.fsm.StateMachine;
import org.gemoc.sample.legacyfsm.fsm.StringAction;
import org.gemoc.sample.legacyfsm.fsm.StringGuard;
import org.gemoc.sample.legacyfsm.fsm.StringVariable;
import org.gemoc.sample.legacyfsm.fsm.Transition;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.FSMMTAdaptersFactory;

@SuppressWarnings("all")
public class FsmFactoryAdapter extends EFactoryImpl implements FsmFactory {
  private FSMMTAdaptersFactory adaptersFactory = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.FSMMTAdaptersFactory.getInstance();
  
  private org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmFactory fsmAdaptee = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmFactory.eINSTANCE;
  
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
    return org.gemoc.sample.legacyfsm.fsm.FsmPackage.eINSTANCE;
  }
}
