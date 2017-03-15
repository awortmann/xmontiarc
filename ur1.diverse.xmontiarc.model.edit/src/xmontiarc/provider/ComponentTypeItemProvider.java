/**
 */
package xmontiarc.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import xmontiarc.ComponentType;
import xmontiarc.XmontiarcFactory;
import xmontiarc.XmontiarcPackage;

/**
 * This is the item provider adapter for a {@link xmontiarc.ComponentType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentTypeItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentTypeItemProvider(AdapterFactory adapterFactory) {
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
			addBehaviorPropertyDescriptor(object);
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
				 getString("_UI_ComponentType_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentType_name_feature", "_UI_ComponentType_type"),
				 XmontiarcPackage.Literals.COMPONENT_TYPE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Behavior feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBehaviorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentType_behavior_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentType_behavior_feature", "_UI_ComponentType_type"),
				 XmontiarcPackage.Literals.COMPONENT_TYPE__BEHAVIOR,
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
			childrenFeatures.add(XmontiarcPackage.Literals.COMPONENT_TYPE__CONNECTORS);
			childrenFeatures.add(XmontiarcPackage.Literals.COMPONENT_TYPE__SUBCOMPONENTS);
			childrenFeatures.add(XmontiarcPackage.Literals.COMPONENT_TYPE__INCOMING_PORTS);
			childrenFeatures.add(XmontiarcPackage.Literals.COMPONENT_TYPE__OUTGOING_PORTS);
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
	 * This returns ComponentType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComponentType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		return ((ComponentType)object).toString();
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

		switch (notification.getFeatureID(ComponentType.class)) {
			case XmontiarcPackage.COMPONENT_TYPE__NAME:
			case XmontiarcPackage.COMPONENT_TYPE__BEHAVIOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case XmontiarcPackage.COMPONENT_TYPE__CONNECTORS:
			case XmontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS:
			case XmontiarcPackage.COMPONENT_TYPE__INCOMING_PORTS:
			case XmontiarcPackage.COMPONENT_TYPE__OUTGOING_PORTS:
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
				(XmontiarcPackage.Literals.COMPONENT_TYPE__CONNECTORS,
				 XmontiarcFactory.eINSTANCE.createIntermediateConnector()));

		newChildDescriptors.add
			(createChildParameter
				(XmontiarcPackage.Literals.COMPONENT_TYPE__CONNECTORS,
				 XmontiarcFactory.eINSTANCE.createIncomingConnector()));

		newChildDescriptors.add
			(createChildParameter
				(XmontiarcPackage.Literals.COMPONENT_TYPE__CONNECTORS,
				 XmontiarcFactory.eINSTANCE.createOutgoingConnector()));

		newChildDescriptors.add
			(createChildParameter
				(XmontiarcPackage.Literals.COMPONENT_TYPE__SUBCOMPONENTS,
				 XmontiarcFactory.eINSTANCE.createSubcomponent()));

		newChildDescriptors.add
			(createChildParameter
				(XmontiarcPackage.Literals.COMPONENT_TYPE__INCOMING_PORTS,
				 XmontiarcFactory.eINSTANCE.createIncomingPort()));

		newChildDescriptors.add
			(createChildParameter
				(XmontiarcPackage.Literals.COMPONENT_TYPE__OUTGOING_PORTS,
				 XmontiarcFactory.eINSTANCE.createOutgoingPort()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return XmontiarcEditPlugin.INSTANCE;
	}

}
