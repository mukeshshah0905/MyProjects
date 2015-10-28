/**
 * ITSWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emdeon.ITSWebService;

public interface ITSWS extends javax.xml.rpc.Service {
    public java.lang.String getITSWSSoapAddress();

    public com.emdeon.ITSWebService.ITSWSSoap getITSWSSoap() throws javax.xml.rpc.ServiceException;

    public com.emdeon.ITSWebService.ITSWSSoap getITSWSSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
