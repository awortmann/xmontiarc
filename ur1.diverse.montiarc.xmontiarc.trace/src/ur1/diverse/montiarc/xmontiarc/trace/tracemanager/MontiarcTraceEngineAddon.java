package ur1.diverse.montiarc.xmontiarc.trace.tracemanager;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.BatchModelChangeListener;

import fr.inria.diverse.trace.gemoc.api.IStepFactory;
import fr.inria.diverse.trace.gemoc.api.ITraceConstructor;
import fr.inria.diverse.trace.gemoc.api.ITraceExplorer;
import fr.inria.diverse.trace.gemoc.api.ITraceExtractor;
import fr.inria.diverse.trace.gemoc.api.ITraceNotifier;
import fr.inria.diverse.trace.gemoc.traceaddon.AbstractTraceAddon;

public class MontiarcTraceEngineAddon extends AbstractTraceAddon {

	private MontiarcTraceStepFactory factory = null;

	@Override
	public ITraceConstructor constructTraceConstructor(Resource modelResource, Resource traceResource,
			Map<EObject, EObject> exeToTraced) {
		return new MontiarcTraceConstructor(modelResource, traceResource, exeToTraced);
	}

	@Override
	public ITraceExplorer constructTraceExplorer(Resource traceResource) {
		MontiarcTraceExplorer explorer = new MontiarcTraceExplorer();
		EObject root = traceResource.getContents().get(0);
		if (root instanceof montiarcTrace.SpecificTrace) {
			explorer.loadTrace((montiarcTrace.SpecificTrace) root);
			return explorer;
		}
		return null;
	}

	@Override
	public ITraceExplorer constructTraceExplorer(Resource modelResource, Resource traceResource,
			Map<EObject, EObject> tracedToExe) {
		MontiarcTraceExplorer explorer = new MontiarcTraceExplorer(tracedToExe);
		EObject root = traceResource.getContents().get(0);
		if (root instanceof montiarcTrace.SpecificTrace) {
			explorer.loadTrace(modelResource, (montiarcTrace.SpecificTrace) root);
			return explorer;
		}
		return null;
	}

	@Override
	public ITraceExtractor constructTraceExtractor(Resource traceResource) {
		MontiarcTraceExtractor extractor = new MontiarcTraceExtractor();
		EObject root = traceResource.getContents().get(0);
		if (root instanceof montiarcTrace.SpecificTrace) {
			extractor.loadTrace((montiarcTrace.SpecificTrace) root);
			return extractor;
		}
		return null;
	}

	@Override
	public ITraceNotifier constructTraceNotifier(BatchModelChangeListener traceListener) {
		return new MontiarcTraceNotifier(traceListener);
	}

	@Override
	public IStepFactory getFactory() {
		if (factory == null)
			factory = new MontiarcTraceStepFactory();
		return factory;
	}

	@Override
	public boolean isAddonForTrace(EObject root) {
		return root instanceof montiarcTrace.SpecificTrace;
	}

}