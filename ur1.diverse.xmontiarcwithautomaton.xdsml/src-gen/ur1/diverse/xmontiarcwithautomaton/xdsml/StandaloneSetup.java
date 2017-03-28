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
    MelangeRegistry.LanguageDescriptor xMontiArcWithAutomaton = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"ur1.diverse.xmontiarcwithautomaton.xdsml.XMontiArcWithAutomaton", "external language FSM { syntax 'platform:/resource/org.gemoc.sample.legacyfsm.fsm.model/model/fsm.ecore' //withGenmodel 'platform:/resource/org.gemoc.sample.legacyfsm.fsm.model/model/fsm.genmodel' }  language XSFSM inherits FSM { with  org.gemoc.sample.legacyfsm.fsm.k3dsa. }  external language MontiArc { syntax 'platform:/resource/ur1.diverse.xmontiarc.model/ur1.diverse.xmontiarc.model/xmontiarc.ecore' withGenmodel 'platform:/resource/ur1.diverse.xmontiarc.model/ur1.diverse.xmontiarc.model/xmontiarc.genmodel' }  language XMontiArc inherits ur1.diverse.xmontiMontiArc { with ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.PortAspect with ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.SubcomponentAspect with ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ComponentTypeAspect with ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.ConnectorAspect }", "http://ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton/xmontiarc/", "ur1.diverse.xmontiarcwithautomaton.xdsml.XMontiArcWithAutomatonMT"
    );
    xMontiArcWithAutomaton.addAdapter("ur1.diverse.xmontiarc.xdsml.MontiArcMT", ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.XMontiArcWithAutomatonAdapter.class);
    xMontiArcWithAutomaton.addAdapter("ur1.diverse.xmontiarc.xdsml.XMontiArcMT", ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.xmontiarcmt.XMontiArcWithAutomatonAdapter.class);
    xMontiArcWithAutomaton.addAdapter("ur1.diverse.xmontiarcwithautomaton.xdsml.XMontiArcWithAutomatonMT", ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.xmontiarcwithautomatonmt.XMontiArcWithAutomatonAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"ur1.diverse.xmontiarcwithautomaton.xdsml.XMontiArcWithAutomaton",
    	xMontiArcWithAutomaton
    );
    MelangeRegistry.ModelTypeDescriptor xMontiArcWithAutomatonMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"ur1.diverse.xmontiarcwithautomaton.xdsml.XMontiArcWithAutomatonMT", "", "http://ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt/"
    );
    xMontiArcWithAutomatonMT.addSuperType("ur1.diverse.xmontiarc.xdsml.MontiArcMT");
    xMontiArcWithAutomatonMT.addSuperType("ur1.diverse.xmontiarc.xdsml.XMontiArcMT");
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"ur1.diverse.xmontiarcwithautomaton.xdsml.XMontiArcWithAutomatonMT",
    	xMontiArcWithAutomatonMT
    );
  }
}
