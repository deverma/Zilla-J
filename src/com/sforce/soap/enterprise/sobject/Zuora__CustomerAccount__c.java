/**
 * Zuora__CustomerAccount__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Zuora__CustomerAccount__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private com.sforce.soap.enterprise.QueryResult attachedContentDocuments;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private com.sforce.soap.enterprise.QueryResult combinedAttachments;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String credit_Card_Capture_Link__c;

    private com.sforce.soap.enterprise.QueryResult duplicateRecordItems;

    private com.sforce.soap.enterprise.QueryResult events;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private com.sforce.soap.enterprise.QueryResult histories;

    private java.lang.String intacct_Customer_ID__c;

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

    private java.lang.Boolean send_Email__c;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult tasks;

    private com.sforce.soap.enterprise.QueryResult topicAssignments;

    private com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess;

    private java.lang.String zuora__AccountNumber__c;

    private java.lang.String zuora__Account__c;

    private com.sforce.soap.enterprise.sobject.Account zuora__Account__r;

    private java.lang.Boolean zuora__AutoPay__c;

    private java.lang.Double zuora__Balance__c;

    private java.lang.String zuora__Batch__c;

    private java.lang.String zuora__BillCycleDay__c;

    private java.lang.String zuora__BillToAddress1__c;

    private java.lang.String zuora__BillToAddress2__c;

    private java.lang.String zuora__BillToCity__c;

    private java.lang.String zuora__BillToCountry__c;

    private java.lang.String zuora__BillToFax__c;

    private java.lang.String zuora__BillToId__c;

    private java.lang.String zuora__BillToName__c;

    private java.lang.String zuora__BillToPostalCode__c;

    private java.lang.String zuora__BillToState__c;

    private java.lang.String zuora__BillToWorkEmail__c;

    private java.lang.String zuora__BillToWorkPhone__c;

    private com.sforce.soap.enterprise.QueryResult zuora__Children__r;

    private java.lang.Double zuora__CreditBalance__c;

    private java.lang.String zuora__CreditCardExpiration__c;

    private java.lang.String zuora__CreditCardNumber__c;

    private java.lang.String zuora__CreditCardType__c;

    private java.lang.String zuora__CreditCard_Expiration__c;

    private java.lang.String zuora__CreditCard_Number__c;

    private java.lang.Double zuora__Credit_Balance__c;

    private java.lang.String zuora__Currency__c;

    private java.lang.String zuora__CustomerServiceRepName__c;

    private java.lang.String zuora__DefaultPaymentMethod__c;

    private java.lang.String zuora__Default_Payment_Method__c;

    private com.sforce.soap.enterprise.sobject.Zuora__PaymentMethod__c zuora__Default_Payment_Method__r;

    private java.lang.String zuora__External_Id__c;

    private java.lang.Boolean zuora__Is_Crm_Id_Change_Processed__c;

    private java.util.Date zuora__LastInvoiceDate__c;

    private java.lang.Double zuora__MRR__c;

    private java.lang.String zuora__Parent__c;

    private com.sforce.soap.enterprise.sobject.Zuora__CustomerAccount__c zuora__Parent__r;

    private java.lang.String zuora__PaymentMethodType__c;

    private java.lang.String zuora__PaymentMethod_Type__c;

    private java.lang.String zuora__PaymentTerm__c;

    private com.sforce.soap.enterprise.QueryResult zuora__Payment_Methods__r;

    private java.lang.String zuora__Payment_Term_Formula__c;

    private java.lang.String zuora__Payment_Term__c;

    private com.sforce.soap.enterprise.sobject.Zuora__PaymentTerm__c zuora__Payment_Term__r;

    private com.sforce.soap.enterprise.QueryResult zuora__Payments__r;

    private java.lang.String zuora__PurchaseOrderNumber__c;

    private com.sforce.soap.enterprise.QueryResult zuora__Refunds__r;

    private java.lang.String zuora__SalesRepName__c;

    private java.lang.String zuora__SoldToId__c;

    private java.lang.String zuora__SoldToName__c;

    private java.lang.String zuora__Status__c;

    private com.sforce.soap.enterprise.QueryResult zuora__Subscriptions1__r;

    private com.sforce.soap.enterprise.QueryResult zuora__Subscriptions__r;

    private com.sforce.soap.enterprise.QueryResult zuora__ZInvoices__r;

    private java.lang.String zuora__Zuora_Id__c;

    public Zuora__CustomerAccount__c() {
    }

    public Zuora__CustomerAccount__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           com.sforce.soap.enterprise.QueryResult attachedContentDocuments,
           com.sforce.soap.enterprise.QueryResult attachments,
           com.sforce.soap.enterprise.QueryResult combinedAttachments,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String credit_Card_Capture_Link__c,
           com.sforce.soap.enterprise.QueryResult duplicateRecordItems,
           com.sforce.soap.enterprise.QueryResult events,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           com.sforce.soap.enterprise.QueryResult histories,
           java.lang.String intacct_Customer_ID__c,
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
           java.lang.Boolean send_Email__c,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult tasks,
           com.sforce.soap.enterprise.QueryResult topicAssignments,
           com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess,
           java.lang.String zuora__AccountNumber__c,
           java.lang.String zuora__Account__c,
           com.sforce.soap.enterprise.sobject.Account zuora__Account__r,
           java.lang.Boolean zuora__AutoPay__c,
           java.lang.Double zuora__Balance__c,
           java.lang.String zuora__Batch__c,
           java.lang.String zuora__BillCycleDay__c,
           java.lang.String zuora__BillToAddress1__c,
           java.lang.String zuora__BillToAddress2__c,
           java.lang.String zuora__BillToCity__c,
           java.lang.String zuora__BillToCountry__c,
           java.lang.String zuora__BillToFax__c,
           java.lang.String zuora__BillToId__c,
           java.lang.String zuora__BillToName__c,
           java.lang.String zuora__BillToPostalCode__c,
           java.lang.String zuora__BillToState__c,
           java.lang.String zuora__BillToWorkEmail__c,
           java.lang.String zuora__BillToWorkPhone__c,
           com.sforce.soap.enterprise.QueryResult zuora__Children__r,
           java.lang.Double zuora__CreditBalance__c,
           java.lang.String zuora__CreditCardExpiration__c,
           java.lang.String zuora__CreditCardNumber__c,
           java.lang.String zuora__CreditCardType__c,
           java.lang.String zuora__CreditCard_Expiration__c,
           java.lang.String zuora__CreditCard_Number__c,
           java.lang.Double zuora__Credit_Balance__c,
           java.lang.String zuora__Currency__c,
           java.lang.String zuora__CustomerServiceRepName__c,
           java.lang.String zuora__DefaultPaymentMethod__c,
           java.lang.String zuora__Default_Payment_Method__c,
           com.sforce.soap.enterprise.sobject.Zuora__PaymentMethod__c zuora__Default_Payment_Method__r,
           java.lang.String zuora__External_Id__c,
           java.lang.Boolean zuora__Is_Crm_Id_Change_Processed__c,
           java.util.Date zuora__LastInvoiceDate__c,
           java.lang.Double zuora__MRR__c,
           java.lang.String zuora__Parent__c,
           com.sforce.soap.enterprise.sobject.Zuora__CustomerAccount__c zuora__Parent__r,
           java.lang.String zuora__PaymentMethodType__c,
           java.lang.String zuora__PaymentMethod_Type__c,
           java.lang.String zuora__PaymentTerm__c,
           com.sforce.soap.enterprise.QueryResult zuora__Payment_Methods__r,
           java.lang.String zuora__Payment_Term_Formula__c,
           java.lang.String zuora__Payment_Term__c,
           com.sforce.soap.enterprise.sobject.Zuora__PaymentTerm__c zuora__Payment_Term__r,
           com.sforce.soap.enterprise.QueryResult zuora__Payments__r,
           java.lang.String zuora__PurchaseOrderNumber__c,
           com.sforce.soap.enterprise.QueryResult zuora__Refunds__r,
           java.lang.String zuora__SalesRepName__c,
           java.lang.String zuora__SoldToId__c,
           java.lang.String zuora__SoldToName__c,
           java.lang.String zuora__Status__c,
           com.sforce.soap.enterprise.QueryResult zuora__Subscriptions1__r,
           com.sforce.soap.enterprise.QueryResult zuora__Subscriptions__r,
           com.sforce.soap.enterprise.QueryResult zuora__ZInvoices__r,
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
        this.credit_Card_Capture_Link__c = credit_Card_Capture_Link__c;
        this.duplicateRecordItems = duplicateRecordItems;
        this.events = events;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.histories = histories;
        this.intacct_Customer_ID__c = intacct_Customer_ID__c;
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
        this.send_Email__c = send_Email__c;
        this.systemModstamp = systemModstamp;
        this.tasks = tasks;
        this.topicAssignments = topicAssignments;
        this.userRecordAccess = userRecordAccess;
        this.zuora__AccountNumber__c = zuora__AccountNumber__c;
        this.zuora__Account__c = zuora__Account__c;
        this.zuora__Account__r = zuora__Account__r;
        this.zuora__AutoPay__c = zuora__AutoPay__c;
        this.zuora__Balance__c = zuora__Balance__c;
        this.zuora__Batch__c = zuora__Batch__c;
        this.zuora__BillCycleDay__c = zuora__BillCycleDay__c;
        this.zuora__BillToAddress1__c = zuora__BillToAddress1__c;
        this.zuora__BillToAddress2__c = zuora__BillToAddress2__c;
        this.zuora__BillToCity__c = zuora__BillToCity__c;
        this.zuora__BillToCountry__c = zuora__BillToCountry__c;
        this.zuora__BillToFax__c = zuora__BillToFax__c;
        this.zuora__BillToId__c = zuora__BillToId__c;
        this.zuora__BillToName__c = zuora__BillToName__c;
        this.zuora__BillToPostalCode__c = zuora__BillToPostalCode__c;
        this.zuora__BillToState__c = zuora__BillToState__c;
        this.zuora__BillToWorkEmail__c = zuora__BillToWorkEmail__c;
        this.zuora__BillToWorkPhone__c = zuora__BillToWorkPhone__c;
        this.zuora__Children__r = zuora__Children__r;
        this.zuora__CreditBalance__c = zuora__CreditBalance__c;
        this.zuora__CreditCardExpiration__c = zuora__CreditCardExpiration__c;
        this.zuora__CreditCardNumber__c = zuora__CreditCardNumber__c;
        this.zuora__CreditCardType__c = zuora__CreditCardType__c;
        this.zuora__CreditCard_Expiration__c = zuora__CreditCard_Expiration__c;
        this.zuora__CreditCard_Number__c = zuora__CreditCard_Number__c;
        this.zuora__Credit_Balance__c = zuora__Credit_Balance__c;
        this.zuora__Currency__c = zuora__Currency__c;
        this.zuora__CustomerServiceRepName__c = zuora__CustomerServiceRepName__c;
        this.zuora__DefaultPaymentMethod__c = zuora__DefaultPaymentMethod__c;
        this.zuora__Default_Payment_Method__c = zuora__Default_Payment_Method__c;
        this.zuora__Default_Payment_Method__r = zuora__Default_Payment_Method__r;
        this.zuora__External_Id__c = zuora__External_Id__c;
        this.zuora__Is_Crm_Id_Change_Processed__c = zuora__Is_Crm_Id_Change_Processed__c;
        this.zuora__LastInvoiceDate__c = zuora__LastInvoiceDate__c;
        this.zuora__MRR__c = zuora__MRR__c;
        this.zuora__Parent__c = zuora__Parent__c;
        this.zuora__Parent__r = zuora__Parent__r;
        this.zuora__PaymentMethodType__c = zuora__PaymentMethodType__c;
        this.zuora__PaymentMethod_Type__c = zuora__PaymentMethod_Type__c;
        this.zuora__PaymentTerm__c = zuora__PaymentTerm__c;
        this.zuora__Payment_Methods__r = zuora__Payment_Methods__r;
        this.zuora__Payment_Term_Formula__c = zuora__Payment_Term_Formula__c;
        this.zuora__Payment_Term__c = zuora__Payment_Term__c;
        this.zuora__Payment_Term__r = zuora__Payment_Term__r;
        this.zuora__Payments__r = zuora__Payments__r;
        this.zuora__PurchaseOrderNumber__c = zuora__PurchaseOrderNumber__c;
        this.zuora__Refunds__r = zuora__Refunds__r;
        this.zuora__SalesRepName__c = zuora__SalesRepName__c;
        this.zuora__SoldToId__c = zuora__SoldToId__c;
        this.zuora__SoldToName__c = zuora__SoldToName__c;
        this.zuora__Status__c = zuora__Status__c;
        this.zuora__Subscriptions1__r = zuora__Subscriptions1__r;
        this.zuora__Subscriptions__r = zuora__Subscriptions__r;
        this.zuora__ZInvoices__r = zuora__ZInvoices__r;
        this.zuora__Zuora_Id__c = zuora__Zuora_Id__c;
    }


    /**
     * Gets the activityHistories value for this Zuora__CustomerAccount__c.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this Zuora__CustomerAccount__c.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the attachedContentDocuments value for this Zuora__CustomerAccount__c.
     * 
     * @return attachedContentDocuments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachedContentDocuments() {
        return attachedContentDocuments;
    }


    /**
     * Sets the attachedContentDocuments value for this Zuora__CustomerAccount__c.
     * 
     * @param attachedContentDocuments
     */
    public void setAttachedContentDocuments(com.sforce.soap.enterprise.QueryResult attachedContentDocuments) {
        this.attachedContentDocuments = attachedContentDocuments;
    }


    /**
     * Gets the attachments value for this Zuora__CustomerAccount__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Zuora__CustomerAccount__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the combinedAttachments value for this Zuora__CustomerAccount__c.
     * 
     * @return combinedAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getCombinedAttachments() {
        return combinedAttachments;
    }


    /**
     * Sets the combinedAttachments value for this Zuora__CustomerAccount__c.
     * 
     * @param combinedAttachments
     */
    public void setCombinedAttachments(com.sforce.soap.enterprise.QueryResult combinedAttachments) {
        this.combinedAttachments = combinedAttachments;
    }


    /**
     * Gets the createdBy value for this Zuora__CustomerAccount__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Zuora__CustomerAccount__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Zuora__CustomerAccount__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Zuora__CustomerAccount__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Zuora__CustomerAccount__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Zuora__CustomerAccount__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the credit_Card_Capture_Link__c value for this Zuora__CustomerAccount__c.
     * 
     * @return credit_Card_Capture_Link__c
     */
    public java.lang.String getCredit_Card_Capture_Link__c() {
        return credit_Card_Capture_Link__c;
    }


    /**
     * Sets the credit_Card_Capture_Link__c value for this Zuora__CustomerAccount__c.
     * 
     * @param credit_Card_Capture_Link__c
     */
    public void setCredit_Card_Capture_Link__c(java.lang.String credit_Card_Capture_Link__c) {
        this.credit_Card_Capture_Link__c = credit_Card_Capture_Link__c;
    }


    /**
     * Gets the duplicateRecordItems value for this Zuora__CustomerAccount__c.
     * 
     * @return duplicateRecordItems
     */
    public com.sforce.soap.enterprise.QueryResult getDuplicateRecordItems() {
        return duplicateRecordItems;
    }


    /**
     * Sets the duplicateRecordItems value for this Zuora__CustomerAccount__c.
     * 
     * @param duplicateRecordItems
     */
    public void setDuplicateRecordItems(com.sforce.soap.enterprise.QueryResult duplicateRecordItems) {
        this.duplicateRecordItems = duplicateRecordItems;
    }


    /**
     * Gets the events value for this Zuora__CustomerAccount__c.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this Zuora__CustomerAccount__c.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Zuora__CustomerAccount__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Zuora__CustomerAccount__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the histories value for this Zuora__CustomerAccount__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this Zuora__CustomerAccount__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the intacct_Customer_ID__c value for this Zuora__CustomerAccount__c.
     * 
     * @return intacct_Customer_ID__c
     */
    public java.lang.String getIntacct_Customer_ID__c() {
        return intacct_Customer_ID__c;
    }


    /**
     * Sets the intacct_Customer_ID__c value for this Zuora__CustomerAccount__c.
     * 
     * @param intacct_Customer_ID__c
     */
    public void setIntacct_Customer_ID__c(java.lang.String intacct_Customer_ID__c) {
        this.intacct_Customer_ID__c = intacct_Customer_ID__c;
    }


    /**
     * Gets the isDeleted value for this Zuora__CustomerAccount__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Zuora__CustomerAccount__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastActivityDate value for this Zuora__CustomerAccount__c.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this Zuora__CustomerAccount__c.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this Zuora__CustomerAccount__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Zuora__CustomerAccount__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Zuora__CustomerAccount__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Zuora__CustomerAccount__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Zuora__CustomerAccount__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Zuora__CustomerAccount__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lookedUpFromActivities value for this Zuora__CustomerAccount__c.
     * 
     * @return lookedUpFromActivities
     */
    public com.sforce.soap.enterprise.QueryResult getLookedUpFromActivities() {
        return lookedUpFromActivities;
    }


    /**
     * Sets the lookedUpFromActivities value for this Zuora__CustomerAccount__c.
     * 
     * @param lookedUpFromActivities
     */
    public void setLookedUpFromActivities(com.sforce.soap.enterprise.QueryResult lookedUpFromActivities) {
        this.lookedUpFromActivities = lookedUpFromActivities;
    }


    /**
     * Gets the name value for this Zuora__CustomerAccount__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Zuora__CustomerAccount__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Zuora__CustomerAccount__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Zuora__CustomerAccount__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Zuora__CustomerAccount__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Zuora__CustomerAccount__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the openActivities value for this Zuora__CustomerAccount__c.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this Zuora__CustomerAccount__c.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the processInstances value for this Zuora__CustomerAccount__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Zuora__CustomerAccount__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Zuora__CustomerAccount__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Zuora__CustomerAccount__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the recordAssociatedGroups value for this Zuora__CustomerAccount__c.
     * 
     * @return recordAssociatedGroups
     */
    public com.sforce.soap.enterprise.QueryResult getRecordAssociatedGroups() {
        return recordAssociatedGroups;
    }


    /**
     * Sets the recordAssociatedGroups value for this Zuora__CustomerAccount__c.
     * 
     * @param recordAssociatedGroups
     */
    public void setRecordAssociatedGroups(com.sforce.soap.enterprise.QueryResult recordAssociatedGroups) {
        this.recordAssociatedGroups = recordAssociatedGroups;
    }


    /**
     * Gets the send_Email__c value for this Zuora__CustomerAccount__c.
     * 
     * @return send_Email__c
     */
    public java.lang.Boolean getSend_Email__c() {
        return send_Email__c;
    }


    /**
     * Sets the send_Email__c value for this Zuora__CustomerAccount__c.
     * 
     * @param send_Email__c
     */
    public void setSend_Email__c(java.lang.Boolean send_Email__c) {
        this.send_Email__c = send_Email__c;
    }


    /**
     * Gets the systemModstamp value for this Zuora__CustomerAccount__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Zuora__CustomerAccount__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this Zuora__CustomerAccount__c.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this Zuora__CustomerAccount__c.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the topicAssignments value for this Zuora__CustomerAccount__c.
     * 
     * @return topicAssignments
     */
    public com.sforce.soap.enterprise.QueryResult getTopicAssignments() {
        return topicAssignments;
    }


    /**
     * Sets the topicAssignments value for this Zuora__CustomerAccount__c.
     * 
     * @param topicAssignments
     */
    public void setTopicAssignments(com.sforce.soap.enterprise.QueryResult topicAssignments) {
        this.topicAssignments = topicAssignments;
    }


    /**
     * Gets the userRecordAccess value for this Zuora__CustomerAccount__c.
     * 
     * @return userRecordAccess
     */
    public com.sforce.soap.enterprise.sobject.UserRecordAccess getUserRecordAccess() {
        return userRecordAccess;
    }


    /**
     * Sets the userRecordAccess value for this Zuora__CustomerAccount__c.
     * 
     * @param userRecordAccess
     */
    public void setUserRecordAccess(com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess) {
        this.userRecordAccess = userRecordAccess;
    }


    /**
     * Gets the zuora__AccountNumber__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__AccountNumber__c
     */
    public java.lang.String getZuora__AccountNumber__c() {
        return zuora__AccountNumber__c;
    }


    /**
     * Sets the zuora__AccountNumber__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__AccountNumber__c
     */
    public void setZuora__AccountNumber__c(java.lang.String zuora__AccountNumber__c) {
        this.zuora__AccountNumber__c = zuora__AccountNumber__c;
    }


    /**
     * Gets the zuora__Account__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__Account__c
     */
    public java.lang.String getZuora__Account__c() {
        return zuora__Account__c;
    }


    /**
     * Sets the zuora__Account__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__Account__c
     */
    public void setZuora__Account__c(java.lang.String zuora__Account__c) {
        this.zuora__Account__c = zuora__Account__c;
    }


    /**
     * Gets the zuora__Account__r value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__Account__r
     */
    public com.sforce.soap.enterprise.sobject.Account getZuora__Account__r() {
        return zuora__Account__r;
    }


    /**
     * Sets the zuora__Account__r value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__Account__r
     */
    public void setZuora__Account__r(com.sforce.soap.enterprise.sobject.Account zuora__Account__r) {
        this.zuora__Account__r = zuora__Account__r;
    }


    /**
     * Gets the zuora__AutoPay__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__AutoPay__c
     */
    public java.lang.Boolean getZuora__AutoPay__c() {
        return zuora__AutoPay__c;
    }


    /**
     * Sets the zuora__AutoPay__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__AutoPay__c
     */
    public void setZuora__AutoPay__c(java.lang.Boolean zuora__AutoPay__c) {
        this.zuora__AutoPay__c = zuora__AutoPay__c;
    }


    /**
     * Gets the zuora__Balance__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__Balance__c
     */
    public java.lang.Double getZuora__Balance__c() {
        return zuora__Balance__c;
    }


    /**
     * Sets the zuora__Balance__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__Balance__c
     */
    public void setZuora__Balance__c(java.lang.Double zuora__Balance__c) {
        this.zuora__Balance__c = zuora__Balance__c;
    }


    /**
     * Gets the zuora__Batch__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__Batch__c
     */
    public java.lang.String getZuora__Batch__c() {
        return zuora__Batch__c;
    }


    /**
     * Sets the zuora__Batch__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__Batch__c
     */
    public void setZuora__Batch__c(java.lang.String zuora__Batch__c) {
        this.zuora__Batch__c = zuora__Batch__c;
    }


    /**
     * Gets the zuora__BillCycleDay__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__BillCycleDay__c
     */
    public java.lang.String getZuora__BillCycleDay__c() {
        return zuora__BillCycleDay__c;
    }


    /**
     * Sets the zuora__BillCycleDay__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__BillCycleDay__c
     */
    public void setZuora__BillCycleDay__c(java.lang.String zuora__BillCycleDay__c) {
        this.zuora__BillCycleDay__c = zuora__BillCycleDay__c;
    }


    /**
     * Gets the zuora__BillToAddress1__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__BillToAddress1__c
     */
    public java.lang.String getZuora__BillToAddress1__c() {
        return zuora__BillToAddress1__c;
    }


    /**
     * Sets the zuora__BillToAddress1__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__BillToAddress1__c
     */
    public void setZuora__BillToAddress1__c(java.lang.String zuora__BillToAddress1__c) {
        this.zuora__BillToAddress1__c = zuora__BillToAddress1__c;
    }


    /**
     * Gets the zuora__BillToAddress2__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__BillToAddress2__c
     */
    public java.lang.String getZuora__BillToAddress2__c() {
        return zuora__BillToAddress2__c;
    }


    /**
     * Sets the zuora__BillToAddress2__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__BillToAddress2__c
     */
    public void setZuora__BillToAddress2__c(java.lang.String zuora__BillToAddress2__c) {
        this.zuora__BillToAddress2__c = zuora__BillToAddress2__c;
    }


    /**
     * Gets the zuora__BillToCity__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__BillToCity__c
     */
    public java.lang.String getZuora__BillToCity__c() {
        return zuora__BillToCity__c;
    }


    /**
     * Sets the zuora__BillToCity__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__BillToCity__c
     */
    public void setZuora__BillToCity__c(java.lang.String zuora__BillToCity__c) {
        this.zuora__BillToCity__c = zuora__BillToCity__c;
    }


    /**
     * Gets the zuora__BillToCountry__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__BillToCountry__c
     */
    public java.lang.String getZuora__BillToCountry__c() {
        return zuora__BillToCountry__c;
    }


    /**
     * Sets the zuora__BillToCountry__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__BillToCountry__c
     */
    public void setZuora__BillToCountry__c(java.lang.String zuora__BillToCountry__c) {
        this.zuora__BillToCountry__c = zuora__BillToCountry__c;
    }


    /**
     * Gets the zuora__BillToFax__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__BillToFax__c
     */
    public java.lang.String getZuora__BillToFax__c() {
        return zuora__BillToFax__c;
    }


    /**
     * Sets the zuora__BillToFax__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__BillToFax__c
     */
    public void setZuora__BillToFax__c(java.lang.String zuora__BillToFax__c) {
        this.zuora__BillToFax__c = zuora__BillToFax__c;
    }


    /**
     * Gets the zuora__BillToId__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__BillToId__c
     */
    public java.lang.String getZuora__BillToId__c() {
        return zuora__BillToId__c;
    }


    /**
     * Sets the zuora__BillToId__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__BillToId__c
     */
    public void setZuora__BillToId__c(java.lang.String zuora__BillToId__c) {
        this.zuora__BillToId__c = zuora__BillToId__c;
    }


    /**
     * Gets the zuora__BillToName__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__BillToName__c
     */
    public java.lang.String getZuora__BillToName__c() {
        return zuora__BillToName__c;
    }


    /**
     * Sets the zuora__BillToName__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__BillToName__c
     */
    public void setZuora__BillToName__c(java.lang.String zuora__BillToName__c) {
        this.zuora__BillToName__c = zuora__BillToName__c;
    }


    /**
     * Gets the zuora__BillToPostalCode__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__BillToPostalCode__c
     */
    public java.lang.String getZuora__BillToPostalCode__c() {
        return zuora__BillToPostalCode__c;
    }


    /**
     * Sets the zuora__BillToPostalCode__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__BillToPostalCode__c
     */
    public void setZuora__BillToPostalCode__c(java.lang.String zuora__BillToPostalCode__c) {
        this.zuora__BillToPostalCode__c = zuora__BillToPostalCode__c;
    }


    /**
     * Gets the zuora__BillToState__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__BillToState__c
     */
    public java.lang.String getZuora__BillToState__c() {
        return zuora__BillToState__c;
    }


    /**
     * Sets the zuora__BillToState__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__BillToState__c
     */
    public void setZuora__BillToState__c(java.lang.String zuora__BillToState__c) {
        this.zuora__BillToState__c = zuora__BillToState__c;
    }


    /**
     * Gets the zuora__BillToWorkEmail__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__BillToWorkEmail__c
     */
    public java.lang.String getZuora__BillToWorkEmail__c() {
        return zuora__BillToWorkEmail__c;
    }


    /**
     * Sets the zuora__BillToWorkEmail__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__BillToWorkEmail__c
     */
    public void setZuora__BillToWorkEmail__c(java.lang.String zuora__BillToWorkEmail__c) {
        this.zuora__BillToWorkEmail__c = zuora__BillToWorkEmail__c;
    }


    /**
     * Gets the zuora__BillToWorkPhone__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__BillToWorkPhone__c
     */
    public java.lang.String getZuora__BillToWorkPhone__c() {
        return zuora__BillToWorkPhone__c;
    }


    /**
     * Sets the zuora__BillToWorkPhone__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__BillToWorkPhone__c
     */
    public void setZuora__BillToWorkPhone__c(java.lang.String zuora__BillToWorkPhone__c) {
        this.zuora__BillToWorkPhone__c = zuora__BillToWorkPhone__c;
    }


    /**
     * Gets the zuora__Children__r value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__Children__r
     */
    public com.sforce.soap.enterprise.QueryResult getZuora__Children__r() {
        return zuora__Children__r;
    }


    /**
     * Sets the zuora__Children__r value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__Children__r
     */
    public void setZuora__Children__r(com.sforce.soap.enterprise.QueryResult zuora__Children__r) {
        this.zuora__Children__r = zuora__Children__r;
    }


    /**
     * Gets the zuora__CreditBalance__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__CreditBalance__c
     */
    public java.lang.Double getZuora__CreditBalance__c() {
        return zuora__CreditBalance__c;
    }


    /**
     * Sets the zuora__CreditBalance__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__CreditBalance__c
     */
    public void setZuora__CreditBalance__c(java.lang.Double zuora__CreditBalance__c) {
        this.zuora__CreditBalance__c = zuora__CreditBalance__c;
    }


    /**
     * Gets the zuora__CreditCardExpiration__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__CreditCardExpiration__c
     */
    public java.lang.String getZuora__CreditCardExpiration__c() {
        return zuora__CreditCardExpiration__c;
    }


    /**
     * Sets the zuora__CreditCardExpiration__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__CreditCardExpiration__c
     */
    public void setZuora__CreditCardExpiration__c(java.lang.String zuora__CreditCardExpiration__c) {
        this.zuora__CreditCardExpiration__c = zuora__CreditCardExpiration__c;
    }


    /**
     * Gets the zuora__CreditCardNumber__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__CreditCardNumber__c
     */
    public java.lang.String getZuora__CreditCardNumber__c() {
        return zuora__CreditCardNumber__c;
    }


    /**
     * Sets the zuora__CreditCardNumber__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__CreditCardNumber__c
     */
    public void setZuora__CreditCardNumber__c(java.lang.String zuora__CreditCardNumber__c) {
        this.zuora__CreditCardNumber__c = zuora__CreditCardNumber__c;
    }


    /**
     * Gets the zuora__CreditCardType__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__CreditCardType__c
     */
    public java.lang.String getZuora__CreditCardType__c() {
        return zuora__CreditCardType__c;
    }


    /**
     * Sets the zuora__CreditCardType__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__CreditCardType__c
     */
    public void setZuora__CreditCardType__c(java.lang.String zuora__CreditCardType__c) {
        this.zuora__CreditCardType__c = zuora__CreditCardType__c;
    }


    /**
     * Gets the zuora__CreditCard_Expiration__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__CreditCard_Expiration__c
     */
    public java.lang.String getZuora__CreditCard_Expiration__c() {
        return zuora__CreditCard_Expiration__c;
    }


    /**
     * Sets the zuora__CreditCard_Expiration__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__CreditCard_Expiration__c
     */
    public void setZuora__CreditCard_Expiration__c(java.lang.String zuora__CreditCard_Expiration__c) {
        this.zuora__CreditCard_Expiration__c = zuora__CreditCard_Expiration__c;
    }


    /**
     * Gets the zuora__CreditCard_Number__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__CreditCard_Number__c
     */
    public java.lang.String getZuora__CreditCard_Number__c() {
        return zuora__CreditCard_Number__c;
    }


    /**
     * Sets the zuora__CreditCard_Number__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__CreditCard_Number__c
     */
    public void setZuora__CreditCard_Number__c(java.lang.String zuora__CreditCard_Number__c) {
        this.zuora__CreditCard_Number__c = zuora__CreditCard_Number__c;
    }


    /**
     * Gets the zuora__Credit_Balance__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__Credit_Balance__c
     */
    public java.lang.Double getZuora__Credit_Balance__c() {
        return zuora__Credit_Balance__c;
    }


    /**
     * Sets the zuora__Credit_Balance__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__Credit_Balance__c
     */
    public void setZuora__Credit_Balance__c(java.lang.Double zuora__Credit_Balance__c) {
        this.zuora__Credit_Balance__c = zuora__Credit_Balance__c;
    }


    /**
     * Gets the zuora__Currency__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__Currency__c
     */
    public java.lang.String getZuora__Currency__c() {
        return zuora__Currency__c;
    }


    /**
     * Sets the zuora__Currency__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__Currency__c
     */
    public void setZuora__Currency__c(java.lang.String zuora__Currency__c) {
        this.zuora__Currency__c = zuora__Currency__c;
    }


    /**
     * Gets the zuora__CustomerServiceRepName__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__CustomerServiceRepName__c
     */
    public java.lang.String getZuora__CustomerServiceRepName__c() {
        return zuora__CustomerServiceRepName__c;
    }


    /**
     * Sets the zuora__CustomerServiceRepName__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__CustomerServiceRepName__c
     */
    public void setZuora__CustomerServiceRepName__c(java.lang.String zuora__CustomerServiceRepName__c) {
        this.zuora__CustomerServiceRepName__c = zuora__CustomerServiceRepName__c;
    }


    /**
     * Gets the zuora__DefaultPaymentMethod__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__DefaultPaymentMethod__c
     */
    public java.lang.String getZuora__DefaultPaymentMethod__c() {
        return zuora__DefaultPaymentMethod__c;
    }


    /**
     * Sets the zuora__DefaultPaymentMethod__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__DefaultPaymentMethod__c
     */
    public void setZuora__DefaultPaymentMethod__c(java.lang.String zuora__DefaultPaymentMethod__c) {
        this.zuora__DefaultPaymentMethod__c = zuora__DefaultPaymentMethod__c;
    }


    /**
     * Gets the zuora__Default_Payment_Method__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__Default_Payment_Method__c
     */
    public java.lang.String getZuora__Default_Payment_Method__c() {
        return zuora__Default_Payment_Method__c;
    }


    /**
     * Sets the zuora__Default_Payment_Method__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__Default_Payment_Method__c
     */
    public void setZuora__Default_Payment_Method__c(java.lang.String zuora__Default_Payment_Method__c) {
        this.zuora__Default_Payment_Method__c = zuora__Default_Payment_Method__c;
    }


    /**
     * Gets the zuora__Default_Payment_Method__r value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__Default_Payment_Method__r
     */
    public com.sforce.soap.enterprise.sobject.Zuora__PaymentMethod__c getZuora__Default_Payment_Method__r() {
        return zuora__Default_Payment_Method__r;
    }


    /**
     * Sets the zuora__Default_Payment_Method__r value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__Default_Payment_Method__r
     */
    public void setZuora__Default_Payment_Method__r(com.sforce.soap.enterprise.sobject.Zuora__PaymentMethod__c zuora__Default_Payment_Method__r) {
        this.zuora__Default_Payment_Method__r = zuora__Default_Payment_Method__r;
    }


    /**
     * Gets the zuora__External_Id__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__External_Id__c
     */
    public java.lang.String getZuora__External_Id__c() {
        return zuora__External_Id__c;
    }


    /**
     * Sets the zuora__External_Id__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__External_Id__c
     */
    public void setZuora__External_Id__c(java.lang.String zuora__External_Id__c) {
        this.zuora__External_Id__c = zuora__External_Id__c;
    }


    /**
     * Gets the zuora__Is_Crm_Id_Change_Processed__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__Is_Crm_Id_Change_Processed__c
     */
    public java.lang.Boolean getZuora__Is_Crm_Id_Change_Processed__c() {
        return zuora__Is_Crm_Id_Change_Processed__c;
    }


    /**
     * Sets the zuora__Is_Crm_Id_Change_Processed__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__Is_Crm_Id_Change_Processed__c
     */
    public void setZuora__Is_Crm_Id_Change_Processed__c(java.lang.Boolean zuora__Is_Crm_Id_Change_Processed__c) {
        this.zuora__Is_Crm_Id_Change_Processed__c = zuora__Is_Crm_Id_Change_Processed__c;
    }


    /**
     * Gets the zuora__LastInvoiceDate__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__LastInvoiceDate__c
     */
    public java.util.Date getZuora__LastInvoiceDate__c() {
        return zuora__LastInvoiceDate__c;
    }


    /**
     * Sets the zuora__LastInvoiceDate__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__LastInvoiceDate__c
     */
    public void setZuora__LastInvoiceDate__c(java.util.Date zuora__LastInvoiceDate__c) {
        this.zuora__LastInvoiceDate__c = zuora__LastInvoiceDate__c;
    }


    /**
     * Gets the zuora__MRR__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__MRR__c
     */
    public java.lang.Double getZuora__MRR__c() {
        return zuora__MRR__c;
    }


    /**
     * Sets the zuora__MRR__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__MRR__c
     */
    public void setZuora__MRR__c(java.lang.Double zuora__MRR__c) {
        this.zuora__MRR__c = zuora__MRR__c;
    }


    /**
     * Gets the zuora__Parent__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__Parent__c
     */
    public java.lang.String getZuora__Parent__c() {
        return zuora__Parent__c;
    }


    /**
     * Sets the zuora__Parent__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__Parent__c
     */
    public void setZuora__Parent__c(java.lang.String zuora__Parent__c) {
        this.zuora__Parent__c = zuora__Parent__c;
    }


    /**
     * Gets the zuora__Parent__r value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__Parent__r
     */
    public com.sforce.soap.enterprise.sobject.Zuora__CustomerAccount__c getZuora__Parent__r() {
        return zuora__Parent__r;
    }


    /**
     * Sets the zuora__Parent__r value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__Parent__r
     */
    public void setZuora__Parent__r(com.sforce.soap.enterprise.sobject.Zuora__CustomerAccount__c zuora__Parent__r) {
        this.zuora__Parent__r = zuora__Parent__r;
    }


    /**
     * Gets the zuora__PaymentMethodType__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__PaymentMethodType__c
     */
    public java.lang.String getZuora__PaymentMethodType__c() {
        return zuora__PaymentMethodType__c;
    }


    /**
     * Sets the zuora__PaymentMethodType__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__PaymentMethodType__c
     */
    public void setZuora__PaymentMethodType__c(java.lang.String zuora__PaymentMethodType__c) {
        this.zuora__PaymentMethodType__c = zuora__PaymentMethodType__c;
    }


    /**
     * Gets the zuora__PaymentMethod_Type__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__PaymentMethod_Type__c
     */
    public java.lang.String getZuora__PaymentMethod_Type__c() {
        return zuora__PaymentMethod_Type__c;
    }


    /**
     * Sets the zuora__PaymentMethod_Type__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__PaymentMethod_Type__c
     */
    public void setZuora__PaymentMethod_Type__c(java.lang.String zuora__PaymentMethod_Type__c) {
        this.zuora__PaymentMethod_Type__c = zuora__PaymentMethod_Type__c;
    }


    /**
     * Gets the zuora__PaymentTerm__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__PaymentTerm__c
     */
    public java.lang.String getZuora__PaymentTerm__c() {
        return zuora__PaymentTerm__c;
    }


    /**
     * Sets the zuora__PaymentTerm__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__PaymentTerm__c
     */
    public void setZuora__PaymentTerm__c(java.lang.String zuora__PaymentTerm__c) {
        this.zuora__PaymentTerm__c = zuora__PaymentTerm__c;
    }


    /**
     * Gets the zuora__Payment_Methods__r value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__Payment_Methods__r
     */
    public com.sforce.soap.enterprise.QueryResult getZuora__Payment_Methods__r() {
        return zuora__Payment_Methods__r;
    }


    /**
     * Sets the zuora__Payment_Methods__r value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__Payment_Methods__r
     */
    public void setZuora__Payment_Methods__r(com.sforce.soap.enterprise.QueryResult zuora__Payment_Methods__r) {
        this.zuora__Payment_Methods__r = zuora__Payment_Methods__r;
    }


    /**
     * Gets the zuora__Payment_Term_Formula__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__Payment_Term_Formula__c
     */
    public java.lang.String getZuora__Payment_Term_Formula__c() {
        return zuora__Payment_Term_Formula__c;
    }


    /**
     * Sets the zuora__Payment_Term_Formula__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__Payment_Term_Formula__c
     */
    public void setZuora__Payment_Term_Formula__c(java.lang.String zuora__Payment_Term_Formula__c) {
        this.zuora__Payment_Term_Formula__c = zuora__Payment_Term_Formula__c;
    }


    /**
     * Gets the zuora__Payment_Term__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__Payment_Term__c
     */
    public java.lang.String getZuora__Payment_Term__c() {
        return zuora__Payment_Term__c;
    }


    /**
     * Sets the zuora__Payment_Term__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__Payment_Term__c
     */
    public void setZuora__Payment_Term__c(java.lang.String zuora__Payment_Term__c) {
        this.zuora__Payment_Term__c = zuora__Payment_Term__c;
    }


    /**
     * Gets the zuora__Payment_Term__r value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__Payment_Term__r
     */
    public com.sforce.soap.enterprise.sobject.Zuora__PaymentTerm__c getZuora__Payment_Term__r() {
        return zuora__Payment_Term__r;
    }


    /**
     * Sets the zuora__Payment_Term__r value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__Payment_Term__r
     */
    public void setZuora__Payment_Term__r(com.sforce.soap.enterprise.sobject.Zuora__PaymentTerm__c zuora__Payment_Term__r) {
        this.zuora__Payment_Term__r = zuora__Payment_Term__r;
    }


    /**
     * Gets the zuora__Payments__r value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__Payments__r
     */
    public com.sforce.soap.enterprise.QueryResult getZuora__Payments__r() {
        return zuora__Payments__r;
    }


    /**
     * Sets the zuora__Payments__r value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__Payments__r
     */
    public void setZuora__Payments__r(com.sforce.soap.enterprise.QueryResult zuora__Payments__r) {
        this.zuora__Payments__r = zuora__Payments__r;
    }


    /**
     * Gets the zuora__PurchaseOrderNumber__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__PurchaseOrderNumber__c
     */
    public java.lang.String getZuora__PurchaseOrderNumber__c() {
        return zuora__PurchaseOrderNumber__c;
    }


    /**
     * Sets the zuora__PurchaseOrderNumber__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__PurchaseOrderNumber__c
     */
    public void setZuora__PurchaseOrderNumber__c(java.lang.String zuora__PurchaseOrderNumber__c) {
        this.zuora__PurchaseOrderNumber__c = zuora__PurchaseOrderNumber__c;
    }


    /**
     * Gets the zuora__Refunds__r value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__Refunds__r
     */
    public com.sforce.soap.enterprise.QueryResult getZuora__Refunds__r() {
        return zuora__Refunds__r;
    }


    /**
     * Sets the zuora__Refunds__r value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__Refunds__r
     */
    public void setZuora__Refunds__r(com.sforce.soap.enterprise.QueryResult zuora__Refunds__r) {
        this.zuora__Refunds__r = zuora__Refunds__r;
    }


    /**
     * Gets the zuora__SalesRepName__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__SalesRepName__c
     */
    public java.lang.String getZuora__SalesRepName__c() {
        return zuora__SalesRepName__c;
    }


    /**
     * Sets the zuora__SalesRepName__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__SalesRepName__c
     */
    public void setZuora__SalesRepName__c(java.lang.String zuora__SalesRepName__c) {
        this.zuora__SalesRepName__c = zuora__SalesRepName__c;
    }


    /**
     * Gets the zuora__SoldToId__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__SoldToId__c
     */
    public java.lang.String getZuora__SoldToId__c() {
        return zuora__SoldToId__c;
    }


    /**
     * Sets the zuora__SoldToId__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__SoldToId__c
     */
    public void setZuora__SoldToId__c(java.lang.String zuora__SoldToId__c) {
        this.zuora__SoldToId__c = zuora__SoldToId__c;
    }


    /**
     * Gets the zuora__SoldToName__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__SoldToName__c
     */
    public java.lang.String getZuora__SoldToName__c() {
        return zuora__SoldToName__c;
    }


    /**
     * Sets the zuora__SoldToName__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__SoldToName__c
     */
    public void setZuora__SoldToName__c(java.lang.String zuora__SoldToName__c) {
        this.zuora__SoldToName__c = zuora__SoldToName__c;
    }


    /**
     * Gets the zuora__Status__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__Status__c
     */
    public java.lang.String getZuora__Status__c() {
        return zuora__Status__c;
    }


    /**
     * Sets the zuora__Status__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__Status__c
     */
    public void setZuora__Status__c(java.lang.String zuora__Status__c) {
        this.zuora__Status__c = zuora__Status__c;
    }


    /**
     * Gets the zuora__Subscriptions1__r value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__Subscriptions1__r
     */
    public com.sforce.soap.enterprise.QueryResult getZuora__Subscriptions1__r() {
        return zuora__Subscriptions1__r;
    }


    /**
     * Sets the zuora__Subscriptions1__r value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__Subscriptions1__r
     */
    public void setZuora__Subscriptions1__r(com.sforce.soap.enterprise.QueryResult zuora__Subscriptions1__r) {
        this.zuora__Subscriptions1__r = zuora__Subscriptions1__r;
    }


    /**
     * Gets the zuora__Subscriptions__r value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__Subscriptions__r
     */
    public com.sforce.soap.enterprise.QueryResult getZuora__Subscriptions__r() {
        return zuora__Subscriptions__r;
    }


    /**
     * Sets the zuora__Subscriptions__r value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__Subscriptions__r
     */
    public void setZuora__Subscriptions__r(com.sforce.soap.enterprise.QueryResult zuora__Subscriptions__r) {
        this.zuora__Subscriptions__r = zuora__Subscriptions__r;
    }


    /**
     * Gets the zuora__ZInvoices__r value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__ZInvoices__r
     */
    public com.sforce.soap.enterprise.QueryResult getZuora__ZInvoices__r() {
        return zuora__ZInvoices__r;
    }


    /**
     * Sets the zuora__ZInvoices__r value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__ZInvoices__r
     */
    public void setZuora__ZInvoices__r(com.sforce.soap.enterprise.QueryResult zuora__ZInvoices__r) {
        this.zuora__ZInvoices__r = zuora__ZInvoices__r;
    }


    /**
     * Gets the zuora__Zuora_Id__c value for this Zuora__CustomerAccount__c.
     * 
     * @return zuora__Zuora_Id__c
     */
    public java.lang.String getZuora__Zuora_Id__c() {
        return zuora__Zuora_Id__c;
    }


    /**
     * Sets the zuora__Zuora_Id__c value for this Zuora__CustomerAccount__c.
     * 
     * @param zuora__Zuora_Id__c
     */
    public void setZuora__Zuora_Id__c(java.lang.String zuora__Zuora_Id__c) {
        this.zuora__Zuora_Id__c = zuora__Zuora_Id__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Zuora__CustomerAccount__c)) return false;
        Zuora__CustomerAccount__c other = (Zuora__CustomerAccount__c) obj;
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
            ((this.credit_Card_Capture_Link__c==null && other.getCredit_Card_Capture_Link__c()==null) || 
             (this.credit_Card_Capture_Link__c!=null &&
              this.credit_Card_Capture_Link__c.equals(other.getCredit_Card_Capture_Link__c()))) &&
            ((this.duplicateRecordItems==null && other.getDuplicateRecordItems()==null) || 
             (this.duplicateRecordItems!=null &&
              this.duplicateRecordItems.equals(other.getDuplicateRecordItems()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              this.events.equals(other.getEvents()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.histories==null && other.getHistories()==null) || 
             (this.histories!=null &&
              this.histories.equals(other.getHistories()))) &&
            ((this.intacct_Customer_ID__c==null && other.getIntacct_Customer_ID__c()==null) || 
             (this.intacct_Customer_ID__c!=null &&
              this.intacct_Customer_ID__c.equals(other.getIntacct_Customer_ID__c()))) &&
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
            ((this.send_Email__c==null && other.getSend_Email__c()==null) || 
             (this.send_Email__c!=null &&
              this.send_Email__c.equals(other.getSend_Email__c()))) &&
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
            ((this.zuora__AccountNumber__c==null && other.getZuora__AccountNumber__c()==null) || 
             (this.zuora__AccountNumber__c!=null &&
              this.zuora__AccountNumber__c.equals(other.getZuora__AccountNumber__c()))) &&
            ((this.zuora__Account__c==null && other.getZuora__Account__c()==null) || 
             (this.zuora__Account__c!=null &&
              this.zuora__Account__c.equals(other.getZuora__Account__c()))) &&
            ((this.zuora__Account__r==null && other.getZuora__Account__r()==null) || 
             (this.zuora__Account__r!=null &&
              this.zuora__Account__r.equals(other.getZuora__Account__r()))) &&
            ((this.zuora__AutoPay__c==null && other.getZuora__AutoPay__c()==null) || 
             (this.zuora__AutoPay__c!=null &&
              this.zuora__AutoPay__c.equals(other.getZuora__AutoPay__c()))) &&
            ((this.zuora__Balance__c==null && other.getZuora__Balance__c()==null) || 
             (this.zuora__Balance__c!=null &&
              this.zuora__Balance__c.equals(other.getZuora__Balance__c()))) &&
            ((this.zuora__Batch__c==null && other.getZuora__Batch__c()==null) || 
             (this.zuora__Batch__c!=null &&
              this.zuora__Batch__c.equals(other.getZuora__Batch__c()))) &&
            ((this.zuora__BillCycleDay__c==null && other.getZuora__BillCycleDay__c()==null) || 
             (this.zuora__BillCycleDay__c!=null &&
              this.zuora__BillCycleDay__c.equals(other.getZuora__BillCycleDay__c()))) &&
            ((this.zuora__BillToAddress1__c==null && other.getZuora__BillToAddress1__c()==null) || 
             (this.zuora__BillToAddress1__c!=null &&
              this.zuora__BillToAddress1__c.equals(other.getZuora__BillToAddress1__c()))) &&
            ((this.zuora__BillToAddress2__c==null && other.getZuora__BillToAddress2__c()==null) || 
             (this.zuora__BillToAddress2__c!=null &&
              this.zuora__BillToAddress2__c.equals(other.getZuora__BillToAddress2__c()))) &&
            ((this.zuora__BillToCity__c==null && other.getZuora__BillToCity__c()==null) || 
             (this.zuora__BillToCity__c!=null &&
              this.zuora__BillToCity__c.equals(other.getZuora__BillToCity__c()))) &&
            ((this.zuora__BillToCountry__c==null && other.getZuora__BillToCountry__c()==null) || 
             (this.zuora__BillToCountry__c!=null &&
              this.zuora__BillToCountry__c.equals(other.getZuora__BillToCountry__c()))) &&
            ((this.zuora__BillToFax__c==null && other.getZuora__BillToFax__c()==null) || 
             (this.zuora__BillToFax__c!=null &&
              this.zuora__BillToFax__c.equals(other.getZuora__BillToFax__c()))) &&
            ((this.zuora__BillToId__c==null && other.getZuora__BillToId__c()==null) || 
             (this.zuora__BillToId__c!=null &&
              this.zuora__BillToId__c.equals(other.getZuora__BillToId__c()))) &&
            ((this.zuora__BillToName__c==null && other.getZuora__BillToName__c()==null) || 
             (this.zuora__BillToName__c!=null &&
              this.zuora__BillToName__c.equals(other.getZuora__BillToName__c()))) &&
            ((this.zuora__BillToPostalCode__c==null && other.getZuora__BillToPostalCode__c()==null) || 
             (this.zuora__BillToPostalCode__c!=null &&
              this.zuora__BillToPostalCode__c.equals(other.getZuora__BillToPostalCode__c()))) &&
            ((this.zuora__BillToState__c==null && other.getZuora__BillToState__c()==null) || 
             (this.zuora__BillToState__c!=null &&
              this.zuora__BillToState__c.equals(other.getZuora__BillToState__c()))) &&
            ((this.zuora__BillToWorkEmail__c==null && other.getZuora__BillToWorkEmail__c()==null) || 
             (this.zuora__BillToWorkEmail__c!=null &&
              this.zuora__BillToWorkEmail__c.equals(other.getZuora__BillToWorkEmail__c()))) &&
            ((this.zuora__BillToWorkPhone__c==null && other.getZuora__BillToWorkPhone__c()==null) || 
             (this.zuora__BillToWorkPhone__c!=null &&
              this.zuora__BillToWorkPhone__c.equals(other.getZuora__BillToWorkPhone__c()))) &&
            ((this.zuora__Children__r==null && other.getZuora__Children__r()==null) || 
             (this.zuora__Children__r!=null &&
              this.zuora__Children__r.equals(other.getZuora__Children__r()))) &&
            ((this.zuora__CreditBalance__c==null && other.getZuora__CreditBalance__c()==null) || 
             (this.zuora__CreditBalance__c!=null &&
              this.zuora__CreditBalance__c.equals(other.getZuora__CreditBalance__c()))) &&
            ((this.zuora__CreditCardExpiration__c==null && other.getZuora__CreditCardExpiration__c()==null) || 
             (this.zuora__CreditCardExpiration__c!=null &&
              this.zuora__CreditCardExpiration__c.equals(other.getZuora__CreditCardExpiration__c()))) &&
            ((this.zuora__CreditCardNumber__c==null && other.getZuora__CreditCardNumber__c()==null) || 
             (this.zuora__CreditCardNumber__c!=null &&
              this.zuora__CreditCardNumber__c.equals(other.getZuora__CreditCardNumber__c()))) &&
            ((this.zuora__CreditCardType__c==null && other.getZuora__CreditCardType__c()==null) || 
             (this.zuora__CreditCardType__c!=null &&
              this.zuora__CreditCardType__c.equals(other.getZuora__CreditCardType__c()))) &&
            ((this.zuora__CreditCard_Expiration__c==null && other.getZuora__CreditCard_Expiration__c()==null) || 
             (this.zuora__CreditCard_Expiration__c!=null &&
              this.zuora__CreditCard_Expiration__c.equals(other.getZuora__CreditCard_Expiration__c()))) &&
            ((this.zuora__CreditCard_Number__c==null && other.getZuora__CreditCard_Number__c()==null) || 
             (this.zuora__CreditCard_Number__c!=null &&
              this.zuora__CreditCard_Number__c.equals(other.getZuora__CreditCard_Number__c()))) &&
            ((this.zuora__Credit_Balance__c==null && other.getZuora__Credit_Balance__c()==null) || 
             (this.zuora__Credit_Balance__c!=null &&
              this.zuora__Credit_Balance__c.equals(other.getZuora__Credit_Balance__c()))) &&
            ((this.zuora__Currency__c==null && other.getZuora__Currency__c()==null) || 
             (this.zuora__Currency__c!=null &&
              this.zuora__Currency__c.equals(other.getZuora__Currency__c()))) &&
            ((this.zuora__CustomerServiceRepName__c==null && other.getZuora__CustomerServiceRepName__c()==null) || 
             (this.zuora__CustomerServiceRepName__c!=null &&
              this.zuora__CustomerServiceRepName__c.equals(other.getZuora__CustomerServiceRepName__c()))) &&
            ((this.zuora__DefaultPaymentMethod__c==null && other.getZuora__DefaultPaymentMethod__c()==null) || 
             (this.zuora__DefaultPaymentMethod__c!=null &&
              this.zuora__DefaultPaymentMethod__c.equals(other.getZuora__DefaultPaymentMethod__c()))) &&
            ((this.zuora__Default_Payment_Method__c==null && other.getZuora__Default_Payment_Method__c()==null) || 
             (this.zuora__Default_Payment_Method__c!=null &&
              this.zuora__Default_Payment_Method__c.equals(other.getZuora__Default_Payment_Method__c()))) &&
            ((this.zuora__Default_Payment_Method__r==null && other.getZuora__Default_Payment_Method__r()==null) || 
             (this.zuora__Default_Payment_Method__r!=null &&
              this.zuora__Default_Payment_Method__r.equals(other.getZuora__Default_Payment_Method__r()))) &&
            ((this.zuora__External_Id__c==null && other.getZuora__External_Id__c()==null) || 
             (this.zuora__External_Id__c!=null &&
              this.zuora__External_Id__c.equals(other.getZuora__External_Id__c()))) &&
            ((this.zuora__Is_Crm_Id_Change_Processed__c==null && other.getZuora__Is_Crm_Id_Change_Processed__c()==null) || 
             (this.zuora__Is_Crm_Id_Change_Processed__c!=null &&
              this.zuora__Is_Crm_Id_Change_Processed__c.equals(other.getZuora__Is_Crm_Id_Change_Processed__c()))) &&
            ((this.zuora__LastInvoiceDate__c==null && other.getZuora__LastInvoiceDate__c()==null) || 
             (this.zuora__LastInvoiceDate__c!=null &&
              this.zuora__LastInvoiceDate__c.equals(other.getZuora__LastInvoiceDate__c()))) &&
            ((this.zuora__MRR__c==null && other.getZuora__MRR__c()==null) || 
             (this.zuora__MRR__c!=null &&
              this.zuora__MRR__c.equals(other.getZuora__MRR__c()))) &&
            ((this.zuora__Parent__c==null && other.getZuora__Parent__c()==null) || 
             (this.zuora__Parent__c!=null &&
              this.zuora__Parent__c.equals(other.getZuora__Parent__c()))) &&
            ((this.zuora__Parent__r==null && other.getZuora__Parent__r()==null) || 
             (this.zuora__Parent__r!=null &&
              this.zuora__Parent__r.equals(other.getZuora__Parent__r()))) &&
            ((this.zuora__PaymentMethodType__c==null && other.getZuora__PaymentMethodType__c()==null) || 
             (this.zuora__PaymentMethodType__c!=null &&
              this.zuora__PaymentMethodType__c.equals(other.getZuora__PaymentMethodType__c()))) &&
            ((this.zuora__PaymentMethod_Type__c==null && other.getZuora__PaymentMethod_Type__c()==null) || 
             (this.zuora__PaymentMethod_Type__c!=null &&
              this.zuora__PaymentMethod_Type__c.equals(other.getZuora__PaymentMethod_Type__c()))) &&
            ((this.zuora__PaymentTerm__c==null && other.getZuora__PaymentTerm__c()==null) || 
             (this.zuora__PaymentTerm__c!=null &&
              this.zuora__PaymentTerm__c.equals(other.getZuora__PaymentTerm__c()))) &&
            ((this.zuora__Payment_Methods__r==null && other.getZuora__Payment_Methods__r()==null) || 
             (this.zuora__Payment_Methods__r!=null &&
              this.zuora__Payment_Methods__r.equals(other.getZuora__Payment_Methods__r()))) &&
            ((this.zuora__Payment_Term_Formula__c==null && other.getZuora__Payment_Term_Formula__c()==null) || 
             (this.zuora__Payment_Term_Formula__c!=null &&
              this.zuora__Payment_Term_Formula__c.equals(other.getZuora__Payment_Term_Formula__c()))) &&
            ((this.zuora__Payment_Term__c==null && other.getZuora__Payment_Term__c()==null) || 
             (this.zuora__Payment_Term__c!=null &&
              this.zuora__Payment_Term__c.equals(other.getZuora__Payment_Term__c()))) &&
            ((this.zuora__Payment_Term__r==null && other.getZuora__Payment_Term__r()==null) || 
             (this.zuora__Payment_Term__r!=null &&
              this.zuora__Payment_Term__r.equals(other.getZuora__Payment_Term__r()))) &&
            ((this.zuora__Payments__r==null && other.getZuora__Payments__r()==null) || 
             (this.zuora__Payments__r!=null &&
              this.zuora__Payments__r.equals(other.getZuora__Payments__r()))) &&
            ((this.zuora__PurchaseOrderNumber__c==null && other.getZuora__PurchaseOrderNumber__c()==null) || 
             (this.zuora__PurchaseOrderNumber__c!=null &&
              this.zuora__PurchaseOrderNumber__c.equals(other.getZuora__PurchaseOrderNumber__c()))) &&
            ((this.zuora__Refunds__r==null && other.getZuora__Refunds__r()==null) || 
             (this.zuora__Refunds__r!=null &&
              this.zuora__Refunds__r.equals(other.getZuora__Refunds__r()))) &&
            ((this.zuora__SalesRepName__c==null && other.getZuora__SalesRepName__c()==null) || 
             (this.zuora__SalesRepName__c!=null &&
              this.zuora__SalesRepName__c.equals(other.getZuora__SalesRepName__c()))) &&
            ((this.zuora__SoldToId__c==null && other.getZuora__SoldToId__c()==null) || 
             (this.zuora__SoldToId__c!=null &&
              this.zuora__SoldToId__c.equals(other.getZuora__SoldToId__c()))) &&
            ((this.zuora__SoldToName__c==null && other.getZuora__SoldToName__c()==null) || 
             (this.zuora__SoldToName__c!=null &&
              this.zuora__SoldToName__c.equals(other.getZuora__SoldToName__c()))) &&
            ((this.zuora__Status__c==null && other.getZuora__Status__c()==null) || 
             (this.zuora__Status__c!=null &&
              this.zuora__Status__c.equals(other.getZuora__Status__c()))) &&
            ((this.zuora__Subscriptions1__r==null && other.getZuora__Subscriptions1__r()==null) || 
             (this.zuora__Subscriptions1__r!=null &&
              this.zuora__Subscriptions1__r.equals(other.getZuora__Subscriptions1__r()))) &&
            ((this.zuora__Subscriptions__r==null && other.getZuora__Subscriptions__r()==null) || 
             (this.zuora__Subscriptions__r!=null &&
              this.zuora__Subscriptions__r.equals(other.getZuora__Subscriptions__r()))) &&
            ((this.zuora__ZInvoices__r==null && other.getZuora__ZInvoices__r()==null) || 
             (this.zuora__ZInvoices__r!=null &&
              this.zuora__ZInvoices__r.equals(other.getZuora__ZInvoices__r()))) &&
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
        if (getCredit_Card_Capture_Link__c() != null) {
            _hashCode += getCredit_Card_Capture_Link__c().hashCode();
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
        if (getHistories() != null) {
            _hashCode += getHistories().hashCode();
        }
        if (getIntacct_Customer_ID__c() != null) {
            _hashCode += getIntacct_Customer_ID__c().hashCode();
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
        if (getSend_Email__c() != null) {
            _hashCode += getSend_Email__c().hashCode();
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
        if (getZuora__AccountNumber__c() != null) {
            _hashCode += getZuora__AccountNumber__c().hashCode();
        }
        if (getZuora__Account__c() != null) {
            _hashCode += getZuora__Account__c().hashCode();
        }
        if (getZuora__Account__r() != null) {
            _hashCode += getZuora__Account__r().hashCode();
        }
        if (getZuora__AutoPay__c() != null) {
            _hashCode += getZuora__AutoPay__c().hashCode();
        }
        if (getZuora__Balance__c() != null) {
            _hashCode += getZuora__Balance__c().hashCode();
        }
        if (getZuora__Batch__c() != null) {
            _hashCode += getZuora__Batch__c().hashCode();
        }
        if (getZuora__BillCycleDay__c() != null) {
            _hashCode += getZuora__BillCycleDay__c().hashCode();
        }
        if (getZuora__BillToAddress1__c() != null) {
            _hashCode += getZuora__BillToAddress1__c().hashCode();
        }
        if (getZuora__BillToAddress2__c() != null) {
            _hashCode += getZuora__BillToAddress2__c().hashCode();
        }
        if (getZuora__BillToCity__c() != null) {
            _hashCode += getZuora__BillToCity__c().hashCode();
        }
        if (getZuora__BillToCountry__c() != null) {
            _hashCode += getZuora__BillToCountry__c().hashCode();
        }
        if (getZuora__BillToFax__c() != null) {
            _hashCode += getZuora__BillToFax__c().hashCode();
        }
        if (getZuora__BillToId__c() != null) {
            _hashCode += getZuora__BillToId__c().hashCode();
        }
        if (getZuora__BillToName__c() != null) {
            _hashCode += getZuora__BillToName__c().hashCode();
        }
        if (getZuora__BillToPostalCode__c() != null) {
            _hashCode += getZuora__BillToPostalCode__c().hashCode();
        }
        if (getZuora__BillToState__c() != null) {
            _hashCode += getZuora__BillToState__c().hashCode();
        }
        if (getZuora__BillToWorkEmail__c() != null) {
            _hashCode += getZuora__BillToWorkEmail__c().hashCode();
        }
        if (getZuora__BillToWorkPhone__c() != null) {
            _hashCode += getZuora__BillToWorkPhone__c().hashCode();
        }
        if (getZuora__Children__r() != null) {
            _hashCode += getZuora__Children__r().hashCode();
        }
        if (getZuora__CreditBalance__c() != null) {
            _hashCode += getZuora__CreditBalance__c().hashCode();
        }
        if (getZuora__CreditCardExpiration__c() != null) {
            _hashCode += getZuora__CreditCardExpiration__c().hashCode();
        }
        if (getZuora__CreditCardNumber__c() != null) {
            _hashCode += getZuora__CreditCardNumber__c().hashCode();
        }
        if (getZuora__CreditCardType__c() != null) {
            _hashCode += getZuora__CreditCardType__c().hashCode();
        }
        if (getZuora__CreditCard_Expiration__c() != null) {
            _hashCode += getZuora__CreditCard_Expiration__c().hashCode();
        }
        if (getZuora__CreditCard_Number__c() != null) {
            _hashCode += getZuora__CreditCard_Number__c().hashCode();
        }
        if (getZuora__Credit_Balance__c() != null) {
            _hashCode += getZuora__Credit_Balance__c().hashCode();
        }
        if (getZuora__Currency__c() != null) {
            _hashCode += getZuora__Currency__c().hashCode();
        }
        if (getZuora__CustomerServiceRepName__c() != null) {
            _hashCode += getZuora__CustomerServiceRepName__c().hashCode();
        }
        if (getZuora__DefaultPaymentMethod__c() != null) {
            _hashCode += getZuora__DefaultPaymentMethod__c().hashCode();
        }
        if (getZuora__Default_Payment_Method__c() != null) {
            _hashCode += getZuora__Default_Payment_Method__c().hashCode();
        }
        if (getZuora__Default_Payment_Method__r() != null) {
            _hashCode += getZuora__Default_Payment_Method__r().hashCode();
        }
        if (getZuora__External_Id__c() != null) {
            _hashCode += getZuora__External_Id__c().hashCode();
        }
        if (getZuora__Is_Crm_Id_Change_Processed__c() != null) {
            _hashCode += getZuora__Is_Crm_Id_Change_Processed__c().hashCode();
        }
        if (getZuora__LastInvoiceDate__c() != null) {
            _hashCode += getZuora__LastInvoiceDate__c().hashCode();
        }
        if (getZuora__MRR__c() != null) {
            _hashCode += getZuora__MRR__c().hashCode();
        }
        if (getZuora__Parent__c() != null) {
            _hashCode += getZuora__Parent__c().hashCode();
        }
        if (getZuora__Parent__r() != null) {
            _hashCode += getZuora__Parent__r().hashCode();
        }
        if (getZuora__PaymentMethodType__c() != null) {
            _hashCode += getZuora__PaymentMethodType__c().hashCode();
        }
        if (getZuora__PaymentMethod_Type__c() != null) {
            _hashCode += getZuora__PaymentMethod_Type__c().hashCode();
        }
        if (getZuora__PaymentTerm__c() != null) {
            _hashCode += getZuora__PaymentTerm__c().hashCode();
        }
        if (getZuora__Payment_Methods__r() != null) {
            _hashCode += getZuora__Payment_Methods__r().hashCode();
        }
        if (getZuora__Payment_Term_Formula__c() != null) {
            _hashCode += getZuora__Payment_Term_Formula__c().hashCode();
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
        if (getZuora__PurchaseOrderNumber__c() != null) {
            _hashCode += getZuora__PurchaseOrderNumber__c().hashCode();
        }
        if (getZuora__Refunds__r() != null) {
            _hashCode += getZuora__Refunds__r().hashCode();
        }
        if (getZuora__SalesRepName__c() != null) {
            _hashCode += getZuora__SalesRepName__c().hashCode();
        }
        if (getZuora__SoldToId__c() != null) {
            _hashCode += getZuora__SoldToId__c().hashCode();
        }
        if (getZuora__SoldToName__c() != null) {
            _hashCode += getZuora__SoldToName__c().hashCode();
        }
        if (getZuora__Status__c() != null) {
            _hashCode += getZuora__Status__c().hashCode();
        }
        if (getZuora__Subscriptions1__r() != null) {
            _hashCode += getZuora__Subscriptions1__r().hashCode();
        }
        if (getZuora__Subscriptions__r() != null) {
            _hashCode += getZuora__Subscriptions__r().hashCode();
        }
        if (getZuora__ZInvoices__r() != null) {
            _hashCode += getZuora__ZInvoices__r().hashCode();
        }
        if (getZuora__Zuora_Id__c() != null) {
            _hashCode += getZuora__Zuora_Id__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Zuora__CustomerAccount__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__CustomerAccount__c"));
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
        elemField.setFieldName("credit_Card_Capture_Link__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Credit_Card_Capture_Link__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("histories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Histories"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intacct_Customer_ID__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Intacct_Customer_ID__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("send_Email__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Send_Email__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("zuora__AccountNumber__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__AccountNumber__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("zuora__AutoPay__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__AutoPay__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("zuora__Batch__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Batch__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__BillCycleDay__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__BillCycleDay__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__BillToAddress1__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__BillToAddress1__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__BillToAddress2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__BillToAddress2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__BillToCity__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__BillToCity__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__BillToCountry__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__BillToCountry__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__BillToFax__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__BillToFax__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("zuora__BillToName__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__BillToName__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__BillToPostalCode__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__BillToPostalCode__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__BillToState__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__BillToState__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__BillToWorkEmail__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__BillToWorkEmail__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__BillToWorkPhone__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__BillToWorkPhone__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__Children__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Children__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__CreditBalance__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__CreditBalance__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__CreditCardExpiration__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__CreditCardExpiration__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__CreditCardNumber__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__CreditCardNumber__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__CreditCardType__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__CreditCardType__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__CreditCard_Expiration__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__CreditCard_Expiration__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__CreditCard_Number__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__CreditCard_Number__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__Credit_Balance__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Credit_Balance__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__Currency__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Currency__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__CustomerServiceRepName__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__CustomerServiceRepName__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__DefaultPaymentMethod__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__DefaultPaymentMethod__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__Default_Payment_Method__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Default_Payment_Method__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__Default_Payment_Method__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Default_Payment_Method__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__PaymentMethod__c"));
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
        elemField.setFieldName("zuora__Is_Crm_Id_Change_Processed__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Is_Crm_Id_Change_Processed__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__LastInvoiceDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__LastInvoiceDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("zuora__Parent__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Parent__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__Parent__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Parent__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__CustomerAccount__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__PaymentMethodType__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__PaymentMethodType__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__PaymentMethod_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__PaymentMethod_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("zuora__Payment_Methods__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Payment_Methods__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__Payment_Term_Formula__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Payment_Term_Formula__c"));
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
        elemField.setFieldName("zuora__PurchaseOrderNumber__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__PurchaseOrderNumber__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("zuora__SalesRepName__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__SalesRepName__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("zuora__SoldToName__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__SoldToName__c"));
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
        elemField.setFieldName("zuora__Subscriptions1__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Subscriptions1__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__Subscriptions__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Subscriptions__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__ZInvoices__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__ZInvoices__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
