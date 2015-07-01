/**
 * Zuora__Subscription__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Zuora__Subscription__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
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

    private java.lang.Boolean zuora__AutoRenew__c;

    private java.util.Date zuora__ContractAcceptanceDate__c;

    private java.util.Date zuora__ContractEffectiveDate__c;

    private java.lang.String zuora__CustomerAccount__c;

    private com.sforce.soap.enterprise.sobject.Zuora__CustomerAccount__c zuora__CustomerAccount__r;

    private java.lang.String zuora__External_Id__c;

    private java.lang.String zuora__InitialTerm__c;

    private java.lang.String zuora__InvoiceOwner__c;

    private com.sforce.soap.enterprise.sobject.Zuora__CustomerAccount__c zuora__InvoiceOwner__r;

    private java.lang.Double zuora__MRR__c;

    private java.util.Date zuora__NextChargeDate__c;

    private java.util.Date zuora__NextRenewalDate__c;

    private java.lang.String zuora__Notes__c;

    private java.util.Date zuora__OriginalCreatedDate__c;

    private java.lang.String zuora__RenewalTerm__c;

    private java.util.Date zuora__ServiceActivationDate__c;

    private java.lang.String zuora__Status__c;

    private java.util.Date zuora__SubscriptionEndDate__c;

    private java.util.Date zuora__SubscriptionStartDate__c;

    private com.sforce.soap.enterprise.QueryResult zuora__Subscription_Product_Charges__r;

    private com.sforce.soap.enterprise.QueryResult zuora__Subscription_Product_Features__r;

    private java.lang.Double zuora__TCV__c;

    private java.util.Date zuora__TermEndDate__c;

    private java.lang.String zuora__TermSettingType__c;

    private java.util.Date zuora__TermStartDate__c;

    private java.lang.Double zuora__Version__c;

    private java.lang.String zuora__Zuora_Id__c;

    public Zuora__Subscription__c() {
    }

    public Zuora__Subscription__c(
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
           java.lang.Boolean zuora__AutoRenew__c,
           java.util.Date zuora__ContractAcceptanceDate__c,
           java.util.Date zuora__ContractEffectiveDate__c,
           java.lang.String zuora__CustomerAccount__c,
           com.sforce.soap.enterprise.sobject.Zuora__CustomerAccount__c zuora__CustomerAccount__r,
           java.lang.String zuora__External_Id__c,
           java.lang.String zuora__InitialTerm__c,
           java.lang.String zuora__InvoiceOwner__c,
           com.sforce.soap.enterprise.sobject.Zuora__CustomerAccount__c zuora__InvoiceOwner__r,
           java.lang.Double zuora__MRR__c,
           java.util.Date zuora__NextChargeDate__c,
           java.util.Date zuora__NextRenewalDate__c,
           java.lang.String zuora__Notes__c,
           java.util.Date zuora__OriginalCreatedDate__c,
           java.lang.String zuora__RenewalTerm__c,
           java.util.Date zuora__ServiceActivationDate__c,
           java.lang.String zuora__Status__c,
           java.util.Date zuora__SubscriptionEndDate__c,
           java.util.Date zuora__SubscriptionStartDate__c,
           com.sforce.soap.enterprise.QueryResult zuora__Subscription_Product_Charges__r,
           com.sforce.soap.enterprise.QueryResult zuora__Subscription_Product_Features__r,
           java.lang.Double zuora__TCV__c,
           java.util.Date zuora__TermEndDate__c,
           java.lang.String zuora__TermSettingType__c,
           java.util.Date zuora__TermStartDate__c,
           java.lang.Double zuora__Version__c,
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
        this.zuora__AutoRenew__c = zuora__AutoRenew__c;
        this.zuora__ContractAcceptanceDate__c = zuora__ContractAcceptanceDate__c;
        this.zuora__ContractEffectiveDate__c = zuora__ContractEffectiveDate__c;
        this.zuora__CustomerAccount__c = zuora__CustomerAccount__c;
        this.zuora__CustomerAccount__r = zuora__CustomerAccount__r;
        this.zuora__External_Id__c = zuora__External_Id__c;
        this.zuora__InitialTerm__c = zuora__InitialTerm__c;
        this.zuora__InvoiceOwner__c = zuora__InvoiceOwner__c;
        this.zuora__InvoiceOwner__r = zuora__InvoiceOwner__r;
        this.zuora__MRR__c = zuora__MRR__c;
        this.zuora__NextChargeDate__c = zuora__NextChargeDate__c;
        this.zuora__NextRenewalDate__c = zuora__NextRenewalDate__c;
        this.zuora__Notes__c = zuora__Notes__c;
        this.zuora__OriginalCreatedDate__c = zuora__OriginalCreatedDate__c;
        this.zuora__RenewalTerm__c = zuora__RenewalTerm__c;
        this.zuora__ServiceActivationDate__c = zuora__ServiceActivationDate__c;
        this.zuora__Status__c = zuora__Status__c;
        this.zuora__SubscriptionEndDate__c = zuora__SubscriptionEndDate__c;
        this.zuora__SubscriptionStartDate__c = zuora__SubscriptionStartDate__c;
        this.zuora__Subscription_Product_Charges__r = zuora__Subscription_Product_Charges__r;
        this.zuora__Subscription_Product_Features__r = zuora__Subscription_Product_Features__r;
        this.zuora__TCV__c = zuora__TCV__c;
        this.zuora__TermEndDate__c = zuora__TermEndDate__c;
        this.zuora__TermSettingType__c = zuora__TermSettingType__c;
        this.zuora__TermStartDate__c = zuora__TermStartDate__c;
        this.zuora__Version__c = zuora__Version__c;
        this.zuora__Zuora_Id__c = zuora__Zuora_Id__c;
    }


    /**
     * Gets the activityHistories value for this Zuora__Subscription__c.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this Zuora__Subscription__c.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the attachedContentDocuments value for this Zuora__Subscription__c.
     * 
     * @return attachedContentDocuments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachedContentDocuments() {
        return attachedContentDocuments;
    }


    /**
     * Sets the attachedContentDocuments value for this Zuora__Subscription__c.
     * 
     * @param attachedContentDocuments
     */
    public void setAttachedContentDocuments(com.sforce.soap.enterprise.QueryResult attachedContentDocuments) {
        this.attachedContentDocuments = attachedContentDocuments;
    }


    /**
     * Gets the attachments value for this Zuora__Subscription__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Zuora__Subscription__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the combinedAttachments value for this Zuora__Subscription__c.
     * 
     * @return combinedAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getCombinedAttachments() {
        return combinedAttachments;
    }


    /**
     * Sets the combinedAttachments value for this Zuora__Subscription__c.
     * 
     * @param combinedAttachments
     */
    public void setCombinedAttachments(com.sforce.soap.enterprise.QueryResult combinedAttachments) {
        this.combinedAttachments = combinedAttachments;
    }


    /**
     * Gets the createdBy value for this Zuora__Subscription__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Zuora__Subscription__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Zuora__Subscription__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Zuora__Subscription__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Zuora__Subscription__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Zuora__Subscription__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the duplicateRecordItems value for this Zuora__Subscription__c.
     * 
     * @return duplicateRecordItems
     */
    public com.sforce.soap.enterprise.QueryResult getDuplicateRecordItems() {
        return duplicateRecordItems;
    }


    /**
     * Sets the duplicateRecordItems value for this Zuora__Subscription__c.
     * 
     * @param duplicateRecordItems
     */
    public void setDuplicateRecordItems(com.sforce.soap.enterprise.QueryResult duplicateRecordItems) {
        this.duplicateRecordItems = duplicateRecordItems;
    }


    /**
     * Gets the events value for this Zuora__Subscription__c.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this Zuora__Subscription__c.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Zuora__Subscription__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Zuora__Subscription__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the isDeleted value for this Zuora__Subscription__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Zuora__Subscription__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastActivityDate value for this Zuora__Subscription__c.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this Zuora__Subscription__c.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this Zuora__Subscription__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Zuora__Subscription__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Zuora__Subscription__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Zuora__Subscription__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Zuora__Subscription__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Zuora__Subscription__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lookedUpFromActivities value for this Zuora__Subscription__c.
     * 
     * @return lookedUpFromActivities
     */
    public com.sforce.soap.enterprise.QueryResult getLookedUpFromActivities() {
        return lookedUpFromActivities;
    }


    /**
     * Sets the lookedUpFromActivities value for this Zuora__Subscription__c.
     * 
     * @param lookedUpFromActivities
     */
    public void setLookedUpFromActivities(com.sforce.soap.enterprise.QueryResult lookedUpFromActivities) {
        this.lookedUpFromActivities = lookedUpFromActivities;
    }


    /**
     * Gets the name value for this Zuora__Subscription__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Zuora__Subscription__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Zuora__Subscription__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Zuora__Subscription__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Zuora__Subscription__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Zuora__Subscription__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the openActivities value for this Zuora__Subscription__c.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this Zuora__Subscription__c.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the owner value for this Zuora__Subscription__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.SObject getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Zuora__Subscription__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.SObject owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Zuora__Subscription__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Zuora__Subscription__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the processInstances value for this Zuora__Subscription__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Zuora__Subscription__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Zuora__Subscription__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Zuora__Subscription__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the recordAssociatedGroups value for this Zuora__Subscription__c.
     * 
     * @return recordAssociatedGroups
     */
    public com.sforce.soap.enterprise.QueryResult getRecordAssociatedGroups() {
        return recordAssociatedGroups;
    }


    /**
     * Sets the recordAssociatedGroups value for this Zuora__Subscription__c.
     * 
     * @param recordAssociatedGroups
     */
    public void setRecordAssociatedGroups(com.sforce.soap.enterprise.QueryResult recordAssociatedGroups) {
        this.recordAssociatedGroups = recordAssociatedGroups;
    }


    /**
     * Gets the systemModstamp value for this Zuora__Subscription__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Zuora__Subscription__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this Zuora__Subscription__c.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this Zuora__Subscription__c.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the topicAssignments value for this Zuora__Subscription__c.
     * 
     * @return topicAssignments
     */
    public com.sforce.soap.enterprise.QueryResult getTopicAssignments() {
        return topicAssignments;
    }


    /**
     * Sets the topicAssignments value for this Zuora__Subscription__c.
     * 
     * @param topicAssignments
     */
    public void setTopicAssignments(com.sforce.soap.enterprise.QueryResult topicAssignments) {
        this.topicAssignments = topicAssignments;
    }


    /**
     * Gets the userRecordAccess value for this Zuora__Subscription__c.
     * 
     * @return userRecordAccess
     */
    public com.sforce.soap.enterprise.sobject.UserRecordAccess getUserRecordAccess() {
        return userRecordAccess;
    }


    /**
     * Sets the userRecordAccess value for this Zuora__Subscription__c.
     * 
     * @param userRecordAccess
     */
    public void setUserRecordAccess(com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess) {
        this.userRecordAccess = userRecordAccess;
    }


    /**
     * Gets the zuora__Account__c value for this Zuora__Subscription__c.
     * 
     * @return zuora__Account__c
     */
    public java.lang.String getZuora__Account__c() {
        return zuora__Account__c;
    }


    /**
     * Sets the zuora__Account__c value for this Zuora__Subscription__c.
     * 
     * @param zuora__Account__c
     */
    public void setZuora__Account__c(java.lang.String zuora__Account__c) {
        this.zuora__Account__c = zuora__Account__c;
    }


    /**
     * Gets the zuora__Account__r value for this Zuora__Subscription__c.
     * 
     * @return zuora__Account__r
     */
    public com.sforce.soap.enterprise.sobject.Account getZuora__Account__r() {
        return zuora__Account__r;
    }


    /**
     * Sets the zuora__Account__r value for this Zuora__Subscription__c.
     * 
     * @param zuora__Account__r
     */
    public void setZuora__Account__r(com.sforce.soap.enterprise.sobject.Account zuora__Account__r) {
        this.zuora__Account__r = zuora__Account__r;
    }


    /**
     * Gets the zuora__AutoRenew__c value for this Zuora__Subscription__c.
     * 
     * @return zuora__AutoRenew__c
     */
    public java.lang.Boolean getZuora__AutoRenew__c() {
        return zuora__AutoRenew__c;
    }


    /**
     * Sets the zuora__AutoRenew__c value for this Zuora__Subscription__c.
     * 
     * @param zuora__AutoRenew__c
     */
    public void setZuora__AutoRenew__c(java.lang.Boolean zuora__AutoRenew__c) {
        this.zuora__AutoRenew__c = zuora__AutoRenew__c;
    }


    /**
     * Gets the zuora__ContractAcceptanceDate__c value for this Zuora__Subscription__c.
     * 
     * @return zuora__ContractAcceptanceDate__c
     */
    public java.util.Date getZuora__ContractAcceptanceDate__c() {
        return zuora__ContractAcceptanceDate__c;
    }


    /**
     * Sets the zuora__ContractAcceptanceDate__c value for this Zuora__Subscription__c.
     * 
     * @param zuora__ContractAcceptanceDate__c
     */
    public void setZuora__ContractAcceptanceDate__c(java.util.Date zuora__ContractAcceptanceDate__c) {
        this.zuora__ContractAcceptanceDate__c = zuora__ContractAcceptanceDate__c;
    }


    /**
     * Gets the zuora__ContractEffectiveDate__c value for this Zuora__Subscription__c.
     * 
     * @return zuora__ContractEffectiveDate__c
     */
    public java.util.Date getZuora__ContractEffectiveDate__c() {
        return zuora__ContractEffectiveDate__c;
    }


    /**
     * Sets the zuora__ContractEffectiveDate__c value for this Zuora__Subscription__c.
     * 
     * @param zuora__ContractEffectiveDate__c
     */
    public void setZuora__ContractEffectiveDate__c(java.util.Date zuora__ContractEffectiveDate__c) {
        this.zuora__ContractEffectiveDate__c = zuora__ContractEffectiveDate__c;
    }


    /**
     * Gets the zuora__CustomerAccount__c value for this Zuora__Subscription__c.
     * 
     * @return zuora__CustomerAccount__c
     */
    public java.lang.String getZuora__CustomerAccount__c() {
        return zuora__CustomerAccount__c;
    }


    /**
     * Sets the zuora__CustomerAccount__c value for this Zuora__Subscription__c.
     * 
     * @param zuora__CustomerAccount__c
     */
    public void setZuora__CustomerAccount__c(java.lang.String zuora__CustomerAccount__c) {
        this.zuora__CustomerAccount__c = zuora__CustomerAccount__c;
    }


    /**
     * Gets the zuora__CustomerAccount__r value for this Zuora__Subscription__c.
     * 
     * @return zuora__CustomerAccount__r
     */
    public com.sforce.soap.enterprise.sobject.Zuora__CustomerAccount__c getZuora__CustomerAccount__r() {
        return zuora__CustomerAccount__r;
    }


    /**
     * Sets the zuora__CustomerAccount__r value for this Zuora__Subscription__c.
     * 
     * @param zuora__CustomerAccount__r
     */
    public void setZuora__CustomerAccount__r(com.sforce.soap.enterprise.sobject.Zuora__CustomerAccount__c zuora__CustomerAccount__r) {
        this.zuora__CustomerAccount__r = zuora__CustomerAccount__r;
    }


    /**
     * Gets the zuora__External_Id__c value for this Zuora__Subscription__c.
     * 
     * @return zuora__External_Id__c
     */
    public java.lang.String getZuora__External_Id__c() {
        return zuora__External_Id__c;
    }


    /**
     * Sets the zuora__External_Id__c value for this Zuora__Subscription__c.
     * 
     * @param zuora__External_Id__c
     */
    public void setZuora__External_Id__c(java.lang.String zuora__External_Id__c) {
        this.zuora__External_Id__c = zuora__External_Id__c;
    }


    /**
     * Gets the zuora__InitialTerm__c value for this Zuora__Subscription__c.
     * 
     * @return zuora__InitialTerm__c
     */
    public java.lang.String getZuora__InitialTerm__c() {
        return zuora__InitialTerm__c;
    }


    /**
     * Sets the zuora__InitialTerm__c value for this Zuora__Subscription__c.
     * 
     * @param zuora__InitialTerm__c
     */
    public void setZuora__InitialTerm__c(java.lang.String zuora__InitialTerm__c) {
        this.zuora__InitialTerm__c = zuora__InitialTerm__c;
    }


    /**
     * Gets the zuora__InvoiceOwner__c value for this Zuora__Subscription__c.
     * 
     * @return zuora__InvoiceOwner__c
     */
    public java.lang.String getZuora__InvoiceOwner__c() {
        return zuora__InvoiceOwner__c;
    }


    /**
     * Sets the zuora__InvoiceOwner__c value for this Zuora__Subscription__c.
     * 
     * @param zuora__InvoiceOwner__c
     */
    public void setZuora__InvoiceOwner__c(java.lang.String zuora__InvoiceOwner__c) {
        this.zuora__InvoiceOwner__c = zuora__InvoiceOwner__c;
    }


    /**
     * Gets the zuora__InvoiceOwner__r value for this Zuora__Subscription__c.
     * 
     * @return zuora__InvoiceOwner__r
     */
    public com.sforce.soap.enterprise.sobject.Zuora__CustomerAccount__c getZuora__InvoiceOwner__r() {
        return zuora__InvoiceOwner__r;
    }


    /**
     * Sets the zuora__InvoiceOwner__r value for this Zuora__Subscription__c.
     * 
     * @param zuora__InvoiceOwner__r
     */
    public void setZuora__InvoiceOwner__r(com.sforce.soap.enterprise.sobject.Zuora__CustomerAccount__c zuora__InvoiceOwner__r) {
        this.zuora__InvoiceOwner__r = zuora__InvoiceOwner__r;
    }


    /**
     * Gets the zuora__MRR__c value for this Zuora__Subscription__c.
     * 
     * @return zuora__MRR__c
     */
    public java.lang.Double getZuora__MRR__c() {
        return zuora__MRR__c;
    }


    /**
     * Sets the zuora__MRR__c value for this Zuora__Subscription__c.
     * 
     * @param zuora__MRR__c
     */
    public void setZuora__MRR__c(java.lang.Double zuora__MRR__c) {
        this.zuora__MRR__c = zuora__MRR__c;
    }


    /**
     * Gets the zuora__NextChargeDate__c value for this Zuora__Subscription__c.
     * 
     * @return zuora__NextChargeDate__c
     */
    public java.util.Date getZuora__NextChargeDate__c() {
        return zuora__NextChargeDate__c;
    }


    /**
     * Sets the zuora__NextChargeDate__c value for this Zuora__Subscription__c.
     * 
     * @param zuora__NextChargeDate__c
     */
    public void setZuora__NextChargeDate__c(java.util.Date zuora__NextChargeDate__c) {
        this.zuora__NextChargeDate__c = zuora__NextChargeDate__c;
    }


    /**
     * Gets the zuora__NextRenewalDate__c value for this Zuora__Subscription__c.
     * 
     * @return zuora__NextRenewalDate__c
     */
    public java.util.Date getZuora__NextRenewalDate__c() {
        return zuora__NextRenewalDate__c;
    }


    /**
     * Sets the zuora__NextRenewalDate__c value for this Zuora__Subscription__c.
     * 
     * @param zuora__NextRenewalDate__c
     */
    public void setZuora__NextRenewalDate__c(java.util.Date zuora__NextRenewalDate__c) {
        this.zuora__NextRenewalDate__c = zuora__NextRenewalDate__c;
    }


    /**
     * Gets the zuora__Notes__c value for this Zuora__Subscription__c.
     * 
     * @return zuora__Notes__c
     */
    public java.lang.String getZuora__Notes__c() {
        return zuora__Notes__c;
    }


    /**
     * Sets the zuora__Notes__c value for this Zuora__Subscription__c.
     * 
     * @param zuora__Notes__c
     */
    public void setZuora__Notes__c(java.lang.String zuora__Notes__c) {
        this.zuora__Notes__c = zuora__Notes__c;
    }


    /**
     * Gets the zuora__OriginalCreatedDate__c value for this Zuora__Subscription__c.
     * 
     * @return zuora__OriginalCreatedDate__c
     */
    public java.util.Date getZuora__OriginalCreatedDate__c() {
        return zuora__OriginalCreatedDate__c;
    }


    /**
     * Sets the zuora__OriginalCreatedDate__c value for this Zuora__Subscription__c.
     * 
     * @param zuora__OriginalCreatedDate__c
     */
    public void setZuora__OriginalCreatedDate__c(java.util.Date zuora__OriginalCreatedDate__c) {
        this.zuora__OriginalCreatedDate__c = zuora__OriginalCreatedDate__c;
    }


    /**
     * Gets the zuora__RenewalTerm__c value for this Zuora__Subscription__c.
     * 
     * @return zuora__RenewalTerm__c
     */
    public java.lang.String getZuora__RenewalTerm__c() {
        return zuora__RenewalTerm__c;
    }


    /**
     * Sets the zuora__RenewalTerm__c value for this Zuora__Subscription__c.
     * 
     * @param zuora__RenewalTerm__c
     */
    public void setZuora__RenewalTerm__c(java.lang.String zuora__RenewalTerm__c) {
        this.zuora__RenewalTerm__c = zuora__RenewalTerm__c;
    }


    /**
     * Gets the zuora__ServiceActivationDate__c value for this Zuora__Subscription__c.
     * 
     * @return zuora__ServiceActivationDate__c
     */
    public java.util.Date getZuora__ServiceActivationDate__c() {
        return zuora__ServiceActivationDate__c;
    }


    /**
     * Sets the zuora__ServiceActivationDate__c value for this Zuora__Subscription__c.
     * 
     * @param zuora__ServiceActivationDate__c
     */
    public void setZuora__ServiceActivationDate__c(java.util.Date zuora__ServiceActivationDate__c) {
        this.zuora__ServiceActivationDate__c = zuora__ServiceActivationDate__c;
    }


    /**
     * Gets the zuora__Status__c value for this Zuora__Subscription__c.
     * 
     * @return zuora__Status__c
     */
    public java.lang.String getZuora__Status__c() {
        return zuora__Status__c;
    }


    /**
     * Sets the zuora__Status__c value for this Zuora__Subscription__c.
     * 
     * @param zuora__Status__c
     */
    public void setZuora__Status__c(java.lang.String zuora__Status__c) {
        this.zuora__Status__c = zuora__Status__c;
    }


    /**
     * Gets the zuora__SubscriptionEndDate__c value for this Zuora__Subscription__c.
     * 
     * @return zuora__SubscriptionEndDate__c
     */
    public java.util.Date getZuora__SubscriptionEndDate__c() {
        return zuora__SubscriptionEndDate__c;
    }


    /**
     * Sets the zuora__SubscriptionEndDate__c value for this Zuora__Subscription__c.
     * 
     * @param zuora__SubscriptionEndDate__c
     */
    public void setZuora__SubscriptionEndDate__c(java.util.Date zuora__SubscriptionEndDate__c) {
        this.zuora__SubscriptionEndDate__c = zuora__SubscriptionEndDate__c;
    }


    /**
     * Gets the zuora__SubscriptionStartDate__c value for this Zuora__Subscription__c.
     * 
     * @return zuora__SubscriptionStartDate__c
     */
    public java.util.Date getZuora__SubscriptionStartDate__c() {
        return zuora__SubscriptionStartDate__c;
    }


    /**
     * Sets the zuora__SubscriptionStartDate__c value for this Zuora__Subscription__c.
     * 
     * @param zuora__SubscriptionStartDate__c
     */
    public void setZuora__SubscriptionStartDate__c(java.util.Date zuora__SubscriptionStartDate__c) {
        this.zuora__SubscriptionStartDate__c = zuora__SubscriptionStartDate__c;
    }


    /**
     * Gets the zuora__Subscription_Product_Charges__r value for this Zuora__Subscription__c.
     * 
     * @return zuora__Subscription_Product_Charges__r
     */
    public com.sforce.soap.enterprise.QueryResult getZuora__Subscription_Product_Charges__r() {
        return zuora__Subscription_Product_Charges__r;
    }


    /**
     * Sets the zuora__Subscription_Product_Charges__r value for this Zuora__Subscription__c.
     * 
     * @param zuora__Subscription_Product_Charges__r
     */
    public void setZuora__Subscription_Product_Charges__r(com.sforce.soap.enterprise.QueryResult zuora__Subscription_Product_Charges__r) {
        this.zuora__Subscription_Product_Charges__r = zuora__Subscription_Product_Charges__r;
    }


    /**
     * Gets the zuora__Subscription_Product_Features__r value for this Zuora__Subscription__c.
     * 
     * @return zuora__Subscription_Product_Features__r
     */
    public com.sforce.soap.enterprise.QueryResult getZuora__Subscription_Product_Features__r() {
        return zuora__Subscription_Product_Features__r;
    }


    /**
     * Sets the zuora__Subscription_Product_Features__r value for this Zuora__Subscription__c.
     * 
     * @param zuora__Subscription_Product_Features__r
     */
    public void setZuora__Subscription_Product_Features__r(com.sforce.soap.enterprise.QueryResult zuora__Subscription_Product_Features__r) {
        this.zuora__Subscription_Product_Features__r = zuora__Subscription_Product_Features__r;
    }


    /**
     * Gets the zuora__TCV__c value for this Zuora__Subscription__c.
     * 
     * @return zuora__TCV__c
     */
    public java.lang.Double getZuora__TCV__c() {
        return zuora__TCV__c;
    }


    /**
     * Sets the zuora__TCV__c value for this Zuora__Subscription__c.
     * 
     * @param zuora__TCV__c
     */
    public void setZuora__TCV__c(java.lang.Double zuora__TCV__c) {
        this.zuora__TCV__c = zuora__TCV__c;
    }


    /**
     * Gets the zuora__TermEndDate__c value for this Zuora__Subscription__c.
     * 
     * @return zuora__TermEndDate__c
     */
    public java.util.Date getZuora__TermEndDate__c() {
        return zuora__TermEndDate__c;
    }


    /**
     * Sets the zuora__TermEndDate__c value for this Zuora__Subscription__c.
     * 
     * @param zuora__TermEndDate__c
     */
    public void setZuora__TermEndDate__c(java.util.Date zuora__TermEndDate__c) {
        this.zuora__TermEndDate__c = zuora__TermEndDate__c;
    }


    /**
     * Gets the zuora__TermSettingType__c value for this Zuora__Subscription__c.
     * 
     * @return zuora__TermSettingType__c
     */
    public java.lang.String getZuora__TermSettingType__c() {
        return zuora__TermSettingType__c;
    }


    /**
     * Sets the zuora__TermSettingType__c value for this Zuora__Subscription__c.
     * 
     * @param zuora__TermSettingType__c
     */
    public void setZuora__TermSettingType__c(java.lang.String zuora__TermSettingType__c) {
        this.zuora__TermSettingType__c = zuora__TermSettingType__c;
    }


    /**
     * Gets the zuora__TermStartDate__c value for this Zuora__Subscription__c.
     * 
     * @return zuora__TermStartDate__c
     */
    public java.util.Date getZuora__TermStartDate__c() {
        return zuora__TermStartDate__c;
    }


    /**
     * Sets the zuora__TermStartDate__c value for this Zuora__Subscription__c.
     * 
     * @param zuora__TermStartDate__c
     */
    public void setZuora__TermStartDate__c(java.util.Date zuora__TermStartDate__c) {
        this.zuora__TermStartDate__c = zuora__TermStartDate__c;
    }


    /**
     * Gets the zuora__Version__c value for this Zuora__Subscription__c.
     * 
     * @return zuora__Version__c
     */
    public java.lang.Double getZuora__Version__c() {
        return zuora__Version__c;
    }


    /**
     * Sets the zuora__Version__c value for this Zuora__Subscription__c.
     * 
     * @param zuora__Version__c
     */
    public void setZuora__Version__c(java.lang.Double zuora__Version__c) {
        this.zuora__Version__c = zuora__Version__c;
    }


    /**
     * Gets the zuora__Zuora_Id__c value for this Zuora__Subscription__c.
     * 
     * @return zuora__Zuora_Id__c
     */
    public java.lang.String getZuora__Zuora_Id__c() {
        return zuora__Zuora_Id__c;
    }


    /**
     * Sets the zuora__Zuora_Id__c value for this Zuora__Subscription__c.
     * 
     * @param zuora__Zuora_Id__c
     */
    public void setZuora__Zuora_Id__c(java.lang.String zuora__Zuora_Id__c) {
        this.zuora__Zuora_Id__c = zuora__Zuora_Id__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Zuora__Subscription__c)) return false;
        Zuora__Subscription__c other = (Zuora__Subscription__c) obj;
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
            ((this.zuora__AutoRenew__c==null && other.getZuora__AutoRenew__c()==null) || 
             (this.zuora__AutoRenew__c!=null &&
              this.zuora__AutoRenew__c.equals(other.getZuora__AutoRenew__c()))) &&
            ((this.zuora__ContractAcceptanceDate__c==null && other.getZuora__ContractAcceptanceDate__c()==null) || 
             (this.zuora__ContractAcceptanceDate__c!=null &&
              this.zuora__ContractAcceptanceDate__c.equals(other.getZuora__ContractAcceptanceDate__c()))) &&
            ((this.zuora__ContractEffectiveDate__c==null && other.getZuora__ContractEffectiveDate__c()==null) || 
             (this.zuora__ContractEffectiveDate__c!=null &&
              this.zuora__ContractEffectiveDate__c.equals(other.getZuora__ContractEffectiveDate__c()))) &&
            ((this.zuora__CustomerAccount__c==null && other.getZuora__CustomerAccount__c()==null) || 
             (this.zuora__CustomerAccount__c!=null &&
              this.zuora__CustomerAccount__c.equals(other.getZuora__CustomerAccount__c()))) &&
            ((this.zuora__CustomerAccount__r==null && other.getZuora__CustomerAccount__r()==null) || 
             (this.zuora__CustomerAccount__r!=null &&
              this.zuora__CustomerAccount__r.equals(other.getZuora__CustomerAccount__r()))) &&
            ((this.zuora__External_Id__c==null && other.getZuora__External_Id__c()==null) || 
             (this.zuora__External_Id__c!=null &&
              this.zuora__External_Id__c.equals(other.getZuora__External_Id__c()))) &&
            ((this.zuora__InitialTerm__c==null && other.getZuora__InitialTerm__c()==null) || 
             (this.zuora__InitialTerm__c!=null &&
              this.zuora__InitialTerm__c.equals(other.getZuora__InitialTerm__c()))) &&
            ((this.zuora__InvoiceOwner__c==null && other.getZuora__InvoiceOwner__c()==null) || 
             (this.zuora__InvoiceOwner__c!=null &&
              this.zuora__InvoiceOwner__c.equals(other.getZuora__InvoiceOwner__c()))) &&
            ((this.zuora__InvoiceOwner__r==null && other.getZuora__InvoiceOwner__r()==null) || 
             (this.zuora__InvoiceOwner__r!=null &&
              this.zuora__InvoiceOwner__r.equals(other.getZuora__InvoiceOwner__r()))) &&
            ((this.zuora__MRR__c==null && other.getZuora__MRR__c()==null) || 
             (this.zuora__MRR__c!=null &&
              this.zuora__MRR__c.equals(other.getZuora__MRR__c()))) &&
            ((this.zuora__NextChargeDate__c==null && other.getZuora__NextChargeDate__c()==null) || 
             (this.zuora__NextChargeDate__c!=null &&
              this.zuora__NextChargeDate__c.equals(other.getZuora__NextChargeDate__c()))) &&
            ((this.zuora__NextRenewalDate__c==null && other.getZuora__NextRenewalDate__c()==null) || 
             (this.zuora__NextRenewalDate__c!=null &&
              this.zuora__NextRenewalDate__c.equals(other.getZuora__NextRenewalDate__c()))) &&
            ((this.zuora__Notes__c==null && other.getZuora__Notes__c()==null) || 
             (this.zuora__Notes__c!=null &&
              this.zuora__Notes__c.equals(other.getZuora__Notes__c()))) &&
            ((this.zuora__OriginalCreatedDate__c==null && other.getZuora__OriginalCreatedDate__c()==null) || 
             (this.zuora__OriginalCreatedDate__c!=null &&
              this.zuora__OriginalCreatedDate__c.equals(other.getZuora__OriginalCreatedDate__c()))) &&
            ((this.zuora__RenewalTerm__c==null && other.getZuora__RenewalTerm__c()==null) || 
             (this.zuora__RenewalTerm__c!=null &&
              this.zuora__RenewalTerm__c.equals(other.getZuora__RenewalTerm__c()))) &&
            ((this.zuora__ServiceActivationDate__c==null && other.getZuora__ServiceActivationDate__c()==null) || 
             (this.zuora__ServiceActivationDate__c!=null &&
              this.zuora__ServiceActivationDate__c.equals(other.getZuora__ServiceActivationDate__c()))) &&
            ((this.zuora__Status__c==null && other.getZuora__Status__c()==null) || 
             (this.zuora__Status__c!=null &&
              this.zuora__Status__c.equals(other.getZuora__Status__c()))) &&
            ((this.zuora__SubscriptionEndDate__c==null && other.getZuora__SubscriptionEndDate__c()==null) || 
             (this.zuora__SubscriptionEndDate__c!=null &&
              this.zuora__SubscriptionEndDate__c.equals(other.getZuora__SubscriptionEndDate__c()))) &&
            ((this.zuora__SubscriptionStartDate__c==null && other.getZuora__SubscriptionStartDate__c()==null) || 
             (this.zuora__SubscriptionStartDate__c!=null &&
              this.zuora__SubscriptionStartDate__c.equals(other.getZuora__SubscriptionStartDate__c()))) &&
            ((this.zuora__Subscription_Product_Charges__r==null && other.getZuora__Subscription_Product_Charges__r()==null) || 
             (this.zuora__Subscription_Product_Charges__r!=null &&
              this.zuora__Subscription_Product_Charges__r.equals(other.getZuora__Subscription_Product_Charges__r()))) &&
            ((this.zuora__Subscription_Product_Features__r==null && other.getZuora__Subscription_Product_Features__r()==null) || 
             (this.zuora__Subscription_Product_Features__r!=null &&
              this.zuora__Subscription_Product_Features__r.equals(other.getZuora__Subscription_Product_Features__r()))) &&
            ((this.zuora__TCV__c==null && other.getZuora__TCV__c()==null) || 
             (this.zuora__TCV__c!=null &&
              this.zuora__TCV__c.equals(other.getZuora__TCV__c()))) &&
            ((this.zuora__TermEndDate__c==null && other.getZuora__TermEndDate__c()==null) || 
             (this.zuora__TermEndDate__c!=null &&
              this.zuora__TermEndDate__c.equals(other.getZuora__TermEndDate__c()))) &&
            ((this.zuora__TermSettingType__c==null && other.getZuora__TermSettingType__c()==null) || 
             (this.zuora__TermSettingType__c!=null &&
              this.zuora__TermSettingType__c.equals(other.getZuora__TermSettingType__c()))) &&
            ((this.zuora__TermStartDate__c==null && other.getZuora__TermStartDate__c()==null) || 
             (this.zuora__TermStartDate__c!=null &&
              this.zuora__TermStartDate__c.equals(other.getZuora__TermStartDate__c()))) &&
            ((this.zuora__Version__c==null && other.getZuora__Version__c()==null) || 
             (this.zuora__Version__c!=null &&
              this.zuora__Version__c.equals(other.getZuora__Version__c()))) &&
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
        if (getZuora__AutoRenew__c() != null) {
            _hashCode += getZuora__AutoRenew__c().hashCode();
        }
        if (getZuora__ContractAcceptanceDate__c() != null) {
            _hashCode += getZuora__ContractAcceptanceDate__c().hashCode();
        }
        if (getZuora__ContractEffectiveDate__c() != null) {
            _hashCode += getZuora__ContractEffectiveDate__c().hashCode();
        }
        if (getZuora__CustomerAccount__c() != null) {
            _hashCode += getZuora__CustomerAccount__c().hashCode();
        }
        if (getZuora__CustomerAccount__r() != null) {
            _hashCode += getZuora__CustomerAccount__r().hashCode();
        }
        if (getZuora__External_Id__c() != null) {
            _hashCode += getZuora__External_Id__c().hashCode();
        }
        if (getZuora__InitialTerm__c() != null) {
            _hashCode += getZuora__InitialTerm__c().hashCode();
        }
        if (getZuora__InvoiceOwner__c() != null) {
            _hashCode += getZuora__InvoiceOwner__c().hashCode();
        }
        if (getZuora__InvoiceOwner__r() != null) {
            _hashCode += getZuora__InvoiceOwner__r().hashCode();
        }
        if (getZuora__MRR__c() != null) {
            _hashCode += getZuora__MRR__c().hashCode();
        }
        if (getZuora__NextChargeDate__c() != null) {
            _hashCode += getZuora__NextChargeDate__c().hashCode();
        }
        if (getZuora__NextRenewalDate__c() != null) {
            _hashCode += getZuora__NextRenewalDate__c().hashCode();
        }
        if (getZuora__Notes__c() != null) {
            _hashCode += getZuora__Notes__c().hashCode();
        }
        if (getZuora__OriginalCreatedDate__c() != null) {
            _hashCode += getZuora__OriginalCreatedDate__c().hashCode();
        }
        if (getZuora__RenewalTerm__c() != null) {
            _hashCode += getZuora__RenewalTerm__c().hashCode();
        }
        if (getZuora__ServiceActivationDate__c() != null) {
            _hashCode += getZuora__ServiceActivationDate__c().hashCode();
        }
        if (getZuora__Status__c() != null) {
            _hashCode += getZuora__Status__c().hashCode();
        }
        if (getZuora__SubscriptionEndDate__c() != null) {
            _hashCode += getZuora__SubscriptionEndDate__c().hashCode();
        }
        if (getZuora__SubscriptionStartDate__c() != null) {
            _hashCode += getZuora__SubscriptionStartDate__c().hashCode();
        }
        if (getZuora__Subscription_Product_Charges__r() != null) {
            _hashCode += getZuora__Subscription_Product_Charges__r().hashCode();
        }
        if (getZuora__Subscription_Product_Features__r() != null) {
            _hashCode += getZuora__Subscription_Product_Features__r().hashCode();
        }
        if (getZuora__TCV__c() != null) {
            _hashCode += getZuora__TCV__c().hashCode();
        }
        if (getZuora__TermEndDate__c() != null) {
            _hashCode += getZuora__TermEndDate__c().hashCode();
        }
        if (getZuora__TermSettingType__c() != null) {
            _hashCode += getZuora__TermSettingType__c().hashCode();
        }
        if (getZuora__TermStartDate__c() != null) {
            _hashCode += getZuora__TermStartDate__c().hashCode();
        }
        if (getZuora__Version__c() != null) {
            _hashCode += getZuora__Version__c().hashCode();
        }
        if (getZuora__Zuora_Id__c() != null) {
            _hashCode += getZuora__Zuora_Id__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Zuora__Subscription__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Subscription__c"));
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
        elemField.setFieldName("zuora__AutoRenew__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__AutoRenew__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__ContractAcceptanceDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__ContractAcceptanceDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__ContractEffectiveDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__ContractEffectiveDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__CustomerAccount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__CustomerAccount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__CustomerAccount__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__CustomerAccount__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__CustomerAccount__c"));
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
        elemField.setFieldName("zuora__InitialTerm__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__InitialTerm__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__InvoiceOwner__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__InvoiceOwner__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__InvoiceOwner__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__InvoiceOwner__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__CustomerAccount__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__MRR__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__MRR__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__NextChargeDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__NextChargeDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__NextRenewalDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__NextRenewalDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__Notes__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Notes__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__OriginalCreatedDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__OriginalCreatedDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__RenewalTerm__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__RenewalTerm__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__ServiceActivationDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__ServiceActivationDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__Status__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Status__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__SubscriptionEndDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__SubscriptionEndDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__SubscriptionStartDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__SubscriptionStartDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__Subscription_Product_Charges__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Subscription_Product_Charges__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__Subscription_Product_Features__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Subscription_Product_Features__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__TCV__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__TCV__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__TermEndDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__TermEndDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__TermSettingType__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__TermSettingType__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__TermStartDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__TermStartDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__Version__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Version__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
