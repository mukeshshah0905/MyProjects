/**
 * ITSWSSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emdeon.ITSWebService;

public interface ITSWSSoap extends java.rmi.Remote {

    /**
     * Authenticate User
     */
    public com.emdeon.ITSWebService.ITSReturn authenticate(java.lang.String sUserID, java.lang.String sPassword) throws java.rmi.RemoteException;

    /**
     * Change User Password
     */
    public com.emdeon.ITSWebService.ITSReturn changePassword(java.lang.String sUserID, java.lang.String sPassword, java.lang.String sNewPassword) throws java.rmi.RemoteException;

    /**
     * Send a Realtime Request
     */
    public com.emdeon.ITSWebService.ITSReturn sendRequest(java.lang.String sUserID, java.lang.String sPassword, java.lang.String sMessageType, java.lang.String sEncodedRequest) throws java.rmi.RemoteException;

    /**
     * Send a Realtime Request
     */
    public com.emdeon.ITSWebService.ITSReturnA sendRequestA(java.lang.String sUserID, java.lang.String sPassword, java.lang.String sMessageType, java.lang.String sEncodedRequest) throws java.rmi.RemoteException;

    /**
     * Upload a Batch File with filename
     */
    public com.emdeon.ITSWebService.ITSReturn putFileExt(java.lang.String sUserID, java.lang.String sPassword, java.lang.String sMessageType, java.lang.String sFileName, java.lang.String sEncodedPutFile) throws java.rmi.RemoteException;

    /**
     * Upload a Batch File
     */
    public com.emdeon.ITSWebService.ITSReturn putFile(java.lang.String sUserID, java.lang.String sPassword, java.lang.String sMessageType, java.lang.String sEncodedPutFile) throws java.rmi.RemoteException;

    /**
     * Download a Batch File
     */
    public com.emdeon.ITSWebService.ITSReturn getFile(java.lang.String sUserID, java.lang.String sPassword, java.lang.String sMessageType) throws java.rmi.RemoteException;
    public java.lang.String isAlive(java.lang.String s) throws java.rmi.RemoteException;
}
