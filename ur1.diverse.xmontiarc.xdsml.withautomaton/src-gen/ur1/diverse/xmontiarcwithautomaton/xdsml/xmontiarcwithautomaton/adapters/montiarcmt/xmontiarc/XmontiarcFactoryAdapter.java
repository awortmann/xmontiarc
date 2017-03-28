package ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.xmontiarc;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.MontiArcMTAdaptersFactory;
import xmontiarc.AutomatonComponentBehavior;
import xmontiarc.ComponentType;
import xmontiarc.GroovyComponentBehavior;
import xmontiarc.IncomingConnector;
import xmontiarc.IncomingPort;
import xmontiarc.IntermediateConnector;
import xmontiarc.OutgoingConnector;
import xmontiarc.OutgoingPort;
import xmontiarc.Subcomponent;
import xmontiarc.XmontiarcFactory;
import xmontiarc.XmontiarcPackage;

@SuppressWarnings("all")
public class XmontiarcFactoryAdapter extends EFactoryImpl implements XmontiarcFactory {
  private MontiArcMTAdaptersFactory adaptersFactory = ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.MontiArcMTAdaptersFactory.getInstance();
  
  private ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.XmontiarcFactory xmontiarcAdaptee = ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.XmontiarcFactory.eINSTANCE;
  
  @Override
  public ComponentType createComponentType() {
    return adaptersFactory.createComponentTypeAdapter(xmontiarcAdaptee.createComponentType(), null);
  }
  
  @Override
  public IncomingPort createIncomingPort() {
    return adaptersFactory.createIncomingPortAdapter(xmontiarcAdaptee.createIncomingPort(), null);
  }
  
  @Override
  public OutgoingPort createOutgoingPort() {
    return adaptersFactory.createOutgoingPortAdapter(xmontiarcAdaptee.createOutgoingPort(), null);
  }
  
  @Override
  public IntermediateConnector createIntermediateConnector() {
    return adaptersFactory.createIntermediateConnectorAdapter(xmontiarcAdaptee.createIntermediateConnector(), null);
  }
  
  @Override
  public IncomingConnector createIncomingConnector() {
    return adaptersFactory.createIncomingConnectorAdapter(xmontiarcAdaptee.createIncomingConnector(), null);
  }
  
  @Override
  public OutgoingConnector createOutgoingConnector() {
    return adaptersFactory.createOutgoingConnectorAdapter(xmontiarcAdaptee.createOutgoingConnector(), null);
  }
  
  @Override
  public Subcomponent createSubcomponent() {
    return adaptersFactory.createSubcomponentAdapter(xmontiarcAdaptee.createSubcomponent(), null);
  }
  
  @Override
  public GroovyComponentBehavior createGroovyComponentBehavior() {
    return adaptersFactory.createGroovyComponentBehaviorAdapter(xmontiarcAdaptee.createGroovyComponentBehavior(), null);
  }
  
  @Override
  public AutomatonComponentBehavior createAutomatonComponentBehavior() {
    return adaptersFactory.createAutomatonComponentBehaviorAdapter(xmontiarcAdaptee.createAutomatonComponentBehavior(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getXmontiarcPackage();
  }
  
  public XmontiarcPackage getXmontiarcPackage() {
    return xmontiarc.XmontiarcPackage.eINSTANCE;
  }
}
