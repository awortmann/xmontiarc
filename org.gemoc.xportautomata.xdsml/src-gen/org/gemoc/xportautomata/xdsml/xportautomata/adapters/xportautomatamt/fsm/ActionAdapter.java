package org.gemoc.xportautomata.xdsml.xportautomata.adapters.xportautomatamt.fsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.xportautomata.xdsml.xportautomata.adapters.xportautomatamt.XPortAutomataMTAdaptersFactory;
import org.gemoc.xportautomata.xdsml.xportautomata.fsm.Action;

@SuppressWarnings("all")
public class ActionAdapter extends EObjectAdapter<Action> implements org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.Action {
  private XPortAutomataMTAdaptersFactory adaptersFactory;
  
  public ActionAdapter() {
    super(org.gemoc.xportautomata.xdsml.xportautomata.adapters.xportautomatamt.XPortAutomataMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.xportautomata.xdsml.xportautomata.adapters.xportautomatamt.XPortAutomataMTAdaptersFactory.getInstance();
  }
  
  @Override
  public void execute() {
    org.gemoc.xportautomata.xdsml.xportautomata.aspects.ActionAspect.execute(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.xportautomata.xdsml.xportautomatamt.fsm.FsmPackage.eINSTANCE.getAction();
  }
}
