package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.montiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.MontiArcMTAdaptersFactory;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.ComponentBehavior;

@SuppressWarnings("all")
public class ComponentBehaviorAdapter extends EObjectAdapter<ComponentBehavior> implements org.gemoc.montiarc.montiarc.ComponentBehavior {
  private MontiArcMTAdaptersFactory adaptersFactory;
  
  public ComponentBehaviorAdapter() {
    super(org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.MontiArcMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.MontiArcMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.montiarc.montiarc.MontiarcPackage.eINSTANCE.getComponentBehavior();
  }
}
