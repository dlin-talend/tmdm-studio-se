/*
 * Generated by XDoclet - Do not edit!
 */
package com.amalto.core.ejb.remote;

/**
 * Home interface for XmlServerSLWrapper.
 * @xdoclet-generated at 24-09-09
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version ${version}
 */
public interface XmlServerSLWrapperHome
   extends javax.ejb.EJBHome
{
   public static final String COMP_NAME="java:comp/env/ejb/XmlServerSLWrapper";
   public static final String JNDI_NAME="amalto/remote/xmldb/xmlserverslwrapper";

   public com.amalto.core.ejb.remote.XmlServerSLWrapper create()
      throws javax.ejb.CreateException,java.rmi.RemoteException;

}
