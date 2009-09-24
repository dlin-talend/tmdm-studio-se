/*
 * Generated by XDoclet - Do not edit!
 */
package com.amalto.core.objects.role.ejb.local;

/**
 * Local interface for RoleCtrl.
 * @xdoclet-generated at 24-09-09
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version ${version}
 */
public interface RoleCtrlLocal
   extends javax.ejb.EJBLocalObject
{
   /**
    * Creates or updates a Role
    * @throws XtentisException
    */
   public com.amalto.core.objects.role.ejb.RolePOJOPK putRole( com.amalto.core.objects.role.ejb.RolePOJO role ) throws com.amalto.core.util.XtentisException;

   /**
    * Get Role
    * @throws XtentisException
    */
   public com.amalto.core.objects.role.ejb.RolePOJO getRole( com.amalto.core.objects.role.ejb.RolePOJOPK pk ) throws com.amalto.core.util.XtentisException;

   /**
    * Get a Role - no exception is thrown: returns null if not found
    * @throws XtentisException
    */
   public com.amalto.core.objects.role.ejb.RolePOJO existsRole( com.amalto.core.objects.role.ejb.RolePOJOPK pk ) throws com.amalto.core.util.XtentisException;

   /**
    * Remove an item
    * @throws XtentisException
    */
   public com.amalto.core.objects.role.ejb.RolePOJOPK removeRole( com.amalto.core.objects.role.ejb.RolePOJOPK pk ) throws com.amalto.core.util.XtentisException;

   /**
    * Retrieve all Role PKS
    * @throws XtentisException
    */
   public java.util.Collection getRolePKs( java.lang.String regex ) throws com.amalto.core.util.XtentisException;

}
