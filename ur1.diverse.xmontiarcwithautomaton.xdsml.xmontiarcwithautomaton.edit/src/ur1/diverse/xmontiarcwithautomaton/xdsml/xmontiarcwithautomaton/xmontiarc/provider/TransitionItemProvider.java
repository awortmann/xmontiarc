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

import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.Transition;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.XmontiarcFactory;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.XmontiarcPackage;

/**
 * This is the item provider adapter for a {@link ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.Transition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TransitionItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionItemProvider(AdapterFactory adapterFactory) {
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

			addSourcePropertyDescriptor(object);
			addTargetPropertyDescriptor(object);
			addInputPropertyDescriptor(object);
			addOutputPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transition_source_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transition_source_feature", "_UI_Transition_type"),
				 XmontiarcPackage.Literals.TRANSITION__SOURCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transition_target_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transition_target_feature", "_UI_Transition_type"),
				 XmontiarcPackage.Literals.TRANSITION__TARGET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transition_input_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transition_input_feature", "_UI_Transition_type"),
				 XmontiarcPackage.Literals.TRANSITION__INPUT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutputPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transition_output_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transition_output_feature", "_UI_Transition_type"),
				 XmontiarcPackage.Literals.TRANSITION__OUTPUT,
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
			childrenFeatures.add(XmontiarcPackage.Literals.TRANSITION__GUARD);
			childrenFeatures.add(XmontiarcPackage.Literals.TRANSITION__ACTION);
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
	 * This returns Transition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Transition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Transition)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Transition_type") :
			getString("_UI_Transition_type") + " " + label;
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

		switch (notification.getFeatureID(Transition.class)) {
			case XmontiarcPackage.TRANSITION__INPUT:
			case XmontiarcPackage.TRANSITION__OUTPUT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case XmontiarcPackage.TRANSITION__GUARD:
			case XmontiarcPackage.TRANSITION__ACTION:
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
				(XmontiarcPackage.Literals.TRANSITION__GUARD,
				 XmontiarcFactory.eINSTANCE.createBooleanGuard()));

		newChildDescriptors.add
			(createChildParameter
				(XmontiarcPackage.Literals.TRANSITION__GUARD,
				 XmontiarcFactory.eINSTANCE.createStringGuard()));

		newChildDescriptors.add
			(createChildParameter
				(XmontiarcPackage.Literals.TRANSITION__GUARD,
				 XmontiarcFactory.eINSTANCE.createEqualNumberGuard()));

		newChildDescriptors.add
			(createChildParameter
				(XmontiarcPackage.Literals.TRANSITION__GUARD,
				 XmontiarcFactory.eINSTANCE.createLessThanNumberGuard()));

		newChildDescriptors.add
			(createChildParameter
				(XmontiarcPackage.Literals.TRANSITION__GUARD,
				 XmontiarcFactory.eINSTANCE.createGreaterThanNumberGuard()));

		newChildDescriptors.add
			(createChildParameter
				(XmontiarcPackage.Literals.TRANSITION__GUARD,
				 XmontiarcFactory.eINSTANCE.createGreaterOrEqualThanNumberGuard()));

		newChildDescriptors.add
			(createChildParameter
				(XmontiarcPackage.Literals.TRANSITION__GUARD,
				 XmontiarcFactory.eINSTANCE.createLessOrEqualThanNumberGuard()));

		newChildDescriptors.add
			(createChildParameter
				(XmontiarcPackage.Literals.TRANSITION__ACTION,
				 XmontiarcFactory.eINSTANCE.createStringAction()));

		newChildDescriptors.add
			(createChildParameter
				(XmontiarcPackage.Literals.TRANSITION__ACTION,
				 XmontiarcFactory.eINSTANCE.createNumberAction()));

		newChildDescriptors.add
			(createChildParameter
				(XmontiarcPackage.Literals.TRANSITION__ACTION,
				 XmontiarcFactory.eINSTANCE.createBooleanAction()));
	}

}
