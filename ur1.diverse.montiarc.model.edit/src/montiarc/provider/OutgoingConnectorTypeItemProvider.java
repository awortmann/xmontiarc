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
import montiarc.MontiarcPackage;
import montiarc.OutgoingConnectorType;
import montiarc.PortInstance;
import montiarc.PortType;

/**
 * This is the item provider adapter for a {@link montiarc.OutgoingConnectorType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OutgoingConnectorTypeItemProvider extends ConnectorTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutgoingConnectorTypeItemProvider(AdapterFactory adapterFactory) {
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

			addSourcePortPropertyDescriptor(object);
			addTargetPortTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Source Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOTØ‚
	 */
	protected void addSourcePortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OutgoingConnectorType_sourcePort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OutgoingConnectorType_sourcePort_feature", "_UI_OutgoingConnectorType_type"),
				 MontiarcPackage.Literals.OUTGOING_CONNECTOR_TYPE__SOURCE_PORT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null){
		        @Override
		        public Collection<?> getChoiceOfValues(Object object)
		        {
		        	List<Object> outgoingPortInstances = new ArrayList<Object>();
		        	ConnectorType self = (ConnectorType)object;
		        	self.getParent();
		        	ComponentType parentComponentType = self.getParent();
		        	
		        	if (parentComponentType != null) {
		        		for (ComponentInstance siblingInstance : parentComponentType.getSubcomponents()) {
		        			for (PortInstance portInstance : siblingInstance.getPorts()) {
		        				boolean isOutgoing = !portInstance.getType().isIsIncoming();
		        				if (portInstance.getType() != null && isOutgoing) {
		        					outgoingPortInstances.add(portInstance);
		        				}
		        			}
		        		}
		        	}
		            return outgoingPortInstances;
		        }
		});
	}

	/**
	 * This adds a property descriptor for the Target Port Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addTargetPortTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OutgoingConnectorType_targetPortType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OutgoingConnectorType_targetPortType_feature", "_UI_OutgoingConnectorType_type"),
				 MontiarcPackage.Literals.OUTGOING_CONNECTOR_TYPE__TARGET_PORT_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null){
		        @Override
		        public Collection<?> getChoiceOfValues(Object object)
		        {
		        	List<Object> outgoingPortTypes = new ArrayList<Object>();
		        	ConnectorType self = (ConnectorType)object;
		        	ComponentType parentComponentType = self.getParent();
		        	
		        	if (parentComponentType != null) {
		        		for (PortType pt : parentComponentType.getPorts()) {
		        			if (!pt.isIsIncoming()) {
		        				outgoingPortTypes.add(pt);
		        			}
		        		}
		        	}
		            return outgoingPortTypes;
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
		return ((OutgoingConnectorType)object).toString();
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
