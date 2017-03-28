package ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.fsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.FSMMTAdaptersFactory;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.Action;

@SuppressWarnings("all")
public class ActionAdapter extends EObjectAdapter<Action> implements org.gemoc.sample.legacyfsm.fsm.Action {
  private FSMMTAdaptersFactory adaptersFactory;
  
  public ActionAdapter() {
    super(ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.FSMMTAdaptersFactory.getInstance());
    adaptersFactory = ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.FSMMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.sample.legacyfsm.fsm.FsmPackage.eINSTANCE.getAction();
  }
}
