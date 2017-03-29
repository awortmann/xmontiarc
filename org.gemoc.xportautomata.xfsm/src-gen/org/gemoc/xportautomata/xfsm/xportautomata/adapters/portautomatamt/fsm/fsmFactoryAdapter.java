package org.gemoc.xportautomata.xfsm.xportautomata.adapters.portautomatamt.fsm;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.gemoc.portautomata.fsm.BooleanAction;
import org.gemoc.portautomata.fsm.BooleanGuard;
import org.gemoc.portautomata.fsm.BooleanVariable;
import org.gemoc.portautomata.fsm.EqualNumberGuard;
import org.gemoc.portautomata.fsm.GreaterOrEqualThanNumberGuard;
import org.gemoc.portautomata.fsm.GreaterThanNumberGuard;
import org.gemoc.portautomata.fsm.LessOrEqualThanNumberGuard;
import org.gemoc.portautomata.fsm.LessThanNumberGuard;
import org.gemoc.portautomata.fsm.NumberAction;
import org.gemoc.portautomata.fsm.NumberVariable;
import org.gemoc.portautomata.fsm.State;
import org.gemoc.portautomata.fsm.StateMachine;
import org.gemoc.portautomata.fsm.StringAction;
import org.gemoc.portautomata.fsm.StringGuard;
import org.gemoc.portautomata.fsm.StringVariable;
import org.gemoc.portautomata.fsm.Transition;
import org.gemoc.portautomata.fsm.fsmFactory;
import org.gemoc.portautomata.fsm.fsmPackage;
import org.gemoc.xportautomata.xfsm.xportautomata.adapters.portautomatamt.PortAutomataMTAdaptersFactory;
import org.gemoc.xportautomata.xfsm.xportautomata.fsm.FsmFactory;

@SuppressWarnings("all")
public class fsmFactoryAdapter extends EFactoryImpl implements fsmFactory {
  private PortAutomataMTAdaptersFactory adaptersFactory = org.gemoc.xportautomata.xfsm.xportautomata.adapters.portautomatamt.PortAutomataMTAdaptersFactory.getInstance();
  
  private FsmFactory fsmAdaptee = org.gemoc.xportautomata.xfsm.xportautomata.fsm.FsmFactory.eINSTANCE;
  
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
    return getfsmPackage();
  }
  
  public fsmPackage getfsmPackage() {
    return org.gemoc.portautomata.fsm.fsmPackage.eINSTANCE;
  }
}
