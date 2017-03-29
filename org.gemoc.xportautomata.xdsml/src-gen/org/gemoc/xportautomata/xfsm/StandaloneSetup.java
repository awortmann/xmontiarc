package org.gemoc.xportautomata.xfsm;

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
    	org.gemoc.xportautomata.xfsm.xportautomata.fsm.FsmPackage.eNS_URI,
    	org.gemoc.xportautomata.xfsm.xportautomata.fsm.FsmPackage.eINSTANCE
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
    	"org.gemoc.xportautomata.xfsm.XPortAutomata", "", "http://org.gemoc.xportautomata.xfsm.xportautomata/fsm/", "org.gemoc.xportautomata.xfsm.XPortAutomataMT"
    );
    xPortAutomata.addAdapter("org.gemoc.portautomata.PortAutomataMT", org.gemoc.xportautomata.xfsm.xportautomata.adapters.portautomatamt.XPortAutomataAdapter.class);
    xPortAutomata.addAdapter("org.gemoc.xportautomata.xfsm.XPortAutomataMT", org.gemoc.xportautomata.xfsm.xportautomata.adapters.xportautomatamt.XPortAutomataAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.gemoc.xportautomata.xfsm.XPortAutomata",
    	xPortAutomata
    );
    MelangeRegistry.ModelTypeDescriptor xPortAutomataMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.gemoc.xportautomata.xfsm.XPortAutomataMT", "", "http://org.gemoc.xportautomata.xfsm.xportautomatamt/"
    );
    xPortAutomataMT.addSuperType("org.gemoc.portautomata.PortAutomataMT");
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.gemoc.xportautomata.xfsm.XPortAutomataMT",
    	xPortAutomataMT
    );
  }
}
