/**
 * Zuora__SubscriptionProductCharge__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Zuora__SubscriptionProductCharge__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private com.sforce.soap.enterprise.QueryResult attachedContentDocuments;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private com.sforce.soap.enterprise.QueryResult combinedAttachments;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private com.sforce.soap.enterprise.QueryResult duplicateRecordItems;

    private com.sforce.soap.enterprise.QueryResult events;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private java.lang.Boolean isDeleted;

    private java.util.Date lastActivityDate;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private com.sforce.soap.enterprise.QueryResult lookedUpFromActivities;

    private java.lang.String name;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private com.sforce.soap.enterprise.QueryResult openActivities;

    private com.sforce.soap.enterprise.sobject.SObject owner;

    private java.lang.String ownerId;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private com.sforce.soap.enterprise.QueryResult recordAssociatedGroups;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult tasks;

    private com.sforce.soap.enterprise.QueryResult topicAssignments;

    private com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess;

    private java.lang.String zuora__Account__c;

    private com.sforce.soap.enterprise.sobject.Account zuora__Account__r;

    private java.lang.String zuora__AccountingCode__c;

    private java.lang.String zuora__BillingPeriodStartDay__c;

    private java.lang.String zuora__BillingPeriod__c;

    private java.lang.String zuora__ChargeNumber__c;

    private java.lang.String zuora__Description__c;

    private java.util.Date zuora__EffectiveEndDate__c;

    private java.util.Date zuora__EffectiveStartDate__c;

    private java.lang.Double zuora__ExtendedAmount__c;

    private java.lang.String zuora__External_Id__c;

    private java.lang.String zuora__Model__c;

    private java.lang.Double zuora__MonthlyRecurringRevenue__c;

    private java.lang.String zuora__PriceTable__c;

    private java.lang.Double zuora__Price__c;

    private java.lang.String zuora__ProductDescription__c;

    private java.util.Date zuora__ProductEffectiveEndDate_Product__c;

    private java.util.Date zuora__ProductEffectiveEndDate__c;

    private java.lang.String zuora__ProductName_Product__c;

    private java.lang.String zuora__ProductName__c;

    private java.lang.String zuora__ProductSKU_Product__c;

    private java.lang.String zuora__ProductSKU__c;

    private java.lang.String zuora__Product__c;

    private com.sforce.soap.enterprise.sobject.Zuora__Product__c zuora__Product__r;

    private java.lang.Double zuora__Quantity__c;

    private java.lang.String zuora__RatePlanDescription__c;

    private java.util.Date zuora__RatePlanEffectiveEndDate__c;

    private java.lang.String zuora__RatePlanId__c;

    private java.lang.String zuora__RatePlanName__c;

    private java.lang.String zuora__Subscription__c;

    private com.sforce.soap.enterprise.sobject.Zuora__Subscription__c zuora__Subscription__r;

    private java.lang.Double zuora__TotalContractValue__c;

    private java.lang.String zuora__Type__c;

    private java.lang.String zuora__UOM__c;

    private java.lang.String zuora__UOM_formula__c;

    private java.lang.String zuora__UnitOfMeasure__c;

    private com.sforce.soap.enterprise.sobject.Zuora__UnitOfMeasure__c zuora__UnitOfMeasure__r;

    private java.lang.String zuora__Zuora_Id__c;

    public Zuora__SubscriptionProductCharge__c() {
    }

    public Zuora__SubscriptionProductCharge__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           com.sforce.soap.enterprise.QueryResult attachedContentDocuments,
           com.sforce.soap.enterprise.QueryResult attachments,
           com.sforce.soap.enterprise.QueryResult combinedAttachments,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           com.sforce.soap.enterprise.QueryResult duplicateRecordItems,
           com.sforce.soap.enterprise.QueryResult events,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           java.lang.Boolean isDeleted,
           java.util.Date lastActivityDate,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           com.sforce.soap.enterprise.QueryResult lookedUpFromActivities,
           java.lang.String name,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           com.sforce.soap.enterprise.QueryResult openActivities,
           com.sforce.soap.enterprise.sobject.SObject owner,
           java.lang.String ownerId,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           com.sforce.soap.enterprise.QueryResult recordAssociatedGroups,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult tasks,
           com.sforce.soap.enterprise.QueryResult topicAssignments,
           com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess,
           java.lang.String zuora__Account__c,
           com.sforce.soap.enterprise.sobject.Account zuora__Account__r,
           java.lang.String zuora__AccountingCode__c,
           java.lang.String zuora__BillingPeriodStartDay__c,
           java.lang.String zuora__BillingPeriod__c,
           java.lang.String zuora__ChargeNumber__c,
           java.lang.String zuora__Description__c,
           java.util.Date zuora__EffectiveEndDate__c,
           java.util.Date zuora__EffectiveStartDate__c,
           java.lang.Double zuora__ExtendedAmount__c,
           java.lang.String zuora__External_Id__c,
           java.lang.String zuora__Model__c,
           java.lang.Double zuora__MonthlyRecurringRevenue__c,
           java.lang.String zuora__PriceTable__c,
           java.lang.Double zuora__Price__c,
           java.lang.String zuora__ProductDescription__c,
           java.util.Date zuora__ProductEffectiveEndDate_Product__c,
           java.util.Date zuora__ProductEffectiveEndDate__c,
           java.lang.String zuora__ProductName_Product__c,
           java.lang.String zuora__ProductName__c,
           java.lang.String zuora__ProductSKU_Product__c,
           java.lang.String zuora__ProductSKU__c,
           java.lang.String zuora__Product__c,
           com.sforce.soap.enterprise.sobject.Zuora__Product__c zuora__Product__r,
           java.lang.Double zuora__Quantity__c,
           java.lang.String zuora__RatePlanDescription__c,
           java.util.Date zuora__RatePlanEffectiveEndDate__c,
           java.lang.String zuora__RatePlanId__c,
           java.lang.String zuora__RatePlanName__c,
           java.lang.String zuora__Subscription__c,
           com.sforce.soap.enterprise.sobject.Zuora__Subscription__c zuora__Subscription__r,
           java.lang.Double zuora__TotalContractValue__c,
           java.lang.String zuora__Type__c,
           java.lang.String zuora__UOM__c,
           java.lang.String zuora__UOM_formula__c,
           java.lang.String zuora__UnitOfMeasure__c,
           com.sforce.soap.enterprise.sobject.Zuora__UnitOfMeasure__c zuora__UnitOfMeasure__r,
           java.lang.String zuora__Zuora_Id__c) {
        super(
            fieldsToNull,
            id);
        this.activityHistories = activityHistories;
        this.attachedContentDocuments = attachedContentDocuments;
        this.attachments = attachments;
        this.combinedAttachments = combinedAttachments;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.duplicateRecordItems = duplicateRecordItems;
        this.events = events;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.isDeleted = isDeleted;
        this.lastActivityDate = lastActivityDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.lookedUpFromActivities = lookedUpFromActivities;
        this.name = name;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.openActivities = openActivities;
        this.owner = owner;
        this.ownerId = ownerId;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.recordAssociatedGroups = recordAssociatedGroups;
        this.systemModstamp = systemModstamp;
        this.tasks = tasks;
        this.topicAssignments = topicAssignments;
        this.userRecordAccess = userRecordAccess;
        this.zuora__Account__c = zuora__Account__c;
        this.zuora__Account__r = zuora__Account__r;
        this.zuora__AccountingCode__c = zuora__AccountingCode__c;
        this.zuora__BillingPeriodStartDay__c = zuora__BillingPeriodStartDay__c;
        this.zuora__BillingPeriod__c = zuora__BillingPeriod__c;
        this.zuora__ChargeNumber__c = zuora__ChargeNumber__c;
        this.zuora__Description__c = zuora__Description__c;
        this.zuora__EffectiveEndDate__c = zuora__EffectiveEndDate__c;
        this.zuora__EffectiveStartDate__c = zuora__EffectiveStartDate__c;
        this.zuora__ExtendedAmount__c = zuora__ExtendedAmount__c;
        this.zuora__External_Id__c = zuora__External_Id__c;
        this.zuora__Model__c = zuora__Model__c;
        this.zuora__MonthlyRecurringRevenue__c = zuora__MonthlyRecurringRevenue__c;
        this.zuora__PriceTable__c = zuora__PriceTable__c;
        this.zuora__Price__c = zuora__Price__c;
        this.zuora__ProductDescription__c = zuora__ProductDescription__c;
        this.zuora__ProductEffectiveEndDate_Product__c = zuora__ProductEffectiveEndDate_Product__c;
        this.zuora__ProductEffectiveEndDate__c = zuora__ProductEffectiveEndDate__c;
        this.zuora__ProductName_Product__c = zuora__ProductName_Product__c;
        this.zuora__ProductName__c = zuora__ProductName__c;
        this.zuora__ProductSKU_Product__c = zuora__ProductSKU_Product__c;
        this.zuora__ProductSKU__c = zuora__ProductSKU__c;
        this.zuora__Product__c = zuora__Product__c;
        this.zuora__Product__r = zuora__Product__r;
        this.zuora__Quantity__c = zuora__Quantity__c;
        this.zuora__RatePlanDescription__c = zuora__RatePlanDescription__c;
        this.zuora__RatePlanEffectiveEndDate__c = zuora__RatePlanEffectiveEndDate__c;
        this.zuora__RatePlanId__c = zuora__RatePlanId__c;
        this.zuora__RatePlanName__c = zuora__RatePlanName__c;
        this.zuora__Subscription__c = zuora__Subscription__c;
        this.zuora__Subscription__r = zuora__Subscription__r;
        this.zuora__TotalContractValue__c = zuora__TotalContractValue__c;
        this.zuora__Type__c = zuora__Type__c;
        this.zuora__UOM__c = zuora__UOM__c;
        this.zuora__UOM_formula__c = zuora__UOM_formula__c;
        this.zuora__UnitOfMeasure__c = zuora__UnitOfMeasure__c;
        this.zuora__UnitOfMeasure__r = zuora__UnitOfMeasure__r;
        this.zuora__Zuora_Id__c = zuora__Zuora_Id__c;
    }


    /**
     * Gets the activityHistories value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the attachedContentDocuments value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return attachedContentDocuments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachedContentDocuments() {
        return attachedContentDocuments;
    }


    /**
     * Sets the attachedContentDocuments value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param attachedContentDocuments
     */
    public void setAttachedContentDocuments(com.sforce.soap.enterprise.QueryResult attachedContentDocuments) {
        this.attachedContentDocuments = attachedContentDocuments;
    }


    /**
     * Gets the attachments value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the combinedAttachments value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return combinedAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getCombinedAttachments() {
        return combinedAttachments;
    }


    /**
     * Sets the combinedAttachments value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param combinedAttachments
     */
    public void setCombinedAttachments(com.sforce.soap.enterprise.QueryResult combinedAttachments) {
        this.combinedAttachments = combinedAttachments;
    }


    /**
     * Gets the createdBy value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the duplicateRecordItems value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return duplicateRecordItems
     */
    public com.sforce.soap.enterprise.QueryResult getDuplicateRecordItems() {
        return duplicateRecordItems;
    }


    /**
     * Sets the duplicateRecordItems value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param duplicateRecordItems
     */
    public void setDuplicateRecordItems(com.sforce.soap.enterprise.QueryResult duplicateRecordItems) {
        this.duplicateRecordItems = duplicateRecordItems;
    }


    /**
     * Gets the events value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the isDeleted value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastActivityDate value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lookedUpFromActivities value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return lookedUpFromActivities
     */
    public com.sforce.soap.enterprise.QueryResult getLookedUpFromActivities() {
        return lookedUpFromActivities;
    }


    /**
     * Sets the lookedUpFromActivities value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param lookedUpFromActivities
     */
    public void setLookedUpFromActivities(com.sforce.soap.enterprise.QueryResult lookedUpFromActivities) {
        this.lookedUpFromActivities = lookedUpFromActivities;
    }


    /**
     * Gets the name value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the openActivities value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the owner value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.SObject getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.SObject owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the processInstances value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the recordAssociatedGroups value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return recordAssociatedGroups
     */
    public com.sforce.soap.enterprise.QueryResult getRecordAssociatedGroups() {
        return recordAssociatedGroups;
    }


    /**
     * Sets the recordAssociatedGroups value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param recordAssociatedGroups
     */
    public void setRecordAssociatedGroups(com.sforce.soap.enterprise.QueryResult recordAssociatedGroups) {
        this.recordAssociatedGroups = recordAssociatedGroups;
    }


    /**
     * Gets the systemModstamp value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the topicAssignments value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return topicAssignments
     */
    public com.sforce.soap.enterprise.QueryResult getTopicAssignments() {
        return topicAssignments;
    }


    /**
     * Sets the topicAssignments value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param topicAssignments
     */
    public void setTopicAssignments(com.sforce.soap.enterprise.QueryResult topicAssignments) {
        this.topicAssignments = topicAssignments;
    }


    /**
     * Gets the userRecordAccess value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return userRecordAccess
     */
    public com.sforce.soap.enterprise.sobject.UserRecordAccess getUserRecordAccess() {
        return userRecordAccess;
    }


    /**
     * Sets the userRecordAccess value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param userRecordAccess
     */
    public void setUserRecordAccess(com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess) {
        this.userRecordAccess = userRecordAccess;
    }


    /**
     * Gets the zuora__Account__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return zuora__Account__c
     */
    public java.lang.String getZuora__Account__c() {
        return zuora__Account__c;
    }


    /**
     * Sets the zuora__Account__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param zuora__Account__c
     */
    public void setZuora__Account__c(java.lang.String zuora__Account__c) {
        this.zuora__Account__c = zuora__Account__c;
    }


    /**
     * Gets the zuora__Account__r value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return zuora__Account__r
     */
    public com.sforce.soap.enterprise.sobject.Account getZuora__Account__r() {
        return zuora__Account__r;
    }


    /**
     * Sets the zuora__Account__r value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param zuora__Account__r
     */
    public void setZuora__Account__r(com.sforce.soap.enterprise.sobject.Account zuora__Account__r) {
        this.zuora__Account__r = zuora__Account__r;
    }


    /**
     * Gets the zuora__AccountingCode__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return zuora__AccountingCode__c
     */
    public java.lang.String getZuora__AccountingCode__c() {
        return zuora__AccountingCode__c;
    }


    /**
     * Sets the zuora__AccountingCode__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param zuora__AccountingCode__c
     */
    public void setZuora__AccountingCode__c(java.lang.String zuora__AccountingCode__c) {
        this.zuora__AccountingCode__c = zuora__AccountingCode__c;
    }


    /**
     * Gets the zuora__BillingPeriodStartDay__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return zuora__BillingPeriodStartDay__c
     */
    public java.lang.String getZuora__BillingPeriodStartDay__c() {
        return zuora__BillingPeriodStartDay__c;
    }


    /**
     * Sets the zuora__BillingPeriodStartDay__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param zuora__BillingPeriodStartDay__c
     */
    public void setZuora__BillingPeriodStartDay__c(java.lang.String zuora__BillingPeriodStartDay__c) {
        this.zuora__BillingPeriodStartDay__c = zuora__BillingPeriodStartDay__c;
    }


    /**
     * Gets the zuora__BillingPeriod__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return zuora__BillingPeriod__c
     */
    public java.lang.String getZuora__BillingPeriod__c() {
        return zuora__BillingPeriod__c;
    }


    /**
     * Sets the zuora__BillingPeriod__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param zuora__BillingPeriod__c
     */
    public void setZuora__BillingPeriod__c(java.lang.String zuora__BillingPeriod__c) {
        this.zuora__BillingPeriod__c = zuora__BillingPeriod__c;
    }


    /**
     * Gets the zuora__ChargeNumber__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return zuora__ChargeNumber__c
     */
    public java.lang.String getZuora__ChargeNumber__c() {
        return zuora__ChargeNumber__c;
    }


    /**
     * Sets the zuora__ChargeNumber__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param zuora__ChargeNumber__c
     */
    public void setZuora__ChargeNumber__c(java.lang.String zuora__ChargeNumber__c) {
        this.zuora__ChargeNumber__c = zuora__ChargeNumber__c;
    }


    /**
     * Gets the zuora__Description__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return zuora__Description__c
     */
    public java.lang.String getZuora__Description__c() {
        return zuora__Description__c;
    }


    /**
     * Sets the zuora__Description__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param zuora__Description__c
     */
    public void setZuora__Description__c(java.lang.String zuora__Description__c) {
        this.zuora__Description__c = zuora__Description__c;
    }


    /**
     * Gets the zuora__EffectiveEndDate__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return zuora__EffectiveEndDate__c
     */
    public java.util.Date getZuora__EffectiveEndDate__c() {
        return zuora__EffectiveEndDate__c;
    }


    /**
     * Sets the zuora__EffectiveEndDate__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param zuora__EffectiveEndDate__c
     */
    public void setZuora__EffectiveEndDate__c(java.util.Date zuora__EffectiveEndDate__c) {
        this.zuora__EffectiveEndDate__c = zuora__EffectiveEndDate__c;
    }


    /**
     * Gets the zuora__EffectiveStartDate__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return zuora__EffectiveStartDate__c
     */
    public java.util.Date getZuora__EffectiveStartDate__c() {
        return zuora__EffectiveStartDate__c;
    }


    /**
     * Sets the zuora__EffectiveStartDate__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param zuora__EffectiveStartDate__c
     */
    public void setZuora__EffectiveStartDate__c(java.util.Date zuora__EffectiveStartDate__c) {
        this.zuora__EffectiveStartDate__c = zuora__EffectiveStartDate__c;
    }


    /**
     * Gets the zuora__ExtendedAmount__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return zuora__ExtendedAmount__c
     */
    public java.lang.Double getZuora__ExtendedAmount__c() {
        return zuora__ExtendedAmount__c;
    }


    /**
     * Sets the zuora__ExtendedAmount__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param zuora__ExtendedAmount__c
     */
    public void setZuora__ExtendedAmount__c(java.lang.Double zuora__ExtendedAmount__c) {
        this.zuora__ExtendedAmount__c = zuora__ExtendedAmount__c;
    }


    /**
     * Gets the zuora__External_Id__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return zuora__External_Id__c
     */
    public java.lang.String getZuora__External_Id__c() {
        return zuora__External_Id__c;
    }


    /**
     * Sets the zuora__External_Id__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param zuora__External_Id__c
     */
    public void setZuora__External_Id__c(java.lang.String zuora__External_Id__c) {
        this.zuora__External_Id__c = zuora__External_Id__c;
    }


    /**
     * Gets the zuora__Model__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return zuora__Model__c
     */
    public java.lang.String getZuora__Model__c() {
        return zuora__Model__c;
    }


    /**
     * Sets the zuora__Model__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param zuora__Model__c
     */
    public void setZuora__Model__c(java.lang.String zuora__Model__c) {
        this.zuora__Model__c = zuora__Model__c;
    }


    /**
     * Gets the zuora__MonthlyRecurringRevenue__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return zuora__MonthlyRecurringRevenue__c
     */
    public java.lang.Double getZuora__MonthlyRecurringRevenue__c() {
        return zuora__MonthlyRecurringRevenue__c;
    }


    /**
     * Sets the zuora__MonthlyRecurringRevenue__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param zuora__MonthlyRecurringRevenue__c
     */
    public void setZuora__MonthlyRecurringRevenue__c(java.lang.Double zuora__MonthlyRecurringRevenue__c) {
        this.zuora__MonthlyRecurringRevenue__c = zuora__MonthlyRecurringRevenue__c;
    }


    /**
     * Gets the zuora__PriceTable__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return zuora__PriceTable__c
     */
    public java.lang.String getZuora__PriceTable__c() {
        return zuora__PriceTable__c;
    }


    /**
     * Sets the zuora__PriceTable__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param zuora__PriceTable__c
     */
    public void setZuora__PriceTable__c(java.lang.String zuora__PriceTable__c) {
        this.zuora__PriceTable__c = zuora__PriceTable__c;
    }


    /**
     * Gets the zuora__Price__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return zuora__Price__c
     */
    public java.lang.Double getZuora__Price__c() {
        return zuora__Price__c;
    }


    /**
     * Sets the zuora__Price__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param zuora__Price__c
     */
    public void setZuora__Price__c(java.lang.Double zuora__Price__c) {
        this.zuora__Price__c = zuora__Price__c;
    }


    /**
     * Gets the zuora__ProductDescription__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return zuora__ProductDescription__c
     */
    public java.lang.String getZuora__ProductDescription__c() {
        return zuora__ProductDescription__c;
    }


    /**
     * Sets the zuora__ProductDescription__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param zuora__ProductDescription__c
     */
    public void setZuora__ProductDescription__c(java.lang.String zuora__ProductDescription__c) {
        this.zuora__ProductDescription__c = zuora__ProductDescription__c;
    }


    /**
     * Gets the zuora__ProductEffectiveEndDate_Product__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return zuora__ProductEffectiveEndDate_Product__c
     */
    public java.util.Date getZuora__ProductEffectiveEndDate_Product__c() {
        return zuora__ProductEffectiveEndDate_Product__c;
    }


    /**
     * Sets the zuora__ProductEffectiveEndDate_Product__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param zuora__ProductEffectiveEndDate_Product__c
     */
    public void setZuora__ProductEffectiveEndDate_Product__c(java.util.Date zuora__ProductEffectiveEndDate_Product__c) {
        this.zuora__ProductEffectiveEndDate_Product__c = zuora__ProductEffectiveEndDate_Product__c;
    }


    /**
     * Gets the zuora__ProductEffectiveEndDate__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return zuora__ProductEffectiveEndDate__c
     */
    public java.util.Date getZuora__ProductEffectiveEndDate__c() {
        return zuora__ProductEffectiveEndDate__c;
    }


    /**
     * Sets the zuora__ProductEffectiveEndDate__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param zuora__ProductEffectiveEndDate__c
     */
    public void setZuora__ProductEffectiveEndDate__c(java.util.Date zuora__ProductEffectiveEndDate__c) {
        this.zuora__ProductEffectiveEndDate__c = zuora__ProductEffectiveEndDate__c;
    }


    /**
     * Gets the zuora__ProductName_Product__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return zuora__ProductName_Product__c
     */
    public java.lang.String getZuora__ProductName_Product__c() {
        return zuora__ProductName_Product__c;
    }


    /**
     * Sets the zuora__ProductName_Product__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param zuora__ProductName_Product__c
     */
    public void setZuora__ProductName_Product__c(java.lang.String zuora__ProductName_Product__c) {
        this.zuora__ProductName_Product__c = zuora__ProductName_Product__c;
    }


    /**
     * Gets the zuora__ProductName__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return zuora__ProductName__c
     */
    public java.lang.String getZuora__ProductName__c() {
        return zuora__ProductName__c;
    }


    /**
     * Sets the zuora__ProductName__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param zuora__ProductName__c
     */
    public void setZuora__ProductName__c(java.lang.String zuora__ProductName__c) {
        this.zuora__ProductName__c = zuora__ProductName__c;
    }


    /**
     * Gets the zuora__ProductSKU_Product__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return zuora__ProductSKU_Product__c
     */
    public java.lang.String getZuora__ProductSKU_Product__c() {
        return zuora__ProductSKU_Product__c;
    }


    /**
     * Sets the zuora__ProductSKU_Product__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param zuora__ProductSKU_Product__c
     */
    public void setZuora__ProductSKU_Product__c(java.lang.String zuora__ProductSKU_Product__c) {
        this.zuora__ProductSKU_Product__c = zuora__ProductSKU_Product__c;
    }


    /**
     * Gets the zuora__ProductSKU__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return zuora__ProductSKU__c
     */
    public java.lang.String getZuora__ProductSKU__c() {
        return zuora__ProductSKU__c;
    }


    /**
     * Sets the zuora__ProductSKU__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param zuora__ProductSKU__c
     */
    public void setZuora__ProductSKU__c(java.lang.String zuora__ProductSKU__c) {
        this.zuora__ProductSKU__c = zuora__ProductSKU__c;
    }


    /**
     * Gets the zuora__Product__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return zuora__Product__c
     */
    public java.lang.String getZuora__Product__c() {
        return zuora__Product__c;
    }


    /**
     * Sets the zuora__Product__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param zuora__Product__c
     */
    public void setZuora__Product__c(java.lang.String zuora__Product__c) {
        this.zuora__Product__c = zuora__Product__c;
    }


    /**
     * Gets the zuora__Product__r value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return zuora__Product__r
     */
    public com.sforce.soap.enterprise.sobject.Zuora__Product__c getZuora__Product__r() {
        return zuora__Product__r;
    }


    /**
     * Sets the zuora__Product__r value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param zuora__Product__r
     */
    public void setZuora__Product__r(com.sforce.soap.enterprise.sobject.Zuora__Product__c zuora__Product__r) {
        this.zuora__Product__r = zuora__Product__r;
    }


    /**
     * Gets the zuora__Quantity__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return zuora__Quantity__c
     */
    public java.lang.Double getZuora__Quantity__c() {
        return zuora__Quantity__c;
    }


    /**
     * Sets the zuora__Quantity__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param zuora__Quantity__c
     */
    public void setZuora__Quantity__c(java.lang.Double zuora__Quantity__c) {
        this.zuora__Quantity__c = zuora__Quantity__c;
    }


    /**
     * Gets the zuora__RatePlanDescription__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return zuora__RatePlanDescription__c
     */
    public java.lang.String getZuora__RatePlanDescription__c() {
        return zuora__RatePlanDescription__c;
    }


    /**
     * Sets the zuora__RatePlanDescription__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param zuora__RatePlanDescription__c
     */
    public void setZuora__RatePlanDescription__c(java.lang.String zuora__RatePlanDescription__c) {
        this.zuora__RatePlanDescription__c = zuora__RatePlanDescription__c;
    }


    /**
     * Gets the zuora__RatePlanEffectiveEndDate__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return zuora__RatePlanEffectiveEndDate__c
     */
    public java.util.Date getZuora__RatePlanEffectiveEndDate__c() {
        return zuora__RatePlanEffectiveEndDate__c;
    }


    /**
     * Sets the zuora__RatePlanEffectiveEndDate__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param zuora__RatePlanEffectiveEndDate__c
     */
    public void setZuora__RatePlanEffectiveEndDate__c(java.util.Date zuora__RatePlanEffectiveEndDate__c) {
        this.zuora__RatePlanEffectiveEndDate__c = zuora__RatePlanEffectiveEndDate__c;
    }


    /**
     * Gets the zuora__RatePlanId__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return zuora__RatePlanId__c
     */
    public java.lang.String getZuora__RatePlanId__c() {
        return zuora__RatePlanId__c;
    }


    /**
     * Sets the zuora__RatePlanId__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param zuora__RatePlanId__c
     */
    public void setZuora__RatePlanId__c(java.lang.String zuora__RatePlanId__c) {
        this.zuora__RatePlanId__c = zuora__RatePlanId__c;
    }


    /**
     * Gets the zuora__RatePlanName__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return zuora__RatePlanName__c
     */
    public java.lang.String getZuora__RatePlanName__c() {
        return zuora__RatePlanName__c;
    }


    /**
     * Sets the zuora__RatePlanName__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param zuora__RatePlanName__c
     */
    public void setZuora__RatePlanName__c(java.lang.String zuora__RatePlanName__c) {
        this.zuora__RatePlanName__c = zuora__RatePlanName__c;
    }


    /**
     * Gets the zuora__Subscription__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return zuora__Subscription__c
     */
    public java.lang.String getZuora__Subscription__c() {
        return zuora__Subscription__c;
    }


    /**
     * Sets the zuora__Subscription__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param zuora__Subscription__c
     */
    public void setZuora__Subscription__c(java.lang.String zuora__Subscription__c) {
        this.zuora__Subscription__c = zuora__Subscription__c;
    }


    /**
     * Gets the zuora__Subscription__r value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return zuora__Subscription__r
     */
    public com.sforce.soap.enterprise.sobject.Zuora__Subscription__c getZuora__Subscription__r() {
        return zuora__Subscription__r;
    }


    /**
     * Sets the zuora__Subscription__r value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param zuora__Subscription__r
     */
    public void setZuora__Subscription__r(com.sforce.soap.enterprise.sobject.Zuora__Subscription__c zuora__Subscription__r) {
        this.zuora__Subscription__r = zuora__Subscription__r;
    }


    /**
     * Gets the zuora__TotalContractValue__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return zuora__TotalContractValue__c
     */
    public java.lang.Double getZuora__TotalContractValue__c() {
        return zuora__TotalContractValue__c;
    }


    /**
     * Sets the zuora__TotalContractValue__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param zuora__TotalContractValue__c
     */
    public void setZuora__TotalContractValue__c(java.lang.Double zuora__TotalContractValue__c) {
        this.zuora__TotalContractValue__c = zuora__TotalContractValue__c;
    }


    /**
     * Gets the zuora__Type__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return zuora__Type__c
     */
    public java.lang.String getZuora__Type__c() {
        return zuora__Type__c;
    }


    /**
     * Sets the zuora__Type__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param zuora__Type__c
     */
    public void setZuora__Type__c(java.lang.String zuora__Type__c) {
        this.zuora__Type__c = zuora__Type__c;
    }


    /**
     * Gets the zuora__UOM__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return zuora__UOM__c
     */
    public java.lang.String getZuora__UOM__c() {
        return zuora__UOM__c;
    }


    /**
     * Sets the zuora__UOM__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param zuora__UOM__c
     */
    public void setZuora__UOM__c(java.lang.String zuora__UOM__c) {
        this.zuora__UOM__c = zuora__UOM__c;
    }


    /**
     * Gets the zuora__UOM_formula__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return zuora__UOM_formula__c
     */
    public java.lang.String getZuora__UOM_formula__c() {
        return zuora__UOM_formula__c;
    }


    /**
     * Sets the zuora__UOM_formula__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param zuora__UOM_formula__c
     */
    public void setZuora__UOM_formula__c(java.lang.String zuora__UOM_formula__c) {
        this.zuora__UOM_formula__c = zuora__UOM_formula__c;
    }


    /**
     * Gets the zuora__UnitOfMeasure__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return zuora__UnitOfMeasure__c
     */
    public java.lang.String getZuora__UnitOfMeasure__c() {
        return zuora__UnitOfMeasure__c;
    }


    /**
     * Sets the zuora__UnitOfMeasure__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param zuora__UnitOfMeasure__c
     */
    public void setZuora__UnitOfMeasure__c(java.lang.String zuora__UnitOfMeasure__c) {
        this.zuora__UnitOfMeasure__c = zuora__UnitOfMeasure__c;
    }


    /**
     * Gets the zuora__UnitOfMeasure__r value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return zuora__UnitOfMeasure__r
     */
    public com.sforce.soap.enterprise.sobject.Zuora__UnitOfMeasure__c getZuora__UnitOfMeasure__r() {
        return zuora__UnitOfMeasure__r;
    }


    /**
     * Sets the zuora__UnitOfMeasure__r value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param zuora__UnitOfMeasure__r
     */
    public void setZuora__UnitOfMeasure__r(com.sforce.soap.enterprise.sobject.Zuora__UnitOfMeasure__c zuora__UnitOfMeasure__r) {
        this.zuora__UnitOfMeasure__r = zuora__UnitOfMeasure__r;
    }


    /**
     * Gets the zuora__Zuora_Id__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @return zuora__Zuora_Id__c
     */
    public java.lang.String getZuora__Zuora_Id__c() {
        return zuora__Zuora_Id__c;
    }


    /**
     * Sets the zuora__Zuora_Id__c value for this Zuora__SubscriptionProductCharge__c.
     * 
     * @param zuora__Zuora_Id__c
     */
    public void setZuora__Zuora_Id__c(java.lang.String zuora__Zuora_Id__c) {
        this.zuora__Zuora_Id__c = zuora__Zuora_Id__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Zuora__SubscriptionProductCharge__c)) return false;
        Zuora__SubscriptionProductCharge__c other = (Zuora__SubscriptionProductCharge__c) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.activityHistories==null && other.getActivityHistories()==null) || 
             (this.activityHistories!=null &&
              this.activityHistories.equals(other.getActivityHistories()))) &&
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
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              this.events.equals(other.getEvents()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.lastActivityDate==null && other.getLastActivityDate()==null) || 
             (this.lastActivityDate!=null &&
              this.lastActivityDate.equals(other.getLastActivityDate()))) &&
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
            ((this.openActivities==null && other.getOpenActivities()==null) || 
             (this.openActivities!=null &&
              this.openActivities.equals(other.getOpenActivities()))) &&
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
            ((this.tasks==null && other.getTasks()==null) || 
             (this.tasks!=null &&
              this.tasks.equals(other.getTasks()))) &&
            ((this.topicAssignments==null && other.getTopicAssignments()==null) || 
             (this.topicAssignments!=null &&
              this.topicAssignments.equals(other.getTopicAssignments()))) &&
            ((this.userRecordAccess==null && other.getUserRecordAccess()==null) || 
             (this.userRecordAccess!=null &&
              this.userRecordAccess.equals(other.getUserRecordAccess()))) &&
            ((this.zuora__Account__c==null && other.getZuora__Account__c()==null) || 
             (this.zuora__Account__c!=null &&
              this.zuora__Account__c.equals(other.getZuora__Account__c()))) &&
            ((this.zuora__Account__r==null && other.getZuora__Account__r()==null) || 
             (this.zuora__Account__r!=null &&
              this.zuora__Account__r.equals(other.getZuora__Account__r()))) &&
            ((this.zuora__AccountingCode__c==null && other.getZuora__AccountingCode__c()==null) || 
             (this.zuora__AccountingCode__c!=null &&
              this.zuora__AccountingCode__c.equals(other.getZuora__AccountingCode__c()))) &&
            ((this.zuora__BillingPeriodStartDay__c==null && other.getZuora__BillingPeriodStartDay__c()==null) || 
             (this.zuora__BillingPeriodStartDay__c!=null &&
              this.zuora__BillingPeriodStartDay__c.equals(other.getZuora__BillingPeriodStartDay__c()))) &&
            ((this.zuora__BillingPeriod__c==null && other.getZuora__BillingPeriod__c()==null) || 
             (this.zuora__BillingPeriod__c!=null &&
              this.zuora__BillingPeriod__c.equals(other.getZuora__BillingPeriod__c()))) &&
            ((this.zuora__ChargeNumber__c==null && other.getZuora__ChargeNumber__c()==null) || 
             (this.zuora__ChargeNumber__c!=null &&
              this.zuora__ChargeNumber__c.equals(other.getZuora__ChargeNumber__c()))) &&
            ((this.zuora__Description__c==null && other.getZuora__Description__c()==null) || 
             (this.zuora__Description__c!=null &&
              this.zuora__Description__c.equals(other.getZuora__Description__c()))) &&
            ((this.zuora__EffectiveEndDate__c==null && other.getZuora__EffectiveEndDate__c()==null) || 
             (this.zuora__EffectiveEndDate__c!=null &&
              this.zuora__EffectiveEndDate__c.equals(other.getZuora__EffectiveEndDate__c()))) &&
            ((this.zuora__EffectiveStartDate__c==null && other.getZuora__EffectiveStartDate__c()==null) || 
             (this.zuora__EffectiveStartDate__c!=null &&
              this.zuora__EffectiveStartDate__c.equals(other.getZuora__EffectiveStartDate__c()))) &&
            ((this.zuora__ExtendedAmount__c==null && other.getZuora__ExtendedAmount__c()==null) || 
             (this.zuora__ExtendedAmount__c!=null &&
              this.zuora__ExtendedAmount__c.equals(other.getZuora__ExtendedAmount__c()))) &&
            ((this.zuora__External_Id__c==null && other.getZuora__External_Id__c()==null) || 
             (this.zuora__External_Id__c!=null &&
              this.zuora__External_Id__c.equals(other.getZuora__External_Id__c()))) &&
            ((this.zuora__Model__c==null && other.getZuora__Model__c()==null) || 
             (this.zuora__Model__c!=null &&
              this.zuora__Model__c.equals(other.getZuora__Model__c()))) &&
            ((this.zuora__MonthlyRecurringRevenue__c==null && other.getZuora__MonthlyRecurringRevenue__c()==null) || 
             (this.zuora__MonthlyRecurringRevenue__c!=null &&
              this.zuora__MonthlyRecurringRevenue__c.equals(other.getZuora__MonthlyRecurringRevenue__c()))) &&
            ((this.zuora__PriceTable__c==null && other.getZuora__PriceTable__c()==null) || 
             (this.zuora__PriceTable__c!=null &&
              this.zuora__PriceTable__c.equals(other.getZuora__PriceTable__c()))) &&
            ((this.zuora__Price__c==null && other.getZuora__Price__c()==null) || 
             (this.zuora__Price__c!=null &&
              this.zuora__Price__c.equals(other.getZuora__Price__c()))) &&
            ((this.zuora__ProductDescription__c==null && other.getZuora__ProductDescription__c()==null) || 
             (this.zuora__ProductDescription__c!=null &&
              this.zuora__ProductDescription__c.equals(other.getZuora__ProductDescription__c()))) &&
            ((this.zuora__ProductEffectiveEndDate_Product__c==null && other.getZuora__ProductEffectiveEndDate_Product__c()==null) || 
             (this.zuora__ProductEffectiveEndDate_Product__c!=null &&
              this.zuora__ProductEffectiveEndDate_Product__c.equals(other.getZuora__ProductEffectiveEndDate_Product__c()))) &&
            ((this.zuora__ProductEffectiveEndDate__c==null && other.getZuora__ProductEffectiveEndDate__c()==null) || 
             (this.zuora__ProductEffectiveEndDate__c!=null &&
              this.zuora__ProductEffectiveEndDate__c.equals(other.getZuora__ProductEffectiveEndDate__c()))) &&
            ((this.zuora__ProductName_Product__c==null && other.getZuora__ProductName_Product__c()==null) || 
             (this.zuora__ProductName_Product__c!=null &&
              this.zuora__ProductName_Product__c.equals(other.getZuora__ProductName_Product__c()))) &&
            ((this.zuora__ProductName__c==null && other.getZuora__ProductName__c()==null) || 
             (this.zuora__ProductName__c!=null &&
              this.zuora__ProductName__c.equals(other.getZuora__ProductName__c()))) &&
            ((this.zuora__ProductSKU_Product__c==null && other.getZuora__ProductSKU_Product__c()==null) || 
             (this.zuora__ProductSKU_Product__c!=null &&
              this.zuora__ProductSKU_Product__c.equals(other.getZuora__ProductSKU_Product__c()))) &&
            ((this.zuora__ProductSKU__c==null && other.getZuora__ProductSKU__c()==null) || 
             (this.zuora__ProductSKU__c!=null &&
              this.zuora__ProductSKU__c.equals(other.getZuora__ProductSKU__c()))) &&
            ((this.zuora__Product__c==null && other.getZuora__Product__c()==null) || 
             (this.zuora__Product__c!=null &&
              this.zuora__Product__c.equals(other.getZuora__Product__c()))) &&
            ((this.zuora__Product__r==null && other.getZuora__Product__r()==null) || 
             (this.zuora__Product__r!=null &&
              this.zuora__Product__r.equals(other.getZuora__Product__r()))) &&
            ((this.zuora__Quantity__c==null && other.getZuora__Quantity__c()==null) || 
             (this.zuora__Quantity__c!=null &&
              this.zuora__Quantity__c.equals(other.getZuora__Quantity__c()))) &&
            ((this.zuora__RatePlanDescription__c==null && other.getZuora__RatePlanDescription__c()==null) || 
             (this.zuora__RatePlanDescription__c!=null &&
              this.zuora__RatePlanDescription__c.equals(other.getZuora__RatePlanDescription__c()))) &&
            ((this.zuora__RatePlanEffectiveEndDate__c==null && other.getZuora__RatePlanEffectiveEndDate__c()==null) || 
             (this.zuora__RatePlanEffectiveEndDate__c!=null &&
              this.zuora__RatePlanEffectiveEndDate__c.equals(other.getZuora__RatePlanEffectiveEndDate__c()))) &&
            ((this.zuora__RatePlanId__c==null && other.getZuora__RatePlanId__c()==null) || 
             (this.zuora__RatePlanId__c!=null &&
              this.zuora__RatePlanId__c.equals(other.getZuora__RatePlanId__c()))) &&
            ((this.zuora__RatePlanName__c==null && other.getZuora__RatePlanName__c()==null) || 
             (this.zuora__RatePlanName__c!=null &&
              this.zuora__RatePlanName__c.equals(other.getZuora__RatePlanName__c()))) &&
            ((this.zuora__Subscription__c==null && other.getZuora__Subscription__c()==null) || 
             (this.zuora__Subscription__c!=null &&
              this.zuora__Subscription__c.equals(other.getZuora__Subscription__c()))) &&
            ((this.zuora__Subscription__r==null && other.getZuora__Subscription__r()==null) || 
             (this.zuora__Subscription__r!=null &&
              this.zuora__Subscription__r.equals(other.getZuora__Subscription__r()))) &&
            ((this.zuora__TotalContractValue__c==null && other.getZuora__TotalContractValue__c()==null) || 
             (this.zuora__TotalContractValue__c!=null &&
              this.zuora__TotalContractValue__c.equals(other.getZuora__TotalContractValue__c()))) &&
            ((this.zuora__Type__c==null && other.getZuora__Type__c()==null) || 
             (this.zuora__Type__c!=null &&
              this.zuora__Type__c.equals(other.getZuora__Type__c()))) &&
            ((this.zuora__UOM__c==null && other.getZuora__UOM__c()==null) || 
             (this.zuora__UOM__c!=null &&
              this.zuora__UOM__c.equals(other.getZuora__UOM__c()))) &&
            ((this.zuora__UOM_formula__c==null && other.getZuora__UOM_formula__c()==null) || 
             (this.zuora__UOM_formula__c!=null &&
              this.zuora__UOM_formula__c.equals(other.getZuora__UOM_formula__c()))) &&
            ((this.zuora__UnitOfMeasure__c==null && other.getZuora__UnitOfMeasure__c()==null) || 
             (this.zuora__UnitOfMeasure__c!=null &&
              this.zuora__UnitOfMeasure__c.equals(other.getZuora__UnitOfMeasure__c()))) &&
            ((this.zuora__UnitOfMeasure__r==null && other.getZuora__UnitOfMeasure__r()==null) || 
             (this.zuora__UnitOfMeasure__r!=null &&
              this.zuora__UnitOfMeasure__r.equals(other.getZuora__UnitOfMeasure__r()))) &&
            ((this.zuora__Zuora_Id__c==null && other.getZuora__Zuora_Id__c()==null) || 
             (this.zuora__Zuora_Id__c!=null &&
              this.zuora__Zuora_Id__c.equals(other.getZuora__Zuora_Id__c())));
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
        if (getActivityHistories() != null) {
            _hashCode += getActivityHistories().hashCode();
        }
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
        if (getEvents() != null) {
            _hashCode += getEvents().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getLastActivityDate() != null) {
            _hashCode += getLastActivityDate().hashCode();
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
        if (getOpenActivities() != null) {
            _hashCode += getOpenActivities().hashCode();
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
        if (getTasks() != null) {
            _hashCode += getTasks().hashCode();
        }
        if (getTopicAssignments() != null) {
            _hashCode += getTopicAssignments().hashCode();
        }
        if (getUserRecordAccess() != null) {
            _hashCode += getUserRecordAccess().hashCode();
        }
        if (getZuora__Account__c() != null) {
            _hashCode += getZuora__Account__c().hashCode();
        }
        if (getZuora__Account__r() != null) {
            _hashCode += getZuora__Account__r().hashCode();
        }
        if (getZuora__AccountingCode__c() != null) {
            _hashCode += getZuora__AccountingCode__c().hashCode();
        }
        if (getZuora__BillingPeriodStartDay__c() != null) {
            _hashCode += getZuora__BillingPeriodStartDay__c().hashCode();
        }
        if (getZuora__BillingPeriod__c() != null) {
            _hashCode += getZuora__BillingPeriod__c().hashCode();
        }
        if (getZuora__ChargeNumber__c() != null) {
            _hashCode += getZuora__ChargeNumber__c().hashCode();
        }
        if (getZuora__Description__c() != null) {
            _hashCode += getZuora__Description__c().hashCode();
        }
        if (getZuora__EffectiveEndDate__c() != null) {
            _hashCode += getZuora__EffectiveEndDate__c().hashCode();
        }
        if (getZuora__EffectiveStartDate__c() != null) {
            _hashCode += getZuora__EffectiveStartDate__c().hashCode();
        }
        if (getZuora__ExtendedAmount__c() != null) {
            _hashCode += getZuora__ExtendedAmount__c().hashCode();
        }
        if (getZuora__External_Id__c() != null) {
            _hashCode += getZuora__External_Id__c().hashCode();
        }
        if (getZuora__Model__c() != null) {
            _hashCode += getZuora__Model__c().hashCode();
        }
        if (getZuora__MonthlyRecurringRevenue__c() != null) {
            _hashCode += getZuora__MonthlyRecurringRevenue__c().hashCode();
        }
        if (getZuora__PriceTable__c() != null) {
            _hashCode += getZuora__PriceTable__c().hashCode();
        }
        if (getZuora__Price__c() != null) {
            _hashCode += getZuora__Price__c().hashCode();
        }
        if (getZuora__ProductDescription__c() != null) {
            _hashCode += getZuora__ProductDescription__c().hashCode();
        }
        if (getZuora__ProductEffectiveEndDate_Product__c() != null) {
            _hashCode += getZuora__ProductEffectiveEndDate_Product__c().hashCode();
        }
        if (getZuora__ProductEffectiveEndDate__c() != null) {
            _hashCode += getZuora__ProductEffectiveEndDate__c().hashCode();
        }
        if (getZuora__ProductName_Product__c() != null) {
            _hashCode += getZuora__ProductName_Product__c().hashCode();
        }
        if (getZuora__ProductName__c() != null) {
            _hashCode += getZuora__ProductName__c().hashCode();
        }
        if (getZuora__ProductSKU_Product__c() != null) {
            _hashCode += getZuora__ProductSKU_Product__c().hashCode();
        }
        if (getZuora__ProductSKU__c() != null) {
            _hashCode += getZuora__ProductSKU__c().hashCode();
        }
        if (getZuora__Product__c() != null) {
            _hashCode += getZuora__Product__c().hashCode();
        }
        if (getZuora__Product__r() != null) {
            _hashCode += getZuora__Product__r().hashCode();
        }
        if (getZuora__Quantity__c() != null) {
            _hashCode += getZuora__Quantity__c().hashCode();
        }
        if (getZuora__RatePlanDescription__c() != null) {
            _hashCode += getZuora__RatePlanDescription__c().hashCode();
        }
        if (getZuora__RatePlanEffectiveEndDate__c() != null) {
            _hashCode += getZuora__RatePlanEffectiveEndDate__c().hashCode();
        }
        if (getZuora__RatePlanId__c() != null) {
            _hashCode += getZuora__RatePlanId__c().hashCode();
        }
        if (getZuora__RatePlanName__c() != null) {
            _hashCode += getZuora__RatePlanName__c().hashCode();
        }
        if (getZuora__Subscription__c() != null) {
            _hashCode += getZuora__Subscription__c().hashCode();
        }
        if (getZuora__Subscription__r() != null) {
            _hashCode += getZuora__Subscription__r().hashCode();
        }
        if (getZuora__TotalContractValue__c() != null) {
            _hashCode += getZuora__TotalContractValue__c().hashCode();
        }
        if (getZuora__Type__c() != null) {
            _hashCode += getZuora__Type__c().hashCode();
        }
        if (getZuora__UOM__c() != null) {
            _hashCode += getZuora__UOM__c().hashCode();
        }
        if (getZuora__UOM_formula__c() != null) {
            _hashCode += getZuora__UOM_formula__c().hashCode();
        }
        if (getZuora__UnitOfMeasure__c() != null) {
            _hashCode += getZuora__UnitOfMeasure__c().hashCode();
        }
        if (getZuora__UnitOfMeasure__r() != null) {
            _hashCode += getZuora__UnitOfMeasure__r().hashCode();
        }
        if (getZuora__Zuora_Id__c() != null) {
            _hashCode += getZuora__Zuora_Id__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Zuora__SubscriptionProductCharge__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__SubscriptionProductCharge__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityHistories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ActivityHistories"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("events");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Events"));
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
        elemField.setFieldName("lastActivityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastActivityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("openActivities");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpenActivities"));
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
        elemField.setFieldName("tasks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tasks"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("zuora__Account__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Account__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__Account__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Account__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__AccountingCode__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__AccountingCode__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__BillingPeriodStartDay__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__BillingPeriodStartDay__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__BillingPeriod__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__BillingPeriod__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__ChargeNumber__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__ChargeNumber__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__Description__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Description__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__EffectiveEndDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__EffectiveEndDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__EffectiveStartDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__EffectiveStartDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__ExtendedAmount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__ExtendedAmount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__External_Id__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__External_Id__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__Model__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Model__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__MonthlyRecurringRevenue__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__MonthlyRecurringRevenue__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__PriceTable__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__PriceTable__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__Price__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Price__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__ProductDescription__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__ProductDescription__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__ProductEffectiveEndDate_Product__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__ProductEffectiveEndDate_Product__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__ProductEffectiveEndDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__ProductEffectiveEndDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__ProductName_Product__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__ProductName_Product__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__ProductName__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__ProductName__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__ProductSKU_Product__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__ProductSKU_Product__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__ProductSKU__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__ProductSKU__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__Product__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Product__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__Product__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Product__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Product__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__Quantity__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Quantity__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__RatePlanDescription__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__RatePlanDescription__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__RatePlanEffectiveEndDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__RatePlanEffectiveEndDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__RatePlanId__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__RatePlanId__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__RatePlanName__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__RatePlanName__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__Subscription__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Subscription__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__Subscription__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Subscription__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Subscription__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__TotalContractValue__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__TotalContractValue__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__UOM__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__UOM__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__UOM_formula__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__UOM_formula__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__UnitOfMeasure__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__UnitOfMeasure__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__UnitOfMeasure__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__UnitOfMeasure__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__UnitOfMeasure__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__Zuora_Id__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Zuora_Id__c"));
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
