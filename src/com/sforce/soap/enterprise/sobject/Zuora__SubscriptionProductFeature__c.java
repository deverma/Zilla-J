/**
 * Zuora__SubscriptionProductFeature__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Zuora__SubscriptionProductFeature__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
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

    private java.lang.String zuora__External_Id__c;

    private java.lang.String zuora__FeatureCode__c;

    private java.lang.String zuora__FeatureDescription__c;

    private java.lang.String zuora__FeatureName__c;

    private java.lang.String zuora__ProductDescription__c;

    private java.util.Date zuora__ProductEffectiveEndDate_Product__c;

    private java.util.Date zuora__ProductEffectiveEndDate__c;

    private java.lang.String zuora__ProductNameProduct__c;

    private java.lang.String zuora__ProductName__c;

    private java.lang.String zuora__ProductSKU_Product__c;

    private java.lang.String zuora__ProductSKU__c;

    private java.lang.String zuora__ProductZuoraId__c;

    private java.lang.String zuora__Product__c;

    private com.sforce.soap.enterprise.sobject.Zuora__Product__c zuora__Product__r;

    private java.lang.String zuora__RatePlanDescription__c;

    private java.util.Date zuora__RatePlanEffectiveEndDate__c;

    private java.lang.String zuora__RatePlanName__c;

    private java.lang.String zuora__RatePlanZuoraId__c;

    private java.lang.String zuora__Subscription__c;

    private com.sforce.soap.enterprise.sobject.Zuora__Subscription__c zuora__Subscription__r;

    public Zuora__SubscriptionProductFeature__c() {
    }

    public Zuora__SubscriptionProductFeature__c(
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
           java.lang.String zuora__External_Id__c,
           java.lang.String zuora__FeatureCode__c,
           java.lang.String zuora__FeatureDescription__c,
           java.lang.String zuora__FeatureName__c,
           java.lang.String zuora__ProductDescription__c,
           java.util.Date zuora__ProductEffectiveEndDate_Product__c,
           java.util.Date zuora__ProductEffectiveEndDate__c,
           java.lang.String zuora__ProductNameProduct__c,
           java.lang.String zuora__ProductName__c,
           java.lang.String zuora__ProductSKU_Product__c,
           java.lang.String zuora__ProductSKU__c,
           java.lang.String zuora__ProductZuoraId__c,
           java.lang.String zuora__Product__c,
           com.sforce.soap.enterprise.sobject.Zuora__Product__c zuora__Product__r,
           java.lang.String zuora__RatePlanDescription__c,
           java.util.Date zuora__RatePlanEffectiveEndDate__c,
           java.lang.String zuora__RatePlanName__c,
           java.lang.String zuora__RatePlanZuoraId__c,
           java.lang.String zuora__Subscription__c,
           com.sforce.soap.enterprise.sobject.Zuora__Subscription__c zuora__Subscription__r) {
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
        this.zuora__External_Id__c = zuora__External_Id__c;
        this.zuora__FeatureCode__c = zuora__FeatureCode__c;
        this.zuora__FeatureDescription__c = zuora__FeatureDescription__c;
        this.zuora__FeatureName__c = zuora__FeatureName__c;
        this.zuora__ProductDescription__c = zuora__ProductDescription__c;
        this.zuora__ProductEffectiveEndDate_Product__c = zuora__ProductEffectiveEndDate_Product__c;
        this.zuora__ProductEffectiveEndDate__c = zuora__ProductEffectiveEndDate__c;
        this.zuora__ProductNameProduct__c = zuora__ProductNameProduct__c;
        this.zuora__ProductName__c = zuora__ProductName__c;
        this.zuora__ProductSKU_Product__c = zuora__ProductSKU_Product__c;
        this.zuora__ProductSKU__c = zuora__ProductSKU__c;
        this.zuora__ProductZuoraId__c = zuora__ProductZuoraId__c;
        this.zuora__Product__c = zuora__Product__c;
        this.zuora__Product__r = zuora__Product__r;
        this.zuora__RatePlanDescription__c = zuora__RatePlanDescription__c;
        this.zuora__RatePlanEffectiveEndDate__c = zuora__RatePlanEffectiveEndDate__c;
        this.zuora__RatePlanName__c = zuora__RatePlanName__c;
        this.zuora__RatePlanZuoraId__c = zuora__RatePlanZuoraId__c;
        this.zuora__Subscription__c = zuora__Subscription__c;
        this.zuora__Subscription__r = zuora__Subscription__r;
    }


    /**
     * Gets the activityHistories value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the attachedContentDocuments value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return attachedContentDocuments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachedContentDocuments() {
        return attachedContentDocuments;
    }


    /**
     * Sets the attachedContentDocuments value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param attachedContentDocuments
     */
    public void setAttachedContentDocuments(com.sforce.soap.enterprise.QueryResult attachedContentDocuments) {
        this.attachedContentDocuments = attachedContentDocuments;
    }


    /**
     * Gets the attachments value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the combinedAttachments value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return combinedAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getCombinedAttachments() {
        return combinedAttachments;
    }


    /**
     * Sets the combinedAttachments value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param combinedAttachments
     */
    public void setCombinedAttachments(com.sforce.soap.enterprise.QueryResult combinedAttachments) {
        this.combinedAttachments = combinedAttachments;
    }


    /**
     * Gets the createdBy value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the duplicateRecordItems value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return duplicateRecordItems
     */
    public com.sforce.soap.enterprise.QueryResult getDuplicateRecordItems() {
        return duplicateRecordItems;
    }


    /**
     * Sets the duplicateRecordItems value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param duplicateRecordItems
     */
    public void setDuplicateRecordItems(com.sforce.soap.enterprise.QueryResult duplicateRecordItems) {
        this.duplicateRecordItems = duplicateRecordItems;
    }


    /**
     * Gets the events value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the isDeleted value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastActivityDate value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lookedUpFromActivities value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return lookedUpFromActivities
     */
    public com.sforce.soap.enterprise.QueryResult getLookedUpFromActivities() {
        return lookedUpFromActivities;
    }


    /**
     * Sets the lookedUpFromActivities value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param lookedUpFromActivities
     */
    public void setLookedUpFromActivities(com.sforce.soap.enterprise.QueryResult lookedUpFromActivities) {
        this.lookedUpFromActivities = lookedUpFromActivities;
    }


    /**
     * Gets the name value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the openActivities value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the owner value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.SObject getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.SObject owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the processInstances value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the recordAssociatedGroups value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return recordAssociatedGroups
     */
    public com.sforce.soap.enterprise.QueryResult getRecordAssociatedGroups() {
        return recordAssociatedGroups;
    }


    /**
     * Sets the recordAssociatedGroups value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param recordAssociatedGroups
     */
    public void setRecordAssociatedGroups(com.sforce.soap.enterprise.QueryResult recordAssociatedGroups) {
        this.recordAssociatedGroups = recordAssociatedGroups;
    }


    /**
     * Gets the systemModstamp value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the topicAssignments value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return topicAssignments
     */
    public com.sforce.soap.enterprise.QueryResult getTopicAssignments() {
        return topicAssignments;
    }


    /**
     * Sets the topicAssignments value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param topicAssignments
     */
    public void setTopicAssignments(com.sforce.soap.enterprise.QueryResult topicAssignments) {
        this.topicAssignments = topicAssignments;
    }


    /**
     * Gets the userRecordAccess value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return userRecordAccess
     */
    public com.sforce.soap.enterprise.sobject.UserRecordAccess getUserRecordAccess() {
        return userRecordAccess;
    }


    /**
     * Sets the userRecordAccess value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param userRecordAccess
     */
    public void setUserRecordAccess(com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess) {
        this.userRecordAccess = userRecordAccess;
    }


    /**
     * Gets the zuora__Account__c value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return zuora__Account__c
     */
    public java.lang.String getZuora__Account__c() {
        return zuora__Account__c;
    }


    /**
     * Sets the zuora__Account__c value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param zuora__Account__c
     */
    public void setZuora__Account__c(java.lang.String zuora__Account__c) {
        this.zuora__Account__c = zuora__Account__c;
    }


    /**
     * Gets the zuora__Account__r value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return zuora__Account__r
     */
    public com.sforce.soap.enterprise.sobject.Account getZuora__Account__r() {
        return zuora__Account__r;
    }


    /**
     * Sets the zuora__Account__r value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param zuora__Account__r
     */
    public void setZuora__Account__r(com.sforce.soap.enterprise.sobject.Account zuora__Account__r) {
        this.zuora__Account__r = zuora__Account__r;
    }


    /**
     * Gets the zuora__External_Id__c value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return zuora__External_Id__c
     */
    public java.lang.String getZuora__External_Id__c() {
        return zuora__External_Id__c;
    }


    /**
     * Sets the zuora__External_Id__c value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param zuora__External_Id__c
     */
    public void setZuora__External_Id__c(java.lang.String zuora__External_Id__c) {
        this.zuora__External_Id__c = zuora__External_Id__c;
    }


    /**
     * Gets the zuora__FeatureCode__c value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return zuora__FeatureCode__c
     */
    public java.lang.String getZuora__FeatureCode__c() {
        return zuora__FeatureCode__c;
    }


    /**
     * Sets the zuora__FeatureCode__c value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param zuora__FeatureCode__c
     */
    public void setZuora__FeatureCode__c(java.lang.String zuora__FeatureCode__c) {
        this.zuora__FeatureCode__c = zuora__FeatureCode__c;
    }


    /**
     * Gets the zuora__FeatureDescription__c value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return zuora__FeatureDescription__c
     */
    public java.lang.String getZuora__FeatureDescription__c() {
        return zuora__FeatureDescription__c;
    }


    /**
     * Sets the zuora__FeatureDescription__c value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param zuora__FeatureDescription__c
     */
    public void setZuora__FeatureDescription__c(java.lang.String zuora__FeatureDescription__c) {
        this.zuora__FeatureDescription__c = zuora__FeatureDescription__c;
    }


    /**
     * Gets the zuora__FeatureName__c value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return zuora__FeatureName__c
     */
    public java.lang.String getZuora__FeatureName__c() {
        return zuora__FeatureName__c;
    }


    /**
     * Sets the zuora__FeatureName__c value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param zuora__FeatureName__c
     */
    public void setZuora__FeatureName__c(java.lang.String zuora__FeatureName__c) {
        this.zuora__FeatureName__c = zuora__FeatureName__c;
    }


    /**
     * Gets the zuora__ProductDescription__c value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return zuora__ProductDescription__c
     */
    public java.lang.String getZuora__ProductDescription__c() {
        return zuora__ProductDescription__c;
    }


    /**
     * Sets the zuora__ProductDescription__c value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param zuora__ProductDescription__c
     */
    public void setZuora__ProductDescription__c(java.lang.String zuora__ProductDescription__c) {
        this.zuora__ProductDescription__c = zuora__ProductDescription__c;
    }


    /**
     * Gets the zuora__ProductEffectiveEndDate_Product__c value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return zuora__ProductEffectiveEndDate_Product__c
     */
    public java.util.Date getZuora__ProductEffectiveEndDate_Product__c() {
        return zuora__ProductEffectiveEndDate_Product__c;
    }


    /**
     * Sets the zuora__ProductEffectiveEndDate_Product__c value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param zuora__ProductEffectiveEndDate_Product__c
     */
    public void setZuora__ProductEffectiveEndDate_Product__c(java.util.Date zuora__ProductEffectiveEndDate_Product__c) {
        this.zuora__ProductEffectiveEndDate_Product__c = zuora__ProductEffectiveEndDate_Product__c;
    }


    /**
     * Gets the zuora__ProductEffectiveEndDate__c value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return zuora__ProductEffectiveEndDate__c
     */
    public java.util.Date getZuora__ProductEffectiveEndDate__c() {
        return zuora__ProductEffectiveEndDate__c;
    }


    /**
     * Sets the zuora__ProductEffectiveEndDate__c value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param zuora__ProductEffectiveEndDate__c
     */
    public void setZuora__ProductEffectiveEndDate__c(java.util.Date zuora__ProductEffectiveEndDate__c) {
        this.zuora__ProductEffectiveEndDate__c = zuora__ProductEffectiveEndDate__c;
    }


    /**
     * Gets the zuora__ProductNameProduct__c value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return zuora__ProductNameProduct__c
     */
    public java.lang.String getZuora__ProductNameProduct__c() {
        return zuora__ProductNameProduct__c;
    }


    /**
     * Sets the zuora__ProductNameProduct__c value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param zuora__ProductNameProduct__c
     */
    public void setZuora__ProductNameProduct__c(java.lang.String zuora__ProductNameProduct__c) {
        this.zuora__ProductNameProduct__c = zuora__ProductNameProduct__c;
    }


    /**
     * Gets the zuora__ProductName__c value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return zuora__ProductName__c
     */
    public java.lang.String getZuora__ProductName__c() {
        return zuora__ProductName__c;
    }


    /**
     * Sets the zuora__ProductName__c value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param zuora__ProductName__c
     */
    public void setZuora__ProductName__c(java.lang.String zuora__ProductName__c) {
        this.zuora__ProductName__c = zuora__ProductName__c;
    }


    /**
     * Gets the zuora__ProductSKU_Product__c value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return zuora__ProductSKU_Product__c
     */
    public java.lang.String getZuora__ProductSKU_Product__c() {
        return zuora__ProductSKU_Product__c;
    }


    /**
     * Sets the zuora__ProductSKU_Product__c value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param zuora__ProductSKU_Product__c
     */
    public void setZuora__ProductSKU_Product__c(java.lang.String zuora__ProductSKU_Product__c) {
        this.zuora__ProductSKU_Product__c = zuora__ProductSKU_Product__c;
    }


    /**
     * Gets the zuora__ProductSKU__c value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return zuora__ProductSKU__c
     */
    public java.lang.String getZuora__ProductSKU__c() {
        return zuora__ProductSKU__c;
    }


    /**
     * Sets the zuora__ProductSKU__c value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param zuora__ProductSKU__c
     */
    public void setZuora__ProductSKU__c(java.lang.String zuora__ProductSKU__c) {
        this.zuora__ProductSKU__c = zuora__ProductSKU__c;
    }


    /**
     * Gets the zuora__ProductZuoraId__c value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return zuora__ProductZuoraId__c
     */
    public java.lang.String getZuora__ProductZuoraId__c() {
        return zuora__ProductZuoraId__c;
    }


    /**
     * Sets the zuora__ProductZuoraId__c value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param zuora__ProductZuoraId__c
     */
    public void setZuora__ProductZuoraId__c(java.lang.String zuora__ProductZuoraId__c) {
        this.zuora__ProductZuoraId__c = zuora__ProductZuoraId__c;
    }


    /**
     * Gets the zuora__Product__c value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return zuora__Product__c
     */
    public java.lang.String getZuora__Product__c() {
        return zuora__Product__c;
    }


    /**
     * Sets the zuora__Product__c value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param zuora__Product__c
     */
    public void setZuora__Product__c(java.lang.String zuora__Product__c) {
        this.zuora__Product__c = zuora__Product__c;
    }


    /**
     * Gets the zuora__Product__r value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return zuora__Product__r
     */
    public com.sforce.soap.enterprise.sobject.Zuora__Product__c getZuora__Product__r() {
        return zuora__Product__r;
    }


    /**
     * Sets the zuora__Product__r value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param zuora__Product__r
     */
    public void setZuora__Product__r(com.sforce.soap.enterprise.sobject.Zuora__Product__c zuora__Product__r) {
        this.zuora__Product__r = zuora__Product__r;
    }


    /**
     * Gets the zuora__RatePlanDescription__c value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return zuora__RatePlanDescription__c
     */
    public java.lang.String getZuora__RatePlanDescription__c() {
        return zuora__RatePlanDescription__c;
    }


    /**
     * Sets the zuora__RatePlanDescription__c value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param zuora__RatePlanDescription__c
     */
    public void setZuora__RatePlanDescription__c(java.lang.String zuora__RatePlanDescription__c) {
        this.zuora__RatePlanDescription__c = zuora__RatePlanDescription__c;
    }


    /**
     * Gets the zuora__RatePlanEffectiveEndDate__c value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return zuora__RatePlanEffectiveEndDate__c
     */
    public java.util.Date getZuora__RatePlanEffectiveEndDate__c() {
        return zuora__RatePlanEffectiveEndDate__c;
    }


    /**
     * Sets the zuora__RatePlanEffectiveEndDate__c value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param zuora__RatePlanEffectiveEndDate__c
     */
    public void setZuora__RatePlanEffectiveEndDate__c(java.util.Date zuora__RatePlanEffectiveEndDate__c) {
        this.zuora__RatePlanEffectiveEndDate__c = zuora__RatePlanEffectiveEndDate__c;
    }


    /**
     * Gets the zuora__RatePlanName__c value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return zuora__RatePlanName__c
     */
    public java.lang.String getZuora__RatePlanName__c() {
        return zuora__RatePlanName__c;
    }


    /**
     * Sets the zuora__RatePlanName__c value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param zuora__RatePlanName__c
     */
    public void setZuora__RatePlanName__c(java.lang.String zuora__RatePlanName__c) {
        this.zuora__RatePlanName__c = zuora__RatePlanName__c;
    }


    /**
     * Gets the zuora__RatePlanZuoraId__c value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return zuora__RatePlanZuoraId__c
     */
    public java.lang.String getZuora__RatePlanZuoraId__c() {
        return zuora__RatePlanZuoraId__c;
    }


    /**
     * Sets the zuora__RatePlanZuoraId__c value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param zuora__RatePlanZuoraId__c
     */
    public void setZuora__RatePlanZuoraId__c(java.lang.String zuora__RatePlanZuoraId__c) {
        this.zuora__RatePlanZuoraId__c = zuora__RatePlanZuoraId__c;
    }


    /**
     * Gets the zuora__Subscription__c value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return zuora__Subscription__c
     */
    public java.lang.String getZuora__Subscription__c() {
        return zuora__Subscription__c;
    }


    /**
     * Sets the zuora__Subscription__c value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param zuora__Subscription__c
     */
    public void setZuora__Subscription__c(java.lang.String zuora__Subscription__c) {
        this.zuora__Subscription__c = zuora__Subscription__c;
    }


    /**
     * Gets the zuora__Subscription__r value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @return zuora__Subscription__r
     */
    public com.sforce.soap.enterprise.sobject.Zuora__Subscription__c getZuora__Subscription__r() {
        return zuora__Subscription__r;
    }


    /**
     * Sets the zuora__Subscription__r value for this Zuora__SubscriptionProductFeature__c.
     * 
     * @param zuora__Subscription__r
     */
    public void setZuora__Subscription__r(com.sforce.soap.enterprise.sobject.Zuora__Subscription__c zuora__Subscription__r) {
        this.zuora__Subscription__r = zuora__Subscription__r;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Zuora__SubscriptionProductFeature__c)) return false;
        Zuora__SubscriptionProductFeature__c other = (Zuora__SubscriptionProductFeature__c) obj;
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
            ((this.zuora__External_Id__c==null && other.getZuora__External_Id__c()==null) || 
             (this.zuora__External_Id__c!=null &&
              this.zuora__External_Id__c.equals(other.getZuora__External_Id__c()))) &&
            ((this.zuora__FeatureCode__c==null && other.getZuora__FeatureCode__c()==null) || 
             (this.zuora__FeatureCode__c!=null &&
              this.zuora__FeatureCode__c.equals(other.getZuora__FeatureCode__c()))) &&
            ((this.zuora__FeatureDescription__c==null && other.getZuora__FeatureDescription__c()==null) || 
             (this.zuora__FeatureDescription__c!=null &&
              this.zuora__FeatureDescription__c.equals(other.getZuora__FeatureDescription__c()))) &&
            ((this.zuora__FeatureName__c==null && other.getZuora__FeatureName__c()==null) || 
             (this.zuora__FeatureName__c!=null &&
              this.zuora__FeatureName__c.equals(other.getZuora__FeatureName__c()))) &&
            ((this.zuora__ProductDescription__c==null && other.getZuora__ProductDescription__c()==null) || 
             (this.zuora__ProductDescription__c!=null &&
              this.zuora__ProductDescription__c.equals(other.getZuora__ProductDescription__c()))) &&
            ((this.zuora__ProductEffectiveEndDate_Product__c==null && other.getZuora__ProductEffectiveEndDate_Product__c()==null) || 
             (this.zuora__ProductEffectiveEndDate_Product__c!=null &&
              this.zuora__ProductEffectiveEndDate_Product__c.equals(other.getZuora__ProductEffectiveEndDate_Product__c()))) &&
            ((this.zuora__ProductEffectiveEndDate__c==null && other.getZuora__ProductEffectiveEndDate__c()==null) || 
             (this.zuora__ProductEffectiveEndDate__c!=null &&
              this.zuora__ProductEffectiveEndDate__c.equals(other.getZuora__ProductEffectiveEndDate__c()))) &&
            ((this.zuora__ProductNameProduct__c==null && other.getZuora__ProductNameProduct__c()==null) || 
             (this.zuora__ProductNameProduct__c!=null &&
              this.zuora__ProductNameProduct__c.equals(other.getZuora__ProductNameProduct__c()))) &&
            ((this.zuora__ProductName__c==null && other.getZuora__ProductName__c()==null) || 
             (this.zuora__ProductName__c!=null &&
              this.zuora__ProductName__c.equals(other.getZuora__ProductName__c()))) &&
            ((this.zuora__ProductSKU_Product__c==null && other.getZuora__ProductSKU_Product__c()==null) || 
             (this.zuora__ProductSKU_Product__c!=null &&
              this.zuora__ProductSKU_Product__c.equals(other.getZuora__ProductSKU_Product__c()))) &&
            ((this.zuora__ProductSKU__c==null && other.getZuora__ProductSKU__c()==null) || 
             (this.zuora__ProductSKU__c!=null &&
              this.zuora__ProductSKU__c.equals(other.getZuora__ProductSKU__c()))) &&
            ((this.zuora__ProductZuoraId__c==null && other.getZuora__ProductZuoraId__c()==null) || 
             (this.zuora__ProductZuoraId__c!=null &&
              this.zuora__ProductZuoraId__c.equals(other.getZuora__ProductZuoraId__c()))) &&
            ((this.zuora__Product__c==null && other.getZuora__Product__c()==null) || 
             (this.zuora__Product__c!=null &&
              this.zuora__Product__c.equals(other.getZuora__Product__c()))) &&
            ((this.zuora__Product__r==null && other.getZuora__Product__r()==null) || 
             (this.zuora__Product__r!=null &&
              this.zuora__Product__r.equals(other.getZuora__Product__r()))) &&
            ((this.zuora__RatePlanDescription__c==null && other.getZuora__RatePlanDescription__c()==null) || 
             (this.zuora__RatePlanDescription__c!=null &&
              this.zuora__RatePlanDescription__c.equals(other.getZuora__RatePlanDescription__c()))) &&
            ((this.zuora__RatePlanEffectiveEndDate__c==null && other.getZuora__RatePlanEffectiveEndDate__c()==null) || 
             (this.zuora__RatePlanEffectiveEndDate__c!=null &&
              this.zuora__RatePlanEffectiveEndDate__c.equals(other.getZuora__RatePlanEffectiveEndDate__c()))) &&
            ((this.zuora__RatePlanName__c==null && other.getZuora__RatePlanName__c()==null) || 
             (this.zuora__RatePlanName__c!=null &&
              this.zuora__RatePlanName__c.equals(other.getZuora__RatePlanName__c()))) &&
            ((this.zuora__RatePlanZuoraId__c==null && other.getZuora__RatePlanZuoraId__c()==null) || 
             (this.zuora__RatePlanZuoraId__c!=null &&
              this.zuora__RatePlanZuoraId__c.equals(other.getZuora__RatePlanZuoraId__c()))) &&
            ((this.zuora__Subscription__c==null && other.getZuora__Subscription__c()==null) || 
             (this.zuora__Subscription__c!=null &&
              this.zuora__Subscription__c.equals(other.getZuora__Subscription__c()))) &&
            ((this.zuora__Subscription__r==null && other.getZuora__Subscription__r()==null) || 
             (this.zuora__Subscription__r!=null &&
              this.zuora__Subscription__r.equals(other.getZuora__Subscription__r())));
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
        if (getZuora__External_Id__c() != null) {
            _hashCode += getZuora__External_Id__c().hashCode();
        }
        if (getZuora__FeatureCode__c() != null) {
            _hashCode += getZuora__FeatureCode__c().hashCode();
        }
        if (getZuora__FeatureDescription__c() != null) {
            _hashCode += getZuora__FeatureDescription__c().hashCode();
        }
        if (getZuora__FeatureName__c() != null) {
            _hashCode += getZuora__FeatureName__c().hashCode();
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
        if (getZuora__ProductNameProduct__c() != null) {
            _hashCode += getZuora__ProductNameProduct__c().hashCode();
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
        if (getZuora__ProductZuoraId__c() != null) {
            _hashCode += getZuora__ProductZuoraId__c().hashCode();
        }
        if (getZuora__Product__c() != null) {
            _hashCode += getZuora__Product__c().hashCode();
        }
        if (getZuora__Product__r() != null) {
            _hashCode += getZuora__Product__r().hashCode();
        }
        if (getZuora__RatePlanDescription__c() != null) {
            _hashCode += getZuora__RatePlanDescription__c().hashCode();
        }
        if (getZuora__RatePlanEffectiveEndDate__c() != null) {
            _hashCode += getZuora__RatePlanEffectiveEndDate__c().hashCode();
        }
        if (getZuora__RatePlanName__c() != null) {
            _hashCode += getZuora__RatePlanName__c().hashCode();
        }
        if (getZuora__RatePlanZuoraId__c() != null) {
            _hashCode += getZuora__RatePlanZuoraId__c().hashCode();
        }
        if (getZuora__Subscription__c() != null) {
            _hashCode += getZuora__Subscription__c().hashCode();
        }
        if (getZuora__Subscription__r() != null) {
            _hashCode += getZuora__Subscription__r().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Zuora__SubscriptionProductFeature__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__SubscriptionProductFeature__c"));
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
        elemField.setFieldName("zuora__External_Id__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__External_Id__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__FeatureCode__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__FeatureCode__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__FeatureDescription__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__FeatureDescription__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__FeatureName__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__FeatureName__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("zuora__ProductNameProduct__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__ProductNameProduct__c"));
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
        elemField.setFieldName("zuora__ProductZuoraId__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__ProductZuoraId__c"));
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
        elemField.setFieldName("zuora__RatePlanName__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__RatePlanName__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__RatePlanZuoraId__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__RatePlanZuoraId__c"));
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
