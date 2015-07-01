/**
 * EntityParticle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class EntityParticle  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String dataType;

    private java.lang.String developerName;

    private java.lang.String durableId;

    private com.sforce.soap.enterprise.sobject.EntityDefinition entityDefinition;

    private java.lang.String entityDefinitionId;

    private java.lang.String extraTypeInfo;

    private com.sforce.soap.enterprise.sobject.FieldDefinition fieldDefinition;

    private java.lang.String fieldDefinitionId;

    private java.lang.Boolean isApiFilterable;

    private java.lang.Boolean isApiGroupable;

    private java.lang.Boolean isApiSortable;

    private java.lang.Boolean isCalculated;

    private java.lang.Boolean isCompactLayoutable;

    private java.lang.Boolean isFieldHistoryTracked;

    private java.lang.Boolean isHighScaleNumber;

    private java.lang.Boolean isHtmlFormatted;

    private java.lang.Boolean isListVisible;

    private java.lang.Boolean isNameField;

    private java.lang.Boolean isNillable;

    private java.lang.Boolean isWorkflowFilterable;

    private java.lang.String label;

    private java.lang.Integer length;

    private java.lang.String masterLabel;

    private java.lang.String namespacePrefix;

    private java.lang.Integer precision;

    private java.lang.String qualifiedApiName;

    private java.lang.Integer scale;

    private com.sforce.soap.enterprise.sobject.DataType serviceDataType;

    private java.lang.String serviceDataTypeId;

    public EntityParticle() {
    }

    public EntityParticle(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String dataType,
           java.lang.String developerName,
           java.lang.String durableId,
           com.sforce.soap.enterprise.sobject.EntityDefinition entityDefinition,
           java.lang.String entityDefinitionId,
           java.lang.String extraTypeInfo,
           com.sforce.soap.enterprise.sobject.FieldDefinition fieldDefinition,
           java.lang.String fieldDefinitionId,
           java.lang.Boolean isApiFilterable,
           java.lang.Boolean isApiGroupable,
           java.lang.Boolean isApiSortable,
           java.lang.Boolean isCalculated,
           java.lang.Boolean isCompactLayoutable,
           java.lang.Boolean isFieldHistoryTracked,
           java.lang.Boolean isHighScaleNumber,
           java.lang.Boolean isHtmlFormatted,
           java.lang.Boolean isListVisible,
           java.lang.Boolean isNameField,
           java.lang.Boolean isNillable,
           java.lang.Boolean isWorkflowFilterable,
           java.lang.String label,
           java.lang.Integer length,
           java.lang.String masterLabel,
           java.lang.String namespacePrefix,
           java.lang.Integer precision,
           java.lang.String qualifiedApiName,
           java.lang.Integer scale,
           com.sforce.soap.enterprise.sobject.DataType serviceDataType,
           java.lang.String serviceDataTypeId) {
        super(
            fieldsToNull,
            id);
        this.dataType = dataType;
        this.developerName = developerName;
        this.durableId = durableId;
        this.entityDefinition = entityDefinition;
        this.entityDefinitionId = entityDefinitionId;
        this.extraTypeInfo = extraTypeInfo;
        this.fieldDefinition = fieldDefinition;
        this.fieldDefinitionId = fieldDefinitionId;
        this.isApiFilterable = isApiFilterable;
        this.isApiGroupable = isApiGroupable;
        this.isApiSortable = isApiSortable;
        this.isCalculated = isCalculated;
        this.isCompactLayoutable = isCompactLayoutable;
        this.isFieldHistoryTracked = isFieldHistoryTracked;
        this.isHighScaleNumber = isHighScaleNumber;
        this.isHtmlFormatted = isHtmlFormatted;
        this.isListVisible = isListVisible;
        this.isNameField = isNameField;
        this.isNillable = isNillable;
        this.isWorkflowFilterable = isWorkflowFilterable;
        this.label = label;
        this.length = length;
        this.masterLabel = masterLabel;
        this.namespacePrefix = namespacePrefix;
        this.precision = precision;
        this.qualifiedApiName = qualifiedApiName;
        this.scale = scale;
        this.serviceDataType = serviceDataType;
        this.serviceDataTypeId = serviceDataTypeId;
    }


    /**
     * Gets the dataType value for this EntityParticle.
     * 
     * @return dataType
     */
    public java.lang.String getDataType() {
        return dataType;
    }


    /**
     * Sets the dataType value for this EntityParticle.
     * 
     * @param dataType
     */
    public void setDataType(java.lang.String dataType) {
        this.dataType = dataType;
    }


    /**
     * Gets the developerName value for this EntityParticle.
     * 
     * @return developerName
     */
    public java.lang.String getDeveloperName() {
        return developerName;
    }


    /**
     * Sets the developerName value for this EntityParticle.
     * 
     * @param developerName
     */
    public void setDeveloperName(java.lang.String developerName) {
        this.developerName = developerName;
    }


    /**
     * Gets the durableId value for this EntityParticle.
     * 
     * @return durableId
     */
    public java.lang.String getDurableId() {
        return durableId;
    }


    /**
     * Sets the durableId value for this EntityParticle.
     * 
     * @param durableId
     */
    public void setDurableId(java.lang.String durableId) {
        this.durableId = durableId;
    }


    /**
     * Gets the entityDefinition value for this EntityParticle.
     * 
     * @return entityDefinition
     */
    public com.sforce.soap.enterprise.sobject.EntityDefinition getEntityDefinition() {
        return entityDefinition;
    }


    /**
     * Sets the entityDefinition value for this EntityParticle.
     * 
     * @param entityDefinition
     */
    public void setEntityDefinition(com.sforce.soap.enterprise.sobject.EntityDefinition entityDefinition) {
        this.entityDefinition = entityDefinition;
    }


    /**
     * Gets the entityDefinitionId value for this EntityParticle.
     * 
     * @return entityDefinitionId
     */
    public java.lang.String getEntityDefinitionId() {
        return entityDefinitionId;
    }


    /**
     * Sets the entityDefinitionId value for this EntityParticle.
     * 
     * @param entityDefinitionId
     */
    public void setEntityDefinitionId(java.lang.String entityDefinitionId) {
        this.entityDefinitionId = entityDefinitionId;
    }


    /**
     * Gets the extraTypeInfo value for this EntityParticle.
     * 
     * @return extraTypeInfo
     */
    public java.lang.String getExtraTypeInfo() {
        return extraTypeInfo;
    }


    /**
     * Sets the extraTypeInfo value for this EntityParticle.
     * 
     * @param extraTypeInfo
     */
    public void setExtraTypeInfo(java.lang.String extraTypeInfo) {
        this.extraTypeInfo = extraTypeInfo;
    }


    /**
     * Gets the fieldDefinition value for this EntityParticle.
     * 
     * @return fieldDefinition
     */
    public com.sforce.soap.enterprise.sobject.FieldDefinition getFieldDefinition() {
        return fieldDefinition;
    }


    /**
     * Sets the fieldDefinition value for this EntityParticle.
     * 
     * @param fieldDefinition
     */
    public void setFieldDefinition(com.sforce.soap.enterprise.sobject.FieldDefinition fieldDefinition) {
        this.fieldDefinition = fieldDefinition;
    }


    /**
     * Gets the fieldDefinitionId value for this EntityParticle.
     * 
     * @return fieldDefinitionId
     */
    public java.lang.String getFieldDefinitionId() {
        return fieldDefinitionId;
    }


    /**
     * Sets the fieldDefinitionId value for this EntityParticle.
     * 
     * @param fieldDefinitionId
     */
    public void setFieldDefinitionId(java.lang.String fieldDefinitionId) {
        this.fieldDefinitionId = fieldDefinitionId;
    }


    /**
     * Gets the isApiFilterable value for this EntityParticle.
     * 
     * @return isApiFilterable
     */
    public java.lang.Boolean getIsApiFilterable() {
        return isApiFilterable;
    }


    /**
     * Sets the isApiFilterable value for this EntityParticle.
     * 
     * @param isApiFilterable
     */
    public void setIsApiFilterable(java.lang.Boolean isApiFilterable) {
        this.isApiFilterable = isApiFilterable;
    }


    /**
     * Gets the isApiGroupable value for this EntityParticle.
     * 
     * @return isApiGroupable
     */
    public java.lang.Boolean getIsApiGroupable() {
        return isApiGroupable;
    }


    /**
     * Sets the isApiGroupable value for this EntityParticle.
     * 
     * @param isApiGroupable
     */
    public void setIsApiGroupable(java.lang.Boolean isApiGroupable) {
        this.isApiGroupable = isApiGroupable;
    }


    /**
     * Gets the isApiSortable value for this EntityParticle.
     * 
     * @return isApiSortable
     */
    public java.lang.Boolean getIsApiSortable() {
        return isApiSortable;
    }


    /**
     * Sets the isApiSortable value for this EntityParticle.
     * 
     * @param isApiSortable
     */
    public void setIsApiSortable(java.lang.Boolean isApiSortable) {
        this.isApiSortable = isApiSortable;
    }


    /**
     * Gets the isCalculated value for this EntityParticle.
     * 
     * @return isCalculated
     */
    public java.lang.Boolean getIsCalculated() {
        return isCalculated;
    }


    /**
     * Sets the isCalculated value for this EntityParticle.
     * 
     * @param isCalculated
     */
    public void setIsCalculated(java.lang.Boolean isCalculated) {
        this.isCalculated = isCalculated;
    }


    /**
     * Gets the isCompactLayoutable value for this EntityParticle.
     * 
     * @return isCompactLayoutable
     */
    public java.lang.Boolean getIsCompactLayoutable() {
        return isCompactLayoutable;
    }


    /**
     * Sets the isCompactLayoutable value for this EntityParticle.
     * 
     * @param isCompactLayoutable
     */
    public void setIsCompactLayoutable(java.lang.Boolean isCompactLayoutable) {
        this.isCompactLayoutable = isCompactLayoutable;
    }


    /**
     * Gets the isFieldHistoryTracked value for this EntityParticle.
     * 
     * @return isFieldHistoryTracked
     */
    public java.lang.Boolean getIsFieldHistoryTracked() {
        return isFieldHistoryTracked;
    }


    /**
     * Sets the isFieldHistoryTracked value for this EntityParticle.
     * 
     * @param isFieldHistoryTracked
     */
    public void setIsFieldHistoryTracked(java.lang.Boolean isFieldHistoryTracked) {
        this.isFieldHistoryTracked = isFieldHistoryTracked;
    }


    /**
     * Gets the isHighScaleNumber value for this EntityParticle.
     * 
     * @return isHighScaleNumber
     */
    public java.lang.Boolean getIsHighScaleNumber() {
        return isHighScaleNumber;
    }


    /**
     * Sets the isHighScaleNumber value for this EntityParticle.
     * 
     * @param isHighScaleNumber
     */
    public void setIsHighScaleNumber(java.lang.Boolean isHighScaleNumber) {
        this.isHighScaleNumber = isHighScaleNumber;
    }


    /**
     * Gets the isHtmlFormatted value for this EntityParticle.
     * 
     * @return isHtmlFormatted
     */
    public java.lang.Boolean getIsHtmlFormatted() {
        return isHtmlFormatted;
    }


    /**
     * Sets the isHtmlFormatted value for this EntityParticle.
     * 
     * @param isHtmlFormatted
     */
    public void setIsHtmlFormatted(java.lang.Boolean isHtmlFormatted) {
        this.isHtmlFormatted = isHtmlFormatted;
    }


    /**
     * Gets the isListVisible value for this EntityParticle.
     * 
     * @return isListVisible
     */
    public java.lang.Boolean getIsListVisible() {
        return isListVisible;
    }


    /**
     * Sets the isListVisible value for this EntityParticle.
     * 
     * @param isListVisible
     */
    public void setIsListVisible(java.lang.Boolean isListVisible) {
        this.isListVisible = isListVisible;
    }


    /**
     * Gets the isNameField value for this EntityParticle.
     * 
     * @return isNameField
     */
    public java.lang.Boolean getIsNameField() {
        return isNameField;
    }


    /**
     * Sets the isNameField value for this EntityParticle.
     * 
     * @param isNameField
     */
    public void setIsNameField(java.lang.Boolean isNameField) {
        this.isNameField = isNameField;
    }


    /**
     * Gets the isNillable value for this EntityParticle.
     * 
     * @return isNillable
     */
    public java.lang.Boolean getIsNillable() {
        return isNillable;
    }


    /**
     * Sets the isNillable value for this EntityParticle.
     * 
     * @param isNillable
     */
    public void setIsNillable(java.lang.Boolean isNillable) {
        this.isNillable = isNillable;
    }


    /**
     * Gets the isWorkflowFilterable value for this EntityParticle.
     * 
     * @return isWorkflowFilterable
     */
    public java.lang.Boolean getIsWorkflowFilterable() {
        return isWorkflowFilterable;
    }


    /**
     * Sets the isWorkflowFilterable value for this EntityParticle.
     * 
     * @param isWorkflowFilterable
     */
    public void setIsWorkflowFilterable(java.lang.Boolean isWorkflowFilterable) {
        this.isWorkflowFilterable = isWorkflowFilterable;
    }


    /**
     * Gets the label value for this EntityParticle.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this EntityParticle.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the length value for this EntityParticle.
     * 
     * @return length
     */
    public java.lang.Integer getLength() {
        return length;
    }


    /**
     * Sets the length value for this EntityParticle.
     * 
     * @param length
     */
    public void setLength(java.lang.Integer length) {
        this.length = length;
    }


    /**
     * Gets the masterLabel value for this EntityParticle.
     * 
     * @return masterLabel
     */
    public java.lang.String getMasterLabel() {
        return masterLabel;
    }


    /**
     * Sets the masterLabel value for this EntityParticle.
     * 
     * @param masterLabel
     */
    public void setMasterLabel(java.lang.String masterLabel) {
        this.masterLabel = masterLabel;
    }


    /**
     * Gets the namespacePrefix value for this EntityParticle.
     * 
     * @return namespacePrefix
     */
    public java.lang.String getNamespacePrefix() {
        return namespacePrefix;
    }


    /**
     * Sets the namespacePrefix value for this EntityParticle.
     * 
     * @param namespacePrefix
     */
    public void setNamespacePrefix(java.lang.String namespacePrefix) {
        this.namespacePrefix = namespacePrefix;
    }


    /**
     * Gets the precision value for this EntityParticle.
     * 
     * @return precision
     */
    public java.lang.Integer getPrecision() {
        return precision;
    }


    /**
     * Sets the precision value for this EntityParticle.
     * 
     * @param precision
     */
    public void setPrecision(java.lang.Integer precision) {
        this.precision = precision;
    }


    /**
     * Gets the qualifiedApiName value for this EntityParticle.
     * 
     * @return qualifiedApiName
     */
    public java.lang.String getQualifiedApiName() {
        return qualifiedApiName;
    }


    /**
     * Sets the qualifiedApiName value for this EntityParticle.
     * 
     * @param qualifiedApiName
     */
    public void setQualifiedApiName(java.lang.String qualifiedApiName) {
        this.qualifiedApiName = qualifiedApiName;
    }


    /**
     * Gets the scale value for this EntityParticle.
     * 
     * @return scale
     */
    public java.lang.Integer getScale() {
        return scale;
    }


    /**
     * Sets the scale value for this EntityParticle.
     * 
     * @param scale
     */
    public void setScale(java.lang.Integer scale) {
        this.scale = scale;
    }


    /**
     * Gets the serviceDataType value for this EntityParticle.
     * 
     * @return serviceDataType
     */
    public com.sforce.soap.enterprise.sobject.DataType getServiceDataType() {
        return serviceDataType;
    }


    /**
     * Sets the serviceDataType value for this EntityParticle.
     * 
     * @param serviceDataType
     */
    public void setServiceDataType(com.sforce.soap.enterprise.sobject.DataType serviceDataType) {
        this.serviceDataType = serviceDataType;
    }


    /**
     * Gets the serviceDataTypeId value for this EntityParticle.
     * 
     * @return serviceDataTypeId
     */
    public java.lang.String getServiceDataTypeId() {
        return serviceDataTypeId;
    }


    /**
     * Sets the serviceDataTypeId value for this EntityParticle.
     * 
     * @param serviceDataTypeId
     */
    public void setServiceDataTypeId(java.lang.String serviceDataTypeId) {
        this.serviceDataTypeId = serviceDataTypeId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntityParticle)) return false;
        EntityParticle other = (EntityParticle) obj;
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
            ((this.developerName==null && other.getDeveloperName()==null) || 
             (this.developerName!=null &&
              this.developerName.equals(other.getDeveloperName()))) &&
            ((this.durableId==null && other.getDurableId()==null) || 
             (this.durableId!=null &&
              this.durableId.equals(other.getDurableId()))) &&
            ((this.entityDefinition==null && other.getEntityDefinition()==null) || 
             (this.entityDefinition!=null &&
              this.entityDefinition.equals(other.getEntityDefinition()))) &&
            ((this.entityDefinitionId==null && other.getEntityDefinitionId()==null) || 
             (this.entityDefinitionId!=null &&
              this.entityDefinitionId.equals(other.getEntityDefinitionId()))) &&
            ((this.extraTypeInfo==null && other.getExtraTypeInfo()==null) || 
             (this.extraTypeInfo!=null &&
              this.extraTypeInfo.equals(other.getExtraTypeInfo()))) &&
            ((this.fieldDefinition==null && other.getFieldDefinition()==null) || 
             (this.fieldDefinition!=null &&
              this.fieldDefinition.equals(other.getFieldDefinition()))) &&
            ((this.fieldDefinitionId==null && other.getFieldDefinitionId()==null) || 
             (this.fieldDefinitionId!=null &&
              this.fieldDefinitionId.equals(other.getFieldDefinitionId()))) &&
            ((this.isApiFilterable==null && other.getIsApiFilterable()==null) || 
             (this.isApiFilterable!=null &&
              this.isApiFilterable.equals(other.getIsApiFilterable()))) &&
            ((this.isApiGroupable==null && other.getIsApiGroupable()==null) || 
             (this.isApiGroupable!=null &&
              this.isApiGroupable.equals(other.getIsApiGroupable()))) &&
            ((this.isApiSortable==null && other.getIsApiSortable()==null) || 
             (this.isApiSortable!=null &&
              this.isApiSortable.equals(other.getIsApiSortable()))) &&
            ((this.isCalculated==null && other.getIsCalculated()==null) || 
             (this.isCalculated!=null &&
              this.isCalculated.equals(other.getIsCalculated()))) &&
            ((this.isCompactLayoutable==null && other.getIsCompactLayoutable()==null) || 
             (this.isCompactLayoutable!=null &&
              this.isCompactLayoutable.equals(other.getIsCompactLayoutable()))) &&
            ((this.isFieldHistoryTracked==null && other.getIsFieldHistoryTracked()==null) || 
             (this.isFieldHistoryTracked!=null &&
              this.isFieldHistoryTracked.equals(other.getIsFieldHistoryTracked()))) &&
            ((this.isHighScaleNumber==null && other.getIsHighScaleNumber()==null) || 
             (this.isHighScaleNumber!=null &&
              this.isHighScaleNumber.equals(other.getIsHighScaleNumber()))) &&
            ((this.isHtmlFormatted==null && other.getIsHtmlFormatted()==null) || 
             (this.isHtmlFormatted!=null &&
              this.isHtmlFormatted.equals(other.getIsHtmlFormatted()))) &&
            ((this.isListVisible==null && other.getIsListVisible()==null) || 
             (this.isListVisible!=null &&
              this.isListVisible.equals(other.getIsListVisible()))) &&
            ((this.isNameField==null && other.getIsNameField()==null) || 
             (this.isNameField!=null &&
              this.isNameField.equals(other.getIsNameField()))) &&
            ((this.isNillable==null && other.getIsNillable()==null) || 
             (this.isNillable!=null &&
              this.isNillable.equals(other.getIsNillable()))) &&
            ((this.isWorkflowFilterable==null && other.getIsWorkflowFilterable()==null) || 
             (this.isWorkflowFilterable!=null &&
              this.isWorkflowFilterable.equals(other.getIsWorkflowFilterable()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.length==null && other.getLength()==null) || 
             (this.length!=null &&
              this.length.equals(other.getLength()))) &&
            ((this.masterLabel==null && other.getMasterLabel()==null) || 
             (this.masterLabel!=null &&
              this.masterLabel.equals(other.getMasterLabel()))) &&
            ((this.namespacePrefix==null && other.getNamespacePrefix()==null) || 
             (this.namespacePrefix!=null &&
              this.namespacePrefix.equals(other.getNamespacePrefix()))) &&
            ((this.precision==null && other.getPrecision()==null) || 
             (this.precision!=null &&
              this.precision.equals(other.getPrecision()))) &&
            ((this.qualifiedApiName==null && other.getQualifiedApiName()==null) || 
             (this.qualifiedApiName!=null &&
              this.qualifiedApiName.equals(other.getQualifiedApiName()))) &&
            ((this.scale==null && other.getScale()==null) || 
             (this.scale!=null &&
              this.scale.equals(other.getScale()))) &&
            ((this.serviceDataType==null && other.getServiceDataType()==null) || 
             (this.serviceDataType!=null &&
              this.serviceDataType.equals(other.getServiceDataType()))) &&
            ((this.serviceDataTypeId==null && other.getServiceDataTypeId()==null) || 
             (this.serviceDataTypeId!=null &&
              this.serviceDataTypeId.equals(other.getServiceDataTypeId())));
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
        if (getDeveloperName() != null) {
            _hashCode += getDeveloperName().hashCode();
        }
        if (getDurableId() != null) {
            _hashCode += getDurableId().hashCode();
        }
        if (getEntityDefinition() != null) {
            _hashCode += getEntityDefinition().hashCode();
        }
        if (getEntityDefinitionId() != null) {
            _hashCode += getEntityDefinitionId().hashCode();
        }
        if (getExtraTypeInfo() != null) {
            _hashCode += getExtraTypeInfo().hashCode();
        }
        if (getFieldDefinition() != null) {
            _hashCode += getFieldDefinition().hashCode();
        }
        if (getFieldDefinitionId() != null) {
            _hashCode += getFieldDefinitionId().hashCode();
        }
        if (getIsApiFilterable() != null) {
            _hashCode += getIsApiFilterable().hashCode();
        }
        if (getIsApiGroupable() != null) {
            _hashCode += getIsApiGroupable().hashCode();
        }
        if (getIsApiSortable() != null) {
            _hashCode += getIsApiSortable().hashCode();
        }
        if (getIsCalculated() != null) {
            _hashCode += getIsCalculated().hashCode();
        }
        if (getIsCompactLayoutable() != null) {
            _hashCode += getIsCompactLayoutable().hashCode();
        }
        if (getIsFieldHistoryTracked() != null) {
            _hashCode += getIsFieldHistoryTracked().hashCode();
        }
        if (getIsHighScaleNumber() != null) {
            _hashCode += getIsHighScaleNumber().hashCode();
        }
        if (getIsHtmlFormatted() != null) {
            _hashCode += getIsHtmlFormatted().hashCode();
        }
        if (getIsListVisible() != null) {
            _hashCode += getIsListVisible().hashCode();
        }
        if (getIsNameField() != null) {
            _hashCode += getIsNameField().hashCode();
        }
        if (getIsNillable() != null) {
            _hashCode += getIsNillable().hashCode();
        }
        if (getIsWorkflowFilterable() != null) {
            _hashCode += getIsWorkflowFilterable().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getLength() != null) {
            _hashCode += getLength().hashCode();
        }
        if (getMasterLabel() != null) {
            _hashCode += getMasterLabel().hashCode();
        }
        if (getNamespacePrefix() != null) {
            _hashCode += getNamespacePrefix().hashCode();
        }
        if (getPrecision() != null) {
            _hashCode += getPrecision().hashCode();
        }
        if (getQualifiedApiName() != null) {
            _hashCode += getQualifiedApiName().hashCode();
        }
        if (getScale() != null) {
            _hashCode += getScale().hashCode();
        }
        if (getServiceDataType() != null) {
            _hashCode += getServiceDataType().hashCode();
        }
        if (getServiceDataTypeId() != null) {
            _hashCode += getServiceDataTypeId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntityParticle.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EntityParticle"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DataType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("developerName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DeveloperName"));
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
        elemField.setFieldName("entityDefinition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EntityDefinition"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EntityDefinition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityDefinitionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EntityDefinitionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extraTypeInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ExtraTypeInfo"));
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
        elemField.setFieldName("isApiFilterable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsApiFilterable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isApiGroupable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsApiGroupable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isApiSortable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsApiSortable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCalculated");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsCalculated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCompactLayoutable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsCompactLayoutable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFieldHistoryTracked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsFieldHistoryTracked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isHighScaleNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsHighScaleNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isHtmlFormatted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsHtmlFormatted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isListVisible");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsListVisible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNameField");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsNameField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNillable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsNillable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isWorkflowFilterable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsWorkflowFilterable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MasterLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("namespacePrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NamespacePrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("precision");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Precision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qualifiedApiName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "QualifiedApiName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scale");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Scale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceDataType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ServiceDataType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceDataTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ServiceDataTypeId"));
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
