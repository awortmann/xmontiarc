package org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.montiarc;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.gemoc.montiarc.montiarc.AutomatonComponentBehavior;
import org.gemoc.montiarc.montiarc.ComponentType;
import org.gemoc.montiarc.montiarc.GroovyComponentBehavior;
import org.gemoc.montiarc.montiarc.IncomingConnector;
import org.gemoc.montiarc.montiarc.IncomingPort;
import org.gemoc.montiarc.montiarc.IntermediateConnector;
import org.gemoc.montiarc.montiarc.MontiarcFactory;
import org.gemoc.montiarc.montiarc.MontiarcPackage;
import org.gemoc.montiarc.montiarc.OutgoingConnector;
import org.gemoc.montiarc.montiarc.OutgoingPort;
import org.gemoc.montiarc.montiarc.Subcomponent;
import org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.MontiArcMTAdaptersFactory;

@SuppressWarnings("all")
public class MontiarcFactoryAdapter extends EFactoryImpl implements MontiarcFactory {
  private MontiArcMTAdaptersFactory adaptersFactory = org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.MontiArcMTAdaptersFactory.getInstance();
  
  private org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.MontiarcFactory montiarcAdaptee = org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.MontiarcFactory.eINSTANCE;
  
  @Override
  public ComponentType createComponentType() {
    return adaptersFactory.createComponentTypeAdapter(montiarcAdaptee.createComponentType(), null);
  }
  
  @Override
  public IncomingPort createIncomingPort() {
    return adaptersFactory.createIncomingPortAdapter(montiarcAdaptee.createIncomingPort(), null);
  }
  
  @Override
  public OutgoingPort createOutgoingPort() {
    return adaptersFactory.createOutgoingPortAdapter(montiarcAdaptee.createOutgoingPort(), null);
  }
  
  @Override
  public IntermediateConnector createIntermediateConnector() {
    return adaptersFactory.createIntermediateConnectorAdapter(montiarcAdaptee.createIntermediateConnector(), null);
  }
  
  @Override
  public IncomingConnector createIncomingConnector() {
    return adaptersFactory.createIncomingConnectorAdapter(montiarcAdaptee.createIncomingConnector(), null);
  }
  
  @Override
  public OutgoingConnector createOutgoingConnector() {
    return adaptersFactory.createOutgoingConnectorAdapter(montiarcAdaptee.createOutgoingConnector(), null);
  }
  
  @Override
  public Subcomponent createSubcomponent() {
    return adaptersFactory.createSubcomponentAdapter(montiarcAdaptee.createSubcomponent(), null);
  }
  
  @Override
  public GroovyComponentBehavior createGroovyComponentBehavior() {
    return adaptersFactory.createGroovyComponentBehaviorAdapter(montiarcAdaptee.createGroovyComponentBehavior(), null);
  }
  
  @Override
  public AutomatonComponentBehavior createAutomatonComponentBehavior() {
    return adaptersFactory.createAutomatonComponentBehaviorAdapter(montiarcAdaptee.createAutomatonComponentBehavior(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getMontiarcPackage();
  }
  
  public MontiarcPackage getMontiarcPackage() {
    return org.gemoc.montiarc.montiarc.MontiarcPackage.eINSTANCE;
  }
}
