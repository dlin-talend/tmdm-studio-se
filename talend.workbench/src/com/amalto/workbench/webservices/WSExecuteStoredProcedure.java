// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation ��1.1.2_01������� R40��
// Generated source version: 1.1.2

package com.amalto.workbench.webservices;


public class WSExecuteStoredProcedure {
    protected com.amalto.workbench.webservices.WSStoredProcedurePK wsStoredProcedurePK;
    protected java.lang.String revisionID;
    protected com.amalto.workbench.webservices.WSDataClusterPK wsDataClusterPK;
    protected java.lang.String[] parameters;
    
    public WSExecuteStoredProcedure() {
    }
    
    public WSExecuteStoredProcedure(com.amalto.workbench.webservices.WSStoredProcedurePK wsStoredProcedurePK, java.lang.String revisionID, com.amalto.workbench.webservices.WSDataClusterPK wsDataClusterPK, java.lang.String[] parameters) {
        this.wsStoredProcedurePK = wsStoredProcedurePK;
        this.revisionID = revisionID;
        this.wsDataClusterPK = wsDataClusterPK;
        this.parameters = parameters;
    }
    
    public com.amalto.workbench.webservices.WSStoredProcedurePK getWsStoredProcedurePK() {
        return wsStoredProcedurePK;
    }
    
    public void setWsStoredProcedurePK(com.amalto.workbench.webservices.WSStoredProcedurePK wsStoredProcedurePK) {
        this.wsStoredProcedurePK = wsStoredProcedurePK;
    }
    
    public java.lang.String getRevisionID() {
        return revisionID;
    }
    
    public void setRevisionID(java.lang.String revisionID) {
        this.revisionID = revisionID;
    }
    
    public com.amalto.workbench.webservices.WSDataClusterPK getWsDataClusterPK() {
        return wsDataClusterPK;
    }
    
    public void setWsDataClusterPK(com.amalto.workbench.webservices.WSDataClusterPK wsDataClusterPK) {
        this.wsDataClusterPK = wsDataClusterPK;
    }
    
    public java.lang.String[] getParameters() {
        return parameters;
    }
    
    public void setParameters(java.lang.String[] parameters) {
        this.parameters = parameters;
    }
}
