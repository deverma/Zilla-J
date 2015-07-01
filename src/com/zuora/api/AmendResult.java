/**
 * AmendResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zuora.api;

public class AmendResult  implements java.io.Serializable {
    private java.lang.String[] amendmentIds;

    private com.zuora.api.NewChargeMetrics[] chargeMetricsData;

    private com.zuora.api.Error[] errors;

    private java.lang.String gatewayResponse;

    private java.lang.String gatewayResponseCode;

    private com.zuora.api.InvoiceData[] invoiceDatas;

    private java.lang.String invoiceId;

    private java.lang.String paymentId;

    private java.lang.String paymentTransactionNumber;

    private java.lang.String subscriptionId;

    private java.lang.Boolean success;

    private java.math.BigDecimal totalDeltaMrr;

    private java.math.BigDecimal totalDeltaTcv;

    public AmendResult() {
    }

    public AmendResult(
           java.lang.String[] amendmentIds,
           com.zuora.api.NewChargeMetrics[] chargeMetricsData,
           com.zuora.api.Error[] errors,
           java.lang.String gatewayResponse,
           java.lang.String gatewayResponseCode,
           com.zuora.api.InvoiceData[] invoiceDatas,
           java.lang.String invoiceId,
           java.lang.String paymentId,
           java.lang.String paymentTransactionNumber,
           java.lang.String subscriptionId,
           java.lang.Boolean success,
           java.math.BigDecimal totalDeltaMrr,
           java.math.BigDecimal totalDeltaTcv) {
           this.amendmentIds = amendmentIds;
           this.chargeMetricsData = chargeMetricsData;
           this.errors = errors;
           this.gatewayResponse = gatewayResponse;
           this.gatewayResponseCode = gatewayResponseCode;
           this.invoiceDatas = invoiceDatas;
           this.invoiceId = invoiceId;
           this.paymentId = paymentId;
           this.paymentTransactionNumber = paymentTransactionNumber;
           this.subscriptionId = subscriptionId;
           this.success = success;
           this.totalDeltaMrr = totalDeltaMrr;
           this.totalDeltaTcv = totalDeltaTcv;
    }


    /**
     * Gets the amendmentIds value for this AmendResult.
     * 
     * @return amendmentIds
     */
    public java.lang.String[] getAmendmentIds() {
        return amendmentIds;
    }


    /**
     * Sets the amendmentIds value for this AmendResult.
     * 
     * @param amendmentIds
     */
    public void setAmendmentIds(java.lang.String[] amendmentIds) {
        this.amendmentIds = amendmentIds;
    }

    public java.lang.String getAmendmentIds(int i) {
        return this.amendmentIds[i];
    }

    public void setAmendmentIds(int i, java.lang.String _value) {
        this.amendmentIds[i] = _value;
    }


    /**
     * Gets the chargeMetricsData value for this AmendResult.
     * 
     * @return chargeMetricsData
     */
    public com.zuora.api.NewChargeMetrics[] getChargeMetricsData() {
        return chargeMetricsData;
    }


    /**
     * Sets the chargeMetricsData value for this AmendResult.
     * 
     * @param chargeMetricsData
     */
    public void setChargeMetricsData(com.zuora.api.NewChargeMetrics[] chargeMetricsData) {
        this.chargeMetricsData = chargeMetricsData;
    }


    /**
     * Gets the errors value for this AmendResult.
     * 
     * @return errors
     */
    public com.zuora.api.Error[] getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this AmendResult.
     * 
     * @param errors
     */
    public void setErrors(com.zuora.api.Error[] errors) {
        this.errors = errors;
    }

    public com.zuora.api.Error getErrors(int i) {
        return this.errors[i];
    }

    public void setErrors(int i, com.zuora.api.Error _value) {
        this.errors[i] = _value;
    }


    /**
     * Gets the gatewayResponse value for this AmendResult.
     * 
     * @return gatewayResponse
     */
    public java.lang.String getGatewayResponse() {
        return gatewayResponse;
    }


    /**
     * Sets the gatewayResponse value for this AmendResult.
     * 
     * @param gatewayResponse
     */
    public void setGatewayResponse(java.lang.String gatewayResponse) {
        this.gatewayResponse = gatewayResponse;
    }


    /**
     * Gets the gatewayResponseCode value for this AmendResult.
     * 
     * @return gatewayResponseCode
     */
    public java.lang.String getGatewayResponseCode() {
        return gatewayResponseCode;
    }


    /**
     * Sets the gatewayResponseCode value for this AmendResult.
     * 
     * @param gatewayResponseCode
     */
    public void setGatewayResponseCode(java.lang.String gatewayResponseCode) {
        this.gatewayResponseCode = gatewayResponseCode;
    }


    /**
     * Gets the invoiceDatas value for this AmendResult.
     * 
     * @return invoiceDatas
     */
    public com.zuora.api.InvoiceData[] getInvoiceDatas() {
        return invoiceDatas;
    }


    /**
     * Sets the invoiceDatas value for this AmendResult.
     * 
     * @param invoiceDatas
     */
    public void setInvoiceDatas(com.zuora.api.InvoiceData[] invoiceDatas) {
        this.invoiceDatas = invoiceDatas;
    }

    public com.zuora.api.InvoiceData getInvoiceDatas(int i) {
        return this.invoiceDatas[i];
    }

    public void setInvoiceDatas(int i, com.zuora.api.InvoiceData _value) {
        this.invoiceDatas[i] = _value;
    }


    /**
     * Gets the invoiceId value for this AmendResult.
     * 
     * @return invoiceId
     */
    public java.lang.String getInvoiceId() {
        return invoiceId;
    }


    /**
     * Sets the invoiceId value for this AmendResult.
     * 
     * @param invoiceId
     */
    public void setInvoiceId(java.lang.String invoiceId) {
        this.invoiceId = invoiceId;
    }


    /**
     * Gets the paymentId value for this AmendResult.
     * 
     * @return paymentId
     */
    public java.lang.String getPaymentId() {
        return paymentId;
    }


    /**
     * Sets the paymentId value for this AmendResult.
     * 
     * @param paymentId
     */
    public void setPaymentId(java.lang.String paymentId) {
        this.paymentId = paymentId;
    }


    /**
     * Gets the paymentTransactionNumber value for this AmendResult.
     * 
     * @return paymentTransactionNumber
     */
    public java.lang.String getPaymentTransactionNumber() {
        return paymentTransactionNumber;
    }


    /**
     * Sets the paymentTransactionNumber value for this AmendResult.
     * 
     * @param paymentTransactionNumber
     */
    public void setPaymentTransactionNumber(java.lang.String paymentTransactionNumber) {
        this.paymentTransactionNumber = paymentTransactionNumber;
    }


    /**
     * Gets the subscriptionId value for this AmendResult.
     * 
     * @return subscriptionId
     */
    public java.lang.String getSubscriptionId() {
        return subscriptionId;
    }


    /**
     * Sets the subscriptionId value for this AmendResult.
     * 
     * @param subscriptionId
     */
    public void setSubscriptionId(java.lang.String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }


    /**
     * Gets the success value for this AmendResult.
     * 
     * @return success
     */
    public java.lang.Boolean getSuccess() {
        return success;
    }


    /**
     * Sets the success value for this AmendResult.
     * 
     * @param success
     */
    public void setSuccess(java.lang.Boolean success) {
        this.success = success;
    }


    /**
     * Gets the totalDeltaMrr value for this AmendResult.
     * 
     * @return totalDeltaMrr
     */
    public java.math.BigDecimal getTotalDeltaMrr() {
        return totalDeltaMrr;
    }


    /**
     * Sets the totalDeltaMrr value for this AmendResult.
     * 
     * @param totalDeltaMrr
     */
    public void setTotalDeltaMrr(java.math.BigDecimal totalDeltaMrr) {
        this.totalDeltaMrr = totalDeltaMrr;
    }


    /**
     * Gets the totalDeltaTcv value for this AmendResult.
     * 
     * @return totalDeltaTcv
     */
    public java.math.BigDecimal getTotalDeltaTcv() {
        return totalDeltaTcv;
    }


    /**
     * Sets the totalDeltaTcv value for this AmendResult.
     * 
     * @param totalDeltaTcv
     */
    public void setTotalDeltaTcv(java.math.BigDecimal totalDeltaTcv) {
        this.totalDeltaTcv = totalDeltaTcv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AmendResult)) return false;
        AmendResult other = (AmendResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amendmentIds==null && other.getAmendmentIds()==null) || 
             (this.amendmentIds!=null &&
              java.util.Arrays.equals(this.amendmentIds, other.getAmendmentIds()))) &&
            ((this.chargeMetricsData==null && other.getChargeMetricsData()==null) || 
             (this.chargeMetricsData!=null &&
              java.util.Arrays.equals(this.chargeMetricsData, other.getChargeMetricsData()))) &&
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              java.util.Arrays.equals(this.errors, other.getErrors()))) &&
            ((this.gatewayResponse==null && other.getGatewayResponse()==null) || 
             (this.gatewayResponse!=null &&
              this.gatewayResponse.equals(other.getGatewayResponse()))) &&
            ((this.gatewayResponseCode==null && other.getGatewayResponseCode()==null) || 
             (this.gatewayResponseCode!=null &&
              this.gatewayResponseCode.equals(other.getGatewayResponseCode()))) &&
            ((this.invoiceDatas==null && other.getInvoiceDatas()==null) || 
             (this.invoiceDatas!=null &&
              java.util.Arrays.equals(this.invoiceDatas, other.getInvoiceDatas()))) &&
            ((this.invoiceId==null && other.getInvoiceId()==null) || 
             (this.invoiceId!=null &&
              this.invoiceId.equals(other.getInvoiceId()))) &&
            ((this.paymentId==null && other.getPaymentId()==null) || 
             (this.paymentId!=null &&
              this.paymentId.equals(other.getPaymentId()))) &&
            ((this.paymentTransactionNumber==null && other.getPaymentTransactionNumber()==null) || 
             (this.paymentTransactionNumber!=null &&
              this.paymentTransactionNumber.equals(other.getPaymentTransactionNumber()))) &&
            ((this.subscriptionId==null && other.getSubscriptionId()==null) || 
             (this.subscriptionId!=null &&
              this.subscriptionId.equals(other.getSubscriptionId()))) &&
            ((this.success==null && other.getSuccess()==null) || 
             (this.success!=null &&
              this.success.equals(other.getSuccess()))) &&
            ((this.totalDeltaMrr==null && other.getTotalDeltaMrr()==null) || 
             (this.totalDeltaMrr!=null &&
              this.totalDeltaMrr.equals(other.getTotalDeltaMrr()))) &&
            ((this.totalDeltaTcv==null && other.getTotalDeltaTcv()==null) || 
             (this.totalDeltaTcv!=null &&
              this.totalDeltaTcv.equals(other.getTotalDeltaTcv())));
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
        if (getAmendmentIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAmendmentIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAmendmentIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChargeMetricsData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChargeMetricsData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChargeMetricsData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGatewayResponse() != null) {
            _hashCode += getGatewayResponse().hashCode();
        }
        if (getGatewayResponseCode() != null) {
            _hashCode += getGatewayResponseCode().hashCode();
        }
        if (getInvoiceDatas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInvoiceDatas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInvoiceDatas(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInvoiceId() != null) {
            _hashCode += getInvoiceId().hashCode();
        }
        if (getPaymentId() != null) {
            _hashCode += getPaymentId().hashCode();
        }
        if (getPaymentTransactionNumber() != null) {
            _hashCode += getPaymentTransactionNumber().hashCode();
        }
        if (getSubscriptionId() != null) {
            _hashCode += getSubscriptionId().hashCode();
        }
        if (getSuccess() != null) {
            _hashCode += getSuccess().hashCode();
        }
        if (getTotalDeltaMrr() != null) {
            _hashCode += getTotalDeltaMrr().hashCode();
        }
        if (getTotalDeltaTcv() != null) {
            _hashCode += getTotalDeltaTcv().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AmendResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.zuora.com/", "AmendResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amendmentIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "AmendmentIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.zuora.com/", "ID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeMetricsData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "ChargeMetricsData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.zuora.com/", "NewChargeMetrics"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.zuora.com/", "ChargeMetrics"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "Errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.zuora.com/", "Error"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "GatewayResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayResponseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "GatewayResponseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceDatas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "InvoiceDatas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.zuora.com/", "InvoiceData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "InvoiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "PaymentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentTransactionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "PaymentTransactionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "SubscriptionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("success");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "Success"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalDeltaMrr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "TotalDeltaMrr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalDeltaTcv");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "TotalDeltaTcv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
