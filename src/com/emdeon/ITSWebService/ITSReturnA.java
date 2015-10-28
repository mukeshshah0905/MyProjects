/**
 * ITSReturnA.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emdeon.ITSWebService;

public class ITSReturnA  implements java.io.Serializable {
    private int errorCode;

    private java.lang.String response;

    private java.lang.String serverCode;

    public ITSReturnA() {
    }

    public ITSReturnA(
           int errorCode,
           java.lang.String response,
           java.lang.String serverCode) {
           this.errorCode = errorCode;
           this.response = response;
           this.serverCode = serverCode;
    }


    /**
     * Gets the errorCode value for this ITSReturnA.
     * 
     * @return errorCode
     */
    public int getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this ITSReturnA.
     * 
     * @param errorCode
     */
    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the response value for this ITSReturnA.
     * 
     * @return response
     */
    public java.lang.String getResponse() {
        return response;
    }


    /**
     * Sets the response value for this ITSReturnA.
     * 
     * @param response
     */
    public void setResponse(java.lang.String response) {
        this.response = response;
    }


    /**
     * Gets the serverCode value for this ITSReturnA.
     * 
     * @return serverCode
     */
    public java.lang.String getServerCode() {
        return serverCode;
    }


    /**
     * Sets the serverCode value for this ITSReturnA.
     * 
     * @param serverCode
     */
    public void setServerCode(java.lang.String serverCode) {
        this.serverCode = serverCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ITSReturnA)) return false;
        ITSReturnA other = (ITSReturnA) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.errorCode == other.getErrorCode() &&
            ((this.response==null && other.getResponse()==null) || 
             (this.response!=null &&
              this.response.equals(other.getResponse()))) &&
            ((this.serverCode==null && other.getServerCode()==null) || 
             (this.serverCode!=null &&
              this.serverCode.equals(other.getServerCode())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getErrorCode();
        if (getResponse() != null) {
            _hashCode += getResponse().hashCode();
        }
        if (getServerCode() != null) {
            _hashCode += getServerCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ITSReturnA.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ITSWebService.emdeon.com/", "ITSReturnA"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ITSWebService.emdeon.com/", "ErrorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ITSWebService.emdeon.com/", "Response"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ITSWebService.emdeon.com/", "ServerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
