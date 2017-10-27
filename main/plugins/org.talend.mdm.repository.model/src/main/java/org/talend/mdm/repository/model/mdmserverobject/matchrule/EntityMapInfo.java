/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.mdm.repository.model.mdmserverobject.matchrule;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Map Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.mdm.repository.model.mdmserverobject.matchrule.EntityMapInfo#getEntityName <em>Entity Name</em>}</li>
 *   <li>{@link org.talend.mdm.repository.model.mdmserverobject.matchrule.EntityMapInfo#getSurvivorshipKeyMap <em>Survivorship Key Map</em>}</li>
 *   <li>{@link org.talend.mdm.repository.model.mdmserverobject.matchrule.EntityMapInfo#getBlockingKeyDefinition <em>Blocking Key Definition</em>}</li>
 *   <li>{@link org.talend.mdm.repository.model.mdmserverobject.matchrule.EntityMapInfo#getMatchRuleDefName <em>Match Rule Def Name</em>}</li>
 *   <li>{@link org.talend.mdm.repository.model.mdmserverobject.matchrule.EntityMapInfo#getParent <em>Parent</em>}</li>
 *   <li>{@link org.talend.mdm.repository.model.mdmserverobject.matchrule.EntityMapInfo#getMatchRuleMapInfoPages <em>Match Rule Map Info Pages</em>}</li>
 *   <li>{@link org.talend.mdm.repository.model.mdmserverobject.matchrule.EntityMapInfo#getParticularDefaultSurvivorshipColumnMap <em>Particular Default Survivorship Column Map</em>}</li>
 * </ul>
 * </p>

 * @see org.talend.mdm.repository.model.mdmserverobject.matchrule.MatchRulePackage#getEntityMapInfo()
 * @model
 * @generated
 */
public interface EntityMapInfo extends EObject {
    /**
     * Returns the value of the '<em><b>Entity Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entity Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entity Name</em>' attribute.
     * @see #setEntityName(String)
     * @see org.talend.mdm.repository.model.mdmserverobject.matchrule.MatchRulePackage#getEntityMapInfo_EntityName()
     * @model
     * @generated
     */
    String getEntityName();

    /**
     * Sets the value of the '{@link org.talend.mdm.repository.model.mdmserverobject.matchrule.EntityMapInfo#getEntityName <em>Entity Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Entity Name</em>' attribute.
     * @see #getEntityName()
     * @generated
     */
    void setEntityName(String value);

    /**
     * Returns the value of the '<em><b>Survivorship Key Map</b></em>' map.
     * The key is of type {@link java.lang.String},
     * and the value is of type {@link java.lang.String},
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Survivorship Key Map</em>' map isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Survivorship Key Map</em>' map.
     * @see org.talend.mdm.repository.model.mdmserverobject.matchrule.MatchRulePackage#getEntityMapInfo_SurvivorshipKeyMap()
     * @model mapType="org.talend.mdm.repository.model.mdmserverobject.matchrule.KeyXPathMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
     * @generated
     */
    EMap<String, String> getSurvivorshipKeyMap();

    /**
     * Returns the value of the '<em><b>Blocking Key Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Blocking Key Definition</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Blocking Key Definition</em>' containment reference.
     * @see #setBlockingKeyDefinition(BlockingKeyDefinition)
     * @see org.talend.mdm.repository.model.mdmserverobject.matchrule.MatchRulePackage#getEntityMapInfo_BlockingKeyDefinition()
     * @model containment="true"
     * @generated
     */
    BlockingKeyDefinition getBlockingKeyDefinition();

    /**
     * Sets the value of the '{@link org.talend.mdm.repository.model.mdmserverobject.matchrule.EntityMapInfo#getBlockingKeyDefinition <em>Blocking Key Definition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Blocking Key Definition</em>' containment reference.
     * @see #getBlockingKeyDefinition()
     * @generated
     */
    void setBlockingKeyDefinition(BlockingKeyDefinition value);

    /**
     * Returns the value of the '<em><b>Match Rule Def Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Match Rule Def Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Match Rule Def Name</em>' attribute.
     * @see #setMatchRuleDefName(String)
     * @see org.talend.mdm.repository.model.mdmserverobject.matchrule.MatchRulePackage#getEntityMapInfo_MatchRuleDefName()
     * @model
     * @generated
     */
    String getMatchRuleDefName();

    /**
     * Sets the value of the '{@link org.talend.mdm.repository.model.mdmserverobject.matchrule.EntityMapInfo#getMatchRuleDefName <em>Match Rule Def Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Match Rule Def Name</em>' attribute.
     * @see #getMatchRuleDefName()
     * @generated
     */
    void setMatchRuleDefName(String value);

    /**
     * Returns the value of the '<em><b>Parent</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.talend.mdm.repository.model.mdmserverobject.matchrule.MatchRuleMapInfo#getEntityMapInfos <em>Entity Map Infos</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parent</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent</em>' container reference.
     * @see #setParent(MatchRuleMapInfo)
     * @see org.talend.mdm.repository.model.mdmserverobject.matchrule.MatchRulePackage#getEntityMapInfo_Parent()
     * @see org.talend.mdm.repository.model.mdmserverobject.matchrule.MatchRuleMapInfo#getEntityMapInfos
     * @model opposite="entityMapInfos" transient="false"
     * @generated
     */
    MatchRuleMapInfo getParent();

    /**
     * Sets the value of the '{@link org.talend.mdm.repository.model.mdmserverobject.matchrule.EntityMapInfo#getParent <em>Parent</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent</em>' container reference.
     * @see #getParent()
     * @generated
     */
    void setParent(MatchRuleMapInfo value);

    /**
     * Returns the value of the '<em><b>Match Rule Map Info Pages</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.mdm.repository.model.mdmserverobject.matchrule.MatchRuleMapInfoPage}.
     * It is bidirectional and its opposite is '{@link org.talend.mdm.repository.model.mdmserverobject.matchrule.MatchRuleMapInfoPage#getParent <em>Parent</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Match Rule Map Info Pages</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Match Rule Map Info Pages</em>' containment reference list.
     * @see org.talend.mdm.repository.model.mdmserverobject.matchrule.MatchRulePackage#getEntityMapInfo_MatchRuleMapInfoPages()
     * @see org.talend.mdm.repository.model.mdmserverobject.matchrule.MatchRuleMapInfoPage#getParent
     * @model opposite="parent" containment="true"
     * @generated
     */
    EList<MatchRuleMapInfoPage> getMatchRuleMapInfoPages();

    /**
     * Returns the value of the '<em><b>Particular Default Survivorship Column Map</b></em>' map.
     * The key is of type {@link java.lang.String},
     * and the value is of type {@link java.lang.String},
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Particular Default Survivorship Column Map</em>' map isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Particular Default Survivorship Column Map</em>' map.
     * @see org.talend.mdm.repository.model.mdmserverobject.matchrule.MatchRulePackage#getEntityMapInfo_ParticularDefaultSurvivorshipColumnMap()
     * @model mapType="org.talend.mdm.repository.model.mdmserverobject.matchrule.KeyXPathMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
     * @generated
     */
    EMap<String, String> getParticularDefaultSurvivorshipColumnMap();

} // EntityMapInfo
