/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.mdm.repository.model.mdmproperties.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.talend.core.model.properties.FolderItem;
import org.talend.core.model.properties.Item;
import org.talend.mdm.repository.model.mdmproperties.*;
import org.talend.mdm.repository.model.mdmproperties.MDMItem;
import org.talend.mdm.repository.model.mdmproperties.MDMServerDefItem;
import org.talend.mdm.repository.model.mdmproperties.MdmpropertiesPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.talend.mdm.repository.model.mdmproperties.MdmpropertiesPackage
 * @generated
 */
public class MdmpropertiesSwitch<T> {
	/**
     * The cached model package
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static MdmpropertiesPackage modelPackage;

	/**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public MdmpropertiesSwitch() {
        if (modelPackage == null) {
            modelPackage = MdmpropertiesPackage.eINSTANCE;
        }
    }

	/**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
	public T doSwitch(EObject theEObject) {
        return doSwitch(theEObject.eClass(), theEObject);
    }

	/**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
        if (theEClass.eContainer() == modelPackage) {
            return doSwitch(theEClass.getClassifierID(), theEObject);
        }
        else {
            List<EClass> eSuperTypes = theEClass.getESuperTypes();
            return
                eSuperTypes.isEmpty() ?
                    defaultCase(theEObject) :
                    doSwitch(eSuperTypes.get(0), theEObject);
        }
    }

	/**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
	protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case MdmpropertiesPackage.MDM_ITEM: {
                MDMItem mdmItem = (MDMItem)theEObject;
                T result = caseMDMItem(mdmItem);
                if (result == null) result = caseItem(mdmItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case MdmpropertiesPackage.MDM_SERVER_DEF_ITEM: {
                MDMServerDefItem mdmServerDefItem = (MDMServerDefItem)theEObject;
                T result = caseMDMServerDefItem(mdmServerDefItem);
                if (result == null) result = caseMDMItem(mdmServerDefItem);
                if (result == null) result = caseItem(mdmServerDefItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case MdmpropertiesPackage.MDM_SERVER_OBJECT_ITEM: {
                MDMServerObjectItem mdmServerObjectItem = (MDMServerObjectItem)theEObject;
                T result = caseMDMServerObjectItem(mdmServerObjectItem);
                if (result == null) result = caseMDMItem(mdmServerObjectItem);
                if (result == null) result = caseItem(mdmServerObjectItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case MdmpropertiesPackage.WS_MENU_ITEM: {
                WSMenuItem wsMenuItem = (WSMenuItem)theEObject;
                T result = caseWSMenuItem(wsMenuItem);
                if (result == null) result = caseMDMServerObjectItem(wsMenuItem);
                if (result == null) result = caseMDMItem(wsMenuItem);
                if (result == null) result = caseItem(wsMenuItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case MdmpropertiesPackage.WS_ROLE_ITEM: {
                WSRoleItem wsRoleItem = (WSRoleItem)theEObject;
                T result = caseWSRoleItem(wsRoleItem);
                if (result == null) result = caseMDMServerObjectItem(wsRoleItem);
                if (result == null) result = caseMDMItem(wsRoleItem);
                if (result == null) result = caseItem(wsRoleItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case MdmpropertiesPackage.CONTAINER_ITEM: {
                ContainerItem containerItem = (ContainerItem)theEObject;
                T result = caseContainerItem(containerItem);
                if (result == null) result = caseMDMItem(containerItem);
                if (result == null) result = caseFolderItem(containerItem);
                if (result == null) result = caseItem(containerItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case MdmpropertiesPackage.WS_DATA_MODEL_ITEM: {
                WSDataModelItem wsDataModelItem = (WSDataModelItem)theEObject;
                T result = caseWSDataModelItem(wsDataModelItem);
                if (result == null) result = caseMDMServerObjectItem(wsDataModelItem);
                if (result == null) result = caseMDMItem(wsDataModelItem);
                if (result == null) result = caseItem(wsDataModelItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case MdmpropertiesPackage.WS_DATA_CLUSTER_ITEM: {
                WSDataClusterItem wsDataClusterItem = (WSDataClusterItem)theEObject;
                T result = caseWSDataClusterItem(wsDataClusterItem);
                if (result == null) result = caseMDMServerObjectItem(wsDataClusterItem);
                if (result == null) result = caseMDMItem(wsDataClusterItem);
                if (result == null) result = caseItem(wsDataClusterItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case MdmpropertiesPackage.WS_STORED_PROCEDURE_ITEM: {
                WSStoredProcedureItem wsStoredProcedureItem = (WSStoredProcedureItem)theEObject;
                T result = caseWSStoredProcedureItem(wsStoredProcedureItem);
                if (result == null) result = caseMDMServerObjectItem(wsStoredProcedureItem);
                if (result == null) result = caseMDMItem(wsStoredProcedureItem);
                if (result == null) result = caseItem(wsStoredProcedureItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case MdmpropertiesPackage.WS_UNIVERSE_ITEM: {
                WSUniverseItem wsUniverseItem = (WSUniverseItem)theEObject;
                T result = caseWSUniverseItem(wsUniverseItem);
                if (result == null) result = caseMDMServerObjectItem(wsUniverseItem);
                if (result == null) result = caseMDMItem(wsUniverseItem);
                if (result == null) result = caseItem(wsUniverseItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case MdmpropertiesPackage.WS_SYNCHRONIZATION_PLAN_ITEM: {
                WSSynchronizationPlanItem wsSynchronizationPlanItem = (WSSynchronizationPlanItem)theEObject;
                T result = caseWSSynchronizationPlanItem(wsSynchronizationPlanItem);
                if (result == null) result = caseMDMServerObjectItem(wsSynchronizationPlanItem);
                if (result == null) result = caseMDMItem(wsSynchronizationPlanItem);
                if (result == null) result = caseItem(wsSynchronizationPlanItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case MdmpropertiesPackage.WS_VIEW_ITEM: {
                WSViewItem wsViewItem = (WSViewItem)theEObject;
                T result = caseWSViewItem(wsViewItem);
                if (result == null) result = caseMDMServerObjectItem(wsViewItem);
                if (result == null) result = caseMDMItem(wsViewItem);
                if (result == null) result = caseItem(wsViewItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case MdmpropertiesPackage.WS_WORKFLOW_DEPLOY_ITEM: {
                WSWorkflowDeployItem wsWorkflowDeployItem = (WSWorkflowDeployItem)theEObject;
                T result = caseWSWorkflowDeployItem(wsWorkflowDeployItem);
                if (result == null) result = caseMDMServerObjectItem(wsWorkflowDeployItem);
                if (result == null) result = caseMDMItem(wsWorkflowDeployItem);
                if (result == null) result = caseItem(wsWorkflowDeployItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>MDM Item</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>MDM Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseMDMItem(MDMItem object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>MDM Server Def Item</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>MDM Server Def Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseMDMServerDefItem(MDMServerDefItem object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>MDM Server Object Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>MDM Server Object Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMDMServerObjectItem(MDMServerObjectItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>WS Menu Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>WS Menu Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWSMenuItem(WSMenuItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>WS Role Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>WS Role Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWSRoleItem(WSRoleItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Container Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Container Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseContainerItem(ContainerItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>WS Data Model Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>WS Data Model Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWSDataModelItem(WSDataModelItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>WS Data Cluster Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>WS Data Cluster Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWSDataClusterItem(WSDataClusterItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>WS Stored Procedure Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>WS Stored Procedure Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWSStoredProcedureItem(WSStoredProcedureItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>WS Universe Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>WS Universe Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWSUniverseItem(WSUniverseItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>WS Synchronization Plan Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>WS Synchronization Plan Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWSSynchronizationPlanItem(WSSynchronizationPlanItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>WS View Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>WS View Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWSViewItem(WSViewItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>WS Workflow Deploy Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>WS Workflow Deploy Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWSWorkflowDeployItem(WSWorkflowDeployItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseItem(Item object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Folder Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Folder Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFolderItem(FolderItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
	public T defaultCase(EObject object) {
        return null;
    }

} //MdmpropertiesSwitch