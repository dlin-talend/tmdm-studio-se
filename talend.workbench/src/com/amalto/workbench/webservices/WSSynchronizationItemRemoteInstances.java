// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation ��1.1.2_01������� R40��
// Generated source version: 1.1.2

package com.amalto.workbench.webservices;


public class WSSynchronizationItemRemoteInstances {
    protected java.lang.String remoteSystemName;
    protected java.lang.String remoteRevisionID;
    protected java.lang.String xml;
    protected java.util.Calendar lastLocalSynchronizationTime;
    
    public WSSynchronizationItemRemoteInstances() {
    }
    
    public WSSynchronizationItemRemoteInstances(java.lang.String remoteSystemName, java.lang.String remoteRevisionID, java.lang.String xml, java.util.Calendar lastLocalSynchronizationTime) {
        this.remoteSystemName = remoteSystemName;
        this.remoteRevisionID = remoteRevisionID;
        this.xml = xml;
        this.lastLocalSynchronizationTime = lastLocalSynchronizationTime;
    }
    
    public java.lang.String getRemoteSystemName() {
        return remoteSystemName;
    }
    
    public void setRemoteSystemName(java.lang.String remoteSystemName) {
        this.remoteSystemName = remoteSystemName;
    }
    
    public java.lang.String getRemoteRevisionID() {
        return remoteRevisionID;
    }
    
    public void setRemoteRevisionID(java.lang.String remoteRevisionID) {
        this.remoteRevisionID = remoteRevisionID;
    }
    
    public java.lang.String getXml() {
        return xml;
    }
    
    public void setXml(java.lang.String xml) {
        this.xml = xml;
    }
    
    public java.util.Calendar getLastLocalSynchronizationTime() {
        return lastLocalSynchronizationTime;
    }
    
    public void setLastLocalSynchronizationTime(java.util.Calendar lastLocalSynchronizationTime) {
        this.lastLocalSynchronizationTime = lastLocalSynchronizationTime;
    }
}
