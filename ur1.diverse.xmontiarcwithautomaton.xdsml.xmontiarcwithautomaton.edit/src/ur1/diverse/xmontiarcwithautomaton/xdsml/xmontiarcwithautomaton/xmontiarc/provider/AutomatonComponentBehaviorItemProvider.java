/**
 */
package ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.AutomatonComponentBehavior;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.XmontiarcFactory;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.XmontiarcPackage;

/**
 * This is the item provider adapter for a {@link ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.AutomatonComponentBehavior} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AutomatonComponentBehaviorItemProvider extends ComponentBehaviorItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutomatonComponentBehaviorItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addInitialStatePropertyDescriptor(object);
			addCurrentStatePropertyDescriptor(object);
			addUnprocessedStringPropertyDescriptor(object);
			addConsummedStringPropertyDescriptor(object);
			addProducedStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NamedElement_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NamedElement_name_feature", "_UI_NamedElement_type"),
				 XmontiarcPackage.Literals.NAMED_ELEMENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Initial State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitialStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AutomatonComponentBehavior_initialState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AutomatonComponentBehavior_initialState_feature", "_UI_AutomatonComponentBehavior_type"),
				 XmontiarcPackage.Literals.AUTOMATON_COMPONENT_BEHAVIOR__INITIAL_STATE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrentStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AutomatonComponentBehavior_currentState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AutomatonComponentBehavior_currentState_feature", "_UI_AutomatonComponentBehavior_type"),
				 XmontiarcPackage.Literals.AUTOMATON_COMPONENT_BEHAVIOR__CURRENT_STATE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Unprocessed String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnprocessedStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AutomatonComponentBehavior_unprocessedString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AutomatonComponentBehavior_unprocessedString_feature", "_UI_AutomatonComponentBehavior_type"),
				 XmontiarcPackage.Literals.AUTOMATON_COMPONENT_BEHAVIOR__UNPROCESSED_STRING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Consummed String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConsummedStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AutomatonComponentBehavior_consummedString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AutomatonComponentBehavior_consummedString_feature", "_UI_AutomatonComponentBehavior_type"),
				 XmontiarcPackage.Literals.AUTOMATON_COMPONENT_BEHAVIOR__CONSUMMED_STRING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Produced String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProducedStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AutomatonComponentBehavior_producedString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AutomatonComponentBehavior_producedString_feature", "_UI_AutomatonComponentBehavior_type"),
				 XmontiarcPackage.Literals.AUTOMATON_COMPONENT_BEHAVIOR__PRODUCED_STRING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(XmontiarcPackage.Literals.AUTOMATON_COMPONENT_BEHAVIOR__OWNED_STATES);
			childrenFeatures.add(XmontiarcPackage.Literals.AUTOMATON_COMPONENT_BEHAVIOR__OWNED_TRANSITIONS);
			childrenFeatures.add(XmontiarcPackage.Literals.AUTOMATON_COMPONENT_BEHAVIOR__VARIABLES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns AutomatonComponentBehavior.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AutomatonComponentBehavior"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AutomatonComponentBehavior)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AutomatonComponentBehavior_type") :
			getString("_UI_AutomatonComponentBehavior_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(AutomatonComponentBehavior.class)) {
			case XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__NAME:
			case XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__UNPROCESSED_STRING:
			case XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__CONSUMMED_STRING:
			case XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__PRODUCED_STRING:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__OWNED_STATES:
			case XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__OWNED_TRANSITIONS:
			case XmontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR__VARIABLES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(XmontiarcPackage.Literals.AUTOMATON_COMPONENT_BEHAVIOR__OWNED_STATES,
				 XmontiarcFactory.eINSTANCE.createState()));

		newChildDescriptors.add
			(createChildParameter
				(XmontiarcPackage.Literals.AUTOMATON_COMPONENT_BEHAVIOR__OWNED_TRANSITIONS,
				 XmontiarcFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add
			(createChildParameter
				(XmontiarcPackage.Literals.AUTOMATON_COMPONENT_BEHAVIOR__VARIABLES,
				 XmontiarcFactory.eINSTANCE.createStringVariable()));

		newChildDescriptors.add
			(createChildParameter
				(XmontiarcPackage.Literals.AUTOMATON_COMPONENT_BEHAVIOR__VARIABLES,
				 XmontiarcFactory.eINSTANCE.createNumberVariable()));

		newChildDescriptors.add
			(createChildParameter
				(XmontiarcPackage.Literals.AUTOMATON_COMPONENT_BEHAVIOR__VARIABLES,
				 XmontiarcFactory.eINSTANCE.createBooleanVariable()));
	}

}
