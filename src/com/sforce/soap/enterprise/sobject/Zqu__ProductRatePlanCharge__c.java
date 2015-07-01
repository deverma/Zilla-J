/**
 * Zqu__ProductRatePlanCharge__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Zqu__ProductRatePlanCharge__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult attachedContentDocuments;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String base_Units__c;

    private com.sforce.soap.enterprise.QueryResult combinedAttachments;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private com.sforce.soap.enterprise.QueryResult duplicateRecordItems;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private java.lang.Boolean isDeleted;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private com.sforce.soap.enterprise.QueryResult lookedUpFromActivities;

    private java.lang.String name;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private com.sforce.soap.enterprise.sobject.SObject owner;

    private java.lang.String ownerId;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private com.sforce.soap.enterprise.QueryResult recordAssociatedGroups;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult topicAssignments;

    private com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess;

    private java.lang.String zqu__AccountingCode__c;

    private java.lang.Boolean zqu__Apply_Discount_To_One_Time_Charges__c;

    private java.lang.Boolean zqu__Apply_Discount_To_Recurring_Charges__c;

    private java.lang.Boolean zqu__Apply_Discount_To_Usage_Charges__c;

    private java.lang.Double zqu__DefaultQuantity__c;

    private java.lang.Boolean zqu__Deleted__c;

    private java.lang.String zqu__Description__c;

    private java.lang.Double zqu__Discount_Apply_Type__c;

    private java.lang.String zqu__Discount_Level__c;

    private java.lang.Double zqu__ListPrice__c;

    private java.lang.Double zqu__MaxQuantity__c;

    private java.lang.Double zqu__MinQuantity__c;

    private java.lang.String zqu__Model__c;

    private java.lang.Double zqu__PrepaymentPeriods__c;

    private java.lang.String zqu__PriceTable__c;

    private com.sforce.soap.enterprise.QueryResult zqu__ProductRatePlanChargePriceSummaries__r;

    private java.lang.String zqu__ProductRatePlan__c;

    private com.sforce.soap.enterprise.sobject.Zqu__ProductRatePlan__c zqu__ProductRatePlan__r;

    private com.sforce.soap.enterprise.QueryResult zqu__Product_RatePlan_Charge_Tier__r;

    private com.sforce.soap.enterprise.QueryResult zqu__R00N40000001MFW5EAM__r;

    private com.sforce.soap.enterprise.QueryResult zqu__RatePlan_Charge_Tier__r;

    private java.lang.String zqu__RecurringPeriod__c;

    private java.lang.String zqu__RevRecCode__c;

    private java.lang.String zqu__TaxCode__c;

    private java.lang.String zqu__Type__c;

    private java.lang.String zqu__UOM__c;

    private java.lang.Double zqu__Upto_How_Many_Periods__c;

    private java.lang.String zqu__ZUnitOfMeasure__c;

    private com.sforce.soap.enterprise.sobject.Zqu__ZUnitOfMeasure__c zqu__ZUnitOfMeasure__r;

    private java.lang.String zqu__ZUom_Id__c;

    private java.lang.String zqu__ZuoraId__c;

    public Zqu__ProductRatePlanCharge__c() {
    }

    public Zqu__ProductRatePlanCharge__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult attachedContentDocuments,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String base_Units__c,
           com.sforce.soap.enterprise.QueryResult combinedAttachments,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           com.sforce.soap.enterprise.QueryResult duplicateRecordItems,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           java.lang.Boolean isDeleted,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           com.sforce.soap.enterprise.QueryResult lookedUpFromActivities,
           java.lang.String name,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           com.sforce.soap.enterprise.sobject.SObject owner,
           java.lang.String ownerId,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           com.sforce.soap.enterprise.QueryResult recordAssociatedGroups,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult topicAssignments,
           com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess,
           java.lang.String zqu__AccountingCode__c,
           java.lang.Boolean zqu__Apply_Discount_To_One_Time_Charges__c,
           java.lang.Boolean zqu__Apply_Discount_To_Recurring_Charges__c,
           java.lang.Boolean zqu__Apply_Discount_To_Usage_Charges__c,
           java.lang.Double zqu__DefaultQuantity__c,
           java.lang.Boolean zqu__Deleted__c,
           java.lang.String zqu__Description__c,
           java.lang.Double zqu__Discount_Apply_Type__c,
           java.lang.String zqu__Discount_Level__c,
           java.lang.Double zqu__ListPrice__c,
           java.lang.Double zqu__MaxQuantity__c,
           java.lang.Double zqu__MinQuantity__c,
           java.lang.String zqu__Model__c,
           java.lang.Double zqu__PrepaymentPeriods__c,
           java.lang.String zqu__PriceTable__c,
           com.sforce.soap.enterprise.QueryResult zqu__ProductRatePlanChargePriceSummaries__r,
           java.lang.String zqu__ProductRatePlan__c,
           com.sforce.soap.enterprise.sobject.Zqu__ProductRatePlan__c zqu__ProductRatePlan__r,
           com.sforce.soap.enterprise.QueryResult zqu__Product_RatePlan_Charge_Tier__r,
           com.sforce.soap.enterprise.QueryResult zqu__R00N40000001MFW5EAM__r,
           com.sforce.soap.enterprise.QueryResult zqu__RatePlan_Charge_Tier__r,
           java.lang.String zqu__RecurringPeriod__c,
           java.lang.String zqu__RevRecCode__c,
           java.lang.String zqu__TaxCode__c,
           java.lang.String zqu__Type__c,
           java.lang.String zqu__UOM__c,
           java.lang.Double zqu__Upto_How_Many_Periods__c,
           java.lang.String zqu__ZUnitOfMeasure__c,
           com.sforce.soap.enterprise.sobject.Zqu__ZUnitOfMeasure__c zqu__ZUnitOfMeasure__r,
           java.lang.String zqu__ZUom_Id__c,
           java.lang.String zqu__ZuoraId__c) {
        super(
            fieldsToNull,
            id);
        this.attachedContentDocuments = attachedContentDocuments;
        this.attachments = attachments;
        this.base_Units__c = base_Units__c;
        this.combinedAttachments = combinedAttachments;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.duplicateRecordItems = duplicateRecordItems;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.isDeleted = isDeleted;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.lookedUpFromActivities = lookedUpFromActivities;
        this.name = name;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.owner = owner;
        this.ownerId = ownerId;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.recordAssociatedGroups = recordAssociatedGroups;
        this.systemModstamp = systemModstamp;
        this.topicAssignments = topicAssignments;
        this.userRecordAccess = userRecordAccess;
        this.zqu__AccountingCode__c = zqu__AccountingCode__c;
        this.zqu__Apply_Discount_To_One_Time_Charges__c = zqu__Apply_Discount_To_One_Time_Charges__c;
        this.zqu__Apply_Discount_To_Recurring_Charges__c = zqu__Apply_Discount_To_Recurring_Charges__c;
        this.zqu__Apply_Discount_To_Usage_Charges__c = zqu__Apply_Discount_To_Usage_Charges__c;
        this.zqu__DefaultQuantity__c = zqu__DefaultQuantity__c;
        this.zqu__Deleted__c = zqu__Deleted__c;
        this.zqu__Description__c = zqu__Description__c;
        this.zqu__Discount_Apply_Type__c = zqu__Discount_Apply_Type__c;
        this.zqu__Discount_Level__c = zqu__Discount_Level__c;
        this.zqu__ListPrice__c = zqu__ListPrice__c;
        this.zqu__MaxQuantity__c = zqu__MaxQuantity__c;
        this.zqu__MinQuantity__c = zqu__MinQuantity__c;
        this.zqu__Model__c = zqu__Model__c;
        this.zqu__PrepaymentPeriods__c = zqu__PrepaymentPeriods__c;
        this.zqu__PriceTable__c = zqu__PriceTable__c;
        this.zqu__ProductRatePlanChargePriceSummaries__r = zqu__ProductRatePlanChargePriceSummaries__r;
        this.zqu__ProductRatePlan__c = zqu__ProductRatePlan__c;
        this.zqu__ProductRatePlan__r = zqu__ProductRatePlan__r;
        this.zqu__Product_RatePlan_Charge_Tier__r = zqu__Product_RatePlan_Charge_Tier__r;
        this.zqu__R00N40000001MFW5EAM__r = zqu__R00N40000001MFW5EAM__r;
        this.zqu__RatePlan_Charge_Tier__r = zqu__RatePlan_Charge_Tier__r;
        this.zqu__RecurringPeriod__c = zqu__RecurringPeriod__c;
        this.zqu__RevRecCode__c = zqu__RevRecCode__c;
        this.zqu__TaxCode__c = zqu__TaxCode__c;
        this.zqu__Type__c = zqu__Type__c;
        this.zqu__UOM__c = zqu__UOM__c;
        this.zqu__Upto_How_Many_Periods__c = zqu__Upto_How_Many_Periods__c;
        this.zqu__ZUnitOfMeasure__c = zqu__ZUnitOfMeasure__c;
        this.zqu__ZUnitOfMeasure__r = zqu__ZUnitOfMeasure__r;
        this.zqu__ZUom_Id__c = zqu__ZUom_Id__c;
        this.zqu__ZuoraId__c = zqu__ZuoraId__c;
    }


    /**
     * Gets the attachedContentDocuments value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return attachedContentDocuments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachedContentDocuments() {
        return attachedContentDocuments;
    }


    /**
     * Sets the attachedContentDocuments value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param attachedContentDocuments
     */
    public void setAttachedContentDocuments(com.sforce.soap.enterprise.QueryResult attachedContentDocuments) {
        this.attachedContentDocuments = attachedContentDocuments;
    }


    /**
     * Gets the attachments value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the base_Units__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return base_Units__c
     */
    public java.lang.String getBase_Units__c() {
        return base_Units__c;
    }


    /**
     * Sets the base_Units__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param base_Units__c
     */
    public void setBase_Units__c(java.lang.String base_Units__c) {
        this.base_Units__c = base_Units__c;
    }


    /**
     * Gets the combinedAttachments value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return combinedAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getCombinedAttachments() {
        return combinedAttachments;
    }


    /**
     * Sets the combinedAttachments value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param combinedAttachments
     */
    public void setCombinedAttachments(com.sforce.soap.enterprise.QueryResult combinedAttachments) {
        this.combinedAttachments = combinedAttachments;
    }


    /**
     * Gets the createdBy value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the duplicateRecordItems value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return duplicateRecordItems
     */
    public com.sforce.soap.enterprise.QueryResult getDuplicateRecordItems() {
        return duplicateRecordItems;
    }


    /**
     * Sets the duplicateRecordItems value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param duplicateRecordItems
     */
    public void setDuplicateRecordItems(com.sforce.soap.enterprise.QueryResult duplicateRecordItems) {
        this.duplicateRecordItems = duplicateRecordItems;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the isDeleted value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lookedUpFromActivities value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return lookedUpFromActivities
     */
    public com.sforce.soap.enterprise.QueryResult getLookedUpFromActivities() {
        return lookedUpFromActivities;
    }


    /**
     * Sets the lookedUpFromActivities value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param lookedUpFromActivities
     */
    public void setLookedUpFromActivities(com.sforce.soap.enterprise.QueryResult lookedUpFromActivities) {
        this.lookedUpFromActivities = lookedUpFromActivities;
    }


    /**
     * Gets the name value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the owner value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.SObject getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.SObject owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the processInstances value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the recordAssociatedGroups value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return recordAssociatedGroups
     */
    public com.sforce.soap.enterprise.QueryResult getRecordAssociatedGroups() {
        return recordAssociatedGroups;
    }


    /**
     * Sets the recordAssociatedGroups value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param recordAssociatedGroups
     */
    public void setRecordAssociatedGroups(com.sforce.soap.enterprise.QueryResult recordAssociatedGroups) {
        this.recordAssociatedGroups = recordAssociatedGroups;
    }


    /**
     * Gets the systemModstamp value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the topicAssignments value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return topicAssignments
     */
    public com.sforce.soap.enterprise.QueryResult getTopicAssignments() {
        return topicAssignments;
    }


    /**
     * Sets the topicAssignments value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param topicAssignments
     */
    public void setTopicAssignments(com.sforce.soap.enterprise.QueryResult topicAssignments) {
        this.topicAssignments = topicAssignments;
    }


    /**
     * Gets the userRecordAccess value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return userRecordAccess
     */
    public com.sforce.soap.enterprise.sobject.UserRecordAccess getUserRecordAccess() {
        return userRecordAccess;
    }


    /**
     * Sets the userRecordAccess value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param userRecordAccess
     */
    public void setUserRecordAccess(com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess) {
        this.userRecordAccess = userRecordAccess;
    }


    /**
     * Gets the zqu__AccountingCode__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return zqu__AccountingCode__c
     */
    public java.lang.String getZqu__AccountingCode__c() {
        return zqu__AccountingCode__c;
    }


    /**
     * Sets the zqu__AccountingCode__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param zqu__AccountingCode__c
     */
    public void setZqu__AccountingCode__c(java.lang.String zqu__AccountingCode__c) {
        this.zqu__AccountingCode__c = zqu__AccountingCode__c;
    }


    /**
     * Gets the zqu__Apply_Discount_To_One_Time_Charges__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return zqu__Apply_Discount_To_One_Time_Charges__c
     */
    public java.lang.Boolean getZqu__Apply_Discount_To_One_Time_Charges__c() {
        return zqu__Apply_Discount_To_One_Time_Charges__c;
    }


    /**
     * Sets the zqu__Apply_Discount_To_One_Time_Charges__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param zqu__Apply_Discount_To_One_Time_Charges__c
     */
    public void setZqu__Apply_Discount_To_One_Time_Charges__c(java.lang.Boolean zqu__Apply_Discount_To_One_Time_Charges__c) {
        this.zqu__Apply_Discount_To_One_Time_Charges__c = zqu__Apply_Discount_To_One_Time_Charges__c;
    }


    /**
     * Gets the zqu__Apply_Discount_To_Recurring_Charges__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return zqu__Apply_Discount_To_Recurring_Charges__c
     */
    public java.lang.Boolean getZqu__Apply_Discount_To_Recurring_Charges__c() {
        return zqu__Apply_Discount_To_Recurring_Charges__c;
    }


    /**
     * Sets the zqu__Apply_Discount_To_Recurring_Charges__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param zqu__Apply_Discount_To_Recurring_Charges__c
     */
    public void setZqu__Apply_Discount_To_Recurring_Charges__c(java.lang.Boolean zqu__Apply_Discount_To_Recurring_Charges__c) {
        this.zqu__Apply_Discount_To_Recurring_Charges__c = zqu__Apply_Discount_To_Recurring_Charges__c;
    }


    /**
     * Gets the zqu__Apply_Discount_To_Usage_Charges__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return zqu__Apply_Discount_To_Usage_Charges__c
     */
    public java.lang.Boolean getZqu__Apply_Discount_To_Usage_Charges__c() {
        return zqu__Apply_Discount_To_Usage_Charges__c;
    }


    /**
     * Sets the zqu__Apply_Discount_To_Usage_Charges__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param zqu__Apply_Discount_To_Usage_Charges__c
     */
    public void setZqu__Apply_Discount_To_Usage_Charges__c(java.lang.Boolean zqu__Apply_Discount_To_Usage_Charges__c) {
        this.zqu__Apply_Discount_To_Usage_Charges__c = zqu__Apply_Discount_To_Usage_Charges__c;
    }


    /**
     * Gets the zqu__DefaultQuantity__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return zqu__DefaultQuantity__c
     */
    public java.lang.Double getZqu__DefaultQuantity__c() {
        return zqu__DefaultQuantity__c;
    }


    /**
     * Sets the zqu__DefaultQuantity__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param zqu__DefaultQuantity__c
     */
    public void setZqu__DefaultQuantity__c(java.lang.Double zqu__DefaultQuantity__c) {
        this.zqu__DefaultQuantity__c = zqu__DefaultQuantity__c;
    }


    /**
     * Gets the zqu__Deleted__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return zqu__Deleted__c
     */
    public java.lang.Boolean getZqu__Deleted__c() {
        return zqu__Deleted__c;
    }


    /**
     * Sets the zqu__Deleted__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param zqu__Deleted__c
     */
    public void setZqu__Deleted__c(java.lang.Boolean zqu__Deleted__c) {
        this.zqu__Deleted__c = zqu__Deleted__c;
    }


    /**
     * Gets the zqu__Description__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return zqu__Description__c
     */
    public java.lang.String getZqu__Description__c() {
        return zqu__Description__c;
    }


    /**
     * Sets the zqu__Description__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param zqu__Description__c
     */
    public void setZqu__Description__c(java.lang.String zqu__Description__c) {
        this.zqu__Description__c = zqu__Description__c;
    }


    /**
     * Gets the zqu__Discount_Apply_Type__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return zqu__Discount_Apply_Type__c
     */
    public java.lang.Double getZqu__Discount_Apply_Type__c() {
        return zqu__Discount_Apply_Type__c;
    }


    /**
     * Sets the zqu__Discount_Apply_Type__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param zqu__Discount_Apply_Type__c
     */
    public void setZqu__Discount_Apply_Type__c(java.lang.Double zqu__Discount_Apply_Type__c) {
        this.zqu__Discount_Apply_Type__c = zqu__Discount_Apply_Type__c;
    }


    /**
     * Gets the zqu__Discount_Level__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return zqu__Discount_Level__c
     */
    public java.lang.String getZqu__Discount_Level__c() {
        return zqu__Discount_Level__c;
    }


    /**
     * Sets the zqu__Discount_Level__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param zqu__Discount_Level__c
     */
    public void setZqu__Discount_Level__c(java.lang.String zqu__Discount_Level__c) {
        this.zqu__Discount_Level__c = zqu__Discount_Level__c;
    }


    /**
     * Gets the zqu__ListPrice__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return zqu__ListPrice__c
     */
    public java.lang.Double getZqu__ListPrice__c() {
        return zqu__ListPrice__c;
    }


    /**
     * Sets the zqu__ListPrice__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param zqu__ListPrice__c
     */
    public void setZqu__ListPrice__c(java.lang.Double zqu__ListPrice__c) {
        this.zqu__ListPrice__c = zqu__ListPrice__c;
    }


    /**
     * Gets the zqu__MaxQuantity__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return zqu__MaxQuantity__c
     */
    public java.lang.Double getZqu__MaxQuantity__c() {
        return zqu__MaxQuantity__c;
    }


    /**
     * Sets the zqu__MaxQuantity__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param zqu__MaxQuantity__c
     */
    public void setZqu__MaxQuantity__c(java.lang.Double zqu__MaxQuantity__c) {
        this.zqu__MaxQuantity__c = zqu__MaxQuantity__c;
    }


    /**
     * Gets the zqu__MinQuantity__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return zqu__MinQuantity__c
     */
    public java.lang.Double getZqu__MinQuantity__c() {
        return zqu__MinQuantity__c;
    }


    /**
     * Sets the zqu__MinQuantity__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param zqu__MinQuantity__c
     */
    public void setZqu__MinQuantity__c(java.lang.Double zqu__MinQuantity__c) {
        this.zqu__MinQuantity__c = zqu__MinQuantity__c;
    }


    /**
     * Gets the zqu__Model__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return zqu__Model__c
     */
    public java.lang.String getZqu__Model__c() {
        return zqu__Model__c;
    }


    /**
     * Sets the zqu__Model__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param zqu__Model__c
     */
    public void setZqu__Model__c(java.lang.String zqu__Model__c) {
        this.zqu__Model__c = zqu__Model__c;
    }


    /**
     * Gets the zqu__PrepaymentPeriods__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return zqu__PrepaymentPeriods__c
     */
    public java.lang.Double getZqu__PrepaymentPeriods__c() {
        return zqu__PrepaymentPeriods__c;
    }


    /**
     * Sets the zqu__PrepaymentPeriods__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param zqu__PrepaymentPeriods__c
     */
    public void setZqu__PrepaymentPeriods__c(java.lang.Double zqu__PrepaymentPeriods__c) {
        this.zqu__PrepaymentPeriods__c = zqu__PrepaymentPeriods__c;
    }


    /**
     * Gets the zqu__PriceTable__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return zqu__PriceTable__c
     */
    public java.lang.String getZqu__PriceTable__c() {
        return zqu__PriceTable__c;
    }


    /**
     * Sets the zqu__PriceTable__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param zqu__PriceTable__c
     */
    public void setZqu__PriceTable__c(java.lang.String zqu__PriceTable__c) {
        this.zqu__PriceTable__c = zqu__PriceTable__c;
    }


    /**
     * Gets the zqu__ProductRatePlanChargePriceSummaries__r value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return zqu__ProductRatePlanChargePriceSummaries__r
     */
    public com.sforce.soap.enterprise.QueryResult getZqu__ProductRatePlanChargePriceSummaries__r() {
        return zqu__ProductRatePlanChargePriceSummaries__r;
    }


    /**
     * Sets the zqu__ProductRatePlanChargePriceSummaries__r value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param zqu__ProductRatePlanChargePriceSummaries__r
     */
    public void setZqu__ProductRatePlanChargePriceSummaries__r(com.sforce.soap.enterprise.QueryResult zqu__ProductRatePlanChargePriceSummaries__r) {
        this.zqu__ProductRatePlanChargePriceSummaries__r = zqu__ProductRatePlanChargePriceSummaries__r;
    }


    /**
     * Gets the zqu__ProductRatePlan__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return zqu__ProductRatePlan__c
     */
    public java.lang.String getZqu__ProductRatePlan__c() {
        return zqu__ProductRatePlan__c;
    }


    /**
     * Sets the zqu__ProductRatePlan__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param zqu__ProductRatePlan__c
     */
    public void setZqu__ProductRatePlan__c(java.lang.String zqu__ProductRatePlan__c) {
        this.zqu__ProductRatePlan__c = zqu__ProductRatePlan__c;
    }


    /**
     * Gets the zqu__ProductRatePlan__r value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return zqu__ProductRatePlan__r
     */
    public com.sforce.soap.enterprise.sobject.Zqu__ProductRatePlan__c getZqu__ProductRatePlan__r() {
        return zqu__ProductRatePlan__r;
    }


    /**
     * Sets the zqu__ProductRatePlan__r value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param zqu__ProductRatePlan__r
     */
    public void setZqu__ProductRatePlan__r(com.sforce.soap.enterprise.sobject.Zqu__ProductRatePlan__c zqu__ProductRatePlan__r) {
        this.zqu__ProductRatePlan__r = zqu__ProductRatePlan__r;
    }


    /**
     * Gets the zqu__Product_RatePlan_Charge_Tier__r value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return zqu__Product_RatePlan_Charge_Tier__r
     */
    public com.sforce.soap.enterprise.QueryResult getZqu__Product_RatePlan_Charge_Tier__r() {
        return zqu__Product_RatePlan_Charge_Tier__r;
    }


    /**
     * Sets the zqu__Product_RatePlan_Charge_Tier__r value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param zqu__Product_RatePlan_Charge_Tier__r
     */
    public void setZqu__Product_RatePlan_Charge_Tier__r(com.sforce.soap.enterprise.QueryResult zqu__Product_RatePlan_Charge_Tier__r) {
        this.zqu__Product_RatePlan_Charge_Tier__r = zqu__Product_RatePlan_Charge_Tier__r;
    }


    /**
     * Gets the zqu__R00N40000001MFW5EAM__r value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return zqu__R00N40000001MFW5EAM__r
     */
    public com.sforce.soap.enterprise.QueryResult getZqu__R00N40000001MFW5EAM__r() {
        return zqu__R00N40000001MFW5EAM__r;
    }


    /**
     * Sets the zqu__R00N40000001MFW5EAM__r value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param zqu__R00N40000001MFW5EAM__r
     */
    public void setZqu__R00N40000001MFW5EAM__r(com.sforce.soap.enterprise.QueryResult zqu__R00N40000001MFW5EAM__r) {
        this.zqu__R00N40000001MFW5EAM__r = zqu__R00N40000001MFW5EAM__r;
    }


    /**
     * Gets the zqu__RatePlan_Charge_Tier__r value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return zqu__RatePlan_Charge_Tier__r
     */
    public com.sforce.soap.enterprise.QueryResult getZqu__RatePlan_Charge_Tier__r() {
        return zqu__RatePlan_Charge_Tier__r;
    }


    /**
     * Sets the zqu__RatePlan_Charge_Tier__r value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param zqu__RatePlan_Charge_Tier__r
     */
    public void setZqu__RatePlan_Charge_Tier__r(com.sforce.soap.enterprise.QueryResult zqu__RatePlan_Charge_Tier__r) {
        this.zqu__RatePlan_Charge_Tier__r = zqu__RatePlan_Charge_Tier__r;
    }


    /**
     * Gets the zqu__RecurringPeriod__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return zqu__RecurringPeriod__c
     */
    public java.lang.String getZqu__RecurringPeriod__c() {
        return zqu__RecurringPeriod__c;
    }


    /**
     * Sets the zqu__RecurringPeriod__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param zqu__RecurringPeriod__c
     */
    public void setZqu__RecurringPeriod__c(java.lang.String zqu__RecurringPeriod__c) {
        this.zqu__RecurringPeriod__c = zqu__RecurringPeriod__c;
    }


    /**
     * Gets the zqu__RevRecCode__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return zqu__RevRecCode__c
     */
    public java.lang.String getZqu__RevRecCode__c() {
        return zqu__RevRecCode__c;
    }


    /**
     * Sets the zqu__RevRecCode__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param zqu__RevRecCode__c
     */
    public void setZqu__RevRecCode__c(java.lang.String zqu__RevRecCode__c) {
        this.zqu__RevRecCode__c = zqu__RevRecCode__c;
    }


    /**
     * Gets the zqu__TaxCode__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return zqu__TaxCode__c
     */
    public java.lang.String getZqu__TaxCode__c() {
        return zqu__TaxCode__c;
    }


    /**
     * Sets the zqu__TaxCode__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param zqu__TaxCode__c
     */
    public void setZqu__TaxCode__c(java.lang.String zqu__TaxCode__c) {
        this.zqu__TaxCode__c = zqu__TaxCode__c;
    }


    /**
     * Gets the zqu__Type__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return zqu__Type__c
     */
    public java.lang.String getZqu__Type__c() {
        return zqu__Type__c;
    }


    /**
     * Sets the zqu__Type__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param zqu__Type__c
     */
    public void setZqu__Type__c(java.lang.String zqu__Type__c) {
        this.zqu__Type__c = zqu__Type__c;
    }


    /**
     * Gets the zqu__UOM__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return zqu__UOM__c
     */
    public java.lang.String getZqu__UOM__c() {
        return zqu__UOM__c;
    }


    /**
     * Sets the zqu__UOM__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param zqu__UOM__c
     */
    public void setZqu__UOM__c(java.lang.String zqu__UOM__c) {
        this.zqu__UOM__c = zqu__UOM__c;
    }


    /**
     * Gets the zqu__Upto_How_Many_Periods__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return zqu__Upto_How_Many_Periods__c
     */
    public java.lang.Double getZqu__Upto_How_Many_Periods__c() {
        return zqu__Upto_How_Many_Periods__c;
    }


    /**
     * Sets the zqu__Upto_How_Many_Periods__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param zqu__Upto_How_Many_Periods__c
     */
    public void setZqu__Upto_How_Many_Periods__c(java.lang.Double zqu__Upto_How_Many_Periods__c) {
        this.zqu__Upto_How_Many_Periods__c = zqu__Upto_How_Many_Periods__c;
    }


    /**
     * Gets the zqu__ZUnitOfMeasure__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return zqu__ZUnitOfMeasure__c
     */
    public java.lang.String getZqu__ZUnitOfMeasure__c() {
        return zqu__ZUnitOfMeasure__c;
    }


    /**
     * Sets the zqu__ZUnitOfMeasure__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param zqu__ZUnitOfMeasure__c
     */
    public void setZqu__ZUnitOfMeasure__c(java.lang.String zqu__ZUnitOfMeasure__c) {
        this.zqu__ZUnitOfMeasure__c = zqu__ZUnitOfMeasure__c;
    }


    /**
     * Gets the zqu__ZUnitOfMeasure__r value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return zqu__ZUnitOfMeasure__r
     */
    public com.sforce.soap.enterprise.sobject.Zqu__ZUnitOfMeasure__c getZqu__ZUnitOfMeasure__r() {
        return zqu__ZUnitOfMeasure__r;
    }


    /**
     * Sets the zqu__ZUnitOfMeasure__r value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param zqu__ZUnitOfMeasure__r
     */
    public void setZqu__ZUnitOfMeasure__r(com.sforce.soap.enterprise.sobject.Zqu__ZUnitOfMeasure__c zqu__ZUnitOfMeasure__r) {
        this.zqu__ZUnitOfMeasure__r = zqu__ZUnitOfMeasure__r;
    }


    /**
     * Gets the zqu__ZUom_Id__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return zqu__ZUom_Id__c
     */
    public java.lang.String getZqu__ZUom_Id__c() {
        return zqu__ZUom_Id__c;
    }


    /**
     * Sets the zqu__ZUom_Id__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param zqu__ZUom_Id__c
     */
    public void setZqu__ZUom_Id__c(java.lang.String zqu__ZUom_Id__c) {
        this.zqu__ZUom_Id__c = zqu__ZUom_Id__c;
    }


    /**
     * Gets the zqu__ZuoraId__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @return zqu__ZuoraId__c
     */
    public java.lang.String getZqu__ZuoraId__c() {
        return zqu__ZuoraId__c;
    }


    /**
     * Sets the zqu__ZuoraId__c value for this Zqu__ProductRatePlanCharge__c.
     * 
     * @param zqu__ZuoraId__c
     */
    public void setZqu__ZuoraId__c(java.lang.String zqu__ZuoraId__c) {
        this.zqu__ZuoraId__c = zqu__ZuoraId__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Zqu__ProductRatePlanCharge__c)) return false;
        Zqu__ProductRatePlanCharge__c other = (Zqu__ProductRatePlanCharge__c) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.attachedContentDocuments==null && other.getAttachedContentDocuments()==null) || 
             (this.attachedContentDocuments!=null &&
              this.attachedContentDocuments.equals(other.getAttachedContentDocuments()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.base_Units__c==null && other.getBase_Units__c()==null) || 
             (this.base_Units__c!=null &&
              this.base_Units__c.equals(other.getBase_Units__c()))) &&
            ((this.combinedAttachments==null && other.getCombinedAttachments()==null) || 
             (this.combinedAttachments!=null &&
              this.combinedAttachments.equals(other.getCombinedAttachments()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.duplicateRecordItems==null && other.getDuplicateRecordItems()==null) || 
             (this.duplicateRecordItems!=null &&
              this.duplicateRecordItems.equals(other.getDuplicateRecordItems()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.lookedUpFromActivities==null && other.getLookedUpFromActivities()==null) || 
             (this.lookedUpFromActivities!=null &&
              this.lookedUpFromActivities.equals(other.getLookedUpFromActivities()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.notesAndAttachments==null && other.getNotesAndAttachments()==null) || 
             (this.notesAndAttachments!=null &&
              this.notesAndAttachments.equals(other.getNotesAndAttachments()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.recordAssociatedGroups==null && other.getRecordAssociatedGroups()==null) || 
             (this.recordAssociatedGroups!=null &&
              this.recordAssociatedGroups.equals(other.getRecordAssociatedGroups()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.topicAssignments==null && other.getTopicAssignments()==null) || 
             (this.topicAssignments!=null &&
              this.topicAssignments.equals(other.getTopicAssignments()))) &&
            ((this.userRecordAccess==null && other.getUserRecordAccess()==null) || 
             (this.userRecordAccess!=null &&
              this.userRecordAccess.equals(other.getUserRecordAccess()))) &&
            ((this.zqu__AccountingCode__c==null && other.getZqu__AccountingCode__c()==null) || 
             (this.zqu__AccountingCode__c!=null &&
              this.zqu__AccountingCode__c.equals(other.getZqu__AccountingCode__c()))) &&
            ((this.zqu__Apply_Discount_To_One_Time_Charges__c==null && other.getZqu__Apply_Discount_To_One_Time_Charges__c()==null) || 
             (this.zqu__Apply_Discount_To_One_Time_Charges__c!=null &&
              this.zqu__Apply_Discount_To_One_Time_Charges__c.equals(other.getZqu__Apply_Discount_To_One_Time_Charges__c()))) &&
            ((this.zqu__Apply_Discount_To_Recurring_Charges__c==null && other.getZqu__Apply_Discount_To_Recurring_Charges__c()==null) || 
             (this.zqu__Apply_Discount_To_Recurring_Charges__c!=null &&
              this.zqu__Apply_Discount_To_Recurring_Charges__c.equals(other.getZqu__Apply_Discount_To_Recurring_Charges__c()))) &&
            ((this.zqu__Apply_Discount_To_Usage_Charges__c==null && other.getZqu__Apply_Discount_To_Usage_Charges__c()==null) || 
             (this.zqu__Apply_Discount_To_Usage_Charges__c!=null &&
              this.zqu__Apply_Discount_To_Usage_Charges__c.equals(other.getZqu__Apply_Discount_To_Usage_Charges__c()))) &&
            ((this.zqu__DefaultQuantity__c==null && other.getZqu__DefaultQuantity__c()==null) || 
             (this.zqu__DefaultQuantity__c!=null &&
              this.zqu__DefaultQuantity__c.equals(other.getZqu__DefaultQuantity__c()))) &&
            ((this.zqu__Deleted__c==null && other.getZqu__Deleted__c()==null) || 
             (this.zqu__Deleted__c!=null &&
              this.zqu__Deleted__c.equals(other.getZqu__Deleted__c()))) &&
            ((this.zqu__Description__c==null && other.getZqu__Description__c()==null) || 
             (this.zqu__Description__c!=null &&
              this.zqu__Description__c.equals(other.getZqu__Description__c()))) &&
            ((this.zqu__Discount_Apply_Type__c==null && other.getZqu__Discount_Apply_Type__c()==null) || 
             (this.zqu__Discount_Apply_Type__c!=null &&
              this.zqu__Discount_Apply_Type__c.equals(other.getZqu__Discount_Apply_Type__c()))) &&
            ((this.zqu__Discount_Level__c==null && other.getZqu__Discount_Level__c()==null) || 
             (this.zqu__Discount_Level__c!=null &&
              this.zqu__Discount_Level__c.equals(other.getZqu__Discount_Level__c()))) &&
            ((this.zqu__ListPrice__c==null && other.getZqu__ListPrice__c()==null) || 
             (this.zqu__ListPrice__c!=null &&
              this.zqu__ListPrice__c.equals(other.getZqu__ListPrice__c()))) &&
            ((this.zqu__MaxQuantity__c==null && other.getZqu__MaxQuantity__c()==null) || 
             (this.zqu__MaxQuantity__c!=null &&
              this.zqu__MaxQuantity__c.equals(other.getZqu__MaxQuantity__c()))) &&
            ((this.zqu__MinQuantity__c==null && other.getZqu__MinQuantity__c()==null) || 
             (this.zqu__MinQuantity__c!=null &&
              this.zqu__MinQuantity__c.equals(other.getZqu__MinQuantity__c()))) &&
            ((this.zqu__Model__c==null && other.getZqu__Model__c()==null) || 
             (this.zqu__Model__c!=null &&
              this.zqu__Model__c.equals(other.getZqu__Model__c()))) &&
            ((this.zqu__PrepaymentPeriods__c==null && other.getZqu__PrepaymentPeriods__c()==null) || 
             (this.zqu__PrepaymentPeriods__c!=null &&
              this.zqu__PrepaymentPeriods__c.equals(other.getZqu__PrepaymentPeriods__c()))) &&
            ((this.zqu__PriceTable__c==null && other.getZqu__PriceTable__c()==null) || 
             (this.zqu__PriceTable__c!=null &&
              this.zqu__PriceTable__c.equals(other.getZqu__PriceTable__c()))) &&
            ((this.zqu__ProductRatePlanChargePriceSummaries__r==null && other.getZqu__ProductRatePlanChargePriceSummaries__r()==null) || 
             (this.zqu__ProductRatePlanChargePriceSummaries__r!=null &&
              this.zqu__ProductRatePlanChargePriceSummaries__r.equals(other.getZqu__ProductRatePlanChargePriceSummaries__r()))) &&
            ((this.zqu__ProductRatePlan__c==null && other.getZqu__ProductRatePlan__c()==null) || 
             (this.zqu__ProductRatePlan__c!=null &&
              this.zqu__ProductRatePlan__c.equals(other.getZqu__ProductRatePlan__c()))) &&
            ((this.zqu__ProductRatePlan__r==null && other.getZqu__ProductRatePlan__r()==null) || 
             (this.zqu__ProductRatePlan__r!=null &&
              this.zqu__ProductRatePlan__r.equals(other.getZqu__ProductRatePlan__r()))) &&
            ((this.zqu__Product_RatePlan_Charge_Tier__r==null && other.getZqu__Product_RatePlan_Charge_Tier__r()==null) || 
             (this.zqu__Product_RatePlan_Charge_Tier__r!=null &&
              this.zqu__Product_RatePlan_Charge_Tier__r.equals(other.getZqu__Product_RatePlan_Charge_Tier__r()))) &&
            ((this.zqu__R00N40000001MFW5EAM__r==null && other.getZqu__R00N40000001MFW5EAM__r()==null) || 
             (this.zqu__R00N40000001MFW5EAM__r!=null &&
              this.zqu__R00N40000001MFW5EAM__r.equals(other.getZqu__R00N40000001MFW5EAM__r()))) &&
            ((this.zqu__RatePlan_Charge_Tier__r==null && other.getZqu__RatePlan_Charge_Tier__r()==null) || 
             (this.zqu__RatePlan_Charge_Tier__r!=null &&
              this.zqu__RatePlan_Charge_Tier__r.equals(other.getZqu__RatePlan_Charge_Tier__r()))) &&
            ((this.zqu__RecurringPeriod__c==null && other.getZqu__RecurringPeriod__c()==null) || 
             (this.zqu__RecurringPeriod__c!=null &&
              this.zqu__RecurringPeriod__c.equals(other.getZqu__RecurringPeriod__c()))) &&
            ((this.zqu__RevRecCode__c==null && other.getZqu__RevRecCode__c()==null) || 
             (this.zqu__RevRecCode__c!=null &&
              this.zqu__RevRecCode__c.equals(other.getZqu__RevRecCode__c()))) &&
            ((this.zqu__TaxCode__c==null && other.getZqu__TaxCode__c()==null) || 
             (this.zqu__TaxCode__c!=null &&
              this.zqu__TaxCode__c.equals(other.getZqu__TaxCode__c()))) &&
            ((this.zqu__Type__c==null && other.getZqu__Type__c()==null) || 
             (this.zqu__Type__c!=null &&
              this.zqu__Type__c.equals(other.getZqu__Type__c()))) &&
            ((this.zqu__UOM__c==null && other.getZqu__UOM__c()==null) || 
             (this.zqu__UOM__c!=null &&
              this.zqu__UOM__c.equals(other.getZqu__UOM__c()))) &&
            ((this.zqu__Upto_How_Many_Periods__c==null && other.getZqu__Upto_How_Many_Periods__c()==null) || 
             (this.zqu__Upto_How_Many_Periods__c!=null &&
              this.zqu__Upto_How_Many_Periods__c.equals(other.getZqu__Upto_How_Many_Periods__c()))) &&
            ((this.zqu__ZUnitOfMeasure__c==null && other.getZqu__ZUnitOfMeasure__c()==null) || 
             (this.zqu__ZUnitOfMeasure__c!=null &&
              this.zqu__ZUnitOfMeasure__c.equals(other.getZqu__ZUnitOfMeasure__c()))) &&
            ((this.zqu__ZUnitOfMeasure__r==null && other.getZqu__ZUnitOfMeasure__r()==null) || 
             (this.zqu__ZUnitOfMeasure__r!=null &&
              this.zqu__ZUnitOfMeasure__r.equals(other.getZqu__ZUnitOfMeasure__r()))) &&
            ((this.zqu__ZUom_Id__c==null && other.getZqu__ZUom_Id__c()==null) || 
             (this.zqu__ZUom_Id__c!=null &&
              this.zqu__ZUom_Id__c.equals(other.getZqu__ZUom_Id__c()))) &&
            ((this.zqu__ZuoraId__c==null && other.getZqu__ZuoraId__c()==null) || 
             (this.zqu__ZuoraId__c!=null &&
              this.zqu__ZuoraId__c.equals(other.getZqu__ZuoraId__c())));
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
        if (getAttachedContentDocuments() != null) {
            _hashCode += getAttachedContentDocuments().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getBase_Units__c() != null) {
            _hashCode += getBase_Units__c().hashCode();
        }
        if (getCombinedAttachments() != null) {
            _hashCode += getCombinedAttachments().hashCode();
        }
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getCreatedById() != null) {
            _hashCode += getCreatedById().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getDuplicateRecordItems() != null) {
            _hashCode += getDuplicateRecordItems().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getLastModifiedBy() != null) {
            _hashCode += getLastModifiedBy().hashCode();
        }
        if (getLastModifiedById() != null) {
            _hashCode += getLastModifiedById().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getLookedUpFromActivities() != null) {
            _hashCode += getLookedUpFromActivities().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getNotesAndAttachments() != null) {
            _hashCode += getNotesAndAttachments().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getRecordAssociatedGroups() != null) {
            _hashCode += getRecordAssociatedGroups().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTopicAssignments() != null) {
            _hashCode += getTopicAssignments().hashCode();
        }
        if (getUserRecordAccess() != null) {
            _hashCode += getUserRecordAccess().hashCode();
        }
        if (getZqu__AccountingCode__c() != null) {
            _hashCode += getZqu__AccountingCode__c().hashCode();
        }
        if (getZqu__Apply_Discount_To_One_Time_Charges__c() != null) {
            _hashCode += getZqu__Apply_Discount_To_One_Time_Charges__c().hashCode();
        }
        if (getZqu__Apply_Discount_To_Recurring_Charges__c() != null) {
            _hashCode += getZqu__Apply_Discount_To_Recurring_Charges__c().hashCode();
        }
        if (getZqu__Apply_Discount_To_Usage_Charges__c() != null) {
            _hashCode += getZqu__Apply_Discount_To_Usage_Charges__c().hashCode();
        }
        if (getZqu__DefaultQuantity__c() != null) {
            _hashCode += getZqu__DefaultQuantity__c().hashCode();
        }
        if (getZqu__Deleted__c() != null) {
            _hashCode += getZqu__Deleted__c().hashCode();
        }
        if (getZqu__Description__c() != null) {
            _hashCode += getZqu__Description__c().hashCode();
        }
        if (getZqu__Discount_Apply_Type__c() != null) {
            _hashCode += getZqu__Discount_Apply_Type__c().hashCode();
        }
        if (getZqu__Discount_Level__c() != null) {
            _hashCode += getZqu__Discount_Level__c().hashCode();
        }
        if (getZqu__ListPrice__c() != null) {
            _hashCode += getZqu__ListPrice__c().hashCode();
        }
        if (getZqu__MaxQuantity__c() != null) {
            _hashCode += getZqu__MaxQuantity__c().hashCode();
        }
        if (getZqu__MinQuantity__c() != null) {
            _hashCode += getZqu__MinQuantity__c().hashCode();
        }
        if (getZqu__Model__c() != null) {
            _hashCode += getZqu__Model__c().hashCode();
        }
        if (getZqu__PrepaymentPeriods__c() != null) {
            _hashCode += getZqu__PrepaymentPeriods__c().hashCode();
        }
        if (getZqu__PriceTable__c() != null) {
            _hashCode += getZqu__PriceTable__c().hashCode();
        }
        if (getZqu__ProductRatePlanChargePriceSummaries__r() != null) {
            _hashCode += getZqu__ProductRatePlanChargePriceSummaries__r().hashCode();
        }
        if (getZqu__ProductRatePlan__c() != null) {
            _hashCode += getZqu__ProductRatePlan__c().hashCode();
        }
        if (getZqu__ProductRatePlan__r() != null) {
            _hashCode += getZqu__ProductRatePlan__r().hashCode();
        }
        if (getZqu__Product_RatePlan_Charge_Tier__r() != null) {
            _hashCode += getZqu__Product_RatePlan_Charge_Tier__r().hashCode();
        }
        if (getZqu__R00N40000001MFW5EAM__r() != null) {
            _hashCode += getZqu__R00N40000001MFW5EAM__r().hashCode();
        }
        if (getZqu__RatePlan_Charge_Tier__r() != null) {
            _hashCode += getZqu__RatePlan_Charge_Tier__r().hashCode();
        }
        if (getZqu__RecurringPeriod__c() != null) {
            _hashCode += getZqu__RecurringPeriod__c().hashCode();
        }
        if (getZqu__RevRecCode__c() != null) {
            _hashCode += getZqu__RevRecCode__c().hashCode();
        }
        if (getZqu__TaxCode__c() != null) {
            _hashCode += getZqu__TaxCode__c().hashCode();
        }
        if (getZqu__Type__c() != null) {
            _hashCode += getZqu__Type__c().hashCode();
        }
        if (getZqu__UOM__c() != null) {
            _hashCode += getZqu__UOM__c().hashCode();
        }
        if (getZqu__Upto_How_Many_Periods__c() != null) {
            _hashCode += getZqu__Upto_How_Many_Periods__c().hashCode();
        }
        if (getZqu__ZUnitOfMeasure__c() != null) {
            _hashCode += getZqu__ZUnitOfMeasure__c().hashCode();
        }
        if (getZqu__ZUnitOfMeasure__r() != null) {
            _hashCode += getZqu__ZUnitOfMeasure__r().hashCode();
        }
        if (getZqu__ZUom_Id__c() != null) {
            _hashCode += getZqu__ZUom_Id__c().hashCode();
        }
        if (getZqu__ZuoraId__c() != null) {
            _hashCode += getZqu__ZuoraId__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Zqu__ProductRatePlanCharge__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ProductRatePlanCharge__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachedContentDocuments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AttachedContentDocuments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("base_Units__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Base_Units__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("combinedAttachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CombinedAttachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdById");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CreatedById"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CreatedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duplicateRecordItems");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DuplicateRecordItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedSubscriptionsForEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FeedSubscriptionsForEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDeleted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDeleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastModifiedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedById");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastModifiedById"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lookedUpFromActivities");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LookedUpFromActivities"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notesAndAttachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NotesAndAttachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "sObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OwnerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processInstances");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessInstances"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processSteps");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessSteps"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordAssociatedGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecordAssociatedGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemModstamp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SystemModstamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topicAssignments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TopicAssignments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userRecordAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserRecordAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserRecordAccess"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__AccountingCode__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__AccountingCode__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Apply_Discount_To_One_Time_Charges__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Apply_Discount_To_One_Time_Charges__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Apply_Discount_To_Recurring_Charges__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Apply_Discount_To_Recurring_Charges__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Apply_Discount_To_Usage_Charges__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Apply_Discount_To_Usage_Charges__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__DefaultQuantity__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__DefaultQuantity__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Deleted__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Deleted__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Description__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Description__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Discount_Apply_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Discount_Apply_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Discount_Level__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Discount_Level__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__ListPrice__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ListPrice__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__MaxQuantity__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__MaxQuantity__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__MinQuantity__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__MinQuantity__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Model__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Model__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__PrepaymentPeriods__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__PrepaymentPeriods__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__PriceTable__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__PriceTable__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__ProductRatePlanChargePriceSummaries__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ProductRatePlanChargePriceSummaries__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__ProductRatePlan__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ProductRatePlan__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__ProductRatePlan__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ProductRatePlan__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ProductRatePlan__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Product_RatePlan_Charge_Tier__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Product_RatePlan_Charge_Tier__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__R00N40000001MFW5EAM__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__R00N40000001mFW5EAM__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__RatePlan_Charge_Tier__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__RatePlan_Charge_Tier__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__RecurringPeriod__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__RecurringPeriod__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__RevRecCode__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__RevRecCode__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__TaxCode__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__TaxCode__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__UOM__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__UOM__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Upto_How_Many_Periods__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Upto_How_Many_Periods__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__ZUnitOfMeasure__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ZUnitOfMeasure__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__ZUnitOfMeasure__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ZUnitOfMeasure__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ZUnitOfMeasure__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__ZUom_Id__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ZUom_Id__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__ZuoraId__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ZuoraId__c"));
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
