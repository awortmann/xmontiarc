package org.gemoc.portautomata;

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
    	org.gemoc.portautomata.fsm.fsmPackage.eNS_URI,
    	org.gemoc.portautomata.fsm.fsmPackage.eINSTANCE
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
    MelangeRegistry.LanguageDescriptor portAutomata = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"org.gemoc.portautomata.PortAutomata", "", "http://www.gemoc.org/legacyfsm/fsm", "org.gemoc.portautomata.PortAutomataMT"
    );
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.gemoc.portautomata.PortAutomata",
    	portAutomata
    );
    MelangeRegistry.ModelTypeDescriptor portAutomataMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.gemoc.portautomata.PortAutomataMT", "", "http://org.gemoc.portautomata.portautomatamt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.gemoc.portautomata.PortAutomataMT",
    	portAutomataMT
    );
  }
}
