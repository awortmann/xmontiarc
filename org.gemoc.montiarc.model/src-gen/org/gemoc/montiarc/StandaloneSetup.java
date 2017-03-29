package org.gemoc.montiarc;

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
    	org.gemoc.montiarc.montiarc.MontiarcPackage.eNS_URI,
    	org.gemoc.montiarc.montiarc.MontiarcPackage.eINSTANCE
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
    	"org.gemoc.montiarc.MontiArc", "", "http://org/gemoc/montiarc/model", "org.gemoc.montiarc.MontiArcMT"
    );
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.gemoc.montiarc.MontiArc",
    	montiArc
    );
    MelangeRegistry.ModelTypeDescriptor montiArcMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.gemoc.montiarc.MontiArcMT", "", "http://org.gemoc.montiarc.montiarcmt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.gemoc.montiarc.MontiArcMT",
    	montiArcMT
    );
  }
}
