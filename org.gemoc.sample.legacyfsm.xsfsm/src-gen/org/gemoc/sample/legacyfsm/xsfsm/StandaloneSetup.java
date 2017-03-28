package org.gemoc.sample.legacyfsm.xsfsm;

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
    	org.gemoc.sample.legacyfsm.fsm.FsmPackage.eNS_URI,
    	org.gemoc.sample.legacyfsm.fsm.FsmPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmPackage.eNS_URI,
    	org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmPackage.eINSTANCE
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
    MelangeRegistry.LanguageDescriptor fSM = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"org.gemoc.sample.legacyfsm.xsfsm.FSM", "", "http://www.gemoc.org/legacyfsm/fsm", "org.gemoc.sample.legacyfsm.xsfsm.FSMMT"
    );
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.gemoc.sample.legacyfsm.xsfsm.FSM",
    	fSM
    );
    MelangeRegistry.LanguageDescriptor xSFSM = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"org.gemoc.sample.legacyfsm.xsfsm.XSFSM", "", "http://org.gemoc.sample.legacyfsm.xsfsm.xsfsm/fsm/", "org.gemoc.sample.legacyfsm.xsfsm.XSFSMMT"
    );
    xSFSM.addAdapter("org.gemoc.sample.legacyfsm.xsfsm.FSMMT", org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.XSFSMAdapter.class);
    xSFSM.addAdapter("org.gemoc.sample.legacyfsm.xsfsm.XSFSMMT", org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.XSFSMAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.gemoc.sample.legacyfsm.xsfsm.XSFSM",
    	xSFSM
    );
    MelangeRegistry.ModelTypeDescriptor fSMMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.gemoc.sample.legacyfsm.xsfsm.FSMMT", "", "http://org.gemoc.sample.legacyfsm.xsfsm.fsmmt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.gemoc.sample.legacyfsm.xsfsm.FSMMT",
    	fSMMT
    );
    MelangeRegistry.ModelTypeDescriptor xSFSMMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.gemoc.sample.legacyfsm.xsfsm.XSFSMMT", "", "http://org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt/"
    );
    xSFSMMT.addSuperType("org.gemoc.sample.legacyfsm.xsfsm.FSMMT");
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.gemoc.sample.legacyfsm.xsfsm.XSFSMMT",
    	xSFSMMT
    );
  }
}
