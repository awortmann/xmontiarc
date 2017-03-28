package ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.xsfsmmt.fsm;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.xsfsmmt.XSFSMMTAdaptersFactory;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.BooleanAction;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.BooleanGuard;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.BooleanVariable;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.EqualNumberGuard;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.FsmFactory;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.FsmPackage;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.GreaterOrEqualThanNumberGuard;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.GreaterThanNumberGuard;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.LessOrEqualThanNumberGuard;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.LessThanNumberGuard;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.NumberAction;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.NumberVariable;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.State;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.StateMachine;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.StringAction;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.StringGuard;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.StringVariable;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.Transition;

@SuppressWarnings("all")
public class FsmFactoryAdapter extends EFactoryImpl implements FsmFactory {
  private XSFSMMTAdaptersFactory adaptersFactory = ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.xsfsmmt.XSFSMMTAdaptersFactory.getInstance();
  
  private ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.FsmFactory fsmAdaptee = ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.FsmFactory.eINSTANCE;
  
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
    return ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.FsmPackage.eINSTANCE;
  }
}
