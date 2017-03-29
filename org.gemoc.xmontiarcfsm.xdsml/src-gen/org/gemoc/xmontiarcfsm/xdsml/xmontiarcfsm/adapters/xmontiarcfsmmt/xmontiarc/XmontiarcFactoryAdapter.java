package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.xmontiarc;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.XMontiArcFSMMTAdaptersFactory;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.AutomatonComponentBehavior;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.BooleanAction;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.BooleanGuard;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.BooleanVariable;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.EqualNumberGuard;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.GreaterOrEqualThanNumberGuard;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.GreaterThanNumberGuard;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.LessOrEqualThanNumberGuard;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.LessThanNumberGuard;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.NumberAction;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.NumberVariable;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.State;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.StringAction;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.StringGuard;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.StringVariable;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.Transition;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcFactory;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage;

@SuppressWarnings("all")
public class XmontiarcFactoryAdapter extends EFactoryImpl implements XmontiarcFactory {
  private XMontiArcFSMMTAdaptersFactory adaptersFactory = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.XMontiArcFSMMTAdaptersFactory.getInstance();
  
  private org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.XmontiarcFactory xmontiarcAdaptee = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.XmontiarcFactory.eINSTANCE;
  
  @Override
  public AutomatonComponentBehavior createAutomatonComponentBehavior() {
    return adaptersFactory.createAutomatonComponentBehaviorAdapter(xmontiarcAdaptee.createAutomatonComponentBehavior(), null);
  }
  
  @Override
  public State createState() {
    return adaptersFactory.createStateAdapter(xmontiarcAdaptee.createState(), null);
  }
  
  @Override
  public Transition createTransition() {
    return adaptersFactory.createTransitionAdapter(xmontiarcAdaptee.createTransition(), null);
  }
  
  @Override
  public StringVariable createStringVariable() {
    return adaptersFactory.createStringVariableAdapter(xmontiarcAdaptee.createStringVariable(), null);
  }
  
  @Override
  public NumberVariable createNumberVariable() {
    return adaptersFactory.createNumberVariableAdapter(xmontiarcAdaptee.createNumberVariable(), null);
  }
  
  @Override
  public BooleanVariable createBooleanVariable() {
    return adaptersFactory.createBooleanVariableAdapter(xmontiarcAdaptee.createBooleanVariable(), null);
  }
  
  @Override
  public BooleanGuard createBooleanGuard() {
    return adaptersFactory.createBooleanGuardAdapter(xmontiarcAdaptee.createBooleanGuard(), null);
  }
  
  @Override
  public StringGuard createStringGuard() {
    return adaptersFactory.createStringGuardAdapter(xmontiarcAdaptee.createStringGuard(), null);
  }
  
  @Override
  public EqualNumberGuard createEqualNumberGuard() {
    return adaptersFactory.createEqualNumberGuardAdapter(xmontiarcAdaptee.createEqualNumberGuard(), null);
  }
  
  @Override
  public StringAction createStringAction() {
    return adaptersFactory.createStringActionAdapter(xmontiarcAdaptee.createStringAction(), null);
  }
  
  @Override
  public NumberAction createNumberAction() {
    return adaptersFactory.createNumberActionAdapter(xmontiarcAdaptee.createNumberAction(), null);
  }
  
  @Override
  public BooleanAction createBooleanAction() {
    return adaptersFactory.createBooleanActionAdapter(xmontiarcAdaptee.createBooleanAction(), null);
  }
  
  @Override
  public LessThanNumberGuard createLessThanNumberGuard() {
    return adaptersFactory.createLessThanNumberGuardAdapter(xmontiarcAdaptee.createLessThanNumberGuard(), null);
  }
  
  @Override
  public GreaterThanNumberGuard createGreaterThanNumberGuard() {
    return adaptersFactory.createGreaterThanNumberGuardAdapter(xmontiarcAdaptee.createGreaterThanNumberGuard(), null);
  }
  
  @Override
  public GreaterOrEqualThanNumberGuard createGreaterOrEqualThanNumberGuard() {
    return adaptersFactory.createGreaterOrEqualThanNumberGuardAdapter(xmontiarcAdaptee.createGreaterOrEqualThanNumberGuard(), null);
  }
  
  @Override
  public LessOrEqualThanNumberGuard createLessOrEqualThanNumberGuard() {
    return adaptersFactory.createLessOrEqualThanNumberGuardAdapter(xmontiarcAdaptee.createLessOrEqualThanNumberGuard(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getXmontiarcPackage();
  }
  
  public XmontiarcPackage getXmontiarcPackage() {
    return org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage.eINSTANCE;
  }
}
