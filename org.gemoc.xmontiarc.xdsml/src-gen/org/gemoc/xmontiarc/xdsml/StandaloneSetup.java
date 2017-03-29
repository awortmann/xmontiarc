package org.gemoc.xmontiarc.xdsml;

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
    	org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.MontiarcPackage.eNS_URI,
    	org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.MontiarcPackage.eINSTANCE
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
    MelangeRegistry.LanguageDescriptor xMontiArc = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"org.gemoc.xmontiarc.xdsml.XMontiArc", "", "http://org.gemoc.xmontiarc.xdsml.xmontiarc/montiarc/", "org.gemoc.xmontiarc.xdsml.XMontiArcMT"
    );
    xMontiArc.addAdapter("org.gemoc.montiarc.MontiArcMT", org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.XMontiArcAdapter.class);
    xMontiArc.addAdapter("org.gemoc.xmontiarc.xdsml.XMontiArcMT", org.gemoc.xmontiarc.xdsml.xmontiarc.adapters.xmontiarcmt.XMontiArcAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.gemoc.xmontiarc.xdsml.XMontiArc",
    	xMontiArc
    );
    MelangeRegistry.ModelTypeDescriptor xMontiArcMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.gemoc.xmontiarc.xdsml.XMontiArcMT", "", "http://org.gemoc.xmontiarc.xdsml.xmontiarcmt/"
    );
    xMontiArcMT.addSuperType("org.gemoc.montiarc.MontiArcMT");
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.gemoc.xmontiarc.xdsml.XMontiArcMT",
    	xMontiArcMT
    );
  }
}
