/**
 * Zuora__ZInvoice__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Zuora__ZInvoice__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
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

    private com.sforce.soap.enterprise.sobject.SObject owner;

    private java.lang.String ownerId;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private com.sforce.soap.enterprise.QueryResult recordAssociatedGroups;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult topicAssignments;

    private com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess;

    private java.lang.String zuora__Account__c;

    private com.sforce.soap.enterprise.sobject.Account zuora__Account__r;

    private java.lang.Double zuora__AdjustmentAmount__c;

    private java.lang.String zuora__Age_Bucket__c;

    private java.lang.Double zuora__AmountWithoutTax__c;

    private java.lang.Double zuora__Balance2__c;

    private java.lang.Double zuora__Balance__c;

    private java.lang.String zuora__BillToId__c;

    private java.lang.String zuora__BillingAccount__c;

    private com.sforce.soap.enterprise.sobject.Zuora__CustomerAccount__c zuora__BillingAccount__r;

    private java.lang.String zuora__Description__c;

    private java.util.Date zuora__DueDate__c;

    private java.lang.String zuora__External_Id__c;

    private java.util.Date zuora__GeneratedDate__c;

    private java.util.Date zuora__InvoiceDate__c;

    private java.lang.Double zuora__PaymentAmount__c;

    private com.sforce.soap.enterprise.QueryResult zuora__PaymentInvoices__r;

    private java.lang.String zuora__PaymentTerm__c;

    private java.lang.String zuora__Payment_Term__c;

    private com.sforce.soap.enterprise.sobject.Zuora__PaymentTerm__c zuora__Payment_Term__r;

    private com.sforce.soap.enterprise.QueryResult zuora__Payments__r;

    private java.util.Date zuora__PostedDate__c;

    private java.lang.Double zuora__RefundedAmount__c;

    private java.lang.String zuora__SoldToId__c;

    private java.lang.String zuora__Status__c;

    private java.util.Date zuora__TargetDate__c;

    private java.lang.Double zuora__TaxAmount__c;

    private java.lang.Double zuora__TaxExemptAmount__c;

    private java.lang.Double zuora__TotalAmount__c;

    private java.lang.String zuora__ZuoraId__c;

    private java.lang.String zuora__Zuora_Id__c;

    public Zuora__ZInvoice__c() {
    }

    public Zuora__ZInvoice__c(
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
           com.sforce.soap.enterprise.sobject.SObject owner,
           java.lang.String ownerId,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           com.sforce.soap.enterprise.QueryResult recordAssociatedGroups,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult topicAssignments,
           com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess,
           java.lang.String zuora__Account__c,
           com.sforce.soap.enterprise.sobject.Account zuora__Account__r,
           java.lang.Double zuora__AdjustmentAmount__c,
           java.lang.String zuora__Age_Bucket__c,
           java.lang.Double zuora__AmountWithoutTax__c,
           java.lang.Double zuora__Balance2__c,
           java.lang.Double zuora__Balance__c,
           java.lang.String zuora__BillToId__c,
           java.lang.String zuora__BillingAccount__c,
           com.sforce.soap.enterprise.sobject.Zuora__CustomerAccount__c zuora__BillingAccount__r,
           java.lang.String zuora__Description__c,
           java.util.Date zuora__DueDate__c,
           java.lang.String zuora__External_Id__c,
           java.util.Date zuora__GeneratedDate__c,
           java.util.Date zuora__InvoiceDate__c,
           java.lang.Double zuora__PaymentAmount__c,
           com.sforce.soap.enterprise.QueryResult zuora__PaymentInvoices__r,
           java.lang.String zuora__PaymentTerm__c,
           java.lang.String zuora__Payment_Term__c,
           com.sforce.soap.enterprise.sobject.Zuora__PaymentTerm__c zuora__Payment_Term__r,
           com.sforce.soap.enterprise.QueryResult zuora__Payments__r,
           java.util.Date zuora__PostedDate__c,
           java.lang.Double zuora__RefundedAmount__c,
           java.lang.String zuora__SoldToId__c,
           java.lang.String zuora__Status__c,
           java.util.Date zuora__TargetDate__c,
           java.lang.Double zuora__TaxAmount__c,
           java.lang.Double zuora__TaxExemptAmount__c,
           java.lang.Double zuora__TotalAmount__c,
           java.lang.String zuora__ZuoraId__c,
           java.lang.String zuora__Zuora_Id__c) {
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
        this.owner = owner;
        this.ownerId = ownerId;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.recordAssociatedGroups = recordAssociatedGroups;
        this.systemModstamp = systemModstamp;
        this.topicAssignments = topicAssignments;
        this.userRecordAccess = userRecordAccess;
        this.zuora__Account__c = zuora__Account__c;
        this.zuora__Account__r = zuora__Account__r;
        this.zuora__AdjustmentAmount__c = zuora__AdjustmentAmount__c;
        this.zuora__Age_Bucket__c = zuora__Age_Bucket__c;
        this.zuora__AmountWithoutTax__c = zuora__AmountWithoutTax__c;
        this.zuora__Balance2__c = zuora__Balance2__c;
        this.zuora__Balance__c = zuora__Balance__c;
        this.zuora__BillToId__c = zuora__BillToId__c;
        this.zuora__BillingAccount__c = zuora__BillingAccount__c;
        this.zuora__BillingAccount__r = zuora__BillingAccount__r;
        this.zuora__Description__c = zuora__Description__c;
        this.zuora__DueDate__c = zuora__DueDate__c;
        this.zuora__External_Id__c = zuora__External_Id__c;
        this.zuora__GeneratedDate__c = zuora__GeneratedDate__c;
        this.zuora__InvoiceDate__c = zuora__InvoiceDate__c;
        this.zuora__PaymentAmount__c = zuora__PaymentAmount__c;
        this.zuora__PaymentInvoices__r = zuora__PaymentInvoices__r;
        this.zuora__PaymentTerm__c = zuora__PaymentTerm__c;
        this.zuora__Payment_Term__c = zuora__Payment_Term__c;
        this.zuora__Payment_Term__r = zuora__Payment_Term__r;
        this.zuora__Payments__r = zuora__Payments__r;
        this.zuora__PostedDate__c = zuora__PostedDate__c;
        this.zuora__RefundedAmount__c = zuora__RefundedAmount__c;
        this.zuora__SoldToId__c = zuora__SoldToId__c;
        this.zuora__Status__c = zuora__Status__c;
        this.zuora__TargetDate__c = zuora__TargetDate__c;
        this.zuora__TaxAmount__c = zuora__TaxAmount__c;
        this.zuora__TaxExemptAmount__c = zuora__TaxExemptAmount__c;
        this.zuora__TotalAmount__c = zuora__TotalAmount__c;
        this.zuora__ZuoraId__c = zuora__ZuoraId__c;
        this.zuora__Zuora_Id__c = zuora__Zuora_Id__c;
    }


    /**
     * Gets the attachedContentDocuments value for this Zuora__ZInvoice__c.
     * 
     * @return attachedContentDocuments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachedContentDocuments() {
        return attachedContentDocuments;
    }


    /**
     * Sets the attachedContentDocuments value for this Zuora__ZInvoice__c.
     * 
     * @param attachedContentDocuments
     */
    public void setAttachedContentDocuments(com.sforce.soap.enterprise.QueryResult attachedContentDocuments) {
        this.attachedContentDocuments = attachedContentDocuments;
    }


    /**
     * Gets the attachments value for this Zuora__ZInvoice__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Zuora__ZInvoice__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the combinedAttachments value for this Zuora__ZInvoice__c.
     * 
     * @return combinedAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getCombinedAttachments() {
        return combinedAttachments;
    }


    /**
     * Sets the combinedAttachments value for this Zuora__ZInvoice__c.
     * 
     * @param combinedAttachments
     */
    public void setCombinedAttachments(com.sforce.soap.enterprise.QueryResult combinedAttachments) {
        this.combinedAttachments = combinedAttachments;
    }


    /**
     * Gets the createdBy value for this Zuora__ZInvoice__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Zuora__ZInvoice__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Zuora__ZInvoice__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Zuora__ZInvoice__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Zuora__ZInvoice__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Zuora__ZInvoice__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the duplicateRecordItems value for this Zuora__ZInvoice__c.
     * 
     * @return duplicateRecordItems
     */
    public com.sforce.soap.enterprise.QueryResult getDuplicateRecordItems() {
        return duplicateRecordItems;
    }


    /**
     * Sets the duplicateRecordItems value for this Zuora__ZInvoice__c.
     * 
     * @param duplicateRecordItems
     */
    public void setDuplicateRecordItems(com.sforce.soap.enterprise.QueryResult duplicateRecordItems) {
        this.duplicateRecordItems = duplicateRecordItems;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Zuora__ZInvoice__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Zuora__ZInvoice__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the isDeleted value for this Zuora__ZInvoice__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Zuora__ZInvoice__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this Zuora__ZInvoice__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Zuora__ZInvoice__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Zuora__ZInvoice__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Zuora__ZInvoice__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Zuora__ZInvoice__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Zuora__ZInvoice__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lookedUpFromActivities value for this Zuora__ZInvoice__c.
     * 
     * @return lookedUpFromActivities
     */
    public com.sforce.soap.enterprise.QueryResult getLookedUpFromActivities() {
        return lookedUpFromActivities;
    }


    /**
     * Sets the lookedUpFromActivities value for this Zuora__ZInvoice__c.
     * 
     * @param lookedUpFromActivities
     */
    public void setLookedUpFromActivities(com.sforce.soap.enterprise.QueryResult lookedUpFromActivities) {
        this.lookedUpFromActivities = lookedUpFromActivities;
    }


    /**
     * Gets the name value for this Zuora__ZInvoice__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Zuora__ZInvoice__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Zuora__ZInvoice__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Zuora__ZInvoice__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Zuora__ZInvoice__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Zuora__ZInvoice__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the owner value for this Zuora__ZInvoice__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.SObject getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Zuora__ZInvoice__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.SObject owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Zuora__ZInvoice__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Zuora__ZInvoice__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the processInstances value for this Zuora__ZInvoice__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Zuora__ZInvoice__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Zuora__ZInvoice__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Zuora__ZInvoice__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the recordAssociatedGroups value for this Zuora__ZInvoice__c.
     * 
     * @return recordAssociatedGroups
     */
    public com.sforce.soap.enterprise.QueryResult getRecordAssociatedGroups() {
        return recordAssociatedGroups;
    }


    /**
     * Sets the recordAssociatedGroups value for this Zuora__ZInvoice__c.
     * 
     * @param recordAssociatedGroups
     */
    public void setRecordAssociatedGroups(com.sforce.soap.enterprise.QueryResult recordAssociatedGroups) {
        this.recordAssociatedGroups = recordAssociatedGroups;
    }


    /**
     * Gets the systemModstamp value for this Zuora__ZInvoice__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Zuora__ZInvoice__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the topicAssignments value for this Zuora__ZInvoice__c.
     * 
     * @return topicAssignments
     */
    public com.sforce.soap.enterprise.QueryResult getTopicAssignments() {
        return topicAssignments;
    }


    /**
     * Sets the topicAssignments value for this Zuora__ZInvoice__c.
     * 
     * @param topicAssignments
     */
    public void setTopicAssignments(com.sforce.soap.enterprise.QueryResult topicAssignments) {
        this.topicAssignments = topicAssignments;
    }


    /**
     * Gets the userRecordAccess value for this Zuora__ZInvoice__c.
     * 
     * @return userRecordAccess
     */
    public com.sforce.soap.enterprise.sobject.UserRecordAccess getUserRecordAccess() {
        return userRecordAccess;
    }


    /**
     * Sets the userRecordAccess value for this Zuora__ZInvoice__c.
     * 
     * @param userRecordAccess
     */
    public void setUserRecordAccess(com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess) {
        this.userRecordAccess = userRecordAccess;
    }


    /**
     * Gets the zuora__Account__c value for this Zuora__ZInvoice__c.
     * 
     * @return zuora__Account__c
     */
    public java.lang.String getZuora__Account__c() {
        return zuora__Account__c;
    }


    /**
     * Sets the zuora__Account__c value for this Zuora__ZInvoice__c.
     * 
     * @param zuora__Account__c
     */
    public void setZuora__Account__c(java.lang.String zuora__Account__c) {
        this.zuora__Account__c = zuora__Account__c;
    }


    /**
     * Gets the zuora__Account__r value for this Zuora__ZInvoice__c.
     * 
     * @return zuora__Account__r
     */
    public com.sforce.soap.enterprise.sobject.Account getZuora__Account__r() {
        return zuora__Account__r;
    }


    /**
     * Sets the zuora__Account__r value for this Zuora__ZInvoice__c.
     * 
     * @param zuora__Account__r
     */
    public void setZuora__Account__r(com.sforce.soap.enterprise.sobject.Account zuora__Account__r) {
        this.zuora__Account__r = zuora__Account__r;
    }


    /**
     * Gets the zuora__AdjustmentAmount__c value for this Zuora__ZInvoice__c.
     * 
     * @return zuora__AdjustmentAmount__c
     */
    public java.lang.Double getZuora__AdjustmentAmount__c() {
        return zuora__AdjustmentAmount__c;
    }


    /**
     * Sets the zuora__AdjustmentAmount__c value for this Zuora__ZInvoice__c.
     * 
     * @param zuora__AdjustmentAmount__c
     */
    public void setZuora__AdjustmentAmount__c(java.lang.Double zuora__AdjustmentAmount__c) {
        this.zuora__AdjustmentAmount__c = zuora__AdjustmentAmount__c;
    }


    /**
     * Gets the zuora__Age_Bucket__c value for this Zuora__ZInvoice__c.
     * 
     * @return zuora__Age_Bucket__c
     */
    public java.lang.String getZuora__Age_Bucket__c() {
        return zuora__Age_Bucket__c;
    }


    /**
     * Sets the zuora__Age_Bucket__c value for this Zuora__ZInvoice__c.
     * 
     * @param zuora__Age_Bucket__c
     */
    public void setZuora__Age_Bucket__c(java.lang.String zuora__Age_Bucket__c) {
        this.zuora__Age_Bucket__c = zuora__Age_Bucket__c;
    }


    /**
     * Gets the zuora__AmountWithoutTax__c value for this Zuora__ZInvoice__c.
     * 
     * @return zuora__AmountWithoutTax__c
     */
    public java.lang.Double getZuora__AmountWithoutTax__c() {
        return zuora__AmountWithoutTax__c;
    }


    /**
     * Sets the zuora__AmountWithoutTax__c value for this Zuora__ZInvoice__c.
     * 
     * @param zuora__AmountWithoutTax__c
     */
    public void setZuora__AmountWithoutTax__c(java.lang.Double zuora__AmountWithoutTax__c) {
        this.zuora__AmountWithoutTax__c = zuora__AmountWithoutTax__c;
    }


    /**
     * Gets the zuora__Balance2__c value for this Zuora__ZInvoice__c.
     * 
     * @return zuora__Balance2__c
     */
    public java.lang.Double getZuora__Balance2__c() {
        return zuora__Balance2__c;
    }


    /**
     * Sets the zuora__Balance2__c value for this Zuora__ZInvoice__c.
     * 
     * @param zuora__Balance2__c
     */
    public void setZuora__Balance2__c(java.lang.Double zuora__Balance2__c) {
        this.zuora__Balance2__c = zuora__Balance2__c;
    }


    /**
     * Gets the zuora__Balance__c value for this Zuora__ZInvoice__c.
     * 
     * @return zuora__Balance__c
     */
    public java.lang.Double getZuora__Balance__c() {
        return zuora__Balance__c;
    }


    /**
     * Sets the zuora__Balance__c value for this Zuora__ZInvoice__c.
     * 
     * @param zuora__Balance__c
     */
    public void setZuora__Balance__c(java.lang.Double zuora__Balance__c) {
        this.zuora__Balance__c = zuora__Balance__c;
    }


    /**
     * Gets the zuora__BillToId__c value for this Zuora__ZInvoice__c.
     * 
     * @return zuora__BillToId__c
     */
    public java.lang.String getZuora__BillToId__c() {
        return zuora__BillToId__c;
    }


    /**
     * Sets the zuora__BillToId__c value for this Zuora__ZInvoice__c.
     * 
     * @param zuora__BillToId__c
     */
    public void setZuora__BillToId__c(java.lang.String zuora__BillToId__c) {
        this.zuora__BillToId__c = zuora__BillToId__c;
    }


    /**
     * Gets the zuora__BillingAccount__c value for this Zuora__ZInvoice__c.
     * 
     * @return zuora__BillingAccount__c
     */
    public java.lang.String getZuora__BillingAccount__c() {
        return zuora__BillingAccount__c;
    }


    /**
     * Sets the zuora__BillingAccount__c value for this Zuora__ZInvoice__c.
     * 
     * @param zuora__BillingAccount__c
     */
    public void setZuora__BillingAccount__c(java.lang.String zuora__BillingAccount__c) {
        this.zuora__BillingAccount__c = zuora__BillingAccount__c;
    }


    /**
     * Gets the zuora__BillingAccount__r value for this Zuora__ZInvoice__c.
     * 
     * @return zuora__BillingAccount__r
     */
    public com.sforce.soap.enterprise.sobject.Zuora__CustomerAccount__c getZuora__BillingAccount__r() {
        return zuora__BillingAccount__r;
    }


    /**
     * Sets the zuora__BillingAccount__r value for this Zuora__ZInvoice__c.
     * 
     * @param zuora__BillingAccount__r
     */
    public void setZuora__BillingAccount__r(com.sforce.soap.enterprise.sobject.Zuora__CustomerAccount__c zuora__BillingAccount__r) {
        this.zuora__BillingAccount__r = zuora__BillingAccount__r;
    }


    /**
     * Gets the zuora__Description__c value for this Zuora__ZInvoice__c.
     * 
     * @return zuora__Description__c
     */
    public java.lang.String getZuora__Description__c() {
        return zuora__Description__c;
    }


    /**
     * Sets the zuora__Description__c value for this Zuora__ZInvoice__c.
     * 
     * @param zuora__Description__c
     */
    public void setZuora__Description__c(java.lang.String zuora__Description__c) {
        this.zuora__Description__c = zuora__Description__c;
    }


    /**
     * Gets the zuora__DueDate__c value for this Zuora__ZInvoice__c.
     * 
     * @return zuora__DueDate__c
     */
    public java.util.Date getZuora__DueDate__c() {
        return zuora__DueDate__c;
    }


    /**
     * Sets the zuora__DueDate__c value for this Zuora__ZInvoice__c.
     * 
     * @param zuora__DueDate__c
     */
    public void setZuora__DueDate__c(java.util.Date zuora__DueDate__c) {
        this.zuora__DueDate__c = zuora__DueDate__c;
    }


    /**
     * Gets the zuora__External_Id__c value for this Zuora__ZInvoice__c.
     * 
     * @return zuora__External_Id__c
     */
    public java.lang.String getZuora__External_Id__c() {
        return zuora__External_Id__c;
    }


    /**
     * Sets the zuora__External_Id__c value for this Zuora__ZInvoice__c.
     * 
     * @param zuora__External_Id__c
     */
    public void setZuora__External_Id__c(java.lang.String zuora__External_Id__c) {
        this.zuora__External_Id__c = zuora__External_Id__c;
    }


    /**
     * Gets the zuora__GeneratedDate__c value for this Zuora__ZInvoice__c.
     * 
     * @return zuora__GeneratedDate__c
     */
    public java.util.Date getZuora__GeneratedDate__c() {
        return zuora__GeneratedDate__c;
    }


    /**
     * Sets the zuora__GeneratedDate__c value for this Zuora__ZInvoice__c.
     * 
     * @param zuora__GeneratedDate__c
     */
    public void setZuora__GeneratedDate__c(java.util.Date zuora__GeneratedDate__c) {
        this.zuora__GeneratedDate__c = zuora__GeneratedDate__c;
    }


    /**
     * Gets the zuora__InvoiceDate__c value for this Zuora__ZInvoice__c.
     * 
     * @return zuora__InvoiceDate__c
     */
    public java.util.Date getZuora__InvoiceDate__c() {
        return zuora__InvoiceDate__c;
    }


    /**
     * Sets the zuora__InvoiceDate__c value for this Zuora__ZInvoice__c.
     * 
     * @param zuora__InvoiceDate__c
     */
    public void setZuora__InvoiceDate__c(java.util.Date zuora__InvoiceDate__c) {
        this.zuora__InvoiceDate__c = zuora__InvoiceDate__c;
    }


    /**
     * Gets the zuora__PaymentAmount__c value for this Zuora__ZInvoice__c.
     * 
     * @return zuora__PaymentAmount__c
     */
    public java.lang.Double getZuora__PaymentAmount__c() {
        return zuora__PaymentAmount__c;
    }


    /**
     * Sets the zuora__PaymentAmount__c value for this Zuora__ZInvoice__c.
     * 
     * @param zuora__PaymentAmount__c
     */
    public void setZuora__PaymentAmount__c(java.lang.Double zuora__PaymentAmount__c) {
        this.zuora__PaymentAmount__c = zuora__PaymentAmount__c;
    }


    /**
     * Gets the zuora__PaymentInvoices__r value for this Zuora__ZInvoice__c.
     * 
     * @return zuora__PaymentInvoices__r
     */
    public com.sforce.soap.enterprise.QueryResult getZuora__PaymentInvoices__r() {
        return zuora__PaymentInvoices__r;
    }


    /**
     * Sets the zuora__PaymentInvoices__r value for this Zuora__ZInvoice__c.
     * 
     * @param zuora__PaymentInvoices__r
     */
    public void setZuora__PaymentInvoices__r(com.sforce.soap.enterprise.QueryResult zuora__PaymentInvoices__r) {
        this.zuora__PaymentInvoices__r = zuora__PaymentInvoices__r;
    }


    /**
     * Gets the zuora__PaymentTerm__c value for this Zuora__ZInvoice__c.
     * 
     * @return zuora__PaymentTerm__c
     */
    public java.lang.String getZuora__PaymentTerm__c() {
        return zuora__PaymentTerm__c;
    }


    /**
     * Sets the zuora__PaymentTerm__c value for this Zuora__ZInvoice__c.
     * 
     * @param zuora__PaymentTerm__c
     */
    public void setZuora__PaymentTerm__c(java.lang.String zuora__PaymentTerm__c) {
        this.zuora__PaymentTerm__c = zuora__PaymentTerm__c;
    }


    /**
     * Gets the zuora__Payment_Term__c value for this Zuora__ZInvoice__c.
     * 
     * @return zuora__Payment_Term__c
     */
    public java.lang.String getZuora__Payment_Term__c() {
        return zuora__Payment_Term__c;
    }


    /**
     * Sets the zuora__Payment_Term__c value for this Zuora__ZInvoice__c.
     * 
     * @param zuora__Payment_Term__c
     */
    public void setZuora__Payment_Term__c(java.lang.String zuora__Payment_Term__c) {
        this.zuora__Payment_Term__c = zuora__Payment_Term__c;
    }


    /**
     * Gets the zuora__Payment_Term__r value for this Zuora__ZInvoice__c.
     * 
     * @return zuora__Payment_Term__r
     */
    public com.sforce.soap.enterprise.sobject.Zuora__PaymentTerm__c getZuora__Payment_Term__r() {
        return zuora__Payment_Term__r;
    }


    /**
     * Sets the zuora__Payment_Term__r value for this Zuora__ZInvoice__c.
     * 
     * @param zuora__Payment_Term__r
     */
    public void setZuora__Payment_Term__r(com.sforce.soap.enterprise.sobject.Zuora__PaymentTerm__c zuora__Payment_Term__r) {
        this.zuora__Payment_Term__r = zuora__Payment_Term__r;
    }


    /**
     * Gets the zuora__Payments__r value for this Zuora__ZInvoice__c.
     * 
     * @return zuora__Payments__r
     */
    public com.sforce.soap.enterprise.QueryResult getZuora__Payments__r() {
        return zuora__Payments__r;
    }


    /**
     * Sets the zuora__Payments__r value for this Zuora__ZInvoice__c.
     * 
     * @param zuora__Payments__r
     */
    public void setZuora__Payments__r(com.sforce.soap.enterprise.QueryResult zuora__Payments__r) {
        this.zuora__Payments__r = zuora__Payments__r;
    }


    /**
     * Gets the zuora__PostedDate__c value for this Zuora__ZInvoice__c.
     * 
     * @return zuora__PostedDate__c
     */
    public java.util.Date getZuora__PostedDate__c() {
        return zuora__PostedDate__c;
    }


    /**
     * Sets the zuora__PostedDate__c value for this Zuora__ZInvoice__c.
     * 
     * @param zuora__PostedDate__c
     */
    public void setZuora__PostedDate__c(java.util.Date zuora__PostedDate__c) {
        this.zuora__PostedDate__c = zuora__PostedDate__c;
    }


    /**
     * Gets the zuora__RefundedAmount__c value for this Zuora__ZInvoice__c.
     * 
     * @return zuora__RefundedAmount__c
     */
    public java.lang.Double getZuora__RefundedAmount__c() {
        return zuora__RefundedAmount__c;
    }


    /**
     * Sets the zuora__RefundedAmount__c value for this Zuora__ZInvoice__c.
     * 
     * @param zuora__RefundedAmount__c
     */
    public void setZuora__RefundedAmount__c(java.lang.Double zuora__RefundedAmount__c) {
        this.zuora__RefundedAmount__c = zuora__RefundedAmount__c;
    }


    /**
     * Gets the zuora__SoldToId__c value for this Zuora__ZInvoice__c.
     * 
     * @return zuora__SoldToId__c
     */
    public java.lang.String getZuora__SoldToId__c() {
        return zuora__SoldToId__c;
    }


    /**
     * Sets the zuora__SoldToId__c value for this Zuora__ZInvoice__c.
     * 
     * @param zuora__SoldToId__c
     */
    public void setZuora__SoldToId__c(java.lang.String zuora__SoldToId__c) {
        this.zuora__SoldToId__c = zuora__SoldToId__c;
    }


    /**
     * Gets the zuora__Status__c value for this Zuora__ZInvoice__c.
     * 
     * @return zuora__Status__c
     */
    public java.lang.String getZuora__Status__c() {
        return zuora__Status__c;
    }


    /**
     * Sets the zuora__Status__c value for this Zuora__ZInvoice__c.
     * 
     * @param zuora__Status__c
     */
    public void setZuora__Status__c(java.lang.String zuora__Status__c) {
        this.zuora__Status__c = zuora__Status__c;
    }


    /**
     * Gets the zuora__TargetDate__c value for this Zuora__ZInvoice__c.
     * 
     * @return zuora__TargetDate__c
     */
    public java.util.Date getZuora__TargetDate__c() {
        return zuora__TargetDate__c;
    }


    /**
     * Sets the zuora__TargetDate__c value for this Zuora__ZInvoice__c.
     * 
     * @param zuora__TargetDate__c
     */
    public void setZuora__TargetDate__c(java.util.Date zuora__TargetDate__c) {
        this.zuora__TargetDate__c = zuora__TargetDate__c;
    }


    /**
     * Gets the zuora__TaxAmount__c value for this Zuora__ZInvoice__c.
     * 
     * @return zuora__TaxAmount__c
     */
    public java.lang.Double getZuora__TaxAmount__c() {
        return zuora__TaxAmount__c;
    }


    /**
     * Sets the zuora__TaxAmount__c value for this Zuora__ZInvoice__c.
     * 
     * @param zuora__TaxAmount__c
     */
    public void setZuora__TaxAmount__c(java.lang.Double zuora__TaxAmount__c) {
        this.zuora__TaxAmount__c = zuora__TaxAmount__c;
    }


    /**
     * Gets the zuora__TaxExemptAmount__c value for this Zuora__ZInvoice__c.
     * 
     * @return zuora__TaxExemptAmount__c
     */
    public java.lang.Double getZuora__TaxExemptAmount__c() {
        return zuora__TaxExemptAmount__c;
    }


    /**
     * Sets the zuora__TaxExemptAmount__c value for this Zuora__ZInvoice__c.
     * 
     * @param zuora__TaxExemptAmount__c
     */
    public void setZuora__TaxExemptAmount__c(java.lang.Double zuora__TaxExemptAmount__c) {
        this.zuora__TaxExemptAmount__c = zuora__TaxExemptAmount__c;
    }


    /**
     * Gets the zuora__TotalAmount__c value for this Zuora__ZInvoice__c.
     * 
     * @return zuora__TotalAmount__c
     */
    public java.lang.Double getZuora__TotalAmount__c() {
        return zuora__TotalAmount__c;
    }


    /**
     * Sets the zuora__TotalAmount__c value for this Zuora__ZInvoice__c.
     * 
     * @param zuora__TotalAmount__c
     */
    public void setZuora__TotalAmount__c(java.lang.Double zuora__TotalAmount__c) {
        this.zuora__TotalAmount__c = zuora__TotalAmount__c;
    }


    /**
     * Gets the zuora__ZuoraId__c value for this Zuora__ZInvoice__c.
     * 
     * @return zuora__ZuoraId__c
     */
    public java.lang.String getZuora__ZuoraId__c() {
        return zuora__ZuoraId__c;
    }


    /**
     * Sets the zuora__ZuoraId__c value for this Zuora__ZInvoice__c.
     * 
     * @param zuora__ZuoraId__c
     */
    public void setZuora__ZuoraId__c(java.lang.String zuora__ZuoraId__c) {
        this.zuora__ZuoraId__c = zuora__ZuoraId__c;
    }


    /**
     * Gets the zuora__Zuora_Id__c value for this Zuora__ZInvoice__c.
     * 
     * @return zuora__Zuora_Id__c
     */
    public java.lang.String getZuora__Zuora_Id__c() {
        return zuora__Zuora_Id__c;
    }


    /**
     * Sets the zuora__Zuora_Id__c value for this Zuora__ZInvoice__c.
     * 
     * @param zuora__Zuora_Id__c
     */
    public void setZuora__Zuora_Id__c(java.lang.String zuora__Zuora_Id__c) {
        this.zuora__Zuora_Id__c = zuora__Zuora_Id__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Zuora__ZInvoice__c)) return false;
        Zuora__ZInvoice__c other = (Zuora__ZInvoice__c) obj;
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
            ((this.zuora__Account__c==null && other.getZuora__Account__c()==null) || 
             (this.zuora__Account__c!=null &&
              this.zuora__Account__c.equals(other.getZuora__Account__c()))) &&
            ((this.zuora__Account__r==null && other.getZuora__Account__r()==null) || 
             (this.zuora__Account__r!=null &&
              this.zuora__Account__r.equals(other.getZuora__Account__r()))) &&
            ((this.zuora__AdjustmentAmount__c==null && other.getZuora__AdjustmentAmount__c()==null) || 
             (this.zuora__AdjustmentAmount__c!=null &&
              this.zuora__AdjustmentAmount__c.equals(other.getZuora__AdjustmentAmount__c()))) &&
            ((this.zuora__Age_Bucket__c==null && other.getZuora__Age_Bucket__c()==null) || 
             (this.zuora__Age_Bucket__c!=null &&
              this.zuora__Age_Bucket__c.equals(other.getZuora__Age_Bucket__c()))) &&
            ((this.zuora__AmountWithoutTax__c==null && other.getZuora__AmountWithoutTax__c()==null) || 
             (this.zuora__AmountWithoutTax__c!=null &&
              this.zuora__AmountWithoutTax__c.equals(other.getZuora__AmountWithoutTax__c()))) &&
            ((this.zuora__Balance2__c==null && other.getZuora__Balance2__c()==null) || 
             (this.zuora__Balance2__c!=null &&
              this.zuora__Balance2__c.equals(other.getZuora__Balance2__c()))) &&
            ((this.zuora__Balance__c==null && other.getZuora__Balance__c()==null) || 
             (this.zuora__Balance__c!=null &&
              this.zuora__Balance__c.equals(other.getZuora__Balance__c()))) &&
            ((this.zuora__BillToId__c==null && other.getZuora__BillToId__c()==null) || 
             (this.zuora__BillToId__c!=null &&
              this.zuora__BillToId__c.equals(other.getZuora__BillToId__c()))) &&
            ((this.zuora__BillingAccount__c==null && other.getZuora__BillingAccount__c()==null) || 
             (this.zuora__BillingAccount__c!=null &&
              this.zuora__BillingAccount__c.equals(other.getZuora__BillingAccount__c()))) &&
            ((this.zuora__BillingAccount__r==null && other.getZuora__BillingAccount__r()==null) || 
             (this.zuora__BillingAccount__r!=null &&
              this.zuora__BillingAccount__r.equals(other.getZuora__BillingAccount__r()))) &&
            ((this.zuora__Description__c==null && other.getZuora__Description__c()==null) || 
             (this.zuora__Description__c!=null &&
              this.zuora__Description__c.equals(other.getZuora__Description__c()))) &&
            ((this.zuora__DueDate__c==null && other.getZuora__DueDate__c()==null) || 
             (this.zuora__DueDate__c!=null &&
              this.zuora__DueDate__c.equals(other.getZuora__DueDate__c()))) &&
            ((this.zuora__External_Id__c==null && other.getZuora__External_Id__c()==null) || 
             (this.zuora__External_Id__c!=null &&
              this.zuora__External_Id__c.equals(other.getZuora__External_Id__c()))) &&
            ((this.zuora__GeneratedDate__c==null && other.getZuora__GeneratedDate__c()==null) || 
             (this.zuora__GeneratedDate__c!=null &&
              this.zuora__GeneratedDate__c.equals(other.getZuora__GeneratedDate__c()))) &&
            ((this.zuora__InvoiceDate__c==null && other.getZuora__InvoiceDate__c()==null) || 
             (this.zuora__InvoiceDate__c!=null &&
              this.zuora__InvoiceDate__c.equals(other.getZuora__InvoiceDate__c()))) &&
            ((this.zuora__PaymentAmount__c==null && other.getZuora__PaymentAmount__c()==null) || 
             (this.zuora__PaymentAmount__c!=null &&
              this.zuora__PaymentAmount__c.equals(other.getZuora__PaymentAmount__c()))) &&
            ((this.zuora__PaymentInvoices__r==null && other.getZuora__PaymentInvoices__r()==null) || 
             (this.zuora__PaymentInvoices__r!=null &&
              this.zuora__PaymentInvoices__r.equals(other.getZuora__PaymentInvoices__r()))) &&
            ((this.zuora__PaymentTerm__c==null && other.getZuora__PaymentTerm__c()==null) || 
             (this.zuora__PaymentTerm__c!=null &&
              this.zuora__PaymentTerm__c.equals(other.getZuora__PaymentTerm__c()))) &&
            ((this.zuora__Payment_Term__c==null && other.getZuora__Payment_Term__c()==null) || 
             (this.zuora__Payment_Term__c!=null &&
              this.zuora__Payment_Term__c.equals(other.getZuora__Payment_Term__c()))) &&
            ((this.zuora__Payment_Term__r==null && other.getZuora__Payment_Term__r()==null) || 
             (this.zuora__Payment_Term__r!=null &&
              this.zuora__Payment_Term__r.equals(other.getZuora__Payment_Term__r()))) &&
            ((this.zuora__Payments__r==null && other.getZuora__Payments__r()==null) || 
             (this.zuora__Payments__r!=null &&
              this.zuora__Payments__r.equals(other.getZuora__Payments__r()))) &&
            ((this.zuora__PostedDate__c==null && other.getZuora__PostedDate__c()==null) || 
             (this.zuora__PostedDate__c!=null &&
              this.zuora__PostedDate__c.equals(other.getZuora__PostedDate__c()))) &&
            ((this.zuora__RefundedAmount__c==null && other.getZuora__RefundedAmount__c()==null) || 
             (this.zuora__RefundedAmount__c!=null &&
              this.zuora__RefundedAmount__c.equals(other.getZuora__RefundedAmount__c()))) &&
            ((this.zuora__SoldToId__c==null && other.getZuora__SoldToId__c()==null) || 
             (this.zuora__SoldToId__c!=null &&
              this.zuora__SoldToId__c.equals(other.getZuora__SoldToId__c()))) &&
            ((this.zuora__Status__c==null && other.getZuora__Status__c()==null) || 
             (this.zuora__Status__c!=null &&
              this.zuora__Status__c.equals(other.getZuora__Status__c()))) &&
            ((this.zuora__TargetDate__c==null && other.getZuora__TargetDate__c()==null) || 
             (this.zuora__TargetDate__c!=null &&
              this.zuora__TargetDate__c.equals(other.getZuora__TargetDate__c()))) &&
            ((this.zuora__TaxAmount__c==null && other.getZuora__TaxAmount__c()==null) || 
             (this.zuora__TaxAmount__c!=null &&
              this.zuora__TaxAmount__c.equals(other.getZuora__TaxAmount__c()))) &&
            ((this.zuora__TaxExemptAmount__c==null && other.getZuora__TaxExemptAmount__c()==null) || 
             (this.zuora__TaxExemptAmount__c!=null &&
              this.zuora__TaxExemptAmount__c.equals(other.getZuora__TaxExemptAmount__c()))) &&
            ((this.zuora__TotalAmount__c==null && other.getZuora__TotalAmount__c()==null) || 
             (this.zuora__TotalAmount__c!=null &&
              this.zuora__TotalAmount__c.equals(other.getZuora__TotalAmount__c()))) &&
            ((this.zuora__ZuoraId__c==null && other.getZuora__ZuoraId__c()==null) || 
             (this.zuora__ZuoraId__c!=null &&
              this.zuora__ZuoraId__c.equals(other.getZuora__ZuoraId__c()))) &&
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
        if (getZuora__Account__c() != null) {
            _hashCode += getZuora__Account__c().hashCode();
        }
        if (getZuora__Account__r() != null) {
            _hashCode += getZuora__Account__r().hashCode();
        }
        if (getZuora__AdjustmentAmount__c() != null) {
            _hashCode += getZuora__AdjustmentAmount__c().hashCode();
        }
        if (getZuora__Age_Bucket__c() != null) {
            _hashCode += getZuora__Age_Bucket__c().hashCode();
        }
        if (getZuora__AmountWithoutTax__c() != null) {
            _hashCode += getZuora__AmountWithoutTax__c().hashCode();
        }
        if (getZuora__Balance2__c() != null) {
            _hashCode += getZuora__Balance2__c().hashCode();
        }
        if (getZuora__Balance__c() != null) {
            _hashCode += getZuora__Balance__c().hashCode();
        }
        if (getZuora__BillToId__c() != null) {
            _hashCode += getZuora__BillToId__c().hashCode();
        }
        if (getZuora__BillingAccount__c() != null) {
            _hashCode += getZuora__BillingAccount__c().hashCode();
        }
        if (getZuora__BillingAccount__r() != null) {
            _hashCode += getZuora__BillingAccount__r().hashCode();
        }
        if (getZuora__Description__c() != null) {
            _hashCode += getZuora__Description__c().hashCode();
        }
        if (getZuora__DueDate__c() != null) {
            _hashCode += getZuora__DueDate__c().hashCode();
        }
        if (getZuora__External_Id__c() != null) {
            _hashCode += getZuora__External_Id__c().hashCode();
        }
        if (getZuora__GeneratedDate__c() != null) {
            _hashCode += getZuora__GeneratedDate__c().hashCode();
        }
        if (getZuora__InvoiceDate__c() != null) {
            _hashCode += getZuora__InvoiceDate__c().hashCode();
        }
        if (getZuora__PaymentAmount__c() != null) {
            _hashCode += getZuora__PaymentAmount__c().hashCode();
        }
        if (getZuora__PaymentInvoices__r() != null) {
            _hashCode += getZuora__PaymentInvoices__r().hashCode();
        }
        if (getZuora__PaymentTerm__c() != null) {
            _hashCode += getZuora__PaymentTerm__c().hashCode();
        }
        if (getZuora__Payment_Term__c() != null) {
            _hashCode += getZuora__Payment_Term__c().hashCode();
        }
        if (getZuora__Payment_Term__r() != null) {
            _hashCode += getZuora__Payment_Term__r().hashCode();
        }
        if (getZuora__Payments__r() != null) {
            _hashCode += getZuora__Payments__r().hashCode();
        }
        if (getZuora__PostedDate__c() != null) {
            _hashCode += getZuora__PostedDate__c().hashCode();
        }
        if (getZuora__RefundedAmount__c() != null) {
            _hashCode += getZuora__RefundedAmount__c().hashCode();
        }
        if (getZuora__SoldToId__c() != null) {
            _hashCode += getZuora__SoldToId__c().hashCode();
        }
        if (getZuora__Status__c() != null) {
            _hashCode += getZuora__Status__c().hashCode();
        }
        if (getZuora__TargetDate__c() != null) {
            _hashCode += getZuora__TargetDate__c().hashCode();
        }
        if (getZuora__TaxAmount__c() != null) {
            _hashCode += getZuora__TaxAmount__c().hashCode();
        }
        if (getZuora__TaxExemptAmount__c() != null) {
            _hashCode += getZuora__TaxExemptAmount__c().hashCode();
        }
        if (getZuora__TotalAmount__c() != null) {
            _hashCode += getZuora__TotalAmount__c().hashCode();
        }
        if (getZuora__ZuoraId__c() != null) {
            _hashCode += getZuora__ZuoraId__c().hashCode();
        }
        if (getZuora__Zuora_Id__c() != null) {
            _hashCode += getZuora__Zuora_Id__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Zuora__ZInvoice__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__ZInvoice__c"));
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
        elemField.setFieldName("zuora__AdjustmentAmount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__AdjustmentAmount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__Age_Bucket__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Age_Bucket__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__AmountWithoutTax__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__AmountWithoutTax__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__Balance2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Balance2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__Balance__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Balance__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__BillToId__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__BillToId__c"));
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
        elemField.setFieldName("zuora__Description__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Description__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__DueDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__DueDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("zuora__GeneratedDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__GeneratedDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__InvoiceDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__InvoiceDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__PaymentAmount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__PaymentAmount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("zuora__PaymentTerm__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__PaymentTerm__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__Payment_Term__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Payment_Term__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__Payment_Term__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Payment_Term__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__PaymentTerm__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__Payments__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Payments__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__PostedDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__PostedDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("zuora__SoldToId__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__SoldToId__c"));
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
        elemField.setFieldName("zuora__TargetDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__TargetDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__TaxAmount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__TaxAmount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__TaxExemptAmount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__TaxExemptAmount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__TotalAmount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__TotalAmount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__ZuoraId__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__ZuoraId__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
