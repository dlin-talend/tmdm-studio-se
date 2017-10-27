/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.mdm.repository.model.mdmserverobject.matchrule.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.talend.mdm.repository.model.mdmserverobject.matchrule.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MatchRuleFactoryImpl extends EFactoryImpl implements MatchRuleFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static MatchRuleFactory init() {
        try {
            MatchRuleFactory theMatchRuleFactory = (MatchRuleFactory)EPackage.Registry.INSTANCE.getEFactory(MatchRulePackage.eNS_URI);
            if (theMatchRuleFactory != null) {
                return theMatchRuleFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new MatchRuleFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MatchRuleFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case MatchRulePackage.MATCH_RULE_MAP_INFO: return createMatchRuleMapInfo();
            case MatchRulePackage.ENTITY_MAP_INFO: return createEntityMapInfo();
            case MatchRulePackage.MATCH_RULE_MAP_INFO_PAGE: return createMatchRuleMapInfoPage();
            case MatchRulePackage.KEY_XPATH_MAP: return (EObject)createKeyXPathMap();
            case MatchRulePackage.BLOCKING_KEY_DEFINITION: return createBlockingKeyDefinition();
            case MatchRulePackage.BLOCKING_KEY: return createBlockingKey();
            case MatchRulePackage.MATCH_RULE_MAP_INFO_CONTAINER: return createMatchRuleMapInfoContainer();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MatchRuleMapInfo createMatchRuleMapInfo() {
        MatchRuleMapInfoImpl matchRuleMapInfo = new MatchRuleMapInfoImpl();
        return matchRuleMapInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityMapInfo createEntityMapInfo() {
        EntityMapInfoImpl entityMapInfo = new EntityMapInfoImpl();
        return entityMapInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MatchRuleMapInfoPage createMatchRuleMapInfoPage() {
        MatchRuleMapInfoPageImpl matchRuleMapInfoPage = new MatchRuleMapInfoPageImpl();
        return matchRuleMapInfoPage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Map.Entry<String, String> createKeyXPathMap() {
        KeyXPathMapImpl keyXPathMap = new KeyXPathMapImpl();
        return keyXPathMap;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BlockingKeyDefinition createBlockingKeyDefinition() {
        BlockingKeyDefinitionImpl blockingKeyDefinition = new BlockingKeyDefinitionImpl();
        return blockingKeyDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BlockingKey createBlockingKey() {
        BlockingKeyImpl blockingKey = new BlockingKeyImpl();
        return blockingKey;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MatchRuleMapInfoContainer createMatchRuleMapInfoContainer() {
        MatchRuleMapInfoContainerImpl matchRuleMapInfoContainer = new MatchRuleMapInfoContainerImpl();
        return matchRuleMapInfoContainer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MatchRulePackage getMatchRulePackage() {
        return (MatchRulePackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static MatchRulePackage getPackage() {
        return MatchRulePackage.eINSTANCE;
    }

} //MatchRuleFactoryImpl
