/**
 * Zqu__Quote__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Zqu__Quote__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult attachedContentDocuments;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private com.sforce.soap.enterprise.QueryResult combinedAttachments;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String credit_Card_Capture_Link__c;

    private java.lang.String customField10__c;

    private com.sforce.soap.enterprise.QueryResult duplicateRecordItems;

    private java.lang.Boolean email_Sent_To_Customer__c;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private java.lang.Double in_Line_Discount__c;

    private java.lang.String intacctCustomerID__c;

    private java.lang.Boolean isDeleted;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.util.Calendar lastReferencedDate;

    private java.util.Calendar lastViewedDate;

    private java.util.Calendar last_Email_Sent__c;

    private com.sforce.soap.enterprise.QueryResult lookedUpFromActivities;

    private java.lang.String name;

    private java.lang.String new_Cust_Obj2__c;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private com.sforce.soap.enterprise.QueryResult opportunities__r;

    private java.lang.String opportunityType__c;

    private com.sforce.soap.enterprise.sobject.SObject owner;

    private java.lang.String ownerId;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.lang.String project_ID__c;

    private com.sforce.soap.enterprise.QueryResult recordAssociatedGroups;

    private com.sforce.soap.enterprise.sobject.RecordType recordType;

    private java.lang.String recordTypeId;

    private java.lang.Double roll_up_Effective_Price__c;

    private java.lang.Double roll_up_List_Price__c;

    private java.lang.Boolean send_Email__c;

    private java.util.Calendar systemModstamp;

    private java.lang.String text_Testing__c;

    private com.sforce.soap.enterprise.QueryResult topicAssignments;

    private com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess;

    private java.lang.Double formula_query_123__c;

    private java.lang.String query_123__c;

    private java.lang.String zqu__Account__c;

    private com.sforce.soap.enterprise.sobject.Account zqu__Account__r;

    private java.lang.String zqu__AmendmentName__c;

    private java.lang.String zqu__Amendment_Name__c;

    private java.lang.Boolean zqu__AutoRenew__c;

    private java.lang.String zqu__BillCycleDay__c;

    private java.lang.String zqu__BillToContact__c;

    private com.sforce.soap.enterprise.sobject.Contact zqu__BillToContact__r;

    private java.lang.String zqu__BillingBatch__c;

    private java.lang.String zqu__BillingCycleDay__c;

    private java.lang.String zqu__BillingMethod__c;

    private java.lang.String zqu__Calculate_Quote_Metrics_Through__c;

    private java.util.Date zqu__CancellationDate__c;

    private java.lang.String zqu__CancellationEffectiveDate__c;

    private java.lang.String zqu__CommunicationProfile__c;

    private com.sforce.soap.enterprise.sobject.Zqu__CommunicationProfile__c zqu__CommunicationProfile__r;

    private java.lang.String zqu__Currency__c;

    private java.util.Date zqu__Customer_Acceptance_Date__c;

    private java.lang.Double zqu__DeltaMRR__c;

    private java.lang.Double zqu__DeltaTCV__c;

    private java.lang.String zqu__Description__c;

    private java.lang.String zqu__ElectronicPaymentMethodId__c;

    private java.lang.String zqu__ExistSubscriptionID__c;

    private java.lang.Boolean zqu__GenerateInvoice__c;

    private java.lang.String zqu__Hidden_Subscription_Name__c;

    private java.lang.Double zqu__InitialTerm__c;

    private java.util.Date zqu__InvoiceDate__c;

    private java.lang.String zqu__InvoiceID__c;

    private java.lang.String zqu__InvoiceOwnerId__c;

    private java.lang.String zqu__InvoiceOwnerName__c;

    private java.lang.String zqu__InvoiceProcessingOption__c;

    private java.lang.Boolean zqu__InvoiceSeparately__c;

    private java.util.Date zqu__InvoiceTargetDate__c;

    private java.lang.String zqu__InvoiceTemplate__c;

    private com.sforce.soap.enterprise.sobject.Zqu__InvoiceTemplate__c zqu__InvoiceTemplate__r;

    private java.lang.Boolean zqu__Is_Charge_Expired__c;

    private java.lang.Boolean zqu__Is_Parent_Quote__c;

    private java.lang.Double zqu__MRR__c;

    private java.lang.String zqu__Number__c;

    private java.lang.String zqu__Opportunity__c;

    private com.sforce.soap.enterprise.sobject.Opportunity zqu__Opportunity__r;

    private java.lang.String zqu__ParentQuote__c;

    private com.sforce.soap.enterprise.sobject.Zqu__Quote__c zqu__ParentQuote__r;

    private java.lang.String zqu__PaymentGateway__c;

    private java.lang.String zqu__PaymentMethod__c;

    private java.lang.String zqu__PaymentTerm__c;

    private java.lang.Double zqu__Previewed_Delta_MRR__c;

    private java.lang.Double zqu__Previewed_Delta_TCV__c;

    private java.lang.Double zqu__Previewed_Discount__c;

    private java.lang.Double zqu__Previewed_MRR__c;

    private java.lang.Double zqu__Previewed_SubTotal__c;

    private java.lang.Double zqu__Previewed_TCV__c;

    private java.lang.Double zqu__Previewed_Tax__c;

    private java.lang.Double zqu__Previewed_Total__c;

    private java.lang.Boolean zqu__ProcessPayment__c;

    private java.lang.String zqu__ProductSelectorVersion__c;

    private com.sforce.soap.enterprise.QueryResult zqu__QuoteCharge__r;

    private java.lang.String zqu__QuoteTemplate__c;

    private com.sforce.soap.enterprise.sobject.Zqu__Quote_Template__c zqu__QuoteTemplate__r;

    private com.sforce.soap.enterprise.QueryResult zqu__Quote_Amendments__r;

    private com.sforce.soap.enterprise.QueryResult zqu__Quote_Product_Features__r;

    private com.sforce.soap.enterprise.QueryResult zqu__Quote_Rate_Plans__r;

    private java.lang.Boolean zqu__RecordReadOnly__c;

    private java.lang.String zqu__RenewalSetting__c;

    private java.lang.Double zqu__RenewalTerm__c;

    private java.util.Date zqu__Service_Activation_Date__c;

    private java.lang.String zqu__SoldToContact__c;

    private com.sforce.soap.enterprise.sobject.Contact zqu__SoldToContact__r;

    private java.util.Date zqu__StartDate__c;

    private java.lang.String zqu__Status__c;

    private com.sforce.soap.enterprise.QueryResult zqu__SubQuotes__r;

    private java.lang.String zqu__SubscriptionName__c;

    private java.util.Date zqu__SubscriptionTermEndDate__c;

    private java.util.Date zqu__SubscriptionTermStartDate__c;

    private java.lang.String zqu__SubscriptionType__c;

    private java.lang.Double zqu__SubscriptionVersion__c;

    private java.lang.String zqu__Subscription_Name__c;

    private java.lang.String zqu__Subscription_Term_Type__c;

    private java.lang.Double zqu__TCV__c;

    private java.lang.Double zqu__Tax__c;

    private java.util.Date zqu__TermStartDate__c;

    private java.lang.String zqu__Terms__c;

    private java.lang.Double zqu__Total__c;

    private java.util.Date zqu__ValidUntil__c;

    private java.lang.String zqu__ZuoraAccountID__c;

    private java.lang.String zqu__ZuoraConfig__c;

    private com.sforce.soap.enterprise.sobject.Zqu__ZuoraConfig__c zqu__ZuoraConfig__r;

    private java.lang.String zqu__ZuoraParentBillingAccountId__c;

    private java.lang.String zqu__ZuoraParentBillingAccountName__c;

    private java.lang.String zqu__ZuoraPaymentID__c;

    private java.lang.String zqu__ZuoraSubscriptionID__c;

    private java.lang.String zqu__Zuora_Account_Number__c;

    public Zqu__Quote__c() {
    }

    public Zqu__Quote__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult attachedContentDocuments,
           com.sforce.soap.enterprise.QueryResult attachments,
           com.sforce.soap.enterprise.QueryResult combinedAttachments,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String credit_Card_Capture_Link__c,
           java.lang.String customField10__c,
           com.sforce.soap.enterprise.QueryResult duplicateRecordItems,
           java.lang.Boolean email_Sent_To_Customer__c,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           java.lang.Double in_Line_Discount__c,
           java.lang.String intacctCustomerID__c,
           java.lang.Boolean isDeleted,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.util.Calendar lastReferencedDate,
           java.util.Calendar lastViewedDate,
           java.util.Calendar last_Email_Sent__c,
           com.sforce.soap.enterprise.QueryResult lookedUpFromActivities,
           java.lang.String name,
           java.lang.String new_Cust_Obj2__c,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           com.sforce.soap.enterprise.QueryResult opportunities__r,
           java.lang.String opportunityType__c,
           com.sforce.soap.enterprise.sobject.SObject owner,
           java.lang.String ownerId,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.lang.String project_ID__c,
           com.sforce.soap.enterprise.QueryResult recordAssociatedGroups,
           com.sforce.soap.enterprise.sobject.RecordType recordType,
           java.lang.String recordTypeId,
           java.lang.Double roll_up_Effective_Price__c,
           java.lang.Double roll_up_List_Price__c,
           java.lang.Boolean send_Email__c,
           java.util.Calendar systemModstamp,
           java.lang.String text_Testing__c,
           com.sforce.soap.enterprise.QueryResult topicAssignments,
           com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess,
           java.lang.Double formula_query_123__c,
           java.lang.String query_123__c,
           java.lang.String zqu__Account__c,
           com.sforce.soap.enterprise.sobject.Account zqu__Account__r,
           java.lang.String zqu__AmendmentName__c,
           java.lang.String zqu__Amendment_Name__c,
           java.lang.Boolean zqu__AutoRenew__c,
           java.lang.String zqu__BillCycleDay__c,
           java.lang.String zqu__BillToContact__c,
           com.sforce.soap.enterprise.sobject.Contact zqu__BillToContact__r,
           java.lang.String zqu__BillingBatch__c,
           java.lang.String zqu__BillingCycleDay__c,
           java.lang.String zqu__BillingMethod__c,
           java.lang.String zqu__Calculate_Quote_Metrics_Through__c,
           java.util.Date zqu__CancellationDate__c,
           java.lang.String zqu__CancellationEffectiveDate__c,
           java.lang.String zqu__CommunicationProfile__c,
           com.sforce.soap.enterprise.sobject.Zqu__CommunicationProfile__c zqu__CommunicationProfile__r,
           java.lang.String zqu__Currency__c,
           java.util.Date zqu__Customer_Acceptance_Date__c,
           java.lang.Double zqu__DeltaMRR__c,
           java.lang.Double zqu__DeltaTCV__c,
           java.lang.String zqu__Description__c,
           java.lang.String zqu__ElectronicPaymentMethodId__c,
           java.lang.String zqu__ExistSubscriptionID__c,
           java.lang.Boolean zqu__GenerateInvoice__c,
           java.lang.String zqu__Hidden_Subscription_Name__c,
           java.lang.Double zqu__InitialTerm__c,
           java.util.Date zqu__InvoiceDate__c,
           java.lang.String zqu__InvoiceID__c,
           java.lang.String zqu__InvoiceOwnerId__c,
           java.lang.String zqu__InvoiceOwnerName__c,
           java.lang.String zqu__InvoiceProcessingOption__c,
           java.lang.Boolean zqu__InvoiceSeparately__c,
           java.util.Date zqu__InvoiceTargetDate__c,
           java.lang.String zqu__InvoiceTemplate__c,
           com.sforce.soap.enterprise.sobject.Zqu__InvoiceTemplate__c zqu__InvoiceTemplate__r,
           java.lang.Boolean zqu__Is_Charge_Expired__c,
           java.lang.Boolean zqu__Is_Parent_Quote__c,
           java.lang.Double zqu__MRR__c,
           java.lang.String zqu__Number__c,
           java.lang.String zqu__Opportunity__c,
           com.sforce.soap.enterprise.sobject.Opportunity zqu__Opportunity__r,
           java.lang.String zqu__ParentQuote__c,
           com.sforce.soap.enterprise.sobject.Zqu__Quote__c zqu__ParentQuote__r,
           java.lang.String zqu__PaymentGateway__c,
           java.lang.String zqu__PaymentMethod__c,
           java.lang.String zqu__PaymentTerm__c,
           java.lang.Double zqu__Previewed_Delta_MRR__c,
           java.lang.Double zqu__Previewed_Delta_TCV__c,
           java.lang.Double zqu__Previewed_Discount__c,
           java.lang.Double zqu__Previewed_MRR__c,
           java.lang.Double zqu__Previewed_SubTotal__c,
           java.lang.Double zqu__Previewed_TCV__c,
           java.lang.Double zqu__Previewed_Tax__c,
           java.lang.Double zqu__Previewed_Total__c,
           java.lang.Boolean zqu__ProcessPayment__c,
           java.lang.String zqu__ProductSelectorVersion__c,
           com.sforce.soap.enterprise.QueryResult zqu__QuoteCharge__r,
           java.lang.String zqu__QuoteTemplate__c,
           com.sforce.soap.enterprise.sobject.Zqu__Quote_Template__c zqu__QuoteTemplate__r,
           com.sforce.soap.enterprise.QueryResult zqu__Quote_Amendments__r,
           com.sforce.soap.enterprise.QueryResult zqu__Quote_Product_Features__r,
           com.sforce.soap.enterprise.QueryResult zqu__Quote_Rate_Plans__r,
           java.lang.Boolean zqu__RecordReadOnly__c,
           java.lang.String zqu__RenewalSetting__c,
           java.lang.Double zqu__RenewalTerm__c,
           java.util.Date zqu__Service_Activation_Date__c,
           java.lang.String zqu__SoldToContact__c,
           com.sforce.soap.enterprise.sobject.Contact zqu__SoldToContact__r,
           java.util.Date zqu__StartDate__c,
           java.lang.String zqu__Status__c,
           com.sforce.soap.enterprise.QueryResult zqu__SubQuotes__r,
           java.lang.String zqu__SubscriptionName__c,
           java.util.Date zqu__SubscriptionTermEndDate__c,
           java.util.Date zqu__SubscriptionTermStartDate__c,
           java.lang.String zqu__SubscriptionType__c,
           java.lang.Double zqu__SubscriptionVersion__c,
           java.lang.String zqu__Subscription_Name__c,
           java.lang.String zqu__Subscription_Term_Type__c,
           java.lang.Double zqu__TCV__c,
           java.lang.Double zqu__Tax__c,
           java.util.Date zqu__TermStartDate__c,
           java.lang.String zqu__Terms__c,
           java.lang.Double zqu__Total__c,
           java.util.Date zqu__ValidUntil__c,
           java.lang.String zqu__ZuoraAccountID__c,
           java.lang.String zqu__ZuoraConfig__c,
           com.sforce.soap.enterprise.sobject.Zqu__ZuoraConfig__c zqu__ZuoraConfig__r,
           java.lang.String zqu__ZuoraParentBillingAccountId__c,
           java.lang.String zqu__ZuoraParentBillingAccountName__c,
           java.lang.String zqu__ZuoraPaymentID__c,
           java.lang.String zqu__ZuoraSubscriptionID__c,
           java.lang.String zqu__Zuora_Account_Number__c) {
        super(
            fieldsToNull,
            id);
        this.attachedContentDocuments = attachedContentDocuments;
        this.attachments = attachments;
        this.combinedAttachments = combinedAttachments;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.credit_Card_Capture_Link__c = credit_Card_Capture_Link__c;
        this.customField10__c = customField10__c;
        this.duplicateRecordItems = duplicateRecordItems;
        this.email_Sent_To_Customer__c = email_Sent_To_Customer__c;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.in_Line_Discount__c = in_Line_Discount__c;
        this.intacctCustomerID__c = intacctCustomerID__c;
        this.isDeleted = isDeleted;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.lastReferencedDate = lastReferencedDate;
        this.lastViewedDate = lastViewedDate;
        this.last_Email_Sent__c = last_Email_Sent__c;
        this.lookedUpFromActivities = lookedUpFromActivities;
        this.name = name;
        this.new_Cust_Obj2__c = new_Cust_Obj2__c;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.opportunities__r = opportunities__r;
        this.opportunityType__c = opportunityType__c;
        this.owner = owner;
        this.ownerId = ownerId;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.project_ID__c = project_ID__c;
        this.recordAssociatedGroups = recordAssociatedGroups;
        this.recordType = recordType;
        this.recordTypeId = recordTypeId;
        this.roll_up_Effective_Price__c = roll_up_Effective_Price__c;
        this.roll_up_List_Price__c = roll_up_List_Price__c;
        this.send_Email__c = send_Email__c;
        this.systemModstamp = systemModstamp;
        this.text_Testing__c = text_Testing__c;
        this.topicAssignments = topicAssignments;
        this.userRecordAccess = userRecordAccess;
        this.formula_query_123__c = formula_query_123__c;
        this.query_123__c = query_123__c;
        this.zqu__Account__c = zqu__Account__c;
        this.zqu__Account__r = zqu__Account__r;
        this.zqu__AmendmentName__c = zqu__AmendmentName__c;
        this.zqu__Amendment_Name__c = zqu__Amendment_Name__c;
        this.zqu__AutoRenew__c = zqu__AutoRenew__c;
        this.zqu__BillCycleDay__c = zqu__BillCycleDay__c;
        this.zqu__BillToContact__c = zqu__BillToContact__c;
        this.zqu__BillToContact__r = zqu__BillToContact__r;
        this.zqu__BillingBatch__c = zqu__BillingBatch__c;
        this.zqu__BillingCycleDay__c = zqu__BillingCycleDay__c;
        this.zqu__BillingMethod__c = zqu__BillingMethod__c;
        this.zqu__Calculate_Quote_Metrics_Through__c = zqu__Calculate_Quote_Metrics_Through__c;
        this.zqu__CancellationDate__c = zqu__CancellationDate__c;
        this.zqu__CancellationEffectiveDate__c = zqu__CancellationEffectiveDate__c;
        this.zqu__CommunicationProfile__c = zqu__CommunicationProfile__c;
        this.zqu__CommunicationProfile__r = zqu__CommunicationProfile__r;
        this.zqu__Currency__c = zqu__Currency__c;
        this.zqu__Customer_Acceptance_Date__c = zqu__Customer_Acceptance_Date__c;
        this.zqu__DeltaMRR__c = zqu__DeltaMRR__c;
        this.zqu__DeltaTCV__c = zqu__DeltaTCV__c;
        this.zqu__Description__c = zqu__Description__c;
        this.zqu__ElectronicPaymentMethodId__c = zqu__ElectronicPaymentMethodId__c;
        this.zqu__ExistSubscriptionID__c = zqu__ExistSubscriptionID__c;
        this.zqu__GenerateInvoice__c = zqu__GenerateInvoice__c;
        this.zqu__Hidden_Subscription_Name__c = zqu__Hidden_Subscription_Name__c;
        this.zqu__InitialTerm__c = zqu__InitialTerm__c;
        this.zqu__InvoiceDate__c = zqu__InvoiceDate__c;
        this.zqu__InvoiceID__c = zqu__InvoiceID__c;
        this.zqu__InvoiceOwnerId__c = zqu__InvoiceOwnerId__c;
        this.zqu__InvoiceOwnerName__c = zqu__InvoiceOwnerName__c;
        this.zqu__InvoiceProcessingOption__c = zqu__InvoiceProcessingOption__c;
        this.zqu__InvoiceSeparately__c = zqu__InvoiceSeparately__c;
        this.zqu__InvoiceTargetDate__c = zqu__InvoiceTargetDate__c;
        this.zqu__InvoiceTemplate__c = zqu__InvoiceTemplate__c;
        this.zqu__InvoiceTemplate__r = zqu__InvoiceTemplate__r;
        this.zqu__Is_Charge_Expired__c = zqu__Is_Charge_Expired__c;
        this.zqu__Is_Parent_Quote__c = zqu__Is_Parent_Quote__c;
        this.zqu__MRR__c = zqu__MRR__c;
        this.zqu__Number__c = zqu__Number__c;
        this.zqu__Opportunity__c = zqu__Opportunity__c;
        this.zqu__Opportunity__r = zqu__Opportunity__r;
        this.zqu__ParentQuote__c = zqu__ParentQuote__c;
        this.zqu__ParentQuote__r = zqu__ParentQuote__r;
        this.zqu__PaymentGateway__c = zqu__PaymentGateway__c;
        this.zqu__PaymentMethod__c = zqu__PaymentMethod__c;
        this.zqu__PaymentTerm__c = zqu__PaymentTerm__c;
        this.zqu__Previewed_Delta_MRR__c = zqu__Previewed_Delta_MRR__c;
        this.zqu__Previewed_Delta_TCV__c = zqu__Previewed_Delta_TCV__c;
        this.zqu__Previewed_Discount__c = zqu__Previewed_Discount__c;
        this.zqu__Previewed_MRR__c = zqu__Previewed_MRR__c;
        this.zqu__Previewed_SubTotal__c = zqu__Previewed_SubTotal__c;
        this.zqu__Previewed_TCV__c = zqu__Previewed_TCV__c;
        this.zqu__Previewed_Tax__c = zqu__Previewed_Tax__c;
        this.zqu__Previewed_Total__c = zqu__Previewed_Total__c;
        this.zqu__ProcessPayment__c = zqu__ProcessPayment__c;
        this.zqu__ProductSelectorVersion__c = zqu__ProductSelectorVersion__c;
        this.zqu__QuoteCharge__r = zqu__QuoteCharge__r;
        this.zqu__QuoteTemplate__c = zqu__QuoteTemplate__c;
        this.zqu__QuoteTemplate__r = zqu__QuoteTemplate__r;
        this.zqu__Quote_Amendments__r = zqu__Quote_Amendments__r;
        this.zqu__Quote_Product_Features__r = zqu__Quote_Product_Features__r;
        this.zqu__Quote_Rate_Plans__r = zqu__Quote_Rate_Plans__r;
        this.zqu__RecordReadOnly__c = zqu__RecordReadOnly__c;
        this.zqu__RenewalSetting__c = zqu__RenewalSetting__c;
        this.zqu__RenewalTerm__c = zqu__RenewalTerm__c;
        this.zqu__Service_Activation_Date__c = zqu__Service_Activation_Date__c;
        this.zqu__SoldToContact__c = zqu__SoldToContact__c;
        this.zqu__SoldToContact__r = zqu__SoldToContact__r;
        this.zqu__StartDate__c = zqu__StartDate__c;
        this.zqu__Status__c = zqu__Status__c;
        this.zqu__SubQuotes__r = zqu__SubQuotes__r;
        this.zqu__SubscriptionName__c = zqu__SubscriptionName__c;
        this.zqu__SubscriptionTermEndDate__c = zqu__SubscriptionTermEndDate__c;
        this.zqu__SubscriptionTermStartDate__c = zqu__SubscriptionTermStartDate__c;
        this.zqu__SubscriptionType__c = zqu__SubscriptionType__c;
        this.zqu__SubscriptionVersion__c = zqu__SubscriptionVersion__c;
        this.zqu__Subscription_Name__c = zqu__Subscription_Name__c;
        this.zqu__Subscription_Term_Type__c = zqu__Subscription_Term_Type__c;
        this.zqu__TCV__c = zqu__TCV__c;
        this.zqu__Tax__c = zqu__Tax__c;
        this.zqu__TermStartDate__c = zqu__TermStartDate__c;
        this.zqu__Terms__c = zqu__Terms__c;
        this.zqu__Total__c = zqu__Total__c;
        this.zqu__ValidUntil__c = zqu__ValidUntil__c;
        this.zqu__ZuoraAccountID__c = zqu__ZuoraAccountID__c;
        this.zqu__ZuoraConfig__c = zqu__ZuoraConfig__c;
        this.zqu__ZuoraConfig__r = zqu__ZuoraConfig__r;
        this.zqu__ZuoraParentBillingAccountId__c = zqu__ZuoraParentBillingAccountId__c;
        this.zqu__ZuoraParentBillingAccountName__c = zqu__ZuoraParentBillingAccountName__c;
        this.zqu__ZuoraPaymentID__c = zqu__ZuoraPaymentID__c;
        this.zqu__ZuoraSubscriptionID__c = zqu__ZuoraSubscriptionID__c;
        this.zqu__Zuora_Account_Number__c = zqu__Zuora_Account_Number__c;
    }


    /**
     * Gets the attachedContentDocuments value for this Zqu__Quote__c.
     * 
     * @return attachedContentDocuments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachedContentDocuments() {
        return attachedContentDocuments;
    }


    /**
     * Sets the attachedContentDocuments value for this Zqu__Quote__c.
     * 
     * @param attachedContentDocuments
     */
    public void setAttachedContentDocuments(com.sforce.soap.enterprise.QueryResult attachedContentDocuments) {
        this.attachedContentDocuments = attachedContentDocuments;
    }


    /**
     * Gets the attachments value for this Zqu__Quote__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Zqu__Quote__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the combinedAttachments value for this Zqu__Quote__c.
     * 
     * @return combinedAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getCombinedAttachments() {
        return combinedAttachments;
    }


    /**
     * Sets the combinedAttachments value for this Zqu__Quote__c.
     * 
     * @param combinedAttachments
     */
    public void setCombinedAttachments(com.sforce.soap.enterprise.QueryResult combinedAttachments) {
        this.combinedAttachments = combinedAttachments;
    }


    /**
     * Gets the createdBy value for this Zqu__Quote__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Zqu__Quote__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Zqu__Quote__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Zqu__Quote__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Zqu__Quote__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Zqu__Quote__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the credit_Card_Capture_Link__c value for this Zqu__Quote__c.
     * 
     * @return credit_Card_Capture_Link__c
     */
    public java.lang.String getCredit_Card_Capture_Link__c() {
        return credit_Card_Capture_Link__c;
    }


    /**
     * Sets the credit_Card_Capture_Link__c value for this Zqu__Quote__c.
     * 
     * @param credit_Card_Capture_Link__c
     */
    public void setCredit_Card_Capture_Link__c(java.lang.String credit_Card_Capture_Link__c) {
        this.credit_Card_Capture_Link__c = credit_Card_Capture_Link__c;
    }


    /**
     * Gets the customField10__c value for this Zqu__Quote__c.
     * 
     * @return customField10__c
     */
    public java.lang.String getCustomField10__c() {
        return customField10__c;
    }


    /**
     * Sets the customField10__c value for this Zqu__Quote__c.
     * 
     * @param customField10__c
     */
    public void setCustomField10__c(java.lang.String customField10__c) {
        this.customField10__c = customField10__c;
    }


    /**
     * Gets the duplicateRecordItems value for this Zqu__Quote__c.
     * 
     * @return duplicateRecordItems
     */
    public com.sforce.soap.enterprise.QueryResult getDuplicateRecordItems() {
        return duplicateRecordItems;
    }


    /**
     * Sets the duplicateRecordItems value for this Zqu__Quote__c.
     * 
     * @param duplicateRecordItems
     */
    public void setDuplicateRecordItems(com.sforce.soap.enterprise.QueryResult duplicateRecordItems) {
        this.duplicateRecordItems = duplicateRecordItems;
    }


    /**
     * Gets the email_Sent_To_Customer__c value for this Zqu__Quote__c.
     * 
     * @return email_Sent_To_Customer__c
     */
    public java.lang.Boolean getEmail_Sent_To_Customer__c() {
        return email_Sent_To_Customer__c;
    }


    /**
     * Sets the email_Sent_To_Customer__c value for this Zqu__Quote__c.
     * 
     * @param email_Sent_To_Customer__c
     */
    public void setEmail_Sent_To_Customer__c(java.lang.Boolean email_Sent_To_Customer__c) {
        this.email_Sent_To_Customer__c = email_Sent_To_Customer__c;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Zqu__Quote__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Zqu__Quote__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the in_Line_Discount__c value for this Zqu__Quote__c.
     * 
     * @return in_Line_Discount__c
     */
    public java.lang.Double getIn_Line_Discount__c() {
        return in_Line_Discount__c;
    }


    /**
     * Sets the in_Line_Discount__c value for this Zqu__Quote__c.
     * 
     * @param in_Line_Discount__c
     */
    public void setIn_Line_Discount__c(java.lang.Double in_Line_Discount__c) {
        this.in_Line_Discount__c = in_Line_Discount__c;
    }


    /**
     * Gets the intacctCustomerID__c value for this Zqu__Quote__c.
     * 
     * @return intacctCustomerID__c
     */
    public java.lang.String getIntacctCustomerID__c() {
        return intacctCustomerID__c;
    }


    /**
     * Sets the intacctCustomerID__c value for this Zqu__Quote__c.
     * 
     * @param intacctCustomerID__c
     */
    public void setIntacctCustomerID__c(java.lang.String intacctCustomerID__c) {
        this.intacctCustomerID__c = intacctCustomerID__c;
    }


    /**
     * Gets the isDeleted value for this Zqu__Quote__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Zqu__Quote__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this Zqu__Quote__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Zqu__Quote__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Zqu__Quote__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Zqu__Quote__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Zqu__Quote__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Zqu__Quote__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lastReferencedDate value for this Zqu__Quote__c.
     * 
     * @return lastReferencedDate
     */
    public java.util.Calendar getLastReferencedDate() {
        return lastReferencedDate;
    }


    /**
     * Sets the lastReferencedDate value for this Zqu__Quote__c.
     * 
     * @param lastReferencedDate
     */
    public void setLastReferencedDate(java.util.Calendar lastReferencedDate) {
        this.lastReferencedDate = lastReferencedDate;
    }


    /**
     * Gets the lastViewedDate value for this Zqu__Quote__c.
     * 
     * @return lastViewedDate
     */
    public java.util.Calendar getLastViewedDate() {
        return lastViewedDate;
    }


    /**
     * Sets the lastViewedDate value for this Zqu__Quote__c.
     * 
     * @param lastViewedDate
     */
    public void setLastViewedDate(java.util.Calendar lastViewedDate) {
        this.lastViewedDate = lastViewedDate;
    }


    /**
     * Gets the last_Email_Sent__c value for this Zqu__Quote__c.
     * 
     * @return last_Email_Sent__c
     */
    public java.util.Calendar getLast_Email_Sent__c() {
        return last_Email_Sent__c;
    }


    /**
     * Sets the last_Email_Sent__c value for this Zqu__Quote__c.
     * 
     * @param last_Email_Sent__c
     */
    public void setLast_Email_Sent__c(java.util.Calendar last_Email_Sent__c) {
        this.last_Email_Sent__c = last_Email_Sent__c;
    }


    /**
     * Gets the lookedUpFromActivities value for this Zqu__Quote__c.
     * 
     * @return lookedUpFromActivities
     */
    public com.sforce.soap.enterprise.QueryResult getLookedUpFromActivities() {
        return lookedUpFromActivities;
    }


    /**
     * Sets the lookedUpFromActivities value for this Zqu__Quote__c.
     * 
     * @param lookedUpFromActivities
     */
    public void setLookedUpFromActivities(com.sforce.soap.enterprise.QueryResult lookedUpFromActivities) {
        this.lookedUpFromActivities = lookedUpFromActivities;
    }


    /**
     * Gets the name value for this Zqu__Quote__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Zqu__Quote__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the new_Cust_Obj2__c value for this Zqu__Quote__c.
     * 
     * @return new_Cust_Obj2__c
     */
    public java.lang.String getNew_Cust_Obj2__c() {
        return new_Cust_Obj2__c;
    }


    /**
     * Sets the new_Cust_Obj2__c value for this Zqu__Quote__c.
     * 
     * @param new_Cust_Obj2__c
     */
    public void setNew_Cust_Obj2__c(java.lang.String new_Cust_Obj2__c) {
        this.new_Cust_Obj2__c = new_Cust_Obj2__c;
    }


    /**
     * Gets the notes value for this Zqu__Quote__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Zqu__Quote__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Zqu__Quote__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Zqu__Quote__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the opportunities__r value for this Zqu__Quote__c.
     * 
     * @return opportunities__r
     */
    public com.sforce.soap.enterprise.QueryResult getOpportunities__r() {
        return opportunities__r;
    }


    /**
     * Sets the opportunities__r value for this Zqu__Quote__c.
     * 
     * @param opportunities__r
     */
    public void setOpportunities__r(com.sforce.soap.enterprise.QueryResult opportunities__r) {
        this.opportunities__r = opportunities__r;
    }


    /**
     * Gets the opportunityType__c value for this Zqu__Quote__c.
     * 
     * @return opportunityType__c
     */
    public java.lang.String getOpportunityType__c() {
        return opportunityType__c;
    }


    /**
     * Sets the opportunityType__c value for this Zqu__Quote__c.
     * 
     * @param opportunityType__c
     */
    public void setOpportunityType__c(java.lang.String opportunityType__c) {
        this.opportunityType__c = opportunityType__c;
    }


    /**
     * Gets the owner value for this Zqu__Quote__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.SObject getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Zqu__Quote__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.SObject owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Zqu__Quote__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Zqu__Quote__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the processInstances value for this Zqu__Quote__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Zqu__Quote__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Zqu__Quote__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Zqu__Quote__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the project_ID__c value for this Zqu__Quote__c.
     * 
     * @return project_ID__c
     */
    public java.lang.String getProject_ID__c() {
        return project_ID__c;
    }


    /**
     * Sets the project_ID__c value for this Zqu__Quote__c.
     * 
     * @param project_ID__c
     */
    public void setProject_ID__c(java.lang.String project_ID__c) {
        this.project_ID__c = project_ID__c;
    }


    /**
     * Gets the recordAssociatedGroups value for this Zqu__Quote__c.
     * 
     * @return recordAssociatedGroups
     */
    public com.sforce.soap.enterprise.QueryResult getRecordAssociatedGroups() {
        return recordAssociatedGroups;
    }


    /**
     * Sets the recordAssociatedGroups value for this Zqu__Quote__c.
     * 
     * @param recordAssociatedGroups
     */
    public void setRecordAssociatedGroups(com.sforce.soap.enterprise.QueryResult recordAssociatedGroups) {
        this.recordAssociatedGroups = recordAssociatedGroups;
    }


    /**
     * Gets the recordType value for this Zqu__Quote__c.
     * 
     * @return recordType
     */
    public com.sforce.soap.enterprise.sobject.RecordType getRecordType() {
        return recordType;
    }


    /**
     * Sets the recordType value for this Zqu__Quote__c.
     * 
     * @param recordType
     */
    public void setRecordType(com.sforce.soap.enterprise.sobject.RecordType recordType) {
        this.recordType = recordType;
    }


    /**
     * Gets the recordTypeId value for this Zqu__Quote__c.
     * 
     * @return recordTypeId
     */
    public java.lang.String getRecordTypeId() {
        return recordTypeId;
    }


    /**
     * Sets the recordTypeId value for this Zqu__Quote__c.
     * 
     * @param recordTypeId
     */
    public void setRecordTypeId(java.lang.String recordTypeId) {
        this.recordTypeId = recordTypeId;
    }


    /**
     * Gets the roll_up_Effective_Price__c value for this Zqu__Quote__c.
     * 
     * @return roll_up_Effective_Price__c
     */
    public java.lang.Double getRoll_up_Effective_Price__c() {
        return roll_up_Effective_Price__c;
    }


    /**
     * Sets the roll_up_Effective_Price__c value for this Zqu__Quote__c.
     * 
     * @param roll_up_Effective_Price__c
     */
    public void setRoll_up_Effective_Price__c(java.lang.Double roll_up_Effective_Price__c) {
        this.roll_up_Effective_Price__c = roll_up_Effective_Price__c;
    }


    /**
     * Gets the roll_up_List_Price__c value for this Zqu__Quote__c.
     * 
     * @return roll_up_List_Price__c
     */
    public java.lang.Double getRoll_up_List_Price__c() {
        return roll_up_List_Price__c;
    }


    /**
     * Sets the roll_up_List_Price__c value for this Zqu__Quote__c.
     * 
     * @param roll_up_List_Price__c
     */
    public void setRoll_up_List_Price__c(java.lang.Double roll_up_List_Price__c) {
        this.roll_up_List_Price__c = roll_up_List_Price__c;
    }


    /**
     * Gets the send_Email__c value for this Zqu__Quote__c.
     * 
     * @return send_Email__c
     */
    public java.lang.Boolean getSend_Email__c() {
        return send_Email__c;
    }


    /**
     * Sets the send_Email__c value for this Zqu__Quote__c.
     * 
     * @param send_Email__c
     */
    public void setSend_Email__c(java.lang.Boolean send_Email__c) {
        this.send_Email__c = send_Email__c;
    }


    /**
     * Gets the systemModstamp value for this Zqu__Quote__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Zqu__Quote__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the text_Testing__c value for this Zqu__Quote__c.
     * 
     * @return text_Testing__c
     */
    public java.lang.String getText_Testing__c() {
        return text_Testing__c;
    }


    /**
     * Sets the text_Testing__c value for this Zqu__Quote__c.
     * 
     * @param text_Testing__c
     */
    public void setText_Testing__c(java.lang.String text_Testing__c) {
        this.text_Testing__c = text_Testing__c;
    }


    /**
     * Gets the topicAssignments value for this Zqu__Quote__c.
     * 
     * @return topicAssignments
     */
    public com.sforce.soap.enterprise.QueryResult getTopicAssignments() {
        return topicAssignments;
    }


    /**
     * Sets the topicAssignments value for this Zqu__Quote__c.
     * 
     * @param topicAssignments
     */
    public void setTopicAssignments(com.sforce.soap.enterprise.QueryResult topicAssignments) {
        this.topicAssignments = topicAssignments;
    }


    /**
     * Gets the userRecordAccess value for this Zqu__Quote__c.
     * 
     * @return userRecordAccess
     */
    public com.sforce.soap.enterprise.sobject.UserRecordAccess getUserRecordAccess() {
        return userRecordAccess;
    }


    /**
     * Sets the userRecordAccess value for this Zqu__Quote__c.
     * 
     * @param userRecordAccess
     */
    public void setUserRecordAccess(com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess) {
        this.userRecordAccess = userRecordAccess;
    }


    /**
     * Gets the formula_query_123__c value for this Zqu__Quote__c.
     * 
     * @return formula_query_123__c
     */
    public java.lang.Double getFormula_query_123__c() {
        return formula_query_123__c;
    }


    /**
     * Sets the formula_query_123__c value for this Zqu__Quote__c.
     * 
     * @param formula_query_123__c
     */
    public void setFormula_query_123__c(java.lang.Double formula_query_123__c) {
        this.formula_query_123__c = formula_query_123__c;
    }


    /**
     * Gets the query_123__c value for this Zqu__Quote__c.
     * 
     * @return query_123__c
     */
    public java.lang.String getQuery_123__c() {
        return query_123__c;
    }


    /**
     * Sets the query_123__c value for this Zqu__Quote__c.
     * 
     * @param query_123__c
     */
    public void setQuery_123__c(java.lang.String query_123__c) {
        this.query_123__c = query_123__c;
    }


    /**
     * Gets the zqu__Account__c value for this Zqu__Quote__c.
     * 
     * @return zqu__Account__c
     */
    public java.lang.String getZqu__Account__c() {
        return zqu__Account__c;
    }


    /**
     * Sets the zqu__Account__c value for this Zqu__Quote__c.
     * 
     * @param zqu__Account__c
     */
    public void setZqu__Account__c(java.lang.String zqu__Account__c) {
        this.zqu__Account__c = zqu__Account__c;
    }


    /**
     * Gets the zqu__Account__r value for this Zqu__Quote__c.
     * 
     * @return zqu__Account__r
     */
    public com.sforce.soap.enterprise.sobject.Account getZqu__Account__r() {
        return zqu__Account__r;
    }


    /**
     * Sets the zqu__Account__r value for this Zqu__Quote__c.
     * 
     * @param zqu__Account__r
     */
    public void setZqu__Account__r(com.sforce.soap.enterprise.sobject.Account zqu__Account__r) {
        this.zqu__Account__r = zqu__Account__r;
    }


    /**
     * Gets the zqu__AmendmentName__c value for this Zqu__Quote__c.
     * 
     * @return zqu__AmendmentName__c
     */
    public java.lang.String getZqu__AmendmentName__c() {
        return zqu__AmendmentName__c;
    }


    /**
     * Sets the zqu__AmendmentName__c value for this Zqu__Quote__c.
     * 
     * @param zqu__AmendmentName__c
     */
    public void setZqu__AmendmentName__c(java.lang.String zqu__AmendmentName__c) {
        this.zqu__AmendmentName__c = zqu__AmendmentName__c;
    }


    /**
     * Gets the zqu__Amendment_Name__c value for this Zqu__Quote__c.
     * 
     * @return zqu__Amendment_Name__c
     */
    public java.lang.String getZqu__Amendment_Name__c() {
        return zqu__Amendment_Name__c;
    }


    /**
     * Sets the zqu__Amendment_Name__c value for this Zqu__Quote__c.
     * 
     * @param zqu__Amendment_Name__c
     */
    public void setZqu__Amendment_Name__c(java.lang.String zqu__Amendment_Name__c) {
        this.zqu__Amendment_Name__c = zqu__Amendment_Name__c;
    }


    /**
     * Gets the zqu__AutoRenew__c value for this Zqu__Quote__c.
     * 
     * @return zqu__AutoRenew__c
     */
    public java.lang.Boolean getZqu__AutoRenew__c() {
        return zqu__AutoRenew__c;
    }


    /**
     * Sets the zqu__AutoRenew__c value for this Zqu__Quote__c.
     * 
     * @param zqu__AutoRenew__c
     */
    public void setZqu__AutoRenew__c(java.lang.Boolean zqu__AutoRenew__c) {
        this.zqu__AutoRenew__c = zqu__AutoRenew__c;
    }


    /**
     * Gets the zqu__BillCycleDay__c value for this Zqu__Quote__c.
     * 
     * @return zqu__BillCycleDay__c
     */
    public java.lang.String getZqu__BillCycleDay__c() {
        return zqu__BillCycleDay__c;
    }


    /**
     * Sets the zqu__BillCycleDay__c value for this Zqu__Quote__c.
     * 
     * @param zqu__BillCycleDay__c
     */
    public void setZqu__BillCycleDay__c(java.lang.String zqu__BillCycleDay__c) {
        this.zqu__BillCycleDay__c = zqu__BillCycleDay__c;
    }


    /**
     * Gets the zqu__BillToContact__c value for this Zqu__Quote__c.
     * 
     * @return zqu__BillToContact__c
     */
    public java.lang.String getZqu__BillToContact__c() {
        return zqu__BillToContact__c;
    }


    /**
     * Sets the zqu__BillToContact__c value for this Zqu__Quote__c.
     * 
     * @param zqu__BillToContact__c
     */
    public void setZqu__BillToContact__c(java.lang.String zqu__BillToContact__c) {
        this.zqu__BillToContact__c = zqu__BillToContact__c;
    }


    /**
     * Gets the zqu__BillToContact__r value for this Zqu__Quote__c.
     * 
     * @return zqu__BillToContact__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getZqu__BillToContact__r() {
        return zqu__BillToContact__r;
    }


    /**
     * Sets the zqu__BillToContact__r value for this Zqu__Quote__c.
     * 
     * @param zqu__BillToContact__r
     */
    public void setZqu__BillToContact__r(com.sforce.soap.enterprise.sobject.Contact zqu__BillToContact__r) {
        this.zqu__BillToContact__r = zqu__BillToContact__r;
    }


    /**
     * Gets the zqu__BillingBatch__c value for this Zqu__Quote__c.
     * 
     * @return zqu__BillingBatch__c
     */
    public java.lang.String getZqu__BillingBatch__c() {
        return zqu__BillingBatch__c;
    }


    /**
     * Sets the zqu__BillingBatch__c value for this Zqu__Quote__c.
     * 
     * @param zqu__BillingBatch__c
     */
    public void setZqu__BillingBatch__c(java.lang.String zqu__BillingBatch__c) {
        this.zqu__BillingBatch__c = zqu__BillingBatch__c;
    }


    /**
     * Gets the zqu__BillingCycleDay__c value for this Zqu__Quote__c.
     * 
     * @return zqu__BillingCycleDay__c
     */
    public java.lang.String getZqu__BillingCycleDay__c() {
        return zqu__BillingCycleDay__c;
    }


    /**
     * Sets the zqu__BillingCycleDay__c value for this Zqu__Quote__c.
     * 
     * @param zqu__BillingCycleDay__c
     */
    public void setZqu__BillingCycleDay__c(java.lang.String zqu__BillingCycleDay__c) {
        this.zqu__BillingCycleDay__c = zqu__BillingCycleDay__c;
    }


    /**
     * Gets the zqu__BillingMethod__c value for this Zqu__Quote__c.
     * 
     * @return zqu__BillingMethod__c
     */
    public java.lang.String getZqu__BillingMethod__c() {
        return zqu__BillingMethod__c;
    }


    /**
     * Sets the zqu__BillingMethod__c value for this Zqu__Quote__c.
     * 
     * @param zqu__BillingMethod__c
     */
    public void setZqu__BillingMethod__c(java.lang.String zqu__BillingMethod__c) {
        this.zqu__BillingMethod__c = zqu__BillingMethod__c;
    }


    /**
     * Gets the zqu__Calculate_Quote_Metrics_Through__c value for this Zqu__Quote__c.
     * 
     * @return zqu__Calculate_Quote_Metrics_Through__c
     */
    public java.lang.String getZqu__Calculate_Quote_Metrics_Through__c() {
        return zqu__Calculate_Quote_Metrics_Through__c;
    }


    /**
     * Sets the zqu__Calculate_Quote_Metrics_Through__c value for this Zqu__Quote__c.
     * 
     * @param zqu__Calculate_Quote_Metrics_Through__c
     */
    public void setZqu__Calculate_Quote_Metrics_Through__c(java.lang.String zqu__Calculate_Quote_Metrics_Through__c) {
        this.zqu__Calculate_Quote_Metrics_Through__c = zqu__Calculate_Quote_Metrics_Through__c;
    }


    /**
     * Gets the zqu__CancellationDate__c value for this Zqu__Quote__c.
     * 
     * @return zqu__CancellationDate__c
     */
    public java.util.Date getZqu__CancellationDate__c() {
        return zqu__CancellationDate__c;
    }


    /**
     * Sets the zqu__CancellationDate__c value for this Zqu__Quote__c.
     * 
     * @param zqu__CancellationDate__c
     */
    public void setZqu__CancellationDate__c(java.util.Date zqu__CancellationDate__c) {
        this.zqu__CancellationDate__c = zqu__CancellationDate__c;
    }


    /**
     * Gets the zqu__CancellationEffectiveDate__c value for this Zqu__Quote__c.
     * 
     * @return zqu__CancellationEffectiveDate__c
     */
    public java.lang.String getZqu__CancellationEffectiveDate__c() {
        return zqu__CancellationEffectiveDate__c;
    }


    /**
     * Sets the zqu__CancellationEffectiveDate__c value for this Zqu__Quote__c.
     * 
     * @param zqu__CancellationEffectiveDate__c
     */
    public void setZqu__CancellationEffectiveDate__c(java.lang.String zqu__CancellationEffectiveDate__c) {
        this.zqu__CancellationEffectiveDate__c = zqu__CancellationEffectiveDate__c;
    }


    /**
     * Gets the zqu__CommunicationProfile__c value for this Zqu__Quote__c.
     * 
     * @return zqu__CommunicationProfile__c
     */
    public java.lang.String getZqu__CommunicationProfile__c() {
        return zqu__CommunicationProfile__c;
    }


    /**
     * Sets the zqu__CommunicationProfile__c value for this Zqu__Quote__c.
     * 
     * @param zqu__CommunicationProfile__c
     */
    public void setZqu__CommunicationProfile__c(java.lang.String zqu__CommunicationProfile__c) {
        this.zqu__CommunicationProfile__c = zqu__CommunicationProfile__c;
    }


    /**
     * Gets the zqu__CommunicationProfile__r value for this Zqu__Quote__c.
     * 
     * @return zqu__CommunicationProfile__r
     */
    public com.sforce.soap.enterprise.sobject.Zqu__CommunicationProfile__c getZqu__CommunicationProfile__r() {
        return zqu__CommunicationProfile__r;
    }


    /**
     * Sets the zqu__CommunicationProfile__r value for this Zqu__Quote__c.
     * 
     * @param zqu__CommunicationProfile__r
     */
    public void setZqu__CommunicationProfile__r(com.sforce.soap.enterprise.sobject.Zqu__CommunicationProfile__c zqu__CommunicationProfile__r) {
        this.zqu__CommunicationProfile__r = zqu__CommunicationProfile__r;
    }


    /**
     * Gets the zqu__Currency__c value for this Zqu__Quote__c.
     * 
     * @return zqu__Currency__c
     */
    public java.lang.String getZqu__Currency__c() {
        return zqu__Currency__c;
    }


    /**
     * Sets the zqu__Currency__c value for this Zqu__Quote__c.
     * 
     * @param zqu__Currency__c
     */
    public void setZqu__Currency__c(java.lang.String zqu__Currency__c) {
        this.zqu__Currency__c = zqu__Currency__c;
    }


    /**
     * Gets the zqu__Customer_Acceptance_Date__c value for this Zqu__Quote__c.
     * 
     * @return zqu__Customer_Acceptance_Date__c
     */
    public java.util.Date getZqu__Customer_Acceptance_Date__c() {
        return zqu__Customer_Acceptance_Date__c;
    }


    /**
     * Sets the zqu__Customer_Acceptance_Date__c value for this Zqu__Quote__c.
     * 
     * @param zqu__Customer_Acceptance_Date__c
     */
    public void setZqu__Customer_Acceptance_Date__c(java.util.Date zqu__Customer_Acceptance_Date__c) {
        this.zqu__Customer_Acceptance_Date__c = zqu__Customer_Acceptance_Date__c;
    }


    /**
     * Gets the zqu__DeltaMRR__c value for this Zqu__Quote__c.
     * 
     * @return zqu__DeltaMRR__c
     */
    public java.lang.Double getZqu__DeltaMRR__c() {
        return zqu__DeltaMRR__c;
    }


    /**
     * Sets the zqu__DeltaMRR__c value for this Zqu__Quote__c.
     * 
     * @param zqu__DeltaMRR__c
     */
    public void setZqu__DeltaMRR__c(java.lang.Double zqu__DeltaMRR__c) {
        this.zqu__DeltaMRR__c = zqu__DeltaMRR__c;
    }


    /**
     * Gets the zqu__DeltaTCV__c value for this Zqu__Quote__c.
     * 
     * @return zqu__DeltaTCV__c
     */
    public java.lang.Double getZqu__DeltaTCV__c() {
        return zqu__DeltaTCV__c;
    }


    /**
     * Sets the zqu__DeltaTCV__c value for this Zqu__Quote__c.
     * 
     * @param zqu__DeltaTCV__c
     */
    public void setZqu__DeltaTCV__c(java.lang.Double zqu__DeltaTCV__c) {
        this.zqu__DeltaTCV__c = zqu__DeltaTCV__c;
    }


    /**
     * Gets the zqu__Description__c value for this Zqu__Quote__c.
     * 
     * @return zqu__Description__c
     */
    public java.lang.String getZqu__Description__c() {
        return zqu__Description__c;
    }


    /**
     * Sets the zqu__Description__c value for this Zqu__Quote__c.
     * 
     * @param zqu__Description__c
     */
    public void setZqu__Description__c(java.lang.String zqu__Description__c) {
        this.zqu__Description__c = zqu__Description__c;
    }


    /**
     * Gets the zqu__ElectronicPaymentMethodId__c value for this Zqu__Quote__c.
     * 
     * @return zqu__ElectronicPaymentMethodId__c
     */
    public java.lang.String getZqu__ElectronicPaymentMethodId__c() {
        return zqu__ElectronicPaymentMethodId__c;
    }


    /**
     * Sets the zqu__ElectronicPaymentMethodId__c value for this Zqu__Quote__c.
     * 
     * @param zqu__ElectronicPaymentMethodId__c
     */
    public void setZqu__ElectronicPaymentMethodId__c(java.lang.String zqu__ElectronicPaymentMethodId__c) {
        this.zqu__ElectronicPaymentMethodId__c = zqu__ElectronicPaymentMethodId__c;
    }


    /**
     * Gets the zqu__ExistSubscriptionID__c value for this Zqu__Quote__c.
     * 
     * @return zqu__ExistSubscriptionID__c
     */
    public java.lang.String getZqu__ExistSubscriptionID__c() {
        return zqu__ExistSubscriptionID__c;
    }


    /**
     * Sets the zqu__ExistSubscriptionID__c value for this Zqu__Quote__c.
     * 
     * @param zqu__ExistSubscriptionID__c
     */
    public void setZqu__ExistSubscriptionID__c(java.lang.String zqu__ExistSubscriptionID__c) {
        this.zqu__ExistSubscriptionID__c = zqu__ExistSubscriptionID__c;
    }


    /**
     * Gets the zqu__GenerateInvoice__c value for this Zqu__Quote__c.
     * 
     * @return zqu__GenerateInvoice__c
     */
    public java.lang.Boolean getZqu__GenerateInvoice__c() {
        return zqu__GenerateInvoice__c;
    }


    /**
     * Sets the zqu__GenerateInvoice__c value for this Zqu__Quote__c.
     * 
     * @param zqu__GenerateInvoice__c
     */
    public void setZqu__GenerateInvoice__c(java.lang.Boolean zqu__GenerateInvoice__c) {
        this.zqu__GenerateInvoice__c = zqu__GenerateInvoice__c;
    }


    /**
     * Gets the zqu__Hidden_Subscription_Name__c value for this Zqu__Quote__c.
     * 
     * @return zqu__Hidden_Subscription_Name__c
     */
    public java.lang.String getZqu__Hidden_Subscription_Name__c() {
        return zqu__Hidden_Subscription_Name__c;
    }


    /**
     * Sets the zqu__Hidden_Subscription_Name__c value for this Zqu__Quote__c.
     * 
     * @param zqu__Hidden_Subscription_Name__c
     */
    public void setZqu__Hidden_Subscription_Name__c(java.lang.String zqu__Hidden_Subscription_Name__c) {
        this.zqu__Hidden_Subscription_Name__c = zqu__Hidden_Subscription_Name__c;
    }


    /**
     * Gets the zqu__InitialTerm__c value for this Zqu__Quote__c.
     * 
     * @return zqu__InitialTerm__c
     */
    public java.lang.Double getZqu__InitialTerm__c() {
        return zqu__InitialTerm__c;
    }


    /**
     * Sets the zqu__InitialTerm__c value for this Zqu__Quote__c.
     * 
     * @param zqu__InitialTerm__c
     */
    public void setZqu__InitialTerm__c(java.lang.Double zqu__InitialTerm__c) {
        this.zqu__InitialTerm__c = zqu__InitialTerm__c;
    }


    /**
     * Gets the zqu__InvoiceDate__c value for this Zqu__Quote__c.
     * 
     * @return zqu__InvoiceDate__c
     */
    public java.util.Date getZqu__InvoiceDate__c() {
        return zqu__InvoiceDate__c;
    }


    /**
     * Sets the zqu__InvoiceDate__c value for this Zqu__Quote__c.
     * 
     * @param zqu__InvoiceDate__c
     */
    public void setZqu__InvoiceDate__c(java.util.Date zqu__InvoiceDate__c) {
        this.zqu__InvoiceDate__c = zqu__InvoiceDate__c;
    }


    /**
     * Gets the zqu__InvoiceID__c value for this Zqu__Quote__c.
     * 
     * @return zqu__InvoiceID__c
     */
    public java.lang.String getZqu__InvoiceID__c() {
        return zqu__InvoiceID__c;
    }


    /**
     * Sets the zqu__InvoiceID__c value for this Zqu__Quote__c.
     * 
     * @param zqu__InvoiceID__c
     */
    public void setZqu__InvoiceID__c(java.lang.String zqu__InvoiceID__c) {
        this.zqu__InvoiceID__c = zqu__InvoiceID__c;
    }


    /**
     * Gets the zqu__InvoiceOwnerId__c value for this Zqu__Quote__c.
     * 
     * @return zqu__InvoiceOwnerId__c
     */
    public java.lang.String getZqu__InvoiceOwnerId__c() {
        return zqu__InvoiceOwnerId__c;
    }


    /**
     * Sets the zqu__InvoiceOwnerId__c value for this Zqu__Quote__c.
     * 
     * @param zqu__InvoiceOwnerId__c
     */
    public void setZqu__InvoiceOwnerId__c(java.lang.String zqu__InvoiceOwnerId__c) {
        this.zqu__InvoiceOwnerId__c = zqu__InvoiceOwnerId__c;
    }


    /**
     * Gets the zqu__InvoiceOwnerName__c value for this Zqu__Quote__c.
     * 
     * @return zqu__InvoiceOwnerName__c
     */
    public java.lang.String getZqu__InvoiceOwnerName__c() {
        return zqu__InvoiceOwnerName__c;
    }


    /**
     * Sets the zqu__InvoiceOwnerName__c value for this Zqu__Quote__c.
     * 
     * @param zqu__InvoiceOwnerName__c
     */
    public void setZqu__InvoiceOwnerName__c(java.lang.String zqu__InvoiceOwnerName__c) {
        this.zqu__InvoiceOwnerName__c = zqu__InvoiceOwnerName__c;
    }


    /**
     * Gets the zqu__InvoiceProcessingOption__c value for this Zqu__Quote__c.
     * 
     * @return zqu__InvoiceProcessingOption__c
     */
    public java.lang.String getZqu__InvoiceProcessingOption__c() {
        return zqu__InvoiceProcessingOption__c;
    }


    /**
     * Sets the zqu__InvoiceProcessingOption__c value for this Zqu__Quote__c.
     * 
     * @param zqu__InvoiceProcessingOption__c
     */
    public void setZqu__InvoiceProcessingOption__c(java.lang.String zqu__InvoiceProcessingOption__c) {
        this.zqu__InvoiceProcessingOption__c = zqu__InvoiceProcessingOption__c;
    }


    /**
     * Gets the zqu__InvoiceSeparately__c value for this Zqu__Quote__c.
     * 
     * @return zqu__InvoiceSeparately__c
     */
    public java.lang.Boolean getZqu__InvoiceSeparately__c() {
        return zqu__InvoiceSeparately__c;
    }


    /**
     * Sets the zqu__InvoiceSeparately__c value for this Zqu__Quote__c.
     * 
     * @param zqu__InvoiceSeparately__c
     */
    public void setZqu__InvoiceSeparately__c(java.lang.Boolean zqu__InvoiceSeparately__c) {
        this.zqu__InvoiceSeparately__c = zqu__InvoiceSeparately__c;
    }


    /**
     * Gets the zqu__InvoiceTargetDate__c value for this Zqu__Quote__c.
     * 
     * @return zqu__InvoiceTargetDate__c
     */
    public java.util.Date getZqu__InvoiceTargetDate__c() {
        return zqu__InvoiceTargetDate__c;
    }


    /**
     * Sets the zqu__InvoiceTargetDate__c value for this Zqu__Quote__c.
     * 
     * @param zqu__InvoiceTargetDate__c
     */
    public void setZqu__InvoiceTargetDate__c(java.util.Date zqu__InvoiceTargetDate__c) {
        this.zqu__InvoiceTargetDate__c = zqu__InvoiceTargetDate__c;
    }


    /**
     * Gets the zqu__InvoiceTemplate__c value for this Zqu__Quote__c.
     * 
     * @return zqu__InvoiceTemplate__c
     */
    public java.lang.String getZqu__InvoiceTemplate__c() {
        return zqu__InvoiceTemplate__c;
    }


    /**
     * Sets the zqu__InvoiceTemplate__c value for this Zqu__Quote__c.
     * 
     * @param zqu__InvoiceTemplate__c
     */
    public void setZqu__InvoiceTemplate__c(java.lang.String zqu__InvoiceTemplate__c) {
        this.zqu__InvoiceTemplate__c = zqu__InvoiceTemplate__c;
    }


    /**
     * Gets the zqu__InvoiceTemplate__r value for this Zqu__Quote__c.
     * 
     * @return zqu__InvoiceTemplate__r
     */
    public com.sforce.soap.enterprise.sobject.Zqu__InvoiceTemplate__c getZqu__InvoiceTemplate__r() {
        return zqu__InvoiceTemplate__r;
    }


    /**
     * Sets the zqu__InvoiceTemplate__r value for this Zqu__Quote__c.
     * 
     * @param zqu__InvoiceTemplate__r
     */
    public void setZqu__InvoiceTemplate__r(com.sforce.soap.enterprise.sobject.Zqu__InvoiceTemplate__c zqu__InvoiceTemplate__r) {
        this.zqu__InvoiceTemplate__r = zqu__InvoiceTemplate__r;
    }


    /**
     * Gets the zqu__Is_Charge_Expired__c value for this Zqu__Quote__c.
     * 
     * @return zqu__Is_Charge_Expired__c
     */
    public java.lang.Boolean getZqu__Is_Charge_Expired__c() {
        return zqu__Is_Charge_Expired__c;
    }


    /**
     * Sets the zqu__Is_Charge_Expired__c value for this Zqu__Quote__c.
     * 
     * @param zqu__Is_Charge_Expired__c
     */
    public void setZqu__Is_Charge_Expired__c(java.lang.Boolean zqu__Is_Charge_Expired__c) {
        this.zqu__Is_Charge_Expired__c = zqu__Is_Charge_Expired__c;
    }


    /**
     * Gets the zqu__Is_Parent_Quote__c value for this Zqu__Quote__c.
     * 
     * @return zqu__Is_Parent_Quote__c
     */
    public java.lang.Boolean getZqu__Is_Parent_Quote__c() {
        return zqu__Is_Parent_Quote__c;
    }


    /**
     * Sets the zqu__Is_Parent_Quote__c value for this Zqu__Quote__c.
     * 
     * @param zqu__Is_Parent_Quote__c
     */
    public void setZqu__Is_Parent_Quote__c(java.lang.Boolean zqu__Is_Parent_Quote__c) {
        this.zqu__Is_Parent_Quote__c = zqu__Is_Parent_Quote__c;
    }


    /**
     * Gets the zqu__MRR__c value for this Zqu__Quote__c.
     * 
     * @return zqu__MRR__c
     */
    public java.lang.Double getZqu__MRR__c() {
        return zqu__MRR__c;
    }


    /**
     * Sets the zqu__MRR__c value for this Zqu__Quote__c.
     * 
     * @param zqu__MRR__c
     */
    public void setZqu__MRR__c(java.lang.Double zqu__MRR__c) {
        this.zqu__MRR__c = zqu__MRR__c;
    }


    /**
     * Gets the zqu__Number__c value for this Zqu__Quote__c.
     * 
     * @return zqu__Number__c
     */
    public java.lang.String getZqu__Number__c() {
        return zqu__Number__c;
    }


    /**
     * Sets the zqu__Number__c value for this Zqu__Quote__c.
     * 
     * @param zqu__Number__c
     */
    public void setZqu__Number__c(java.lang.String zqu__Number__c) {
        this.zqu__Number__c = zqu__Number__c;
    }


    /**
     * Gets the zqu__Opportunity__c value for this Zqu__Quote__c.
     * 
     * @return zqu__Opportunity__c
     */
    public java.lang.String getZqu__Opportunity__c() {
        return zqu__Opportunity__c;
    }


    /**
     * Sets the zqu__Opportunity__c value for this Zqu__Quote__c.
     * 
     * @param zqu__Opportunity__c
     */
    public void setZqu__Opportunity__c(java.lang.String zqu__Opportunity__c) {
        this.zqu__Opportunity__c = zqu__Opportunity__c;
    }


    /**
     * Gets the zqu__Opportunity__r value for this Zqu__Quote__c.
     * 
     * @return zqu__Opportunity__r
     */
    public com.sforce.soap.enterprise.sobject.Opportunity getZqu__Opportunity__r() {
        return zqu__Opportunity__r;
    }


    /**
     * Sets the zqu__Opportunity__r value for this Zqu__Quote__c.
     * 
     * @param zqu__Opportunity__r
     */
    public void setZqu__Opportunity__r(com.sforce.soap.enterprise.sobject.Opportunity zqu__Opportunity__r) {
        this.zqu__Opportunity__r = zqu__Opportunity__r;
    }


    /**
     * Gets the zqu__ParentQuote__c value for this Zqu__Quote__c.
     * 
     * @return zqu__ParentQuote__c
     */
    public java.lang.String getZqu__ParentQuote__c() {
        return zqu__ParentQuote__c;
    }


    /**
     * Sets the zqu__ParentQuote__c value for this Zqu__Quote__c.
     * 
     * @param zqu__ParentQuote__c
     */
    public void setZqu__ParentQuote__c(java.lang.String zqu__ParentQuote__c) {
        this.zqu__ParentQuote__c = zqu__ParentQuote__c;
    }


    /**
     * Gets the zqu__ParentQuote__r value for this Zqu__Quote__c.
     * 
     * @return zqu__ParentQuote__r
     */
    public com.sforce.soap.enterprise.sobject.Zqu__Quote__c getZqu__ParentQuote__r() {
        return zqu__ParentQuote__r;
    }


    /**
     * Sets the zqu__ParentQuote__r value for this Zqu__Quote__c.
     * 
     * @param zqu__ParentQuote__r
     */
    public void setZqu__ParentQuote__r(com.sforce.soap.enterprise.sobject.Zqu__Quote__c zqu__ParentQuote__r) {
        this.zqu__ParentQuote__r = zqu__ParentQuote__r;
    }


    /**
     * Gets the zqu__PaymentGateway__c value for this Zqu__Quote__c.
     * 
     * @return zqu__PaymentGateway__c
     */
    public java.lang.String getZqu__PaymentGateway__c() {
        return zqu__PaymentGateway__c;
    }


    /**
     * Sets the zqu__PaymentGateway__c value for this Zqu__Quote__c.
     * 
     * @param zqu__PaymentGateway__c
     */
    public void setZqu__PaymentGateway__c(java.lang.String zqu__PaymentGateway__c) {
        this.zqu__PaymentGateway__c = zqu__PaymentGateway__c;
    }


    /**
     * Gets the zqu__PaymentMethod__c value for this Zqu__Quote__c.
     * 
     * @return zqu__PaymentMethod__c
     */
    public java.lang.String getZqu__PaymentMethod__c() {
        return zqu__PaymentMethod__c;
    }


    /**
     * Sets the zqu__PaymentMethod__c value for this Zqu__Quote__c.
     * 
     * @param zqu__PaymentMethod__c
     */
    public void setZqu__PaymentMethod__c(java.lang.String zqu__PaymentMethod__c) {
        this.zqu__PaymentMethod__c = zqu__PaymentMethod__c;
    }


    /**
     * Gets the zqu__PaymentTerm__c value for this Zqu__Quote__c.
     * 
     * @return zqu__PaymentTerm__c
     */
    public java.lang.String getZqu__PaymentTerm__c() {
        return zqu__PaymentTerm__c;
    }


    /**
     * Sets the zqu__PaymentTerm__c value for this Zqu__Quote__c.
     * 
     * @param zqu__PaymentTerm__c
     */
    public void setZqu__PaymentTerm__c(java.lang.String zqu__PaymentTerm__c) {
        this.zqu__PaymentTerm__c = zqu__PaymentTerm__c;
    }


    /**
     * Gets the zqu__Previewed_Delta_MRR__c value for this Zqu__Quote__c.
     * 
     * @return zqu__Previewed_Delta_MRR__c
     */
    public java.lang.Double getZqu__Previewed_Delta_MRR__c() {
        return zqu__Previewed_Delta_MRR__c;
    }


    /**
     * Sets the zqu__Previewed_Delta_MRR__c value for this Zqu__Quote__c.
     * 
     * @param zqu__Previewed_Delta_MRR__c
     */
    public void setZqu__Previewed_Delta_MRR__c(java.lang.Double zqu__Previewed_Delta_MRR__c) {
        this.zqu__Previewed_Delta_MRR__c = zqu__Previewed_Delta_MRR__c;
    }


    /**
     * Gets the zqu__Previewed_Delta_TCV__c value for this Zqu__Quote__c.
     * 
     * @return zqu__Previewed_Delta_TCV__c
     */
    public java.lang.Double getZqu__Previewed_Delta_TCV__c() {
        return zqu__Previewed_Delta_TCV__c;
    }


    /**
     * Sets the zqu__Previewed_Delta_TCV__c value for this Zqu__Quote__c.
     * 
     * @param zqu__Previewed_Delta_TCV__c
     */
    public void setZqu__Previewed_Delta_TCV__c(java.lang.Double zqu__Previewed_Delta_TCV__c) {
        this.zqu__Previewed_Delta_TCV__c = zqu__Previewed_Delta_TCV__c;
    }


    /**
     * Gets the zqu__Previewed_Discount__c value for this Zqu__Quote__c.
     * 
     * @return zqu__Previewed_Discount__c
     */
    public java.lang.Double getZqu__Previewed_Discount__c() {
        return zqu__Previewed_Discount__c;
    }


    /**
     * Sets the zqu__Previewed_Discount__c value for this Zqu__Quote__c.
     * 
     * @param zqu__Previewed_Discount__c
     */
    public void setZqu__Previewed_Discount__c(java.lang.Double zqu__Previewed_Discount__c) {
        this.zqu__Previewed_Discount__c = zqu__Previewed_Discount__c;
    }


    /**
     * Gets the zqu__Previewed_MRR__c value for this Zqu__Quote__c.
     * 
     * @return zqu__Previewed_MRR__c
     */
    public java.lang.Double getZqu__Previewed_MRR__c() {
        return zqu__Previewed_MRR__c;
    }


    /**
     * Sets the zqu__Previewed_MRR__c value for this Zqu__Quote__c.
     * 
     * @param zqu__Previewed_MRR__c
     */
    public void setZqu__Previewed_MRR__c(java.lang.Double zqu__Previewed_MRR__c) {
        this.zqu__Previewed_MRR__c = zqu__Previewed_MRR__c;
    }


    /**
     * Gets the zqu__Previewed_SubTotal__c value for this Zqu__Quote__c.
     * 
     * @return zqu__Previewed_SubTotal__c
     */
    public java.lang.Double getZqu__Previewed_SubTotal__c() {
        return zqu__Previewed_SubTotal__c;
    }


    /**
     * Sets the zqu__Previewed_SubTotal__c value for this Zqu__Quote__c.
     * 
     * @param zqu__Previewed_SubTotal__c
     */
    public void setZqu__Previewed_SubTotal__c(java.lang.Double zqu__Previewed_SubTotal__c) {
        this.zqu__Previewed_SubTotal__c = zqu__Previewed_SubTotal__c;
    }


    /**
     * Gets the zqu__Previewed_TCV__c value for this Zqu__Quote__c.
     * 
     * @return zqu__Previewed_TCV__c
     */
    public java.lang.Double getZqu__Previewed_TCV__c() {
        return zqu__Previewed_TCV__c;
    }


    /**
     * Sets the zqu__Previewed_TCV__c value for this Zqu__Quote__c.
     * 
     * @param zqu__Previewed_TCV__c
     */
    public void setZqu__Previewed_TCV__c(java.lang.Double zqu__Previewed_TCV__c) {
        this.zqu__Previewed_TCV__c = zqu__Previewed_TCV__c;
    }


    /**
     * Gets the zqu__Previewed_Tax__c value for this Zqu__Quote__c.
     * 
     * @return zqu__Previewed_Tax__c
     */
    public java.lang.Double getZqu__Previewed_Tax__c() {
        return zqu__Previewed_Tax__c;
    }


    /**
     * Sets the zqu__Previewed_Tax__c value for this Zqu__Quote__c.
     * 
     * @param zqu__Previewed_Tax__c
     */
    public void setZqu__Previewed_Tax__c(java.lang.Double zqu__Previewed_Tax__c) {
        this.zqu__Previewed_Tax__c = zqu__Previewed_Tax__c;
    }


    /**
     * Gets the zqu__Previewed_Total__c value for this Zqu__Quote__c.
     * 
     * @return zqu__Previewed_Total__c
     */
    public java.lang.Double getZqu__Previewed_Total__c() {
        return zqu__Previewed_Total__c;
    }


    /**
     * Sets the zqu__Previewed_Total__c value for this Zqu__Quote__c.
     * 
     * @param zqu__Previewed_Total__c
     */
    public void setZqu__Previewed_Total__c(java.lang.Double zqu__Previewed_Total__c) {
        this.zqu__Previewed_Total__c = zqu__Previewed_Total__c;
    }


    /**
     * Gets the zqu__ProcessPayment__c value for this Zqu__Quote__c.
     * 
     * @return zqu__ProcessPayment__c
     */
    public java.lang.Boolean getZqu__ProcessPayment__c() {
        return zqu__ProcessPayment__c;
    }


    /**
     * Sets the zqu__ProcessPayment__c value for this Zqu__Quote__c.
     * 
     * @param zqu__ProcessPayment__c
     */
    public void setZqu__ProcessPayment__c(java.lang.Boolean zqu__ProcessPayment__c) {
        this.zqu__ProcessPayment__c = zqu__ProcessPayment__c;
    }


    /**
     * Gets the zqu__ProductSelectorVersion__c value for this Zqu__Quote__c.
     * 
     * @return zqu__ProductSelectorVersion__c
     */
    public java.lang.String getZqu__ProductSelectorVersion__c() {
        return zqu__ProductSelectorVersion__c;
    }


    /**
     * Sets the zqu__ProductSelectorVersion__c value for this Zqu__Quote__c.
     * 
     * @param zqu__ProductSelectorVersion__c
     */
    public void setZqu__ProductSelectorVersion__c(java.lang.String zqu__ProductSelectorVersion__c) {
        this.zqu__ProductSelectorVersion__c = zqu__ProductSelectorVersion__c;
    }


    /**
     * Gets the zqu__QuoteCharge__r value for this Zqu__Quote__c.
     * 
     * @return zqu__QuoteCharge__r
     */
    public com.sforce.soap.enterprise.QueryResult getZqu__QuoteCharge__r() {
        return zqu__QuoteCharge__r;
    }


    /**
     * Sets the zqu__QuoteCharge__r value for this Zqu__Quote__c.
     * 
     * @param zqu__QuoteCharge__r
     */
    public void setZqu__QuoteCharge__r(com.sforce.soap.enterprise.QueryResult zqu__QuoteCharge__r) {
        this.zqu__QuoteCharge__r = zqu__QuoteCharge__r;
    }


    /**
     * Gets the zqu__QuoteTemplate__c value for this Zqu__Quote__c.
     * 
     * @return zqu__QuoteTemplate__c
     */
    public java.lang.String getZqu__QuoteTemplate__c() {
        return zqu__QuoteTemplate__c;
    }


    /**
     * Sets the zqu__QuoteTemplate__c value for this Zqu__Quote__c.
     * 
     * @param zqu__QuoteTemplate__c
     */
    public void setZqu__QuoteTemplate__c(java.lang.String zqu__QuoteTemplate__c) {
        this.zqu__QuoteTemplate__c = zqu__QuoteTemplate__c;
    }


    /**
     * Gets the zqu__QuoteTemplate__r value for this Zqu__Quote__c.
     * 
     * @return zqu__QuoteTemplate__r
     */
    public com.sforce.soap.enterprise.sobject.Zqu__Quote_Template__c getZqu__QuoteTemplate__r() {
        return zqu__QuoteTemplate__r;
    }


    /**
     * Sets the zqu__QuoteTemplate__r value for this Zqu__Quote__c.
     * 
     * @param zqu__QuoteTemplate__r
     */
    public void setZqu__QuoteTemplate__r(com.sforce.soap.enterprise.sobject.Zqu__Quote_Template__c zqu__QuoteTemplate__r) {
        this.zqu__QuoteTemplate__r = zqu__QuoteTemplate__r;
    }


    /**
     * Gets the zqu__Quote_Amendments__r value for this Zqu__Quote__c.
     * 
     * @return zqu__Quote_Amendments__r
     */
    public com.sforce.soap.enterprise.QueryResult getZqu__Quote_Amendments__r() {
        return zqu__Quote_Amendments__r;
    }


    /**
     * Sets the zqu__Quote_Amendments__r value for this Zqu__Quote__c.
     * 
     * @param zqu__Quote_Amendments__r
     */
    public void setZqu__Quote_Amendments__r(com.sforce.soap.enterprise.QueryResult zqu__Quote_Amendments__r) {
        this.zqu__Quote_Amendments__r = zqu__Quote_Amendments__r;
    }


    /**
     * Gets the zqu__Quote_Product_Features__r value for this Zqu__Quote__c.
     * 
     * @return zqu__Quote_Product_Features__r
     */
    public com.sforce.soap.enterprise.QueryResult getZqu__Quote_Product_Features__r() {
        return zqu__Quote_Product_Features__r;
    }


    /**
     * Sets the zqu__Quote_Product_Features__r value for this Zqu__Quote__c.
     * 
     * @param zqu__Quote_Product_Features__r
     */
    public void setZqu__Quote_Product_Features__r(com.sforce.soap.enterprise.QueryResult zqu__Quote_Product_Features__r) {
        this.zqu__Quote_Product_Features__r = zqu__Quote_Product_Features__r;
    }


    /**
     * Gets the zqu__Quote_Rate_Plans__r value for this Zqu__Quote__c.
     * 
     * @return zqu__Quote_Rate_Plans__r
     */
    public com.sforce.soap.enterprise.QueryResult getZqu__Quote_Rate_Plans__r() {
        return zqu__Quote_Rate_Plans__r;
    }


    /**
     * Sets the zqu__Quote_Rate_Plans__r value for this Zqu__Quote__c.
     * 
     * @param zqu__Quote_Rate_Plans__r
     */
    public void setZqu__Quote_Rate_Plans__r(com.sforce.soap.enterprise.QueryResult zqu__Quote_Rate_Plans__r) {
        this.zqu__Quote_Rate_Plans__r = zqu__Quote_Rate_Plans__r;
    }


    /**
     * Gets the zqu__RecordReadOnly__c value for this Zqu__Quote__c.
     * 
     * @return zqu__RecordReadOnly__c
     */
    public java.lang.Boolean getZqu__RecordReadOnly__c() {
        return zqu__RecordReadOnly__c;
    }


    /**
     * Sets the zqu__RecordReadOnly__c value for this Zqu__Quote__c.
     * 
     * @param zqu__RecordReadOnly__c
     */
    public void setZqu__RecordReadOnly__c(java.lang.Boolean zqu__RecordReadOnly__c) {
        this.zqu__RecordReadOnly__c = zqu__RecordReadOnly__c;
    }


    /**
     * Gets the zqu__RenewalSetting__c value for this Zqu__Quote__c.
     * 
     * @return zqu__RenewalSetting__c
     */
    public java.lang.String getZqu__RenewalSetting__c() {
        return zqu__RenewalSetting__c;
    }


    /**
     * Sets the zqu__RenewalSetting__c value for this Zqu__Quote__c.
     * 
     * @param zqu__RenewalSetting__c
     */
    public void setZqu__RenewalSetting__c(java.lang.String zqu__RenewalSetting__c) {
        this.zqu__RenewalSetting__c = zqu__RenewalSetting__c;
    }


    /**
     * Gets the zqu__RenewalTerm__c value for this Zqu__Quote__c.
     * 
     * @return zqu__RenewalTerm__c
     */
    public java.lang.Double getZqu__RenewalTerm__c() {
        return zqu__RenewalTerm__c;
    }


    /**
     * Sets the zqu__RenewalTerm__c value for this Zqu__Quote__c.
     * 
     * @param zqu__RenewalTerm__c
     */
    public void setZqu__RenewalTerm__c(java.lang.Double zqu__RenewalTerm__c) {
        this.zqu__RenewalTerm__c = zqu__RenewalTerm__c;
    }


    /**
     * Gets the zqu__Service_Activation_Date__c value for this Zqu__Quote__c.
     * 
     * @return zqu__Service_Activation_Date__c
     */
    public java.util.Date getZqu__Service_Activation_Date__c() {
        return zqu__Service_Activation_Date__c;
    }


    /**
     * Sets the zqu__Service_Activation_Date__c value for this Zqu__Quote__c.
     * 
     * @param zqu__Service_Activation_Date__c
     */
    public void setZqu__Service_Activation_Date__c(java.util.Date zqu__Service_Activation_Date__c) {
        this.zqu__Service_Activation_Date__c = zqu__Service_Activation_Date__c;
    }


    /**
     * Gets the zqu__SoldToContact__c value for this Zqu__Quote__c.
     * 
     * @return zqu__SoldToContact__c
     */
    public java.lang.String getZqu__SoldToContact__c() {
        return zqu__SoldToContact__c;
    }


    /**
     * Sets the zqu__SoldToContact__c value for this Zqu__Quote__c.
     * 
     * @param zqu__SoldToContact__c
     */
    public void setZqu__SoldToContact__c(java.lang.String zqu__SoldToContact__c) {
        this.zqu__SoldToContact__c = zqu__SoldToContact__c;
    }


    /**
     * Gets the zqu__SoldToContact__r value for this Zqu__Quote__c.
     * 
     * @return zqu__SoldToContact__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getZqu__SoldToContact__r() {
        return zqu__SoldToContact__r;
    }


    /**
     * Sets the zqu__SoldToContact__r value for this Zqu__Quote__c.
     * 
     * @param zqu__SoldToContact__r
     */
    public void setZqu__SoldToContact__r(com.sforce.soap.enterprise.sobject.Contact zqu__SoldToContact__r) {
        this.zqu__SoldToContact__r = zqu__SoldToContact__r;
    }


    /**
     * Gets the zqu__StartDate__c value for this Zqu__Quote__c.
     * 
     * @return zqu__StartDate__c
     */
    public java.util.Date getZqu__StartDate__c() {
        return zqu__StartDate__c;
    }


    /**
     * Sets the zqu__StartDate__c value for this Zqu__Quote__c.
     * 
     * @param zqu__StartDate__c
     */
    public void setZqu__StartDate__c(java.util.Date zqu__StartDate__c) {
        this.zqu__StartDate__c = zqu__StartDate__c;
    }


    /**
     * Gets the zqu__Status__c value for this Zqu__Quote__c.
     * 
     * @return zqu__Status__c
     */
    public java.lang.String getZqu__Status__c() {
        return zqu__Status__c;
    }


    /**
     * Sets the zqu__Status__c value for this Zqu__Quote__c.
     * 
     * @param zqu__Status__c
     */
    public void setZqu__Status__c(java.lang.String zqu__Status__c) {
        this.zqu__Status__c = zqu__Status__c;
    }


    /**
     * Gets the zqu__SubQuotes__r value for this Zqu__Quote__c.
     * 
     * @return zqu__SubQuotes__r
     */
    public com.sforce.soap.enterprise.QueryResult getZqu__SubQuotes__r() {
        return zqu__SubQuotes__r;
    }


    /**
     * Sets the zqu__SubQuotes__r value for this Zqu__Quote__c.
     * 
     * @param zqu__SubQuotes__r
     */
    public void setZqu__SubQuotes__r(com.sforce.soap.enterprise.QueryResult zqu__SubQuotes__r) {
        this.zqu__SubQuotes__r = zqu__SubQuotes__r;
    }


    /**
     * Gets the zqu__SubscriptionName__c value for this Zqu__Quote__c.
     * 
     * @return zqu__SubscriptionName__c
     */
    public java.lang.String getZqu__SubscriptionName__c() {
        return zqu__SubscriptionName__c;
    }


    /**
     * Sets the zqu__SubscriptionName__c value for this Zqu__Quote__c.
     * 
     * @param zqu__SubscriptionName__c
     */
    public void setZqu__SubscriptionName__c(java.lang.String zqu__SubscriptionName__c) {
        this.zqu__SubscriptionName__c = zqu__SubscriptionName__c;
    }


    /**
     * Gets the zqu__SubscriptionTermEndDate__c value for this Zqu__Quote__c.
     * 
     * @return zqu__SubscriptionTermEndDate__c
     */
    public java.util.Date getZqu__SubscriptionTermEndDate__c() {
        return zqu__SubscriptionTermEndDate__c;
    }


    /**
     * Sets the zqu__SubscriptionTermEndDate__c value for this Zqu__Quote__c.
     * 
     * @param zqu__SubscriptionTermEndDate__c
     */
    public void setZqu__SubscriptionTermEndDate__c(java.util.Date zqu__SubscriptionTermEndDate__c) {
        this.zqu__SubscriptionTermEndDate__c = zqu__SubscriptionTermEndDate__c;
    }


    /**
     * Gets the zqu__SubscriptionTermStartDate__c value for this Zqu__Quote__c.
     * 
     * @return zqu__SubscriptionTermStartDate__c
     */
    public java.util.Date getZqu__SubscriptionTermStartDate__c() {
        return zqu__SubscriptionTermStartDate__c;
    }


    /**
     * Sets the zqu__SubscriptionTermStartDate__c value for this Zqu__Quote__c.
     * 
     * @param zqu__SubscriptionTermStartDate__c
     */
    public void setZqu__SubscriptionTermStartDate__c(java.util.Date zqu__SubscriptionTermStartDate__c) {
        this.zqu__SubscriptionTermStartDate__c = zqu__SubscriptionTermStartDate__c;
    }


    /**
     * Gets the zqu__SubscriptionType__c value for this Zqu__Quote__c.
     * 
     * @return zqu__SubscriptionType__c
     */
    public java.lang.String getZqu__SubscriptionType__c() {
        return zqu__SubscriptionType__c;
    }


    /**
     * Sets the zqu__SubscriptionType__c value for this Zqu__Quote__c.
     * 
     * @param zqu__SubscriptionType__c
     */
    public void setZqu__SubscriptionType__c(java.lang.String zqu__SubscriptionType__c) {
        this.zqu__SubscriptionType__c = zqu__SubscriptionType__c;
    }


    /**
     * Gets the zqu__SubscriptionVersion__c value for this Zqu__Quote__c.
     * 
     * @return zqu__SubscriptionVersion__c
     */
    public java.lang.Double getZqu__SubscriptionVersion__c() {
        return zqu__SubscriptionVersion__c;
    }


    /**
     * Sets the zqu__SubscriptionVersion__c value for this Zqu__Quote__c.
     * 
     * @param zqu__SubscriptionVersion__c
     */
    public void setZqu__SubscriptionVersion__c(java.lang.Double zqu__SubscriptionVersion__c) {
        this.zqu__SubscriptionVersion__c = zqu__SubscriptionVersion__c;
    }


    /**
     * Gets the zqu__Subscription_Name__c value for this Zqu__Quote__c.
     * 
     * @return zqu__Subscription_Name__c
     */
    public java.lang.String getZqu__Subscription_Name__c() {
        return zqu__Subscription_Name__c;
    }


    /**
     * Sets the zqu__Subscription_Name__c value for this Zqu__Quote__c.
     * 
     * @param zqu__Subscription_Name__c
     */
    public void setZqu__Subscription_Name__c(java.lang.String zqu__Subscription_Name__c) {
        this.zqu__Subscription_Name__c = zqu__Subscription_Name__c;
    }


    /**
     * Gets the zqu__Subscription_Term_Type__c value for this Zqu__Quote__c.
     * 
     * @return zqu__Subscription_Term_Type__c
     */
    public java.lang.String getZqu__Subscription_Term_Type__c() {
        return zqu__Subscription_Term_Type__c;
    }


    /**
     * Sets the zqu__Subscription_Term_Type__c value for this Zqu__Quote__c.
     * 
     * @param zqu__Subscription_Term_Type__c
     */
    public void setZqu__Subscription_Term_Type__c(java.lang.String zqu__Subscription_Term_Type__c) {
        this.zqu__Subscription_Term_Type__c = zqu__Subscription_Term_Type__c;
    }


    /**
     * Gets the zqu__TCV__c value for this Zqu__Quote__c.
     * 
     * @return zqu__TCV__c
     */
    public java.lang.Double getZqu__TCV__c() {
        return zqu__TCV__c;
    }


    /**
     * Sets the zqu__TCV__c value for this Zqu__Quote__c.
     * 
     * @param zqu__TCV__c
     */
    public void setZqu__TCV__c(java.lang.Double zqu__TCV__c) {
        this.zqu__TCV__c = zqu__TCV__c;
    }


    /**
     * Gets the zqu__Tax__c value for this Zqu__Quote__c.
     * 
     * @return zqu__Tax__c
     */
    public java.lang.Double getZqu__Tax__c() {
        return zqu__Tax__c;
    }


    /**
     * Sets the zqu__Tax__c value for this Zqu__Quote__c.
     * 
     * @param zqu__Tax__c
     */
    public void setZqu__Tax__c(java.lang.Double zqu__Tax__c) {
        this.zqu__Tax__c = zqu__Tax__c;
    }


    /**
     * Gets the zqu__TermStartDate__c value for this Zqu__Quote__c.
     * 
     * @return zqu__TermStartDate__c
     */
    public java.util.Date getZqu__TermStartDate__c() {
        return zqu__TermStartDate__c;
    }


    /**
     * Sets the zqu__TermStartDate__c value for this Zqu__Quote__c.
     * 
     * @param zqu__TermStartDate__c
     */
    public void setZqu__TermStartDate__c(java.util.Date zqu__TermStartDate__c) {
        this.zqu__TermStartDate__c = zqu__TermStartDate__c;
    }


    /**
     * Gets the zqu__Terms__c value for this Zqu__Quote__c.
     * 
     * @return zqu__Terms__c
     */
    public java.lang.String getZqu__Terms__c() {
        return zqu__Terms__c;
    }


    /**
     * Sets the zqu__Terms__c value for this Zqu__Quote__c.
     * 
     * @param zqu__Terms__c
     */
    public void setZqu__Terms__c(java.lang.String zqu__Terms__c) {
        this.zqu__Terms__c = zqu__Terms__c;
    }


    /**
     * Gets the zqu__Total__c value for this Zqu__Quote__c.
     * 
     * @return zqu__Total__c
     */
    public java.lang.Double getZqu__Total__c() {
        return zqu__Total__c;
    }


    /**
     * Sets the zqu__Total__c value for this Zqu__Quote__c.
     * 
     * @param zqu__Total__c
     */
    public void setZqu__Total__c(java.lang.Double zqu__Total__c) {
        this.zqu__Total__c = zqu__Total__c;
    }


    /**
     * Gets the zqu__ValidUntil__c value for this Zqu__Quote__c.
     * 
     * @return zqu__ValidUntil__c
     */
    public java.util.Date getZqu__ValidUntil__c() {
        return zqu__ValidUntil__c;
    }


    /**
     * Sets the zqu__ValidUntil__c value for this Zqu__Quote__c.
     * 
     * @param zqu__ValidUntil__c
     */
    public void setZqu__ValidUntil__c(java.util.Date zqu__ValidUntil__c) {
        this.zqu__ValidUntil__c = zqu__ValidUntil__c;
    }


    /**
     * Gets the zqu__ZuoraAccountID__c value for this Zqu__Quote__c.
     * 
     * @return zqu__ZuoraAccountID__c
     */
    public java.lang.String getZqu__ZuoraAccountID__c() {
        return zqu__ZuoraAccountID__c;
    }


    /**
     * Sets the zqu__ZuoraAccountID__c value for this Zqu__Quote__c.
     * 
     * @param zqu__ZuoraAccountID__c
     */
    public void setZqu__ZuoraAccountID__c(java.lang.String zqu__ZuoraAccountID__c) {
        this.zqu__ZuoraAccountID__c = zqu__ZuoraAccountID__c;
    }


    /**
     * Gets the zqu__ZuoraConfig__c value for this Zqu__Quote__c.
     * 
     * @return zqu__ZuoraConfig__c
     */
    public java.lang.String getZqu__ZuoraConfig__c() {
        return zqu__ZuoraConfig__c;
    }


    /**
     * Sets the zqu__ZuoraConfig__c value for this Zqu__Quote__c.
     * 
     * @param zqu__ZuoraConfig__c
     */
    public void setZqu__ZuoraConfig__c(java.lang.String zqu__ZuoraConfig__c) {
        this.zqu__ZuoraConfig__c = zqu__ZuoraConfig__c;
    }


    /**
     * Gets the zqu__ZuoraConfig__r value for this Zqu__Quote__c.
     * 
     * @return zqu__ZuoraConfig__r
     */
    public com.sforce.soap.enterprise.sobject.Zqu__ZuoraConfig__c getZqu__ZuoraConfig__r() {
        return zqu__ZuoraConfig__r;
    }


    /**
     * Sets the zqu__ZuoraConfig__r value for this Zqu__Quote__c.
     * 
     * @param zqu__ZuoraConfig__r
     */
    public void setZqu__ZuoraConfig__r(com.sforce.soap.enterprise.sobject.Zqu__ZuoraConfig__c zqu__ZuoraConfig__r) {
        this.zqu__ZuoraConfig__r = zqu__ZuoraConfig__r;
    }


    /**
     * Gets the zqu__ZuoraParentBillingAccountId__c value for this Zqu__Quote__c.
     * 
     * @return zqu__ZuoraParentBillingAccountId__c
     */
    public java.lang.String getZqu__ZuoraParentBillingAccountId__c() {
        return zqu__ZuoraParentBillingAccountId__c;
    }


    /**
     * Sets the zqu__ZuoraParentBillingAccountId__c value for this Zqu__Quote__c.
     * 
     * @param zqu__ZuoraParentBillingAccountId__c
     */
    public void setZqu__ZuoraParentBillingAccountId__c(java.lang.String zqu__ZuoraParentBillingAccountId__c) {
        this.zqu__ZuoraParentBillingAccountId__c = zqu__ZuoraParentBillingAccountId__c;
    }


    /**
     * Gets the zqu__ZuoraParentBillingAccountName__c value for this Zqu__Quote__c.
     * 
     * @return zqu__ZuoraParentBillingAccountName__c
     */
    public java.lang.String getZqu__ZuoraParentBillingAccountName__c() {
        return zqu__ZuoraParentBillingAccountName__c;
    }


    /**
     * Sets the zqu__ZuoraParentBillingAccountName__c value for this Zqu__Quote__c.
     * 
     * @param zqu__ZuoraParentBillingAccountName__c
     */
    public void setZqu__ZuoraParentBillingAccountName__c(java.lang.String zqu__ZuoraParentBillingAccountName__c) {
        this.zqu__ZuoraParentBillingAccountName__c = zqu__ZuoraParentBillingAccountName__c;
    }


    /**
     * Gets the zqu__ZuoraPaymentID__c value for this Zqu__Quote__c.
     * 
     * @return zqu__ZuoraPaymentID__c
     */
    public java.lang.String getZqu__ZuoraPaymentID__c() {
        return zqu__ZuoraPaymentID__c;
    }


    /**
     * Sets the zqu__ZuoraPaymentID__c value for this Zqu__Quote__c.
     * 
     * @param zqu__ZuoraPaymentID__c
     */
    public void setZqu__ZuoraPaymentID__c(java.lang.String zqu__ZuoraPaymentID__c) {
        this.zqu__ZuoraPaymentID__c = zqu__ZuoraPaymentID__c;
    }


    /**
     * Gets the zqu__ZuoraSubscriptionID__c value for this Zqu__Quote__c.
     * 
     * @return zqu__ZuoraSubscriptionID__c
     */
    public java.lang.String getZqu__ZuoraSubscriptionID__c() {
        return zqu__ZuoraSubscriptionID__c;
    }


    /**
     * Sets the zqu__ZuoraSubscriptionID__c value for this Zqu__Quote__c.
     * 
     * @param zqu__ZuoraSubscriptionID__c
     */
    public void setZqu__ZuoraSubscriptionID__c(java.lang.String zqu__ZuoraSubscriptionID__c) {
        this.zqu__ZuoraSubscriptionID__c = zqu__ZuoraSubscriptionID__c;
    }


    /**
     * Gets the zqu__Zuora_Account_Number__c value for this Zqu__Quote__c.
     * 
     * @return zqu__Zuora_Account_Number__c
     */
    public java.lang.String getZqu__Zuora_Account_Number__c() {
        return zqu__Zuora_Account_Number__c;
    }


    /**
     * Sets the zqu__Zuora_Account_Number__c value for this Zqu__Quote__c.
     * 
     * @param zqu__Zuora_Account_Number__c
     */
    public void setZqu__Zuora_Account_Number__c(java.lang.String zqu__Zuora_Account_Number__c) {
        this.zqu__Zuora_Account_Number__c = zqu__Zuora_Account_Number__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Zqu__Quote__c)) return false;
        Zqu__Quote__c other = (Zqu__Quote__c) obj;
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
            ((this.credit_Card_Capture_Link__c==null && other.getCredit_Card_Capture_Link__c()==null) || 
             (this.credit_Card_Capture_Link__c!=null &&
              this.credit_Card_Capture_Link__c.equals(other.getCredit_Card_Capture_Link__c()))) &&
            ((this.customField10__c==null && other.getCustomField10__c()==null) || 
             (this.customField10__c!=null &&
              this.customField10__c.equals(other.getCustomField10__c()))) &&
            ((this.duplicateRecordItems==null && other.getDuplicateRecordItems()==null) || 
             (this.duplicateRecordItems!=null &&
              this.duplicateRecordItems.equals(other.getDuplicateRecordItems()))) &&
            ((this.email_Sent_To_Customer__c==null && other.getEmail_Sent_To_Customer__c()==null) || 
             (this.email_Sent_To_Customer__c!=null &&
              this.email_Sent_To_Customer__c.equals(other.getEmail_Sent_To_Customer__c()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.in_Line_Discount__c==null && other.getIn_Line_Discount__c()==null) || 
             (this.in_Line_Discount__c!=null &&
              this.in_Line_Discount__c.equals(other.getIn_Line_Discount__c()))) &&
            ((this.intacctCustomerID__c==null && other.getIntacctCustomerID__c()==null) || 
             (this.intacctCustomerID__c!=null &&
              this.intacctCustomerID__c.equals(other.getIntacctCustomerID__c()))) &&
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
            ((this.last_Email_Sent__c==null && other.getLast_Email_Sent__c()==null) || 
             (this.last_Email_Sent__c!=null &&
              this.last_Email_Sent__c.equals(other.getLast_Email_Sent__c()))) &&
            ((this.lookedUpFromActivities==null && other.getLookedUpFromActivities()==null) || 
             (this.lookedUpFromActivities!=null &&
              this.lookedUpFromActivities.equals(other.getLookedUpFromActivities()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.new_Cust_Obj2__c==null && other.getNew_Cust_Obj2__c()==null) || 
             (this.new_Cust_Obj2__c!=null &&
              this.new_Cust_Obj2__c.equals(other.getNew_Cust_Obj2__c()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.notesAndAttachments==null && other.getNotesAndAttachments()==null) || 
             (this.notesAndAttachments!=null &&
              this.notesAndAttachments.equals(other.getNotesAndAttachments()))) &&
            ((this.opportunities__r==null && other.getOpportunities__r()==null) || 
             (this.opportunities__r!=null &&
              this.opportunities__r.equals(other.getOpportunities__r()))) &&
            ((this.opportunityType__c==null && other.getOpportunityType__c()==null) || 
             (this.opportunityType__c!=null &&
              this.opportunityType__c.equals(other.getOpportunityType__c()))) &&
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
            ((this.project_ID__c==null && other.getProject_ID__c()==null) || 
             (this.project_ID__c!=null &&
              this.project_ID__c.equals(other.getProject_ID__c()))) &&
            ((this.recordAssociatedGroups==null && other.getRecordAssociatedGroups()==null) || 
             (this.recordAssociatedGroups!=null &&
              this.recordAssociatedGroups.equals(other.getRecordAssociatedGroups()))) &&
            ((this.recordType==null && other.getRecordType()==null) || 
             (this.recordType!=null &&
              this.recordType.equals(other.getRecordType()))) &&
            ((this.recordTypeId==null && other.getRecordTypeId()==null) || 
             (this.recordTypeId!=null &&
              this.recordTypeId.equals(other.getRecordTypeId()))) &&
            ((this.roll_up_Effective_Price__c==null && other.getRoll_up_Effective_Price__c()==null) || 
             (this.roll_up_Effective_Price__c!=null &&
              this.roll_up_Effective_Price__c.equals(other.getRoll_up_Effective_Price__c()))) &&
            ((this.roll_up_List_Price__c==null && other.getRoll_up_List_Price__c()==null) || 
             (this.roll_up_List_Price__c!=null &&
              this.roll_up_List_Price__c.equals(other.getRoll_up_List_Price__c()))) &&
            ((this.send_Email__c==null && other.getSend_Email__c()==null) || 
             (this.send_Email__c!=null &&
              this.send_Email__c.equals(other.getSend_Email__c()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.text_Testing__c==null && other.getText_Testing__c()==null) || 
             (this.text_Testing__c!=null &&
              this.text_Testing__c.equals(other.getText_Testing__c()))) &&
            ((this.topicAssignments==null && other.getTopicAssignments()==null) || 
             (this.topicAssignments!=null &&
              this.topicAssignments.equals(other.getTopicAssignments()))) &&
            ((this.userRecordAccess==null && other.getUserRecordAccess()==null) || 
             (this.userRecordAccess!=null &&
              this.userRecordAccess.equals(other.getUserRecordAccess()))) &&
            ((this.formula_query_123__c==null && other.getFormula_query_123__c()==null) || 
             (this.formula_query_123__c!=null &&
              this.formula_query_123__c.equals(other.getFormula_query_123__c()))) &&
            ((this.query_123__c==null && other.getQuery_123__c()==null) || 
             (this.query_123__c!=null &&
              this.query_123__c.equals(other.getQuery_123__c()))) &&
            ((this.zqu__Account__c==null && other.getZqu__Account__c()==null) || 
             (this.zqu__Account__c!=null &&
              this.zqu__Account__c.equals(other.getZqu__Account__c()))) &&
            ((this.zqu__Account__r==null && other.getZqu__Account__r()==null) || 
             (this.zqu__Account__r!=null &&
              this.zqu__Account__r.equals(other.getZqu__Account__r()))) &&
            ((this.zqu__AmendmentName__c==null && other.getZqu__AmendmentName__c()==null) || 
             (this.zqu__AmendmentName__c!=null &&
              this.zqu__AmendmentName__c.equals(other.getZqu__AmendmentName__c()))) &&
            ((this.zqu__Amendment_Name__c==null && other.getZqu__Amendment_Name__c()==null) || 
             (this.zqu__Amendment_Name__c!=null &&
              this.zqu__Amendment_Name__c.equals(other.getZqu__Amendment_Name__c()))) &&
            ((this.zqu__AutoRenew__c==null && other.getZqu__AutoRenew__c()==null) || 
             (this.zqu__AutoRenew__c!=null &&
              this.zqu__AutoRenew__c.equals(other.getZqu__AutoRenew__c()))) &&
            ((this.zqu__BillCycleDay__c==null && other.getZqu__BillCycleDay__c()==null) || 
             (this.zqu__BillCycleDay__c!=null &&
              this.zqu__BillCycleDay__c.equals(other.getZqu__BillCycleDay__c()))) &&
            ((this.zqu__BillToContact__c==null && other.getZqu__BillToContact__c()==null) || 
             (this.zqu__BillToContact__c!=null &&
              this.zqu__BillToContact__c.equals(other.getZqu__BillToContact__c()))) &&
            ((this.zqu__BillToContact__r==null && other.getZqu__BillToContact__r()==null) || 
             (this.zqu__BillToContact__r!=null &&
              this.zqu__BillToContact__r.equals(other.getZqu__BillToContact__r()))) &&
            ((this.zqu__BillingBatch__c==null && other.getZqu__BillingBatch__c()==null) || 
             (this.zqu__BillingBatch__c!=null &&
              this.zqu__BillingBatch__c.equals(other.getZqu__BillingBatch__c()))) &&
            ((this.zqu__BillingCycleDay__c==null && other.getZqu__BillingCycleDay__c()==null) || 
             (this.zqu__BillingCycleDay__c!=null &&
              this.zqu__BillingCycleDay__c.equals(other.getZqu__BillingCycleDay__c()))) &&
            ((this.zqu__BillingMethod__c==null && other.getZqu__BillingMethod__c()==null) || 
             (this.zqu__BillingMethod__c!=null &&
              this.zqu__BillingMethod__c.equals(other.getZqu__BillingMethod__c()))) &&
            ((this.zqu__Calculate_Quote_Metrics_Through__c==null && other.getZqu__Calculate_Quote_Metrics_Through__c()==null) || 
             (this.zqu__Calculate_Quote_Metrics_Through__c!=null &&
              this.zqu__Calculate_Quote_Metrics_Through__c.equals(other.getZqu__Calculate_Quote_Metrics_Through__c()))) &&
            ((this.zqu__CancellationDate__c==null && other.getZqu__CancellationDate__c()==null) || 
             (this.zqu__CancellationDate__c!=null &&
              this.zqu__CancellationDate__c.equals(other.getZqu__CancellationDate__c()))) &&
            ((this.zqu__CancellationEffectiveDate__c==null && other.getZqu__CancellationEffectiveDate__c()==null) || 
             (this.zqu__CancellationEffectiveDate__c!=null &&
              this.zqu__CancellationEffectiveDate__c.equals(other.getZqu__CancellationEffectiveDate__c()))) &&
            ((this.zqu__CommunicationProfile__c==null && other.getZqu__CommunicationProfile__c()==null) || 
             (this.zqu__CommunicationProfile__c!=null &&
              this.zqu__CommunicationProfile__c.equals(other.getZqu__CommunicationProfile__c()))) &&
            ((this.zqu__CommunicationProfile__r==null && other.getZqu__CommunicationProfile__r()==null) || 
             (this.zqu__CommunicationProfile__r!=null &&
              this.zqu__CommunicationProfile__r.equals(other.getZqu__CommunicationProfile__r()))) &&
            ((this.zqu__Currency__c==null && other.getZqu__Currency__c()==null) || 
             (this.zqu__Currency__c!=null &&
              this.zqu__Currency__c.equals(other.getZqu__Currency__c()))) &&
            ((this.zqu__Customer_Acceptance_Date__c==null && other.getZqu__Customer_Acceptance_Date__c()==null) || 
             (this.zqu__Customer_Acceptance_Date__c!=null &&
              this.zqu__Customer_Acceptance_Date__c.equals(other.getZqu__Customer_Acceptance_Date__c()))) &&
            ((this.zqu__DeltaMRR__c==null && other.getZqu__DeltaMRR__c()==null) || 
             (this.zqu__DeltaMRR__c!=null &&
              this.zqu__DeltaMRR__c.equals(other.getZqu__DeltaMRR__c()))) &&
            ((this.zqu__DeltaTCV__c==null && other.getZqu__DeltaTCV__c()==null) || 
             (this.zqu__DeltaTCV__c!=null &&
              this.zqu__DeltaTCV__c.equals(other.getZqu__DeltaTCV__c()))) &&
            ((this.zqu__Description__c==null && other.getZqu__Description__c()==null) || 
             (this.zqu__Description__c!=null &&
              this.zqu__Description__c.equals(other.getZqu__Description__c()))) &&
            ((this.zqu__ElectronicPaymentMethodId__c==null && other.getZqu__ElectronicPaymentMethodId__c()==null) || 
             (this.zqu__ElectronicPaymentMethodId__c!=null &&
              this.zqu__ElectronicPaymentMethodId__c.equals(other.getZqu__ElectronicPaymentMethodId__c()))) &&
            ((this.zqu__ExistSubscriptionID__c==null && other.getZqu__ExistSubscriptionID__c()==null) || 
             (this.zqu__ExistSubscriptionID__c!=null &&
              this.zqu__ExistSubscriptionID__c.equals(other.getZqu__ExistSubscriptionID__c()))) &&
            ((this.zqu__GenerateInvoice__c==null && other.getZqu__GenerateInvoice__c()==null) || 
             (this.zqu__GenerateInvoice__c!=null &&
              this.zqu__GenerateInvoice__c.equals(other.getZqu__GenerateInvoice__c()))) &&
            ((this.zqu__Hidden_Subscription_Name__c==null && other.getZqu__Hidden_Subscription_Name__c()==null) || 
             (this.zqu__Hidden_Subscription_Name__c!=null &&
              this.zqu__Hidden_Subscription_Name__c.equals(other.getZqu__Hidden_Subscription_Name__c()))) &&
            ((this.zqu__InitialTerm__c==null && other.getZqu__InitialTerm__c()==null) || 
             (this.zqu__InitialTerm__c!=null &&
              this.zqu__InitialTerm__c.equals(other.getZqu__InitialTerm__c()))) &&
            ((this.zqu__InvoiceDate__c==null && other.getZqu__InvoiceDate__c()==null) || 
             (this.zqu__InvoiceDate__c!=null &&
              this.zqu__InvoiceDate__c.equals(other.getZqu__InvoiceDate__c()))) &&
            ((this.zqu__InvoiceID__c==null && other.getZqu__InvoiceID__c()==null) || 
             (this.zqu__InvoiceID__c!=null &&
              this.zqu__InvoiceID__c.equals(other.getZqu__InvoiceID__c()))) &&
            ((this.zqu__InvoiceOwnerId__c==null && other.getZqu__InvoiceOwnerId__c()==null) || 
             (this.zqu__InvoiceOwnerId__c!=null &&
              this.zqu__InvoiceOwnerId__c.equals(other.getZqu__InvoiceOwnerId__c()))) &&
            ((this.zqu__InvoiceOwnerName__c==null && other.getZqu__InvoiceOwnerName__c()==null) || 
             (this.zqu__InvoiceOwnerName__c!=null &&
              this.zqu__InvoiceOwnerName__c.equals(other.getZqu__InvoiceOwnerName__c()))) &&
            ((this.zqu__InvoiceProcessingOption__c==null && other.getZqu__InvoiceProcessingOption__c()==null) || 
             (this.zqu__InvoiceProcessingOption__c!=null &&
              this.zqu__InvoiceProcessingOption__c.equals(other.getZqu__InvoiceProcessingOption__c()))) &&
            ((this.zqu__InvoiceSeparately__c==null && other.getZqu__InvoiceSeparately__c()==null) || 
             (this.zqu__InvoiceSeparately__c!=null &&
              this.zqu__InvoiceSeparately__c.equals(other.getZqu__InvoiceSeparately__c()))) &&
            ((this.zqu__InvoiceTargetDate__c==null && other.getZqu__InvoiceTargetDate__c()==null) || 
             (this.zqu__InvoiceTargetDate__c!=null &&
              this.zqu__InvoiceTargetDate__c.equals(other.getZqu__InvoiceTargetDate__c()))) &&
            ((this.zqu__InvoiceTemplate__c==null && other.getZqu__InvoiceTemplate__c()==null) || 
             (this.zqu__InvoiceTemplate__c!=null &&
              this.zqu__InvoiceTemplate__c.equals(other.getZqu__InvoiceTemplate__c()))) &&
            ((this.zqu__InvoiceTemplate__r==null && other.getZqu__InvoiceTemplate__r()==null) || 
             (this.zqu__InvoiceTemplate__r!=null &&
              this.zqu__InvoiceTemplate__r.equals(other.getZqu__InvoiceTemplate__r()))) &&
            ((this.zqu__Is_Charge_Expired__c==null && other.getZqu__Is_Charge_Expired__c()==null) || 
             (this.zqu__Is_Charge_Expired__c!=null &&
              this.zqu__Is_Charge_Expired__c.equals(other.getZqu__Is_Charge_Expired__c()))) &&
            ((this.zqu__Is_Parent_Quote__c==null && other.getZqu__Is_Parent_Quote__c()==null) || 
             (this.zqu__Is_Parent_Quote__c!=null &&
              this.zqu__Is_Parent_Quote__c.equals(other.getZqu__Is_Parent_Quote__c()))) &&
            ((this.zqu__MRR__c==null && other.getZqu__MRR__c()==null) || 
             (this.zqu__MRR__c!=null &&
              this.zqu__MRR__c.equals(other.getZqu__MRR__c()))) &&
            ((this.zqu__Number__c==null && other.getZqu__Number__c()==null) || 
             (this.zqu__Number__c!=null &&
              this.zqu__Number__c.equals(other.getZqu__Number__c()))) &&
            ((this.zqu__Opportunity__c==null && other.getZqu__Opportunity__c()==null) || 
             (this.zqu__Opportunity__c!=null &&
              this.zqu__Opportunity__c.equals(other.getZqu__Opportunity__c()))) &&
            ((this.zqu__Opportunity__r==null && other.getZqu__Opportunity__r()==null) || 
             (this.zqu__Opportunity__r!=null &&
              this.zqu__Opportunity__r.equals(other.getZqu__Opportunity__r()))) &&
            ((this.zqu__ParentQuote__c==null && other.getZqu__ParentQuote__c()==null) || 
             (this.zqu__ParentQuote__c!=null &&
              this.zqu__ParentQuote__c.equals(other.getZqu__ParentQuote__c()))) &&
            ((this.zqu__ParentQuote__r==null && other.getZqu__ParentQuote__r()==null) || 
             (this.zqu__ParentQuote__r!=null &&
              this.zqu__ParentQuote__r.equals(other.getZqu__ParentQuote__r()))) &&
            ((this.zqu__PaymentGateway__c==null && other.getZqu__PaymentGateway__c()==null) || 
             (this.zqu__PaymentGateway__c!=null &&
              this.zqu__PaymentGateway__c.equals(other.getZqu__PaymentGateway__c()))) &&
            ((this.zqu__PaymentMethod__c==null && other.getZqu__PaymentMethod__c()==null) || 
             (this.zqu__PaymentMethod__c!=null &&
              this.zqu__PaymentMethod__c.equals(other.getZqu__PaymentMethod__c()))) &&
            ((this.zqu__PaymentTerm__c==null && other.getZqu__PaymentTerm__c()==null) || 
             (this.zqu__PaymentTerm__c!=null &&
              this.zqu__PaymentTerm__c.equals(other.getZqu__PaymentTerm__c()))) &&
            ((this.zqu__Previewed_Delta_MRR__c==null && other.getZqu__Previewed_Delta_MRR__c()==null) || 
             (this.zqu__Previewed_Delta_MRR__c!=null &&
              this.zqu__Previewed_Delta_MRR__c.equals(other.getZqu__Previewed_Delta_MRR__c()))) &&
            ((this.zqu__Previewed_Delta_TCV__c==null && other.getZqu__Previewed_Delta_TCV__c()==null) || 
             (this.zqu__Previewed_Delta_TCV__c!=null &&
              this.zqu__Previewed_Delta_TCV__c.equals(other.getZqu__Previewed_Delta_TCV__c()))) &&
            ((this.zqu__Previewed_Discount__c==null && other.getZqu__Previewed_Discount__c()==null) || 
             (this.zqu__Previewed_Discount__c!=null &&
              this.zqu__Previewed_Discount__c.equals(other.getZqu__Previewed_Discount__c()))) &&
            ((this.zqu__Previewed_MRR__c==null && other.getZqu__Previewed_MRR__c()==null) || 
             (this.zqu__Previewed_MRR__c!=null &&
              this.zqu__Previewed_MRR__c.equals(other.getZqu__Previewed_MRR__c()))) &&
            ((this.zqu__Previewed_SubTotal__c==null && other.getZqu__Previewed_SubTotal__c()==null) || 
             (this.zqu__Previewed_SubTotal__c!=null &&
              this.zqu__Previewed_SubTotal__c.equals(other.getZqu__Previewed_SubTotal__c()))) &&
            ((this.zqu__Previewed_TCV__c==null && other.getZqu__Previewed_TCV__c()==null) || 
             (this.zqu__Previewed_TCV__c!=null &&
              this.zqu__Previewed_TCV__c.equals(other.getZqu__Previewed_TCV__c()))) &&
            ((this.zqu__Previewed_Tax__c==null && other.getZqu__Previewed_Tax__c()==null) || 
             (this.zqu__Previewed_Tax__c!=null &&
              this.zqu__Previewed_Tax__c.equals(other.getZqu__Previewed_Tax__c()))) &&
            ((this.zqu__Previewed_Total__c==null && other.getZqu__Previewed_Total__c()==null) || 
             (this.zqu__Previewed_Total__c!=null &&
              this.zqu__Previewed_Total__c.equals(other.getZqu__Previewed_Total__c()))) &&
            ((this.zqu__ProcessPayment__c==null && other.getZqu__ProcessPayment__c()==null) || 
             (this.zqu__ProcessPayment__c!=null &&
              this.zqu__ProcessPayment__c.equals(other.getZqu__ProcessPayment__c()))) &&
            ((this.zqu__ProductSelectorVersion__c==null && other.getZqu__ProductSelectorVersion__c()==null) || 
             (this.zqu__ProductSelectorVersion__c!=null &&
              this.zqu__ProductSelectorVersion__c.equals(other.getZqu__ProductSelectorVersion__c()))) &&
            ((this.zqu__QuoteCharge__r==null && other.getZqu__QuoteCharge__r()==null) || 
             (this.zqu__QuoteCharge__r!=null &&
              this.zqu__QuoteCharge__r.equals(other.getZqu__QuoteCharge__r()))) &&
            ((this.zqu__QuoteTemplate__c==null && other.getZqu__QuoteTemplate__c()==null) || 
             (this.zqu__QuoteTemplate__c!=null &&
              this.zqu__QuoteTemplate__c.equals(other.getZqu__QuoteTemplate__c()))) &&
            ((this.zqu__QuoteTemplate__r==null && other.getZqu__QuoteTemplate__r()==null) || 
             (this.zqu__QuoteTemplate__r!=null &&
              this.zqu__QuoteTemplate__r.equals(other.getZqu__QuoteTemplate__r()))) &&
            ((this.zqu__Quote_Amendments__r==null && other.getZqu__Quote_Amendments__r()==null) || 
             (this.zqu__Quote_Amendments__r!=null &&
              this.zqu__Quote_Amendments__r.equals(other.getZqu__Quote_Amendments__r()))) &&
            ((this.zqu__Quote_Product_Features__r==null && other.getZqu__Quote_Product_Features__r()==null) || 
             (this.zqu__Quote_Product_Features__r!=null &&
              this.zqu__Quote_Product_Features__r.equals(other.getZqu__Quote_Product_Features__r()))) &&
            ((this.zqu__Quote_Rate_Plans__r==null && other.getZqu__Quote_Rate_Plans__r()==null) || 
             (this.zqu__Quote_Rate_Plans__r!=null &&
              this.zqu__Quote_Rate_Plans__r.equals(other.getZqu__Quote_Rate_Plans__r()))) &&
            ((this.zqu__RecordReadOnly__c==null && other.getZqu__RecordReadOnly__c()==null) || 
             (this.zqu__RecordReadOnly__c!=null &&
              this.zqu__RecordReadOnly__c.equals(other.getZqu__RecordReadOnly__c()))) &&
            ((this.zqu__RenewalSetting__c==null && other.getZqu__RenewalSetting__c()==null) || 
             (this.zqu__RenewalSetting__c!=null &&
              this.zqu__RenewalSetting__c.equals(other.getZqu__RenewalSetting__c()))) &&
            ((this.zqu__RenewalTerm__c==null && other.getZqu__RenewalTerm__c()==null) || 
             (this.zqu__RenewalTerm__c!=null &&
              this.zqu__RenewalTerm__c.equals(other.getZqu__RenewalTerm__c()))) &&
            ((this.zqu__Service_Activation_Date__c==null && other.getZqu__Service_Activation_Date__c()==null) || 
             (this.zqu__Service_Activation_Date__c!=null &&
              this.zqu__Service_Activation_Date__c.equals(other.getZqu__Service_Activation_Date__c()))) &&
            ((this.zqu__SoldToContact__c==null && other.getZqu__SoldToContact__c()==null) || 
             (this.zqu__SoldToContact__c!=null &&
              this.zqu__SoldToContact__c.equals(other.getZqu__SoldToContact__c()))) &&
            ((this.zqu__SoldToContact__r==null && other.getZqu__SoldToContact__r()==null) || 
             (this.zqu__SoldToContact__r!=null &&
              this.zqu__SoldToContact__r.equals(other.getZqu__SoldToContact__r()))) &&
            ((this.zqu__StartDate__c==null && other.getZqu__StartDate__c()==null) || 
             (this.zqu__StartDate__c!=null &&
              this.zqu__StartDate__c.equals(other.getZqu__StartDate__c()))) &&
            ((this.zqu__Status__c==null && other.getZqu__Status__c()==null) || 
             (this.zqu__Status__c!=null &&
              this.zqu__Status__c.equals(other.getZqu__Status__c()))) &&
            ((this.zqu__SubQuotes__r==null && other.getZqu__SubQuotes__r()==null) || 
             (this.zqu__SubQuotes__r!=null &&
              this.zqu__SubQuotes__r.equals(other.getZqu__SubQuotes__r()))) &&
            ((this.zqu__SubscriptionName__c==null && other.getZqu__SubscriptionName__c()==null) || 
             (this.zqu__SubscriptionName__c!=null &&
              this.zqu__SubscriptionName__c.equals(other.getZqu__SubscriptionName__c()))) &&
            ((this.zqu__SubscriptionTermEndDate__c==null && other.getZqu__SubscriptionTermEndDate__c()==null) || 
             (this.zqu__SubscriptionTermEndDate__c!=null &&
              this.zqu__SubscriptionTermEndDate__c.equals(other.getZqu__SubscriptionTermEndDate__c()))) &&
            ((this.zqu__SubscriptionTermStartDate__c==null && other.getZqu__SubscriptionTermStartDate__c()==null) || 
             (this.zqu__SubscriptionTermStartDate__c!=null &&
              this.zqu__SubscriptionTermStartDate__c.equals(other.getZqu__SubscriptionTermStartDate__c()))) &&
            ((this.zqu__SubscriptionType__c==null && other.getZqu__SubscriptionType__c()==null) || 
             (this.zqu__SubscriptionType__c!=null &&
              this.zqu__SubscriptionType__c.equals(other.getZqu__SubscriptionType__c()))) &&
            ((this.zqu__SubscriptionVersion__c==null && other.getZqu__SubscriptionVersion__c()==null) || 
             (this.zqu__SubscriptionVersion__c!=null &&
              this.zqu__SubscriptionVersion__c.equals(other.getZqu__SubscriptionVersion__c()))) &&
            ((this.zqu__Subscription_Name__c==null && other.getZqu__Subscription_Name__c()==null) || 
             (this.zqu__Subscription_Name__c!=null &&
              this.zqu__Subscription_Name__c.equals(other.getZqu__Subscription_Name__c()))) &&
            ((this.zqu__Subscription_Term_Type__c==null && other.getZqu__Subscription_Term_Type__c()==null) || 
             (this.zqu__Subscription_Term_Type__c!=null &&
              this.zqu__Subscription_Term_Type__c.equals(other.getZqu__Subscription_Term_Type__c()))) &&
            ((this.zqu__TCV__c==null && other.getZqu__TCV__c()==null) || 
             (this.zqu__TCV__c!=null &&
              this.zqu__TCV__c.equals(other.getZqu__TCV__c()))) &&
            ((this.zqu__Tax__c==null && other.getZqu__Tax__c()==null) || 
             (this.zqu__Tax__c!=null &&
              this.zqu__Tax__c.equals(other.getZqu__Tax__c()))) &&
            ((this.zqu__TermStartDate__c==null && other.getZqu__TermStartDate__c()==null) || 
             (this.zqu__TermStartDate__c!=null &&
              this.zqu__TermStartDate__c.equals(other.getZqu__TermStartDate__c()))) &&
            ((this.zqu__Terms__c==null && other.getZqu__Terms__c()==null) || 
             (this.zqu__Terms__c!=null &&
              this.zqu__Terms__c.equals(other.getZqu__Terms__c()))) &&
            ((this.zqu__Total__c==null && other.getZqu__Total__c()==null) || 
             (this.zqu__Total__c!=null &&
              this.zqu__Total__c.equals(other.getZqu__Total__c()))) &&
            ((this.zqu__ValidUntil__c==null && other.getZqu__ValidUntil__c()==null) || 
             (this.zqu__ValidUntil__c!=null &&
              this.zqu__ValidUntil__c.equals(other.getZqu__ValidUntil__c()))) &&
            ((this.zqu__ZuoraAccountID__c==null && other.getZqu__ZuoraAccountID__c()==null) || 
             (this.zqu__ZuoraAccountID__c!=null &&
              this.zqu__ZuoraAccountID__c.equals(other.getZqu__ZuoraAccountID__c()))) &&
            ((this.zqu__ZuoraConfig__c==null && other.getZqu__ZuoraConfig__c()==null) || 
             (this.zqu__ZuoraConfig__c!=null &&
              this.zqu__ZuoraConfig__c.equals(other.getZqu__ZuoraConfig__c()))) &&
            ((this.zqu__ZuoraConfig__r==null && other.getZqu__ZuoraConfig__r()==null) || 
             (this.zqu__ZuoraConfig__r!=null &&
              this.zqu__ZuoraConfig__r.equals(other.getZqu__ZuoraConfig__r()))) &&
            ((this.zqu__ZuoraParentBillingAccountId__c==null && other.getZqu__ZuoraParentBillingAccountId__c()==null) || 
             (this.zqu__ZuoraParentBillingAccountId__c!=null &&
              this.zqu__ZuoraParentBillingAccountId__c.equals(other.getZqu__ZuoraParentBillingAccountId__c()))) &&
            ((this.zqu__ZuoraParentBillingAccountName__c==null && other.getZqu__ZuoraParentBillingAccountName__c()==null) || 
             (this.zqu__ZuoraParentBillingAccountName__c!=null &&
              this.zqu__ZuoraParentBillingAccountName__c.equals(other.getZqu__ZuoraParentBillingAccountName__c()))) &&
            ((this.zqu__ZuoraPaymentID__c==null && other.getZqu__ZuoraPaymentID__c()==null) || 
             (this.zqu__ZuoraPaymentID__c!=null &&
              this.zqu__ZuoraPaymentID__c.equals(other.getZqu__ZuoraPaymentID__c()))) &&
            ((this.zqu__ZuoraSubscriptionID__c==null && other.getZqu__ZuoraSubscriptionID__c()==null) || 
             (this.zqu__ZuoraSubscriptionID__c!=null &&
              this.zqu__ZuoraSubscriptionID__c.equals(other.getZqu__ZuoraSubscriptionID__c()))) &&
            ((this.zqu__Zuora_Account_Number__c==null && other.getZqu__Zuora_Account_Number__c()==null) || 
             (this.zqu__Zuora_Account_Number__c!=null &&
              this.zqu__Zuora_Account_Number__c.equals(other.getZqu__Zuora_Account_Number__c())));
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
        if (getCredit_Card_Capture_Link__c() != null) {
            _hashCode += getCredit_Card_Capture_Link__c().hashCode();
        }
        if (getCustomField10__c() != null) {
            _hashCode += getCustomField10__c().hashCode();
        }
        if (getDuplicateRecordItems() != null) {
            _hashCode += getDuplicateRecordItems().hashCode();
        }
        if (getEmail_Sent_To_Customer__c() != null) {
            _hashCode += getEmail_Sent_To_Customer__c().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getIn_Line_Discount__c() != null) {
            _hashCode += getIn_Line_Discount__c().hashCode();
        }
        if (getIntacctCustomerID__c() != null) {
            _hashCode += getIntacctCustomerID__c().hashCode();
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
        if (getLast_Email_Sent__c() != null) {
            _hashCode += getLast_Email_Sent__c().hashCode();
        }
        if (getLookedUpFromActivities() != null) {
            _hashCode += getLookedUpFromActivities().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNew_Cust_Obj2__c() != null) {
            _hashCode += getNew_Cust_Obj2__c().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getNotesAndAttachments() != null) {
            _hashCode += getNotesAndAttachments().hashCode();
        }
        if (getOpportunities__r() != null) {
            _hashCode += getOpportunities__r().hashCode();
        }
        if (getOpportunityType__c() != null) {
            _hashCode += getOpportunityType__c().hashCode();
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
        if (getProject_ID__c() != null) {
            _hashCode += getProject_ID__c().hashCode();
        }
        if (getRecordAssociatedGroups() != null) {
            _hashCode += getRecordAssociatedGroups().hashCode();
        }
        if (getRecordType() != null) {
            _hashCode += getRecordType().hashCode();
        }
        if (getRecordTypeId() != null) {
            _hashCode += getRecordTypeId().hashCode();
        }
        if (getRoll_up_Effective_Price__c() != null) {
            _hashCode += getRoll_up_Effective_Price__c().hashCode();
        }
        if (getRoll_up_List_Price__c() != null) {
            _hashCode += getRoll_up_List_Price__c().hashCode();
        }
        if (getSend_Email__c() != null) {
            _hashCode += getSend_Email__c().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getText_Testing__c() != null) {
            _hashCode += getText_Testing__c().hashCode();
        }
        if (getTopicAssignments() != null) {
            _hashCode += getTopicAssignments().hashCode();
        }
        if (getUserRecordAccess() != null) {
            _hashCode += getUserRecordAccess().hashCode();
        }
        if (getFormula_query_123__c() != null) {
            _hashCode += getFormula_query_123__c().hashCode();
        }
        if (getQuery_123__c() != null) {
            _hashCode += getQuery_123__c().hashCode();
        }
        if (getZqu__Account__c() != null) {
            _hashCode += getZqu__Account__c().hashCode();
        }
        if (getZqu__Account__r() != null) {
            _hashCode += getZqu__Account__r().hashCode();
        }
        if (getZqu__AmendmentName__c() != null) {
            _hashCode += getZqu__AmendmentName__c().hashCode();
        }
        if (getZqu__Amendment_Name__c() != null) {
            _hashCode += getZqu__Amendment_Name__c().hashCode();
        }
        if (getZqu__AutoRenew__c() != null) {
            _hashCode += getZqu__AutoRenew__c().hashCode();
        }
        if (getZqu__BillCycleDay__c() != null) {
            _hashCode += getZqu__BillCycleDay__c().hashCode();
        }
        if (getZqu__BillToContact__c() != null) {
            _hashCode += getZqu__BillToContact__c().hashCode();
        }
        if (getZqu__BillToContact__r() != null) {
            _hashCode += getZqu__BillToContact__r().hashCode();
        }
        if (getZqu__BillingBatch__c() != null) {
            _hashCode += getZqu__BillingBatch__c().hashCode();
        }
        if (getZqu__BillingCycleDay__c() != null) {
            _hashCode += getZqu__BillingCycleDay__c().hashCode();
        }
        if (getZqu__BillingMethod__c() != null) {
            _hashCode += getZqu__BillingMethod__c().hashCode();
        }
        if (getZqu__Calculate_Quote_Metrics_Through__c() != null) {
            _hashCode += getZqu__Calculate_Quote_Metrics_Through__c().hashCode();
        }
        if (getZqu__CancellationDate__c() != null) {
            _hashCode += getZqu__CancellationDate__c().hashCode();
        }
        if (getZqu__CancellationEffectiveDate__c() != null) {
            _hashCode += getZqu__CancellationEffectiveDate__c().hashCode();
        }
        if (getZqu__CommunicationProfile__c() != null) {
            _hashCode += getZqu__CommunicationProfile__c().hashCode();
        }
        if (getZqu__CommunicationProfile__r() != null) {
            _hashCode += getZqu__CommunicationProfile__r().hashCode();
        }
        if (getZqu__Currency__c() != null) {
            _hashCode += getZqu__Currency__c().hashCode();
        }
        if (getZqu__Customer_Acceptance_Date__c() != null) {
            _hashCode += getZqu__Customer_Acceptance_Date__c().hashCode();
        }
        if (getZqu__DeltaMRR__c() != null) {
            _hashCode += getZqu__DeltaMRR__c().hashCode();
        }
        if (getZqu__DeltaTCV__c() != null) {
            _hashCode += getZqu__DeltaTCV__c().hashCode();
        }
        if (getZqu__Description__c() != null) {
            _hashCode += getZqu__Description__c().hashCode();
        }
        if (getZqu__ElectronicPaymentMethodId__c() != null) {
            _hashCode += getZqu__ElectronicPaymentMethodId__c().hashCode();
        }
        if (getZqu__ExistSubscriptionID__c() != null) {
            _hashCode += getZqu__ExistSubscriptionID__c().hashCode();
        }
        if (getZqu__GenerateInvoice__c() != null) {
            _hashCode += getZqu__GenerateInvoice__c().hashCode();
        }
        if (getZqu__Hidden_Subscription_Name__c() != null) {
            _hashCode += getZqu__Hidden_Subscription_Name__c().hashCode();
        }
        if (getZqu__InitialTerm__c() != null) {
            _hashCode += getZqu__InitialTerm__c().hashCode();
        }
        if (getZqu__InvoiceDate__c() != null) {
            _hashCode += getZqu__InvoiceDate__c().hashCode();
        }
        if (getZqu__InvoiceID__c() != null) {
            _hashCode += getZqu__InvoiceID__c().hashCode();
        }
        if (getZqu__InvoiceOwnerId__c() != null) {
            _hashCode += getZqu__InvoiceOwnerId__c().hashCode();
        }
        if (getZqu__InvoiceOwnerName__c() != null) {
            _hashCode += getZqu__InvoiceOwnerName__c().hashCode();
        }
        if (getZqu__InvoiceProcessingOption__c() != null) {
            _hashCode += getZqu__InvoiceProcessingOption__c().hashCode();
        }
        if (getZqu__InvoiceSeparately__c() != null) {
            _hashCode += getZqu__InvoiceSeparately__c().hashCode();
        }
        if (getZqu__InvoiceTargetDate__c() != null) {
            _hashCode += getZqu__InvoiceTargetDate__c().hashCode();
        }
        if (getZqu__InvoiceTemplate__c() != null) {
            _hashCode += getZqu__InvoiceTemplate__c().hashCode();
        }
        if (getZqu__InvoiceTemplate__r() != null) {
            _hashCode += getZqu__InvoiceTemplate__r().hashCode();
        }
        if (getZqu__Is_Charge_Expired__c() != null) {
            _hashCode += getZqu__Is_Charge_Expired__c().hashCode();
        }
        if (getZqu__Is_Parent_Quote__c() != null) {
            _hashCode += getZqu__Is_Parent_Quote__c().hashCode();
        }
        if (getZqu__MRR__c() != null) {
            _hashCode += getZqu__MRR__c().hashCode();
        }
        if (getZqu__Number__c() != null) {
            _hashCode += getZqu__Number__c().hashCode();
        }
        if (getZqu__Opportunity__c() != null) {
            _hashCode += getZqu__Opportunity__c().hashCode();
        }
        if (getZqu__Opportunity__r() != null) {
            _hashCode += getZqu__Opportunity__r().hashCode();
        }
        if (getZqu__ParentQuote__c() != null) {
            _hashCode += getZqu__ParentQuote__c().hashCode();
        }
        if (getZqu__ParentQuote__r() != null) {
            _hashCode += getZqu__ParentQuote__r().hashCode();
        }
        if (getZqu__PaymentGateway__c() != null) {
            _hashCode += getZqu__PaymentGateway__c().hashCode();
        }
        if (getZqu__PaymentMethod__c() != null) {
            _hashCode += getZqu__PaymentMethod__c().hashCode();
        }
        if (getZqu__PaymentTerm__c() != null) {
            _hashCode += getZqu__PaymentTerm__c().hashCode();
        }
        if (getZqu__Previewed_Delta_MRR__c() != null) {
            _hashCode += getZqu__Previewed_Delta_MRR__c().hashCode();
        }
        if (getZqu__Previewed_Delta_TCV__c() != null) {
            _hashCode += getZqu__Previewed_Delta_TCV__c().hashCode();
        }
        if (getZqu__Previewed_Discount__c() != null) {
            _hashCode += getZqu__Previewed_Discount__c().hashCode();
        }
        if (getZqu__Previewed_MRR__c() != null) {
            _hashCode += getZqu__Previewed_MRR__c().hashCode();
        }
        if (getZqu__Previewed_SubTotal__c() != null) {
            _hashCode += getZqu__Previewed_SubTotal__c().hashCode();
        }
        if (getZqu__Previewed_TCV__c() != null) {
            _hashCode += getZqu__Previewed_TCV__c().hashCode();
        }
        if (getZqu__Previewed_Tax__c() != null) {
            _hashCode += getZqu__Previewed_Tax__c().hashCode();
        }
        if (getZqu__Previewed_Total__c() != null) {
            _hashCode += getZqu__Previewed_Total__c().hashCode();
        }
        if (getZqu__ProcessPayment__c() != null) {
            _hashCode += getZqu__ProcessPayment__c().hashCode();
        }
        if (getZqu__ProductSelectorVersion__c() != null) {
            _hashCode += getZqu__ProductSelectorVersion__c().hashCode();
        }
        if (getZqu__QuoteCharge__r() != null) {
            _hashCode += getZqu__QuoteCharge__r().hashCode();
        }
        if (getZqu__QuoteTemplate__c() != null) {
            _hashCode += getZqu__QuoteTemplate__c().hashCode();
        }
        if (getZqu__QuoteTemplate__r() != null) {
            _hashCode += getZqu__QuoteTemplate__r().hashCode();
        }
        if (getZqu__Quote_Amendments__r() != null) {
            _hashCode += getZqu__Quote_Amendments__r().hashCode();
        }
        if (getZqu__Quote_Product_Features__r() != null) {
            _hashCode += getZqu__Quote_Product_Features__r().hashCode();
        }
        if (getZqu__Quote_Rate_Plans__r() != null) {
            _hashCode += getZqu__Quote_Rate_Plans__r().hashCode();
        }
        if (getZqu__RecordReadOnly__c() != null) {
            _hashCode += getZqu__RecordReadOnly__c().hashCode();
        }
        if (getZqu__RenewalSetting__c() != null) {
            _hashCode += getZqu__RenewalSetting__c().hashCode();
        }
        if (getZqu__RenewalTerm__c() != null) {
            _hashCode += getZqu__RenewalTerm__c().hashCode();
        }
        if (getZqu__Service_Activation_Date__c() != null) {
            _hashCode += getZqu__Service_Activation_Date__c().hashCode();
        }
        if (getZqu__SoldToContact__c() != null) {
            _hashCode += getZqu__SoldToContact__c().hashCode();
        }
        if (getZqu__SoldToContact__r() != null) {
            _hashCode += getZqu__SoldToContact__r().hashCode();
        }
        if (getZqu__StartDate__c() != null) {
            _hashCode += getZqu__StartDate__c().hashCode();
        }
        if (getZqu__Status__c() != null) {
            _hashCode += getZqu__Status__c().hashCode();
        }
        if (getZqu__SubQuotes__r() != null) {
            _hashCode += getZqu__SubQuotes__r().hashCode();
        }
        if (getZqu__SubscriptionName__c() != null) {
            _hashCode += getZqu__SubscriptionName__c().hashCode();
        }
        if (getZqu__SubscriptionTermEndDate__c() != null) {
            _hashCode += getZqu__SubscriptionTermEndDate__c().hashCode();
        }
        if (getZqu__SubscriptionTermStartDate__c() != null) {
            _hashCode += getZqu__SubscriptionTermStartDate__c().hashCode();
        }
        if (getZqu__SubscriptionType__c() != null) {
            _hashCode += getZqu__SubscriptionType__c().hashCode();
        }
        if (getZqu__SubscriptionVersion__c() != null) {
            _hashCode += getZqu__SubscriptionVersion__c().hashCode();
        }
        if (getZqu__Subscription_Name__c() != null) {
            _hashCode += getZqu__Subscription_Name__c().hashCode();
        }
        if (getZqu__Subscription_Term_Type__c() != null) {
            _hashCode += getZqu__Subscription_Term_Type__c().hashCode();
        }
        if (getZqu__TCV__c() != null) {
            _hashCode += getZqu__TCV__c().hashCode();
        }
        if (getZqu__Tax__c() != null) {
            _hashCode += getZqu__Tax__c().hashCode();
        }
        if (getZqu__TermStartDate__c() != null) {
            _hashCode += getZqu__TermStartDate__c().hashCode();
        }
        if (getZqu__Terms__c() != null) {
            _hashCode += getZqu__Terms__c().hashCode();
        }
        if (getZqu__Total__c() != null) {
            _hashCode += getZqu__Total__c().hashCode();
        }
        if (getZqu__ValidUntil__c() != null) {
            _hashCode += getZqu__ValidUntil__c().hashCode();
        }
        if (getZqu__ZuoraAccountID__c() != null) {
            _hashCode += getZqu__ZuoraAccountID__c().hashCode();
        }
        if (getZqu__ZuoraConfig__c() != null) {
            _hashCode += getZqu__ZuoraConfig__c().hashCode();
        }
        if (getZqu__ZuoraConfig__r() != null) {
            _hashCode += getZqu__ZuoraConfig__r().hashCode();
        }
        if (getZqu__ZuoraParentBillingAccountId__c() != null) {
            _hashCode += getZqu__ZuoraParentBillingAccountId__c().hashCode();
        }
        if (getZqu__ZuoraParentBillingAccountName__c() != null) {
            _hashCode += getZqu__ZuoraParentBillingAccountName__c().hashCode();
        }
        if (getZqu__ZuoraPaymentID__c() != null) {
            _hashCode += getZqu__ZuoraPaymentID__c().hashCode();
        }
        if (getZqu__ZuoraSubscriptionID__c() != null) {
            _hashCode += getZqu__ZuoraSubscriptionID__c().hashCode();
        }
        if (getZqu__Zuora_Account_Number__c() != null) {
            _hashCode += getZqu__Zuora_Account_Number__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Zqu__Quote__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Quote__c"));
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
        elemField.setFieldName("credit_Card_Capture_Link__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Credit_Card_Capture_Link__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customField10__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CustomField10__c"));
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
        elemField.setFieldName("email_Sent_To_Customer__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Email_Sent_To_Customer__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("in_Line_Discount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "In_Line_Discount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intacctCustomerID__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IntacctCustomerID__c"));
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
        elemField.setFieldName("last_Email_Sent__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Last_Email_Sent__c"));
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
        elemField.setFieldName("new_Cust_Obj2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "New_Cust_Obj2__c"));
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
        elemField.setFieldName("opportunities__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Opportunities__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityType__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityType__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("project_ID__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Project_ID__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("recordType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecordType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecordType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecordTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roll_up_Effective_Price__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Roll_up_Effective_Price__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roll_up_List_Price__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Roll_up_List_Price__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("text_Testing__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Text_Testing__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("formula_query_123__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "formula_query_123__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query_123__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "query_123__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Account__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Account__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Account__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Account__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__AmendmentName__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__AmendmentName__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Amendment_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Amendment_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__AutoRenew__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__AutoRenew__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__BillCycleDay__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__BillCycleDay__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__BillToContact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__BillToContact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__BillToContact__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__BillToContact__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__BillingBatch__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__BillingBatch__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__BillingCycleDay__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__BillingCycleDay__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__BillingMethod__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__BillingMethod__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Calculate_Quote_Metrics_Through__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Calculate_Quote_Metrics_Through__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__CancellationDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__CancellationDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__CancellationEffectiveDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__CancellationEffectiveDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__CommunicationProfile__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__CommunicationProfile__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__CommunicationProfile__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__CommunicationProfile__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__CommunicationProfile__c"));
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
        elemField.setFieldName("zqu__Customer_Acceptance_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Customer_Acceptance_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__DeltaMRR__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__DeltaMRR__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__DeltaTCV__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__DeltaTCV__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("zqu__ElectronicPaymentMethodId__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ElectronicPaymentMethodId__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__ExistSubscriptionID__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ExistSubscriptionID__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__GenerateInvoice__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__GenerateInvoice__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Hidden_Subscription_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Hidden_Subscription_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__InitialTerm__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__InitialTerm__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__InvoiceDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__InvoiceDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__InvoiceID__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__InvoiceID__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__InvoiceOwnerId__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__InvoiceOwnerId__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__InvoiceOwnerName__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__InvoiceOwnerName__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__InvoiceProcessingOption__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__InvoiceProcessingOption__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__InvoiceSeparately__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__InvoiceSeparately__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__InvoiceTargetDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__InvoiceTargetDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__InvoiceTemplate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__InvoiceTemplate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__InvoiceTemplate__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__InvoiceTemplate__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__InvoiceTemplate__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Is_Charge_Expired__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Is_Charge_Expired__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Is_Parent_Quote__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Is_Parent_Quote__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("zqu__Number__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Number__c"));
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
        elemField.setFieldName("zqu__ParentQuote__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ParentQuote__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__ParentQuote__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ParentQuote__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Quote__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__PaymentGateway__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__PaymentGateway__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__PaymentMethod__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__PaymentMethod__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("zqu__Previewed_Delta_MRR__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Previewed_Delta_MRR__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Previewed_Delta_TCV__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Previewed_Delta_TCV__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Previewed_Discount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Previewed_Discount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Previewed_MRR__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Previewed_MRR__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Previewed_SubTotal__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Previewed_SubTotal__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Previewed_TCV__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Previewed_TCV__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Previewed_Tax__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Previewed_Tax__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Previewed_Total__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Previewed_Total__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__ProcessPayment__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ProcessPayment__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("zqu__QuoteCharge__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__QuoteCharge__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__QuoteTemplate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__QuoteTemplate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__QuoteTemplate__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__QuoteTemplate__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Quote_Template__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Quote_Amendments__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Quote_Amendments__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Quote_Product_Features__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Quote_Product_Features__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Quote_Rate_Plans__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Quote_Rate_Plans__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__RecordReadOnly__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__RecordReadOnly__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__RenewalSetting__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__RenewalSetting__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__RenewalTerm__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__RenewalTerm__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Service_Activation_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Service_Activation_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__SoldToContact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__SoldToContact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__SoldToContact__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__SoldToContact__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__StartDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__StartDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Status__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Status__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__SubQuotes__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__SubQuotes__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__SubscriptionName__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__SubscriptionName__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__SubscriptionTermEndDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__SubscriptionTermEndDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__SubscriptionTermStartDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__SubscriptionTermStartDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__SubscriptionType__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__SubscriptionType__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__SubscriptionVersion__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__SubscriptionVersion__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Subscription_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Subscription_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Subscription_Term_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Subscription_Term_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("zqu__Tax__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Tax__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__TermStartDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__TermStartDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Terms__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Terms__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Total__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Total__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__ValidUntil__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ValidUntil__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__ZuoraAccountID__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ZuoraAccountID__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__ZuoraConfig__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ZuoraConfig__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__ZuoraConfig__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ZuoraConfig__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ZuoraConfig__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__ZuoraParentBillingAccountId__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ZuoraParentBillingAccountId__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__ZuoraParentBillingAccountName__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ZuoraParentBillingAccountName__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__ZuoraPaymentID__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ZuoraPaymentID__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__ZuoraSubscriptionID__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ZuoraSubscriptionID__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Zuora_Account_Number__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Zuora_Account_Number__c"));
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
