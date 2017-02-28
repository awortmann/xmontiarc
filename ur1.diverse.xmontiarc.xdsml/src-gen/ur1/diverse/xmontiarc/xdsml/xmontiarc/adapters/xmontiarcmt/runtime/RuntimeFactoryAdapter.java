package ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.runtime;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory;
import ur1.diverse.xmontiarc.xdsml.xmontiarcmt.runtime.Message;
import ur1.diverse.xmontiarc.xdsml.xmontiarcmt.runtime.RuntimeFactory;
import ur1.diverse.xmontiarc.xdsml.xmontiarcmt.runtime.RuntimePackage;

@SuppressWarnings("all")
public class RuntimeFactoryAdapter extends EFactoryImpl implements RuntimeFactory {
  private XMontiArcMTAdaptersFactory adaptersFactory = ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.XMontiArcMTAdaptersFactory.getInstance();
  
  private ur1.diverse.xmontiarc.xdsml.xmontiarc.runtime.RuntimeFactory runtimeAdaptee = ur1.diverse.xmontiarc.xdsml.xmontiarc.runtime.RuntimeFactory.eINSTANCE;
  
  @Override
  public Message createMessage() {
    return adaptersFactory.createMessageAdapter(runtimeAdaptee.createMessage(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getRuntimePackage();
  }
  
  public RuntimePackage getRuntimePackage() {
    return ur1.diverse.xmontiarc.xdsml.xmontiarcmt.runtime.RuntimePackage.eINSTANCE;
  }
}
