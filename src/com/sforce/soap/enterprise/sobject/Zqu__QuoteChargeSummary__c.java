/**
 * Zqu__QuoteChargeSummary__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Zqu__QuoteChargeSummary__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult attachedContentDocuments;

    private com.sforce.soap.enterprise.QueryResult attachments;

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

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private com.sforce.soap.enterprise.QueryResult recordAssociatedGroups;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult topicAssignments;

    private com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess;

    private java.lang.Boolean zqu__Apply_Discount_To_One_Time_Charges__c;

    private java.lang.Boolean zqu__Apply_Discount_To_Recurring_Charges__c;

    private java.lang.Boolean zqu__Apply_Discount_To_Usage_Charges__c;

    private java.lang.String zqu__ChangeLog__c;

    private java.lang.String zqu__Description__c;

    private java.lang.String zqu__Discount_Level__c;

    private java.lang.Double zqu__Discount__c;

    private java.lang.Double zqu__EffectivePrice__c;

    private java.lang.Double zqu__IncludedUnits__c;

    private java.lang.Double zqu__ListPrice__c;

    private java.lang.Double zqu__ListTotal__c;

    private java.lang.Double zqu__MRR__c;

    private java.lang.String zqu__Model__c;

    private java.lang.String zqu__Opportunity__c;

    private com.sforce.soap.enterprise.sobject.Opportunity zqu__Opportunity__r;

    private java.lang.String zqu__Period__c;

    private java.lang.String zqu__Product_Name__c;

    private java.lang.String zqu__Product_Rate_Plan_Name__c;

    private java.lang.Double zqu__Quantity__c;

    private java.lang.String zqu__QuoteRatePlanCharge__c;

    private com.sforce.soap.enterprise.sobject.Zqu__QuoteRatePlanCharge__c zqu__QuoteRatePlanCharge__r;

    private java.lang.String zqu__QuoteRatePlan__c;

    private com.sforce.soap.enterprise.sobject.Zqu__QuoteRatePlan__c zqu__QuoteRatePlan__r;

    private java.lang.String zqu__Quote_Charge__c;

    private com.sforce.soap.enterprise.sobject.Zqu__QuoteCharge__c zqu__Quote_Charge__r;

    private java.lang.Double zqu__TCV__c;

    private java.lang.Double zqu__TotalPrice__c;

    private java.lang.String zqu__Type__c;

    private java.lang.String zqu__UOM__c;

    private java.lang.Double zqu__Upto_How_Many_Periods__c;

    public Zqu__QuoteChargeSummary__c() {
    }

    public Zqu__QuoteChargeSummary__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult attachedContentDocuments,
           com.sforce.soap.enterprise.QueryResult attachments,
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
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           com.sforce.soap.enterprise.QueryResult recordAssociatedGroups,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult topicAssignments,
           com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess,
           java.lang.Boolean zqu__Apply_Discount_To_One_Time_Charges__c,
           java.lang.Boolean zqu__Apply_Discount_To_Recurring_Charges__c,
           java.lang.Boolean zqu__Apply_Discount_To_Usage_Charges__c,
           java.lang.String zqu__ChangeLog__c,
           java.lang.String zqu__Description__c,
           java.lang.String zqu__Discount_Level__c,
           java.lang.Double zqu__Discount__c,
           java.lang.Double zqu__EffectivePrice__c,
           java.lang.Double zqu__IncludedUnits__c,
           java.lang.Double zqu__ListPrice__c,
           java.lang.Double zqu__ListTotal__c,
           java.lang.Double zqu__MRR__c,
           java.lang.String zqu__Model__c,
           java.lang.String zqu__Opportunity__c,
           com.sforce.soap.enterprise.sobject.Opportunity zqu__Opportunity__r,
           java.lang.String zqu__Period__c,
           java.lang.String zqu__Product_Name__c,
           java.lang.String zqu__Product_Rate_Plan_Name__c,
           java.lang.Double zqu__Quantity__c,
           java.lang.String zqu__QuoteRatePlanCharge__c,
           com.sforce.soap.enterprise.sobject.Zqu__QuoteRatePlanCharge__c zqu__QuoteRatePlanCharge__r,
           java.lang.String zqu__QuoteRatePlan__c,
           com.sforce.soap.enterprise.sobject.Zqu__QuoteRatePlan__c zqu__QuoteRatePlan__r,
           java.lang.String zqu__Quote_Charge__c,
           com.sforce.soap.enterprise.sobject.Zqu__QuoteCharge__c zqu__Quote_Charge__r,
           java.lang.Double zqu__TCV__c,
           java.lang.Double zqu__TotalPrice__c,
           java.lang.String zqu__Type__c,
           java.lang.String zqu__UOM__c,
           java.lang.Double zqu__Upto_How_Many_Periods__c) {
        super(
            fieldsToNull,
            id);
        this.attachedContentDocuments = attachedContentDocuments;
        this.attachments = attachments;
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
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.recordAssociatedGroups = recordAssociatedGroups;
        this.systemModstamp = systemModstamp;
        this.topicAssignments = topicAssignments;
        this.userRecordAccess = userRecordAccess;
        this.zqu__Apply_Discount_To_One_Time_Charges__c = zqu__Apply_Discount_To_One_Time_Charges__c;
        this.zqu__Apply_Discount_To_Recurring_Charges__c = zqu__Apply_Discount_To_Recurring_Charges__c;
        this.zqu__Apply_Discount_To_Usage_Charges__c = zqu__Apply_Discount_To_Usage_Charges__c;
        this.zqu__ChangeLog__c = zqu__ChangeLog__c;
        this.zqu__Description__c = zqu__Description__c;
        this.zqu__Discount_Level__c = zqu__Discount_Level__c;
        this.zqu__Discount__c = zqu__Discount__c;
        this.zqu__EffectivePrice__c = zqu__EffectivePrice__c;
        this.zqu__IncludedUnits__c = zqu__IncludedUnits__c;
        this.zqu__ListPrice__c = zqu__ListPrice__c;
        this.zqu__ListTotal__c = zqu__ListTotal__c;
        this.zqu__MRR__c = zqu__MRR__c;
        this.zqu__Model__c = zqu__Model__c;
        this.zqu__Opportunity__c = zqu__Opportunity__c;
        this.zqu__Opportunity__r = zqu__Opportunity__r;
        this.zqu__Period__c = zqu__Period__c;
        this.zqu__Product_Name__c = zqu__Product_Name__c;
        this.zqu__Product_Rate_Plan_Name__c = zqu__Product_Rate_Plan_Name__c;
        this.zqu__Quantity__c = zqu__Quantity__c;
        this.zqu__QuoteRatePlanCharge__c = zqu__QuoteRatePlanCharge__c;
        this.zqu__QuoteRatePlanCharge__r = zqu__QuoteRatePlanCharge__r;
        this.zqu__QuoteRatePlan__c = zqu__QuoteRatePlan__c;
        this.zqu__QuoteRatePlan__r = zqu__QuoteRatePlan__r;
        this.zqu__Quote_Charge__c = zqu__Quote_Charge__c;
        this.zqu__Quote_Charge__r = zqu__Quote_Charge__r;
        this.zqu__TCV__c = zqu__TCV__c;
        this.zqu__TotalPrice__c = zqu__TotalPrice__c;
        this.zqu__Type__c = zqu__Type__c;
        this.zqu__UOM__c = zqu__UOM__c;
        this.zqu__Upto_How_Many_Periods__c = zqu__Upto_How_Many_Periods__c;
    }


    /**
     * Gets the attachedContentDocuments value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return attachedContentDocuments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachedContentDocuments() {
        return attachedContentDocuments;
    }


    /**
     * Sets the attachedContentDocuments value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param attachedContentDocuments
     */
    public void setAttachedContentDocuments(com.sforce.soap.enterprise.QueryResult attachedContentDocuments) {
        this.attachedContentDocuments = attachedContentDocuments;
    }


    /**
     * Gets the attachments value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the combinedAttachments value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return combinedAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getCombinedAttachments() {
        return combinedAttachments;
    }


    /**
     * Sets the combinedAttachments value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param combinedAttachments
     */
    public void setCombinedAttachments(com.sforce.soap.enterprise.QueryResult combinedAttachments) {
        this.combinedAttachments = combinedAttachments;
    }


    /**
     * Gets the createdBy value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the duplicateRecordItems value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return duplicateRecordItems
     */
    public com.sforce.soap.enterprise.QueryResult getDuplicateRecordItems() {
        return duplicateRecordItems;
    }


    /**
     * Sets the duplicateRecordItems value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param duplicateRecordItems
     */
    public void setDuplicateRecordItems(com.sforce.soap.enterprise.QueryResult duplicateRecordItems) {
        this.duplicateRecordItems = duplicateRecordItems;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the isDeleted value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lookedUpFromActivities value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return lookedUpFromActivities
     */
    public com.sforce.soap.enterprise.QueryResult getLookedUpFromActivities() {
        return lookedUpFromActivities;
    }


    /**
     * Sets the lookedUpFromActivities value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param lookedUpFromActivities
     */
    public void setLookedUpFromActivities(com.sforce.soap.enterprise.QueryResult lookedUpFromActivities) {
        this.lookedUpFromActivities = lookedUpFromActivities;
    }


    /**
     * Gets the name value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the processInstances value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the recordAssociatedGroups value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return recordAssociatedGroups
     */
    public com.sforce.soap.enterprise.QueryResult getRecordAssociatedGroups() {
        return recordAssociatedGroups;
    }


    /**
     * Sets the recordAssociatedGroups value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param recordAssociatedGroups
     */
    public void setRecordAssociatedGroups(com.sforce.soap.enterprise.QueryResult recordAssociatedGroups) {
        this.recordAssociatedGroups = recordAssociatedGroups;
    }


    /**
     * Gets the systemModstamp value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the topicAssignments value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return topicAssignments
     */
    public com.sforce.soap.enterprise.QueryResult getTopicAssignments() {
        return topicAssignments;
    }


    /**
     * Sets the topicAssignments value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param topicAssignments
     */
    public void setTopicAssignments(com.sforce.soap.enterprise.QueryResult topicAssignments) {
        this.topicAssignments = topicAssignments;
    }


    /**
     * Gets the userRecordAccess value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return userRecordAccess
     */
    public com.sforce.soap.enterprise.sobject.UserRecordAccess getUserRecordAccess() {
        return userRecordAccess;
    }


    /**
     * Sets the userRecordAccess value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param userRecordAccess
     */
    public void setUserRecordAccess(com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess) {
        this.userRecordAccess = userRecordAccess;
    }


    /**
     * Gets the zqu__Apply_Discount_To_One_Time_Charges__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return zqu__Apply_Discount_To_One_Time_Charges__c
     */
    public java.lang.Boolean getZqu__Apply_Discount_To_One_Time_Charges__c() {
        return zqu__Apply_Discount_To_One_Time_Charges__c;
    }


    /**
     * Sets the zqu__Apply_Discount_To_One_Time_Charges__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param zqu__Apply_Discount_To_One_Time_Charges__c
     */
    public void setZqu__Apply_Discount_To_One_Time_Charges__c(java.lang.Boolean zqu__Apply_Discount_To_One_Time_Charges__c) {
        this.zqu__Apply_Discount_To_One_Time_Charges__c = zqu__Apply_Discount_To_One_Time_Charges__c;
    }


    /**
     * Gets the zqu__Apply_Discount_To_Recurring_Charges__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return zqu__Apply_Discount_To_Recurring_Charges__c
     */
    public java.lang.Boolean getZqu__Apply_Discount_To_Recurring_Charges__c() {
        return zqu__Apply_Discount_To_Recurring_Charges__c;
    }


    /**
     * Sets the zqu__Apply_Discount_To_Recurring_Charges__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param zqu__Apply_Discount_To_Recurring_Charges__c
     */
    public void setZqu__Apply_Discount_To_Recurring_Charges__c(java.lang.Boolean zqu__Apply_Discount_To_Recurring_Charges__c) {
        this.zqu__Apply_Discount_To_Recurring_Charges__c = zqu__Apply_Discount_To_Recurring_Charges__c;
    }


    /**
     * Gets the zqu__Apply_Discount_To_Usage_Charges__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return zqu__Apply_Discount_To_Usage_Charges__c
     */
    public java.lang.Boolean getZqu__Apply_Discount_To_Usage_Charges__c() {
        return zqu__Apply_Discount_To_Usage_Charges__c;
    }


    /**
     * Sets the zqu__Apply_Discount_To_Usage_Charges__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param zqu__Apply_Discount_To_Usage_Charges__c
     */
    public void setZqu__Apply_Discount_To_Usage_Charges__c(java.lang.Boolean zqu__Apply_Discount_To_Usage_Charges__c) {
        this.zqu__Apply_Discount_To_Usage_Charges__c = zqu__Apply_Discount_To_Usage_Charges__c;
    }


    /**
     * Gets the zqu__ChangeLog__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return zqu__ChangeLog__c
     */
    public java.lang.String getZqu__ChangeLog__c() {
        return zqu__ChangeLog__c;
    }


    /**
     * Sets the zqu__ChangeLog__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param zqu__ChangeLog__c
     */
    public void setZqu__ChangeLog__c(java.lang.String zqu__ChangeLog__c) {
        this.zqu__ChangeLog__c = zqu__ChangeLog__c;
    }


    /**
     * Gets the zqu__Description__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return zqu__Description__c
     */
    public java.lang.String getZqu__Description__c() {
        return zqu__Description__c;
    }


    /**
     * Sets the zqu__Description__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param zqu__Description__c
     */
    public void setZqu__Description__c(java.lang.String zqu__Description__c) {
        this.zqu__Description__c = zqu__Description__c;
    }


    /**
     * Gets the zqu__Discount_Level__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return zqu__Discount_Level__c
     */
    public java.lang.String getZqu__Discount_Level__c() {
        return zqu__Discount_Level__c;
    }


    /**
     * Sets the zqu__Discount_Level__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param zqu__Discount_Level__c
     */
    public void setZqu__Discount_Level__c(java.lang.String zqu__Discount_Level__c) {
        this.zqu__Discount_Level__c = zqu__Discount_Level__c;
    }


    /**
     * Gets the zqu__Discount__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return zqu__Discount__c
     */
    public java.lang.Double getZqu__Discount__c() {
        return zqu__Discount__c;
    }


    /**
     * Sets the zqu__Discount__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param zqu__Discount__c
     */
    public void setZqu__Discount__c(java.lang.Double zqu__Discount__c) {
        this.zqu__Discount__c = zqu__Discount__c;
    }


    /**
     * Gets the zqu__EffectivePrice__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return zqu__EffectivePrice__c
     */
    public java.lang.Double getZqu__EffectivePrice__c() {
        return zqu__EffectivePrice__c;
    }


    /**
     * Sets the zqu__EffectivePrice__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param zqu__EffectivePrice__c
     */
    public void setZqu__EffectivePrice__c(java.lang.Double zqu__EffectivePrice__c) {
        this.zqu__EffectivePrice__c = zqu__EffectivePrice__c;
    }


    /**
     * Gets the zqu__IncludedUnits__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return zqu__IncludedUnits__c
     */
    public java.lang.Double getZqu__IncludedUnits__c() {
        return zqu__IncludedUnits__c;
    }


    /**
     * Sets the zqu__IncludedUnits__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param zqu__IncludedUnits__c
     */
    public void setZqu__IncludedUnits__c(java.lang.Double zqu__IncludedUnits__c) {
        this.zqu__IncludedUnits__c = zqu__IncludedUnits__c;
    }


    /**
     * Gets the zqu__ListPrice__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return zqu__ListPrice__c
     */
    public java.lang.Double getZqu__ListPrice__c() {
        return zqu__ListPrice__c;
    }


    /**
     * Sets the zqu__ListPrice__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param zqu__ListPrice__c
     */
    public void setZqu__ListPrice__c(java.lang.Double zqu__ListPrice__c) {
        this.zqu__ListPrice__c = zqu__ListPrice__c;
    }


    /**
     * Gets the zqu__ListTotal__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return zqu__ListTotal__c
     */
    public java.lang.Double getZqu__ListTotal__c() {
        return zqu__ListTotal__c;
    }


    /**
     * Sets the zqu__ListTotal__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param zqu__ListTotal__c
     */
    public void setZqu__ListTotal__c(java.lang.Double zqu__ListTotal__c) {
        this.zqu__ListTotal__c = zqu__ListTotal__c;
    }


    /**
     * Gets the zqu__MRR__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return zqu__MRR__c
     */
    public java.lang.Double getZqu__MRR__c() {
        return zqu__MRR__c;
    }


    /**
     * Sets the zqu__MRR__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param zqu__MRR__c
     */
    public void setZqu__MRR__c(java.lang.Double zqu__MRR__c) {
        this.zqu__MRR__c = zqu__MRR__c;
    }


    /**
     * Gets the zqu__Model__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return zqu__Model__c
     */
    public java.lang.String getZqu__Model__c() {
        return zqu__Model__c;
    }


    /**
     * Sets the zqu__Model__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param zqu__Model__c
     */
    public void setZqu__Model__c(java.lang.String zqu__Model__c) {
        this.zqu__Model__c = zqu__Model__c;
    }


    /**
     * Gets the zqu__Opportunity__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return zqu__Opportunity__c
     */
    public java.lang.String getZqu__Opportunity__c() {
        return zqu__Opportunity__c;
    }


    /**
     * Sets the zqu__Opportunity__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param zqu__Opportunity__c
     */
    public void setZqu__Opportunity__c(java.lang.String zqu__Opportunity__c) {
        this.zqu__Opportunity__c = zqu__Opportunity__c;
    }


    /**
     * Gets the zqu__Opportunity__r value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return zqu__Opportunity__r
     */
    public com.sforce.soap.enterprise.sobject.Opportunity getZqu__Opportunity__r() {
        return zqu__Opportunity__r;
    }


    /**
     * Sets the zqu__Opportunity__r value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param zqu__Opportunity__r
     */
    public void setZqu__Opportunity__r(com.sforce.soap.enterprise.sobject.Opportunity zqu__Opportunity__r) {
        this.zqu__Opportunity__r = zqu__Opportunity__r;
    }


    /**
     * Gets the zqu__Period__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return zqu__Period__c
     */
    public java.lang.String getZqu__Period__c() {
        return zqu__Period__c;
    }


    /**
     * Sets the zqu__Period__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param zqu__Period__c
     */
    public void setZqu__Period__c(java.lang.String zqu__Period__c) {
        this.zqu__Period__c = zqu__Period__c;
    }


    /**
     * Gets the zqu__Product_Name__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return zqu__Product_Name__c
     */
    public java.lang.String getZqu__Product_Name__c() {
        return zqu__Product_Name__c;
    }


    /**
     * Sets the zqu__Product_Name__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param zqu__Product_Name__c
     */
    public void setZqu__Product_Name__c(java.lang.String zqu__Product_Name__c) {
        this.zqu__Product_Name__c = zqu__Product_Name__c;
    }


    /**
     * Gets the zqu__Product_Rate_Plan_Name__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return zqu__Product_Rate_Plan_Name__c
     */
    public java.lang.String getZqu__Product_Rate_Plan_Name__c() {
        return zqu__Product_Rate_Plan_Name__c;
    }


    /**
     * Sets the zqu__Product_Rate_Plan_Name__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param zqu__Product_Rate_Plan_Name__c
     */
    public void setZqu__Product_Rate_Plan_Name__c(java.lang.String zqu__Product_Rate_Plan_Name__c) {
        this.zqu__Product_Rate_Plan_Name__c = zqu__Product_Rate_Plan_Name__c;
    }


    /**
     * Gets the zqu__Quantity__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return zqu__Quantity__c
     */
    public java.lang.Double getZqu__Quantity__c() {
        return zqu__Quantity__c;
    }


    /**
     * Sets the zqu__Quantity__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param zqu__Quantity__c
     */
    public void setZqu__Quantity__c(java.lang.Double zqu__Quantity__c) {
        this.zqu__Quantity__c = zqu__Quantity__c;
    }


    /**
     * Gets the zqu__QuoteRatePlanCharge__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return zqu__QuoteRatePlanCharge__c
     */
    public java.lang.String getZqu__QuoteRatePlanCharge__c() {
        return zqu__QuoteRatePlanCharge__c;
    }


    /**
     * Sets the zqu__QuoteRatePlanCharge__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param zqu__QuoteRatePlanCharge__c
     */
    public void setZqu__QuoteRatePlanCharge__c(java.lang.String zqu__QuoteRatePlanCharge__c) {
        this.zqu__QuoteRatePlanCharge__c = zqu__QuoteRatePlanCharge__c;
    }


    /**
     * Gets the zqu__QuoteRatePlanCharge__r value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return zqu__QuoteRatePlanCharge__r
     */
    public com.sforce.soap.enterprise.sobject.Zqu__QuoteRatePlanCharge__c getZqu__QuoteRatePlanCharge__r() {
        return zqu__QuoteRatePlanCharge__r;
    }


    /**
     * Sets the zqu__QuoteRatePlanCharge__r value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param zqu__QuoteRatePlanCharge__r
     */
    public void setZqu__QuoteRatePlanCharge__r(com.sforce.soap.enterprise.sobject.Zqu__QuoteRatePlanCharge__c zqu__QuoteRatePlanCharge__r) {
        this.zqu__QuoteRatePlanCharge__r = zqu__QuoteRatePlanCharge__r;
    }


    /**
     * Gets the zqu__QuoteRatePlan__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return zqu__QuoteRatePlan__c
     */
    public java.lang.String getZqu__QuoteRatePlan__c() {
        return zqu__QuoteRatePlan__c;
    }


    /**
     * Sets the zqu__QuoteRatePlan__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param zqu__QuoteRatePlan__c
     */
    public void setZqu__QuoteRatePlan__c(java.lang.String zqu__QuoteRatePlan__c) {
        this.zqu__QuoteRatePlan__c = zqu__QuoteRatePlan__c;
    }


    /**
     * Gets the zqu__QuoteRatePlan__r value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return zqu__QuoteRatePlan__r
     */
    public com.sforce.soap.enterprise.sobject.Zqu__QuoteRatePlan__c getZqu__QuoteRatePlan__r() {
        return zqu__QuoteRatePlan__r;
    }


    /**
     * Sets the zqu__QuoteRatePlan__r value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param zqu__QuoteRatePlan__r
     */
    public void setZqu__QuoteRatePlan__r(com.sforce.soap.enterprise.sobject.Zqu__QuoteRatePlan__c zqu__QuoteRatePlan__r) {
        this.zqu__QuoteRatePlan__r = zqu__QuoteRatePlan__r;
    }


    /**
     * Gets the zqu__Quote_Charge__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return zqu__Quote_Charge__c
     */
    public java.lang.String getZqu__Quote_Charge__c() {
        return zqu__Quote_Charge__c;
    }


    /**
     * Sets the zqu__Quote_Charge__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param zqu__Quote_Charge__c
     */
    public void setZqu__Quote_Charge__c(java.lang.String zqu__Quote_Charge__c) {
        this.zqu__Quote_Charge__c = zqu__Quote_Charge__c;
    }


    /**
     * Gets the zqu__Quote_Charge__r value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return zqu__Quote_Charge__r
     */
    public com.sforce.soap.enterprise.sobject.Zqu__QuoteCharge__c getZqu__Quote_Charge__r() {
        return zqu__Quote_Charge__r;
    }


    /**
     * Sets the zqu__Quote_Charge__r value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param zqu__Quote_Charge__r
     */
    public void setZqu__Quote_Charge__r(com.sforce.soap.enterprise.sobject.Zqu__QuoteCharge__c zqu__Quote_Charge__r) {
        this.zqu__Quote_Charge__r = zqu__Quote_Charge__r;
    }


    /**
     * Gets the zqu__TCV__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return zqu__TCV__c
     */
    public java.lang.Double getZqu__TCV__c() {
        return zqu__TCV__c;
    }


    /**
     * Sets the zqu__TCV__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param zqu__TCV__c
     */
    public void setZqu__TCV__c(java.lang.Double zqu__TCV__c) {
        this.zqu__TCV__c = zqu__TCV__c;
    }


    /**
     * Gets the zqu__TotalPrice__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return zqu__TotalPrice__c
     */
    public java.lang.Double getZqu__TotalPrice__c() {
        return zqu__TotalPrice__c;
    }


    /**
     * Sets the zqu__TotalPrice__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param zqu__TotalPrice__c
     */
    public void setZqu__TotalPrice__c(java.lang.Double zqu__TotalPrice__c) {
        this.zqu__TotalPrice__c = zqu__TotalPrice__c;
    }


    /**
     * Gets the zqu__Type__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return zqu__Type__c
     */
    public java.lang.String getZqu__Type__c() {
        return zqu__Type__c;
    }


    /**
     * Sets the zqu__Type__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param zqu__Type__c
     */
    public void setZqu__Type__c(java.lang.String zqu__Type__c) {
        this.zqu__Type__c = zqu__Type__c;
    }


    /**
     * Gets the zqu__UOM__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return zqu__UOM__c
     */
    public java.lang.String getZqu__UOM__c() {
        return zqu__UOM__c;
    }


    /**
     * Sets the zqu__UOM__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param zqu__UOM__c
     */
    public void setZqu__UOM__c(java.lang.String zqu__UOM__c) {
        this.zqu__UOM__c = zqu__UOM__c;
    }


    /**
     * Gets the zqu__Upto_How_Many_Periods__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @return zqu__Upto_How_Many_Periods__c
     */
    public java.lang.Double getZqu__Upto_How_Many_Periods__c() {
        return zqu__Upto_How_Many_Periods__c;
    }


    /**
     * Sets the zqu__Upto_How_Many_Periods__c value for this Zqu__QuoteChargeSummary__c.
     * 
     * @param zqu__Upto_How_Many_Periods__c
     */
    public void setZqu__Upto_How_Many_Periods__c(java.lang.Double zqu__Upto_How_Many_Periods__c) {
        this.zqu__Upto_How_Many_Periods__c = zqu__Upto_How_Many_Periods__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Zqu__QuoteChargeSummary__c)) return false;
        Zqu__QuoteChargeSummary__c other = (Zqu__QuoteChargeSummary__c) obj;
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
            ((this.zqu__Apply_Discount_To_One_Time_Charges__c==null && other.getZqu__Apply_Discount_To_One_Time_Charges__c()==null) || 
             (this.zqu__Apply_Discount_To_One_Time_Charges__c!=null &&
              this.zqu__Apply_Discount_To_One_Time_Charges__c.equals(other.getZqu__Apply_Discount_To_One_Time_Charges__c()))) &&
            ((this.zqu__Apply_Discount_To_Recurring_Charges__c==null && other.getZqu__Apply_Discount_To_Recurring_Charges__c()==null) || 
             (this.zqu__Apply_Discount_To_Recurring_Charges__c!=null &&
              this.zqu__Apply_Discount_To_Recurring_Charges__c.equals(other.getZqu__Apply_Discount_To_Recurring_Charges__c()))) &&
            ((this.zqu__Apply_Discount_To_Usage_Charges__c==null && other.getZqu__Apply_Discount_To_Usage_Charges__c()==null) || 
             (this.zqu__Apply_Discount_To_Usage_Charges__c!=null &&
              this.zqu__Apply_Discount_To_Usage_Charges__c.equals(other.getZqu__Apply_Discount_To_Usage_Charges__c()))) &&
            ((this.zqu__ChangeLog__c==null && other.getZqu__ChangeLog__c()==null) || 
             (this.zqu__ChangeLog__c!=null &&
              this.zqu__ChangeLog__c.equals(other.getZqu__ChangeLog__c()))) &&
            ((this.zqu__Description__c==null && other.getZqu__Description__c()==null) || 
             (this.zqu__Description__c!=null &&
              this.zqu__Description__c.equals(other.getZqu__Description__c()))) &&
            ((this.zqu__Discount_Level__c==null && other.getZqu__Discount_Level__c()==null) || 
             (this.zqu__Discount_Level__c!=null &&
              this.zqu__Discount_Level__c.equals(other.getZqu__Discount_Level__c()))) &&
            ((this.zqu__Discount__c==null && other.getZqu__Discount__c()==null) || 
             (this.zqu__Discount__c!=null &&
              this.zqu__Discount__c.equals(other.getZqu__Discount__c()))) &&
            ((this.zqu__EffectivePrice__c==null && other.getZqu__EffectivePrice__c()==null) || 
             (this.zqu__EffectivePrice__c!=null &&
              this.zqu__EffectivePrice__c.equals(other.getZqu__EffectivePrice__c()))) &&
            ((this.zqu__IncludedUnits__c==null && other.getZqu__IncludedUnits__c()==null) || 
             (this.zqu__IncludedUnits__c!=null &&
              this.zqu__IncludedUnits__c.equals(other.getZqu__IncludedUnits__c()))) &&
            ((this.zqu__ListPrice__c==null && other.getZqu__ListPrice__c()==null) || 
             (this.zqu__ListPrice__c!=null &&
              this.zqu__ListPrice__c.equals(other.getZqu__ListPrice__c()))) &&
            ((this.zqu__ListTotal__c==null && other.getZqu__ListTotal__c()==null) || 
             (this.zqu__ListTotal__c!=null &&
              this.zqu__ListTotal__c.equals(other.getZqu__ListTotal__c()))) &&
            ((this.zqu__MRR__c==null && other.getZqu__MRR__c()==null) || 
             (this.zqu__MRR__c!=null &&
              this.zqu__MRR__c.equals(other.getZqu__MRR__c()))) &&
            ((this.zqu__Model__c==null && other.getZqu__Model__c()==null) || 
             (this.zqu__Model__c!=null &&
              this.zqu__Model__c.equals(other.getZqu__Model__c()))) &&
            ((this.zqu__Opportunity__c==null && other.getZqu__Opportunity__c()==null) || 
             (this.zqu__Opportunity__c!=null &&
              this.zqu__Opportunity__c.equals(other.getZqu__Opportunity__c()))) &&
            ((this.zqu__Opportunity__r==null && other.getZqu__Opportunity__r()==null) || 
             (this.zqu__Opportunity__r!=null &&
              this.zqu__Opportunity__r.equals(other.getZqu__Opportunity__r()))) &&
            ((this.zqu__Period__c==null && other.getZqu__Period__c()==null) || 
             (this.zqu__Period__c!=null &&
              this.zqu__Period__c.equals(other.getZqu__Period__c()))) &&
            ((this.zqu__Product_Name__c==null && other.getZqu__Product_Name__c()==null) || 
             (this.zqu__Product_Name__c!=null &&
              this.zqu__Product_Name__c.equals(other.getZqu__Product_Name__c()))) &&
            ((this.zqu__Product_Rate_Plan_Name__c==null && other.getZqu__Product_Rate_Plan_Name__c()==null) || 
             (this.zqu__Product_Rate_Plan_Name__c!=null &&
              this.zqu__Product_Rate_Plan_Name__c.equals(other.getZqu__Product_Rate_Plan_Name__c()))) &&
            ((this.zqu__Quantity__c==null && other.getZqu__Quantity__c()==null) || 
             (this.zqu__Quantity__c!=null &&
              this.zqu__Quantity__c.equals(other.getZqu__Quantity__c()))) &&
            ((this.zqu__QuoteRatePlanCharge__c==null && other.getZqu__QuoteRatePlanCharge__c()==null) || 
             (this.zqu__QuoteRatePlanCharge__c!=null &&
              this.zqu__QuoteRatePlanCharge__c.equals(other.getZqu__QuoteRatePlanCharge__c()))) &&
            ((this.zqu__QuoteRatePlanCharge__r==null && other.getZqu__QuoteRatePlanCharge__r()==null) || 
             (this.zqu__QuoteRatePlanCharge__r!=null &&
              this.zqu__QuoteRatePlanCharge__r.equals(other.getZqu__QuoteRatePlanCharge__r()))) &&
            ((this.zqu__QuoteRatePlan__c==null && other.getZqu__QuoteRatePlan__c()==null) || 
             (this.zqu__QuoteRatePlan__c!=null &&
              this.zqu__QuoteRatePlan__c.equals(other.getZqu__QuoteRatePlan__c()))) &&
            ((this.zqu__QuoteRatePlan__r==null && other.getZqu__QuoteRatePlan__r()==null) || 
             (this.zqu__QuoteRatePlan__r!=null &&
              this.zqu__QuoteRatePlan__r.equals(other.getZqu__QuoteRatePlan__r()))) &&
            ((this.zqu__Quote_Charge__c==null && other.getZqu__Quote_Charge__c()==null) || 
             (this.zqu__Quote_Charge__c!=null &&
              this.zqu__Quote_Charge__c.equals(other.getZqu__Quote_Charge__c()))) &&
            ((this.zqu__Quote_Charge__r==null && other.getZqu__Quote_Charge__r()==null) || 
             (this.zqu__Quote_Charge__r!=null &&
              this.zqu__Quote_Charge__r.equals(other.getZqu__Quote_Charge__r()))) &&
            ((this.zqu__TCV__c==null && other.getZqu__TCV__c()==null) || 
             (this.zqu__TCV__c!=null &&
              this.zqu__TCV__c.equals(other.getZqu__TCV__c()))) &&
            ((this.zqu__TotalPrice__c==null && other.getZqu__TotalPrice__c()==null) || 
             (this.zqu__TotalPrice__c!=null &&
              this.zqu__TotalPrice__c.equals(other.getZqu__TotalPrice__c()))) &&
            ((this.zqu__Type__c==null && other.getZqu__Type__c()==null) || 
             (this.zqu__Type__c!=null &&
              this.zqu__Type__c.equals(other.getZqu__Type__c()))) &&
            ((this.zqu__UOM__c==null && other.getZqu__UOM__c()==null) || 
             (this.zqu__UOM__c!=null &&
              this.zqu__UOM__c.equals(other.getZqu__UOM__c()))) &&
            ((this.zqu__Upto_How_Many_Periods__c==null && other.getZqu__Upto_How_Many_Periods__c()==null) || 
             (this.zqu__Upto_How_Many_Periods__c!=null &&
              this.zqu__Upto_How_Many_Periods__c.equals(other.getZqu__Upto_How_Many_Periods__c())));
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
        if (getZqu__Apply_Discount_To_One_Time_Charges__c() != null) {
            _hashCode += getZqu__Apply_Discount_To_One_Time_Charges__c().hashCode();
        }
        if (getZqu__Apply_Discount_To_Recurring_Charges__c() != null) {
            _hashCode += getZqu__Apply_Discount_To_Recurring_Charges__c().hashCode();
        }
        if (getZqu__Apply_Discount_To_Usage_Charges__c() != null) {
            _hashCode += getZqu__Apply_Discount_To_Usage_Charges__c().hashCode();
        }
        if (getZqu__ChangeLog__c() != null) {
            _hashCode += getZqu__ChangeLog__c().hashCode();
        }
        if (getZqu__Description__c() != null) {
            _hashCode += getZqu__Description__c().hashCode();
        }
        if (getZqu__Discount_Level__c() != null) {
            _hashCode += getZqu__Discount_Level__c().hashCode();
        }
        if (getZqu__Discount__c() != null) {
            _hashCode += getZqu__Discount__c().hashCode();
        }
        if (getZqu__EffectivePrice__c() != null) {
            _hashCode += getZqu__EffectivePrice__c().hashCode();
        }
        if (getZqu__IncludedUnits__c() != null) {
            _hashCode += getZqu__IncludedUnits__c().hashCode();
        }
        if (getZqu__ListPrice__c() != null) {
            _hashCode += getZqu__ListPrice__c().hashCode();
        }
        if (getZqu__ListTotal__c() != null) {
            _hashCode += getZqu__ListTotal__c().hashCode();
        }
        if (getZqu__MRR__c() != null) {
            _hashCode += getZqu__MRR__c().hashCode();
        }
        if (getZqu__Model__c() != null) {
            _hashCode += getZqu__Model__c().hashCode();
        }
        if (getZqu__Opportunity__c() != null) {
            _hashCode += getZqu__Opportunity__c().hashCode();
        }
        if (getZqu__Opportunity__r() != null) {
            _hashCode += getZqu__Opportunity__r().hashCode();
        }
        if (getZqu__Period__c() != null) {
            _hashCode += getZqu__Period__c().hashCode();
        }
        if (getZqu__Product_Name__c() != null) {
            _hashCode += getZqu__Product_Name__c().hashCode();
        }
        if (getZqu__Product_Rate_Plan_Name__c() != null) {
            _hashCode += getZqu__Product_Rate_Plan_Name__c().hashCode();
        }
        if (getZqu__Quantity__c() != null) {
            _hashCode += getZqu__Quantity__c().hashCode();
        }
        if (getZqu__QuoteRatePlanCharge__c() != null) {
            _hashCode += getZqu__QuoteRatePlanCharge__c().hashCode();
        }
        if (getZqu__QuoteRatePlanCharge__r() != null) {
            _hashCode += getZqu__QuoteRatePlanCharge__r().hashCode();
        }
        if (getZqu__QuoteRatePlan__c() != null) {
            _hashCode += getZqu__QuoteRatePlan__c().hashCode();
        }
        if (getZqu__QuoteRatePlan__r() != null) {
            _hashCode += getZqu__QuoteRatePlan__r().hashCode();
        }
        if (getZqu__Quote_Charge__c() != null) {
            _hashCode += getZqu__Quote_Charge__c().hashCode();
        }
        if (getZqu__Quote_Charge__r() != null) {
            _hashCode += getZqu__Quote_Charge__r().hashCode();
        }
        if (getZqu__TCV__c() != null) {
            _hashCode += getZqu__TCV__c().hashCode();
        }
        if (getZqu__TotalPrice__c() != null) {
            _hashCode += getZqu__TotalPrice__c().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Zqu__QuoteChargeSummary__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__QuoteChargeSummary__c"));
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
        elemField.setFieldName("zqu__ChangeLog__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ChangeLog__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("zqu__Discount_Level__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Discount_Level__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Discount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Discount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__EffectivePrice__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__EffectivePrice__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__IncludedUnits__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__IncludedUnits__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("zqu__ListTotal__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ListTotal__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__MRR__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__MRR__c"));
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
        elemField.setFieldName("zqu__Opportunity__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Opportunity__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Opportunity__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Opportunity__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Opportunity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Period__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Period__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Product_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Product_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Product_Rate_Plan_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Product_Rate_Plan_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Quantity__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Quantity__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__QuoteRatePlanCharge__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__QuoteRatePlanCharge__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__QuoteRatePlanCharge__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__QuoteRatePlanCharge__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__QuoteRatePlanCharge__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__QuoteRatePlan__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__QuoteRatePlan__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__QuoteRatePlan__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__QuoteRatePlan__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__QuoteRatePlan__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Quote_Charge__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Quote_Charge__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Quote_Charge__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Quote_Charge__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__QuoteCharge__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__TCV__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__TCV__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__TotalPrice__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__TotalPrice__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
