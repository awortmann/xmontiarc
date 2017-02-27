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

import montiarc.ComponentInstance;
import montiarc.ComponentType;
import montiarc.ConnectorType;
import montiarc.IncomingConnectorType;
import montiarc.MontiarcPackage;
import montiarc.PortInstance;
import montiarc.PortType;

/**
 * This is the item provider adapter for a {@link montiarc.IncomingConnectorType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IncomingConnectorTypeItemProvider extends ConnectorTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncomingConnectorTypeItemProvider(AdapterFactory adapterFactory) {
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

			addTargetPortInstancePropertyDescriptor(object);
			addSourcePortTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Target Port Instance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetPortInstancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IncomingConnectorType_targetPortInstance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IncomingConnectorType_targetPortInstance_feature", "_UI_IncomingConnectorType_type"),
				 MontiarcPackage.Literals.INCOMING_CONNECTOR_TYPE__TARGET_PORT_INSTANCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addTargetPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IncomingConnectorType_targetPort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IncomingConnectorType_targetPort_feature", "_UI_IncomingConnectorType_type"),
				 MontiarcPackage.Literals.INCOMING_CONNECTOR_TYPE__TARGET_PORT_INSTANCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null){
		        @Override
		        public Collection<?> getChoiceOfValues(Object object)
		        {
		        	List<Object> incomingPortInstances = new ArrayList<Object>();
		        	ConnectorType self = (ConnectorType)object;
		        	self.getParent();
		        	ComponentType parentComponentType = self.getParent();
		        	
		        	if (parentComponentType != null) {
		        		for (ComponentInstance siblingInstance : parentComponentType.getComponentInstances()) {
		        			for (PortInstance portInstance : siblingInstance.getPortInstances()) {
		        				boolean isIncoming = portInstance.getType().isIsIncoming();
		        				if (portInstance.getType() != null && isIncoming) {
		        					incomingPortInstances.add(portInstance);
		        				}
		        			}
		        		}
		        	}
		            return incomingPortInstances;
		        }
		});
	}

	/**
	 * This adds a property descriptor for the Source Port Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addSourcePortTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IncomingConnectorType_sourcePortType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IncomingConnectorType_sourcePortType_feature", "_UI_IncomingConnectorType_type"),
				 MontiarcPackage.Literals.INCOMING_CONNECTOR_TYPE__SOURCE_PORT_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null){
		        @Override
		        public Collection<?> getChoiceOfValues(Object object)
		        {
		        	List<Object> incomingPortTypes = new ArrayList<Object>();
		        	ConnectorType self = (ConnectorType)object;
		        	ComponentType parentComponentType = self.getParent();
		        	
		        	if (parentComponentType != null) {
		        		for (PortType pt : parentComponentType.getPortTypes()) {
		        			if (pt.isIsIncoming()) {
		        				incomingPortTypes.add(pt);
		        			}
		        		}
		        	}
		            return incomingPortTypes;
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
		return ((IncomingConnectorType)object).toString();
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
