package org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory;
import org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.AutomatonComponentBehavior;

@SuppressWarnings("all")
public class AutomatonComponentBehaviorAdapter extends EObjectAdapter<AutomatonComponentBehavior> implements org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.AutomatonComponentBehavior {
  private XMontiArcMTAdaptersFactory adaptersFactory;
  
  public AutomatonComponentBehaviorAdapter() {
    super(org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory.getInstance();
  }
  
  @Override
  public void process() {
    org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.AutomatonComponentBehaviorAspect.process(adaptee);
  }
  
  @Override
  public void sendPortValuesToAutomaton() {
    org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.AutomatonComponentBehaviorAspect.sendPortValuesToAutomaton(adaptee);
  }
  
  @Override
  public void setPortValuesFromAutomaton() {
    org.gemoc.xmontiarc.xdsml.xmontiarc.aspects.AutomatonComponentBehaviorAspect.setPortValuesFromAutomaton(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.eINSTANCE.getAutomatonComponentBehavior();
  }
}
