/**
 * ServiceFieldDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class ServiceFieldDataType  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.sobject.DataType dataType;

    private java.lang.String dataTypeId;

    private java.lang.String durableId;

    private com.sforce.soap.enterprise.sobject.FieldDefinition fieldDefinition;

    private java.lang.String fieldDefinitionId;

    private java.lang.String serviceId;

    public ServiceFieldDataType() {
    }

    public ServiceFieldDataType(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.sobject.DataType dataType,
           java.lang.String dataTypeId,
           java.lang.String durableId,
           com.sforce.soap.enterprise.sobject.FieldDefinition fieldDefinition,
           java.lang.String fieldDefinitionId,
           java.lang.String serviceId) {
        super(
            fieldsToNull,
            id);
        this.dataType = dataType;
        this.dataTypeId = dataTypeId;
        this.durableId = durableId;
        this.fieldDefinition = fieldDefinition;
        this.fieldDefinitionId = fieldDefinitionId;
        this.serviceId = serviceId;
    }


    /**
     * Gets the dataType value for this ServiceFieldDataType.
     * 
     * @return dataType
     */
    public com.sforce.soap.enterprise.sobject.DataType getDataType() {
        return dataType;
    }


    /**
     * Sets the dataType value for this ServiceFieldDataType.
     * 
     * @param dataType
     */
    public void setDataType(com.sforce.soap.enterprise.sobject.DataType dataType) {
        this.dataType = dataType;
    }


    /**
     * Gets the dataTypeId value for this ServiceFieldDataType.
     * 
     * @return dataTypeId
     */
    public java.lang.String getDataTypeId() {
        return dataTypeId;
    }


    /**
     * Sets the dataTypeId value for this ServiceFieldDataType.
     * 
     * @param dataTypeId
     */
    public void setDataTypeId(java.lang.String dataTypeId) {
        this.dataTypeId = dataTypeId;
    }


    /**
     * Gets the durableId value for this ServiceFieldDataType.
     * 
     * @return durableId
     */
    public java.lang.String getDurableId() {
        return durableId;
    }


    /**
     * Sets the durableId value for this ServiceFieldDataType.
     * 
     * @param durableId
     */
    public void setDurableId(java.lang.String durableId) {
        this.durableId = durableId;
    }


    /**
     * Gets the fieldDefinition value for this ServiceFieldDataType.
     * 
     * @return fieldDefinition
     */
    public com.sforce.soap.enterprise.sobject.FieldDefinition getFieldDefinition() {
        return fieldDefinition;
    }


    /**
     * Sets the fieldDefinition value for this ServiceFieldDataType.
     * 
     * @param fieldDefinition
     */
    public void setFieldDefinition(com.sforce.soap.enterprise.sobject.FieldDefinition fieldDefinition) {
        this.fieldDefinition = fieldDefinition;
    }


    /**
     * Gets the fieldDefinitionId value for this ServiceFieldDataType.
     * 
     * @return fieldDefinitionId
     */
    public java.lang.String getFieldDefinitionId() {
        return fieldDefinitionId;
    }


    /**
     * Sets the fieldDefinitionId value for this ServiceFieldDataType.
     * 
     * @param fieldDefinitionId
     */
    public void setFieldDefinitionId(java.lang.String fieldDefinitionId) {
        this.fieldDefinitionId = fieldDefinitionId;
    }


    /**
     * Gets the serviceId value for this ServiceFieldDataType.
     * 
     * @return serviceId
     */
    public java.lang.String getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this ServiceFieldDataType.
     * 
     * @param serviceId
     */
    public void setServiceId(java.lang.String serviceId) {
        this.serviceId = serviceId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceFieldDataType)) return false;
        ServiceFieldDataType other = (ServiceFieldDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dataType==null && other.getDataType()==null) || 
             (this.dataType!=null &&
              this.dataType.equals(other.getDataType()))) &&
            ((this.dataTypeId==null && other.getDataTypeId()==null) || 
             (this.dataTypeId!=null &&
              this.dataTypeId.equals(other.getDataTypeId()))) &&
            ((this.durableId==null && other.getDurableId()==null) || 
             (this.durableId!=null &&
              this.durableId.equals(other.getDurableId()))) &&
            ((this.fieldDefinition==null && other.getFieldDefinition()==null) || 
             (this.fieldDefinition!=null &&
              this.fieldDefinition.equals(other.getFieldDefinition()))) &&
            ((this.fieldDefinitionId==null && other.getFieldDefinitionId()==null) || 
             (this.fieldDefinitionId!=null &&
              this.fieldDefinitionId.equals(other.getFieldDefinitionId()))) &&
            ((this.serviceId==null && other.getServiceId()==null) || 
             (this.serviceId!=null &&
              this.serviceId.equals(other.getServiceId())));
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
        if (getDataType() != null) {
            _hashCode += getDataType().hashCode();
        }
        if (getDataTypeId() != null) {
            _hashCode += getDataTypeId().hashCode();
        }
        if (getDurableId() != null) {
            _hashCode += getDurableId().hashCode();
        }
        if (getFieldDefinition() != null) {
            _hashCode += getFieldDefinition().hashCode();
        }
        if (getFieldDefinitionId() != null) {
            _hashCode += getFieldDefinitionId().hashCode();
        }
        if (getServiceId() != null) {
            _hashCode += getServiceId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceFieldDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ServiceFieldDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DataType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DataTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("durableId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DurableId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldDefinition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FieldDefinition"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FieldDefinition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldDefinitionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FieldDefinitionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ServiceId"));
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
