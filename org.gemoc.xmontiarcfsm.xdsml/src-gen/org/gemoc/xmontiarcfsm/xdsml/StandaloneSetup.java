package org.gemoc.xmontiarcfsm.xdsml;

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
    	org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.MontiarcPackage.eNS_URI,
    	org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.MontiarcPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.XmontiarcPackage.eNS_URI,
    	org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.xmontiarc.XmontiarcPackage.eINSTANCE
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
    MelangeRegistry.LanguageDescriptor xMontiArcFSM = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"org.gemoc.xmontiarcfsm.xdsml.XMontiArcFSM", "", "http://org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm/montiarc/", "org.gemoc.xmontiarcfsm.xdsml.XMontiArcFSMMT"
    );
    xMontiArcFSM.addAdapter("org.gemoc.xmontiarc.xdsml.XMontiArcMT", org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcmt.XMontiArcFSMAdapter.class);
    xMontiArcFSM.addAdapter("org.gemoc.montiarc.MontiArcMT", org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.montiarcmt.XMontiArcFSMAdapter.class);
    xMontiArcFSM.addAdapter("org.gemoc.xmontiarcfsm.xdsml.XMontiArcFSMMT", org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.adapters.xmontiarcfsmmt.XMontiArcFSMAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.gemoc.xmontiarcfsm.xdsml.XMontiArcFSM",
    	xMontiArcFSM
    );
    MelangeRegistry.ModelTypeDescriptor xMontiArcFSMMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.gemoc.xmontiarcfsm.xdsml.XMontiArcFSMMT", "", "http://org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt/"
    );
    xMontiArcFSMMT.addSuperType("org.gemoc.xmontiarc.xdsml.XMontiArcMT");
    xMontiArcFSMMT.addSuperType("org.gemoc.montiarc.MontiArcMT");
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.gemoc.xmontiarcfsm.xdsml.XMontiArcFSMMT",
    	xMontiArcFSMMT
    );
  }
}
