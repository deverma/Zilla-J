/**
 * Zuora__PaymentMethod__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Zuora__PaymentMethod__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
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

    private java.lang.String zuora__AchAbaCode__c;

    private java.lang.String zuora__AchAccountName__c;

    private java.lang.String zuora__AchAccountNumberMask__c;

    private java.lang.String zuora__AchAccountType__c;

    private java.lang.String zuora__AchBankName__c;

    private java.lang.Boolean zuora__Active__c;

    private java.lang.String zuora__BankBranchCode__c;

    private java.lang.String zuora__BankCheckDigit__c;

    private java.lang.String zuora__BankCity__c;

    private java.lang.String zuora__BankCode__c;

    private java.lang.String zuora__BankIdentificationNumber__c;

    private java.lang.String zuora__BankName__c;

    private java.lang.String zuora__BankPostalCode__c;

    private java.lang.String zuora__BankStreetName__c;

    private java.lang.String zuora__BankStreetNumber__c;

    private java.lang.String zuora__BankTransferAccountName__c;

    private java.lang.String zuora__BankTransferAccountNumber__c;

    private java.lang.String zuora__BankTransferAccountType__c;

    private java.lang.String zuora__BankTransferType__c;

    private java.lang.String zuora__BillingAccount__c;

    private com.sforce.soap.enterprise.sobject.Zuora__CustomerAccount__c zuora__BillingAccount__r;

    private com.sforce.soap.enterprise.QueryResult zuora__Billing_Accounts__r;

    private java.lang.String zuora__BusinessIdentificationCode__c;

    private java.lang.String zuora__City__c;

    private java.lang.String zuora__Country__c;

    private java.lang.String zuora__CreatedById__c;

    private java.util.Calendar zuora__CreatedDate__c;

    private java.lang.String zuora__CreditCardAddress1__c;

    private java.lang.String zuora__CreditCardAddress2__c;

    private java.lang.String zuora__CreditCardCity__c;

    private java.lang.String zuora__CreditCardCountry__c;

    private java.lang.String zuora__CreditCardExpirationMonth__c;

    private java.lang.String zuora__CreditCardExpirationYear__c;

    private java.lang.String zuora__CreditCardHolderName__c;

    private java.lang.String zuora__CreditCardMaskNumber__c;

    private java.lang.String zuora__CreditCardPostalCode__c;

    private java.lang.String zuora__CreditCardState__c;

    private java.lang.String zuora__CreditCardType__c;

    private java.lang.Boolean zuora__DefaultPaymentMethod__c;

    private java.lang.String zuora__DeviceSessionId__c;

    private java.lang.String zuora__Email__c;

    private java.lang.String zuora__ExistingMandate__c;

    private java.lang.String zuora__External_Id__c;

    private java.lang.String zuora__FirstName__c;

    private java.lang.String zuora__IBAN__c;

    private java.lang.String zuora__IPAddress__c;

    private java.util.Calendar zuora__LastFailedSaleTransactionDate__c;

    private java.lang.String zuora__LastName__c;

    private java.util.Calendar zuora__LastTransactionDateTime__c;

    private java.lang.String zuora__LastTransactionStatus__c;

    private java.util.Calendar zuora__MandateCreationDate__c;

    private java.lang.String zuora__MandateID__c;

    private java.lang.String zuora__MandateReceived__c;

    private java.util.Calendar zuora__MandateUpdateDate__c;

    private java.lang.Double zuora__MaxConsecutivePaymentFailures__c;

    private java.lang.String zuora__Name__c;

    private java.lang.Double zuora__NumConsecutiveFailures__c;

    private java.lang.String zuora__PaymentMethodStatus__c;

    private java.lang.Double zuora__PaymentRetryWindow__c;

    private java.lang.String zuora__PaypalBaid__c;

    private java.lang.String zuora__PaypalEmail__c;

    private java.lang.String zuora__PaypalPreapprovalKey__c;

    private java.lang.String zuora__PaypalType__c;

    private java.lang.String zuora__Phone__c;

    private java.lang.String zuora__PostalCode__c;

    private java.lang.String zuora__State__c;

    private java.lang.String zuora__StreetName__c;

    private java.lang.String zuora__StreetNumber__c;

    private java.lang.Double zuora__TotalNumberOfErrorPayments__c;

    private java.lang.Double zuora__TotalNumberOfProcessedPayments__c;

    private java.lang.String zuora__Type__c;

    private java.lang.String zuora__UpdatedById__c;

    private java.util.Calendar zuora__UpdatedDate__c;

    private java.lang.Boolean zuora__UseDefaultRetryRule__c;

    public Zuora__PaymentMethod__c() {
    }

    public Zuora__PaymentMethod__c(
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
           java.lang.String zuora__AchAbaCode__c,
           java.lang.String zuora__AchAccountName__c,
           java.lang.String zuora__AchAccountNumberMask__c,
           java.lang.String zuora__AchAccountType__c,
           java.lang.String zuora__AchBankName__c,
           java.lang.Boolean zuora__Active__c,
           java.lang.String zuora__BankBranchCode__c,
           java.lang.String zuora__BankCheckDigit__c,
           java.lang.String zuora__BankCity__c,
           java.lang.String zuora__BankCode__c,
           java.lang.String zuora__BankIdentificationNumber__c,
           java.lang.String zuora__BankName__c,
           java.lang.String zuora__BankPostalCode__c,
           java.lang.String zuora__BankStreetName__c,
           java.lang.String zuora__BankStreetNumber__c,
           java.lang.String zuora__BankTransferAccountName__c,
           java.lang.String zuora__BankTransferAccountNumber__c,
           java.lang.String zuora__BankTransferAccountType__c,
           java.lang.String zuora__BankTransferType__c,
           java.lang.String zuora__BillingAccount__c,
           com.sforce.soap.enterprise.sobject.Zuora__CustomerAccount__c zuora__BillingAccount__r,
           com.sforce.soap.enterprise.QueryResult zuora__Billing_Accounts__r,
           java.lang.String zuora__BusinessIdentificationCode__c,
           java.lang.String zuora__City__c,
           java.lang.String zuora__Country__c,
           java.lang.String zuora__CreatedById__c,
           java.util.Calendar zuora__CreatedDate__c,
           java.lang.String zuora__CreditCardAddress1__c,
           java.lang.String zuora__CreditCardAddress2__c,
           java.lang.String zuora__CreditCardCity__c,
           java.lang.String zuora__CreditCardCountry__c,
           java.lang.String zuora__CreditCardExpirationMonth__c,
           java.lang.String zuora__CreditCardExpirationYear__c,
           java.lang.String zuora__CreditCardHolderName__c,
           java.lang.String zuora__CreditCardMaskNumber__c,
           java.lang.String zuora__CreditCardPostalCode__c,
           java.lang.String zuora__CreditCardState__c,
           java.lang.String zuora__CreditCardType__c,
           java.lang.Boolean zuora__DefaultPaymentMethod__c,
           java.lang.String zuora__DeviceSessionId__c,
           java.lang.String zuora__Email__c,
           java.lang.String zuora__ExistingMandate__c,
           java.lang.String zuora__External_Id__c,
           java.lang.String zuora__FirstName__c,
           java.lang.String zuora__IBAN__c,
           java.lang.String zuora__IPAddress__c,
           java.util.Calendar zuora__LastFailedSaleTransactionDate__c,
           java.lang.String zuora__LastName__c,
           java.util.Calendar zuora__LastTransactionDateTime__c,
           java.lang.String zuora__LastTransactionStatus__c,
           java.util.Calendar zuora__MandateCreationDate__c,
           java.lang.String zuora__MandateID__c,
           java.lang.String zuora__MandateReceived__c,
           java.util.Calendar zuora__MandateUpdateDate__c,
           java.lang.Double zuora__MaxConsecutivePaymentFailures__c,
           java.lang.String zuora__Name__c,
           java.lang.Double zuora__NumConsecutiveFailures__c,
           java.lang.String zuora__PaymentMethodStatus__c,
           java.lang.Double zuora__PaymentRetryWindow__c,
           java.lang.String zuora__PaypalBaid__c,
           java.lang.String zuora__PaypalEmail__c,
           java.lang.String zuora__PaypalPreapprovalKey__c,
           java.lang.String zuora__PaypalType__c,
           java.lang.String zuora__Phone__c,
           java.lang.String zuora__PostalCode__c,
           java.lang.String zuora__State__c,
           java.lang.String zuora__StreetName__c,
           java.lang.String zuora__StreetNumber__c,
           java.lang.Double zuora__TotalNumberOfErrorPayments__c,
           java.lang.Double zuora__TotalNumberOfProcessedPayments__c,
           java.lang.String zuora__Type__c,
           java.lang.String zuora__UpdatedById__c,
           java.util.Calendar zuora__UpdatedDate__c,
           java.lang.Boolean zuora__UseDefaultRetryRule__c) {
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
        this.zuora__AchAbaCode__c = zuora__AchAbaCode__c;
        this.zuora__AchAccountName__c = zuora__AchAccountName__c;
        this.zuora__AchAccountNumberMask__c = zuora__AchAccountNumberMask__c;
        this.zuora__AchAccountType__c = zuora__AchAccountType__c;
        this.zuora__AchBankName__c = zuora__AchBankName__c;
        this.zuora__Active__c = zuora__Active__c;
        this.zuora__BankBranchCode__c = zuora__BankBranchCode__c;
        this.zuora__BankCheckDigit__c = zuora__BankCheckDigit__c;
        this.zuora__BankCity__c = zuora__BankCity__c;
        this.zuora__BankCode__c = zuora__BankCode__c;
        this.zuora__BankIdentificationNumber__c = zuora__BankIdentificationNumber__c;
        this.zuora__BankName__c = zuora__BankName__c;
        this.zuora__BankPostalCode__c = zuora__BankPostalCode__c;
        this.zuora__BankStreetName__c = zuora__BankStreetName__c;
        this.zuora__BankStreetNumber__c = zuora__BankStreetNumber__c;
        this.zuora__BankTransferAccountName__c = zuora__BankTransferAccountName__c;
        this.zuora__BankTransferAccountNumber__c = zuora__BankTransferAccountNumber__c;
        this.zuora__BankTransferAccountType__c = zuora__BankTransferAccountType__c;
        this.zuora__BankTransferType__c = zuora__BankTransferType__c;
        this.zuora__BillingAccount__c = zuora__BillingAccount__c;
        this.zuora__BillingAccount__r = zuora__BillingAccount__r;
        this.zuora__Billing_Accounts__r = zuora__Billing_Accounts__r;
        this.zuora__BusinessIdentificationCode__c = zuora__BusinessIdentificationCode__c;
        this.zuora__City__c = zuora__City__c;
        this.zuora__Country__c = zuora__Country__c;
        this.zuora__CreatedById__c = zuora__CreatedById__c;
        this.zuora__CreatedDate__c = zuora__CreatedDate__c;
        this.zuora__CreditCardAddress1__c = zuora__CreditCardAddress1__c;
        this.zuora__CreditCardAddress2__c = zuora__CreditCardAddress2__c;
        this.zuora__CreditCardCity__c = zuora__CreditCardCity__c;
        this.zuora__CreditCardCountry__c = zuora__CreditCardCountry__c;
        this.zuora__CreditCardExpirationMonth__c = zuora__CreditCardExpirationMonth__c;
        this.zuora__CreditCardExpirationYear__c = zuora__CreditCardExpirationYear__c;
        this.zuora__CreditCardHolderName__c = zuora__CreditCardHolderName__c;
        this.zuora__CreditCardMaskNumber__c = zuora__CreditCardMaskNumber__c;
        this.zuora__CreditCardPostalCode__c = zuora__CreditCardPostalCode__c;
        this.zuora__CreditCardState__c = zuora__CreditCardState__c;
        this.zuora__CreditCardType__c = zuora__CreditCardType__c;
        this.zuora__DefaultPaymentMethod__c = zuora__DefaultPaymentMethod__c;
        this.zuora__DeviceSessionId__c = zuora__DeviceSessionId__c;
        this.zuora__Email__c = zuora__Email__c;
        this.zuora__ExistingMandate__c = zuora__ExistingMandate__c;
        this.zuora__External_Id__c = zuora__External_Id__c;
        this.zuora__FirstName__c = zuora__FirstName__c;
        this.zuora__IBAN__c = zuora__IBAN__c;
        this.zuora__IPAddress__c = zuora__IPAddress__c;
        this.zuora__LastFailedSaleTransactionDate__c = zuora__LastFailedSaleTransactionDate__c;
        this.zuora__LastName__c = zuora__LastName__c;
        this.zuora__LastTransactionDateTime__c = zuora__LastTransactionDateTime__c;
        this.zuora__LastTransactionStatus__c = zuora__LastTransactionStatus__c;
        this.zuora__MandateCreationDate__c = zuora__MandateCreationDate__c;
        this.zuora__MandateID__c = zuora__MandateID__c;
        this.zuora__MandateReceived__c = zuora__MandateReceived__c;
        this.zuora__MandateUpdateDate__c = zuora__MandateUpdateDate__c;
        this.zuora__MaxConsecutivePaymentFailures__c = zuora__MaxConsecutivePaymentFailures__c;
        this.zuora__Name__c = zuora__Name__c;
        this.zuora__NumConsecutiveFailures__c = zuora__NumConsecutiveFailures__c;
        this.zuora__PaymentMethodStatus__c = zuora__PaymentMethodStatus__c;
        this.zuora__PaymentRetryWindow__c = zuora__PaymentRetryWindow__c;
        this.zuora__PaypalBaid__c = zuora__PaypalBaid__c;
        this.zuora__PaypalEmail__c = zuora__PaypalEmail__c;
        this.zuora__PaypalPreapprovalKey__c = zuora__PaypalPreapprovalKey__c;
        this.zuora__PaypalType__c = zuora__PaypalType__c;
        this.zuora__Phone__c = zuora__Phone__c;
        this.zuora__PostalCode__c = zuora__PostalCode__c;
        this.zuora__State__c = zuora__State__c;
        this.zuora__StreetName__c = zuora__StreetName__c;
        this.zuora__StreetNumber__c = zuora__StreetNumber__c;
        this.zuora__TotalNumberOfErrorPayments__c = zuora__TotalNumberOfErrorPayments__c;
        this.zuora__TotalNumberOfProcessedPayments__c = zuora__TotalNumberOfProcessedPayments__c;
        this.zuora__Type__c = zuora__Type__c;
        this.zuora__UpdatedById__c = zuora__UpdatedById__c;
        this.zuora__UpdatedDate__c = zuora__UpdatedDate__c;
        this.zuora__UseDefaultRetryRule__c = zuora__UseDefaultRetryRule__c;
    }


    /**
     * Gets the attachedContentDocuments value for this Zuora__PaymentMethod__c.
     * 
     * @return attachedContentDocuments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachedContentDocuments() {
        return attachedContentDocuments;
    }


    /**
     * Sets the attachedContentDocuments value for this Zuora__PaymentMethod__c.
     * 
     * @param attachedContentDocuments
     */
    public void setAttachedContentDocuments(com.sforce.soap.enterprise.QueryResult attachedContentDocuments) {
        this.attachedContentDocuments = attachedContentDocuments;
    }


    /**
     * Gets the attachments value for this Zuora__PaymentMethod__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Zuora__PaymentMethod__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the combinedAttachments value for this Zuora__PaymentMethod__c.
     * 
     * @return combinedAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getCombinedAttachments() {
        return combinedAttachments;
    }


    /**
     * Sets the combinedAttachments value for this Zuora__PaymentMethod__c.
     * 
     * @param combinedAttachments
     */
    public void setCombinedAttachments(com.sforce.soap.enterprise.QueryResult combinedAttachments) {
        this.combinedAttachments = combinedAttachments;
    }


    /**
     * Gets the createdBy value for this Zuora__PaymentMethod__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Zuora__PaymentMethod__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Zuora__PaymentMethod__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Zuora__PaymentMethod__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Zuora__PaymentMethod__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Zuora__PaymentMethod__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the duplicateRecordItems value for this Zuora__PaymentMethod__c.
     * 
     * @return duplicateRecordItems
     */
    public com.sforce.soap.enterprise.QueryResult getDuplicateRecordItems() {
        return duplicateRecordItems;
    }


    /**
     * Sets the duplicateRecordItems value for this Zuora__PaymentMethod__c.
     * 
     * @param duplicateRecordItems
     */
    public void setDuplicateRecordItems(com.sforce.soap.enterprise.QueryResult duplicateRecordItems) {
        this.duplicateRecordItems = duplicateRecordItems;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Zuora__PaymentMethod__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Zuora__PaymentMethod__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the isDeleted value for this Zuora__PaymentMethod__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Zuora__PaymentMethod__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this Zuora__PaymentMethod__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Zuora__PaymentMethod__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Zuora__PaymentMethod__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Zuora__PaymentMethod__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Zuora__PaymentMethod__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Zuora__PaymentMethod__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lookedUpFromActivities value for this Zuora__PaymentMethod__c.
     * 
     * @return lookedUpFromActivities
     */
    public com.sforce.soap.enterprise.QueryResult getLookedUpFromActivities() {
        return lookedUpFromActivities;
    }


    /**
     * Sets the lookedUpFromActivities value for this Zuora__PaymentMethod__c.
     * 
     * @param lookedUpFromActivities
     */
    public void setLookedUpFromActivities(com.sforce.soap.enterprise.QueryResult lookedUpFromActivities) {
        this.lookedUpFromActivities = lookedUpFromActivities;
    }


    /**
     * Gets the name value for this Zuora__PaymentMethod__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Zuora__PaymentMethod__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Zuora__PaymentMethod__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Zuora__PaymentMethod__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Zuora__PaymentMethod__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Zuora__PaymentMethod__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the processInstances value for this Zuora__PaymentMethod__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Zuora__PaymentMethod__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Zuora__PaymentMethod__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Zuora__PaymentMethod__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the recordAssociatedGroups value for this Zuora__PaymentMethod__c.
     * 
     * @return recordAssociatedGroups
     */
    public com.sforce.soap.enterprise.QueryResult getRecordAssociatedGroups() {
        return recordAssociatedGroups;
    }


    /**
     * Sets the recordAssociatedGroups value for this Zuora__PaymentMethod__c.
     * 
     * @param recordAssociatedGroups
     */
    public void setRecordAssociatedGroups(com.sforce.soap.enterprise.QueryResult recordAssociatedGroups) {
        this.recordAssociatedGroups = recordAssociatedGroups;
    }


    /**
     * Gets the systemModstamp value for this Zuora__PaymentMethod__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Zuora__PaymentMethod__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the topicAssignments value for this Zuora__PaymentMethod__c.
     * 
     * @return topicAssignments
     */
    public com.sforce.soap.enterprise.QueryResult getTopicAssignments() {
        return topicAssignments;
    }


    /**
     * Sets the topicAssignments value for this Zuora__PaymentMethod__c.
     * 
     * @param topicAssignments
     */
    public void setTopicAssignments(com.sforce.soap.enterprise.QueryResult topicAssignments) {
        this.topicAssignments = topicAssignments;
    }


    /**
     * Gets the userRecordAccess value for this Zuora__PaymentMethod__c.
     * 
     * @return userRecordAccess
     */
    public com.sforce.soap.enterprise.sobject.UserRecordAccess getUserRecordAccess() {
        return userRecordAccess;
    }


    /**
     * Sets the userRecordAccess value for this Zuora__PaymentMethod__c.
     * 
     * @param userRecordAccess
     */
    public void setUserRecordAccess(com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess) {
        this.userRecordAccess = userRecordAccess;
    }


    /**
     * Gets the zuora__AchAbaCode__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__AchAbaCode__c
     */
    public java.lang.String getZuora__AchAbaCode__c() {
        return zuora__AchAbaCode__c;
    }


    /**
     * Sets the zuora__AchAbaCode__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__AchAbaCode__c
     */
    public void setZuora__AchAbaCode__c(java.lang.String zuora__AchAbaCode__c) {
        this.zuora__AchAbaCode__c = zuora__AchAbaCode__c;
    }


    /**
     * Gets the zuora__AchAccountName__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__AchAccountName__c
     */
    public java.lang.String getZuora__AchAccountName__c() {
        return zuora__AchAccountName__c;
    }


    /**
     * Sets the zuora__AchAccountName__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__AchAccountName__c
     */
    public void setZuora__AchAccountName__c(java.lang.String zuora__AchAccountName__c) {
        this.zuora__AchAccountName__c = zuora__AchAccountName__c;
    }


    /**
     * Gets the zuora__AchAccountNumberMask__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__AchAccountNumberMask__c
     */
    public java.lang.String getZuora__AchAccountNumberMask__c() {
        return zuora__AchAccountNumberMask__c;
    }


    /**
     * Sets the zuora__AchAccountNumberMask__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__AchAccountNumberMask__c
     */
    public void setZuora__AchAccountNumberMask__c(java.lang.String zuora__AchAccountNumberMask__c) {
        this.zuora__AchAccountNumberMask__c = zuora__AchAccountNumberMask__c;
    }


    /**
     * Gets the zuora__AchAccountType__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__AchAccountType__c
     */
    public java.lang.String getZuora__AchAccountType__c() {
        return zuora__AchAccountType__c;
    }


    /**
     * Sets the zuora__AchAccountType__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__AchAccountType__c
     */
    public void setZuora__AchAccountType__c(java.lang.String zuora__AchAccountType__c) {
        this.zuora__AchAccountType__c = zuora__AchAccountType__c;
    }


    /**
     * Gets the zuora__AchBankName__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__AchBankName__c
     */
    public java.lang.String getZuora__AchBankName__c() {
        return zuora__AchBankName__c;
    }


    /**
     * Sets the zuora__AchBankName__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__AchBankName__c
     */
    public void setZuora__AchBankName__c(java.lang.String zuora__AchBankName__c) {
        this.zuora__AchBankName__c = zuora__AchBankName__c;
    }


    /**
     * Gets the zuora__Active__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__Active__c
     */
    public java.lang.Boolean getZuora__Active__c() {
        return zuora__Active__c;
    }


    /**
     * Sets the zuora__Active__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__Active__c
     */
    public void setZuora__Active__c(java.lang.Boolean zuora__Active__c) {
        this.zuora__Active__c = zuora__Active__c;
    }


    /**
     * Gets the zuora__BankBranchCode__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__BankBranchCode__c
     */
    public java.lang.String getZuora__BankBranchCode__c() {
        return zuora__BankBranchCode__c;
    }


    /**
     * Sets the zuora__BankBranchCode__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__BankBranchCode__c
     */
    public void setZuora__BankBranchCode__c(java.lang.String zuora__BankBranchCode__c) {
        this.zuora__BankBranchCode__c = zuora__BankBranchCode__c;
    }


    /**
     * Gets the zuora__BankCheckDigit__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__BankCheckDigit__c
     */
    public java.lang.String getZuora__BankCheckDigit__c() {
        return zuora__BankCheckDigit__c;
    }


    /**
     * Sets the zuora__BankCheckDigit__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__BankCheckDigit__c
     */
    public void setZuora__BankCheckDigit__c(java.lang.String zuora__BankCheckDigit__c) {
        this.zuora__BankCheckDigit__c = zuora__BankCheckDigit__c;
    }


    /**
     * Gets the zuora__BankCity__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__BankCity__c
     */
    public java.lang.String getZuora__BankCity__c() {
        return zuora__BankCity__c;
    }


    /**
     * Sets the zuora__BankCity__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__BankCity__c
     */
    public void setZuora__BankCity__c(java.lang.String zuora__BankCity__c) {
        this.zuora__BankCity__c = zuora__BankCity__c;
    }


    /**
     * Gets the zuora__BankCode__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__BankCode__c
     */
    public java.lang.String getZuora__BankCode__c() {
        return zuora__BankCode__c;
    }


    /**
     * Sets the zuora__BankCode__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__BankCode__c
     */
    public void setZuora__BankCode__c(java.lang.String zuora__BankCode__c) {
        this.zuora__BankCode__c = zuora__BankCode__c;
    }


    /**
     * Gets the zuora__BankIdentificationNumber__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__BankIdentificationNumber__c
     */
    public java.lang.String getZuora__BankIdentificationNumber__c() {
        return zuora__BankIdentificationNumber__c;
    }


    /**
     * Sets the zuora__BankIdentificationNumber__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__BankIdentificationNumber__c
     */
    public void setZuora__BankIdentificationNumber__c(java.lang.String zuora__BankIdentificationNumber__c) {
        this.zuora__BankIdentificationNumber__c = zuora__BankIdentificationNumber__c;
    }


    /**
     * Gets the zuora__BankName__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__BankName__c
     */
    public java.lang.String getZuora__BankName__c() {
        return zuora__BankName__c;
    }


    /**
     * Sets the zuora__BankName__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__BankName__c
     */
    public void setZuora__BankName__c(java.lang.String zuora__BankName__c) {
        this.zuora__BankName__c = zuora__BankName__c;
    }


    /**
     * Gets the zuora__BankPostalCode__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__BankPostalCode__c
     */
    public java.lang.String getZuora__BankPostalCode__c() {
        return zuora__BankPostalCode__c;
    }


    /**
     * Sets the zuora__BankPostalCode__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__BankPostalCode__c
     */
    public void setZuora__BankPostalCode__c(java.lang.String zuora__BankPostalCode__c) {
        this.zuora__BankPostalCode__c = zuora__BankPostalCode__c;
    }


    /**
     * Gets the zuora__BankStreetName__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__BankStreetName__c
     */
    public java.lang.String getZuora__BankStreetName__c() {
        return zuora__BankStreetName__c;
    }


    /**
     * Sets the zuora__BankStreetName__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__BankStreetName__c
     */
    public void setZuora__BankStreetName__c(java.lang.String zuora__BankStreetName__c) {
        this.zuora__BankStreetName__c = zuora__BankStreetName__c;
    }


    /**
     * Gets the zuora__BankStreetNumber__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__BankStreetNumber__c
     */
    public java.lang.String getZuora__BankStreetNumber__c() {
        return zuora__BankStreetNumber__c;
    }


    /**
     * Sets the zuora__BankStreetNumber__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__BankStreetNumber__c
     */
    public void setZuora__BankStreetNumber__c(java.lang.String zuora__BankStreetNumber__c) {
        this.zuora__BankStreetNumber__c = zuora__BankStreetNumber__c;
    }


    /**
     * Gets the zuora__BankTransferAccountName__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__BankTransferAccountName__c
     */
    public java.lang.String getZuora__BankTransferAccountName__c() {
        return zuora__BankTransferAccountName__c;
    }


    /**
     * Sets the zuora__BankTransferAccountName__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__BankTransferAccountName__c
     */
    public void setZuora__BankTransferAccountName__c(java.lang.String zuora__BankTransferAccountName__c) {
        this.zuora__BankTransferAccountName__c = zuora__BankTransferAccountName__c;
    }


    /**
     * Gets the zuora__BankTransferAccountNumber__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__BankTransferAccountNumber__c
     */
    public java.lang.String getZuora__BankTransferAccountNumber__c() {
        return zuora__BankTransferAccountNumber__c;
    }


    /**
     * Sets the zuora__BankTransferAccountNumber__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__BankTransferAccountNumber__c
     */
    public void setZuora__BankTransferAccountNumber__c(java.lang.String zuora__BankTransferAccountNumber__c) {
        this.zuora__BankTransferAccountNumber__c = zuora__BankTransferAccountNumber__c;
    }


    /**
     * Gets the zuora__BankTransferAccountType__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__BankTransferAccountType__c
     */
    public java.lang.String getZuora__BankTransferAccountType__c() {
        return zuora__BankTransferAccountType__c;
    }


    /**
     * Sets the zuora__BankTransferAccountType__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__BankTransferAccountType__c
     */
    public void setZuora__BankTransferAccountType__c(java.lang.String zuora__BankTransferAccountType__c) {
        this.zuora__BankTransferAccountType__c = zuora__BankTransferAccountType__c;
    }


    /**
     * Gets the zuora__BankTransferType__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__BankTransferType__c
     */
    public java.lang.String getZuora__BankTransferType__c() {
        return zuora__BankTransferType__c;
    }


    /**
     * Sets the zuora__BankTransferType__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__BankTransferType__c
     */
    public void setZuora__BankTransferType__c(java.lang.String zuora__BankTransferType__c) {
        this.zuora__BankTransferType__c = zuora__BankTransferType__c;
    }


    /**
     * Gets the zuora__BillingAccount__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__BillingAccount__c
     */
    public java.lang.String getZuora__BillingAccount__c() {
        return zuora__BillingAccount__c;
    }


    /**
     * Sets the zuora__BillingAccount__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__BillingAccount__c
     */
    public void setZuora__BillingAccount__c(java.lang.String zuora__BillingAccount__c) {
        this.zuora__BillingAccount__c = zuora__BillingAccount__c;
    }


    /**
     * Gets the zuora__BillingAccount__r value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__BillingAccount__r
     */
    public com.sforce.soap.enterprise.sobject.Zuora__CustomerAccount__c getZuora__BillingAccount__r() {
        return zuora__BillingAccount__r;
    }


    /**
     * Sets the zuora__BillingAccount__r value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__BillingAccount__r
     */
    public void setZuora__BillingAccount__r(com.sforce.soap.enterprise.sobject.Zuora__CustomerAccount__c zuora__BillingAccount__r) {
        this.zuora__BillingAccount__r = zuora__BillingAccount__r;
    }


    /**
     * Gets the zuora__Billing_Accounts__r value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__Billing_Accounts__r
     */
    public com.sforce.soap.enterprise.QueryResult getZuora__Billing_Accounts__r() {
        return zuora__Billing_Accounts__r;
    }


    /**
     * Sets the zuora__Billing_Accounts__r value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__Billing_Accounts__r
     */
    public void setZuora__Billing_Accounts__r(com.sforce.soap.enterprise.QueryResult zuora__Billing_Accounts__r) {
        this.zuora__Billing_Accounts__r = zuora__Billing_Accounts__r;
    }


    /**
     * Gets the zuora__BusinessIdentificationCode__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__BusinessIdentificationCode__c
     */
    public java.lang.String getZuora__BusinessIdentificationCode__c() {
        return zuora__BusinessIdentificationCode__c;
    }


    /**
     * Sets the zuora__BusinessIdentificationCode__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__BusinessIdentificationCode__c
     */
    public void setZuora__BusinessIdentificationCode__c(java.lang.String zuora__BusinessIdentificationCode__c) {
        this.zuora__BusinessIdentificationCode__c = zuora__BusinessIdentificationCode__c;
    }


    /**
     * Gets the zuora__City__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__City__c
     */
    public java.lang.String getZuora__City__c() {
        return zuora__City__c;
    }


    /**
     * Sets the zuora__City__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__City__c
     */
    public void setZuora__City__c(java.lang.String zuora__City__c) {
        this.zuora__City__c = zuora__City__c;
    }


    /**
     * Gets the zuora__Country__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__Country__c
     */
    public java.lang.String getZuora__Country__c() {
        return zuora__Country__c;
    }


    /**
     * Sets the zuora__Country__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__Country__c
     */
    public void setZuora__Country__c(java.lang.String zuora__Country__c) {
        this.zuora__Country__c = zuora__Country__c;
    }


    /**
     * Gets the zuora__CreatedById__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__CreatedById__c
     */
    public java.lang.String getZuora__CreatedById__c() {
        return zuora__CreatedById__c;
    }


    /**
     * Sets the zuora__CreatedById__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__CreatedById__c
     */
    public void setZuora__CreatedById__c(java.lang.String zuora__CreatedById__c) {
        this.zuora__CreatedById__c = zuora__CreatedById__c;
    }


    /**
     * Gets the zuora__CreatedDate__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__CreatedDate__c
     */
    public java.util.Calendar getZuora__CreatedDate__c() {
        return zuora__CreatedDate__c;
    }


    /**
     * Sets the zuora__CreatedDate__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__CreatedDate__c
     */
    public void setZuora__CreatedDate__c(java.util.Calendar zuora__CreatedDate__c) {
        this.zuora__CreatedDate__c = zuora__CreatedDate__c;
    }


    /**
     * Gets the zuora__CreditCardAddress1__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__CreditCardAddress1__c
     */
    public java.lang.String getZuora__CreditCardAddress1__c() {
        return zuora__CreditCardAddress1__c;
    }


    /**
     * Sets the zuora__CreditCardAddress1__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__CreditCardAddress1__c
     */
    public void setZuora__CreditCardAddress1__c(java.lang.String zuora__CreditCardAddress1__c) {
        this.zuora__CreditCardAddress1__c = zuora__CreditCardAddress1__c;
    }


    /**
     * Gets the zuora__CreditCardAddress2__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__CreditCardAddress2__c
     */
    public java.lang.String getZuora__CreditCardAddress2__c() {
        return zuora__CreditCardAddress2__c;
    }


    /**
     * Sets the zuora__CreditCardAddress2__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__CreditCardAddress2__c
     */
    public void setZuora__CreditCardAddress2__c(java.lang.String zuora__CreditCardAddress2__c) {
        this.zuora__CreditCardAddress2__c = zuora__CreditCardAddress2__c;
    }


    /**
     * Gets the zuora__CreditCardCity__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__CreditCardCity__c
     */
    public java.lang.String getZuora__CreditCardCity__c() {
        return zuora__CreditCardCity__c;
    }


    /**
     * Sets the zuora__CreditCardCity__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__CreditCardCity__c
     */
    public void setZuora__CreditCardCity__c(java.lang.String zuora__CreditCardCity__c) {
        this.zuora__CreditCardCity__c = zuora__CreditCardCity__c;
    }


    /**
     * Gets the zuora__CreditCardCountry__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__CreditCardCountry__c
     */
    public java.lang.String getZuora__CreditCardCountry__c() {
        return zuora__CreditCardCountry__c;
    }


    /**
     * Sets the zuora__CreditCardCountry__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__CreditCardCountry__c
     */
    public void setZuora__CreditCardCountry__c(java.lang.String zuora__CreditCardCountry__c) {
        this.zuora__CreditCardCountry__c = zuora__CreditCardCountry__c;
    }


    /**
     * Gets the zuora__CreditCardExpirationMonth__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__CreditCardExpirationMonth__c
     */
    public java.lang.String getZuora__CreditCardExpirationMonth__c() {
        return zuora__CreditCardExpirationMonth__c;
    }


    /**
     * Sets the zuora__CreditCardExpirationMonth__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__CreditCardExpirationMonth__c
     */
    public void setZuora__CreditCardExpirationMonth__c(java.lang.String zuora__CreditCardExpirationMonth__c) {
        this.zuora__CreditCardExpirationMonth__c = zuora__CreditCardExpirationMonth__c;
    }


    /**
     * Gets the zuora__CreditCardExpirationYear__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__CreditCardExpirationYear__c
     */
    public java.lang.String getZuora__CreditCardExpirationYear__c() {
        return zuora__CreditCardExpirationYear__c;
    }


    /**
     * Sets the zuora__CreditCardExpirationYear__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__CreditCardExpirationYear__c
     */
    public void setZuora__CreditCardExpirationYear__c(java.lang.String zuora__CreditCardExpirationYear__c) {
        this.zuora__CreditCardExpirationYear__c = zuora__CreditCardExpirationYear__c;
    }


    /**
     * Gets the zuora__CreditCardHolderName__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__CreditCardHolderName__c
     */
    public java.lang.String getZuora__CreditCardHolderName__c() {
        return zuora__CreditCardHolderName__c;
    }


    /**
     * Sets the zuora__CreditCardHolderName__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__CreditCardHolderName__c
     */
    public void setZuora__CreditCardHolderName__c(java.lang.String zuora__CreditCardHolderName__c) {
        this.zuora__CreditCardHolderName__c = zuora__CreditCardHolderName__c;
    }


    /**
     * Gets the zuora__CreditCardMaskNumber__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__CreditCardMaskNumber__c
     */
    public java.lang.String getZuora__CreditCardMaskNumber__c() {
        return zuora__CreditCardMaskNumber__c;
    }


    /**
     * Sets the zuora__CreditCardMaskNumber__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__CreditCardMaskNumber__c
     */
    public void setZuora__CreditCardMaskNumber__c(java.lang.String zuora__CreditCardMaskNumber__c) {
        this.zuora__CreditCardMaskNumber__c = zuora__CreditCardMaskNumber__c;
    }


    /**
     * Gets the zuora__CreditCardPostalCode__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__CreditCardPostalCode__c
     */
    public java.lang.String getZuora__CreditCardPostalCode__c() {
        return zuora__CreditCardPostalCode__c;
    }


    /**
     * Sets the zuora__CreditCardPostalCode__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__CreditCardPostalCode__c
     */
    public void setZuora__CreditCardPostalCode__c(java.lang.String zuora__CreditCardPostalCode__c) {
        this.zuora__CreditCardPostalCode__c = zuora__CreditCardPostalCode__c;
    }


    /**
     * Gets the zuora__CreditCardState__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__CreditCardState__c
     */
    public java.lang.String getZuora__CreditCardState__c() {
        return zuora__CreditCardState__c;
    }


    /**
     * Sets the zuora__CreditCardState__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__CreditCardState__c
     */
    public void setZuora__CreditCardState__c(java.lang.String zuora__CreditCardState__c) {
        this.zuora__CreditCardState__c = zuora__CreditCardState__c;
    }


    /**
     * Gets the zuora__CreditCardType__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__CreditCardType__c
     */
    public java.lang.String getZuora__CreditCardType__c() {
        return zuora__CreditCardType__c;
    }


    /**
     * Sets the zuora__CreditCardType__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__CreditCardType__c
     */
    public void setZuora__CreditCardType__c(java.lang.String zuora__CreditCardType__c) {
        this.zuora__CreditCardType__c = zuora__CreditCardType__c;
    }


    /**
     * Gets the zuora__DefaultPaymentMethod__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__DefaultPaymentMethod__c
     */
    public java.lang.Boolean getZuora__DefaultPaymentMethod__c() {
        return zuora__DefaultPaymentMethod__c;
    }


    /**
     * Sets the zuora__DefaultPaymentMethod__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__DefaultPaymentMethod__c
     */
    public void setZuora__DefaultPaymentMethod__c(java.lang.Boolean zuora__DefaultPaymentMethod__c) {
        this.zuora__DefaultPaymentMethod__c = zuora__DefaultPaymentMethod__c;
    }


    /**
     * Gets the zuora__DeviceSessionId__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__DeviceSessionId__c
     */
    public java.lang.String getZuora__DeviceSessionId__c() {
        return zuora__DeviceSessionId__c;
    }


    /**
     * Sets the zuora__DeviceSessionId__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__DeviceSessionId__c
     */
    public void setZuora__DeviceSessionId__c(java.lang.String zuora__DeviceSessionId__c) {
        this.zuora__DeviceSessionId__c = zuora__DeviceSessionId__c;
    }


    /**
     * Gets the zuora__Email__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__Email__c
     */
    public java.lang.String getZuora__Email__c() {
        return zuora__Email__c;
    }


    /**
     * Sets the zuora__Email__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__Email__c
     */
    public void setZuora__Email__c(java.lang.String zuora__Email__c) {
        this.zuora__Email__c = zuora__Email__c;
    }


    /**
     * Gets the zuora__ExistingMandate__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__ExistingMandate__c
     */
    public java.lang.String getZuora__ExistingMandate__c() {
        return zuora__ExistingMandate__c;
    }


    /**
     * Sets the zuora__ExistingMandate__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__ExistingMandate__c
     */
    public void setZuora__ExistingMandate__c(java.lang.String zuora__ExistingMandate__c) {
        this.zuora__ExistingMandate__c = zuora__ExistingMandate__c;
    }


    /**
     * Gets the zuora__External_Id__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__External_Id__c
     */
    public java.lang.String getZuora__External_Id__c() {
        return zuora__External_Id__c;
    }


    /**
     * Sets the zuora__External_Id__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__External_Id__c
     */
    public void setZuora__External_Id__c(java.lang.String zuora__External_Id__c) {
        this.zuora__External_Id__c = zuora__External_Id__c;
    }


    /**
     * Gets the zuora__FirstName__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__FirstName__c
     */
    public java.lang.String getZuora__FirstName__c() {
        return zuora__FirstName__c;
    }


    /**
     * Sets the zuora__FirstName__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__FirstName__c
     */
    public void setZuora__FirstName__c(java.lang.String zuora__FirstName__c) {
        this.zuora__FirstName__c = zuora__FirstName__c;
    }


    /**
     * Gets the zuora__IBAN__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__IBAN__c
     */
    public java.lang.String getZuora__IBAN__c() {
        return zuora__IBAN__c;
    }


    /**
     * Sets the zuora__IBAN__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__IBAN__c
     */
    public void setZuora__IBAN__c(java.lang.String zuora__IBAN__c) {
        this.zuora__IBAN__c = zuora__IBAN__c;
    }


    /**
     * Gets the zuora__IPAddress__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__IPAddress__c
     */
    public java.lang.String getZuora__IPAddress__c() {
        return zuora__IPAddress__c;
    }


    /**
     * Sets the zuora__IPAddress__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__IPAddress__c
     */
    public void setZuora__IPAddress__c(java.lang.String zuora__IPAddress__c) {
        this.zuora__IPAddress__c = zuora__IPAddress__c;
    }


    /**
     * Gets the zuora__LastFailedSaleTransactionDate__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__LastFailedSaleTransactionDate__c
     */
    public java.util.Calendar getZuora__LastFailedSaleTransactionDate__c() {
        return zuora__LastFailedSaleTransactionDate__c;
    }


    /**
     * Sets the zuora__LastFailedSaleTransactionDate__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__LastFailedSaleTransactionDate__c
     */
    public void setZuora__LastFailedSaleTransactionDate__c(java.util.Calendar zuora__LastFailedSaleTransactionDate__c) {
        this.zuora__LastFailedSaleTransactionDate__c = zuora__LastFailedSaleTransactionDate__c;
    }


    /**
     * Gets the zuora__LastName__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__LastName__c
     */
    public java.lang.String getZuora__LastName__c() {
        return zuora__LastName__c;
    }


    /**
     * Sets the zuora__LastName__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__LastName__c
     */
    public void setZuora__LastName__c(java.lang.String zuora__LastName__c) {
        this.zuora__LastName__c = zuora__LastName__c;
    }


    /**
     * Gets the zuora__LastTransactionDateTime__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__LastTransactionDateTime__c
     */
    public java.util.Calendar getZuora__LastTransactionDateTime__c() {
        return zuora__LastTransactionDateTime__c;
    }


    /**
     * Sets the zuora__LastTransactionDateTime__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__LastTransactionDateTime__c
     */
    public void setZuora__LastTransactionDateTime__c(java.util.Calendar zuora__LastTransactionDateTime__c) {
        this.zuora__LastTransactionDateTime__c = zuora__LastTransactionDateTime__c;
    }


    /**
     * Gets the zuora__LastTransactionStatus__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__LastTransactionStatus__c
     */
    public java.lang.String getZuora__LastTransactionStatus__c() {
        return zuora__LastTransactionStatus__c;
    }


    /**
     * Sets the zuora__LastTransactionStatus__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__LastTransactionStatus__c
     */
    public void setZuora__LastTransactionStatus__c(java.lang.String zuora__LastTransactionStatus__c) {
        this.zuora__LastTransactionStatus__c = zuora__LastTransactionStatus__c;
    }


    /**
     * Gets the zuora__MandateCreationDate__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__MandateCreationDate__c
     */
    public java.util.Calendar getZuora__MandateCreationDate__c() {
        return zuora__MandateCreationDate__c;
    }


    /**
     * Sets the zuora__MandateCreationDate__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__MandateCreationDate__c
     */
    public void setZuora__MandateCreationDate__c(java.util.Calendar zuora__MandateCreationDate__c) {
        this.zuora__MandateCreationDate__c = zuora__MandateCreationDate__c;
    }


    /**
     * Gets the zuora__MandateID__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__MandateID__c
     */
    public java.lang.String getZuora__MandateID__c() {
        return zuora__MandateID__c;
    }


    /**
     * Sets the zuora__MandateID__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__MandateID__c
     */
    public void setZuora__MandateID__c(java.lang.String zuora__MandateID__c) {
        this.zuora__MandateID__c = zuora__MandateID__c;
    }


    /**
     * Gets the zuora__MandateReceived__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__MandateReceived__c
     */
    public java.lang.String getZuora__MandateReceived__c() {
        return zuora__MandateReceived__c;
    }


    /**
     * Sets the zuora__MandateReceived__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__MandateReceived__c
     */
    public void setZuora__MandateReceived__c(java.lang.String zuora__MandateReceived__c) {
        this.zuora__MandateReceived__c = zuora__MandateReceived__c;
    }


    /**
     * Gets the zuora__MandateUpdateDate__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__MandateUpdateDate__c
     */
    public java.util.Calendar getZuora__MandateUpdateDate__c() {
        return zuora__MandateUpdateDate__c;
    }


    /**
     * Sets the zuora__MandateUpdateDate__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__MandateUpdateDate__c
     */
    public void setZuora__MandateUpdateDate__c(java.util.Calendar zuora__MandateUpdateDate__c) {
        this.zuora__MandateUpdateDate__c = zuora__MandateUpdateDate__c;
    }


    /**
     * Gets the zuora__MaxConsecutivePaymentFailures__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__MaxConsecutivePaymentFailures__c
     */
    public java.lang.Double getZuora__MaxConsecutivePaymentFailures__c() {
        return zuora__MaxConsecutivePaymentFailures__c;
    }


    /**
     * Sets the zuora__MaxConsecutivePaymentFailures__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__MaxConsecutivePaymentFailures__c
     */
    public void setZuora__MaxConsecutivePaymentFailures__c(java.lang.Double zuora__MaxConsecutivePaymentFailures__c) {
        this.zuora__MaxConsecutivePaymentFailures__c = zuora__MaxConsecutivePaymentFailures__c;
    }


    /**
     * Gets the zuora__Name__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__Name__c
     */
    public java.lang.String getZuora__Name__c() {
        return zuora__Name__c;
    }


    /**
     * Sets the zuora__Name__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__Name__c
     */
    public void setZuora__Name__c(java.lang.String zuora__Name__c) {
        this.zuora__Name__c = zuora__Name__c;
    }


    /**
     * Gets the zuora__NumConsecutiveFailures__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__NumConsecutiveFailures__c
     */
    public java.lang.Double getZuora__NumConsecutiveFailures__c() {
        return zuora__NumConsecutiveFailures__c;
    }


    /**
     * Sets the zuora__NumConsecutiveFailures__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__NumConsecutiveFailures__c
     */
    public void setZuora__NumConsecutiveFailures__c(java.lang.Double zuora__NumConsecutiveFailures__c) {
        this.zuora__NumConsecutiveFailures__c = zuora__NumConsecutiveFailures__c;
    }


    /**
     * Gets the zuora__PaymentMethodStatus__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__PaymentMethodStatus__c
     */
    public java.lang.String getZuora__PaymentMethodStatus__c() {
        return zuora__PaymentMethodStatus__c;
    }


    /**
     * Sets the zuora__PaymentMethodStatus__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__PaymentMethodStatus__c
     */
    public void setZuora__PaymentMethodStatus__c(java.lang.String zuora__PaymentMethodStatus__c) {
        this.zuora__PaymentMethodStatus__c = zuora__PaymentMethodStatus__c;
    }


    /**
     * Gets the zuora__PaymentRetryWindow__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__PaymentRetryWindow__c
     */
    public java.lang.Double getZuora__PaymentRetryWindow__c() {
        return zuora__PaymentRetryWindow__c;
    }


    /**
     * Sets the zuora__PaymentRetryWindow__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__PaymentRetryWindow__c
     */
    public void setZuora__PaymentRetryWindow__c(java.lang.Double zuora__PaymentRetryWindow__c) {
        this.zuora__PaymentRetryWindow__c = zuora__PaymentRetryWindow__c;
    }


    /**
     * Gets the zuora__PaypalBaid__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__PaypalBaid__c
     */
    public java.lang.String getZuora__PaypalBaid__c() {
        return zuora__PaypalBaid__c;
    }


    /**
     * Sets the zuora__PaypalBaid__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__PaypalBaid__c
     */
    public void setZuora__PaypalBaid__c(java.lang.String zuora__PaypalBaid__c) {
        this.zuora__PaypalBaid__c = zuora__PaypalBaid__c;
    }


    /**
     * Gets the zuora__PaypalEmail__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__PaypalEmail__c
     */
    public java.lang.String getZuora__PaypalEmail__c() {
        return zuora__PaypalEmail__c;
    }


    /**
     * Sets the zuora__PaypalEmail__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__PaypalEmail__c
     */
    public void setZuora__PaypalEmail__c(java.lang.String zuora__PaypalEmail__c) {
        this.zuora__PaypalEmail__c = zuora__PaypalEmail__c;
    }


    /**
     * Gets the zuora__PaypalPreapprovalKey__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__PaypalPreapprovalKey__c
     */
    public java.lang.String getZuora__PaypalPreapprovalKey__c() {
        return zuora__PaypalPreapprovalKey__c;
    }


    /**
     * Sets the zuora__PaypalPreapprovalKey__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__PaypalPreapprovalKey__c
     */
    public void setZuora__PaypalPreapprovalKey__c(java.lang.String zuora__PaypalPreapprovalKey__c) {
        this.zuora__PaypalPreapprovalKey__c = zuora__PaypalPreapprovalKey__c;
    }


    /**
     * Gets the zuora__PaypalType__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__PaypalType__c
     */
    public java.lang.String getZuora__PaypalType__c() {
        return zuora__PaypalType__c;
    }


    /**
     * Sets the zuora__PaypalType__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__PaypalType__c
     */
    public void setZuora__PaypalType__c(java.lang.String zuora__PaypalType__c) {
        this.zuora__PaypalType__c = zuora__PaypalType__c;
    }


    /**
     * Gets the zuora__Phone__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__Phone__c
     */
    public java.lang.String getZuora__Phone__c() {
        return zuora__Phone__c;
    }


    /**
     * Sets the zuora__Phone__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__Phone__c
     */
    public void setZuora__Phone__c(java.lang.String zuora__Phone__c) {
        this.zuora__Phone__c = zuora__Phone__c;
    }


    /**
     * Gets the zuora__PostalCode__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__PostalCode__c
     */
    public java.lang.String getZuora__PostalCode__c() {
        return zuora__PostalCode__c;
    }


    /**
     * Sets the zuora__PostalCode__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__PostalCode__c
     */
    public void setZuora__PostalCode__c(java.lang.String zuora__PostalCode__c) {
        this.zuora__PostalCode__c = zuora__PostalCode__c;
    }


    /**
     * Gets the zuora__State__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__State__c
     */
    public java.lang.String getZuora__State__c() {
        return zuora__State__c;
    }


    /**
     * Sets the zuora__State__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__State__c
     */
    public void setZuora__State__c(java.lang.String zuora__State__c) {
        this.zuora__State__c = zuora__State__c;
    }


    /**
     * Gets the zuora__StreetName__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__StreetName__c
     */
    public java.lang.String getZuora__StreetName__c() {
        return zuora__StreetName__c;
    }


    /**
     * Sets the zuora__StreetName__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__StreetName__c
     */
    public void setZuora__StreetName__c(java.lang.String zuora__StreetName__c) {
        this.zuora__StreetName__c = zuora__StreetName__c;
    }


    /**
     * Gets the zuora__StreetNumber__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__StreetNumber__c
     */
    public java.lang.String getZuora__StreetNumber__c() {
        return zuora__StreetNumber__c;
    }


    /**
     * Sets the zuora__StreetNumber__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__StreetNumber__c
     */
    public void setZuora__StreetNumber__c(java.lang.String zuora__StreetNumber__c) {
        this.zuora__StreetNumber__c = zuora__StreetNumber__c;
    }


    /**
     * Gets the zuora__TotalNumberOfErrorPayments__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__TotalNumberOfErrorPayments__c
     */
    public java.lang.Double getZuora__TotalNumberOfErrorPayments__c() {
        return zuora__TotalNumberOfErrorPayments__c;
    }


    /**
     * Sets the zuora__TotalNumberOfErrorPayments__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__TotalNumberOfErrorPayments__c
     */
    public void setZuora__TotalNumberOfErrorPayments__c(java.lang.Double zuora__TotalNumberOfErrorPayments__c) {
        this.zuora__TotalNumberOfErrorPayments__c = zuora__TotalNumberOfErrorPayments__c;
    }


    /**
     * Gets the zuora__TotalNumberOfProcessedPayments__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__TotalNumberOfProcessedPayments__c
     */
    public java.lang.Double getZuora__TotalNumberOfProcessedPayments__c() {
        return zuora__TotalNumberOfProcessedPayments__c;
    }


    /**
     * Sets the zuora__TotalNumberOfProcessedPayments__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__TotalNumberOfProcessedPayments__c
     */
    public void setZuora__TotalNumberOfProcessedPayments__c(java.lang.Double zuora__TotalNumberOfProcessedPayments__c) {
        this.zuora__TotalNumberOfProcessedPayments__c = zuora__TotalNumberOfProcessedPayments__c;
    }


    /**
     * Gets the zuora__Type__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__Type__c
     */
    public java.lang.String getZuora__Type__c() {
        return zuora__Type__c;
    }


    /**
     * Sets the zuora__Type__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__Type__c
     */
    public void setZuora__Type__c(java.lang.String zuora__Type__c) {
        this.zuora__Type__c = zuora__Type__c;
    }


    /**
     * Gets the zuora__UpdatedById__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__UpdatedById__c
     */
    public java.lang.String getZuora__UpdatedById__c() {
        return zuora__UpdatedById__c;
    }


    /**
     * Sets the zuora__UpdatedById__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__UpdatedById__c
     */
    public void setZuora__UpdatedById__c(java.lang.String zuora__UpdatedById__c) {
        this.zuora__UpdatedById__c = zuora__UpdatedById__c;
    }


    /**
     * Gets the zuora__UpdatedDate__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__UpdatedDate__c
     */
    public java.util.Calendar getZuora__UpdatedDate__c() {
        return zuora__UpdatedDate__c;
    }


    /**
     * Sets the zuora__UpdatedDate__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__UpdatedDate__c
     */
    public void setZuora__UpdatedDate__c(java.util.Calendar zuora__UpdatedDate__c) {
        this.zuora__UpdatedDate__c = zuora__UpdatedDate__c;
    }


    /**
     * Gets the zuora__UseDefaultRetryRule__c value for this Zuora__PaymentMethod__c.
     * 
     * @return zuora__UseDefaultRetryRule__c
     */
    public java.lang.Boolean getZuora__UseDefaultRetryRule__c() {
        return zuora__UseDefaultRetryRule__c;
    }


    /**
     * Sets the zuora__UseDefaultRetryRule__c value for this Zuora__PaymentMethod__c.
     * 
     * @param zuora__UseDefaultRetryRule__c
     */
    public void setZuora__UseDefaultRetryRule__c(java.lang.Boolean zuora__UseDefaultRetryRule__c) {
        this.zuora__UseDefaultRetryRule__c = zuora__UseDefaultRetryRule__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Zuora__PaymentMethod__c)) return false;
        Zuora__PaymentMethod__c other = (Zuora__PaymentMethod__c) obj;
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
            ((this.zuora__AchAbaCode__c==null && other.getZuora__AchAbaCode__c()==null) || 
             (this.zuora__AchAbaCode__c!=null &&
              this.zuora__AchAbaCode__c.equals(other.getZuora__AchAbaCode__c()))) &&
            ((this.zuora__AchAccountName__c==null && other.getZuora__AchAccountName__c()==null) || 
             (this.zuora__AchAccountName__c!=null &&
              this.zuora__AchAccountName__c.equals(other.getZuora__AchAccountName__c()))) &&
            ((this.zuora__AchAccountNumberMask__c==null && other.getZuora__AchAccountNumberMask__c()==null) || 
             (this.zuora__AchAccountNumberMask__c!=null &&
              this.zuora__AchAccountNumberMask__c.equals(other.getZuora__AchAccountNumberMask__c()))) &&
            ((this.zuora__AchAccountType__c==null && other.getZuora__AchAccountType__c()==null) || 
             (this.zuora__AchAccountType__c!=null &&
              this.zuora__AchAccountType__c.equals(other.getZuora__AchAccountType__c()))) &&
            ((this.zuora__AchBankName__c==null && other.getZuora__AchBankName__c()==null) || 
             (this.zuora__AchBankName__c!=null &&
              this.zuora__AchBankName__c.equals(other.getZuora__AchBankName__c()))) &&
            ((this.zuora__Active__c==null && other.getZuora__Active__c()==null) || 
             (this.zuora__Active__c!=null &&
              this.zuora__Active__c.equals(other.getZuora__Active__c()))) &&
            ((this.zuora__BankBranchCode__c==null && other.getZuora__BankBranchCode__c()==null) || 
             (this.zuora__BankBranchCode__c!=null &&
              this.zuora__BankBranchCode__c.equals(other.getZuora__BankBranchCode__c()))) &&
            ((this.zuora__BankCheckDigit__c==null && other.getZuora__BankCheckDigit__c()==null) || 
             (this.zuora__BankCheckDigit__c!=null &&
              this.zuora__BankCheckDigit__c.equals(other.getZuora__BankCheckDigit__c()))) &&
            ((this.zuora__BankCity__c==null && other.getZuora__BankCity__c()==null) || 
             (this.zuora__BankCity__c!=null &&
              this.zuora__BankCity__c.equals(other.getZuora__BankCity__c()))) &&
            ((this.zuora__BankCode__c==null && other.getZuora__BankCode__c()==null) || 
             (this.zuora__BankCode__c!=null &&
              this.zuora__BankCode__c.equals(other.getZuora__BankCode__c()))) &&
            ((this.zuora__BankIdentificationNumber__c==null && other.getZuora__BankIdentificationNumber__c()==null) || 
             (this.zuora__BankIdentificationNumber__c!=null &&
              this.zuora__BankIdentificationNumber__c.equals(other.getZuora__BankIdentificationNumber__c()))) &&
            ((this.zuora__BankName__c==null && other.getZuora__BankName__c()==null) || 
             (this.zuora__BankName__c!=null &&
              this.zuora__BankName__c.equals(other.getZuora__BankName__c()))) &&
            ((this.zuora__BankPostalCode__c==null && other.getZuora__BankPostalCode__c()==null) || 
             (this.zuora__BankPostalCode__c!=null &&
              this.zuora__BankPostalCode__c.equals(other.getZuora__BankPostalCode__c()))) &&
            ((this.zuora__BankStreetName__c==null && other.getZuora__BankStreetName__c()==null) || 
             (this.zuora__BankStreetName__c!=null &&
              this.zuora__BankStreetName__c.equals(other.getZuora__BankStreetName__c()))) &&
            ((this.zuora__BankStreetNumber__c==null && other.getZuora__BankStreetNumber__c()==null) || 
             (this.zuora__BankStreetNumber__c!=null &&
              this.zuora__BankStreetNumber__c.equals(other.getZuora__BankStreetNumber__c()))) &&
            ((this.zuora__BankTransferAccountName__c==null && other.getZuora__BankTransferAccountName__c()==null) || 
             (this.zuora__BankTransferAccountName__c!=null &&
              this.zuora__BankTransferAccountName__c.equals(other.getZuora__BankTransferAccountName__c()))) &&
            ((this.zuora__BankTransferAccountNumber__c==null && other.getZuora__BankTransferAccountNumber__c()==null) || 
             (this.zuora__BankTransferAccountNumber__c!=null &&
              this.zuora__BankTransferAccountNumber__c.equals(other.getZuora__BankTransferAccountNumber__c()))) &&
            ((this.zuora__BankTransferAccountType__c==null && other.getZuora__BankTransferAccountType__c()==null) || 
             (this.zuora__BankTransferAccountType__c!=null &&
              this.zuora__BankTransferAccountType__c.equals(other.getZuora__BankTransferAccountType__c()))) &&
            ((this.zuora__BankTransferType__c==null && other.getZuora__BankTransferType__c()==null) || 
             (this.zuora__BankTransferType__c!=null &&
              this.zuora__BankTransferType__c.equals(other.getZuora__BankTransferType__c()))) &&
            ((this.zuora__BillingAccount__c==null && other.getZuora__BillingAccount__c()==null) || 
             (this.zuora__BillingAccount__c!=null &&
              this.zuora__BillingAccount__c.equals(other.getZuora__BillingAccount__c()))) &&
            ((this.zuora__BillingAccount__r==null && other.getZuora__BillingAccount__r()==null) || 
             (this.zuora__BillingAccount__r!=null &&
              this.zuora__BillingAccount__r.equals(other.getZuora__BillingAccount__r()))) &&
            ((this.zuora__Billing_Accounts__r==null && other.getZuora__Billing_Accounts__r()==null) || 
             (this.zuora__Billing_Accounts__r!=null &&
              this.zuora__Billing_Accounts__r.equals(other.getZuora__Billing_Accounts__r()))) &&
            ((this.zuora__BusinessIdentificationCode__c==null && other.getZuora__BusinessIdentificationCode__c()==null) || 
             (this.zuora__BusinessIdentificationCode__c!=null &&
              this.zuora__BusinessIdentificationCode__c.equals(other.getZuora__BusinessIdentificationCode__c()))) &&
            ((this.zuora__City__c==null && other.getZuora__City__c()==null) || 
             (this.zuora__City__c!=null &&
              this.zuora__City__c.equals(other.getZuora__City__c()))) &&
            ((this.zuora__Country__c==null && other.getZuora__Country__c()==null) || 
             (this.zuora__Country__c!=null &&
              this.zuora__Country__c.equals(other.getZuora__Country__c()))) &&
            ((this.zuora__CreatedById__c==null && other.getZuora__CreatedById__c()==null) || 
             (this.zuora__CreatedById__c!=null &&
              this.zuora__CreatedById__c.equals(other.getZuora__CreatedById__c()))) &&
            ((this.zuora__CreatedDate__c==null && other.getZuora__CreatedDate__c()==null) || 
             (this.zuora__CreatedDate__c!=null &&
              this.zuora__CreatedDate__c.equals(other.getZuora__CreatedDate__c()))) &&
            ((this.zuora__CreditCardAddress1__c==null && other.getZuora__CreditCardAddress1__c()==null) || 
             (this.zuora__CreditCardAddress1__c!=null &&
              this.zuora__CreditCardAddress1__c.equals(other.getZuora__CreditCardAddress1__c()))) &&
            ((this.zuora__CreditCardAddress2__c==null && other.getZuora__CreditCardAddress2__c()==null) || 
             (this.zuora__CreditCardAddress2__c!=null &&
              this.zuora__CreditCardAddress2__c.equals(other.getZuora__CreditCardAddress2__c()))) &&
            ((this.zuora__CreditCardCity__c==null && other.getZuora__CreditCardCity__c()==null) || 
             (this.zuora__CreditCardCity__c!=null &&
              this.zuora__CreditCardCity__c.equals(other.getZuora__CreditCardCity__c()))) &&
            ((this.zuora__CreditCardCountry__c==null && other.getZuora__CreditCardCountry__c()==null) || 
             (this.zuora__CreditCardCountry__c!=null &&
              this.zuora__CreditCardCountry__c.equals(other.getZuora__CreditCardCountry__c()))) &&
            ((this.zuora__CreditCardExpirationMonth__c==null && other.getZuora__CreditCardExpirationMonth__c()==null) || 
             (this.zuora__CreditCardExpirationMonth__c!=null &&
              this.zuora__CreditCardExpirationMonth__c.equals(other.getZuora__CreditCardExpirationMonth__c()))) &&
            ((this.zuora__CreditCardExpirationYear__c==null && other.getZuora__CreditCardExpirationYear__c()==null) || 
             (this.zuora__CreditCardExpirationYear__c!=null &&
              this.zuora__CreditCardExpirationYear__c.equals(other.getZuora__CreditCardExpirationYear__c()))) &&
            ((this.zuora__CreditCardHolderName__c==null && other.getZuora__CreditCardHolderName__c()==null) || 
             (this.zuora__CreditCardHolderName__c!=null &&
              this.zuora__CreditCardHolderName__c.equals(other.getZuora__CreditCardHolderName__c()))) &&
            ((this.zuora__CreditCardMaskNumber__c==null && other.getZuora__CreditCardMaskNumber__c()==null) || 
             (this.zuora__CreditCardMaskNumber__c!=null &&
              this.zuora__CreditCardMaskNumber__c.equals(other.getZuora__CreditCardMaskNumber__c()))) &&
            ((this.zuora__CreditCardPostalCode__c==null && other.getZuora__CreditCardPostalCode__c()==null) || 
             (this.zuora__CreditCardPostalCode__c!=null &&
              this.zuora__CreditCardPostalCode__c.equals(other.getZuora__CreditCardPostalCode__c()))) &&
            ((this.zuora__CreditCardState__c==null && other.getZuora__CreditCardState__c()==null) || 
             (this.zuora__CreditCardState__c!=null &&
              this.zuora__CreditCardState__c.equals(other.getZuora__CreditCardState__c()))) &&
            ((this.zuora__CreditCardType__c==null && other.getZuora__CreditCardType__c()==null) || 
             (this.zuora__CreditCardType__c!=null &&
              this.zuora__CreditCardType__c.equals(other.getZuora__CreditCardType__c()))) &&
            ((this.zuora__DefaultPaymentMethod__c==null && other.getZuora__DefaultPaymentMethod__c()==null) || 
             (this.zuora__DefaultPaymentMethod__c!=null &&
              this.zuora__DefaultPaymentMethod__c.equals(other.getZuora__DefaultPaymentMethod__c()))) &&
            ((this.zuora__DeviceSessionId__c==null && other.getZuora__DeviceSessionId__c()==null) || 
             (this.zuora__DeviceSessionId__c!=null &&
              this.zuora__DeviceSessionId__c.equals(other.getZuora__DeviceSessionId__c()))) &&
            ((this.zuora__Email__c==null && other.getZuora__Email__c()==null) || 
             (this.zuora__Email__c!=null &&
              this.zuora__Email__c.equals(other.getZuora__Email__c()))) &&
            ((this.zuora__ExistingMandate__c==null && other.getZuora__ExistingMandate__c()==null) || 
             (this.zuora__ExistingMandate__c!=null &&
              this.zuora__ExistingMandate__c.equals(other.getZuora__ExistingMandate__c()))) &&
            ((this.zuora__External_Id__c==null && other.getZuora__External_Id__c()==null) || 
             (this.zuora__External_Id__c!=null &&
              this.zuora__External_Id__c.equals(other.getZuora__External_Id__c()))) &&
            ((this.zuora__FirstName__c==null && other.getZuora__FirstName__c()==null) || 
             (this.zuora__FirstName__c!=null &&
              this.zuora__FirstName__c.equals(other.getZuora__FirstName__c()))) &&
            ((this.zuora__IBAN__c==null && other.getZuora__IBAN__c()==null) || 
             (this.zuora__IBAN__c!=null &&
              this.zuora__IBAN__c.equals(other.getZuora__IBAN__c()))) &&
            ((this.zuora__IPAddress__c==null && other.getZuora__IPAddress__c()==null) || 
             (this.zuora__IPAddress__c!=null &&
              this.zuora__IPAddress__c.equals(other.getZuora__IPAddress__c()))) &&
            ((this.zuora__LastFailedSaleTransactionDate__c==null && other.getZuora__LastFailedSaleTransactionDate__c()==null) || 
             (this.zuora__LastFailedSaleTransactionDate__c!=null &&
              this.zuora__LastFailedSaleTransactionDate__c.equals(other.getZuora__LastFailedSaleTransactionDate__c()))) &&
            ((this.zuora__LastName__c==null && other.getZuora__LastName__c()==null) || 
             (this.zuora__LastName__c!=null &&
              this.zuora__LastName__c.equals(other.getZuora__LastName__c()))) &&
            ((this.zuora__LastTransactionDateTime__c==null && other.getZuora__LastTransactionDateTime__c()==null) || 
             (this.zuora__LastTransactionDateTime__c!=null &&
              this.zuora__LastTransactionDateTime__c.equals(other.getZuora__LastTransactionDateTime__c()))) &&
            ((this.zuora__LastTransactionStatus__c==null && other.getZuora__LastTransactionStatus__c()==null) || 
             (this.zuora__LastTransactionStatus__c!=null &&
              this.zuora__LastTransactionStatus__c.equals(other.getZuora__LastTransactionStatus__c()))) &&
            ((this.zuora__MandateCreationDate__c==null && other.getZuora__MandateCreationDate__c()==null) || 
             (this.zuora__MandateCreationDate__c!=null &&
              this.zuora__MandateCreationDate__c.equals(other.getZuora__MandateCreationDate__c()))) &&
            ((this.zuora__MandateID__c==null && other.getZuora__MandateID__c()==null) || 
             (this.zuora__MandateID__c!=null &&
              this.zuora__MandateID__c.equals(other.getZuora__MandateID__c()))) &&
            ((this.zuora__MandateReceived__c==null && other.getZuora__MandateReceived__c()==null) || 
             (this.zuora__MandateReceived__c!=null &&
              this.zuora__MandateReceived__c.equals(other.getZuora__MandateReceived__c()))) &&
            ((this.zuora__MandateUpdateDate__c==null && other.getZuora__MandateUpdateDate__c()==null) || 
             (this.zuora__MandateUpdateDate__c!=null &&
              this.zuora__MandateUpdateDate__c.equals(other.getZuora__MandateUpdateDate__c()))) &&
            ((this.zuora__MaxConsecutivePaymentFailures__c==null && other.getZuora__MaxConsecutivePaymentFailures__c()==null) || 
             (this.zuora__MaxConsecutivePaymentFailures__c!=null &&
              this.zuora__MaxConsecutivePaymentFailures__c.equals(other.getZuora__MaxConsecutivePaymentFailures__c()))) &&
            ((this.zuora__Name__c==null && other.getZuora__Name__c()==null) || 
             (this.zuora__Name__c!=null &&
              this.zuora__Name__c.equals(other.getZuora__Name__c()))) &&
            ((this.zuora__NumConsecutiveFailures__c==null && other.getZuora__NumConsecutiveFailures__c()==null) || 
             (this.zuora__NumConsecutiveFailures__c!=null &&
              this.zuora__NumConsecutiveFailures__c.equals(other.getZuora__NumConsecutiveFailures__c()))) &&
            ((this.zuora__PaymentMethodStatus__c==null && other.getZuora__PaymentMethodStatus__c()==null) || 
             (this.zuora__PaymentMethodStatus__c!=null &&
              this.zuora__PaymentMethodStatus__c.equals(other.getZuora__PaymentMethodStatus__c()))) &&
            ((this.zuora__PaymentRetryWindow__c==null && other.getZuora__PaymentRetryWindow__c()==null) || 
             (this.zuora__PaymentRetryWindow__c!=null &&
              this.zuora__PaymentRetryWindow__c.equals(other.getZuora__PaymentRetryWindow__c()))) &&
            ((this.zuora__PaypalBaid__c==null && other.getZuora__PaypalBaid__c()==null) || 
             (this.zuora__PaypalBaid__c!=null &&
              this.zuora__PaypalBaid__c.equals(other.getZuora__PaypalBaid__c()))) &&
            ((this.zuora__PaypalEmail__c==null && other.getZuora__PaypalEmail__c()==null) || 
             (this.zuora__PaypalEmail__c!=null &&
              this.zuora__PaypalEmail__c.equals(other.getZuora__PaypalEmail__c()))) &&
            ((this.zuora__PaypalPreapprovalKey__c==null && other.getZuora__PaypalPreapprovalKey__c()==null) || 
             (this.zuora__PaypalPreapprovalKey__c!=null &&
              this.zuora__PaypalPreapprovalKey__c.equals(other.getZuora__PaypalPreapprovalKey__c()))) &&
            ((this.zuora__PaypalType__c==null && other.getZuora__PaypalType__c()==null) || 
             (this.zuora__PaypalType__c!=null &&
              this.zuora__PaypalType__c.equals(other.getZuora__PaypalType__c()))) &&
            ((this.zuora__Phone__c==null && other.getZuora__Phone__c()==null) || 
             (this.zuora__Phone__c!=null &&
              this.zuora__Phone__c.equals(other.getZuora__Phone__c()))) &&
            ((this.zuora__PostalCode__c==null && other.getZuora__PostalCode__c()==null) || 
             (this.zuora__PostalCode__c!=null &&
              this.zuora__PostalCode__c.equals(other.getZuora__PostalCode__c()))) &&
            ((this.zuora__State__c==null && other.getZuora__State__c()==null) || 
             (this.zuora__State__c!=null &&
              this.zuora__State__c.equals(other.getZuora__State__c()))) &&
            ((this.zuora__StreetName__c==null && other.getZuora__StreetName__c()==null) || 
             (this.zuora__StreetName__c!=null &&
              this.zuora__StreetName__c.equals(other.getZuora__StreetName__c()))) &&
            ((this.zuora__StreetNumber__c==null && other.getZuora__StreetNumber__c()==null) || 
             (this.zuora__StreetNumber__c!=null &&
              this.zuora__StreetNumber__c.equals(other.getZuora__StreetNumber__c()))) &&
            ((this.zuora__TotalNumberOfErrorPayments__c==null && other.getZuora__TotalNumberOfErrorPayments__c()==null) || 
             (this.zuora__TotalNumberOfErrorPayments__c!=null &&
              this.zuora__TotalNumberOfErrorPayments__c.equals(other.getZuora__TotalNumberOfErrorPayments__c()))) &&
            ((this.zuora__TotalNumberOfProcessedPayments__c==null && other.getZuora__TotalNumberOfProcessedPayments__c()==null) || 
             (this.zuora__TotalNumberOfProcessedPayments__c!=null &&
              this.zuora__TotalNumberOfProcessedPayments__c.equals(other.getZuora__TotalNumberOfProcessedPayments__c()))) &&
            ((this.zuora__Type__c==null && other.getZuora__Type__c()==null) || 
             (this.zuora__Type__c!=null &&
              this.zuora__Type__c.equals(other.getZuora__Type__c()))) &&
            ((this.zuora__UpdatedById__c==null && other.getZuora__UpdatedById__c()==null) || 
             (this.zuora__UpdatedById__c!=null &&
              this.zuora__UpdatedById__c.equals(other.getZuora__UpdatedById__c()))) &&
            ((this.zuora__UpdatedDate__c==null && other.getZuora__UpdatedDate__c()==null) || 
             (this.zuora__UpdatedDate__c!=null &&
              this.zuora__UpdatedDate__c.equals(other.getZuora__UpdatedDate__c()))) &&
            ((this.zuora__UseDefaultRetryRule__c==null && other.getZuora__UseDefaultRetryRule__c()==null) || 
             (this.zuora__UseDefaultRetryRule__c!=null &&
              this.zuora__UseDefaultRetryRule__c.equals(other.getZuora__UseDefaultRetryRule__c())));
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
        if (getZuora__AchAbaCode__c() != null) {
            _hashCode += getZuora__AchAbaCode__c().hashCode();
        }
        if (getZuora__AchAccountName__c() != null) {
            _hashCode += getZuora__AchAccountName__c().hashCode();
        }
        if (getZuora__AchAccountNumberMask__c() != null) {
            _hashCode += getZuora__AchAccountNumberMask__c().hashCode();
        }
        if (getZuora__AchAccountType__c() != null) {
            _hashCode += getZuora__AchAccountType__c().hashCode();
        }
        if (getZuora__AchBankName__c() != null) {
            _hashCode += getZuora__AchBankName__c().hashCode();
        }
        if (getZuora__Active__c() != null) {
            _hashCode += getZuora__Active__c().hashCode();
        }
        if (getZuora__BankBranchCode__c() != null) {
            _hashCode += getZuora__BankBranchCode__c().hashCode();
        }
        if (getZuora__BankCheckDigit__c() != null) {
            _hashCode += getZuora__BankCheckDigit__c().hashCode();
        }
        if (getZuora__BankCity__c() != null) {
            _hashCode += getZuora__BankCity__c().hashCode();
        }
        if (getZuora__BankCode__c() != null) {
            _hashCode += getZuora__BankCode__c().hashCode();
        }
        if (getZuora__BankIdentificationNumber__c() != null) {
            _hashCode += getZuora__BankIdentificationNumber__c().hashCode();
        }
        if (getZuora__BankName__c() != null) {
            _hashCode += getZuora__BankName__c().hashCode();
        }
        if (getZuora__BankPostalCode__c() != null) {
            _hashCode += getZuora__BankPostalCode__c().hashCode();
        }
        if (getZuora__BankStreetName__c() != null) {
            _hashCode += getZuora__BankStreetName__c().hashCode();
        }
        if (getZuora__BankStreetNumber__c() != null) {
            _hashCode += getZuora__BankStreetNumber__c().hashCode();
        }
        if (getZuora__BankTransferAccountName__c() != null) {
            _hashCode += getZuora__BankTransferAccountName__c().hashCode();
        }
        if (getZuora__BankTransferAccountNumber__c() != null) {
            _hashCode += getZuora__BankTransferAccountNumber__c().hashCode();
        }
        if (getZuora__BankTransferAccountType__c() != null) {
            _hashCode += getZuora__BankTransferAccountType__c().hashCode();
        }
        if (getZuora__BankTransferType__c() != null) {
            _hashCode += getZuora__BankTransferType__c().hashCode();
        }
        if (getZuora__BillingAccount__c() != null) {
            _hashCode += getZuora__BillingAccount__c().hashCode();
        }
        if (getZuora__BillingAccount__r() != null) {
            _hashCode += getZuora__BillingAccount__r().hashCode();
        }
        if (getZuora__Billing_Accounts__r() != null) {
            _hashCode += getZuora__Billing_Accounts__r().hashCode();
        }
        if (getZuora__BusinessIdentificationCode__c() != null) {
            _hashCode += getZuora__BusinessIdentificationCode__c().hashCode();
        }
        if (getZuora__City__c() != null) {
            _hashCode += getZuora__City__c().hashCode();
        }
        if (getZuora__Country__c() != null) {
            _hashCode += getZuora__Country__c().hashCode();
        }
        if (getZuora__CreatedById__c() != null) {
            _hashCode += getZuora__CreatedById__c().hashCode();
        }
        if (getZuora__CreatedDate__c() != null) {
            _hashCode += getZuora__CreatedDate__c().hashCode();
        }
        if (getZuora__CreditCardAddress1__c() != null) {
            _hashCode += getZuora__CreditCardAddress1__c().hashCode();
        }
        if (getZuora__CreditCardAddress2__c() != null) {
            _hashCode += getZuora__CreditCardAddress2__c().hashCode();
        }
        if (getZuora__CreditCardCity__c() != null) {
            _hashCode += getZuora__CreditCardCity__c().hashCode();
        }
        if (getZuora__CreditCardCountry__c() != null) {
            _hashCode += getZuora__CreditCardCountry__c().hashCode();
        }
        if (getZuora__CreditCardExpirationMonth__c() != null) {
            _hashCode += getZuora__CreditCardExpirationMonth__c().hashCode();
        }
        if (getZuora__CreditCardExpirationYear__c() != null) {
            _hashCode += getZuora__CreditCardExpirationYear__c().hashCode();
        }
        if (getZuora__CreditCardHolderName__c() != null) {
            _hashCode += getZuora__CreditCardHolderName__c().hashCode();
        }
        if (getZuora__CreditCardMaskNumber__c() != null) {
            _hashCode += getZuora__CreditCardMaskNumber__c().hashCode();
        }
        if (getZuora__CreditCardPostalCode__c() != null) {
            _hashCode += getZuora__CreditCardPostalCode__c().hashCode();
        }
        if (getZuora__CreditCardState__c() != null) {
            _hashCode += getZuora__CreditCardState__c().hashCode();
        }
        if (getZuora__CreditCardType__c() != null) {
            _hashCode += getZuora__CreditCardType__c().hashCode();
        }
        if (getZuora__DefaultPaymentMethod__c() != null) {
            _hashCode += getZuora__DefaultPaymentMethod__c().hashCode();
        }
        if (getZuora__DeviceSessionId__c() != null) {
            _hashCode += getZuora__DeviceSessionId__c().hashCode();
        }
        if (getZuora__Email__c() != null) {
            _hashCode += getZuora__Email__c().hashCode();
        }
        if (getZuora__ExistingMandate__c() != null) {
            _hashCode += getZuora__ExistingMandate__c().hashCode();
        }
        if (getZuora__External_Id__c() != null) {
            _hashCode += getZuora__External_Id__c().hashCode();
        }
        if (getZuora__FirstName__c() != null) {
            _hashCode += getZuora__FirstName__c().hashCode();
        }
        if (getZuora__IBAN__c() != null) {
            _hashCode += getZuora__IBAN__c().hashCode();
        }
        if (getZuora__IPAddress__c() != null) {
            _hashCode += getZuora__IPAddress__c().hashCode();
        }
        if (getZuora__LastFailedSaleTransactionDate__c() != null) {
            _hashCode += getZuora__LastFailedSaleTransactionDate__c().hashCode();
        }
        if (getZuora__LastName__c() != null) {
            _hashCode += getZuora__LastName__c().hashCode();
        }
        if (getZuora__LastTransactionDateTime__c() != null) {
            _hashCode += getZuora__LastTransactionDateTime__c().hashCode();
        }
        if (getZuora__LastTransactionStatus__c() != null) {
            _hashCode += getZuora__LastTransactionStatus__c().hashCode();
        }
        if (getZuora__MandateCreationDate__c() != null) {
            _hashCode += getZuora__MandateCreationDate__c().hashCode();
        }
        if (getZuora__MandateID__c() != null) {
            _hashCode += getZuora__MandateID__c().hashCode();
        }
        if (getZuora__MandateReceived__c() != null) {
            _hashCode += getZuora__MandateReceived__c().hashCode();
        }
        if (getZuora__MandateUpdateDate__c() != null) {
            _hashCode += getZuora__MandateUpdateDate__c().hashCode();
        }
        if (getZuora__MaxConsecutivePaymentFailures__c() != null) {
            _hashCode += getZuora__MaxConsecutivePaymentFailures__c().hashCode();
        }
        if (getZuora__Name__c() != null) {
            _hashCode += getZuora__Name__c().hashCode();
        }
        if (getZuora__NumConsecutiveFailures__c() != null) {
            _hashCode += getZuora__NumConsecutiveFailures__c().hashCode();
        }
        if (getZuora__PaymentMethodStatus__c() != null) {
            _hashCode += getZuora__PaymentMethodStatus__c().hashCode();
        }
        if (getZuora__PaymentRetryWindow__c() != null) {
            _hashCode += getZuora__PaymentRetryWindow__c().hashCode();
        }
        if (getZuora__PaypalBaid__c() != null) {
            _hashCode += getZuora__PaypalBaid__c().hashCode();
        }
        if (getZuora__PaypalEmail__c() != null) {
            _hashCode += getZuora__PaypalEmail__c().hashCode();
        }
        if (getZuora__PaypalPreapprovalKey__c() != null) {
            _hashCode += getZuora__PaypalPreapprovalKey__c().hashCode();
        }
        if (getZuora__PaypalType__c() != null) {
            _hashCode += getZuora__PaypalType__c().hashCode();
        }
        if (getZuora__Phone__c() != null) {
            _hashCode += getZuora__Phone__c().hashCode();
        }
        if (getZuora__PostalCode__c() != null) {
            _hashCode += getZuora__PostalCode__c().hashCode();
        }
        if (getZuora__State__c() != null) {
            _hashCode += getZuora__State__c().hashCode();
        }
        if (getZuora__StreetName__c() != null) {
            _hashCode += getZuora__StreetName__c().hashCode();
        }
        if (getZuora__StreetNumber__c() != null) {
            _hashCode += getZuora__StreetNumber__c().hashCode();
        }
        if (getZuora__TotalNumberOfErrorPayments__c() != null) {
            _hashCode += getZuora__TotalNumberOfErrorPayments__c().hashCode();
        }
        if (getZuora__TotalNumberOfProcessedPayments__c() != null) {
            _hashCode += getZuora__TotalNumberOfProcessedPayments__c().hashCode();
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
        if (getZuora__UseDefaultRetryRule__c() != null) {
            _hashCode += getZuora__UseDefaultRetryRule__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Zuora__PaymentMethod__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__PaymentMethod__c"));
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
        elemField.setFieldName("zuora__AchAbaCode__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__AchAbaCode__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__AchAccountName__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__AchAccountName__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__AchAccountNumberMask__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__AchAccountNumberMask__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__AchAccountType__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__AchAccountType__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__AchBankName__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__AchBankName__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__Active__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Active__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__BankBranchCode__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__BankBranchCode__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__BankCheckDigit__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__BankCheckDigit__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__BankCity__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__BankCity__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__BankCode__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__BankCode__c"));
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
        elemField.setFieldName("zuora__BankName__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__BankName__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__BankPostalCode__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__BankPostalCode__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__BankStreetName__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__BankStreetName__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__BankStreetNumber__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__BankStreetNumber__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__BankTransferAccountName__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__BankTransferAccountName__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__BankTransferAccountNumber__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__BankTransferAccountNumber__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__BankTransferAccountType__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__BankTransferAccountType__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__BankTransferType__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__BankTransferType__c"));
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
        elemField.setFieldName("zuora__Billing_Accounts__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Billing_Accounts__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__BusinessIdentificationCode__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__BusinessIdentificationCode__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__City__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__City__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__Country__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Country__c"));
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
        elemField.setFieldName("zuora__CreditCardAddress1__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__CreditCardAddress1__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__CreditCardAddress2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__CreditCardAddress2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__CreditCardCity__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__CreditCardCity__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__CreditCardCountry__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__CreditCardCountry__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__CreditCardExpirationMonth__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__CreditCardExpirationMonth__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__CreditCardExpirationYear__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__CreditCardExpirationYear__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__CreditCardHolderName__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__CreditCardHolderName__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__CreditCardMaskNumber__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__CreditCardMaskNumber__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__CreditCardPostalCode__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__CreditCardPostalCode__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__CreditCardState__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__CreditCardState__c"));
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
        elemField.setFieldName("zuora__DefaultPaymentMethod__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__DefaultPaymentMethod__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__DeviceSessionId__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__DeviceSessionId__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__Email__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Email__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__ExistingMandate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__ExistingMandate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("zuora__FirstName__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__FirstName__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__IBAN__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__IBAN__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__IPAddress__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__IPAddress__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__LastFailedSaleTransactionDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__LastFailedSaleTransactionDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__LastName__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__LastName__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__LastTransactionDateTime__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__LastTransactionDateTime__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__LastTransactionStatus__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__LastTransactionStatus__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__MandateCreationDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__MandateCreationDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__MandateID__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__MandateID__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__MandateReceived__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__MandateReceived__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__MandateUpdateDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__MandateUpdateDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__MaxConsecutivePaymentFailures__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__MaxConsecutivePaymentFailures__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__NumConsecutiveFailures__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__NumConsecutiveFailures__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__PaymentMethodStatus__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__PaymentMethodStatus__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__PaymentRetryWindow__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__PaymentRetryWindow__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__PaypalBaid__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__PaypalBaid__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__PaypalEmail__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__PaypalEmail__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__PaypalPreapprovalKey__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__PaypalPreapprovalKey__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__PaypalType__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__PaypalType__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__Phone__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__Phone__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__PostalCode__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__PostalCode__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__State__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__State__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__StreetName__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__StreetName__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__StreetNumber__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__StreetNumber__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__TotalNumberOfErrorPayments__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__TotalNumberOfErrorPayments__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__TotalNumberOfProcessedPayments__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__TotalNumberOfProcessedPayments__c"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuora__UseDefaultRetryRule__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zuora__UseDefaultRetryRule__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
