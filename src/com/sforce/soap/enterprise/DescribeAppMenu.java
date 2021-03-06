/**
 * DescribeAppMenu.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise;

public class DescribeAppMenu  implements java.io.Serializable {
    private com.sforce.soap.enterprise.AppMenuType appMenuType;

    public DescribeAppMenu() {
    }

    public DescribeAppMenu(
           com.sforce.soap.enterprise.AppMenuType appMenuType) {
           this.appMenuType = appMenuType;
    }


    /**
     * Gets the appMenuType value for this DescribeAppMenu.
     * 
     * @return appMenuType
     */
    public com.sforce.soap.enterprise.AppMenuType getAppMenuType() {
        return appMenuType;
    }


    /**
     * Sets the appMenuType value for this DescribeAppMenu.
     * 
     * @param appMenuType
     */
    public void setAppMenuType(com.sforce.soap.enterprise.AppMenuType appMenuType) {
        this.appMenuType = appMenuType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DescribeAppMenu)) return false;
        DescribeAppMenu other = (DescribeAppMenu) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.appMenuType==null && other.getAppMenuType()==null) || 
             (this.appMenuType!=null &&
              this.appMenuType.equals(other.getAppMenuType())));
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
        if (getAppMenuType() != null) {
            _hashCode += getAppMenuType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DescribeAppMenu.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeAppMenu"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appMenuType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "appMenuType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "AppMenuType"));
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
