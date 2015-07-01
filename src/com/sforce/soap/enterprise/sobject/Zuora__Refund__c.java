/**
 * Zuora__Refund__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Zuora__Refund__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
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

    private java.lang.String zuora__Account__c;

    private com.sforce.soap.enterprise.sobject.Account zuora__Account__r;

    private java.lang.String zuora__AccountingCode__c;

    private java.lang.Double zuora__Amount__c;

    private java.lang.String zuora__BillingAccount__c;

    private com.sforce.soap.enterprise.sobject.Zuora__CustomerAccount__c zuora__BillingAccount__r;

    private java.lang.String zuora__Comment__c;

    private java.lang.String zuora__CreatedById__c;

    private java.util.Calendar zuora__CreatedDate__c;

    private java.lang.String zuora__External_Id__c;

    private java.lang.String zuora__GatewayResponseCode__c;

    private java.lang.String zuora__GatewayResponse__c;

    private java.lang.String zuora__PaymentMethod__c;

    private java.lang.String zuora__Payment__c;

    private com.sforce.soap.enterprise.sobject.Zuora__Payment__c zuora__Payment__r;

    private java.lang.String zuora__ReasonCodeName__c;

    private java.lang.String zuora__ReferenceId__c;

    private java.util.Calendar zuora__RefundDate__c;

    private com.sforce.soap.enterprise.QueryResult zuora__RefundInvoicePayments__r;

    private java.lang.String zuora__RefundMethodType__c;

    private java.util.Calendar zuora__RefundTransactionTime__c;

    private java.lang.String zuora__SoftDescriptorPhone__c;

    private java.lang.String zuora__SoftDescriptor__c;

    private java.lang.String zuora__SourceType__c;

    private java.lang.String zuora__Status__c;

    private java.lang.String zuora__TransferredToAccounting__c;

    private java.lang.String zuora__Type__c;

    private java.lang.String zuora__UpdatedById__c;

    private java.util.Calendar zuora__UpdatedDate__c;

    public Zuora__Refund__c() {
    }

    public Zuora__Refund__c(
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
           java.lang.String zuora__Account__c,
           com.sforce.soap.enterprise.sobject.Account zuora__Account__r,
           java.lang.String zuora__AccountingCode__c,
           java.lang.Double zuora__Amount__c,
           java.lang.String zuora__BillingAccount__c,
           com.sforce.soap.enterprise.sobject.Zuora__CustomerAccount__c zuora__BillingAccount__r,
           java.lang.String zuora__Comment__c,
           java.lang.String zuora__CreatedById__c,
           java.util.Calendar zuora__CreatedDate__c,
           java.lang.String zuora__External_Id__c,
           java.lang.String zuora__GatewayResponseCode__c,
           java.lang.String zuora__GatewayResponse__c,
           java.lang.String zuora__PaymentMethod__c,
           java.lang.String zuora__Payment__c,
           com.sforce.soap.enterprise.sobject.Zuora__Payment__c zuora__Payment__r,
           java.lang.String zuora__ReasonCodeName__c,
           java.lang.String zuora__ReferenceId__c,
           java.util.Calendar zuora__RefundDate__c,
           com.sforce.soap.enterprise.QueryResult zuora__RefundInvoicePayments__r,
           java.lang.String zuora__RefundMethodType__c,
           java.util.Calendar zuora__RefundTransactionTime__c,
           java.lang.String zuora__SoftDescriptorPhone__c,
           java.lang.String zuora__SoftDescriptor__c,
           java.lang.String zuora__SourceType__c,
           java.lang.String zuora__Status__c,
           java.lang.String zuora__TransferredToAccounting__c,
           java.lang.String zuora__Type__c,
           java.lang.String zuora__UpdatedById__c,
           java.util.Calendar zuora__UpdatedDate__c) {
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
        this.zuora__Account__c = zuora__Account__c;
        this.zuora__Account__r = zuora__Account__r;
        this.zuora__AccountingCode__c = zuora__AccountingCode__c;
        this.zuora__Amount__c = zuora__Amount__c;
        this.zuora__BillingAccount__c = zuora__BillingAccount__c;
        this.zuora__BillingAccount__r = zuora__BillingAccount__r;
        this.zuora__Comment__c = zuora__Comment__c;
        this.zuora__CreatedById__c = zuora__CreatedById__c;
        this.zuora__CreatedDate__c = zuora__CreatedDate__c;
        this.zuora__External_Id__c = zuora__External_Id__c;
        this.zuora__GatewayResponseCode__c = zuora__GatewayResponseCode__c;
        this.zuora__GatewayResponse__c = zuora__GatewayResponse__c;
        this.zuora__PaymentMethod__c = zuora__PaymentMethod__c;
        this.zuora__Payment__c = zuora__Payment__c;
        this.zuora__Payment__r = zuora__Payment__r;
        this.zuora__ReasonCodeName__c = zuora__ReasonCodeName__c;
        this.zuora__ReferenceId__c = zuora__ReferenceId__c;
        this.zuora__RefundDate__c = zuora__RefundDate__c;
        this.zuora__RefundInvoicePayments__r = zuora__RefundInvoicePayments__r;
        this.zuora__RefundMethodType__c = zuora__RefundMethodType__c;
        this.zuora__RefundTransactionTime__c = zuora__RefundTransactionTime__c;
        this.zuora__SoftDescriptorPhone__c = zuora__SoftDescriptorPhone__c;
        this.zuora__SoftDescriptor__c = zuora__SoftDescriptor__c;
        this.zuora__SourceType__c = zuora__SourceType__c;
        this.zuora__Status__c = zuora__Status__c;
        this.zuora__TransferredToAccounting__c = zuora__TransferredToAccounting__c;
        this.zuora__Type__c = zuora__Type__c;
        this.zuora__UpdatedById__c = zuora__UpdatedById__c;
        this.zuora__UpdatedDate__c = zuora__UpdatedDate__c;
    }


    /**
     * Gets the attachedContentDocuments value for this Zuora__Refund__c.
     * 
     * @return attachedContentDocuments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachedContentDocuments() {
        return attachedContentDocuments;
    }


    /**
     * Sets the attachedContentDocuments value for this Zuora__Refund__c.
     * 
     * @param attachedContentDocuments
     */
    public void setAttachedContentDocuments(com.sforce.soap.enterprise.QueryResult attachedContentDocuments) {
        this.attachedContentDocuments = attachedContentDocuments;
    }


    /**
     * Gets the attachments value for this Zuora__Refund__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Zuora__Refund__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the combinedAttachments value for this Zuora__Refund__c.
     * 
     * @return combinedAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getCombinedAttachments() {
        return combinedAttachments;
    }


    /**
     * Sets the combinedAttachments value for this Zuora__Refund__c.
     * 
     * @param combinedAttachments
     */
    public void setCombinedAttachments(com.sforce.soap.enterprise.QueryResult combinedAttachments) {
        this.combinedAttachments = combinedAttachments;
    }


    /**
     * Gets the createdBy value for this Zuora__Refund__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Zuora__Refund__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Zuora__Refund__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Zuora__Refund__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Zuora__Refund__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Zuora__Refund__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the duplicateRecordItems value for this Zuora__Refund__c.
     * 
     * @return duplicateRecordItems
     */
    public com.sforce.soap.enterprise.QueryResult getDuplicateRecordItems() {
        return duplicateRecordItems;
    }


    /**
     * Sets the duplicateRecordItems value for this Zuora__Refund__c.
     * 
     * @param duplicateRecordItems
     */
    public void setDuplicateRecordItems(com.sforce.soap.enterprise.QueryResult duplicateRecordItems) {
        this.duplicateRecordItems = duplicateRecordItems;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Zuora__Refund__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Zuora__Refund__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the isDeleted value for this Zuora__Refund__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Zuora__Refund__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this Zuora__Refund__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Zuora__Refund__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Zuora__Refund__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Zuora__Refund__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Zuora__Refund__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Zuora__Refund__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lookedUpFromActivities value for this Zuora__Refund__c.
     * 
     * @return lookedUpFromActivities
     */
    public com.sforce.soap.enterprise.QueryResult getLookedUpFromActivities() {
        return lookedUpFromActivities;
    }


    /**
     * Sets the lookedUpFromActivities value for this Zuora__Refund__c.
     * 
     * @param lookedUpFromActivities
     */
    public void setLookedUpFromActivities(com.sforce.soap.enterprise.QueryResult lookedUpFromActivities) {
        this.lookedUpFromActivities = lookedUpFromActivities;
    }


    /**
     * Gets the name value for this Zuora__Refund__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Zuora__Refund__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Zuora__Refund__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Zuora__Refund__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Zuora__Refund__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Zuora__Refund__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the processInstances value for this Zuora__Refund__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Zuora__Refund__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Zuora__Refund__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Zuora__Refund__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the recordAssociatedGroups value for this Zuora__Refund__c.
     * 
     * @return recordAssociatedGroups
     */
    public com.sforce.soap.enterprise.QueryResult getRecordAssociatedGroups() {
        return recordAssociatedGroups;
    }


    /**
     * Sets the recordAssociatedGroups value for this Zuora__Refund__c.
     * 
     * @param recordAssociatedGroups
     */
    public void setRecordAssociatedGroups(com.sforce.soap.enterprise.QueryResult recordAssociatedGroups) {
        this.recordAssociatedGroups = recordAssociatedGroups;
    }


    /**
     * Gets the systemModstamp value for this Zuora__Refund__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Zuora__Refund__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the topicAssignments value for this Zuora__Refund__c.
     * 
     * @return topicAssignments
     */
    public com.sforce.soap.enterprise.QueryResult getTopicAssignments() {
        return topicAssignments;
    }


    /**
     * Sets the topicAssignments value for this Zuora__Refund__c.
     * 
     * @param topicAssignments
     */
    public void setTopicAssignments(com.sforce.soap.enterprise.QueryResult topicAssignments) {
        this.topicAssignments = topicAssignments;
    }


    /**
     * Gets the userRecordAccess value for this Zuora__Refund__c.
     * 
     * @return userRecordAccess
     */
    public com.sforce.soap.enterprise.sobject.UserRecordAccess getUserRecordAccess() {
        return userRecordAccess;
    }


    /**
     * Sets the userRecordAccess value for this Zuora__Refund__c.
     * 
     * @param userRecordAccess
     */
    public void setUserRecordAccess(com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess) {
        this.userRecordAccess = userRecordAccess;
    }


    /**
     * Gets the zuora__Account__c value for this Zuora__Refund__c.
     * 
     * @return zuora__Account__c
     */
    public java.lang.String getZuora__Account__c() {
        return zuora__Account__c;
    }


    /**
     * Sets the zuora__Account__c value for this Zuora__Refund__c.
     * 
     * @param zuora__Account__c
     */
    public void setZuora__Account__c(java.lang.String zuora__Account__c) {
        this.zuora__Account__c = zuora__Account__c;
    }


    /**
     * Gets the zuora__Account__r value for this Zuora__Refund__c.
     * 
     * @return zuora__Account__r
     */
    public com.sforce.soap.enterprise.sobject.Account getZuora__Account__r() {
        return zuora__Account__r;
    }


    /**
     * Sets the zuora__Account__r value for this Zuora__Refund__c.
     * 
     * @param zuora__Account__r
     */
    public void setZuora__Account__r(com.sforce.soap.enterprise.sobject.Account zuora__Account__r) {
        this.zuora__Account__r = zuora__Account__r;
    }


    /**
     * Gets the zuora__AccountingCode__c value for this Zuora__Refund__c.
     * 
     * @return zuora__AccountingCode__c
     */
    public java.lang.String getZuora__AccountingCode__c() {
        return zuora__AccountingCode__c;
    }


    /**
     * Sets the zuora__AccountingCode__c value for this Zuora__Refund__c.
     * 
     * @param zuora__AccountingCode__c
     */
    public void setZuora__AccountingCode__c(java.lang.String zuora__AccountingCode__c) {
        this.zuora__AccountingCode__c = zuora__AccountingCode__c;
    }


    /**
     * Gets the zuora__Amount__c value for this Zuora__Refund__c.
     * 
     * @return zuora__Amount__c
     */
    public java.lang.Double getZuora__Amount__c() {
        return zuora__Amount__c;
    }


    /**
     * Sets the zuora__Amount__c value for this Zuora__Refund__c.
     * 
     * @param zuora__Amount__c
     */
    public void setZuora__Amount__c(java.lang.Double zuora__Amount__c) {
        this.zuora__Amount__c = zuora__Amount__c;
    }


    /**
     * Gets the zuora__BillingAccount__c value for this Zuora__Refund__c.
     * 
     * @return zuora__BillingAccount__c
     */
    public java.lang.String getZuora__BillingAccount__c() {
        return zuora__BillingAccount__c;
    }


    /**
     * Sets the zuora__BillingAccount__c value for this Zuora__Refund__c.
     * 
     * @param zuora__BillingAccount__c
     */
    public void setZuora__BillingAccount__c(java.lang.String zuora__BillingAccount__c) {
        this.zuora__BillingAccount__c = zuora__BillingAccount__c;
    }


    /**
     * Gets the zuora__BillingAccount__r value for this Zuora__Refund__c.
     * 
     * @return zuora__BillingAccount__r
     */
    public com.sforce.soap.enterprise.sobject.Zuora__CustomerAccount__c getZuora__BillingAccount__r() {
        return zuora__BillingAccount__r;
    }


    /**
     * Sets the zuora__BillingAccount__r value for this Zuora__Refund__c.
     * 
     * @param zuora__BillingAccount__r
     */
    public void setZuora__BillingAccount__r(com.sforce.soap.enterprise.sobject.Zuora__CustomerAccount__c zuora__BillingAccount__r) {
        this.zuora__BillingAccount__r = zuora__BillingAccount__r;
    }


    /**
     * Gets the zuora__Comment__c value for this Zuora__Refund__c.
     * 
     * @return zuora__Comment__c
     */
    public java.lang.String getZuora__Comment__c() {
        return zuora__Comment__c;
    }


    /**
     * Sets the zuora__Comment__c value for this Zuora__Refund__c.
     * 
     * @param zuora__Comment__c
     */
    public void setZuora__Comment__c(java.lang.String zuora__Comment__c) {
        this.zuora__Comment__c = zuora__Comment__c;
    }


    /**
     * Gets the zuora__CreatedById__c value for this Zuora__Refund__c.
     * 
     * @return zuora__CreatedById__c
     */
    public java.lang.String getZuora__CreatedById__c() {
        return zuora__CreatedById__c;
    }


    /**
     * Sets the zuora__CreatedById__c value for this Zuora__Refund__c.
     * 
     * @param zuora__CreatedById__c
     */
    public void setZuora__CreatedById__c(java.lang.String zuora__CreatedById__c) {
        this.zuora__CreatedById__c = zuora__CreatedById__c;
    }


    /**
     * Gets the zuora__CreatedDate__c value for this Zuora__Refund__c.
     * 
     * @return zuora__CreatedDate__c
     */
    public java.util.Calendar getZuora__CreatedDate__c() {
        return zuora__CreatedDate__c;
    }


    /**
     * Sets the zuora__CreatedDate__c value for this Zuora__Refund__c.
     * 
     * @param zuora__CreatedDate__c
     */
    public void setZuora__CreatedDate__c(java.util.Calendar zuora__CreatedDate__c) {
        this.zuora__CreatedDate__c = zuora__CreatedDate__c;
    }


    /**
     * Gets the zuora__External_Id__c value for this Zuora__Refund__c.
     * 
     * @return zuora__External_Id__c
     */
    public java.lang.String getZuora__External_Id__c() {
        return zuora__External_Id__c;
    }


    /**
     * Sets the zuora__External_Id__c value for this Zuora__Refund__c.
     * 
     * @param zuora__External_Id__c
     */
    public void setZuora__External_Id__c(java.lang.String zuora__External_Id__c) {
        this.zuora__External_Id__c = zuora__External_Id__c;
    }


    /**
     * Gets the zuora__GatewayResponseCode__c value for this Zuora__Refund__c.
     * 
     * @return zuora__GatewayResponseCode__c
     */
    public java.lang.String getZuora__GatewayResponseCode__c() {
        return zuora__GatewayResponseCode__c;
    }


    /**
     * Sets the zuora__GatewayResponseCode__c value for this Zuora__Refund__c.
     * 
     * @param zuora__GatewayResponseCode__c
     */
    public void setZuora__GatewayResponseCode__c(java.lang.String zuora__GatewayResponseCode__c) {
        this.zuora__GatewayResponseCode__c = zuora__GatewayResponseCode__c;
    }


    /**
     * Gets the zuora__GatewayResponse__c value for this Zuora__Refund__c.
     * 
     * @return zuora__GatewayResponse__c
     */
    public java.lang.String getZuora__GatewayResponse__c() {
        return zuora__GatewayResponse__c;
    }


    /**
     * Sets the zuora__GatewayResponse__c value for this Zuora__Refund__c.
     * 
     * @param zuora__GatewayResponse__c
     */
    public void setZuora__GatewayResponse__c(java.lang.String zuora__GatewayResponse__c) {
        this.zuora__GatewayResponse__c = zuora__GatewayResponse__c;
    }


    /**
     * Gets the zuora__PaymentMethod__c value for this Zuora__Refund__c.
     * 
     * @return zuora__PaymentMethod__c
     */
    public java.lang.String getZuora__PaymentMethod__c() {
        return zuora__PaymentMethod__c;
    }


    /**
     * Sets the zuora__PaymentMethod__c value for this Zuora__Refund__c.
     * 
     * @param zuora__PaymentMethod__c
     */
    public void setZuora__PaymentMethod__c(java.lang.String zuora__PaymentMethod__c) {
        this.zuora__PaymentMethod__c = zuora__PaymentMethod__c;
    }


    /**
     * Gets the zuora__Payment__c value for this Zuora__Refund__c.
     * 
     * @return zuora__Payment__c
     */
    public java.lang.String getZuora__Payment__c() {
        return zuora__Payment__c;
    }


    /**
     * Sets the zuora__Payment__c value for this Zuora__Refund__c.
     * 
     * @param zuora__Payment__c
     */
    public void setZuora__Payment__c(java.lang.String zuora__Payment__c) {
        this.zuora__Payment__c = zuora__Payment__c;
    }


    /**
     * Gets the zuora__Payment__r value for this Zuora__Refund__c.
     * 
     * @return zuora__Payment__r
     */
    public com.sforce.soap.enterprise.sobject.Zuora__Payment__c getZuora__Payment__r() {
        return zuora__Payment__r;
    }


    /**
     * Sets the zuora__Payment__r value for this Zuora__Refund__c.
     * 
     * @param zuora__Payment__r
     */
    public void setZuora__Payment__r(com.sforce.soap.enterprise.sobject.Zuora__Payment__c zuora__Payment__r) {
        this.zuora__Payment__r = zuora__Payment__r;
    }


    /**
     * Gets the zuora__ReasonCodeName__c value for this Zuora__Refund__c.
     * 
     * @return zuora__ReasonCodeName__c
     */
    public java.lang.String getZuora__ReasonCodeName__c() {
        return zuora__ReasonCodeName__c;
    }


    /**
     * Sets the zuora__ReasonCodeName__c value for this Zuora__Refund__c.
     * 
     * @param zuora__ReasonCodeName__c
     */
    public void setZuora__ReasonCodeName__c(java.lang.String zuora__ReasonCodeName__c) {
        this.zuora__ReasonCodeName__c = zuora__ReasonCodeName__c;
    }


    /**
     * Gets the zuora__ReferenceId__c value for this Zuora__Refund__c.
     * 
     * @return zuora__ReferenceId__c
     */
    public java.lang.String getZuora__ReferenceId__c() {
        return zuora__ReferenceId__c;
    }


    /**
     * Sets the zuora__ReferenceId__c value for this Zuora__Refund__c.
     * 
     * @param zuora__ReferenceId__c
     */
    public void setZuora__ReferenceId__c(java.lang.String zuora__ReferenceId__c) {
        this.zuora__ReferenceId__c = zuora__ReferenceId__c;
    }


    /**
     * Gets the zuora__RefundDate__c value for this Zuora__Refund__c.
     * 
     * @return zuora__RefundDate__c
     */
    public java.util.Calendar getZuora__RefundDate__c() {
        return zuora__RefundDate__c;
    }


    /**
     * Sets the zuora__RefundDate__c value for this Zuora__Refund__c.
     * 
     * @param zuora__RefundDate__c
     */
    public void setZuora__RefundDate__c(java.util.Calendar zuora__RefundDate__c) {
        this.zuora__RefundDate__c = zuora__RefundDate__c;
    }


    /**
     * Gets the zuora__RefundInvoicePayments__r value for this Zuora__Refund__c.
     * 
     * @return zuora__RefundInvoicePayments__r
     */
    public com.sforce.soap.enterprise.QueryResult getZuora__RefundInvoicePayments__r() {
        return zuora__RefundInvoicePayments__r;
    }


    /**
     * Sets the zuora__RefundInvoicePayments__r value for this Zuora__Refund__c.
     * 
     * @param zuora__RefundInvoicePayments__r
     */
    public void setZuora__RefundInvoicePayments__r(com.sforce.soap.enterprise.QueryResult zuora__RefundInvoicePayments__r) {
        this.zuora__RefundInvoicePayments__r = zuora__RefundInvoicePayments__r;
    }


    /**
     * Gets the zuora__RefundMethodType__c value for this Zuora__Refund__c.
     * 
     * @return zuora__RefundMethodType__c
     */
    public java.lang.String getZuora__RefundMethodType__c() {
        return zuora__RefundMethodType__c;
    }


    /**
     * Sets the zuora__RefundMethodType__c value for this Zuora__Refund__c.
     * 
     * @param zuora__RefundMethodType__c
     */
    public void setZuora__RefundMethodType__c(java.lang.String zuora__RefundMethodType__c) {
        this.zuora__RefundMethodType__c = zuora__RefundMethodType__c;
    }


    /**
     * Gets the zuora__RefundTransactionTime__c value for this Zuora__Refund__c.
     * 
     * @return zuora__RefundTransactionTime__c
     */
    public java.util.Calendar getZuora__RefundTransactionTime__c() {
        return zuora__RefundTransactionTime__c;
    }


    /**
     * Sets the zuora__RefundTransactionTime__c value for this Zuora__Refund__c.
     * 
     * @param zuora__RefundTransactionTime__c
     */
    public void setZuora__RefundTransactionTime__c(java.util.Calendar zuora__RefundTransactionTime__c) {
        this.zuora__RefundTransactionTime__c = zuora__RefundTransactionTime__c;
    }


    /**
     * Gets the zuora__SoftDescriptorPhone__c value for this Zuora__Refund__c.
     * 
     * @return zuora__SoftDescriptorPhone__c
     */
    public java.lang.String getZuora__SoftDescriptorPhone__c() {
        return zuora__SoftDescriptorPhone__c;
    }


    /**
     * Sets the zuora__SoftDescriptorPhone__c value for this Zuora__Refund__c.
     * 
     * @param zuora__SoftDescriptorPhone__c
     */
    public void setZuora__SoftDescriptorPhone__c(java.lang.String zuora__SoftDescriptorPhone__c) {
        this.zuora__SoftDescriptorPhone__c = zuora__SoftDescriptorPhone__c;
    }


    /**
     * Gets the zuora__SoftDescriptor__c value for this Zuora__Refund__c.
     * 
     * @return zuora__SoftDescriptor__c
     */
    public java.lang.String getZuora__SoftDescriptor__c() {
        return zuora__SoftDescriptor__c;
    }


    /**
     * Sets the zuora__SoftDescriptor__c value for this Zuora__Refund__c.
     * 
     * @param zuora__SoftDescriptor__c
     */
    public void setZuora__SoftDescriptor__c(java.lang.String zuora__SoftDescriptor__c) {
        this.zuora__SoftDescriptor__c = zuora__SoftDescriptor__c;
    }


    /**
     * Gets the zuora__SourceType__c value for this Zuora__Refund__c.
     * 
     * @return zuora__SourceType__c
     */
    public java.lang.String getZuora__SourceType__c() {
        return zuora__SourceType__c;
    }


    /**
     * Sets the zuora__SourceType__c value for this Zuora__Refund__c.
     * 
     * @param zuora__SourceType__c
     */
    public void setZuora__SourceType__c(java.lang.String zuora__SourceType__c) {
        this.zuora__SourceType__c = zuora__SourceType__c;
    }


    /**
     * Gets the zuora__Status__c value for this Zuora__Refund__c.
     * 
     * @return zuora__Status__c
     */
    public java.lang.String getZuora__Status__c() {
        return zuora__Status__c;
    }


    /**
     * Sets the zuora__Status__c value for this Zuora__Refund__c.
     * 
     * @param zuora__Status__c
     */
    public void setZuora__Status__c(java.lang.String zuora__Status__c) {
        this.zuora__Status__c = zuora__Status__c;
    }


    /**
     * Gets the zuora__TransferredToAccounting__c value for this Zuora__Refund__c.
     * 
     * @return zuora__TransferredToAccounting__c
     */
    public java.lang.String getZuora__TransferredToAccounting__c() {
        return zuora__TransferredToAccounting__c;
    }


    /**
     * Sets the zuora__TransferredToAccounting__c value for this Zuora__Refund__c.
     * 
     * @param zuora__TransferredToAccounting__c
     */
    public void setZuora__TransferredToAccounting__c(java.lang.String zuora__TransferredToAccounting__c) {
        this.zuora__TransferredToAccounting__c = zuora__TransferredToAccounting__c;
    }


    /**
     * Gets the zuora__Type__c value for this Zuora__Refund__c.
     * 
     * @return zuora__Type__c
     */
    public java.lang.String getZuora__Type__c() {
        return zuora__Type__c;
    }


    /**
     * Sets the zuora__Type__c value for this Zuora__Refund__c.
     * 
     * @param zuora__Type__c
     */
    public void setZuora__Type__c(java.lang.String zuora__Type__c) {
        this.zuora__Type__c = zuora__Type__c;
    }


    /**
     * Gets the zuora__UpdatedById__c value for this Zuora__Refund__c.
     * 
     * @return zuora__UpdatedById__c
     */
    public java.lang.String getZuora__UpdatedById__c() {
        return zuora__UpdatedById__c;
    }


    /**
     * Sets the zuora__UpdatedById__c value for this Zuora__Refund__c.
     * 
     * @param zuora__UpdatedById__c
     */
    public void setZuora__UpdatedById__c(java.lang.String zuora__UpdatedById__c) {
        this.zuora__UpdatedById__c = zuora__UpdatedById__c;
    }


    /**
     * Gets the zuora__UpdatedDate__c value for this Zuora__Refund__c.
     * 
     * @return zuora__UpdatedDate__c
     */
    public java.util.Calendar getZuora__UpdatedDate__c() {
        return zuora__UpdatedDate__c;
    }


    /**
     * Sets the zuora__UpdatedDate__c value for this Zuora__Refund__c.
     * 
     * @param zuora__UpdatedDate__c
     */
    public void setZuora__UpdatedDate__c(java.util.Calendar zuora__UpdatedDate__c) {
        this.zuora__UpdatedDate__c = zuora__UpdatedDate__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Zuora__Refund__c)) return false;
        Zuora__Refund__c other = (Zuora__Refund__c) obj;
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
            ((this.zuora__BillingAccount__c==null && other.getZuora__BillingAccount__c()==null) || 
             (this.zuora__BillingAccount__c!=null &&
              this.zuora__BillingAccount__c.equals(other.getZuora__BillingAccount__c()))) &&
            ((this.zuora__BillingAccount__r==null && other.getZuora__BillingAccount__r()==null) || 
             (this.zuora__BillingAccount__r!=null &&
              this.zuora__BillingAccount__r.equals(other.getZuora__BillingAccount__r()))) &&
            ((this.zuora__Comment__c==null && other.getZuora__Comment__c()==null) || 
             (this.zuora__Comment__c!=null &&
              this.zuora__Comment__c.equals(other.getZuora__Comment__c()))) &&
            ((this.zuora__CreatedById__c==null && other.getZuora__CreatedById__c()==null) || 
             (this.zuora__CreatedById__c!=null &&
              this.zuora__CreatedById__c.equals(other.getZuora__CreatedById__c()))) &&
            ((this.zuora__CreatedDate__c==null && other.getZuora__CreatedDate__c()==null) || 
             (this.zuora__CreatedDate__c!=null &&
              this.zuora__CreatedDate__c.equals(other.getZuora__CreatedDate__c()))) &&
            ((this.zuora__External_Id__c==null && other.getZuora__External_Id__c()==null) || 
             (this.zuora__External_Id__c!=null &&
              this.zuora__External_Id__c.equals(other.getZuora__External_Id__c()))) &&
            ((this.zuora__GatewayResponseCode__c==null && other.getZuora__GatewayResponseCode__c()==null) || 
             (this.zuora__GatewayResponseCode__c!=null &&
              this.zuora__GatewayResponseCode__c.equals(other.getZuora__GatewayResponseCode__c()))) &&
            ((this.zuora__GatewayResponse__c==null && other.getZuora__GatewayResponse__c()==null) || 
             (this.zuora__GatewayResponse__c!=null &&
              this.zuora__GatewayResponse__c.equals(other.getZuora__GatewayResponse__c()))) &&
            ((this.zuora__PaymentMethod__c==null && other.getZuora__PaymentMethod__c()==null) || 
             (this.zuora__PaymentMethod__c!=null &&
              this.zuora__PaymentMethod__c.equals(other.getZuora__PaymentMethod__c()))) &&
            ((this.zuora__Payment__c==null && other.getZuora__Payment__c()==null) || 
             (this.zuora__Payment__c!=null &&
              this.zuora__Payment__c.equals(other.getZuora__Payment__c()))) &&
            ((this.zuora__Payment__r==null && other.getZuora__Payment__r()==null) || 
             (this.zuora__Payment__r!=null &&
              this.zuora__Payment__r.equals(other.getZuora__Payment__r()))) &&
            ((this.zuora__ReasonCodeName__c==null && other.getZuora__ReasonCodeName__c()==null) || 
             (this.zuora__ReasonCodeName__c!=null &&
              this.zuora__ReasonCodeName__c.equals(other.getZuora__ReasonCodeName__c()))) &&
            ((this.zuora__ReferenceId__c==null && other.getZuora__ReferenceId__c()==null) || 
             (this.zuora__ReferenceId__c!=null &&
              this.zuora__ReferenceId__c.equals(other.getZuora__ReferenceId__c()))) &&
            ((this.zuora__RefundDate__c==null && other.getZuora__RefundDate__c()==null) || 
             (this.zuora__RefundDate__c!=null &&
              this.zuora__RefundDate__c.equals(other.getZuora__RefundDate__c()))) &&
            ((this.zuora__RefundInvoicePayments__r==null && other.getZuora__RefundInvoicePayments__r()==null) || 
             (this.zuora__RefundInvoicePayments__r!=null &&
              this.zuora__RefundInvoicePayments__r.equals(other.getZuora__RefundInvoicePayments__r()))) &&
            ((this.zuora__RefundMethodType__c==null && other.getZuora__RefundMethodType__c()==null) || 
             (this.zuora__RefundMethodType__c!=null &&
              this.zuora__RefundMethodType__c.equals(other.getZuora__RefundMethodType__c()))) &&
            ((this.zuora__RefundTransactionTime__c==null && other.getZuora__RefundTransactionTime__c()==null) || 
             (this.zuora__RefundTransactionTime__c!=null &&
              this.zuora__RefundTransactionTime__c.equals(other.getZuora__RefundTransactionTime__c()))) &&
            ((this.zuora__SoftDescriptorPhone__c==null && other.getZuora__SoftDescriptorPhone__c()==null) || 
             (this.zuora__SoftDescriptorPhone__c!=null &&
              this.zuora__SoftDescriptorPhone__c.equals(other.getZuora__SoftDescriptorPhone__c()))) &&
            ((this.zuora__SoftDescriptor__c==null && other.getZuora__SoftDescriptor__c()==null) || 
             (this.zuora__SoftDescriptor__c!=null &&
              this.zuora__SoftDescriptor__c.equals(other.getZuora__SoftDescriptor__c()))) &&
            ((this.zuora__SourceType__c==null && other.getZuora__SourceType__c()==null) || 
             (this.zuora__SourceType__c!=null &&
              this.zuora__SourceType__c.equals(other.getZuora__SourceType__c()))) &&
            ((this.zuora__Status__c==null && other.getZuora__Status__c()==null) || 
             (this.zuora__Status__c!=null &&
              this.zuora__Status__c.equals(other.getZuora__Status__c()))) &&
            ((this.zuora__TransferredToAccounting__c==null && other.getZuora__TransferredToAccounting__c()==null) || 
             (this.zuora__TransferredToAccounting__c!=null &&
              this.zuora__TransferredToAccounting__c.equals(other.getZuora__TransferredToAccounting__c()))) &&
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
        if (getZuora__BillingAccount__c() != null) {
            _hashCode += getZuora__BillingAccount__c().hashCode();
        }
        if (getZuora__BillingAccount__r() != null) {
            _hashCode += getZuora__BillingAccount__r().hashCode();
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
        if (getZuora__External_Id__c() != null) {
            _hashCode += getZuora__External_Id__c().hashCode();
        }
        if (getZuora__GatewayResponseCode__c() != null) {
            _hashCode += getZuora__GatewayResponseCode__c().hashCode();
        }
        if (getZuora__GatewayResponse__c() != null) {
            _hashCode += getZuora__GatewayResponse__c().hashCode();
        }
        if (getZuora__PaymentMethod__c() != null) {
            _hashCode += getZuora__PaymentMethod__c().hashCode();
        }
        if (getZuora__Payment__c() != null) {
            _hashCode += getZuora__Payment__c().hashCode();
        }
        if (getZuora__Payment__r() != null) {
            _hashCode += getZuora__Payment__r().hashCode();
        }
        if (getZuora__ReasonCodeName__c() != null) {
            _hashCode += getZuora__ReasonCodeName__c().hashCode();
        }
        if (getZuora__ReferenceId__c() != null) {
            _hashCode += getZuora__ReferenceId__c().hashCode();
        }
        if (getZuora__RefundDate__c() != null) {
            _hashCode += getZuora__RefundDate__c().hashCode();
        }
        if (getZuora__RefundInvoicePayments__r() != null) {
            _hashCode += getZuora__RefundInvoicePayments__r().hashCode();
        }
        if (getZuora__RefundMethodType__c() != null) {
            _hashCode += getZuora__RefundMethodType__c().hashCode();
        }
        if (getZuora__RefundTransactionTime__c() != null) {
            _hashCode += getZuora__RefundTransactionTime__c().hashCode();
        }
        if (getZuora__SoftDescriptorPhone__c() != null) {
            _hashCode += getZuora__SoftDescriptorPhone__c().hashCode();
        }
        if (getZuora__SoftDescriptor__c() != null) {
            _hashCode += getZuora__SoftDescriptor__c().hashCode();
        }
        if (getZuora__SourceType__c() != null) {
            _hashCode += getZuora__SourceType__c().hashCode();
        }
        if (getZuora__Status__c() != null) {
            _hashCode += getZuora__Status__c().hashCode();
        }
        if (getZuora__TransferredToAccounting__c() != null) {
            _hashCode += getZuora__TransferredToAccounting__c().hashCode();
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
        new org.apache.axis.description.TypeDesc(Zuora__Refund__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Refund__c"));
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
        elemField.setFieldName("zuora__External_Id__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__External_Id__c"));
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
        elemField.setFieldName("zuora__PaymentMethod__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__PaymentMethod__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__Payment__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Payment__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__Payment__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Payment__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Payment__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__ReasonCodeName__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__ReasonCodeName__c"));
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
        elemField.setFieldName("zuora__RefundDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__RefundDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__RefundInvoicePayments__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__RefundInvoicePayments__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__RefundMethodType__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__RefundMethodType__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__RefundTransactionTime__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__RefundTransactionTime__c"));
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
        elemField.setFieldName("zuora__SourceType__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__SourceType__c"));
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
        elemField.setFieldName("zuora__TransferredToAccounting__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__TransferredToAccounting__c"));
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
