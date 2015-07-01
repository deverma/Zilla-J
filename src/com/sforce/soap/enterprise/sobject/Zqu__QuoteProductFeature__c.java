/**
 * Zqu__QuoteProductFeature__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Zqu__QuoteProductFeature__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
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

    private java.lang.String zqu__ChargeGroupId__c;

    private java.lang.String zqu__Description__c;

    private java.lang.String zqu__FeatureName__c;

    private java.lang.String zqu__FeatureZuoraIdFormula__c;

    private java.lang.String zqu__FeatureZuoraId__c;

    private java.lang.String zqu__ProductRatePlanZuoraIdFormula__c;

    private java.lang.String zqu__ProductRatePlanZuoraId__c;

    private java.lang.String zqu__ProductRatePlan__c;

    private com.sforce.soap.enterprise.sobject.Zqu__ProductRatePlan__c zqu__ProductRatePlan__r;

    private java.lang.String zqu__ProductZuoraIdFormula__c;

    private java.lang.String zqu__ProductZuoraId__c;

    private java.lang.String zqu__QuoteRatePlan__c;

    private com.sforce.soap.enterprise.sobject.Zqu__QuoteRatePlan__c zqu__QuoteRatePlan__r;

    private java.lang.String zqu__Quote__c;

    private com.sforce.soap.enterprise.sobject.Zqu__Quote__c zqu__Quote__r;

    private java.lang.String zqu__SubscriptionProductFeatureId__c;

    private java.lang.String zqu__ZFeature__c;

    private com.sforce.soap.enterprise.sobject.Zqu__ZFeature__c zqu__ZFeature__r;

    private java.lang.String zqu__ZProduct__c;

    private com.sforce.soap.enterprise.sobject.Zqu__ZProduct__c zqu__ZProduct__r;

    public Zqu__QuoteProductFeature__c() {
    }

    public Zqu__QuoteProductFeature__c(
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
           java.lang.String zqu__ChargeGroupId__c,
           java.lang.String zqu__Description__c,
           java.lang.String zqu__FeatureName__c,
           java.lang.String zqu__FeatureZuoraIdFormula__c,
           java.lang.String zqu__FeatureZuoraId__c,
           java.lang.String zqu__ProductRatePlanZuoraIdFormula__c,
           java.lang.String zqu__ProductRatePlanZuoraId__c,
           java.lang.String zqu__ProductRatePlan__c,
           com.sforce.soap.enterprise.sobject.Zqu__ProductRatePlan__c zqu__ProductRatePlan__r,
           java.lang.String zqu__ProductZuoraIdFormula__c,
           java.lang.String zqu__ProductZuoraId__c,
           java.lang.String zqu__QuoteRatePlan__c,
           com.sforce.soap.enterprise.sobject.Zqu__QuoteRatePlan__c zqu__QuoteRatePlan__r,
           java.lang.String zqu__Quote__c,
           com.sforce.soap.enterprise.sobject.Zqu__Quote__c zqu__Quote__r,
           java.lang.String zqu__SubscriptionProductFeatureId__c,
           java.lang.String zqu__ZFeature__c,
           com.sforce.soap.enterprise.sobject.Zqu__ZFeature__c zqu__ZFeature__r,
           java.lang.String zqu__ZProduct__c,
           com.sforce.soap.enterprise.sobject.Zqu__ZProduct__c zqu__ZProduct__r) {
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
        this.zqu__ChargeGroupId__c = zqu__ChargeGroupId__c;
        this.zqu__Description__c = zqu__Description__c;
        this.zqu__FeatureName__c = zqu__FeatureName__c;
        this.zqu__FeatureZuoraIdFormula__c = zqu__FeatureZuoraIdFormula__c;
        this.zqu__FeatureZuoraId__c = zqu__FeatureZuoraId__c;
        this.zqu__ProductRatePlanZuoraIdFormula__c = zqu__ProductRatePlanZuoraIdFormula__c;
        this.zqu__ProductRatePlanZuoraId__c = zqu__ProductRatePlanZuoraId__c;
        this.zqu__ProductRatePlan__c = zqu__ProductRatePlan__c;
        this.zqu__ProductRatePlan__r = zqu__ProductRatePlan__r;
        this.zqu__ProductZuoraIdFormula__c = zqu__ProductZuoraIdFormula__c;
        this.zqu__ProductZuoraId__c = zqu__ProductZuoraId__c;
        this.zqu__QuoteRatePlan__c = zqu__QuoteRatePlan__c;
        this.zqu__QuoteRatePlan__r = zqu__QuoteRatePlan__r;
        this.zqu__Quote__c = zqu__Quote__c;
        this.zqu__Quote__r = zqu__Quote__r;
        this.zqu__SubscriptionProductFeatureId__c = zqu__SubscriptionProductFeatureId__c;
        this.zqu__ZFeature__c = zqu__ZFeature__c;
        this.zqu__ZFeature__r = zqu__ZFeature__r;
        this.zqu__ZProduct__c = zqu__ZProduct__c;
        this.zqu__ZProduct__r = zqu__ZProduct__r;
    }


    /**
     * Gets the attachedContentDocuments value for this Zqu__QuoteProductFeature__c.
     * 
     * @return attachedContentDocuments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachedContentDocuments() {
        return attachedContentDocuments;
    }


    /**
     * Sets the attachedContentDocuments value for this Zqu__QuoteProductFeature__c.
     * 
     * @param attachedContentDocuments
     */
    public void setAttachedContentDocuments(com.sforce.soap.enterprise.QueryResult attachedContentDocuments) {
        this.attachedContentDocuments = attachedContentDocuments;
    }


    /**
     * Gets the attachments value for this Zqu__QuoteProductFeature__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Zqu__QuoteProductFeature__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the combinedAttachments value for this Zqu__QuoteProductFeature__c.
     * 
     * @return combinedAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getCombinedAttachments() {
        return combinedAttachments;
    }


    /**
     * Sets the combinedAttachments value for this Zqu__QuoteProductFeature__c.
     * 
     * @param combinedAttachments
     */
    public void setCombinedAttachments(com.sforce.soap.enterprise.QueryResult combinedAttachments) {
        this.combinedAttachments = combinedAttachments;
    }


    /**
     * Gets the createdBy value for this Zqu__QuoteProductFeature__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Zqu__QuoteProductFeature__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Zqu__QuoteProductFeature__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Zqu__QuoteProductFeature__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Zqu__QuoteProductFeature__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Zqu__QuoteProductFeature__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the duplicateRecordItems value for this Zqu__QuoteProductFeature__c.
     * 
     * @return duplicateRecordItems
     */
    public com.sforce.soap.enterprise.QueryResult getDuplicateRecordItems() {
        return duplicateRecordItems;
    }


    /**
     * Sets the duplicateRecordItems value for this Zqu__QuoteProductFeature__c.
     * 
     * @param duplicateRecordItems
     */
    public void setDuplicateRecordItems(com.sforce.soap.enterprise.QueryResult duplicateRecordItems) {
        this.duplicateRecordItems = duplicateRecordItems;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Zqu__QuoteProductFeature__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Zqu__QuoteProductFeature__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the isDeleted value for this Zqu__QuoteProductFeature__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Zqu__QuoteProductFeature__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this Zqu__QuoteProductFeature__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Zqu__QuoteProductFeature__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Zqu__QuoteProductFeature__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Zqu__QuoteProductFeature__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Zqu__QuoteProductFeature__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Zqu__QuoteProductFeature__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lookedUpFromActivities value for this Zqu__QuoteProductFeature__c.
     * 
     * @return lookedUpFromActivities
     */
    public com.sforce.soap.enterprise.QueryResult getLookedUpFromActivities() {
        return lookedUpFromActivities;
    }


    /**
     * Sets the lookedUpFromActivities value for this Zqu__QuoteProductFeature__c.
     * 
     * @param lookedUpFromActivities
     */
    public void setLookedUpFromActivities(com.sforce.soap.enterprise.QueryResult lookedUpFromActivities) {
        this.lookedUpFromActivities = lookedUpFromActivities;
    }


    /**
     * Gets the name value for this Zqu__QuoteProductFeature__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Zqu__QuoteProductFeature__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Zqu__QuoteProductFeature__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Zqu__QuoteProductFeature__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Zqu__QuoteProductFeature__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Zqu__QuoteProductFeature__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the owner value for this Zqu__QuoteProductFeature__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.SObject getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Zqu__QuoteProductFeature__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.SObject owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Zqu__QuoteProductFeature__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Zqu__QuoteProductFeature__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the processInstances value for this Zqu__QuoteProductFeature__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Zqu__QuoteProductFeature__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Zqu__QuoteProductFeature__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Zqu__QuoteProductFeature__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the recordAssociatedGroups value for this Zqu__QuoteProductFeature__c.
     * 
     * @return recordAssociatedGroups
     */
    public com.sforce.soap.enterprise.QueryResult getRecordAssociatedGroups() {
        return recordAssociatedGroups;
    }


    /**
     * Sets the recordAssociatedGroups value for this Zqu__QuoteProductFeature__c.
     * 
     * @param recordAssociatedGroups
     */
    public void setRecordAssociatedGroups(com.sforce.soap.enterprise.QueryResult recordAssociatedGroups) {
        this.recordAssociatedGroups = recordAssociatedGroups;
    }


    /**
     * Gets the systemModstamp value for this Zqu__QuoteProductFeature__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Zqu__QuoteProductFeature__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the topicAssignments value for this Zqu__QuoteProductFeature__c.
     * 
     * @return topicAssignments
     */
    public com.sforce.soap.enterprise.QueryResult getTopicAssignments() {
        return topicAssignments;
    }


    /**
     * Sets the topicAssignments value for this Zqu__QuoteProductFeature__c.
     * 
     * @param topicAssignments
     */
    public void setTopicAssignments(com.sforce.soap.enterprise.QueryResult topicAssignments) {
        this.topicAssignments = topicAssignments;
    }


    /**
     * Gets the userRecordAccess value for this Zqu__QuoteProductFeature__c.
     * 
     * @return userRecordAccess
     */
    public com.sforce.soap.enterprise.sobject.UserRecordAccess getUserRecordAccess() {
        return userRecordAccess;
    }


    /**
     * Sets the userRecordAccess value for this Zqu__QuoteProductFeature__c.
     * 
     * @param userRecordAccess
     */
    public void setUserRecordAccess(com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess) {
        this.userRecordAccess = userRecordAccess;
    }


    /**
     * Gets the zqu__ChargeGroupId__c value for this Zqu__QuoteProductFeature__c.
     * 
     * @return zqu__ChargeGroupId__c
     */
    public java.lang.String getZqu__ChargeGroupId__c() {
        return zqu__ChargeGroupId__c;
    }


    /**
     * Sets the zqu__ChargeGroupId__c value for this Zqu__QuoteProductFeature__c.
     * 
     * @param zqu__ChargeGroupId__c
     */
    public void setZqu__ChargeGroupId__c(java.lang.String zqu__ChargeGroupId__c) {
        this.zqu__ChargeGroupId__c = zqu__ChargeGroupId__c;
    }


    /**
     * Gets the zqu__Description__c value for this Zqu__QuoteProductFeature__c.
     * 
     * @return zqu__Description__c
     */
    public java.lang.String getZqu__Description__c() {
        return zqu__Description__c;
    }


    /**
     * Sets the zqu__Description__c value for this Zqu__QuoteProductFeature__c.
     * 
     * @param zqu__Description__c
     */
    public void setZqu__Description__c(java.lang.String zqu__Description__c) {
        this.zqu__Description__c = zqu__Description__c;
    }


    /**
     * Gets the zqu__FeatureName__c value for this Zqu__QuoteProductFeature__c.
     * 
     * @return zqu__FeatureName__c
     */
    public java.lang.String getZqu__FeatureName__c() {
        return zqu__FeatureName__c;
    }


    /**
     * Sets the zqu__FeatureName__c value for this Zqu__QuoteProductFeature__c.
     * 
     * @param zqu__FeatureName__c
     */
    public void setZqu__FeatureName__c(java.lang.String zqu__FeatureName__c) {
        this.zqu__FeatureName__c = zqu__FeatureName__c;
    }


    /**
     * Gets the zqu__FeatureZuoraIdFormula__c value for this Zqu__QuoteProductFeature__c.
     * 
     * @return zqu__FeatureZuoraIdFormula__c
     */
    public java.lang.String getZqu__FeatureZuoraIdFormula__c() {
        return zqu__FeatureZuoraIdFormula__c;
    }


    /**
     * Sets the zqu__FeatureZuoraIdFormula__c value for this Zqu__QuoteProductFeature__c.
     * 
     * @param zqu__FeatureZuoraIdFormula__c
     */
    public void setZqu__FeatureZuoraIdFormula__c(java.lang.String zqu__FeatureZuoraIdFormula__c) {
        this.zqu__FeatureZuoraIdFormula__c = zqu__FeatureZuoraIdFormula__c;
    }


    /**
     * Gets the zqu__FeatureZuoraId__c value for this Zqu__QuoteProductFeature__c.
     * 
     * @return zqu__FeatureZuoraId__c
     */
    public java.lang.String getZqu__FeatureZuoraId__c() {
        return zqu__FeatureZuoraId__c;
    }


    /**
     * Sets the zqu__FeatureZuoraId__c value for this Zqu__QuoteProductFeature__c.
     * 
     * @param zqu__FeatureZuoraId__c
     */
    public void setZqu__FeatureZuoraId__c(java.lang.String zqu__FeatureZuoraId__c) {
        this.zqu__FeatureZuoraId__c = zqu__FeatureZuoraId__c;
    }


    /**
     * Gets the zqu__ProductRatePlanZuoraIdFormula__c value for this Zqu__QuoteProductFeature__c.
     * 
     * @return zqu__ProductRatePlanZuoraIdFormula__c
     */
    public java.lang.String getZqu__ProductRatePlanZuoraIdFormula__c() {
        return zqu__ProductRatePlanZuoraIdFormula__c;
    }


    /**
     * Sets the zqu__ProductRatePlanZuoraIdFormula__c value for this Zqu__QuoteProductFeature__c.
     * 
     * @param zqu__ProductRatePlanZuoraIdFormula__c
     */
    public void setZqu__ProductRatePlanZuoraIdFormula__c(java.lang.String zqu__ProductRatePlanZuoraIdFormula__c) {
        this.zqu__ProductRatePlanZuoraIdFormula__c = zqu__ProductRatePlanZuoraIdFormula__c;
    }


    /**
     * Gets the zqu__ProductRatePlanZuoraId__c value for this Zqu__QuoteProductFeature__c.
     * 
     * @return zqu__ProductRatePlanZuoraId__c
     */
    public java.lang.String getZqu__ProductRatePlanZuoraId__c() {
        return zqu__ProductRatePlanZuoraId__c;
    }


    /**
     * Sets the zqu__ProductRatePlanZuoraId__c value for this Zqu__QuoteProductFeature__c.
     * 
     * @param zqu__ProductRatePlanZuoraId__c
     */
    public void setZqu__ProductRatePlanZuoraId__c(java.lang.String zqu__ProductRatePlanZuoraId__c) {
        this.zqu__ProductRatePlanZuoraId__c = zqu__ProductRatePlanZuoraId__c;
    }


    /**
     * Gets the zqu__ProductRatePlan__c value for this Zqu__QuoteProductFeature__c.
     * 
     * @return zqu__ProductRatePlan__c
     */
    public java.lang.String getZqu__ProductRatePlan__c() {
        return zqu__ProductRatePlan__c;
    }


    /**
     * Sets the zqu__ProductRatePlan__c value for this Zqu__QuoteProductFeature__c.
     * 
     * @param zqu__ProductRatePlan__c
     */
    public void setZqu__ProductRatePlan__c(java.lang.String zqu__ProductRatePlan__c) {
        this.zqu__ProductRatePlan__c = zqu__ProductRatePlan__c;
    }


    /**
     * Gets the zqu__ProductRatePlan__r value for this Zqu__QuoteProductFeature__c.
     * 
     * @return zqu__ProductRatePlan__r
     */
    public com.sforce.soap.enterprise.sobject.Zqu__ProductRatePlan__c getZqu__ProductRatePlan__r() {
        return zqu__ProductRatePlan__r;
    }


    /**
     * Sets the zqu__ProductRatePlan__r value for this Zqu__QuoteProductFeature__c.
     * 
     * @param zqu__ProductRatePlan__r
     */
    public void setZqu__ProductRatePlan__r(com.sforce.soap.enterprise.sobject.Zqu__ProductRatePlan__c zqu__ProductRatePlan__r) {
        this.zqu__ProductRatePlan__r = zqu__ProductRatePlan__r;
    }


    /**
     * Gets the zqu__ProductZuoraIdFormula__c value for this Zqu__QuoteProductFeature__c.
     * 
     * @return zqu__ProductZuoraIdFormula__c
     */
    public java.lang.String getZqu__ProductZuoraIdFormula__c() {
        return zqu__ProductZuoraIdFormula__c;
    }


    /**
     * Sets the zqu__ProductZuoraIdFormula__c value for this Zqu__QuoteProductFeature__c.
     * 
     * @param zqu__ProductZuoraIdFormula__c
     */
    public void setZqu__ProductZuoraIdFormula__c(java.lang.String zqu__ProductZuoraIdFormula__c) {
        this.zqu__ProductZuoraIdFormula__c = zqu__ProductZuoraIdFormula__c;
    }


    /**
     * Gets the zqu__ProductZuoraId__c value for this Zqu__QuoteProductFeature__c.
     * 
     * @return zqu__ProductZuoraId__c
     */
    public java.lang.String getZqu__ProductZuoraId__c() {
        return zqu__ProductZuoraId__c;
    }


    /**
     * Sets the zqu__ProductZuoraId__c value for this Zqu__QuoteProductFeature__c.
     * 
     * @param zqu__ProductZuoraId__c
     */
    public void setZqu__ProductZuoraId__c(java.lang.String zqu__ProductZuoraId__c) {
        this.zqu__ProductZuoraId__c = zqu__ProductZuoraId__c;
    }


    /**
     * Gets the zqu__QuoteRatePlan__c value for this Zqu__QuoteProductFeature__c.
     * 
     * @return zqu__QuoteRatePlan__c
     */
    public java.lang.String getZqu__QuoteRatePlan__c() {
        return zqu__QuoteRatePlan__c;
    }


    /**
     * Sets the zqu__QuoteRatePlan__c value for this Zqu__QuoteProductFeature__c.
     * 
     * @param zqu__QuoteRatePlan__c
     */
    public void setZqu__QuoteRatePlan__c(java.lang.String zqu__QuoteRatePlan__c) {
        this.zqu__QuoteRatePlan__c = zqu__QuoteRatePlan__c;
    }


    /**
     * Gets the zqu__QuoteRatePlan__r value for this Zqu__QuoteProductFeature__c.
     * 
     * @return zqu__QuoteRatePlan__r
     */
    public com.sforce.soap.enterprise.sobject.Zqu__QuoteRatePlan__c getZqu__QuoteRatePlan__r() {
        return zqu__QuoteRatePlan__r;
    }


    /**
     * Sets the zqu__QuoteRatePlan__r value for this Zqu__QuoteProductFeature__c.
     * 
     * @param zqu__QuoteRatePlan__r
     */
    public void setZqu__QuoteRatePlan__r(com.sforce.soap.enterprise.sobject.Zqu__QuoteRatePlan__c zqu__QuoteRatePlan__r) {
        this.zqu__QuoteRatePlan__r = zqu__QuoteRatePlan__r;
    }


    /**
     * Gets the zqu__Quote__c value for this Zqu__QuoteProductFeature__c.
     * 
     * @return zqu__Quote__c
     */
    public java.lang.String getZqu__Quote__c() {
        return zqu__Quote__c;
    }


    /**
     * Sets the zqu__Quote__c value for this Zqu__QuoteProductFeature__c.
     * 
     * @param zqu__Quote__c
     */
    public void setZqu__Quote__c(java.lang.String zqu__Quote__c) {
        this.zqu__Quote__c = zqu__Quote__c;
    }


    /**
     * Gets the zqu__Quote__r value for this Zqu__QuoteProductFeature__c.
     * 
     * @return zqu__Quote__r
     */
    public com.sforce.soap.enterprise.sobject.Zqu__Quote__c getZqu__Quote__r() {
        return zqu__Quote__r;
    }


    /**
     * Sets the zqu__Quote__r value for this Zqu__QuoteProductFeature__c.
     * 
     * @param zqu__Quote__r
     */
    public void setZqu__Quote__r(com.sforce.soap.enterprise.sobject.Zqu__Quote__c zqu__Quote__r) {
        this.zqu__Quote__r = zqu__Quote__r;
    }


    /**
     * Gets the zqu__SubscriptionProductFeatureId__c value for this Zqu__QuoteProductFeature__c.
     * 
     * @return zqu__SubscriptionProductFeatureId__c
     */
    public java.lang.String getZqu__SubscriptionProductFeatureId__c() {
        return zqu__SubscriptionProductFeatureId__c;
    }


    /**
     * Sets the zqu__SubscriptionProductFeatureId__c value for this Zqu__QuoteProductFeature__c.
     * 
     * @param zqu__SubscriptionProductFeatureId__c
     */
    public void setZqu__SubscriptionProductFeatureId__c(java.lang.String zqu__SubscriptionProductFeatureId__c) {
        this.zqu__SubscriptionProductFeatureId__c = zqu__SubscriptionProductFeatureId__c;
    }


    /**
     * Gets the zqu__ZFeature__c value for this Zqu__QuoteProductFeature__c.
     * 
     * @return zqu__ZFeature__c
     */
    public java.lang.String getZqu__ZFeature__c() {
        return zqu__ZFeature__c;
    }


    /**
     * Sets the zqu__ZFeature__c value for this Zqu__QuoteProductFeature__c.
     * 
     * @param zqu__ZFeature__c
     */
    public void setZqu__ZFeature__c(java.lang.String zqu__ZFeature__c) {
        this.zqu__ZFeature__c = zqu__ZFeature__c;
    }


    /**
     * Gets the zqu__ZFeature__r value for this Zqu__QuoteProductFeature__c.
     * 
     * @return zqu__ZFeature__r
     */
    public com.sforce.soap.enterprise.sobject.Zqu__ZFeature__c getZqu__ZFeature__r() {
        return zqu__ZFeature__r;
    }


    /**
     * Sets the zqu__ZFeature__r value for this Zqu__QuoteProductFeature__c.
     * 
     * @param zqu__ZFeature__r
     */
    public void setZqu__ZFeature__r(com.sforce.soap.enterprise.sobject.Zqu__ZFeature__c zqu__ZFeature__r) {
        this.zqu__ZFeature__r = zqu__ZFeature__r;
    }


    /**
     * Gets the zqu__ZProduct__c value for this Zqu__QuoteProductFeature__c.
     * 
     * @return zqu__ZProduct__c
     */
    public java.lang.String getZqu__ZProduct__c() {
        return zqu__ZProduct__c;
    }


    /**
     * Sets the zqu__ZProduct__c value for this Zqu__QuoteProductFeature__c.
     * 
     * @param zqu__ZProduct__c
     */
    public void setZqu__ZProduct__c(java.lang.String zqu__ZProduct__c) {
        this.zqu__ZProduct__c = zqu__ZProduct__c;
    }


    /**
     * Gets the zqu__ZProduct__r value for this Zqu__QuoteProductFeature__c.
     * 
     * @return zqu__ZProduct__r
     */
    public com.sforce.soap.enterprise.sobject.Zqu__ZProduct__c getZqu__ZProduct__r() {
        return zqu__ZProduct__r;
    }


    /**
     * Sets the zqu__ZProduct__r value for this Zqu__QuoteProductFeature__c.
     * 
     * @param zqu__ZProduct__r
     */
    public void setZqu__ZProduct__r(com.sforce.soap.enterprise.sobject.Zqu__ZProduct__c zqu__ZProduct__r) {
        this.zqu__ZProduct__r = zqu__ZProduct__r;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Zqu__QuoteProductFeature__c)) return false;
        Zqu__QuoteProductFeature__c other = (Zqu__QuoteProductFeature__c) obj;
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
            ((this.zqu__ChargeGroupId__c==null && other.getZqu__ChargeGroupId__c()==null) || 
             (this.zqu__ChargeGroupId__c!=null &&
              this.zqu__ChargeGroupId__c.equals(other.getZqu__ChargeGroupId__c()))) &&
            ((this.zqu__Description__c==null && other.getZqu__Description__c()==null) || 
             (this.zqu__Description__c!=null &&
              this.zqu__Description__c.equals(other.getZqu__Description__c()))) &&
            ((this.zqu__FeatureName__c==null && other.getZqu__FeatureName__c()==null) || 
             (this.zqu__FeatureName__c!=null &&
              this.zqu__FeatureName__c.equals(other.getZqu__FeatureName__c()))) &&
            ((this.zqu__FeatureZuoraIdFormula__c==null && other.getZqu__FeatureZuoraIdFormula__c()==null) || 
             (this.zqu__FeatureZuoraIdFormula__c!=null &&
              this.zqu__FeatureZuoraIdFormula__c.equals(other.getZqu__FeatureZuoraIdFormula__c()))) &&
            ((this.zqu__FeatureZuoraId__c==null && other.getZqu__FeatureZuoraId__c()==null) || 
             (this.zqu__FeatureZuoraId__c!=null &&
              this.zqu__FeatureZuoraId__c.equals(other.getZqu__FeatureZuoraId__c()))) &&
            ((this.zqu__ProductRatePlanZuoraIdFormula__c==null && other.getZqu__ProductRatePlanZuoraIdFormula__c()==null) || 
             (this.zqu__ProductRatePlanZuoraIdFormula__c!=null &&
              this.zqu__ProductRatePlanZuoraIdFormula__c.equals(other.getZqu__ProductRatePlanZuoraIdFormula__c()))) &&
            ((this.zqu__ProductRatePlanZuoraId__c==null && other.getZqu__ProductRatePlanZuoraId__c()==null) || 
             (this.zqu__ProductRatePlanZuoraId__c!=null &&
              this.zqu__ProductRatePlanZuoraId__c.equals(other.getZqu__ProductRatePlanZuoraId__c()))) &&
            ((this.zqu__ProductRatePlan__c==null && other.getZqu__ProductRatePlan__c()==null) || 
             (this.zqu__ProductRatePlan__c!=null &&
              this.zqu__ProductRatePlan__c.equals(other.getZqu__ProductRatePlan__c()))) &&
            ((this.zqu__ProductRatePlan__r==null && other.getZqu__ProductRatePlan__r()==null) || 
             (this.zqu__ProductRatePlan__r!=null &&
              this.zqu__ProductRatePlan__r.equals(other.getZqu__ProductRatePlan__r()))) &&
            ((this.zqu__ProductZuoraIdFormula__c==null && other.getZqu__ProductZuoraIdFormula__c()==null) || 
             (this.zqu__ProductZuoraIdFormula__c!=null &&
              this.zqu__ProductZuoraIdFormula__c.equals(other.getZqu__ProductZuoraIdFormula__c()))) &&
            ((this.zqu__ProductZuoraId__c==null && other.getZqu__ProductZuoraId__c()==null) || 
             (this.zqu__ProductZuoraId__c!=null &&
              this.zqu__ProductZuoraId__c.equals(other.getZqu__ProductZuoraId__c()))) &&
            ((this.zqu__QuoteRatePlan__c==null && other.getZqu__QuoteRatePlan__c()==null) || 
             (this.zqu__QuoteRatePlan__c!=null &&
              this.zqu__QuoteRatePlan__c.equals(other.getZqu__QuoteRatePlan__c()))) &&
            ((this.zqu__QuoteRatePlan__r==null && other.getZqu__QuoteRatePlan__r()==null) || 
             (this.zqu__QuoteRatePlan__r!=null &&
              this.zqu__QuoteRatePlan__r.equals(other.getZqu__QuoteRatePlan__r()))) &&
            ((this.zqu__Quote__c==null && other.getZqu__Quote__c()==null) || 
             (this.zqu__Quote__c!=null &&
              this.zqu__Quote__c.equals(other.getZqu__Quote__c()))) &&
            ((this.zqu__Quote__r==null && other.getZqu__Quote__r()==null) || 
             (this.zqu__Quote__r!=null &&
              this.zqu__Quote__r.equals(other.getZqu__Quote__r()))) &&
            ((this.zqu__SubscriptionProductFeatureId__c==null && other.getZqu__SubscriptionProductFeatureId__c()==null) || 
             (this.zqu__SubscriptionProductFeatureId__c!=null &&
              this.zqu__SubscriptionProductFeatureId__c.equals(other.getZqu__SubscriptionProductFeatureId__c()))) &&
            ((this.zqu__ZFeature__c==null && other.getZqu__ZFeature__c()==null) || 
             (this.zqu__ZFeature__c!=null &&
              this.zqu__ZFeature__c.equals(other.getZqu__ZFeature__c()))) &&
            ((this.zqu__ZFeature__r==null && other.getZqu__ZFeature__r()==null) || 
             (this.zqu__ZFeature__r!=null &&
              this.zqu__ZFeature__r.equals(other.getZqu__ZFeature__r()))) &&
            ((this.zqu__ZProduct__c==null && other.getZqu__ZProduct__c()==null) || 
             (this.zqu__ZProduct__c!=null &&
              this.zqu__ZProduct__c.equals(other.getZqu__ZProduct__c()))) &&
            ((this.zqu__ZProduct__r==null && other.getZqu__ZProduct__r()==null) || 
             (this.zqu__ZProduct__r!=null &&
              this.zqu__ZProduct__r.equals(other.getZqu__ZProduct__r())));
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
        if (getZqu__ChargeGroupId__c() != null) {
            _hashCode += getZqu__ChargeGroupId__c().hashCode();
        }
        if (getZqu__Description__c() != null) {
            _hashCode += getZqu__Description__c().hashCode();
        }
        if (getZqu__FeatureName__c() != null) {
            _hashCode += getZqu__FeatureName__c().hashCode();
        }
        if (getZqu__FeatureZuoraIdFormula__c() != null) {
            _hashCode += getZqu__FeatureZuoraIdFormula__c().hashCode();
        }
        if (getZqu__FeatureZuoraId__c() != null) {
            _hashCode += getZqu__FeatureZuoraId__c().hashCode();
        }
        if (getZqu__ProductRatePlanZuoraIdFormula__c() != null) {
            _hashCode += getZqu__ProductRatePlanZuoraIdFormula__c().hashCode();
        }
        if (getZqu__ProductRatePlanZuoraId__c() != null) {
            _hashCode += getZqu__ProductRatePlanZuoraId__c().hashCode();
        }
        if (getZqu__ProductRatePlan__c() != null) {
            _hashCode += getZqu__ProductRatePlan__c().hashCode();
        }
        if (getZqu__ProductRatePlan__r() != null) {
            _hashCode += getZqu__ProductRatePlan__r().hashCode();
        }
        if (getZqu__ProductZuoraIdFormula__c() != null) {
            _hashCode += getZqu__ProductZuoraIdFormula__c().hashCode();
        }
        if (getZqu__ProductZuoraId__c() != null) {
            _hashCode += getZqu__ProductZuoraId__c().hashCode();
        }
        if (getZqu__QuoteRatePlan__c() != null) {
            _hashCode += getZqu__QuoteRatePlan__c().hashCode();
        }
        if (getZqu__QuoteRatePlan__r() != null) {
            _hashCode += getZqu__QuoteRatePlan__r().hashCode();
        }
        if (getZqu__Quote__c() != null) {
            _hashCode += getZqu__Quote__c().hashCode();
        }
        if (getZqu__Quote__r() != null) {
            _hashCode += getZqu__Quote__r().hashCode();
        }
        if (getZqu__SubscriptionProductFeatureId__c() != null) {
            _hashCode += getZqu__SubscriptionProductFeatureId__c().hashCode();
        }
        if (getZqu__ZFeature__c() != null) {
            _hashCode += getZqu__ZFeature__c().hashCode();
        }
        if (getZqu__ZFeature__r() != null) {
            _hashCode += getZqu__ZFeature__r().hashCode();
        }
        if (getZqu__ZProduct__c() != null) {
            _hashCode += getZqu__ZProduct__c().hashCode();
        }
        if (getZqu__ZProduct__r() != null) {
            _hashCode += getZqu__ZProduct__r().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Zqu__QuoteProductFeature__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__QuoteProductFeature__c"));
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
        elemField.setFieldName("zqu__ChargeGroupId__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ChargeGroupId__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("zqu__FeatureName__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__FeatureName__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__FeatureZuoraIdFormula__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__FeatureZuoraIdFormula__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__FeatureZuoraId__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__FeatureZuoraId__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__ProductRatePlanZuoraIdFormula__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ProductRatePlanZuoraIdFormula__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__ProductRatePlanZuoraId__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ProductRatePlanZuoraId__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__ProductRatePlan__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ProductRatePlan__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__ProductRatePlan__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ProductRatePlan__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ProductRatePlan__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__ProductZuoraIdFormula__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ProductZuoraIdFormula__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__ProductZuoraId__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ProductZuoraId__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__QuoteRatePlan__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__QuoteRatePlan__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__QuoteRatePlan__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__QuoteRatePlan__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__QuoteRatePlan__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Quote__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Quote__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Quote__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Quote__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Quote__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__SubscriptionProductFeatureId__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__SubscriptionProductFeatureId__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__ZFeature__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ZFeature__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__ZFeature__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ZFeature__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ZFeature__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__ZProduct__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ZProduct__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__ZProduct__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ZProduct__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ZProduct__c"));
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
