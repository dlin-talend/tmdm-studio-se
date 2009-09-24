/*
 * Generated by XDoclet - Do not edit!
 */
package com.amalto.core.objects.synchronization.ejb.local;

/**
 * Local interface for SynchronizationObjectCtrl.
 * @xdoclet-generated at 24-09-09
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version ${version}
 */
public interface SynchronizationObjectCtrlLocal
   extends javax.ejb.EJBLocalObject
{
   /**
    * Creates or updates a SynchronizationObject
    * @throws XtentisException
    */
   public com.amalto.core.objects.synchronization.ejb.SynchronizationObjectPOJOPK putSynchronizationObject( com.amalto.core.objects.synchronization.ejb.SynchronizationObjectPOJO synchronizationObject ) throws com.amalto.core.util.XtentisException;

   /**
    * Get SynchronizationObject
    * @throws XtentisException
    */
   public com.amalto.core.objects.synchronization.ejb.SynchronizationObjectPOJO getSynchronizationObject( com.amalto.core.objects.synchronization.ejb.SynchronizationObjectPOJOPK pk ) throws com.amalto.core.util.XtentisException;

   /**
    * Get a SynchronizationObject - no exception is thrown: returns null if not found
    * @throws XtentisException
    */
   public com.amalto.core.objects.synchronization.ejb.SynchronizationObjectPOJO existsSynchronizationObject( com.amalto.core.objects.synchronization.ejb.SynchronizationObjectPOJOPK pk ) throws com.amalto.core.util.XtentisException;

   /**
    * Remove an item
    * @throws XtentisException
    */
   public com.amalto.core.objects.synchronization.ejb.SynchronizationObjectPOJOPK removeSynchronizationObject( com.amalto.core.objects.synchronization.ejb.SynchronizationObjectPOJOPK pk ) throws com.amalto.core.util.XtentisException;

   /**
    * Retrieve all SynchronizationObject PKS
    * @throws XtentisException
    */
   public java.util.Collection getSynchronizationObjectPKs( java.lang.String regex ) throws com.amalto.core.util.XtentisException;

}
