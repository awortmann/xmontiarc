/**
 */
package montiarc.provider;

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

import montiarc.ComponentInstance;
import montiarc.ComponentType;
import montiarc.MontiarcPackage;
import montiarc.PortInstance;
import montiarc.PortType;

/**
 * This is the item provider adapter for a {@link montiarc.PortInstance} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class PortInstanceItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PortInstanceItemProvider(AdapterFactory adapterFactory) {
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

			addTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PortInstance_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PortInstance_type_feature", "_UI_PortInstance_type"),
				 MontiarcPackage.Literals.PORT_INSTANCE__TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null){
		        @Override
		        public Collection<?> getChoiceOfValues(Object object)
		        {
		        	List<Object> choiceOfValues = new ArrayList<Object>(super.getChoiceOfValues(object));
		        	List<Object> filteredValues = new ArrayList<Object>();
		        	
		        	PortInstance self = (PortInstance)object;
		        	ComponentInstance parentInstance = self.getParent();
		        	
		        	if (parentInstance != null && parentInstance.getType() != null) {
		        		ComponentType parentType = parentInstance.getType();
			            for (Object value : choiceOfValues) {
			            	if (value !=null) {
			            		PortType pt = (PortType) value;
			            		if (pt.getParent().equals(parentType)) {
			            			filteredValues.add(pt);
			            		}
			            	}
			            }
		        	}
		            return filteredValues;
		        }
		      });
	}

	/**
	 * This returns Port.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/port"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
//		PortType pt = ((PortInstance) object).getType();
//		String direction = null;
//		String typeName = null;
//		String label = null;
//		if (pt != null && pt.getType() != null && pt.getType().getName() != null) {
//
//			if (pt.isIsIncoming()) {
//				direction = "in";
//			} else {
//				direction = "out";
//			}
//
//			if (pt.getType() != null) {
//				typeName = pt.getType().getName();
//			}
//			label = direction + " " + typeName + " " + pt.getName();
//		}
//		return label == null || label.length() == 0 ? getString("_UI_PortInstance_type")
//				: label;
		return ((PortInstance)object).toString();

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
		return MontiarcEditPlugin.INSTANCE;
	}

}
