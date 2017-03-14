package ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.xmontiarc;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.MontiArcMTAdaptersFactory;
import xmontiarc.ComponentType;
import xmontiarc.Connector;
import xmontiarc.Port;
import xmontiarc.Subcomponent;
import xmontiarc.XmontiarcFactory;
import xmontiarc.XmontiarcPackage;

@SuppressWarnings("all")
public class XmontiarcFactoryAdapter extends EFactoryImpl implements XmontiarcFactory {
  private MontiArcMTAdaptersFactory adaptersFactory = ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.MontiArcMTAdaptersFactory.getInstance();
  
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
    return xmontiarc.XmontiarcPackage.eINSTANCE;
  }
}
