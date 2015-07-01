/**
 * PaymentMethodTransactionLog.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zuora.api.object;

public class PaymentMethodTransactionLog  extends com.zuora.api.object.ZObject  implements java.io.Serializable {
    private java.lang.String gateway;

    private java.lang.String gatewayReasonCode;

    private java.lang.String gatewayReasonCodeDescription;

    private java.lang.String gatewayTransactionType;

    private java.lang.String paymentMethodId;

    private java.lang.String paymentMethodType;

    private java.lang.String requestString;

    private java.lang.String responseString;

    private java.lang.String transactionDate;

    private java.lang.String transactionId;

    public PaymentMethodTransactionLog() {
    }

    public PaymentMethodTransactionLog(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String gateway,
           java.lang.String gatewayReasonCode,
           java.lang.String gatewayReasonCodeDescription,
           java.lang.String gatewayTransactionType,
           java.lang.String paymentMethodId,
           java.lang.String paymentMethodType,
           java.lang.String requestString,
           java.lang.String responseString,
           java.lang.String transactionDate,
           java.lang.String transactionId) {
        super(
            fieldsToNull,
            id);
        this.gateway = gateway;
        this.gatewayReasonCode = gatewayReasonCode;
        this.gatewayReasonCodeDescription = gatewayReasonCodeDescription;
        this.gatewayTransactionType = gatewayTransactionType;
        this.paymentMethodId = paymentMethodId;
        this.paymentMethodType = paymentMethodType;
        this.requestString = requestString;
        this.responseString = responseString;
        this.transactionDate = transactionDate;
        this.transactionId = transactionId;
    }


    /**
     * Gets the gateway value for this PaymentMethodTransactionLog.
     * 
     * @return gateway
     */
    public java.lang.String getGateway() {
        return gateway;
    }


    /**
     * Sets the gateway value for this PaymentMethodTransactionLog.
     * 
     * @param gateway
     */
    public void setGateway(java.lang.String gateway) {
        this.gateway = gateway;
    }


    /**
     * Gets the gatewayReasonCode value for this PaymentMethodTransactionLog.
     * 
     * @return gatewayReasonCode
     */
    public java.lang.String getGatewayReasonCode() {
        return gatewayReasonCode;
    }


    /**
     * Sets the gatewayReasonCode value for this PaymentMethodTransactionLog.
     * 
     * @param gatewayReasonCode
     */
    public void setGatewayReasonCode(java.lang.String gatewayReasonCode) {
        this.gatewayReasonCode = gatewayReasonCode;
    }


    /**
     * Gets the gatewayReasonCodeDescription value for this PaymentMethodTransactionLog.
     * 
     * @return gatewayReasonCodeDescription
     */
    public java.lang.String getGatewayReasonCodeDescription() {
        return gatewayReasonCodeDescription;
    }


    /**
     * Sets the gatewayReasonCodeDescription value for this PaymentMethodTransactionLog.
     * 
     * @param gatewayReasonCodeDescription
     */
    public void setGatewayReasonCodeDescription(java.lang.String gatewayReasonCodeDescription) {
        this.gatewayReasonCodeDescription = gatewayReasonCodeDescription;
    }


    /**
     * Gets the gatewayTransactionType value for this PaymentMethodTransactionLog.
     * 
     * @return gatewayTransactionType
     */
    public java.lang.String getGatewayTransactionType() {
        return gatewayTransactionType;
    }


    /**
     * Sets the gatewayTransactionType value for this PaymentMethodTransactionLog.
     * 
     * @param gatewayTransactionType
     */
    public void setGatewayTransactionType(java.lang.String gatewayTransactionType) {
        this.gatewayTransactionType = gatewayTransactionType;
    }


    /**
     * Gets the paymentMethodId value for this PaymentMethodTransactionLog.
     * 
     * @return paymentMethodId
     */
    public java.lang.String getPaymentMethodId() {
        return paymentMethodId;
    }


    /**
     * Sets the paymentMethodId value for this PaymentMethodTransactionLog.
     * 
     * @param paymentMethodId
     */
    public void setPaymentMethodId(java.lang.String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }


    /**
     * Gets the paymentMethodType value for this PaymentMethodTransactionLog.
     * 
     * @return paymentMethodType
     */
    public java.lang.String getPaymentMethodType() {
        return paymentMethodType;
    }


    /**
     * Sets the paymentMethodType value for this PaymentMethodTransactionLog.
     * 
     * @param paymentMethodType
     */
    public void setPaymentMethodType(java.lang.String paymentMethodType) {
        this.paymentMethodType = paymentMethodType;
    }


    /**
     * Gets the requestString value for this PaymentMethodTransactionLog.
     * 
     * @return requestString
     */
    public java.lang.String getRequestString() {
        return requestString;
    }


    /**
     * Sets the requestString value for this PaymentMethodTransactionLog.
     * 
     * @param requestString
     */
    public void setRequestString(java.lang.String requestString) {
        this.requestString = requestString;
    }


    /**
     * Gets the responseString value for this PaymentMethodTransactionLog.
     * 
     * @return responseString
     */
    public java.lang.String getResponseString() {
        return responseString;
    }


    /**
     * Sets the responseString value for this PaymentMethodTransactionLog.
     * 
     * @param responseString
     */
    public void setResponseString(java.lang.String responseString) {
        this.responseString = responseString;
    }


    /**
     * Gets the transactionDate value for this PaymentMethodTransactionLog.
     * 
     * @return transactionDate
     */
    public java.lang.String getTransactionDate() {
        return transactionDate;
    }


    /**
     * Sets the transactionDate value for this PaymentMethodTransactionLog.
     * 
     * @param transactionDate
     */
    public void setTransactionDate(java.lang.String transactionDate) {
        this.transactionDate = transactionDate;
    }


    /**
     * Gets the transactionId value for this PaymentMethodTransactionLog.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this PaymentMethodTransactionLog.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentMethodTransactionLog)) return false;
        PaymentMethodTransactionLog other = (PaymentMethodTransactionLog) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.gateway==null && other.getGateway()==null) || 
             (this.gateway!=null &&
              this.gateway.equals(other.getGateway()))) &&
            ((this.gatewayReasonCode==null && other.getGatewayReasonCode()==null) || 
             (this.gatewayReasonCode!=null &&
              this.gatewayReasonCode.equals(other.getGatewayReasonCode()))) &&
            ((this.gatewayReasonCodeDescription==null && other.getGatewayReasonCodeDescription()==null) || 
             (this.gatewayReasonCodeDescription!=null &&
              this.gatewayReasonCodeDescription.equals(other.getGatewayReasonCodeDescription()))) &&
            ((this.gatewayTransactionType==null && other.getGatewayTransactionType()==null) || 
             (this.gatewayTransactionType!=null &&
              this.gatewayTransactionType.equals(other.getGatewayTransactionType()))) &&
            ((this.paymentMethodId==null && other.getPaymentMethodId()==null) || 
             (this.paymentMethodId!=null &&
              this.paymentMethodId.equals(other.getPaymentMethodId()))) &&
            ((this.paymentMethodType==null && other.getPaymentMethodType()==null) || 
             (this.paymentMethodType!=null &&
              this.paymentMethodType.equals(other.getPaymentMethodType()))) &&
            ((this.requestString==null && other.getRequestString()==null) || 
             (this.requestString!=null &&
              this.requestString.equals(other.getRequestString()))) &&
            ((this.responseString==null && other.getResponseString()==null) || 
             (this.responseString!=null &&
              this.responseString.equals(other.getResponseString()))) &&
            ((this.transactionDate==null && other.getTransactionDate()==null) || 
             (this.transactionDate!=null &&
              this.transactionDate.equals(other.getTransactionDate()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getGateway() != null) {
            _hashCode += getGateway().hashCode();
        }
        if (getGatewayReasonCode() != null) {
            _hashCode += getGatewayReasonCode().hashCode();
        }
        if (getGatewayReasonCodeDescription() != null) {
            _hashCode += getGatewayReasonCodeDescription().hashCode();
        }
        if (getGatewayTransactionType() != null) {
            _hashCode += getGatewayTransactionType().hashCode();
        }
        if (getPaymentMethodId() != null) {
            _hashCode += getPaymentMethodId().hashCode();
        }
        if (getPaymentMethodType() != null) {
            _hashCode += getPaymentMethodType().hashCode();
        }
        if (getRequestString() != null) {
            _hashCode += getRequestString().hashCode();
        }
        if (getResponseString() != null) {
            _hashCode += getResponseString().hashCode();
        }
        if (getTransactionDate() != null) {
            _hashCode += getTransactionDate().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentMethodTransactionLog.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://object.api.zuora.com/", "PaymentMethodTransactionLog"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gateway");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Gateway"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayReasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "GatewayReasonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayReasonCodeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "GatewayReasonCodeDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayTransactionType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "GatewayTransactionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethodId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "PaymentMethodId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethodType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "PaymentMethodType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestString");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "RequestString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseString");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "ResponseString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "TransactionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "TransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
