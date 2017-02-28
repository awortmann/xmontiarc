/**
 */
package xmontiarc.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;

import xmontiarc.Connector;
import xmontiarc.Port;
import xmontiarc.XmontiarcPackage;
import xmontiarc.impl.ComponentTypeImpl;

/**
 * This is the item provider adapter for a {@link xmontiarc.Connector} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class ConnectorItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ConnectorItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addSourcePropertyDescriptor(object);
			addTargetPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Source feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connector_source_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connector_source_feature", "_UI_Connector_type"),
				 XmontiarcPackage.Literals.CONNECTOR__SOURCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null){
		        @Override
		        public Collection<?> getChoiceOfValues(Object object)
		        {
		        	Connector con = (Connector)object;
		        	ComponentTypeImpl parentComponentType = (ComponentTypeImpl) con.getParent();
		        	List<Port> validSourcePorts = new ArrayList<Port>();
		        	validSourcePorts.addAll(parentComponentType.getIncomingPorts());
		        	validSourcePorts.addAll(parentComponentType.getOutgoingPortsOfSubcomponents());
		            return validSourcePorts;
		        }
		});
	}

	/**
	 * This adds a property descriptor for the Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connector_target_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connector_target_feature", "_UI_Connector_type"),
				 XmontiarcPackage.Literals.CONNECTOR__TARGET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null){
		        @Override
		        public Collection<?> getChoiceOfValues(Object object)
		        {
		        	Connector con = (Connector)object;
		        	ComponentTypeImpl parentComponentType = (ComponentTypeImpl) con.getParent();
		        	List<Port> validTargetPorts = new ArrayList<Port>();
		        	validTargetPorts.addAll(parentComponentType.getOutgoingPorts());
		        	validTargetPorts.addAll(parentComponentType.getIncomingPortsOfSubcomponents());
		            return validTargetPorts;
		        }
		});
	}

	/**
	 * This returns Connector.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Connector"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		return ((Connector) object).toString();
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return XmontiarcEditPlugin.INSTANCE;
	}

}
