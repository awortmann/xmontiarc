package ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory;
import ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.AutomatonComponentBehavior;
import ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.ComponentType;
import ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.GroovyComponentBehavior;
import ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.IncomingConnector;
import ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.IncomingPort;
import ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.IntermediateConnector;
import ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.OutgoingConnector;
import ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.OutgoingPort;
import ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Port;
import ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Subcomponent;
import ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcFactory;
import ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage;

@SuppressWarnings("all")
public class XmontiarcFactoryAdapter extends EFactoryImpl implements XmontiarcFactory {
  private XMontiArcMTAdaptersFactory adaptersFactory = ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory.getInstance();
  
  private ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.XmontiarcFactory xmontiarcAdaptee = ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.XmontiarcFactory.eINSTANCE;
  
  @Override
  public ComponentType createComponentType() {
    return adaptersFactory.createComponentTypeAdapter(xmontiarcAdaptee.createComponentType(), null);
  }
  
  @Override
  public Port createPort() {
    return adaptersFactory.createPortAdapter(xmontiarcAdaptee.createPort(), null);
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
    return ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.eINSTANCE;
  }
}
