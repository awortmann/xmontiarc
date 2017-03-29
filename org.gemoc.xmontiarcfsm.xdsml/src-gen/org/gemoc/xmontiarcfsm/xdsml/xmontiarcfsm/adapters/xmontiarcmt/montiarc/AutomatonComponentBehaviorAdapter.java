package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcmt.montiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.AutomatonComponentBehavior;

@SuppressWarnings("all")
public class AutomatonComponentBehaviorAdapter extends EObjectAdapter<AutomatonComponentBehavior> implements org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.AutomatonComponentBehavior {
  private XMontiArcMTAdaptersFactory adaptersFactory;
  
  public AutomatonComponentBehaviorAdapter() {
    super(org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.eINSTANCE.getAutomatonComponentBehavior();
  }
}
