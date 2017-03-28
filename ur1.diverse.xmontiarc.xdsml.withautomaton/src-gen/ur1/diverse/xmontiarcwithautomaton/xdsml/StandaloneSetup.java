package ur1.diverse.xmontiarcwithautomaton.xdsml;

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
    	ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.FsmPackage.eNS_URI,
    	ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.FsmPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	xmontiarc.XmontiarcPackage.eNS_URI,
    	xmontiarc.XmontiarcPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.xmontiarc.XmontiarcPackage.eNS_URI,
    	ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.xmontiarc.XmontiarcPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.XmontiarcPackage.eNS_URI,
    	ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.XmontiarcPackage.eINSTANCE
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
    	"ur1.diverse.xmontiarcwithautomaton.xdsml.FSM", "", "http://www.gemoc.org/legacyfsm/fsm", "ur1.diverse.xmontiarcwithautomaton.xdsml.FSMMT"
    );
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"ur1.diverse.xmontiarcwithautomaton.xdsml.FSM",
    	fSM
    );
    MelangeRegistry.LanguageDescriptor xSFSM = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"ur1.diverse.xmontiarcwithautomaton.xdsml.XSFSM", "", "http://ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm/fsm/", "ur1.diverse.xmontiarcwithautomaton.xdsml.XSFSMMT"
    );
    xSFSM.addAdapter("ur1.diverse.xmontiarcwithautomaton.xdsml.FSMMT", ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.XSFSMAdapter.class);
    xSFSM.addAdapter("ur1.diverse.xmontiarcwithautomaton.xdsml.XSFSMMT", ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.xsfsmmt.XSFSMAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"ur1.diverse.xmontiarcwithautomaton.xdsml.XSFSM",
    	xSFSM
    );
    MelangeRegistry.LanguageDescriptor montiArc = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"ur1.diverse.xmontiarcwithautomaton.xdsml.MontiArc", "", "http://ur1/diverse/xmontiarc/model", "ur1.diverse.xmontiarcwithautomaton.xdsml.MontiArcMT"
    );
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"ur1.diverse.xmontiarcwithautomaton.xdsml.MontiArc",
    	montiArc
    );
    MelangeRegistry.LanguageDescriptor xMontiArc = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"ur1.diverse.xmontiarcwithautomaton.xdsml.XMontiArc", "", "http://ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc/xmontiarc/", "ur1.diverse.xmontiarcwithautomaton.xdsml.XMontiArcMT"
    );
    xMontiArc.addAdapter("ur1.diverse.xmontiarcwithautomaton.xdsml.MontiArcMT", ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.adapters.montiarcmt.XMontiArcAdapter.class);
    xMontiArc.addAdapter("ur1.diverse.xmontiarcwithautomaton.xdsml.XMontiArcMT", ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.adapters.xmontiarcmt.XMontiArcAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"ur1.diverse.xmontiarcwithautomaton.xdsml.XMontiArc",
    	xMontiArc
    );
    MelangeRegistry.LanguageDescriptor xMontiArcWithAutomaton = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"ur1.diverse.xmontiarcwithautomaton.xdsml.XMontiArcWithAutomaton", "", "http://ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton/xmontiarc/", "ur1.diverse.xmontiarcwithautomaton.xdsml.XMontiArcWithAutomatonMT"
    );
    xMontiArcWithAutomaton.addAdapter("ur1.diverse.xmontiarcwithautomaton.xdsml.MontiArcMT", ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.XMontiArcWithAutomatonAdapter.class);
    xMontiArcWithAutomaton.addAdapter("ur1.diverse.xmontiarcwithautomaton.xdsml.XMontiArcMT", ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.xmontiarcmt.XMontiArcWithAutomatonAdapter.class);
    xMontiArcWithAutomaton.addAdapter("ur1.diverse.xmontiarcwithautomaton.xdsml.XMontiArcWithAutomatonMT", ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.xmontiarcwithautomatonmt.XMontiArcWithAutomatonAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"ur1.diverse.xmontiarcwithautomaton.xdsml.XMontiArcWithAutomaton",
    	xMontiArcWithAutomaton
    );
    MelangeRegistry.ModelTypeDescriptor fSMMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"ur1.diverse.xmontiarcwithautomaton.xdsml.FSMMT", "", "http://ur1.diverse.xmontiarcwithautomaton.xdsml.fsmmt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"ur1.diverse.xmontiarcwithautomaton.xdsml.FSMMT",
    	fSMMT
    );
    MelangeRegistry.ModelTypeDescriptor xSFSMMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"ur1.diverse.xmontiarcwithautomaton.xdsml.XSFSMMT", "", "http://ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt/"
    );
    xSFSMMT.addSuperType("ur1.diverse.xmontiarcwithautomaton.xdsml.FSMMT");
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"ur1.diverse.xmontiarcwithautomaton.xdsml.XSFSMMT",
    	xSFSMMT
    );
    MelangeRegistry.ModelTypeDescriptor montiArcMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"ur1.diverse.xmontiarcwithautomaton.xdsml.MontiArcMT", "", "http://ur1.diverse.xmontiarcwithautomaton.xdsml.montiarcmt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"ur1.diverse.xmontiarcwithautomaton.xdsml.MontiArcMT",
    	montiArcMT
    );
    MelangeRegistry.ModelTypeDescriptor xMontiArcMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"ur1.diverse.xmontiarcwithautomaton.xdsml.XMontiArcMT", "", "http://ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcmt/"
    );
    xMontiArcMT.addSuperType("ur1.diverse.xmontiarcwithautomaton.xdsml.MontiArcMT");
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"ur1.diverse.xmontiarcwithautomaton.xdsml.XMontiArcMT",
    	xMontiArcMT
    );
    MelangeRegistry.ModelTypeDescriptor xMontiArcWithAutomatonMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"ur1.diverse.xmontiarcwithautomaton.xdsml.XMontiArcWithAutomatonMT", "", "http://ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt/"
    );
    xMontiArcWithAutomatonMT.addSuperType("ur1.diverse.xmontiarcwithautomaton.xdsml.MontiArcMT");
    xMontiArcWithAutomatonMT.addSuperType("ur1.diverse.xmontiarcwithautomaton.xdsml.XMontiArcMT");
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"ur1.diverse.xmontiarcwithautomaton.xdsml.XMontiArcWithAutomatonMT",
    	xMontiArcWithAutomatonMT
    );
  }
}
