package ur1.diverse.xmontiarc.xdsml;

import fr.inria.diverse.melange.resource.MelangeRegistry;
import fr.inria.diverse.melange.resource.MelangeRegistryImpl;
import fr.inria.diverse.melange.resource.MelangeResourceFactoryImpl;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

@SuppressWarnings("all")
public class StandaloneSetup {
  public static void doSetup() {
    StandaloneSetup setup = new StandaloneSetup();
    setup.doEMFRegistration();
    setup.doAdaptersRegistration();
  }
  
  public void doEMFRegistration() {
    EPackage.Registry.INSTANCE.put(
    	xmontiarc.XmontiarcPackage.eNS_URI,
    	xmontiarc.XmontiarcPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	ur1.diverse.xmontiarc.xdsml.xmontiarc.runtime.RuntimePackage.eNS_URI,
    	ur1.diverse.xmontiarc.xdsml.xmontiarc.runtime.RuntimePackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.XmontiarcPackage.eNS_URI,
    	ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.XmontiarcPackage.eINSTANCE
    );
    
    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
    	"*",
    	new XMIResourceFactoryImpl()
    );
    Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
    	"melange",
    	new MelangeResourceFactoryImpl()
    );
  }
  
  public void doAdaptersRegistration() {
    MelangeRegistry.LanguageDescriptor montiArc = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"ur1.diverse.xmontiarc.xdsml.MontiArc", "", "http://ur1/diverse/xmontiarc/model", "ur1.diverse.xmontiarc.xdsml.MontiArcMT"
    );
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"ur1.diverse.xmontiarc.xdsml.MontiArc",
    	montiArc
    );
    MelangeRegistry.LanguageDescriptor xMontiArc = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"ur1.diverse.xmontiarc.xdsml.XMontiArc", "", "http://ur1.diverse.xmontiarc.xdsml.xmontiarc/runtime/", "ur1.diverse.xmontiarc.xdsml.XMontiArcMT"
    );
    xMontiArc.addAdapter("ur1.diverse.xmontiarc.xdsml.MontiArcMT", ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.XMontiArcAdapter.class);
    xMontiArc.addAdapter("ur1.diverse.xmontiarc.xdsml.XMontiArcMT", ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.XMontiArcAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"ur1.diverse.xmontiarc.xdsml.XMontiArc",
    	xMontiArc
    );
    MelangeRegistry.ModelTypeDescriptor montiArcMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"ur1.diverse.xmontiarc.xdsml.MontiArcMT", "", "http://ur1.diverse.xmontiarc.xdsml.montiarcmt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"ur1.diverse.xmontiarc.xdsml.MontiArcMT",
    	montiArcMT
    );
    MelangeRegistry.ModelTypeDescriptor xMontiArcMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"ur1.diverse.xmontiarc.xdsml.XMontiArcMT", "", "http://ur1.diverse.xmontiarc.xdsml.xmontiarcmt/"
    );
    xMontiArcMT.addSuperType("ur1.diverse.xmontiarc.xdsml.MontiArcMT");
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"ur1.diverse.xmontiarc.xdsml.XMontiArcMT",
    	xMontiArcMT
    );
  }
}
