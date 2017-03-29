package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.montiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.XMontiArcFSMMTAdaptersFactory;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.ComponentBehavior;

@SuppressWarnings("all")
public class ComponentBehaviorAdapter extends EObjectAdapter<ComponentBehavior> implements org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.montiarc.ComponentBehavior {
  private XMontiArcFSMMTAdaptersFactory adaptersFactory;
  
  public ComponentBehaviorAdapter() {
    super(org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.XMontiArcFSMMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.XMontiArcFSMMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.montiarc.MontiarcPackage.eINSTANCE.getComponentBehavior();
  }
}
