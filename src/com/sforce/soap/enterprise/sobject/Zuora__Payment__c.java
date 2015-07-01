/**
 * Zuora__Payment__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Zuora__Payment__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
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

    private java.lang.Double zuora__Amount__c;

    private java.lang.Double zuora__AppliedCreditBalanceAmount__c;

    private java.lang.Double zuora__AppliedInvoiceAmount__c;

    private java.lang.String zuora__AuthTransactionId__c;

    private java.lang.String zuora__BankIdentificationNumber__c;

    private java.lang.String zuora__BillingAccount__c;

    private com.sforce.soap.enterprise.sobject.Zuora__CustomerAccount__c zuora__BillingAccount__r;

    private java.util.Calendar zuora__CancelledOn__c;

    private java.lang.String zuora__Comment__c;

    private java.lang.String zuora__CreatedById__c;

    private java.util.Calendar zuora__CreatedDate__c;

    private java.lang.String zuora__EXT_ID__c;

    private java.util.Calendar zuora__EffectiveDate__c;

    private java.lang.String zuora__External_Id__c;

    private java.lang.String zuora__GatewayOrderId__c;

    private java.lang.String zuora__GatewayResponseCode__c;

    private java.lang.String zuora__GatewayResponse__c;

    private java.lang.String zuora__GatewayStatus__c;

    private java.lang.String zuora__InvoiceNumber__c;

    private java.lang.String zuora__Invoice__c;

    private com.sforce.soap.enterprise.sobject.Zuora__ZInvoice__c zuora__Invoice__r;

    private java.util.Calendar zuora__MarkedForSubmissionOn__c;

    private com.sforce.soap.enterprise.QueryResult zuora__PaymentInvoices__r;

    private java.lang.String zuora__PaymentMethod__c;

    private java.lang.String zuora__PaymentNumber__c;

    private java.lang.String zuora__ReferenceId__c;

    private java.lang.Double zuora__RefundedAmount__c;

    private com.sforce.soap.enterprise.QueryResult zuora__Refunds__r;

    private java.lang.String zuora__SecondPaymentReferenceId__c;

    private java.util.Calendar zuora__SettledOn__c;

    private java.lang.String zuora__SoftDescriptorPhone__c;

    private java.lang.String zuora__SoftDescriptor__c;

    private java.lang.String zuora__Status__c;

    private java.util.Calendar zuora__SubmittedOn__c;

    private java.lang.String zuora__TransferedToAccounting__c;

    private java.lang.String zuora__Type__c;

    private java.lang.String zuora__UpdatedById__c;

    private java.util.Calendar zuora__UpdatedDate__c;

    public Zuora__Payment__c() {
    }

    public Zuora__Payment__c(
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
           java.lang.Double zuora__Amount__c,
           java.lang.Double zuora__AppliedCreditBalanceAmount__c,
           java.lang.Double zuora__AppliedInvoiceAmount__c,
           java.lang.String zuora__AuthTransactionId__c,
           java.lang.String zuora__BankIdentificationNumber__c,
           java.lang.String zuora__BillingAccount__c,
           com.sforce.soap.enterprise.sobject.Zuora__CustomerAccount__c zuora__BillingAccount__r,
           java.util.Calendar zuora__CancelledOn__c,
           java.lang.String zuora__Comment__c,
           java.lang.String zuora__CreatedById__c,
           java.util.Calendar zuora__CreatedDate__c,
           java.lang.String zuora__EXT_ID__c,
           java.util.Calendar zuora__EffectiveDate__c,
           java.lang.String zuora__External_Id__c,
           java.lang.String zuora__GatewayOrderId__c,
           java.lang.String zuora__GatewayResponseCode__c,
           java.lang.String zuora__GatewayResponse__c,
           java.lang.String zuora__GatewayStatus__c,
           java.lang.String zuora__InvoiceNumber__c,
           java.lang.String zuora__Invoice__c,
           com.sforce.soap.enterprise.sobject.Zuora__ZInvoice__c zuora__Invoice__r,
           java.util.Calendar zuora__MarkedForSubmissionOn__c,
           com.sforce.soap.enterprise.QueryResult zuora__PaymentInvoices__r,
           java.lang.String zuora__PaymentMethod__c,
           java.lang.String zuora__PaymentNumber__c,
           java.lang.String zuora__ReferenceId__c,
           java.lang.Double zuora__RefundedAmount__c,
           com.sforce.soap.enterprise.QueryResult zuora__Refunds__r,
           java.lang.String zuora__SecondPaymentReferenceId__c,
           java.util.Calendar zuora__SettledOn__c,
           java.lang.String zuora__SoftDescriptorPhone__c,
           java.lang.String zuora__SoftDescriptor__c,
           java.lang.String zuora__Status__c,
           java.util.Calendar zuora__SubmittedOn__c,
           java.lang.String zuora__TransferedToAccounting__c,
           java.lang.String zuora__Type__c,
           java.lang.String zuora__UpdatedById__c,
           java.util.Calendar zuora__UpdatedDate__c) {
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
        this.zuora__Amount__c = zuora__Amount__c;
        this.zuora__AppliedCreditBalanceAmount__c = zuora__AppliedCreditBalanceAmount__c;
        this.zuora__AppliedInvoiceAmount__c = zuora__AppliedInvoiceAmount__c;
        this.zuora__AuthTransactionId__c = zuora__AuthTransactionId__c;
        this.zuora__BankIdentificationNumber__c = zuora__BankIdentificationNumber__c;
        this.zuora__BillingAccount__c = zuora__BillingAccount__c;
        this.zuora__BillingAccount__r = zuora__BillingAccount__r;
        this.zuora__CancelledOn__c = zuora__CancelledOn__c;
        this.zuora__Comment__c = zuora__Comment__c;
        this.zuora__CreatedById__c = zuora__CreatedById__c;
        this.zuora__CreatedDate__c = zuora__CreatedDate__c;
        this.zuora__EXT_ID__c = zuora__EXT_ID__c;
        this.zuora__EffectiveDate__c = zuora__EffectiveDate__c;
        this.zuora__External_Id__c = zuora__External_Id__c;
        this.zuora__GatewayOrderId__c = zuora__GatewayOrderId__c;
        this.zuora__GatewayResponseCode__c = zuora__GatewayResponseCode__c;
        this.zuora__GatewayResponse__c = zuora__GatewayResponse__c;
        this.zuora__GatewayStatus__c = zuora__GatewayStatus__c;
        this.zuora__InvoiceNumber__c = zuora__InvoiceNumber__c;
        this.zuora__Invoice__c = zuora__Invoice__c;
        this.zuora__Invoice__r = zuora__Invoice__r;
        this.zuora__MarkedForSubmissionOn__c = zuora__MarkedForSubmissionOn__c;
        this.zuora__PaymentInvoices__r = zuora__PaymentInvoices__r;
        this.zuora__PaymentMethod__c = zuora__PaymentMethod__c;
        this.zuora__PaymentNumber__c = zuora__PaymentNumber__c;
        this.zuora__ReferenceId__c = zuora__ReferenceId__c;
        this.zuora__RefundedAmount__c = zuora__RefundedAmount__c;
        this.zuora__Refunds__r = zuora__Refunds__r;
        this.zuora__SecondPaymentReferenceId__c = zuora__SecondPaymentReferenceId__c;
        this.zuora__SettledOn__c = zuora__SettledOn__c;
        this.zuora__SoftDescriptorPhone__c = zuora__SoftDescriptorPhone__c;
        this.zuora__SoftDescriptor__c = zuora__SoftDescriptor__c;
        this.zuora__Status__c = zuora__Status__c;
        this.zuora__SubmittedOn__c = zuora__SubmittedOn__c;
        this.zuora__TransferedToAccounting__c = zuora__TransferedToAccounting__c;
        this.zuora__Type__c = zuora__Type__c;
        this.zuora__UpdatedById__c = zuora__UpdatedById__c;
        this.zuora__UpdatedDate__c = zuora__UpdatedDate__c;
    }


    /**
     * Gets the activityHistories value for this Zuora__Payment__c.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this Zuora__Payment__c.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the attachedContentDocuments value for this Zuora__Payment__c.
     * 
     * @return attachedContentDocuments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachedContentDocuments() {
        return attachedContentDocuments;
    }


    /**
     * Sets the attachedContentDocuments value for this Zuora__Payment__c.
     * 
     * @param attachedContentDocuments
     */
    public void setAttachedContentDocuments(com.sforce.soap.enterprise.QueryResult attachedContentDocuments) {
        this.attachedContentDocuments = attachedContentDocuments;
    }


    /**
     * Gets the attachments value for this Zuora__Payment__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Zuora__Payment__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the combinedAttachments value for this Zuora__Payment__c.
     * 
     * @return combinedAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getCombinedAttachments() {
        return combinedAttachments;
    }


    /**
     * Sets the combinedAttachments value for this Zuora__Payment__c.
     * 
     * @param combinedAttachments
     */
    public void setCombinedAttachments(com.sforce.soap.enterprise.QueryResult combinedAttachments) {
        this.combinedAttachments = combinedAttachments;
    }


    /**
     * Gets the createdBy value for this Zuora__Payment__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Zuora__Payment__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Zuora__Payment__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Zuora__Payment__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Zuora__Payment__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Zuora__Payment__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the duplicateRecordItems value for this Zuora__Payment__c.
     * 
     * @return duplicateRecordItems
     */
    public com.sforce.soap.enterprise.QueryResult getDuplicateRecordItems() {
        return duplicateRecordItems;
    }


    /**
     * Sets the duplicateRecordItems value for this Zuora__Payment__c.
     * 
     * @param duplicateRecordItems
     */
    public void setDuplicateRecordItems(com.sforce.soap.enterprise.QueryResult duplicateRecordItems) {
        this.duplicateRecordItems = duplicateRecordItems;
    }


    /**
     * Gets the events value for this Zuora__Payment__c.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this Zuora__Payment__c.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Zuora__Payment__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Zuora__Payment__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the isDeleted value for this Zuora__Payment__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Zuora__Payment__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastActivityDate value for this Zuora__Payment__c.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this Zuora__Payment__c.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this Zuora__Payment__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Zuora__Payment__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Zuora__Payment__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Zuora__Payment__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Zuora__Payment__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Zuora__Payment__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lookedUpFromActivities value for this Zuora__Payment__c.
     * 
     * @return lookedUpFromActivities
     */
    public com.sforce.soap.enterprise.QueryResult getLookedUpFromActivities() {
        return lookedUpFromActivities;
    }


    /**
     * Sets the lookedUpFromActivities value for this Zuora__Payment__c.
     * 
     * @param lookedUpFromActivities
     */
    public void setLookedUpFromActivities(com.sforce.soap.enterprise.QueryResult lookedUpFromActivities) {
        this.lookedUpFromActivities = lookedUpFromActivities;
    }


    /**
     * Gets the name value for this Zuora__Payment__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Zuora__Payment__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Zuora__Payment__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Zuora__Payment__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Zuora__Payment__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Zuora__Payment__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the openActivities value for this Zuora__Payment__c.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this Zuora__Payment__c.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the processInstances value for this Zuora__Payment__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Zuora__Payment__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Zuora__Payment__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Zuora__Payment__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the recordAssociatedGroups value for this Zuora__Payment__c.
     * 
     * @return recordAssociatedGroups
     */
    public com.sforce.soap.enterprise.QueryResult getRecordAssociatedGroups() {
        return recordAssociatedGroups;
    }


    /**
     * Sets the recordAssociatedGroups value for this Zuora__Payment__c.
     * 
     * @param recordAssociatedGroups
     */
    public void setRecordAssociatedGroups(com.sforce.soap.enterprise.QueryResult recordAssociatedGroups) {
        this.recordAssociatedGroups = recordAssociatedGroups;
    }


    /**
     * Gets the systemModstamp value for this Zuora__Payment__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Zuora__Payment__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this Zuora__Payment__c.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this Zuora__Payment__c.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the topicAssignments value for this Zuora__Payment__c.
     * 
     * @return topicAssignments
     */
    public com.sforce.soap.enterprise.QueryResult getTopicAssignments() {
        return topicAssignments;
    }


    /**
     * Sets the topicAssignments value for this Zuora__Payment__c.
     * 
     * @param topicAssignments
     */
    public void setTopicAssignments(com.sforce.soap.enterprise.QueryResult topicAssignments) {
        this.topicAssignments = topicAssignments;
    }


    /**
     * Gets the userRecordAccess value for this Zuora__Payment__c.
     * 
     * @return userRecordAccess
     */
    public com.sforce.soap.enterprise.sobject.UserRecordAccess getUserRecordAccess() {
        return userRecordAccess;
    }


    /**
     * Sets the userRecordAccess value for this Zuora__Payment__c.
     * 
     * @param userRecordAccess
     */
    public void setUserRecordAccess(com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess) {
        this.userRecordAccess = userRecordAccess;
    }


    /**
     * Gets the zuora__Account__c value for this Zuora__Payment__c.
     * 
     * @return zuora__Account__c
     */
    public java.lang.String getZuora__Account__c() {
        return zuora__Account__c;
    }


    /**
     * Sets the zuora__Account__c value for this Zuora__Payment__c.
     * 
     * @param zuora__Account__c
     */
    public void setZuora__Account__c(java.lang.String zuora__Account__c) {
        this.zuora__Account__c = zuora__Account__c;
    }


    /**
     * Gets the zuora__Account__r value for this Zuora__Payment__c.
     * 
     * @return zuora__Account__r
     */
    public com.sforce.soap.enterprise.sobject.Account getZuora__Account__r() {
        return zuora__Account__r;
    }


    /**
     * Sets the zuora__Account__r value for this Zuora__Payment__c.
     * 
     * @param zuora__Account__r
     */
    public void setZuora__Account__r(com.sforce.soap.enterprise.sobject.Account zuora__Account__r) {
        this.zuora__Account__r = zuora__Account__r;
    }


    /**
     * Gets the zuora__AccountingCode__c value for this Zuora__Payment__c.
     * 
     * @return zuora__AccountingCode__c
     */
    public java.lang.String getZuora__AccountingCode__c() {
        return zuora__AccountingCode__c;
    }


    /**
     * Sets the zuora__AccountingCode__c value for this Zuora__Payment__c.
     * 
     * @param zuora__AccountingCode__c
     */
    public void setZuora__AccountingCode__c(java.lang.String zuora__AccountingCode__c) {
        this.zuora__AccountingCode__c = zuora__AccountingCode__c;
    }


    /**
     * Gets the zuora__Amount__c value for this Zuora__Payment__c.
     * 
     * @return zuora__Amount__c
     */
    public java.lang.Double getZuora__Amount__c() {
        return zuora__Amount__c;
    }


    /**
     * Sets the zuora__Amount__c value for this Zuora__Payment__c.
     * 
     * @param zuora__Amount__c
     */
    public void setZuora__Amount__c(java.lang.Double zuora__Amount__c) {
        this.zuora__Amount__c = zuora__Amount__c;
    }


    /**
     * Gets the zuora__AppliedCreditBalanceAmount__c value for this Zuora__Payment__c.
     * 
     * @return zuora__AppliedCreditBalanceAmount__c
     */
    public java.lang.Double getZuora__AppliedCreditBalanceAmount__c() {
        return zuora__AppliedCreditBalanceAmount__c;
    }


    /**
     * Sets the zuora__AppliedCreditBalanceAmount__c value for this Zuora__Payment__c.
     * 
     * @param zuora__AppliedCreditBalanceAmount__c
     */
    public void setZuora__AppliedCreditBalanceAmount__c(java.lang.Double zuora__AppliedCreditBalanceAmount__c) {
        this.zuora__AppliedCreditBalanceAmount__c = zuora__AppliedCreditBalanceAmount__c;
    }


    /**
     * Gets the zuora__AppliedInvoiceAmount__c value for this Zuora__Payment__c.
     * 
     * @return zuora__AppliedInvoiceAmount__c
     */
    public java.lang.Double getZuora__AppliedInvoiceAmount__c() {
        return zuora__AppliedInvoiceAmount__c;
    }


    /**
     * Sets the zuora__AppliedInvoiceAmount__c value for this Zuora__Payment__c.
     * 
     * @param zuora__AppliedInvoiceAmount__c
     */
    public void setZuora__AppliedInvoiceAmount__c(java.lang.Double zuora__AppliedInvoiceAmount__c) {
        this.zuora__AppliedInvoiceAmount__c = zuora__AppliedInvoiceAmount__c;
    }


    /**
     * Gets the zuora__AuthTransactionId__c value for this Zuora__Payment__c.
     * 
     * @return zuora__AuthTransactionId__c
     */
    public java.lang.String getZuora__AuthTransactionId__c() {
        return zuora__AuthTransactionId__c;
    }


    /**
     * Sets the zuora__AuthTransactionId__c value for this Zuora__Payment__c.
     * 
     * @param zuora__AuthTransactionId__c
     */
    public void setZuora__AuthTransactionId__c(java.lang.String zuora__AuthTransactionId__c) {
        this.zuora__AuthTransactionId__c = zuora__AuthTransactionId__c;
    }


    /**
     * Gets the zuora__BankIdentificationNumber__c value for this Zuora__Payment__c.
     * 
     * @return zuora__BankIdentificationNumber__c
     */
    public java.lang.String getZuora__BankIdentificationNumber__c() {
        return zuora__BankIdentificationNumber__c;
    }


    /**
     * Sets the zuora__BankIdentificationNumber__c value for this Zuora__Payment__c.
     * 
     * @param zuora__BankIdentificationNumber__c
     */
    public void setZuora__BankIdentificationNumber__c(java.lang.String zuora__BankIdentificationNumber__c) {
        this.zuora__BankIdentificationNumber__c = zuora__BankIdentificationNumber__c;
    }


    /**
     * Gets the zuora__BillingAccount__c value for this Zuora__Payment__c.
     * 
     * @return zuora__BillingAccount__c
     */
    public java.lang.String getZuora__BillingAccount__c() {
        return zuora__BillingAccount__c;
    }


    /**
     * Sets the zuora__BillingAccount__c value for this Zuora__Payment__c.
     * 
     * @param zuora__BillingAccount__c
     */
    public void setZuora__BillingAccount__c(java.lang.String zuora__BillingAccount__c) {
        this.zuora__BillingAccount__c = zuora__BillingAccount__c;
    }


    /**
     * Gets the zuora__BillingAccount__r value for this Zuora__Payment__c.
     * 
     * @return zuora__BillingAccount__r
     */
    public com.sforce.soap.enterprise.sobject.Zuora__CustomerAccount__c getZuora__BillingAccount__r() {
        return zuora__BillingAccount__r;
    }


    /**
     * Sets the zuora__BillingAccount__r value for this Zuora__Payment__c.
     * 
     * @param zuora__BillingAccount__r
     */
    public void setZuora__BillingAccount__r(com.sforce.soap.enterprise.sobject.Zuora__CustomerAccount__c zuora__BillingAccount__r) {
        this.zuora__BillingAccount__r = zuora__BillingAccount__r;
    }


    /**
     * Gets the zuora__CancelledOn__c value for this Zuora__Payment__c.
     * 
     * @return zuora__CancelledOn__c
     */
    public java.util.Calendar getZuora__CancelledOn__c() {
        return zuora__CancelledOn__c;
    }


    /**
     * Sets the zuora__CancelledOn__c value for this Zuora__Payment__c.
     * 
     * @param zuora__CancelledOn__c
     */
    public void setZuora__CancelledOn__c(java.util.Calendar zuora__CancelledOn__c) {
        this.zuora__CancelledOn__c = zuora__CancelledOn__c;
    }


    /**
     * Gets the zuora__Comment__c value for this Zuora__Payment__c.
     * 
     * @return zuora__Comment__c
     */
    public java.lang.String getZuora__Comment__c() {
        return zuora__Comment__c;
    }


    /**
     * Sets the zuora__Comment__c value for this Zuora__Payment__c.
     * 
     * @param zuora__Comment__c
     */
    public void setZuora__Comment__c(java.lang.String zuora__Comment__c) {
        this.zuora__Comment__c = zuora__Comment__c;
    }


    /**
     * Gets the zuora__CreatedById__c value for this Zuora__Payment__c.
     * 
     * @return zuora__CreatedById__c
     */
    public java.lang.String getZuora__CreatedById__c() {
        return zuora__CreatedById__c;
    }


    /**
     * Sets the zuora__CreatedById__c value for this Zuora__Payment__c.
     * 
     * @param zuora__CreatedById__c
     */
    public void setZuora__CreatedById__c(java.lang.String zuora__CreatedById__c) {
        this.zuora__CreatedById__c = zuora__CreatedById__c;
    }


    /**
     * Gets the zuora__CreatedDate__c value for this Zuora__Payment__c.
     * 
     * @return zuora__CreatedDate__c
     */
    public java.util.Calendar getZuora__CreatedDate__c() {
        return zuora__CreatedDate__c;
    }


    /**
     * Sets the zuora__CreatedDate__c value for this Zuora__Payment__c.
     * 
     * @param zuora__CreatedDate__c
     */
    public void setZuora__CreatedDate__c(java.util.Calendar zuora__CreatedDate__c) {
        this.zuora__CreatedDate__c = zuora__CreatedDate__c;
    }


    /**
     * Gets the zuora__EXT_ID__c value for this Zuora__Payment__c.
     * 
     * @return zuora__EXT_ID__c
     */
    public java.lang.String getZuora__EXT_ID__c() {
        return zuora__EXT_ID__c;
    }


    /**
     * Sets the zuora__EXT_ID__c value for this Zuora__Payment__c.
     * 
     * @param zuora__EXT_ID__c
     */
    public void setZuora__EXT_ID__c(java.lang.String zuora__EXT_ID__c) {
        this.zuora__EXT_ID__c = zuora__EXT_ID__c;
    }


    /**
     * Gets the zuora__EffectiveDate__c value for this Zuora__Payment__c.
     * 
     * @return zuora__EffectiveDate__c
     */
    public java.util.Calendar getZuora__EffectiveDate__c() {
        return zuora__EffectiveDate__c;
    }


    /**
     * Sets the zuora__EffectiveDate__c value for this Zuora__Payment__c.
     * 
     * @param zuora__EffectiveDate__c
     */
    public void setZuora__EffectiveDate__c(java.util.Calendar zuora__EffectiveDate__c) {
        this.zuora__EffectiveDate__c = zuora__EffectiveDate__c;
    }


    /**
     * Gets the zuora__External_Id__c value for this Zuora__Payment__c.
     * 
     * @return zuora__External_Id__c
     */
    public java.lang.String getZuora__External_Id__c() {
        return zuora__External_Id__c;
    }


    /**
     * Sets the zuora__External_Id__c value for this Zuora__Payment__c.
     * 
     * @param zuora__External_Id__c
     */
    public void setZuora__External_Id__c(java.lang.String zuora__External_Id__c) {
        this.zuora__External_Id__c = zuora__External_Id__c;
    }


    /**
     * Gets the zuora__GatewayOrderId__c value for this Zuora__Payment__c.
     * 
     * @return zuora__GatewayOrderId__c
     */
    public java.lang.String getZuora__GatewayOrderId__c() {
        return zuora__GatewayOrderId__c;
    }


    /**
     * Sets the zuora__GatewayOrderId__c value for this Zuora__Payment__c.
     * 
     * @param zuora__GatewayOrderId__c
     */
    public void setZuora__GatewayOrderId__c(java.lang.String zuora__GatewayOrderId__c) {
        this.zuora__GatewayOrderId__c = zuora__GatewayOrderId__c;
    }


    /**
     * Gets the zuora__GatewayResponseCode__c value for this Zuora__Payment__c.
     * 
     * @return zuora__GatewayResponseCode__c
     */
    public java.lang.String getZuora__GatewayResponseCode__c() {
        return zuora__GatewayResponseCode__c;
    }


    /**
     * Sets the zuora__GatewayResponseCode__c value for this Zuora__Payment__c.
     * 
     * @param zuora__GatewayResponseCode__c
     */
    public void setZuora__GatewayResponseCode__c(java.lang.String zuora__GatewayResponseCode__c) {
        this.zuora__GatewayResponseCode__c = zuora__GatewayResponseCode__c;
    }


    /**
     * Gets the zuora__GatewayResponse__c value for this Zuora__Payment__c.
     * 
     * @return zuora__GatewayResponse__c
     */
    public java.lang.String getZuora__GatewayResponse__c() {
        return zuora__GatewayResponse__c;
    }


    /**
     * Sets the zuora__GatewayResponse__c value for this Zuora__Payment__c.
     * 
     * @param zuora__GatewayResponse__c
     */
    public void setZuora__GatewayResponse__c(java.lang.String zuora__GatewayResponse__c) {
        this.zuora__GatewayResponse__c = zuora__GatewayResponse__c;
    }


    /**
     * Gets the zuora__GatewayStatus__c value for this Zuora__Payment__c.
     * 
     * @return zuora__GatewayStatus__c
     */
    public java.lang.String getZuora__GatewayStatus__c() {
        return zuora__GatewayStatus__c;
    }


    /**
     * Sets the zuora__GatewayStatus__c value for this Zuora__Payment__c.
     * 
     * @param zuora__GatewayStatus__c
     */
    public void setZuora__GatewayStatus__c(java.lang.String zuora__GatewayStatus__c) {
        this.zuora__GatewayStatus__c = zuora__GatewayStatus__c;
    }


    /**
     * Gets the zuora__InvoiceNumber__c value for this Zuora__Payment__c.
     * 
     * @return zuora__InvoiceNumber__c
     */
    public java.lang.String getZuora__InvoiceNumber__c() {
        return zuora__InvoiceNumber__c;
    }


    /**
     * Sets the zuora__InvoiceNumber__c value for this Zuora__Payment__c.
     * 
     * @param zuora__InvoiceNumber__c
     */
    public void setZuora__InvoiceNumber__c(java.lang.String zuora__InvoiceNumber__c) {
        this.zuora__InvoiceNumber__c = zuora__InvoiceNumber__c;
    }


    /**
     * Gets the zuora__Invoice__c value for this Zuora__Payment__c.
     * 
     * @return zuora__Invoice__c
     */
    public java.lang.String getZuora__Invoice__c() {
        return zuora__Invoice__c;
    }


    /**
     * Sets the zuora__Invoice__c value for this Zuora__Payment__c.
     * 
     * @param zuora__Invoice__c
     */
    public void setZuora__Invoice__c(java.lang.String zuora__Invoice__c) {
        this.zuora__Invoice__c = zuora__Invoice__c;
    }


    /**
     * Gets the zuora__Invoice__r value for this Zuora__Payment__c.
     * 
     * @return zuora__Invoice__r
     */
    public com.sforce.soap.enterprise.sobject.Zuora__ZInvoice__c getZuora__Invoice__r() {
        return zuora__Invoice__r;
    }


    /**
     * Sets the zuora__Invoice__r value for this Zuora__Payment__c.
     * 
     * @param zuora__Invoice__r
     */
    public void setZuora__Invoice__r(com.sforce.soap.enterprise.sobject.Zuora__ZInvoice__c zuora__Invoice__r) {
        this.zuora__Invoice__r = zuora__Invoice__r;
    }


    /**
     * Gets the zuora__MarkedForSubmissionOn__c value for this Zuora__Payment__c.
     * 
     * @return zuora__MarkedForSubmissionOn__c
     */
    public java.util.Calendar getZuora__MarkedForSubmissionOn__c() {
        return zuora__MarkedForSubmissionOn__c;
    }


    /**
     * Sets the zuora__MarkedForSubmissionOn__c value for this Zuora__Payment__c.
     * 
     * @param zuora__MarkedForSubmissionOn__c
     */
    public void setZuora__MarkedForSubmissionOn__c(java.util.Calendar zuora__MarkedForSubmissionOn__c) {
        this.zuora__MarkedForSubmissionOn__c = zuora__MarkedForSubmissionOn__c;
    }


    /**
     * Gets the zuora__PaymentInvoices__r value for this Zuora__Payment__c.
     * 
     * @return zuora__PaymentInvoices__r
     */
    public com.sforce.soap.enterprise.QueryResult getZuora__PaymentInvoices__r() {
        return zuora__PaymentInvoices__r;
    }


    /**
     * Sets the zuora__PaymentInvoices__r value for this Zuora__Payment__c.
     * 
     * @param zuora__PaymentInvoices__r
     */
    public void setZuora__PaymentInvoices__r(com.sforce.soap.enterprise.QueryResult zuora__PaymentInvoices__r) {
        this.zuora__PaymentInvoices__r = zuora__PaymentInvoices__r;
    }


    /**
     * Gets the zuora__PaymentMethod__c value for this Zuora__Payment__c.
     * 
     * @return zuora__PaymentMethod__c
     */
    public java.lang.String getZuora__PaymentMethod__c() {
        return zuora__PaymentMethod__c;
    }


    /**
     * Sets the zuora__PaymentMethod__c value for this Zuora__Payment__c.
     * 
     * @param zuora__PaymentMethod__c
     */
    public void setZuora__PaymentMethod__c(java.lang.String zuora__PaymentMethod__c) {
        this.zuora__PaymentMethod__c = zuora__PaymentMethod__c;
    }


    /**
     * Gets the zuora__PaymentNumber__c value for this Zuora__Payment__c.
     * 
     * @return zuora__PaymentNumber__c
     */
    public java.lang.String getZuora__PaymentNumber__c() {
        return zuora__PaymentNumber__c;
    }


    /**
     * Sets the zuora__PaymentNumber__c value for this Zuora__Payment__c.
     * 
     * @param zuora__PaymentNumber__c
     */
    public void setZuora__PaymentNumber__c(java.lang.String zuora__PaymentNumber__c) {
        this.zuora__PaymentNumber__c = zuora__PaymentNumber__c;
    }


    /**
     * Gets the zuora__ReferenceId__c value for this Zuora__Payment__c.
     * 
     * @return zuora__ReferenceId__c
     */
    public java.lang.String getZuora__ReferenceId__c() {
        return zuora__ReferenceId__c;
    }


    /**
     * Sets the zuora__ReferenceId__c value for this Zuora__Payment__c.
     * 
     * @param zuora__ReferenceId__c
     */
    public void setZuora__ReferenceId__c(java.lang.String zuora__ReferenceId__c) {
        this.zuora__ReferenceId__c = zuora__ReferenceId__c;
    }


    /**
     * Gets the zuora__RefundedAmount__c value for this Zuora__Payment__c.
     * 
     * @return zuora__RefundedAmount__c
     */
    public java.lang.Double getZuora__RefundedAmount__c() {
        return zuora__RefundedAmount__c;
    }


    /**
     * Sets the zuora__RefundedAmount__c value for this Zuora__Payment__c.
     * 
     * @param zuora__RefundedAmount__c
     */
    public void setZuora__RefundedAmount__c(java.lang.Double zuora__RefundedAmount__c) {
        this.zuora__RefundedAmount__c = zuora__RefundedAmount__c;
    }


    /**
     * Gets the zuora__Refunds__r value for this Zuora__Payment__c.
     * 
     * @return zuora__Refunds__r
     */
    public com.sforce.soap.enterprise.QueryResult getZuora__Refunds__r() {
        return zuora__Refunds__r;
    }


    /**
     * Sets the zuora__Refunds__r value for this Zuora__Payment__c.
     * 
     * @param zuora__Refunds__r
     */
    public void setZuora__Refunds__r(com.sforce.soap.enterprise.QueryResult zuora__Refunds__r) {
        this.zuora__Refunds__r = zuora__Refunds__r;
    }


    /**
     * Gets the zuora__SecondPaymentReferenceId__c value for this Zuora__Payment__c.
     * 
     * @return zuora__SecondPaymentReferenceId__c
     */
    public java.lang.String getZuora__SecondPaymentReferenceId__c() {
        return zuora__SecondPaymentReferenceId__c;
    }


    /**
     * Sets the zuora__SecondPaymentReferenceId__c value for this Zuora__Payment__c.
     * 
     * @param zuora__SecondPaymentReferenceId__c
     */
    public void setZuora__SecondPaymentReferenceId__c(java.lang.String zuora__SecondPaymentReferenceId__c) {
        this.zuora__SecondPaymentReferenceId__c = zuora__SecondPaymentReferenceId__c;
    }


    /**
     * Gets the zuora__SettledOn__c value for this Zuora__Payment__c.
     * 
     * @return zuora__SettledOn__c
     */
    public java.util.Calendar getZuora__SettledOn__c() {
        return zuora__SettledOn__c;
    }


    /**
     * Sets the zuora__SettledOn__c value for this Zuora__Payment__c.
     * 
     * @param zuora__SettledOn__c
     */
    public void setZuora__SettledOn__c(java.util.Calendar zuora__SettledOn__c) {
        this.zuora__SettledOn__c = zuora__SettledOn__c;
    }


    /**
     * Gets the zuora__SoftDescriptorPhone__c value for this Zuora__Payment__c.
     * 
     * @return zuora__SoftDescriptorPhone__c
     */
    public java.lang.String getZuora__SoftDescriptorPhone__c() {
        return zuora__SoftDescriptorPhone__c;
    }


    /**
     * Sets the zuora__SoftDescriptorPhone__c value for this Zuora__Payment__c.
     * 
     * @param zuora__SoftDescriptorPhone__c
     */
    public void setZuora__SoftDescriptorPhone__c(java.lang.String zuora__SoftDescriptorPhone__c) {
        this.zuora__SoftDescriptorPhone__c = zuora__SoftDescriptorPhone__c;
    }


    /**
     * Gets the zuora__SoftDescriptor__c value for this Zuora__Payment__c.
     * 
     * @return zuora__SoftDescriptor__c
     */
    public java.lang.String getZuora__SoftDescriptor__c() {
        return zuora__SoftDescriptor__c;
    }


    /**
     * Sets the zuora__SoftDescriptor__c value for this Zuora__Payment__c.
     * 
     * @param zuora__SoftDescriptor__c
     */
    public void setZuora__SoftDescriptor__c(java.lang.String zuora__SoftDescriptor__c) {
        this.zuora__SoftDescriptor__c = zuora__SoftDescriptor__c;
    }


    /**
     * Gets the zuora__Status__c value for this Zuora__Payment__c.
     * 
     * @return zuora__Status__c
     */
    public java.lang.String getZuora__Status__c() {
        return zuora__Status__c;
    }


    /**
     * Sets the zuora__Status__c value for this Zuora__Payment__c.
     * 
     * @param zuora__Status__c
     */
    public void setZuora__Status__c(java.lang.String zuora__Status__c) {
        this.zuora__Status__c = zuora__Status__c;
    }


    /**
     * Gets the zuora__SubmittedOn__c value for this Zuora__Payment__c.
     * 
     * @return zuora__SubmittedOn__c
     */
    public java.util.Calendar getZuora__SubmittedOn__c() {
        return zuora__SubmittedOn__c;
    }


    /**
     * Sets the zuora__SubmittedOn__c value for this Zuora__Payment__c.
     * 
     * @param zuora__SubmittedOn__c
     */
    public void setZuora__SubmittedOn__c(java.util.Calendar zuora__SubmittedOn__c) {
        this.zuora__SubmittedOn__c = zuora__SubmittedOn__c;
    }


    /**
     * Gets the zuora__TransferedToAccounting__c value for this Zuora__Payment__c.
     * 
     * @return zuora__TransferedToAccounting__c
     */
    public java.lang.String getZuora__TransferedToAccounting__c() {
        return zuora__TransferedToAccounting__c;
    }


    /**
     * Sets the zuora__TransferedToAccounting__c value for this Zuora__Payment__c.
     * 
     * @param zuora__TransferedToAccounting__c
     */
    public void setZuora__TransferedToAccounting__c(java.lang.String zuora__TransferedToAccounting__c) {
        this.zuora__TransferedToAccounting__c = zuora__TransferedToAccounting__c;
    }


    /**
     * Gets the zuora__Type__c value for this Zuora__Payment__c.
     * 
     * @return zuora__Type__c
     */
    public java.lang.String getZuora__Type__c() {
        return zuora__Type__c;
    }


    /**
     * Sets the zuora__Type__c value for this Zuora__Payment__c.
     * 
     * @param zuora__Type__c
     */
    public void setZuora__Type__c(java.lang.String zuora__Type__c) {
        this.zuora__Type__c = zuora__Type__c;
    }


    /**
     * Gets the zuora__UpdatedById__c value for this Zuora__Payment__c.
     * 
     * @return zuora__UpdatedById__c
     */
    public java.lang.String getZuora__UpdatedById__c() {
        return zuora__UpdatedById__c;
    }


    /**
     * Sets the zuora__UpdatedById__c value for this Zuora__Payment__c.
     * 
     * @param zuora__UpdatedById__c
     */
    public void setZuora__UpdatedById__c(java.lang.String zuora__UpdatedById__c) {
        this.zuora__UpdatedById__c = zuora__UpdatedById__c;
    }


    /**
     * Gets the zuora__UpdatedDate__c value for this Zuora__Payment__c.
     * 
     * @return zuora__UpdatedDate__c
     */
    public java.util.Calendar getZuora__UpdatedDate__c() {
        return zuora__UpdatedDate__c;
    }


    /**
     * Sets the zuora__UpdatedDate__c value for this Zuora__Payment__c.
     * 
     * @param zuora__UpdatedDate__c
     */
    public void setZuora__UpdatedDate__c(java.util.Calendar zuora__UpdatedDate__c) {
        this.zuora__UpdatedDate__c = zuora__UpdatedDate__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Zuora__Payment__c)) return false;
        Zuora__Payment__c other = (Zuora__Payment__c) obj;
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
            ((this.zuora__Amount__c==null && other.getZuora__Amount__c()==null) || 
             (this.zuora__Amount__c!=null &&
              this.zuora__Amount__c.equals(other.getZuora__Amount__c()))) &&
            ((this.zuora__AppliedCreditBalanceAmount__c==null && other.getZuora__AppliedCreditBalanceAmount__c()==null) || 
             (this.zuora__AppliedCreditBalanceAmount__c!=null &&
              this.zuora__AppliedCreditBalanceAmount__c.equals(other.getZuora__AppliedCreditBalanceAmount__c()))) &&
            ((this.zuora__AppliedInvoiceAmount__c==null && other.getZuora__AppliedInvoiceAmount__c()==null) || 
             (this.zuora__AppliedInvoiceAmount__c!=null &&
              this.zuora__AppliedInvoiceAmount__c.equals(other.getZuora__AppliedInvoiceAmount__c()))) &&
            ((this.zuora__AuthTransactionId__c==null && other.getZuora__AuthTransactionId__c()==null) || 
             (this.zuora__AuthTransactionId__c!=null &&
              this.zuora__AuthTransactionId__c.equals(other.getZuora__AuthTransactionId__c()))) &&
            ((this.zuora__BankIdentificationNumber__c==null && other.getZuora__BankIdentificationNumber__c()==null) || 
             (this.zuora__BankIdentificationNumber__c!=null &&
              this.zuora__BankIdentificationNumber__c.equals(other.getZuora__BankIdentificationNumber__c()))) &&
            ((this.zuora__BillingAccount__c==null && other.getZuora__BillingAccount__c()==null) || 
             (this.zuora__BillingAccount__c!=null &&
              this.zuora__BillingAccount__c.equals(other.getZuora__BillingAccount__c()))) &&
            ((this.zuora__BillingAccount__r==null && other.getZuora__BillingAccount__r()==null) || 
             (this.zuora__BillingAccount__r!=null &&
              this.zuora__BillingAccount__r.equals(other.getZuora__BillingAccount__r()))) &&
            ((this.zuora__CancelledOn__c==null && other.getZuora__CancelledOn__c()==null) || 
             (this.zuora__CancelledOn__c!=null &&
              this.zuora__CancelledOn__c.equals(other.getZuora__CancelledOn__c()))) &&
            ((this.zuora__Comment__c==null && other.getZuora__Comment__c()==null) || 
             (this.zuora__Comment__c!=null &&
              this.zuora__Comment__c.equals(other.getZuora__Comment__c()))) &&
            ((this.zuora__CreatedById__c==null && other.getZuora__CreatedById__c()==null) || 
             (this.zuora__CreatedById__c!=null &&
              this.zuora__CreatedById__c.equals(other.getZuora__CreatedById__c()))) &&
            ((this.zuora__CreatedDate__c==null && other.getZuora__CreatedDate__c()==null) || 
             (this.zuora__CreatedDate__c!=null &&
              this.zuora__CreatedDate__c.equals(other.getZuora__CreatedDate__c()))) &&
            ((this.zuora__EXT_ID__c==null && other.getZuora__EXT_ID__c()==null) || 
             (this.zuora__EXT_ID__c!=null &&
              this.zuora__EXT_ID__c.equals(other.getZuora__EXT_ID__c()))) &&
            ((this.zuora__EffectiveDate__c==null && other.getZuora__EffectiveDate__c()==null) || 
             (this.zuora__EffectiveDate__c!=null &&
              this.zuora__EffectiveDate__c.equals(other.getZuora__EffectiveDate__c()))) &&
            ((this.zuora__External_Id__c==null && other.getZuora__External_Id__c()==null) || 
             (this.zuora__External_Id__c!=null &&
              this.zuora__External_Id__c.equals(other.getZuora__External_Id__c()))) &&
            ((this.zuora__GatewayOrderId__c==null && other.getZuora__GatewayOrderId__c()==null) || 
             (this.zuora__GatewayOrderId__c!=null &&
              this.zuora__GatewayOrderId__c.equals(other.getZuora__GatewayOrderId__c()))) &&
            ((this.zuora__GatewayResponseCode__c==null && other.getZuora__GatewayResponseCode__c()==null) || 
             (this.zuora__GatewayResponseCode__c!=null &&
              this.zuora__GatewayResponseCode__c.equals(other.getZuora__GatewayResponseCode__c()))) &&
            ((this.zuora__GatewayResponse__c==null && other.getZuora__GatewayResponse__c()==null) || 
             (this.zuora__GatewayResponse__c!=null &&
              this.zuora__GatewayResponse__c.equals(other.getZuora__GatewayResponse__c()))) &&
            ((this.zuora__GatewayStatus__c==null && other.getZuora__GatewayStatus__c()==null) || 
             (this.zuora__GatewayStatus__c!=null &&
              this.zuora__GatewayStatus__c.equals(other.getZuora__GatewayStatus__c()))) &&
            ((this.zuora__InvoiceNumber__c==null && other.getZuora__InvoiceNumber__c()==null) || 
             (this.zuora__InvoiceNumber__c!=null &&
              this.zuora__InvoiceNumber__c.equals(other.getZuora__InvoiceNumber__c()))) &&
            ((this.zuora__Invoice__c==null && other.getZuora__Invoice__c()==null) || 
             (this.zuora__Invoice__c!=null &&
              this.zuora__Invoice__c.equals(other.getZuora__Invoice__c()))) &&
            ((this.zuora__Invoice__r==null && other.getZuora__Invoice__r()==null) || 
             (this.zuora__Invoice__r!=null &&
              this.zuora__Invoice__r.equals(other.getZuora__Invoice__r()))) &&
            ((this.zuora__MarkedForSubmissionOn__c==null && other.getZuora__MarkedForSubmissionOn__c()==null) || 
             (this.zuora__MarkedForSubmissionOn__c!=null &&
              this.zuora__MarkedForSubmissionOn__c.equals(other.getZuora__MarkedForSubmissionOn__c()))) &&
            ((this.zuora__PaymentInvoices__r==null && other.getZuora__PaymentInvoices__r()==null) || 
             (this.zuora__PaymentInvoices__r!=null &&
              this.zuora__PaymentInvoices__r.equals(other.getZuora__PaymentInvoices__r()))) &&
            ((this.zuora__PaymentMethod__c==null && other.getZuora__PaymentMethod__c()==null) || 
             (this.zuora__PaymentMethod__c!=null &&
              this.zuora__PaymentMethod__c.equals(other.getZuora__PaymentMethod__c()))) &&
            ((this.zuora__PaymentNumber__c==null && other.getZuora__PaymentNumber__c()==null) || 
             (this.zuora__PaymentNumber__c!=null &&
              this.zuora__PaymentNumber__c.equals(other.getZuora__PaymentNumber__c()))) &&
            ((this.zuora__ReferenceId__c==null && other.getZuora__ReferenceId__c()==null) || 
             (this.zuora__ReferenceId__c!=null &&
              this.zuora__ReferenceId__c.equals(other.getZuora__ReferenceId__c()))) &&
            ((this.zuora__RefundedAmount__c==null && other.getZuora__RefundedAmount__c()==null) || 
             (this.zuora__RefundedAmount__c!=null &&
              this.zuora__RefundedAmount__c.equals(other.getZuora__RefundedAmount__c()))) &&
            ((this.zuora__Refunds__r==null && other.getZuora__Refunds__r()==null) || 
             (this.zuora__Refunds__r!=null &&
              this.zuora__Refunds__r.equals(other.getZuora__Refunds__r()))) &&
            ((this.zuora__SecondPaymentReferenceId__c==null && other.getZuora__SecondPaymentReferenceId__c()==null) || 
             (this.zuora__SecondPaymentReferenceId__c!=null &&
              this.zuora__SecondPaymentReferenceId__c.equals(other.getZuora__SecondPaymentReferenceId__c()))) &&
            ((this.zuora__SettledOn__c==null && other.getZuora__SettledOn__c()==null) || 
             (this.zuora__SettledOn__c!=null &&
              this.zuora__SettledOn__c.equals(other.getZuora__SettledOn__c()))) &&
            ((this.zuora__SoftDescriptorPhone__c==null && other.getZuora__SoftDescriptorPhone__c()==null) || 
             (this.zuora__SoftDescriptorPhone__c!=null &&
              this.zuora__SoftDescriptorPhone__c.equals(other.getZuora__SoftDescriptorPhone__c()))) &&
            ((this.zuora__SoftDescriptor__c==null && other.getZuora__SoftDescriptor__c()==null) || 
             (this.zuora__SoftDescriptor__c!=null &&
              this.zuora__SoftDescriptor__c.equals(other.getZuora__SoftDescriptor__c()))) &&
            ((this.zuora__Status__c==null && other.getZuora__Status__c()==null) || 
             (this.zuora__Status__c!=null &&
              this.zuora__Status__c.equals(other.getZuora__Status__c()))) &&
            ((this.zuora__SubmittedOn__c==null && other.getZuora__SubmittedOn__c()==null) || 
             (this.zuora__SubmittedOn__c!=null &&
              this.zuora__SubmittedOn__c.equals(other.getZuora__SubmittedOn__c()))) &&
            ((this.zuora__TransferedToAccounting__c==null && other.getZuora__TransferedToAccounting__c()==null) || 
             (this.zuora__TransferedToAccounting__c!=null &&
              this.zuora__TransferedToAccounting__c.equals(other.getZuora__TransferedToAccounting__c()))) &&
            ((this.zuora__Type__c==null && other.getZuora__Type__c()==null) || 
             (this.zuora__Type__c!=null &&
              this.zuora__Type__c.equals(other.getZuora__Type__c()))) &&
            ((this.zuora__UpdatedById__c==null && other.getZuora__UpdatedById__c()==null) || 
             (this.zuora__UpdatedById__c!=null &&
              this.zuora__UpdatedById__c.equals(other.getZuora__UpdatedById__c()))) &&
            ((this.zuora__UpdatedDate__c==null && other.getZuora__UpdatedDate__c()==null) || 
             (this.zuora__UpdatedDate__c!=null &&
              this.zuora__UpdatedDate__c.equals(other.getZuora__UpdatedDate__c())));
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
        if (getZuora__Amount__c() != null) {
            _hashCode += getZuora__Amount__c().hashCode();
        }
        if (getZuora__AppliedCreditBalanceAmount__c() != null) {
            _hashCode += getZuora__AppliedCreditBalanceAmount__c().hashCode();
        }
        if (getZuora__AppliedInvoiceAmount__c() != null) {
            _hashCode += getZuora__AppliedInvoiceAmount__c().hashCode();
        }
        if (getZuora__AuthTransactionId__c() != null) {
            _hashCode += getZuora__AuthTransactionId__c().hashCode();
        }
        if (getZuora__BankIdentificationNumber__c() != null) {
            _hashCode += getZuora__BankIdentificationNumber__c().hashCode();
        }
        if (getZuora__BillingAccount__c() != null) {
            _hashCode += getZuora__BillingAccount__c().hashCode();
        }
        if (getZuora__BillingAccount__r() != null) {
            _hashCode += getZuora__BillingAccount__r().hashCode();
        }
        if (getZuora__CancelledOn__c() != null) {
            _hashCode += getZuora__CancelledOn__c().hashCode();
        }
        if (getZuora__Comment__c() != null) {
            _hashCode += getZuora__Comment__c().hashCode();
        }
        if (getZuora__CreatedById__c() != null) {
            _hashCode += getZuora__CreatedById__c().hashCode();
        }
        if (getZuora__CreatedDate__c() != null) {
            _hashCode += getZuora__CreatedDate__c().hashCode();
        }
        if (getZuora__EXT_ID__c() != null) {
            _hashCode += getZuora__EXT_ID__c().hashCode();
        }
        if (getZuora__EffectiveDate__c() != null) {
            _hashCode += getZuora__EffectiveDate__c().hashCode();
        }
        if (getZuora__External_Id__c() != null) {
            _hashCode += getZuora__External_Id__c().hashCode();
        }
        if (getZuora__GatewayOrderId__c() != null) {
            _hashCode += getZuora__GatewayOrderId__c().hashCode();
        }
        if (getZuora__GatewayResponseCode__c() != null) {
            _hashCode += getZuora__GatewayResponseCode__c().hashCode();
        }
        if (getZuora__GatewayResponse__c() != null) {
            _hashCode += getZuora__GatewayResponse__c().hashCode();
        }
        if (getZuora__GatewayStatus__c() != null) {
            _hashCode += getZuora__GatewayStatus__c().hashCode();
        }
        if (getZuora__InvoiceNumber__c() != null) {
            _hashCode += getZuora__InvoiceNumber__c().hashCode();
        }
        if (getZuora__Invoice__c() != null) {
            _hashCode += getZuora__Invoice__c().hashCode();
        }
        if (getZuora__Invoice__r() != null) {
            _hashCode += getZuora__Invoice__r().hashCode();
        }
        if (getZuora__MarkedForSubmissionOn__c() != null) {
            _hashCode += getZuora__MarkedForSubmissionOn__c().hashCode();
        }
        if (getZuora__PaymentInvoices__r() != null) {
            _hashCode += getZuora__PaymentInvoices__r().hashCode();
        }
        if (getZuora__PaymentMethod__c() != null) {
            _hashCode += getZuora__PaymentMethod__c().hashCode();
        }
        if (getZuora__PaymentNumber__c() != null) {
            _hashCode += getZuora__PaymentNumber__c().hashCode();
        }
        if (getZuora__ReferenceId__c() != null) {
            _hashCode += getZuora__ReferenceId__c().hashCode();
        }
        if (getZuora__RefundedAmount__c() != null) {
            _hashCode += getZuora__RefundedAmount__c().hashCode();
        }
        if (getZuora__Refunds__r() != null) {
            _hashCode += getZuora__Refunds__r().hashCode();
        }
        if (getZuora__SecondPaymentReferenceId__c() != null) {
            _hashCode += getZuora__SecondPaymentReferenceId__c().hashCode();
        }
        if (getZuora__SettledOn__c() != null) {
            _hashCode += getZuora__SettledOn__c().hashCode();
        }
        if (getZuora__SoftDescriptorPhone__c() != null) {
            _hashCode += getZuora__SoftDescriptorPhone__c().hashCode();
        }
        if (getZuora__SoftDescriptor__c() != null) {
            _hashCode += getZuora__SoftDescriptor__c().hashCode();
        }
        if (getZuora__Status__c() != null) {
            _hashCode += getZuora__Status__c().hashCode();
        }
        if (getZuora__SubmittedOn__c() != null) {
            _hashCode += getZuora__SubmittedOn__c().hashCode();
        }
        if (getZuora__TransferedToAccounting__c() != null) {
            _hashCode += getZuora__TransferedToAccounting__c().hashCode();
        }
        if (getZuora__Type__c() != null) {
            _hashCode += getZuora__Type__c().hashCode();
        }
        if (getZuora__UpdatedById__c() != null) {
            _hashCode += getZuora__UpdatedById__c().hashCode();
        }
        if (getZuora__UpdatedDate__c() != null) {
            _hashCode += getZuora__UpdatedDate__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Zuora__Payment__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Payment__c"));
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
        elemField.setFieldName("zuora__Amount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Amount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__AppliedCreditBalanceAmount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__AppliedCreditBalanceAmount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__AppliedInvoiceAmount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__AppliedInvoiceAmount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__AuthTransactionId__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__AuthTransactionId__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__BankIdentificationNumber__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__BankIdentificationNumber__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__BillingAccount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__BillingAccount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__BillingAccount__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__BillingAccount__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__CustomerAccount__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__CancelledOn__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__CancelledOn__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__Comment__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Comment__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__CreatedById__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__CreatedById__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__CreatedDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__CreatedDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__EXT_ID__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__EXT_ID__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__EffectiveDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__EffectiveDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("zuora__GatewayOrderId__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__GatewayOrderId__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__GatewayResponseCode__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__GatewayResponseCode__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__GatewayResponse__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__GatewayResponse__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__GatewayStatus__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__GatewayStatus__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__InvoiceNumber__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__InvoiceNumber__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__Invoice__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Invoice__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__Invoice__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Invoice__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__ZInvoice__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__MarkedForSubmissionOn__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__MarkedForSubmissionOn__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__PaymentInvoices__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__PaymentInvoices__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__PaymentMethod__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__PaymentMethod__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__PaymentNumber__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__PaymentNumber__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__ReferenceId__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__ReferenceId__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__RefundedAmount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__RefundedAmount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__Refunds__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Refunds__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__SecondPaymentReferenceId__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__SecondPaymentReferenceId__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__SettledOn__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__SettledOn__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__SoftDescriptorPhone__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__SoftDescriptorPhone__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__SoftDescriptor__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__SoftDescriptor__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("zuora__SubmittedOn__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__SubmittedOn__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__TransferedToAccounting__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__TransferedToAccounting__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("zuora__UpdatedById__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__UpdatedById__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__UpdatedDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__UpdatedDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
