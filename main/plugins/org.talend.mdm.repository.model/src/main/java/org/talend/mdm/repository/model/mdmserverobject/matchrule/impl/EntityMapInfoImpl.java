/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.mdm.repository.model.mdmserverobject.matchrule.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.talend.mdm.repository.model.mdmserverobject.matchrule.BlockingKeyDefinition;
import org.talend.mdm.repository.model.mdmserverobject.matchrule.EntityMapInfo;
import org.talend.mdm.repository.model.mdmserverobject.matchrule.MatchRuleMapInfo;
import org.talend.mdm.repository.model.mdmserverobject.matchrule.MatchRuleMapInfoPage;
import org.talend.mdm.repository.model.mdmserverobject.matchrule.MatchRulePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Map Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.mdm.repository.model.mdmserverobject.matchrule.impl.EntityMapInfoImpl#getEntityName <em>Entity Name</em>}</li>
 *   <li>{@link org.talend.mdm.repository.model.mdmserverobject.matchrule.impl.EntityMapInfoImpl#getSurvivorshipKeyMap <em>Survivorship Key Map</em>}</li>
 *   <li>{@link org.talend.mdm.repository.model.mdmserverobject.matchrule.impl.EntityMapInfoImpl#getBlockingKeyDefinition <em>Blocking Key Definition</em>}</li>
 *   <li>{@link org.talend.mdm.repository.model.mdmserverobject.matchrule.impl.EntityMapInfoImpl#getMatchRuleDefName <em>Match Rule Def Name</em>}</li>
 *   <li>{@link org.talend.mdm.repository.model.mdmserverobject.matchrule.impl.EntityMapInfoImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.talend.mdm.repository.model.mdmserverobject.matchrule.impl.EntityMapInfoImpl#getMatchRuleMapInfoPages <em>Match Rule Map Info Pages</em>}</li>
 *   <li>{@link org.talend.mdm.repository.model.mdmserverobject.matchrule.impl.EntityMapInfoImpl#getParticularDefaultSurvivorshipColumnMap <em>Particular Default Survivorship Column Map</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EntityMapInfoImpl extends EObjectImpl implements EntityMapInfo {
    /**
     * The default value of the '{@link #getEntityName() <em>Entity Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntityName()
     * @generated
     * @ordered
     */
    protected static final String ENTITY_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEntityName() <em>Entity Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntityName()
     * @generated
     * @ordered
     */
    protected String entityName = ENTITY_NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getSurvivorshipKeyMap() <em>Survivorship Key Map</em>}' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSurvivorshipKeyMap()
     * @generated
     * @ordered
     */
    protected EMap<String, String> survivorshipKeyMap;

    /**
     * The cached value of the '{@link #getBlockingKeyDefinition() <em>Blocking Key Definition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBlockingKeyDefinition()
     * @generated
     * @ordered
     */
    protected BlockingKeyDefinition blockingKeyDefinition;

    /**
     * The default value of the '{@link #getMatchRuleDefName() <em>Match Rule Def Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMatchRuleDefName()
     * @generated
     * @ordered
     */
    protected static final String MATCH_RULE_DEF_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMatchRuleDefName() <em>Match Rule Def Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMatchRuleDefName()
     * @generated
     * @ordered
     */
    protected String matchRuleDefName = MATCH_RULE_DEF_NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getMatchRuleMapInfoPages() <em>Match Rule Map Info Pages</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMatchRuleMapInfoPages()
     * @generated
     * @ordered
     */
    protected EList<MatchRuleMapInfoPage> matchRuleMapInfoPages;

    /**
     * The cached value of the '{@link #getParticularDefaultSurvivorshipColumnMap() <em>Particular Default Survivorship Column Map</em>}' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParticularDefaultSurvivorshipColumnMap()
     * @generated
     * @ordered
     */
    protected EMap<String, String> particularDefaultSurvivorshipColumnMap;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EntityMapInfoImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MatchRulePackage.Literals.ENTITY_MAP_INFO;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getEntityName() {
        return entityName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEntityName(String newEntityName) {
        String oldEntityName = entityName;
        entityName = newEntityName;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, MatchRulePackage.ENTITY_MAP_INFO__ENTITY_NAME, oldEntityName, entityName));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EMap<String, String> getSurvivorshipKeyMap() {
        if (survivorshipKeyMap == null) {
            survivorshipKeyMap = new EcoreEMap<String,String>(MatchRulePackage.Literals.KEY_XPATH_MAP, KeyXPathMapImpl.class, this, MatchRulePackage.ENTITY_MAP_INFO__SURVIVORSHIP_KEY_MAP);
        }
        return survivorshipKeyMap;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BlockingKeyDefinition getBlockingKeyDefinition() {
        return blockingKeyDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBlockingKeyDefinition(BlockingKeyDefinition newBlockingKeyDefinition, NotificationChain msgs) {
        BlockingKeyDefinition oldBlockingKeyDefinition = blockingKeyDefinition;
        blockingKeyDefinition = newBlockingKeyDefinition;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MatchRulePackage.ENTITY_MAP_INFO__BLOCKING_KEY_DEFINITION, oldBlockingKeyDefinition, newBlockingKeyDefinition);
            if (msgs == null) {
                msgs = notification;
            } else {
                msgs.add(notification);
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBlockingKeyDefinition(BlockingKeyDefinition newBlockingKeyDefinition) {
        if (newBlockingKeyDefinition != blockingKeyDefinition) {
            NotificationChain msgs = null;
            if (blockingKeyDefinition != null) {
                msgs = ((InternalEObject)blockingKeyDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MatchRulePackage.ENTITY_MAP_INFO__BLOCKING_KEY_DEFINITION, null, msgs);
            }
            if (newBlockingKeyDefinition != null) {
                msgs = ((InternalEObject)newBlockingKeyDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MatchRulePackage.ENTITY_MAP_INFO__BLOCKING_KEY_DEFINITION, null, msgs);
            }
            msgs = basicSetBlockingKeyDefinition(newBlockingKeyDefinition, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, MatchRulePackage.ENTITY_MAP_INFO__BLOCKING_KEY_DEFINITION, newBlockingKeyDefinition, newBlockingKeyDefinition));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getMatchRuleDefName() {
        return matchRuleDefName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMatchRuleDefName(String newMatchRuleDefName) {
        String oldMatchRuleDefName = matchRuleDefName;
        matchRuleDefName = newMatchRuleDefName;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, MatchRulePackage.ENTITY_MAP_INFO__MATCH_RULE_DEF_NAME, oldMatchRuleDefName, matchRuleDefName));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MatchRuleMapInfo getParent() {
        if (eContainerFeatureID() != MatchRulePackage.ENTITY_MAP_INFO__PARENT) {
            return null;
        }
        return (MatchRuleMapInfo)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParent(MatchRuleMapInfo newParent, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParent, MatchRulePackage.ENTITY_MAP_INFO__PARENT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParent(MatchRuleMapInfo newParent) {
        if (newParent != eInternalContainer() || (eContainerFeatureID() != MatchRulePackage.ENTITY_MAP_INFO__PARENT && newParent != null)) {
            if (EcoreUtil.isAncestor(this, newParent)) {
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            }
            NotificationChain msgs = null;
            if (eInternalContainer() != null) {
                msgs = eBasicRemoveFromContainer(msgs);
            }
            if (newParent != null) {
                msgs = ((InternalEObject)newParent).eInverseAdd(this, MatchRulePackage.MATCH_RULE_MAP_INFO__ENTITY_MAP_INFOS, MatchRuleMapInfo.class, msgs);
            }
            msgs = basicSetParent(newParent, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, MatchRulePackage.ENTITY_MAP_INFO__PARENT, newParent, newParent));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<MatchRuleMapInfoPage> getMatchRuleMapInfoPages() {
        if (matchRuleMapInfoPages == null) {
            matchRuleMapInfoPages = new EObjectContainmentWithInverseEList<MatchRuleMapInfoPage>(MatchRuleMapInfoPage.class, this, MatchRulePackage.ENTITY_MAP_INFO__MATCH_RULE_MAP_INFO_PAGES, MatchRulePackage.MATCH_RULE_MAP_INFO_PAGE__PARENT);
        }
        return matchRuleMapInfoPages;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EMap<String, String> getParticularDefaultSurvivorshipColumnMap() {
        if (particularDefaultSurvivorshipColumnMap == null) {
            particularDefaultSurvivorshipColumnMap = new EcoreEMap<String,String>(MatchRulePackage.Literals.KEY_XPATH_MAP, KeyXPathMapImpl.class, this, MatchRulePackage.ENTITY_MAP_INFO__PARTICULAR_DEFAULT_SURVIVORSHIP_COLUMN_MAP);
        }
        return particularDefaultSurvivorshipColumnMap;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case MatchRulePackage.ENTITY_MAP_INFO__PARENT:
            if (eInternalContainer() != null) {
                msgs = eBasicRemoveFromContainer(msgs);
            }
            return basicSetParent((MatchRuleMapInfo)otherEnd, msgs);
        case MatchRulePackage.ENTITY_MAP_INFO__MATCH_RULE_MAP_INFO_PAGES:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getMatchRuleMapInfoPages()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case MatchRulePackage.ENTITY_MAP_INFO__SURVIVORSHIP_KEY_MAP:
            return ((InternalEList<?>)getSurvivorshipKeyMap()).basicRemove(otherEnd, msgs);
        case MatchRulePackage.ENTITY_MAP_INFO__BLOCKING_KEY_DEFINITION:
            return basicSetBlockingKeyDefinition(null, msgs);
        case MatchRulePackage.ENTITY_MAP_INFO__PARENT:
            return basicSetParent(null, msgs);
        case MatchRulePackage.ENTITY_MAP_INFO__MATCH_RULE_MAP_INFO_PAGES:
            return ((InternalEList<?>)getMatchRuleMapInfoPages()).basicRemove(otherEnd, msgs);
        case MatchRulePackage.ENTITY_MAP_INFO__PARTICULAR_DEFAULT_SURVIVORSHIP_COLUMN_MAP:
            return ((InternalEList<?>)getParticularDefaultSurvivorshipColumnMap()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
        case MatchRulePackage.ENTITY_MAP_INFO__PARENT:
            return eInternalContainer().eInverseRemove(this, MatchRulePackage.MATCH_RULE_MAP_INFO__ENTITY_MAP_INFOS, MatchRuleMapInfo.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case MatchRulePackage.ENTITY_MAP_INFO__ENTITY_NAME:
            return getEntityName();
        case MatchRulePackage.ENTITY_MAP_INFO__SURVIVORSHIP_KEY_MAP:
            if (coreType) {
                return getSurvivorshipKeyMap();
            } else {
                return getSurvivorshipKeyMap().map();
            }
        case MatchRulePackage.ENTITY_MAP_INFO__BLOCKING_KEY_DEFINITION:
            return getBlockingKeyDefinition();
        case MatchRulePackage.ENTITY_MAP_INFO__MATCH_RULE_DEF_NAME:
            return getMatchRuleDefName();
        case MatchRulePackage.ENTITY_MAP_INFO__PARENT:
            return getParent();
        case MatchRulePackage.ENTITY_MAP_INFO__MATCH_RULE_MAP_INFO_PAGES:
            return getMatchRuleMapInfoPages();
        case MatchRulePackage.ENTITY_MAP_INFO__PARTICULAR_DEFAULT_SURVIVORSHIP_COLUMN_MAP:
            if (coreType) {
                return getParticularDefaultSurvivorshipColumnMap();
            } else {
                return getParticularDefaultSurvivorshipColumnMap().map();
            }
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case MatchRulePackage.ENTITY_MAP_INFO__ENTITY_NAME:
            setEntityName((String)newValue);
            return;
        case MatchRulePackage.ENTITY_MAP_INFO__SURVIVORSHIP_KEY_MAP:
            ((EStructuralFeature.Setting)getSurvivorshipKeyMap()).set(newValue);
            return;
        case MatchRulePackage.ENTITY_MAP_INFO__BLOCKING_KEY_DEFINITION:
            setBlockingKeyDefinition((BlockingKeyDefinition)newValue);
            return;
        case MatchRulePackage.ENTITY_MAP_INFO__MATCH_RULE_DEF_NAME:
            setMatchRuleDefName((String)newValue);
            return;
        case MatchRulePackage.ENTITY_MAP_INFO__PARENT:
            setParent((MatchRuleMapInfo)newValue);
            return;
        case MatchRulePackage.ENTITY_MAP_INFO__MATCH_RULE_MAP_INFO_PAGES:
            getMatchRuleMapInfoPages().clear();
            getMatchRuleMapInfoPages().addAll((Collection<? extends MatchRuleMapInfoPage>)newValue);
            return;
        case MatchRulePackage.ENTITY_MAP_INFO__PARTICULAR_DEFAULT_SURVIVORSHIP_COLUMN_MAP:
            ((EStructuralFeature.Setting)getParticularDefaultSurvivorshipColumnMap()).set(newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case MatchRulePackage.ENTITY_MAP_INFO__ENTITY_NAME:
            setEntityName(ENTITY_NAME_EDEFAULT);
            return;
        case MatchRulePackage.ENTITY_MAP_INFO__SURVIVORSHIP_KEY_MAP:
            getSurvivorshipKeyMap().clear();
            return;
        case MatchRulePackage.ENTITY_MAP_INFO__BLOCKING_KEY_DEFINITION:
            setBlockingKeyDefinition((BlockingKeyDefinition)null);
            return;
        case MatchRulePackage.ENTITY_MAP_INFO__MATCH_RULE_DEF_NAME:
            setMatchRuleDefName(MATCH_RULE_DEF_NAME_EDEFAULT);
            return;
        case MatchRulePackage.ENTITY_MAP_INFO__PARENT:
            setParent((MatchRuleMapInfo)null);
            return;
        case MatchRulePackage.ENTITY_MAP_INFO__MATCH_RULE_MAP_INFO_PAGES:
            getMatchRuleMapInfoPages().clear();
            return;
        case MatchRulePackage.ENTITY_MAP_INFO__PARTICULAR_DEFAULT_SURVIVORSHIP_COLUMN_MAP:
            getParticularDefaultSurvivorshipColumnMap().clear();
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case MatchRulePackage.ENTITY_MAP_INFO__ENTITY_NAME:
            return ENTITY_NAME_EDEFAULT == null ? entityName != null : !ENTITY_NAME_EDEFAULT.equals(entityName);
        case MatchRulePackage.ENTITY_MAP_INFO__SURVIVORSHIP_KEY_MAP:
            return survivorshipKeyMap != null && !survivorshipKeyMap.isEmpty();
        case MatchRulePackage.ENTITY_MAP_INFO__BLOCKING_KEY_DEFINITION:
            return blockingKeyDefinition != null;
        case MatchRulePackage.ENTITY_MAP_INFO__MATCH_RULE_DEF_NAME:
            return MATCH_RULE_DEF_NAME_EDEFAULT == null ? matchRuleDefName != null : !MATCH_RULE_DEF_NAME_EDEFAULT.equals(matchRuleDefName);
        case MatchRulePackage.ENTITY_MAP_INFO__PARENT:
            return getParent() != null;
        case MatchRulePackage.ENTITY_MAP_INFO__MATCH_RULE_MAP_INFO_PAGES:
            return matchRuleMapInfoPages != null && !matchRuleMapInfoPages.isEmpty();
        case MatchRulePackage.ENTITY_MAP_INFO__PARTICULAR_DEFAULT_SURVIVORSHIP_COLUMN_MAP:
            return particularDefaultSurvivorshipColumnMap != null && !particularDefaultSurvivorshipColumnMap.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) {
            return super.toString();
        }

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (entityName: ");
        result.append(entityName);
        result.append(", matchRuleDefName: ");
        result.append(matchRuleDefName);
        result.append(')');
        return result.toString();
    }

} //EntityMapInfoImpl
