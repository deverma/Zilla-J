/**
 * Soap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zuora.api;

public interface Soap extends java.rmi.Remote {
    public com.zuora.api.LoginResult login(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException, com.zuora.api.fault.LoginFault, com.zuora.api.fault.UnexpectedErrorFault;
    public com.zuora.api.SubscribeResult[] subscribe(com.zuora.api.SubscribeRequest[] subscribes) throws java.rmi.RemoteException, com.zuora.api.fault.UnexpectedErrorFault;
    public com.zuora.api.SaveResult[] create(com.zuora.api.object.ZObject[] zObjects) throws java.rmi.RemoteException, com.zuora.api.fault.UnexpectedErrorFault, com.zuora.api.fault.InvalidTypeFault;
    public com.zuora.api.SaveResult[] generate(com.zuora.api.object.ZObject[] zObjects) throws java.rmi.RemoteException, com.zuora.api.fault.UnexpectedErrorFault, com.zuora.api.fault.InvalidTypeFault;
    public com.zuora.api.SaveResult[] update(com.zuora.api.object.ZObject[] zObjects) throws java.rmi.RemoteException, com.zuora.api.fault.UnexpectedErrorFault, com.zuora.api.fault.InvalidTypeFault;
    public com.zuora.api.DeleteResult[] delete(java.lang.String type, java.lang.String[] ids) throws java.rmi.RemoteException, com.zuora.api.fault.UnexpectedErrorFault, com.zuora.api.fault.InvalidTypeFault, com.zuora.api.fault.InvalidValueFault;
    public com.zuora.api.ExecuteResult[] execute(java.lang.String type, boolean synchronous, java.lang.String[] ids) throws java.rmi.RemoteException, com.zuora.api.fault.UnexpectedErrorFault, com.zuora.api.fault.InvalidTypeFault, com.zuora.api.fault.InvalidValueFault;
    public com.zuora.api.QueryResult query(java.lang.String queryString) throws java.rmi.RemoteException, com.zuora.api.fault.InvalidQueryLocatorFault, com.zuora.api.fault.UnexpectedErrorFault, com.zuora.api.fault.MalformedQueryFault;

    /**
     * Gets the next batch of sObjects from a query
     */
    public com.zuora.api.QueryResult queryMore(java.lang.String queryLocator) throws java.rmi.RemoteException, com.zuora.api.fault.InvalidQueryLocatorFault, com.zuora.api.fault.UnexpectedErrorFault;
    public void getUserInfo(javax.xml.rpc.holders.StringHolder tenantId, javax.xml.rpc.holders.StringHolder tenantName, javax.xml.rpc.holders.StringHolder userEmail, javax.xml.rpc.holders.StringHolder userFullName, javax.xml.rpc.holders.StringHolder userId, javax.xml.rpc.holders.StringHolder username) throws java.rmi.RemoteException, com.zuora.api.fault.UnexpectedErrorFault;
    public void rasd(javax.xml.rpc.holders.IntegerWrapperHolder overlap, org.apache.axis.holders.DateHolder startDate, javax.xml.rpc.holders.StringHolder updatedBy, javax.xml.rpc.holders.CalendarHolder updatedOn) throws java.rmi.RemoteException, com.zuora.api.fault.UnexpectedErrorFault;
    public com.zuora.api.AmendResult[] amend(com.zuora.api.AmendRequest[] requests) throws java.rmi.RemoteException, com.zuora.api.fault.UnexpectedErrorFault;
}
