package ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.xmontiarc;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory;
import ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.ComponentType;
import ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Connector;
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
  public Connector createConnector() {
    return adaptersFactory.createConnectorAdapter(xmontiarcAdaptee.createConnector(), null);
  }
  
  @Override
  public Subcomponent createSubcomponent() {
    return adaptersFactory.createSubcomponentAdapter(xmontiarcAdaptee.createSubcomponent(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getXmontiarcPackage();
  }
  
  public XmontiarcPackage getXmontiarcPackage() {
    return ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage.eINSTANCE;
  }
}