/**
 * Zqu__ZuoraConfig__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Zqu__ZuoraConfig__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
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

    private java.util.Calendar lastReferencedDate;

    private java.util.Calendar lastViewedDate;

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

    private java.lang.String zqu__APIPassword__c;

    private java.lang.String zqu__APIURL__c;

    private java.lang.String zqu__APIUsername__c;

    private java.lang.Boolean zqu__Active__c;

    private java.lang.Boolean zqu__AllowUpdateBillCycleDay__c;

    private java.lang.Boolean zqu__AllowUpdatingZuora__c;

    private java.lang.String zqu__BaseURL__c;

    private java.lang.String zqu__BillingAccount_AllowInvoiceEdit__c;

    private java.lang.String zqu__BillingAccount_Batch__c;

    private java.lang.String zqu__BillingAccount_BillCycleDay__c;

    private java.lang.String zqu__Currency__c;

    private java.lang.String zqu__DateFormatInput__c;

    private java.lang.Boolean zqu__Debug__c;

    private java.lang.Boolean zqu__EnableAmendmentsDEV__c;

    private java.lang.String zqu__InvoiceDeliveryPreferences__c;

    private java.lang.Boolean zqu__MatchContractEffectiveDate__c;

    private java.lang.Double zqu__MaxAPIQueryFilter__c;

    private com.sforce.soap.enterprise.QueryResult zqu__Opportunities__r;

    private java.lang.String zqu__PaymentTerm__c;

    private java.lang.String zqu__ProductSelectorVersion__c;

    private java.lang.Boolean zqu__QuoteReadOnly__c;

    private java.lang.String zqu__QuoteURL__c;

    private com.sforce.soap.enterprise.QueryResult zqu__Quote__r;

    private java.lang.Boolean zqu__SubscriptionAutorenewDefault__c;

    private java.lang.String zqu__Template_Id__c;

    public Zqu__ZuoraConfig__c() {
    }

    public Zqu__ZuoraConfig__c(
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
           java.util.Calendar lastReferencedDate,
           java.util.Calendar lastViewedDate,
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
           java.lang.String zqu__APIPassword__c,
           java.lang.String zqu__APIURL__c,
           java.lang.String zqu__APIUsername__c,
           java.lang.Boolean zqu__Active__c,
           java.lang.Boolean zqu__AllowUpdateBillCycleDay__c,
           java.lang.Boolean zqu__AllowUpdatingZuora__c,
           java.lang.String zqu__BaseURL__c,
           java.lang.String zqu__BillingAccount_AllowInvoiceEdit__c,
           java.lang.String zqu__BillingAccount_Batch__c,
           java.lang.String zqu__BillingAccount_BillCycleDay__c,
           java.lang.String zqu__Currency__c,
           java.lang.String zqu__DateFormatInput__c,
           java.lang.Boolean zqu__Debug__c,
           java.lang.Boolean zqu__EnableAmendmentsDEV__c,
           java.lang.String zqu__InvoiceDeliveryPreferences__c,
           java.lang.Boolean zqu__MatchContractEffectiveDate__c,
           java.lang.Double zqu__MaxAPIQueryFilter__c,
           com.sforce.soap.enterprise.QueryResult zqu__Opportunities__r,
           java.lang.String zqu__PaymentTerm__c,
           java.lang.String zqu__ProductSelectorVersion__c,
           java.lang.Boolean zqu__QuoteReadOnly__c,
           java.lang.String zqu__QuoteURL__c,
           com.sforce.soap.enterprise.QueryResult zqu__Quote__r,
           java.lang.Boolean zqu__SubscriptionAutorenewDefault__c,
           java.lang.String zqu__Template_Id__c) {
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
        this.lastReferencedDate = lastReferencedDate;
        this.lastViewedDate = lastViewedDate;
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
        this.zqu__APIPassword__c = zqu__APIPassword__c;
        this.zqu__APIURL__c = zqu__APIURL__c;
        this.zqu__APIUsername__c = zqu__APIUsername__c;
        this.zqu__Active__c = zqu__Active__c;
        this.zqu__AllowUpdateBillCycleDay__c = zqu__AllowUpdateBillCycleDay__c;
        this.zqu__AllowUpdatingZuora__c = zqu__AllowUpdatingZuora__c;
        this.zqu__BaseURL__c = zqu__BaseURL__c;
        this.zqu__BillingAccount_AllowInvoiceEdit__c = zqu__BillingAccount_AllowInvoiceEdit__c;
        this.zqu__BillingAccount_Batch__c = zqu__BillingAccount_Batch__c;
        this.zqu__BillingAccount_BillCycleDay__c = zqu__BillingAccount_BillCycleDay__c;
        this.zqu__Currency__c = zqu__Currency__c;
        this.zqu__DateFormatInput__c = zqu__DateFormatInput__c;
        this.zqu__Debug__c = zqu__Debug__c;
        this.zqu__EnableAmendmentsDEV__c = zqu__EnableAmendmentsDEV__c;
        this.zqu__InvoiceDeliveryPreferences__c = zqu__InvoiceDeliveryPreferences__c;
        this.zqu__MatchContractEffectiveDate__c = zqu__MatchContractEffectiveDate__c;
        this.zqu__MaxAPIQueryFilter__c = zqu__MaxAPIQueryFilter__c;
        this.zqu__Opportunities__r = zqu__Opportunities__r;
        this.zqu__PaymentTerm__c = zqu__PaymentTerm__c;
        this.zqu__ProductSelectorVersion__c = zqu__ProductSelectorVersion__c;
        this.zqu__QuoteReadOnly__c = zqu__QuoteReadOnly__c;
        this.zqu__QuoteURL__c = zqu__QuoteURL__c;
        this.zqu__Quote__r = zqu__Quote__r;
        this.zqu__SubscriptionAutorenewDefault__c = zqu__SubscriptionAutorenewDefault__c;
        this.zqu__Template_Id__c = zqu__Template_Id__c;
    }


    /**
     * Gets the attachedContentDocuments value for this Zqu__ZuoraConfig__c.
     * 
     * @return attachedContentDocuments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachedContentDocuments() {
        return attachedContentDocuments;
    }


    /**
     * Sets the attachedContentDocuments value for this Zqu__ZuoraConfig__c.
     * 
     * @param attachedContentDocuments
     */
    public void setAttachedContentDocuments(com.sforce.soap.enterprise.QueryResult attachedContentDocuments) {
        this.attachedContentDocuments = attachedContentDocuments;
    }


    /**
     * Gets the attachments value for this Zqu__ZuoraConfig__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Zqu__ZuoraConfig__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the combinedAttachments value for this Zqu__ZuoraConfig__c.
     * 
     * @return combinedAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getCombinedAttachments() {
        return combinedAttachments;
    }


    /**
     * Sets the combinedAttachments value for this Zqu__ZuoraConfig__c.
     * 
     * @param combinedAttachments
     */
    public void setCombinedAttachments(com.sforce.soap.enterprise.QueryResult combinedAttachments) {
        this.combinedAttachments = combinedAttachments;
    }


    /**
     * Gets the createdBy value for this Zqu__ZuoraConfig__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Zqu__ZuoraConfig__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Zqu__ZuoraConfig__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Zqu__ZuoraConfig__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Zqu__ZuoraConfig__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Zqu__ZuoraConfig__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the duplicateRecordItems value for this Zqu__ZuoraConfig__c.
     * 
     * @return duplicateRecordItems
     */
    public com.sforce.soap.enterprise.QueryResult getDuplicateRecordItems() {
        return duplicateRecordItems;
    }


    /**
     * Sets the duplicateRecordItems value for this Zqu__ZuoraConfig__c.
     * 
     * @param duplicateRecordItems
     */
    public void setDuplicateRecordItems(com.sforce.soap.enterprise.QueryResult duplicateRecordItems) {
        this.duplicateRecordItems = duplicateRecordItems;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Zqu__ZuoraConfig__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Zqu__ZuoraConfig__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the isDeleted value for this Zqu__ZuoraConfig__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Zqu__ZuoraConfig__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this Zqu__ZuoraConfig__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Zqu__ZuoraConfig__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Zqu__ZuoraConfig__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Zqu__ZuoraConfig__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Zqu__ZuoraConfig__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Zqu__ZuoraConfig__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lastReferencedDate value for this Zqu__ZuoraConfig__c.
     * 
     * @return lastReferencedDate
     */
    public java.util.Calendar getLastReferencedDate() {
        return lastReferencedDate;
    }


    /**
     * Sets the lastReferencedDate value for this Zqu__ZuoraConfig__c.
     * 
     * @param lastReferencedDate
     */
    public void setLastReferencedDate(java.util.Calendar lastReferencedDate) {
        this.lastReferencedDate = lastReferencedDate;
    }


    /**
     * Gets the lastViewedDate value for this Zqu__ZuoraConfig__c.
     * 
     * @return lastViewedDate
     */
    public java.util.Calendar getLastViewedDate() {
        return lastViewedDate;
    }


    /**
     * Sets the lastViewedDate value for this Zqu__ZuoraConfig__c.
     * 
     * @param lastViewedDate
     */
    public void setLastViewedDate(java.util.Calendar lastViewedDate) {
        this.lastViewedDate = lastViewedDate;
    }


    /**
     * Gets the lookedUpFromActivities value for this Zqu__ZuoraConfig__c.
     * 
     * @return lookedUpFromActivities
     */
    public com.sforce.soap.enterprise.QueryResult getLookedUpFromActivities() {
        return lookedUpFromActivities;
    }


    /**
     * Sets the lookedUpFromActivities value for this Zqu__ZuoraConfig__c.
     * 
     * @param lookedUpFromActivities
     */
    public void setLookedUpFromActivities(com.sforce.soap.enterprise.QueryResult lookedUpFromActivities) {
        this.lookedUpFromActivities = lookedUpFromActivities;
    }


    /**
     * Gets the name value for this Zqu__ZuoraConfig__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Zqu__ZuoraConfig__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Zqu__ZuoraConfig__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Zqu__ZuoraConfig__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Zqu__ZuoraConfig__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Zqu__ZuoraConfig__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the owner value for this Zqu__ZuoraConfig__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.SObject getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Zqu__ZuoraConfig__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.SObject owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Zqu__ZuoraConfig__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Zqu__ZuoraConfig__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the processInstances value for this Zqu__ZuoraConfig__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Zqu__ZuoraConfig__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Zqu__ZuoraConfig__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Zqu__ZuoraConfig__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the recordAssociatedGroups value for this Zqu__ZuoraConfig__c.
     * 
     * @return recordAssociatedGroups
     */
    public com.sforce.soap.enterprise.QueryResult getRecordAssociatedGroups() {
        return recordAssociatedGroups;
    }


    /**
     * Sets the recordAssociatedGroups value for this Zqu__ZuoraConfig__c.
     * 
     * @param recordAssociatedGroups
     */
    public void setRecordAssociatedGroups(com.sforce.soap.enterprise.QueryResult recordAssociatedGroups) {
        this.recordAssociatedGroups = recordAssociatedGroups;
    }


    /**
     * Gets the systemModstamp value for this Zqu__ZuoraConfig__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Zqu__ZuoraConfig__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the topicAssignments value for this Zqu__ZuoraConfig__c.
     * 
     * @return topicAssignments
     */
    public com.sforce.soap.enterprise.QueryResult getTopicAssignments() {
        return topicAssignments;
    }


    /**
     * Sets the topicAssignments value for this Zqu__ZuoraConfig__c.
     * 
     * @param topicAssignments
     */
    public void setTopicAssignments(com.sforce.soap.enterprise.QueryResult topicAssignments) {
        this.topicAssignments = topicAssignments;
    }


    /**
     * Gets the userRecordAccess value for this Zqu__ZuoraConfig__c.
     * 
     * @return userRecordAccess
     */
    public com.sforce.soap.enterprise.sobject.UserRecordAccess getUserRecordAccess() {
        return userRecordAccess;
    }


    /**
     * Sets the userRecordAccess value for this Zqu__ZuoraConfig__c.
     * 
     * @param userRecordAccess
     */
    public void setUserRecordAccess(com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess) {
        this.userRecordAccess = userRecordAccess;
    }


    /**
     * Gets the zqu__APIPassword__c value for this Zqu__ZuoraConfig__c.
     * 
     * @return zqu__APIPassword__c
     */
    public java.lang.String getZqu__APIPassword__c() {
        return zqu__APIPassword__c;
    }


    /**
     * Sets the zqu__APIPassword__c value for this Zqu__ZuoraConfig__c.
     * 
     * @param zqu__APIPassword__c
     */
    public void setZqu__APIPassword__c(java.lang.String zqu__APIPassword__c) {
        this.zqu__APIPassword__c = zqu__APIPassword__c;
    }


    /**
     * Gets the zqu__APIURL__c value for this Zqu__ZuoraConfig__c.
     * 
     * @return zqu__APIURL__c
     */
    public java.lang.String getZqu__APIURL__c() {
        return zqu__APIURL__c;
    }


    /**
     * Sets the zqu__APIURL__c value for this Zqu__ZuoraConfig__c.
     * 
     * @param zqu__APIURL__c
     */
    public void setZqu__APIURL__c(java.lang.String zqu__APIURL__c) {
        this.zqu__APIURL__c = zqu__APIURL__c;
    }


    /**
     * Gets the zqu__APIUsername__c value for this Zqu__ZuoraConfig__c.
     * 
     * @return zqu__APIUsername__c
     */
    public java.lang.String getZqu__APIUsername__c() {
        return zqu__APIUsername__c;
    }


    /**
     * Sets the zqu__APIUsername__c value for this Zqu__ZuoraConfig__c.
     * 
     * @param zqu__APIUsername__c
     */
    public void setZqu__APIUsername__c(java.lang.String zqu__APIUsername__c) {
        this.zqu__APIUsername__c = zqu__APIUsername__c;
    }


    /**
     * Gets the zqu__Active__c value for this Zqu__ZuoraConfig__c.
     * 
     * @return zqu__Active__c
     */
    public java.lang.Boolean getZqu__Active__c() {
        return zqu__Active__c;
    }


    /**
     * Sets the zqu__Active__c value for this Zqu__ZuoraConfig__c.
     * 
     * @param zqu__Active__c
     */
    public void setZqu__Active__c(java.lang.Boolean zqu__Active__c) {
        this.zqu__Active__c = zqu__Active__c;
    }


    /**
     * Gets the zqu__AllowUpdateBillCycleDay__c value for this Zqu__ZuoraConfig__c.
     * 
     * @return zqu__AllowUpdateBillCycleDay__c
     */
    public java.lang.Boolean getZqu__AllowUpdateBillCycleDay__c() {
        return zqu__AllowUpdateBillCycleDay__c;
    }


    /**
     * Sets the zqu__AllowUpdateBillCycleDay__c value for this Zqu__ZuoraConfig__c.
     * 
     * @param zqu__AllowUpdateBillCycleDay__c
     */
    public void setZqu__AllowUpdateBillCycleDay__c(java.lang.Boolean zqu__AllowUpdateBillCycleDay__c) {
        this.zqu__AllowUpdateBillCycleDay__c = zqu__AllowUpdateBillCycleDay__c;
    }


    /**
     * Gets the zqu__AllowUpdatingZuora__c value for this Zqu__ZuoraConfig__c.
     * 
     * @return zqu__AllowUpdatingZuora__c
     */
    public java.lang.Boolean getZqu__AllowUpdatingZuora__c() {
        return zqu__AllowUpdatingZuora__c;
    }


    /**
     * Sets the zqu__AllowUpdatingZuora__c value for this Zqu__ZuoraConfig__c.
     * 
     * @param zqu__AllowUpdatingZuora__c
     */
    public void setZqu__AllowUpdatingZuora__c(java.lang.Boolean zqu__AllowUpdatingZuora__c) {
        this.zqu__AllowUpdatingZuora__c = zqu__AllowUpdatingZuora__c;
    }


    /**
     * Gets the zqu__BaseURL__c value for this Zqu__ZuoraConfig__c.
     * 
     * @return zqu__BaseURL__c
     */
    public java.lang.String getZqu__BaseURL__c() {
        return zqu__BaseURL__c;
    }


    /**
     * Sets the zqu__BaseURL__c value for this Zqu__ZuoraConfig__c.
     * 
     * @param zqu__BaseURL__c
     */
    public void setZqu__BaseURL__c(java.lang.String zqu__BaseURL__c) {
        this.zqu__BaseURL__c = zqu__BaseURL__c;
    }


    /**
     * Gets the zqu__BillingAccount_AllowInvoiceEdit__c value for this Zqu__ZuoraConfig__c.
     * 
     * @return zqu__BillingAccount_AllowInvoiceEdit__c
     */
    public java.lang.String getZqu__BillingAccount_AllowInvoiceEdit__c() {
        return zqu__BillingAccount_AllowInvoiceEdit__c;
    }


    /**
     * Sets the zqu__BillingAccount_AllowInvoiceEdit__c value for this Zqu__ZuoraConfig__c.
     * 
     * @param zqu__BillingAccount_AllowInvoiceEdit__c
     */
    public void setZqu__BillingAccount_AllowInvoiceEdit__c(java.lang.String zqu__BillingAccount_AllowInvoiceEdit__c) {
        this.zqu__BillingAccount_AllowInvoiceEdit__c = zqu__BillingAccount_AllowInvoiceEdit__c;
    }


    /**
     * Gets the zqu__BillingAccount_Batch__c value for this Zqu__ZuoraConfig__c.
     * 
     * @return zqu__BillingAccount_Batch__c
     */
    public java.lang.String getZqu__BillingAccount_Batch__c() {
        return zqu__BillingAccount_Batch__c;
    }


    /**
     * Sets the zqu__BillingAccount_Batch__c value for this Zqu__ZuoraConfig__c.
     * 
     * @param zqu__BillingAccount_Batch__c
     */
    public void setZqu__BillingAccount_Batch__c(java.lang.String zqu__BillingAccount_Batch__c) {
        this.zqu__BillingAccount_Batch__c = zqu__BillingAccount_Batch__c;
    }


    /**
     * Gets the zqu__BillingAccount_BillCycleDay__c value for this Zqu__ZuoraConfig__c.
     * 
     * @return zqu__BillingAccount_BillCycleDay__c
     */
    public java.lang.String getZqu__BillingAccount_BillCycleDay__c() {
        return zqu__BillingAccount_BillCycleDay__c;
    }


    /**
     * Sets the zqu__BillingAccount_BillCycleDay__c value for this Zqu__ZuoraConfig__c.
     * 
     * @param zqu__BillingAccount_BillCycleDay__c
     */
    public void setZqu__BillingAccount_BillCycleDay__c(java.lang.String zqu__BillingAccount_BillCycleDay__c) {
        this.zqu__BillingAccount_BillCycleDay__c = zqu__BillingAccount_BillCycleDay__c;
    }


    /**
     * Gets the zqu__Currency__c value for this Zqu__ZuoraConfig__c.
     * 
     * @return zqu__Currency__c
     */
    public java.lang.String getZqu__Currency__c() {
        return zqu__Currency__c;
    }


    /**
     * Sets the zqu__Currency__c value for this Zqu__ZuoraConfig__c.
     * 
     * @param zqu__Currency__c
     */
    public void setZqu__Currency__c(java.lang.String zqu__Currency__c) {
        this.zqu__Currency__c = zqu__Currency__c;
    }


    /**
     * Gets the zqu__DateFormatInput__c value for this Zqu__ZuoraConfig__c.
     * 
     * @return zqu__DateFormatInput__c
     */
    public java.lang.String getZqu__DateFormatInput__c() {
        return zqu__DateFormatInput__c;
    }


    /**
     * Sets the zqu__DateFormatInput__c value for this Zqu__ZuoraConfig__c.
     * 
     * @param zqu__DateFormatInput__c
     */
    public void setZqu__DateFormatInput__c(java.lang.String zqu__DateFormatInput__c) {
        this.zqu__DateFormatInput__c = zqu__DateFormatInput__c;
    }


    /**
     * Gets the zqu__Debug__c value for this Zqu__ZuoraConfig__c.
     * 
     * @return zqu__Debug__c
     */
    public java.lang.Boolean getZqu__Debug__c() {
        return zqu__Debug__c;
    }


    /**
     * Sets the zqu__Debug__c value for this Zqu__ZuoraConfig__c.
     * 
     * @param zqu__Debug__c
     */
    public void setZqu__Debug__c(java.lang.Boolean zqu__Debug__c) {
        this.zqu__Debug__c = zqu__Debug__c;
    }


    /**
     * Gets the zqu__EnableAmendmentsDEV__c value for this Zqu__ZuoraConfig__c.
     * 
     * @return zqu__EnableAmendmentsDEV__c
     */
    public java.lang.Boolean getZqu__EnableAmendmentsDEV__c() {
        return zqu__EnableAmendmentsDEV__c;
    }


    /**
     * Sets the zqu__EnableAmendmentsDEV__c value for this Zqu__ZuoraConfig__c.
     * 
     * @param zqu__EnableAmendmentsDEV__c
     */
    public void setZqu__EnableAmendmentsDEV__c(java.lang.Boolean zqu__EnableAmendmentsDEV__c) {
        this.zqu__EnableAmendmentsDEV__c = zqu__EnableAmendmentsDEV__c;
    }


    /**
     * Gets the zqu__InvoiceDeliveryPreferences__c value for this Zqu__ZuoraConfig__c.
     * 
     * @return zqu__InvoiceDeliveryPreferences__c
     */
    public java.lang.String getZqu__InvoiceDeliveryPreferences__c() {
        return zqu__InvoiceDeliveryPreferences__c;
    }


    /**
     * Sets the zqu__InvoiceDeliveryPreferences__c value for this Zqu__ZuoraConfig__c.
     * 
     * @param zqu__InvoiceDeliveryPreferences__c
     */
    public void setZqu__InvoiceDeliveryPreferences__c(java.lang.String zqu__InvoiceDeliveryPreferences__c) {
        this.zqu__InvoiceDeliveryPreferences__c = zqu__InvoiceDeliveryPreferences__c;
    }


    /**
     * Gets the zqu__MatchContractEffectiveDate__c value for this Zqu__ZuoraConfig__c.
     * 
     * @return zqu__MatchContractEffectiveDate__c
     */
    public java.lang.Boolean getZqu__MatchContractEffectiveDate__c() {
        return zqu__MatchContractEffectiveDate__c;
    }


    /**
     * Sets the zqu__MatchContractEffectiveDate__c value for this Zqu__ZuoraConfig__c.
     * 
     * @param zqu__MatchContractEffectiveDate__c
     */
    public void setZqu__MatchContractEffectiveDate__c(java.lang.Boolean zqu__MatchContractEffectiveDate__c) {
        this.zqu__MatchContractEffectiveDate__c = zqu__MatchContractEffectiveDate__c;
    }


    /**
     * Gets the zqu__MaxAPIQueryFilter__c value for this Zqu__ZuoraConfig__c.
     * 
     * @return zqu__MaxAPIQueryFilter__c
     */
    public java.lang.Double getZqu__MaxAPIQueryFilter__c() {
        return zqu__MaxAPIQueryFilter__c;
    }


    /**
     * Sets the zqu__MaxAPIQueryFilter__c value for this Zqu__ZuoraConfig__c.
     * 
     * @param zqu__MaxAPIQueryFilter__c
     */
    public void setZqu__MaxAPIQueryFilter__c(java.lang.Double zqu__MaxAPIQueryFilter__c) {
        this.zqu__MaxAPIQueryFilter__c = zqu__MaxAPIQueryFilter__c;
    }


    /**
     * Gets the zqu__Opportunities__r value for this Zqu__ZuoraConfig__c.
     * 
     * @return zqu__Opportunities__r
     */
    public com.sforce.soap.enterprise.QueryResult getZqu__Opportunities__r() {
        return zqu__Opportunities__r;
    }


    /**
     * Sets the zqu__Opportunities__r value for this Zqu__ZuoraConfig__c.
     * 
     * @param zqu__Opportunities__r
     */
    public void setZqu__Opportunities__r(com.sforce.soap.enterprise.QueryResult zqu__Opportunities__r) {
        this.zqu__Opportunities__r = zqu__Opportunities__r;
    }


    /**
     * Gets the zqu__PaymentTerm__c value for this Zqu__ZuoraConfig__c.
     * 
     * @return zqu__PaymentTerm__c
     */
    public java.lang.String getZqu__PaymentTerm__c() {
        return zqu__PaymentTerm__c;
    }


    /**
     * Sets the zqu__PaymentTerm__c value for this Zqu__ZuoraConfig__c.
     * 
     * @param zqu__PaymentTerm__c
     */
    public void setZqu__PaymentTerm__c(java.lang.String zqu__PaymentTerm__c) {
        this.zqu__PaymentTerm__c = zqu__PaymentTerm__c;
    }


    /**
     * Gets the zqu__ProductSelectorVersion__c value for this Zqu__ZuoraConfig__c.
     * 
     * @return zqu__ProductSelectorVersion__c
     */
    public java.lang.String getZqu__ProductSelectorVersion__c() {
        return zqu__ProductSelectorVersion__c;
    }


    /**
     * Sets the zqu__ProductSelectorVersion__c value for this Zqu__ZuoraConfig__c.
     * 
     * @param zqu__ProductSelectorVersion__c
     */
    public void setZqu__ProductSelectorVersion__c(java.lang.String zqu__ProductSelectorVersion__c) {
        this.zqu__ProductSelectorVersion__c = zqu__ProductSelectorVersion__c;
    }


    /**
     * Gets the zqu__QuoteReadOnly__c value for this Zqu__ZuoraConfig__c.
     * 
     * @return zqu__QuoteReadOnly__c
     */
    public java.lang.Boolean getZqu__QuoteReadOnly__c() {
        return zqu__QuoteReadOnly__c;
    }


    /**
     * Sets the zqu__QuoteReadOnly__c value for this Zqu__ZuoraConfig__c.
     * 
     * @param zqu__QuoteReadOnly__c
     */
    public void setZqu__QuoteReadOnly__c(java.lang.Boolean zqu__QuoteReadOnly__c) {
        this.zqu__QuoteReadOnly__c = zqu__QuoteReadOnly__c;
    }


    /**
     * Gets the zqu__QuoteURL__c value for this Zqu__ZuoraConfig__c.
     * 
     * @return zqu__QuoteURL__c
     */
    public java.lang.String getZqu__QuoteURL__c() {
        return zqu__QuoteURL__c;
    }


    /**
     * Sets the zqu__QuoteURL__c value for this Zqu__ZuoraConfig__c.
     * 
     * @param zqu__QuoteURL__c
     */
    public void setZqu__QuoteURL__c(java.lang.String zqu__QuoteURL__c) {
        this.zqu__QuoteURL__c = zqu__QuoteURL__c;
    }


    /**
     * Gets the zqu__Quote__r value for this Zqu__ZuoraConfig__c.
     * 
     * @return zqu__Quote__r
     */
    public com.sforce.soap.enterprise.QueryResult getZqu__Quote__r() {
        return zqu__Quote__r;
    }


    /**
     * Sets the zqu__Quote__r value for this Zqu__ZuoraConfig__c.
     * 
     * @param zqu__Quote__r
     */
    public void setZqu__Quote__r(com.sforce.soap.enterprise.QueryResult zqu__Quote__r) {
        this.zqu__Quote__r = zqu__Quote__r;
    }


    /**
     * Gets the zqu__SubscriptionAutorenewDefault__c value for this Zqu__ZuoraConfig__c.
     * 
     * @return zqu__SubscriptionAutorenewDefault__c
     */
    public java.lang.Boolean getZqu__SubscriptionAutorenewDefault__c() {
        return zqu__SubscriptionAutorenewDefault__c;
    }


    /**
     * Sets the zqu__SubscriptionAutorenewDefault__c value for this Zqu__ZuoraConfig__c.
     * 
     * @param zqu__SubscriptionAutorenewDefault__c
     */
    public void setZqu__SubscriptionAutorenewDefault__c(java.lang.Boolean zqu__SubscriptionAutorenewDefault__c) {
        this.zqu__SubscriptionAutorenewDefault__c = zqu__SubscriptionAutorenewDefault__c;
    }


    /**
     * Gets the zqu__Template_Id__c value for this Zqu__ZuoraConfig__c.
     * 
     * @return zqu__Template_Id__c
     */
    public java.lang.String getZqu__Template_Id__c() {
        return zqu__Template_Id__c;
    }


    /**
     * Sets the zqu__Template_Id__c value for this Zqu__ZuoraConfig__c.
     * 
     * @param zqu__Template_Id__c
     */
    public void setZqu__Template_Id__c(java.lang.String zqu__Template_Id__c) {
        this.zqu__Template_Id__c = zqu__Template_Id__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Zqu__ZuoraConfig__c)) return false;
        Zqu__ZuoraConfig__c other = (Zqu__ZuoraConfig__c) obj;
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
            ((this.lastReferencedDate==null && other.getLastReferencedDate()==null) || 
             (this.lastReferencedDate!=null &&
              this.lastReferencedDate.equals(other.getLastReferencedDate()))) &&
            ((this.lastViewedDate==null && other.getLastViewedDate()==null) || 
             (this.lastViewedDate!=null &&
              this.lastViewedDate.equals(other.getLastViewedDate()))) &&
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
            ((this.zqu__APIPassword__c==null && other.getZqu__APIPassword__c()==null) || 
             (this.zqu__APIPassword__c!=null &&
              this.zqu__APIPassword__c.equals(other.getZqu__APIPassword__c()))) &&
            ((this.zqu__APIURL__c==null && other.getZqu__APIURL__c()==null) || 
             (this.zqu__APIURL__c!=null &&
              this.zqu__APIURL__c.equals(other.getZqu__APIURL__c()))) &&
            ((this.zqu__APIUsername__c==null && other.getZqu__APIUsername__c()==null) || 
             (this.zqu__APIUsername__c!=null &&
              this.zqu__APIUsername__c.equals(other.getZqu__APIUsername__c()))) &&
            ((this.zqu__Active__c==null && other.getZqu__Active__c()==null) || 
             (this.zqu__Active__c!=null &&
              this.zqu__Active__c.equals(other.getZqu__Active__c()))) &&
            ((this.zqu__AllowUpdateBillCycleDay__c==null && other.getZqu__AllowUpdateBillCycleDay__c()==null) || 
             (this.zqu__AllowUpdateBillCycleDay__c!=null &&
              this.zqu__AllowUpdateBillCycleDay__c.equals(other.getZqu__AllowUpdateBillCycleDay__c()))) &&
            ((this.zqu__AllowUpdatingZuora__c==null && other.getZqu__AllowUpdatingZuora__c()==null) || 
             (this.zqu__AllowUpdatingZuora__c!=null &&
              this.zqu__AllowUpdatingZuora__c.equals(other.getZqu__AllowUpdatingZuora__c()))) &&
            ((this.zqu__BaseURL__c==null && other.getZqu__BaseURL__c()==null) || 
             (this.zqu__BaseURL__c!=null &&
              this.zqu__BaseURL__c.equals(other.getZqu__BaseURL__c()))) &&
            ((this.zqu__BillingAccount_AllowInvoiceEdit__c==null && other.getZqu__BillingAccount_AllowInvoiceEdit__c()==null) || 
             (this.zqu__BillingAccount_AllowInvoiceEdit__c!=null &&
              this.zqu__BillingAccount_AllowInvoiceEdit__c.equals(other.getZqu__BillingAccount_AllowInvoiceEdit__c()))) &&
            ((this.zqu__BillingAccount_Batch__c==null && other.getZqu__BillingAccount_Batch__c()==null) || 
             (this.zqu__BillingAccount_Batch__c!=null &&
              this.zqu__BillingAccount_Batch__c.equals(other.getZqu__BillingAccount_Batch__c()))) &&
            ((this.zqu__BillingAccount_BillCycleDay__c==null && other.getZqu__BillingAccount_BillCycleDay__c()==null) || 
             (this.zqu__BillingAccount_BillCycleDay__c!=null &&
              this.zqu__BillingAccount_BillCycleDay__c.equals(other.getZqu__BillingAccount_BillCycleDay__c()))) &&
            ((this.zqu__Currency__c==null && other.getZqu__Currency__c()==null) || 
             (this.zqu__Currency__c!=null &&
              this.zqu__Currency__c.equals(other.getZqu__Currency__c()))) &&
            ((this.zqu__DateFormatInput__c==null && other.getZqu__DateFormatInput__c()==null) || 
             (this.zqu__DateFormatInput__c!=null &&
              this.zqu__DateFormatInput__c.equals(other.getZqu__DateFormatInput__c()))) &&
            ((this.zqu__Debug__c==null && other.getZqu__Debug__c()==null) || 
             (this.zqu__Debug__c!=null &&
              this.zqu__Debug__c.equals(other.getZqu__Debug__c()))) &&
            ((this.zqu__EnableAmendmentsDEV__c==null && other.getZqu__EnableAmendmentsDEV__c()==null) || 
             (this.zqu__EnableAmendmentsDEV__c!=null &&
              this.zqu__EnableAmendmentsDEV__c.equals(other.getZqu__EnableAmendmentsDEV__c()))) &&
            ((this.zqu__InvoiceDeliveryPreferences__c==null && other.getZqu__InvoiceDeliveryPreferences__c()==null) || 
             (this.zqu__InvoiceDeliveryPreferences__c!=null &&
              this.zqu__InvoiceDeliveryPreferences__c.equals(other.getZqu__InvoiceDeliveryPreferences__c()))) &&
            ((this.zqu__MatchContractEffectiveDate__c==null && other.getZqu__MatchContractEffectiveDate__c()==null) || 
             (this.zqu__MatchContractEffectiveDate__c!=null &&
              this.zqu__MatchContractEffectiveDate__c.equals(other.getZqu__MatchContractEffectiveDate__c()))) &&
            ((this.zqu__MaxAPIQueryFilter__c==null && other.getZqu__MaxAPIQueryFilter__c()==null) || 
             (this.zqu__MaxAPIQueryFilter__c!=null &&
              this.zqu__MaxAPIQueryFilter__c.equals(other.getZqu__MaxAPIQueryFilter__c()))) &&
            ((this.zqu__Opportunities__r==null && other.getZqu__Opportunities__r()==null) || 
             (this.zqu__Opportunities__r!=null &&
              this.zqu__Opportunities__r.equals(other.getZqu__Opportunities__r()))) &&
            ((this.zqu__PaymentTerm__c==null && other.getZqu__PaymentTerm__c()==null) || 
             (this.zqu__PaymentTerm__c!=null &&
              this.zqu__PaymentTerm__c.equals(other.getZqu__PaymentTerm__c()))) &&
            ((this.zqu__ProductSelectorVersion__c==null && other.getZqu__ProductSelectorVersion__c()==null) || 
             (this.zqu__ProductSelectorVersion__c!=null &&
              this.zqu__ProductSelectorVersion__c.equals(other.getZqu__ProductSelectorVersion__c()))) &&
            ((this.zqu__QuoteReadOnly__c==null && other.getZqu__QuoteReadOnly__c()==null) || 
             (this.zqu__QuoteReadOnly__c!=null &&
              this.zqu__QuoteReadOnly__c.equals(other.getZqu__QuoteReadOnly__c()))) &&
            ((this.zqu__QuoteURL__c==null && other.getZqu__QuoteURL__c()==null) || 
             (this.zqu__QuoteURL__c!=null &&
              this.zqu__QuoteURL__c.equals(other.getZqu__QuoteURL__c()))) &&
            ((this.zqu__Quote__r==null && other.getZqu__Quote__r()==null) || 
             (this.zqu__Quote__r!=null &&
              this.zqu__Quote__r.equals(other.getZqu__Quote__r()))) &&
            ((this.zqu__SubscriptionAutorenewDefault__c==null && other.getZqu__SubscriptionAutorenewDefault__c()==null) || 
             (this.zqu__SubscriptionAutorenewDefault__c!=null &&
              this.zqu__SubscriptionAutorenewDefault__c.equals(other.getZqu__SubscriptionAutorenewDefault__c()))) &&
            ((this.zqu__Template_Id__c==null && other.getZqu__Template_Id__c()==null) || 
             (this.zqu__Template_Id__c!=null &&
              this.zqu__Template_Id__c.equals(other.getZqu__Template_Id__c())));
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
        if (getLastReferencedDate() != null) {
            _hashCode += getLastReferencedDate().hashCode();
        }
        if (getLastViewedDate() != null) {
            _hashCode += getLastViewedDate().hashCode();
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
        if (getZqu__APIPassword__c() != null) {
            _hashCode += getZqu__APIPassword__c().hashCode();
        }
        if (getZqu__APIURL__c() != null) {
            _hashCode += getZqu__APIURL__c().hashCode();
        }
        if (getZqu__APIUsername__c() != null) {
            _hashCode += getZqu__APIUsername__c().hashCode();
        }
        if (getZqu__Active__c() != null) {
            _hashCode += getZqu__Active__c().hashCode();
        }
        if (getZqu__AllowUpdateBillCycleDay__c() != null) {
            _hashCode += getZqu__AllowUpdateBillCycleDay__c().hashCode();
        }
        if (getZqu__AllowUpdatingZuora__c() != null) {
            _hashCode += getZqu__AllowUpdatingZuora__c().hashCode();
        }
        if (getZqu__BaseURL__c() != null) {
            _hashCode += getZqu__BaseURL__c().hashCode();
        }
        if (getZqu__BillingAccount_AllowInvoiceEdit__c() != null) {
            _hashCode += getZqu__BillingAccount_AllowInvoiceEdit__c().hashCode();
        }
        if (getZqu__BillingAccount_Batch__c() != null) {
            _hashCode += getZqu__BillingAccount_Batch__c().hashCode();
        }
        if (getZqu__BillingAccount_BillCycleDay__c() != null) {
            _hashCode += getZqu__BillingAccount_BillCycleDay__c().hashCode();
        }
        if (getZqu__Currency__c() != null) {
            _hashCode += getZqu__Currency__c().hashCode();
        }
        if (getZqu__DateFormatInput__c() != null) {
            _hashCode += getZqu__DateFormatInput__c().hashCode();
        }
        if (getZqu__Debug__c() != null) {
            _hashCode += getZqu__Debug__c().hashCode();
        }
        if (getZqu__EnableAmendmentsDEV__c() != null) {
            _hashCode += getZqu__EnableAmendmentsDEV__c().hashCode();
        }
        if (getZqu__InvoiceDeliveryPreferences__c() != null) {
            _hashCode += getZqu__InvoiceDeliveryPreferences__c().hashCode();
        }
        if (getZqu__MatchContractEffectiveDate__c() != null) {
            _hashCode += getZqu__MatchContractEffectiveDate__c().hashCode();
        }
        if (getZqu__MaxAPIQueryFilter__c() != null) {
            _hashCode += getZqu__MaxAPIQueryFilter__c().hashCode();
        }
        if (getZqu__Opportunities__r() != null) {
            _hashCode += getZqu__Opportunities__r().hashCode();
        }
        if (getZqu__PaymentTerm__c() != null) {
            _hashCode += getZqu__PaymentTerm__c().hashCode();
        }
        if (getZqu__ProductSelectorVersion__c() != null) {
            _hashCode += getZqu__ProductSelectorVersion__c().hashCode();
        }
        if (getZqu__QuoteReadOnly__c() != null) {
            _hashCode += getZqu__QuoteReadOnly__c().hashCode();
        }
        if (getZqu__QuoteURL__c() != null) {
            _hashCode += getZqu__QuoteURL__c().hashCode();
        }
        if (getZqu__Quote__r() != null) {
            _hashCode += getZqu__Quote__r().hashCode();
        }
        if (getZqu__SubscriptionAutorenewDefault__c() != null) {
            _hashCode += getZqu__SubscriptionAutorenewDefault__c().hashCode();
        }
        if (getZqu__Template_Id__c() != null) {
            _hashCode += getZqu__Template_Id__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Zqu__ZuoraConfig__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ZuoraConfig__c"));
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
        elemField.setFieldName("lastReferencedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastReferencedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastViewedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastViewedDate"));
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
        elemField.setFieldName("zqu__APIPassword__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__APIPassword__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__APIURL__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__APIURL__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__APIUsername__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__APIUsername__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Active__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Active__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__AllowUpdateBillCycleDay__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__AllowUpdateBillCycleDay__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__AllowUpdatingZuora__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__AllowUpdatingZuora__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__BaseURL__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__BaseURL__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__BillingAccount_AllowInvoiceEdit__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__BillingAccount_AllowInvoiceEdit__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__BillingAccount_Batch__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__BillingAccount_Batch__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__BillingAccount_BillCycleDay__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__BillingAccount_BillCycleDay__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Currency__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Currency__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__DateFormatInput__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__DateFormatInput__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Debug__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Debug__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__EnableAmendmentsDEV__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__EnableAmendmentsDEV__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__InvoiceDeliveryPreferences__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__InvoiceDeliveryPreferences__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__MatchContractEffectiveDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__MatchContractEffectiveDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__MaxAPIQueryFilter__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__MaxAPIQueryFilter__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Opportunities__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Opportunities__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__PaymentTerm__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__PaymentTerm__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__ProductSelectorVersion__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ProductSelectorVersion__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__QuoteReadOnly__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__QuoteReadOnly__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__QuoteURL__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__QuoteURL__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Quote__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Quote__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__SubscriptionAutorenewDefault__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__SubscriptionAutorenewDefault__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Template_Id__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Template_Id__c"));
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
