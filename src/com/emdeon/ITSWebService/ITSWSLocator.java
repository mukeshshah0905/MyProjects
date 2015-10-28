/**
 * ITSWSLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emdeon.ITSWebService;

public class ITSWSLocator extends org.apache.axis.client.Service implements com.emdeon.ITSWebService.ITSWS {

    public ITSWSLocator() {
    }


    public ITSWSLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ITSWSLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ITSWSSoap
    private java.lang.String ITSWSSoap_address = "https://cert.its.emdeon.com/ITS/ITSWS.asmx";

    public java.lang.String getITSWSSoapAddress() {
        return ITSWSSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ITSWSSoapWSDDServiceName = "ITSWSSoap";

    public java.lang.String getITSWSSoapWSDDServiceName() {
        return ITSWSSoapWSDDServiceName;
    }

    public void setITSWSSoapWSDDServiceName(java.lang.String name) {
        ITSWSSoapWSDDServiceName = name;
    }

    public com.emdeon.ITSWebService.ITSWSSoap getITSWSSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ITSWSSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getITSWSSoap(endpoint);
    }

    public com.emdeon.ITSWebService.ITSWSSoap getITSWSSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.emdeon.ITSWebService.ITSWSSoapStub _stub = new com.emdeon.ITSWebService.ITSWSSoapStub(portAddress, this);
            _stub.setPortName(getITSWSSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setITSWSSoapEndpointAddress(java.lang.String address) {
        ITSWSSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.emdeon.ITSWebService.ITSWSSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.emdeon.ITSWebService.ITSWSSoapStub _stub = new com.emdeon.ITSWebService.ITSWSSoapStub(new java.net.URL(ITSWSSoap_address), this);
                _stub.setPortName(getITSWSSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ITSWSSoap".equals(inputPortName)) {
            return getITSWSSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://ITSWebService.emdeon.com/", "ITSWS");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://ITSWebService.emdeon.com/", "ITSWSSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ITSWSSoap".equals(portName)) {
            setITSWSSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
