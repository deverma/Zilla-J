/**
 * NewChargeMetrics.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zuora.api;

public class NewChargeMetrics  implements java.io.Serializable {
    private java.lang.String chargeNumber;

    private java.math.BigDecimal DMRR;

    private java.math.BigDecimal DTCV;

    private java.math.BigDecimal MRR;

    private java.lang.String originalId;

    private java.lang.String originalRatePlanId;

    private java.lang.String productRatePlanChargeId;

    private java.lang.String productRatePlanId;

    private java.math.BigDecimal TCV;

    public NewChargeMetrics() {
    }

    public NewChargeMetrics(
           java.lang.String chargeNumber,
           java.math.BigDecimal DMRR,
           java.math.BigDecimal DTCV,
           java.math.BigDecimal MRR,
           java.lang.String originalId,
           java.lang.String originalRatePlanId,
           java.lang.String productRatePlanChargeId,
           java.lang.String productRatePlanId,
           java.math.BigDecimal TCV) {
           this.chargeNumber = chargeNumber;
           this.DMRR = DMRR;
           this.DTCV = DTCV;
           this.MRR = MRR;
           this.originalId = originalId;
           this.originalRatePlanId = originalRatePlanId;
           this.productRatePlanChargeId = productRatePlanChargeId;
           this.productRatePlanId = productRatePlanId;
           this.TCV = TCV;
    }


    /**
     * Gets the chargeNumber value for this NewChargeMetrics.
     * 
     * @return chargeNumber
     */
    public java.lang.String getChargeNumber() {
        return chargeNumber;
    }


    /**
     * Sets the chargeNumber value for this NewChargeMetrics.
     * 
     * @param chargeNumber
     */
    public void setChargeNumber(java.lang.String chargeNumber) {
        this.chargeNumber = chargeNumber;
    }


    /**
     * Gets the DMRR value for this NewChargeMetrics.
     * 
     * @return DMRR
     */
    public java.math.BigDecimal getDMRR() {
        return DMRR;
    }


    /**
     * Sets the DMRR value for this NewChargeMetrics.
     * 
     * @param DMRR
     */
    public void setDMRR(java.math.BigDecimal DMRR) {
        this.DMRR = DMRR;
    }


    /**
     * Gets the DTCV value for this NewChargeMetrics.
     * 
     * @return DTCV
     */
    public java.math.BigDecimal getDTCV() {
        return DTCV;
    }


    /**
     * Sets the DTCV value for this NewChargeMetrics.
     * 
     * @param DTCV
     */
    public void setDTCV(java.math.BigDecimal DTCV) {
        this.DTCV = DTCV;
    }


    /**
     * Gets the MRR value for this NewChargeMetrics.
     * 
     * @return MRR
     */
    public java.math.BigDecimal getMRR() {
        return MRR;
    }


    /**
     * Sets the MRR value for this NewChargeMetrics.
     * 
     * @param MRR
     */
    public void setMRR(java.math.BigDecimal MRR) {
        this.MRR = MRR;
    }


    /**
     * Gets the originalId value for this NewChargeMetrics.
     * 
     * @return originalId
     */
    public java.lang.String getOriginalId() {
        return originalId;
    }


    /**
     * Sets the originalId value for this NewChargeMetrics.
     * 
     * @param originalId
     */
    public void setOriginalId(java.lang.String originalId) {
        this.originalId = originalId;
    }


    /**
     * Gets the originalRatePlanId value for this NewChargeMetrics.
     * 
     * @return originalRatePlanId
     */
    public java.lang.String getOriginalRatePlanId() {
        return originalRatePlanId;
    }


    /**
     * Sets the originalRatePlanId value for this NewChargeMetrics.
     * 
     * @param originalRatePlanId
     */
    public void setOriginalRatePlanId(java.lang.String originalRatePlanId) {
        this.originalRatePlanId = originalRatePlanId;
    }


    /**
     * Gets the productRatePlanChargeId value for this NewChargeMetrics.
     * 
     * @return productRatePlanChargeId
     */
    public java.lang.String getProductRatePlanChargeId() {
        return productRatePlanChargeId;
    }


    /**
     * Sets the productRatePlanChargeId value for this NewChargeMetrics.
     * 
     * @param productRatePlanChargeId
     */
    public void setProductRatePlanChargeId(java.lang.String productRatePlanChargeId) {
        this.productRatePlanChargeId = productRatePlanChargeId;
    }


    /**
     * Gets the productRatePlanId value for this NewChargeMetrics.
     * 
     * @return productRatePlanId
     */
    public java.lang.String getProductRatePlanId() {
        return productRatePlanId;
    }


    /**
     * Sets the productRatePlanId value for this NewChargeMetrics.
     * 
     * @param productRatePlanId
     */
    public void setProductRatePlanId(java.lang.String productRatePlanId) {
        this.productRatePlanId = productRatePlanId;
    }


    /**
     * Gets the TCV value for this NewChargeMetrics.
     * 
     * @return TCV
     */
    public java.math.BigDecimal getTCV() {
        return TCV;
    }


    /**
     * Sets the TCV value for this NewChargeMetrics.
     * 
     * @param TCV
     */
    public void setTCV(java.math.BigDecimal TCV) {
        this.TCV = TCV;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NewChargeMetrics)) return false;
        NewChargeMetrics other = (NewChargeMetrics) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chargeNumber==null && other.getChargeNumber()==null) || 
             (this.chargeNumber!=null &&
              this.chargeNumber.equals(other.getChargeNumber()))) &&
            ((this.DMRR==null && other.getDMRR()==null) || 
             (this.DMRR!=null &&
              this.DMRR.equals(other.getDMRR()))) &&
            ((this.DTCV==null && other.getDTCV()==null) || 
             (this.DTCV!=null &&
              this.DTCV.equals(other.getDTCV()))) &&
            ((this.MRR==null && other.getMRR()==null) || 
             (this.MRR!=null &&
              this.MRR.equals(other.getMRR()))) &&
            ((this.originalId==null && other.getOriginalId()==null) || 
             (this.originalId!=null &&
              this.originalId.equals(other.getOriginalId()))) &&
            ((this.originalRatePlanId==null && other.getOriginalRatePlanId()==null) || 
             (this.originalRatePlanId!=null &&
              this.originalRatePlanId.equals(other.getOriginalRatePlanId()))) &&
            ((this.productRatePlanChargeId==null && other.getProductRatePlanChargeId()==null) || 
             (this.productRatePlanChargeId!=null &&
              this.productRatePlanChargeId.equals(other.getProductRatePlanChargeId()))) &&
            ((this.productRatePlanId==null && other.getProductRatePlanId()==null) || 
             (this.productRatePlanId!=null &&
              this.productRatePlanId.equals(other.getProductRatePlanId()))) &&
            ((this.TCV==null && other.getTCV()==null) || 
             (this.TCV!=null &&
              this.TCV.equals(other.getTCV())));
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
        if (getChargeNumber() != null) {
            _hashCode += getChargeNumber().hashCode();
        }
        if (getDMRR() != null) {
            _hashCode += getDMRR().hashCode();
        }
        if (getDTCV() != null) {
            _hashCode += getDTCV().hashCode();
        }
        if (getMRR() != null) {
            _hashCode += getMRR().hashCode();
        }
        if (getOriginalId() != null) {
            _hashCode += getOriginalId().hashCode();
        }
        if (getOriginalRatePlanId() != null) {
            _hashCode += getOriginalRatePlanId().hashCode();
        }
        if (getProductRatePlanChargeId() != null) {
            _hashCode += getProductRatePlanChargeId().hashCode();
        }
        if (getProductRatePlanId() != null) {
            _hashCode += getProductRatePlanId().hashCode();
        }
        if (getTCV() != null) {
            _hashCode += getTCV().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NewChargeMetrics.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.zuora.com/", "NewChargeMetrics"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "ChargeNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DMRR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "DMRR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DTCV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "DTCV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MRR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "MRR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "OriginalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalRatePlanId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "OriginalRatePlanId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productRatePlanChargeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "ProductRatePlanChargeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productRatePlanId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "ProductRatePlanId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "TCV"));
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
