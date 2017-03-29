package org.gemoc.xportautomata.xdsml;

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
    	org.gemoc.xportautomata.xdsml.xportautomata.fsm.FsmPackage.eNS_URI,
    	org.gemoc.xportautomata.xdsml.xportautomata.fsm.FsmPackage.eINSTANCE
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
    MelangeRegistry.LanguageDescriptor xPortAutomata = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"org.gemoc.xportautomata.xdsml.XPortAutomata", "", "http://org.gemoc.xportautomata.xdsml.xportautomata/fsm/", "org.gemoc.xportautomata.xdsml.XPortAutomataMT"
    );
    xPortAutomata.addAdapter("org.gemoc.portautomata.PortAutomataMT", org.gemoc.xportautomata.xdsml.xportautomata.adapters.portautomatamt.XPortAutomataAdapter.class);
    xPortAutomata.addAdapter("org.gemoc.xportautomata.xdsml.XPortAutomataMT", org.gemoc.xportautomata.xdsml.xportautomata.adapters.xportautomatamt.XPortAutomataAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.gemoc.xportautomata.xdsml.XPortAutomata",
    	xPortAutomata
    );
    MelangeRegistry.ModelTypeDescriptor xPortAutomataMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.gemoc.xportautomata.xdsml.XPortAutomataMT", "", "http://org.gemoc.xportautomata.xdsml.xportautomatamt/"
    );
    xPortAutomataMT.addSuperType("org.gemoc.portautomata.PortAutomataMT");
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.gemoc.xportautomata.xdsml.XPortAutomataMT",
    	xPortAutomataMT
    );
  }
}
