/*
 * Generated by XDoclet - Do not edit!
 */
package com.amalto.core.objects.datacluster.ejb.remote;

/**
 * Home interface for DataClusterCtrl.
 * @xdoclet-generated at 3-08-09
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version ${version}
 */
public interface DataClusterCtrlHome
   extends javax.ejb.EJBHome
{
   public static final String COMP_NAME="java:comp/env/ejb/DataClusterCtrl";
   public static final String JNDI_NAME="amalto/remote/core/dataclusterctrl";

   public com.amalto.core.objects.datacluster.ejb.remote.DataClusterCtrl create()
      throws javax.ejb.CreateException,java.rmi.RemoteException;

}
