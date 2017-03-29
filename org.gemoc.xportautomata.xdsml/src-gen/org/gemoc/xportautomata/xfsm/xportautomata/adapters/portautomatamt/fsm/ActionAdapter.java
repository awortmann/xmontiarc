package org.gemoc.xportautomata.xfsm.xportautomata.adapters.portautomatamt.fsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.xportautomata.xfsm.xportautomata.adapters.portautomatamt.PortAutomataMTAdaptersFactory;
import org.gemoc.xportautomata.xfsm.xportautomata.fsm.Action;

@SuppressWarnings("all")
public class ActionAdapter extends EObjectAdapter<Action> implements org.gemoc.portautomata.fsm.Action {
  private PortAutomataMTAdaptersFactory adaptersFactory;
  
  public ActionAdapter() {
    super(org.gemoc.xportautomata.xfsm.xportautomata.adapters.portautomatamt.PortAutomataMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.xportautomata.xfsm.xportautomata.adapters.portautomatamt.PortAutomataMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.portautomata.fsm.fsmPackage.eINSTANCE.getAction();
  }
}
