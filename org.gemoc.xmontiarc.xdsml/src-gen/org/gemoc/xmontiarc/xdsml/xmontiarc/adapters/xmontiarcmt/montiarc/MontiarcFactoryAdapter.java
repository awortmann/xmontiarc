package org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.montiarc;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory;
import org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.AutomatonComponentBehavior;
import org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.ComponentType;
import org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.GroovyComponentBehavior;
import org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.IncomingConnector;
import org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.IncomingPort;
import org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.IntermediateConnector;
import org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcFactory;
import org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage;
import org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.OutgoingConnector;
import org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.OutgoingPort;
import org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.Port;
import org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.Subcomponent;

@SuppressWarnings("all")
public class MontiarcFactoryAdapter extends EFactoryImpl implements MontiarcFactory {
  private XMontiArcMTAdaptersFactory adaptersFactory = org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory.getInstance();
  
  private org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.MontiarcFactory montiarcAdaptee = org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.MontiarcFactory.eINSTANCE;
  
  @Override
  public ComponentType createComponentType() {
    return adaptersFactory.createComponentTypeAdapter(montiarcAdaptee.createComponentType(), null);
  }
  
  @Override
  public Port createPort() {
    return adaptersFactory.createPortAdapter(montiarcAdaptee.createPort(), null);
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
    return org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage.eINSTANCE;
  }
}
