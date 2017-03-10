/**
 */
package montiarc.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import montiarc.ConnectorType;
import montiarc.IntermediateConnectorType;
import montiarc.MontiarcPackage;
import montiarc.PortInstance;
import montiarc.impl.ComponentTypeImpl;

/**
 * This is the item provider adapter for a {@link montiarc.IntermediateConnectorType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IntermediateConnectorTypeItemProvider extends ConnectorTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateConnectorTypeItemProvider(AdapterFactory adapterFactory) {
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

			addSourcePortInstancePropertyDescriptor(object);
			addTargetPortInstancePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}
	
	/**
	 * This adds a property descriptor for the Source Port Instance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addSourcePortInstancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IntermediateConnectorType_sourcePortInstance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IntermediateConnectorType_sourcePortInstance_feature", "_UI_IntermediateConnectorType_type"),
				 MontiarcPackage.Literals.INTERMEDIATE_CONNECTOR_TYPE__SOURCE_PORT_INSTANCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null){
		        @Override
		        public Collection<?> getChoiceOfValues(Object object)
		        {
		        	ConnectorType self = (ConnectorType)object;
		        	ComponentTypeImpl parentComponentType = (ComponentTypeImpl) self.getParent();
		        	List<PortInstance> validSourcePorts = new ArrayList<PortInstance>();
		        	validSourcePorts.addAll(parentComponentType.getOutgoingPortsOfSubcomponents());
		            return validSourcePorts;
		        }
		});
	}

	/**
	 * This adds a property descriptor for the Target Port Instance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addTargetPortInstancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IntermediateConnectorType_targetPortInstance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IntermediateConnectorType_targetPortInstance_feature", "_UI_IntermediateConnectorType_type"),
				 MontiarcPackage.Literals.INTERMEDIATE_CONNECTOR_TYPE__TARGET_PORT_INSTANCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null){
		        @Override
		        public Collection<?> getChoiceOfValues(Object object)
		        {
		        	ConnectorType self = (ConnectorType)object;
		        	ComponentTypeImpl parentComponentType = (ComponentTypeImpl) self.getParent();
		        	List<PortInstance> validSourcePorts = new ArrayList<PortInstance>();
		        	validSourcePorts.addAll(parentComponentType.getIncomingPortsOfSubcomponents());
		            return validSourcePorts;
		        }
		});
	}

	/**
	 * This returns Connector.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/connector"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		return ((IntermediateConnectorType)object).toString();
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
	}

}
