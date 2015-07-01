/**
 * SubscribeInvoiceProcessingOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zuora.api;

public class SubscribeInvoiceProcessingOptions  implements java.io.Serializable {
    private java.util.Calendar invoiceDate;

    private java.lang.String invoiceProcessingScope;

    private java.util.Calendar invoiceTargetDate;

    public SubscribeInvoiceProcessingOptions() {
    }

    public SubscribeInvoiceProcessingOptions(
           java.util.Calendar invoiceDate,
           java.lang.String invoiceProcessingScope,
           java.util.Calendar invoiceTargetDate) {
           this.invoiceDate = invoiceDate;
           this.invoiceProcessingScope = invoiceProcessingScope;
           this.invoiceTargetDate = invoiceTargetDate;
    }


    /**
     * Gets the invoiceDate value for this SubscribeInvoiceProcessingOptions.
     * 
     * @return invoiceDate
     */
    public java.util.Calendar getInvoiceDate() {
        return invoiceDate;
    }


    /**
     * Sets the invoiceDate value for this SubscribeInvoiceProcessingOptions.
     * 
     * @param invoiceDate
     */
    public void setInvoiceDate(java.util.Calendar invoiceDate) {
        this.invoiceDate = invoiceDate;
    }


    /**
     * Gets the invoiceProcessingScope value for this SubscribeInvoiceProcessingOptions.
     * 
     * @return invoiceProcessingScope
     */
    public java.lang.String getInvoiceProcessingScope() {
        return invoiceProcessingScope;
    }


    /**
     * Sets the invoiceProcessingScope value for this SubscribeInvoiceProcessingOptions.
     * 
     * @param invoiceProcessingScope
     */
    public void setInvoiceProcessingScope(java.lang.String invoiceProcessingScope) {
        this.invoiceProcessingScope = invoiceProcessingScope;
    }


    /**
     * Gets the invoiceTargetDate value for this SubscribeInvoiceProcessingOptions.
     * 
     * @return invoiceTargetDate
     */
    public java.util.Calendar getInvoiceTargetDate() {
        return invoiceTargetDate;
    }


    /**
     * Sets the invoiceTargetDate value for this SubscribeInvoiceProcessingOptions.
     * 
     * @param invoiceTargetDate
     */
    public void setInvoiceTargetDate(java.util.Calendar invoiceTargetDate) {
        this.invoiceTargetDate = invoiceTargetDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscribeInvoiceProcessingOptions)) return false;
        SubscribeInvoiceProcessingOptions other = (SubscribeInvoiceProcessingOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.invoiceDate==null && other.getInvoiceDate()==null) || 
             (this.invoiceDate!=null &&
              this.invoiceDate.equals(other.getInvoiceDate()))) &&
            ((this.invoiceProcessingScope==null && other.getInvoiceProcessingScope()==null) || 
             (this.invoiceProcessingScope!=null &&
              this.invoiceProcessingScope.equals(other.getInvoiceProcessingScope()))) &&
            ((this.invoiceTargetDate==null && other.getInvoiceTargetDate()==null) || 
             (this.invoiceTargetDate!=null &&
              this.invoiceTargetDate.equals(other.getInvoiceTargetDate())));
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
        if (getInvoiceDate() != null) {
            _hashCode += getInvoiceDate().hashCode();
        }
        if (getInvoiceProcessingScope() != null) {
            _hashCode += getInvoiceProcessingScope().hashCode();
        }
        if (getInvoiceTargetDate() != null) {
            _hashCode += getInvoiceTargetDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubscribeInvoiceProcessingOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.zuora.com/", "SubscribeInvoiceProcessingOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "InvoiceDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceProcessingScope");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "InvoiceProcessingScope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceTargetDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "InvoiceTargetDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
