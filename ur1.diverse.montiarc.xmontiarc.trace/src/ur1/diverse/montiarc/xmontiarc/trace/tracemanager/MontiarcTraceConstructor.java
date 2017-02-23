package ur1.diverse.montiarc.xmontiarc.trace.tracemanager;

import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import fr.inria.diverse.trace.commons.model.trace.LaunchConfiguration;
import fr.inria.diverse.trace.commons.model.trace.MSEModel;
import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.gemoc.api.ITraceConstructor;

public class MontiarcTraceConstructor implements ITraceConstructor {
	private montiarcTrace.SpecificTrace traceRoot;
	private MSEModel mseModel;
	private Resource executedModel;
	private final Map<EObject, EObject> exeToTraced;

	private montiarcTrace.States.State lastState;

	private Resource traceResource;
	private final Deque<montiarcTrace.Steps.SpecificStep> context = new LinkedList<montiarcTrace.Steps.SpecificStep>();

	public MontiarcTraceConstructor(Resource exeModel, Resource traceResource, Map<EObject, EObject> exeToTraced) {
		this.traceResource = traceResource;
		this.executedModel = exeModel;
		this.exeToTraced = exeToTraced;
	}

	private void addInitialState() {
		if (lastState == null) {
			// Creation of the initial state
			Set<Resource> allResources = getAllExecutedModelResources();
			lastState = montiarcTrace.States.StatesFactory.eINSTANCE.createState();
			for (Resource r : allResources) {
				for (TreeIterator<EObject> i = r.getAllContents(); i.hasNext();) {
					EObject o = i.next();

					if (o instanceof ur1.diverse.montiarc.xdsml.xmontiarc.montiarc.Port) {
						ur1.diverse.montiarc.xdsml.xmontiarc.montiarc.Port o_cast = (ur1.diverse.montiarc.xdsml.xmontiarc.montiarc.Port) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof ur1.diverse.montiarc.xdsml.xmontiarc.montiarc.PortValue) {
						ur1.diverse.montiarc.xdsml.xmontiarc.montiarc.PortValue o_cast = (ur1.diverse.montiarc.xdsml.xmontiarc.montiarc.PortValue) o;
						addNewObjectToState(o_cast, lastState);
					}
				}
			}
			this.traceRoot.getStatesTrace().add(lastState);
		}
	}

	private boolean addNewObjectToState(ur1.diverse.montiarc.xdsml.xmontiarc.montiarc.Port o_cast,
			montiarcTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			montiarcTrace.States.montiarc.TracedPort tracedObject = montiarcTrace.States.montiarc.MontiarcFactory.eINSTANCE
					.createTracedPort();
			tracedObject.setOriginalObject((ur1.diverse.montiarc.xdsml.xmontiarc.montiarc.Port) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getMontiarc_tracedPorts().add(tracedObject);

			// Creation of the first value of the field portValue
			montiarcTrace.States.Port_portValue_Value firstValue_portValue = montiarcTrace.States.StatesFactory.eINSTANCE
					.createPort_portValue_Value();

			if (o_cast.getPortValue() != null) {
				addNewObjectToState((ur1.diverse.montiarc.xdsml.xmontiarc.montiarc.PortValue) o_cast.getPortValue(),
						newState);
				firstValue_portValue.setPortValue(
						(montiarcTrace.States.montiarc.TracedPortValue) ((montiarcTrace.States.montiarc.TracedPortValue) exeToTraced
								.get(o_cast.getPortValue())));
			} else {
				firstValue_portValue.setPortValue((montiarcTrace.States.montiarc.TracedPortValue) null);
			}

			tracedObject.getPortValueSequence().add(firstValue_portValue);
			newState.getPort_portValue_Values().add(firstValue_portValue);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(ur1.diverse.montiarc.xdsml.xmontiarc.montiarc.PortValue o_cast,
			montiarcTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			montiarcTrace.States.montiarc.TracedPortValue tracedObject = montiarcTrace.States.montiarc.MontiarcFactory.eINSTANCE
					.createTracedPortValue();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getMontiarc_tracedPortValues().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean copiedState = false;

	private montiarcTrace.States.State copyState(montiarcTrace.States.State oldState) {
		montiarcTrace.States.State newState = montiarcTrace.States.StatesFactory.eINSTANCE.createState();
		newState.getPort_portValue_Values().addAll(oldState.getPort_portValue_Values());
		copiedState = true;
		return newState;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addState(List<org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange> changes) {
		if (lastState == null) {
			addInitialState();
		}
		if (!changes.isEmpty()) {
			boolean stateChanged = false;
			// We start by a (shallow) copy of the last state
			// But we will have to rollback a little by replacing values that changed
			montiarcTrace.States.State newState = copyState(lastState);
			for (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange modelChange : changes) {
				EObject o = modelChange.getChangedObject();
				// Here we must look at non-collection mutable fields
				// We must rollback the last values from the copied state, and add new values as well
				// ie. mix of remove and new
				if (modelChange instanceof org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange) {
					stateChanged = true;

					org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange modelChange_cast = (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange) modelChange;
					org.eclipse.emf.ecore.EStructuralFeature p = modelChange_cast.getChangedField();

					if (o instanceof ur1.diverse.montiarc.xdsml.xmontiarc.montiarc.Port) {
						ur1.diverse.montiarc.xdsml.xmontiarc.montiarc.Port o_cast = (ur1.diverse.montiarc.xdsml.xmontiarc.montiarc.Port) o;

						if (p.getFeatureID() == ur1.diverse.montiarc.xdsml.xmontiarc.montiarc.MontiarcPackage.eINSTANCE
								.getPort_PortValue().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							montiarcTrace.States.montiarc.TracedPort traced = (montiarcTrace.States.montiarc.TracedPort) exeToTraced
									.get(o);
							montiarcTrace.States.Port_portValue_Value lastValue = traced.getPortValueSequence()
									.get(traced.getPortValueSequence().size() - 1);
							newState.getPort_portValue_Values().remove(lastValue);

							// And we create a proper new value
							montiarcTrace.States.Port_portValue_Value newValue = montiarcTrace.States.StatesFactory.eINSTANCE
									.createPort_portValue_Value();

							montiarcTrace.States.montiarc.TracedPortValue value = null;
							if (o_cast.getPortValue() != null) {
								value = ((montiarcTrace.States.montiarc.TracedPortValue) exeToTraced
										.get(o_cast.getPortValue()));
							}

							newValue.setPortValue((montiarcTrace.States.montiarc.TracedPortValue) value);

							traced.getPortValueSequence().add(newValue);
							newState.getPort_portValue_Values().add(newValue);
						}
					}
				}
			}
			if (stateChanged) {
				final montiarcTrace.Steps.SpecificStep currentStep = context.peekFirst();
				if (currentStep != null && currentStep instanceof fr.inria.diverse.trace.commons.model.trace.BigStep) {
					final montiarcTrace.States.State startingState = lastState;
					final montiarcTrace.States.State endingState = newState;
					addImplicitStep(currentStep, startingState, endingState);
				}
				lastState = newState;
				traceRoot.getStatesTrace().add(lastState);
			} else if (copiedState) {
				newState.getPort_portValue_Values().clear();
			}
			copiedState = false;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addStep(fr.inria.diverse.trace.commons.model.trace.Step step) {
		montiarcTrace.Steps.SpecificStep step_cast = null;
		if (step != null && step instanceof montiarcTrace.Steps.SpecificStep) {
			step_cast = (montiarcTrace.Steps.SpecificStep) step;
			if (mseModel == null) {
				mseModel = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE.createMSEModel();
				traceResource.getContents().add(mseModel);
			}
			mseModel.getOwnedMSEs().add(step_cast.getMseoccurrence().getMse());

			// Creating generic (or almost generic) links
			montiarcTrace.States.State state = traceRoot.getStatesTrace().get(traceRoot.getStatesTrace().size() - 1);
			step_cast.setStartingState(state);
			if (!context.isEmpty() && context.getFirst() != null) {
				((SequentialStep<montiarcTrace.Steps.SpecificStep>) context.getFirst()).getSubSteps().add(step_cast);
			} else {
				traceRoot.getRootStep().getSubSteps().add(step_cast);
			}

			// Adding step in its dedicated sequence/dimension
			if (step_cast instanceof montiarcTrace.Steps.Montiarc_ComponentType_Compute) {
				montiarcTrace.Steps.Montiarc_ComponentType_Compute montiarc_ComponentType_ComputeInstance = (montiarcTrace.Steps.Montiarc_ComponentType_Compute) step_cast;
				traceRoot.getMontiarc_ComponentType_Compute_Sequence().add(montiarc_ComponentType_ComputeInstance);
			} else if (step_cast instanceof montiarcTrace.Steps.Montiarc_ComponentType_Update) {
				montiarcTrace.Steps.Montiarc_ComponentType_Update montiarc_ComponentType_UpdateInstance = (montiarcTrace.Steps.Montiarc_ComponentType_Update) step_cast;
				traceRoot.getMontiarc_ComponentType_Update_Sequence().add(montiarc_ComponentType_UpdateInstance);
			}
		}
		context.push(step_cast);
	}

	@SuppressWarnings("unchecked")
	private void addImplicitStep(montiarcTrace.Steps.SpecificStep currentStep, montiarcTrace.States.State startingState,
			montiarcTrace.States.State endingState) {

		montiarcTrace.Steps.SpecificStep implicitStep = null;
		if (currentStep instanceof montiarcTrace.Steps.Montiarc_ComponentType_Compute) {
			implicitStep = montiarcTrace.Steps.StepsFactory.eINSTANCE
					.createMontiarc_ComponentType_Compute_ImplicitStep();
		}
		if (implicitStep != null) {
			implicitStep.setStartingState(startingState);
			implicitStep.setEndingState(endingState);
			((SequentialStep<montiarcTrace.Steps.SpecificStep>) currentStep).getSubSteps().add(implicitStep);

		}
	}

	@Override
	public void endStep(fr.inria.diverse.trace.commons.model.trace.Step step) {
		montiarcTrace.Steps.SpecificStep popped = context.pop();
		if (popped != null)
			popped.setEndingState(lastState);
	}

	@Override
	public EObject initTrace(LaunchConfiguration launchConfiguration) {
		// Create root
		traceRoot = montiarcTrace.MontiarcTraceFactory.eINSTANCE.createSpecificTrace();
		traceRoot.setLaunchconfiguration(launchConfiguration);

		// Create root sequential step
		fr.inria.diverse.trace.commons.model.trace.SequentialStep<montiarcTrace.Steps.SpecificStep> rootStep = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE
				.createSequentialStep();
		traceRoot.setRootStep(rootStep);

		// Put in the resource
		traceResource.getContents().add(traceRoot);

		return traceRoot;
	}

	@Override
	public void save() {
		try {
			traceResource.save(null);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void save(URI uri) {
		try {
			traceResource.setURI(uri);
			traceResource.save(null);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}

	private Set<Resource> getAllExecutedModelResources() {
		Set<Resource> allResources = new HashSet<>();
		allResources.add(executedModel);
		allResources.addAll(org.gemoc.commons.eclipse.emf.EMFResource.getRelatedResources(executedModel));
		allResources.removeIf(r -> r == null);
		return allResources;
	}

	@Override
	public boolean isPartialTraceConstructor() {
		return false;
	}
}
