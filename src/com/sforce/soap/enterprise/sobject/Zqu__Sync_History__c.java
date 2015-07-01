/**
 * Zqu__Sync_History__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Zqu__Sync_History__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
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

    private java.lang.String zqu__External_Id__c;

    private java.lang.String zqu__Failure_Log__c;

    private java.util.Calendar zqu__Finished_On__c;

    private java.lang.Boolean zqu__Is_Async__c;

    private java.lang.Boolean zqu__Is_Cancel__c;

    private java.lang.Boolean zqu__Is_Incremental__c;

    private java.lang.Boolean zqu__Is_Success__c;

    private java.lang.String zqu__Job_State_Id__c;

    private java.lang.String zqu__Process_For_CrmId_Change__c;

    private java.lang.String zqu__Sync_By__c;

    private java.lang.String zqu__Sync_Error__c;

    private java.util.Calendar zqu__Sync_On__c;

    private java.lang.String zqu__Sync_Target__c;

    private java.lang.String zqu__Sync_To__c;

    private java.lang.String zqu__Target_Id__c;

    private java.lang.String zqu__Tenant_Id__c;

    private java.lang.String zqu__Zuora_Hostname__c;

    public Zqu__Sync_History__c() {
    }

    public Zqu__Sync_History__c(
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
           java.lang.String zqu__External_Id__c,
           java.lang.String zqu__Failure_Log__c,
           java.util.Calendar zqu__Finished_On__c,
           java.lang.Boolean zqu__Is_Async__c,
           java.lang.Boolean zqu__Is_Cancel__c,
           java.lang.Boolean zqu__Is_Incremental__c,
           java.lang.Boolean zqu__Is_Success__c,
           java.lang.String zqu__Job_State_Id__c,
           java.lang.String zqu__Process_For_CrmId_Change__c,
           java.lang.String zqu__Sync_By__c,
           java.lang.String zqu__Sync_Error__c,
           java.util.Calendar zqu__Sync_On__c,
           java.lang.String zqu__Sync_Target__c,
           java.lang.String zqu__Sync_To__c,
           java.lang.String zqu__Target_Id__c,
           java.lang.String zqu__Tenant_Id__c,
           java.lang.String zqu__Zuora_Hostname__c) {
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
        this.zqu__External_Id__c = zqu__External_Id__c;
        this.zqu__Failure_Log__c = zqu__Failure_Log__c;
        this.zqu__Finished_On__c = zqu__Finished_On__c;
        this.zqu__Is_Async__c = zqu__Is_Async__c;
        this.zqu__Is_Cancel__c = zqu__Is_Cancel__c;
        this.zqu__Is_Incremental__c = zqu__Is_Incremental__c;
        this.zqu__Is_Success__c = zqu__Is_Success__c;
        this.zqu__Job_State_Id__c = zqu__Job_State_Id__c;
        this.zqu__Process_For_CrmId_Change__c = zqu__Process_For_CrmId_Change__c;
        this.zqu__Sync_By__c = zqu__Sync_By__c;
        this.zqu__Sync_Error__c = zqu__Sync_Error__c;
        this.zqu__Sync_On__c = zqu__Sync_On__c;
        this.zqu__Sync_Target__c = zqu__Sync_Target__c;
        this.zqu__Sync_To__c = zqu__Sync_To__c;
        this.zqu__Target_Id__c = zqu__Target_Id__c;
        this.zqu__Tenant_Id__c = zqu__Tenant_Id__c;
        this.zqu__Zuora_Hostname__c = zqu__Zuora_Hostname__c;
    }


    /**
     * Gets the attachedContentDocuments value for this Zqu__Sync_History__c.
     * 
     * @return attachedContentDocuments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachedContentDocuments() {
        return attachedContentDocuments;
    }


    /**
     * Sets the attachedContentDocuments value for this Zqu__Sync_History__c.
     * 
     * @param attachedContentDocuments
     */
    public void setAttachedContentDocuments(com.sforce.soap.enterprise.QueryResult attachedContentDocuments) {
        this.attachedContentDocuments = attachedContentDocuments;
    }


    /**
     * Gets the attachments value for this Zqu__Sync_History__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Zqu__Sync_History__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the combinedAttachments value for this Zqu__Sync_History__c.
     * 
     * @return combinedAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getCombinedAttachments() {
        return combinedAttachments;
    }


    /**
     * Sets the combinedAttachments value for this Zqu__Sync_History__c.
     * 
     * @param combinedAttachments
     */
    public void setCombinedAttachments(com.sforce.soap.enterprise.QueryResult combinedAttachments) {
        this.combinedAttachments = combinedAttachments;
    }


    /**
     * Gets the createdBy value for this Zqu__Sync_History__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Zqu__Sync_History__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Zqu__Sync_History__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Zqu__Sync_History__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Zqu__Sync_History__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Zqu__Sync_History__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the duplicateRecordItems value for this Zqu__Sync_History__c.
     * 
     * @return duplicateRecordItems
     */
    public com.sforce.soap.enterprise.QueryResult getDuplicateRecordItems() {
        return duplicateRecordItems;
    }


    /**
     * Sets the duplicateRecordItems value for this Zqu__Sync_History__c.
     * 
     * @param duplicateRecordItems
     */
    public void setDuplicateRecordItems(com.sforce.soap.enterprise.QueryResult duplicateRecordItems) {
        this.duplicateRecordItems = duplicateRecordItems;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Zqu__Sync_History__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Zqu__Sync_History__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the isDeleted value for this Zqu__Sync_History__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Zqu__Sync_History__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this Zqu__Sync_History__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Zqu__Sync_History__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Zqu__Sync_History__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Zqu__Sync_History__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Zqu__Sync_History__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Zqu__Sync_History__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lookedUpFromActivities value for this Zqu__Sync_History__c.
     * 
     * @return lookedUpFromActivities
     */
    public com.sforce.soap.enterprise.QueryResult getLookedUpFromActivities() {
        return lookedUpFromActivities;
    }


    /**
     * Sets the lookedUpFromActivities value for this Zqu__Sync_History__c.
     * 
     * @param lookedUpFromActivities
     */
    public void setLookedUpFromActivities(com.sforce.soap.enterprise.QueryResult lookedUpFromActivities) {
        this.lookedUpFromActivities = lookedUpFromActivities;
    }


    /**
     * Gets the name value for this Zqu__Sync_History__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Zqu__Sync_History__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Zqu__Sync_History__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Zqu__Sync_History__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Zqu__Sync_History__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Zqu__Sync_History__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the owner value for this Zqu__Sync_History__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.SObject getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Zqu__Sync_History__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.SObject owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Zqu__Sync_History__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Zqu__Sync_History__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the processInstances value for this Zqu__Sync_History__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Zqu__Sync_History__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Zqu__Sync_History__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Zqu__Sync_History__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the recordAssociatedGroups value for this Zqu__Sync_History__c.
     * 
     * @return recordAssociatedGroups
     */
    public com.sforce.soap.enterprise.QueryResult getRecordAssociatedGroups() {
        return recordAssociatedGroups;
    }


    /**
     * Sets the recordAssociatedGroups value for this Zqu__Sync_History__c.
     * 
     * @param recordAssociatedGroups
     */
    public void setRecordAssociatedGroups(com.sforce.soap.enterprise.QueryResult recordAssociatedGroups) {
        this.recordAssociatedGroups = recordAssociatedGroups;
    }


    /**
     * Gets the systemModstamp value for this Zqu__Sync_History__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Zqu__Sync_History__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the topicAssignments value for this Zqu__Sync_History__c.
     * 
     * @return topicAssignments
     */
    public com.sforce.soap.enterprise.QueryResult getTopicAssignments() {
        return topicAssignments;
    }


    /**
     * Sets the topicAssignments value for this Zqu__Sync_History__c.
     * 
     * @param topicAssignments
     */
    public void setTopicAssignments(com.sforce.soap.enterprise.QueryResult topicAssignments) {
        this.topicAssignments = topicAssignments;
    }


    /**
     * Gets the userRecordAccess value for this Zqu__Sync_History__c.
     * 
     * @return userRecordAccess
     */
    public com.sforce.soap.enterprise.sobject.UserRecordAccess getUserRecordAccess() {
        return userRecordAccess;
    }


    /**
     * Sets the userRecordAccess value for this Zqu__Sync_History__c.
     * 
     * @param userRecordAccess
     */
    public void setUserRecordAccess(com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess) {
        this.userRecordAccess = userRecordAccess;
    }


    /**
     * Gets the zqu__External_Id__c value for this Zqu__Sync_History__c.
     * 
     * @return zqu__External_Id__c
     */
    public java.lang.String getZqu__External_Id__c() {
        return zqu__External_Id__c;
    }


    /**
     * Sets the zqu__External_Id__c value for this Zqu__Sync_History__c.
     * 
     * @param zqu__External_Id__c
     */
    public void setZqu__External_Id__c(java.lang.String zqu__External_Id__c) {
        this.zqu__External_Id__c = zqu__External_Id__c;
    }


    /**
     * Gets the zqu__Failure_Log__c value for this Zqu__Sync_History__c.
     * 
     * @return zqu__Failure_Log__c
     */
    public java.lang.String getZqu__Failure_Log__c() {
        return zqu__Failure_Log__c;
    }


    /**
     * Sets the zqu__Failure_Log__c value for this Zqu__Sync_History__c.
     * 
     * @param zqu__Failure_Log__c
     */
    public void setZqu__Failure_Log__c(java.lang.String zqu__Failure_Log__c) {
        this.zqu__Failure_Log__c = zqu__Failure_Log__c;
    }


    /**
     * Gets the zqu__Finished_On__c value for this Zqu__Sync_History__c.
     * 
     * @return zqu__Finished_On__c
     */
    public java.util.Calendar getZqu__Finished_On__c() {
        return zqu__Finished_On__c;
    }


    /**
     * Sets the zqu__Finished_On__c value for this Zqu__Sync_History__c.
     * 
     * @param zqu__Finished_On__c
     */
    public void setZqu__Finished_On__c(java.util.Calendar zqu__Finished_On__c) {
        this.zqu__Finished_On__c = zqu__Finished_On__c;
    }


    /**
     * Gets the zqu__Is_Async__c value for this Zqu__Sync_History__c.
     * 
     * @return zqu__Is_Async__c
     */
    public java.lang.Boolean getZqu__Is_Async__c() {
        return zqu__Is_Async__c;
    }


    /**
     * Sets the zqu__Is_Async__c value for this Zqu__Sync_History__c.
     * 
     * @param zqu__Is_Async__c
     */
    public void setZqu__Is_Async__c(java.lang.Boolean zqu__Is_Async__c) {
        this.zqu__Is_Async__c = zqu__Is_Async__c;
    }


    /**
     * Gets the zqu__Is_Cancel__c value for this Zqu__Sync_History__c.
     * 
     * @return zqu__Is_Cancel__c
     */
    public java.lang.Boolean getZqu__Is_Cancel__c() {
        return zqu__Is_Cancel__c;
    }


    /**
     * Sets the zqu__Is_Cancel__c value for this Zqu__Sync_History__c.
     * 
     * @param zqu__Is_Cancel__c
     */
    public void setZqu__Is_Cancel__c(java.lang.Boolean zqu__Is_Cancel__c) {
        this.zqu__Is_Cancel__c = zqu__Is_Cancel__c;
    }


    /**
     * Gets the zqu__Is_Incremental__c value for this Zqu__Sync_History__c.
     * 
     * @return zqu__Is_Incremental__c
     */
    public java.lang.Boolean getZqu__Is_Incremental__c() {
        return zqu__Is_Incremental__c;
    }


    /**
     * Sets the zqu__Is_Incremental__c value for this Zqu__Sync_History__c.
     * 
     * @param zqu__Is_Incremental__c
     */
    public void setZqu__Is_Incremental__c(java.lang.Boolean zqu__Is_Incremental__c) {
        this.zqu__Is_Incremental__c = zqu__Is_Incremental__c;
    }


    /**
     * Gets the zqu__Is_Success__c value for this Zqu__Sync_History__c.
     * 
     * @return zqu__Is_Success__c
     */
    public java.lang.Boolean getZqu__Is_Success__c() {
        return zqu__Is_Success__c;
    }


    /**
     * Sets the zqu__Is_Success__c value for this Zqu__Sync_History__c.
     * 
     * @param zqu__Is_Success__c
     */
    public void setZqu__Is_Success__c(java.lang.Boolean zqu__Is_Success__c) {
        this.zqu__Is_Success__c = zqu__Is_Success__c;
    }


    /**
     * Gets the zqu__Job_State_Id__c value for this Zqu__Sync_History__c.
     * 
     * @return zqu__Job_State_Id__c
     */
    public java.lang.String getZqu__Job_State_Id__c() {
        return zqu__Job_State_Id__c;
    }


    /**
     * Sets the zqu__Job_State_Id__c value for this Zqu__Sync_History__c.
     * 
     * @param zqu__Job_State_Id__c
     */
    public void setZqu__Job_State_Id__c(java.lang.String zqu__Job_State_Id__c) {
        this.zqu__Job_State_Id__c = zqu__Job_State_Id__c;
    }


    /**
     * Gets the zqu__Process_For_CrmId_Change__c value for this Zqu__Sync_History__c.
     * 
     * @return zqu__Process_For_CrmId_Change__c
     */
    public java.lang.String getZqu__Process_For_CrmId_Change__c() {
        return zqu__Process_For_CrmId_Change__c;
    }


    /**
     * Sets the zqu__Process_For_CrmId_Change__c value for this Zqu__Sync_History__c.
     * 
     * @param zqu__Process_For_CrmId_Change__c
     */
    public void setZqu__Process_For_CrmId_Change__c(java.lang.String zqu__Process_For_CrmId_Change__c) {
        this.zqu__Process_For_CrmId_Change__c = zqu__Process_For_CrmId_Change__c;
    }


    /**
     * Gets the zqu__Sync_By__c value for this Zqu__Sync_History__c.
     * 
     * @return zqu__Sync_By__c
     */
    public java.lang.String getZqu__Sync_By__c() {
        return zqu__Sync_By__c;
    }


    /**
     * Sets the zqu__Sync_By__c value for this Zqu__Sync_History__c.
     * 
     * @param zqu__Sync_By__c
     */
    public void setZqu__Sync_By__c(java.lang.String zqu__Sync_By__c) {
        this.zqu__Sync_By__c = zqu__Sync_By__c;
    }


    /**
     * Gets the zqu__Sync_Error__c value for this Zqu__Sync_History__c.
     * 
     * @return zqu__Sync_Error__c
     */
    public java.lang.String getZqu__Sync_Error__c() {
        return zqu__Sync_Error__c;
    }


    /**
     * Sets the zqu__Sync_Error__c value for this Zqu__Sync_History__c.
     * 
     * @param zqu__Sync_Error__c
     */
    public void setZqu__Sync_Error__c(java.lang.String zqu__Sync_Error__c) {
        this.zqu__Sync_Error__c = zqu__Sync_Error__c;
    }


    /**
     * Gets the zqu__Sync_On__c value for this Zqu__Sync_History__c.
     * 
     * @return zqu__Sync_On__c
     */
    public java.util.Calendar getZqu__Sync_On__c() {
        return zqu__Sync_On__c;
    }


    /**
     * Sets the zqu__Sync_On__c value for this Zqu__Sync_History__c.
     * 
     * @param zqu__Sync_On__c
     */
    public void setZqu__Sync_On__c(java.util.Calendar zqu__Sync_On__c) {
        this.zqu__Sync_On__c = zqu__Sync_On__c;
    }


    /**
     * Gets the zqu__Sync_Target__c value for this Zqu__Sync_History__c.
     * 
     * @return zqu__Sync_Target__c
     */
    public java.lang.String getZqu__Sync_Target__c() {
        return zqu__Sync_Target__c;
    }


    /**
     * Sets the zqu__Sync_Target__c value for this Zqu__Sync_History__c.
     * 
     * @param zqu__Sync_Target__c
     */
    public void setZqu__Sync_Target__c(java.lang.String zqu__Sync_Target__c) {
        this.zqu__Sync_Target__c = zqu__Sync_Target__c;
    }


    /**
     * Gets the zqu__Sync_To__c value for this Zqu__Sync_History__c.
     * 
     * @return zqu__Sync_To__c
     */
    public java.lang.String getZqu__Sync_To__c() {
        return zqu__Sync_To__c;
    }


    /**
     * Sets the zqu__Sync_To__c value for this Zqu__Sync_History__c.
     * 
     * @param zqu__Sync_To__c
     */
    public void setZqu__Sync_To__c(java.lang.String zqu__Sync_To__c) {
        this.zqu__Sync_To__c = zqu__Sync_To__c;
    }


    /**
     * Gets the zqu__Target_Id__c value for this Zqu__Sync_History__c.
     * 
     * @return zqu__Target_Id__c
     */
    public java.lang.String getZqu__Target_Id__c() {
        return zqu__Target_Id__c;
    }


    /**
     * Sets the zqu__Target_Id__c value for this Zqu__Sync_History__c.
     * 
     * @param zqu__Target_Id__c
     */
    public void setZqu__Target_Id__c(java.lang.String zqu__Target_Id__c) {
        this.zqu__Target_Id__c = zqu__Target_Id__c;
    }


    /**
     * Gets the zqu__Tenant_Id__c value for this Zqu__Sync_History__c.
     * 
     * @return zqu__Tenant_Id__c
     */
    public java.lang.String getZqu__Tenant_Id__c() {
        return zqu__Tenant_Id__c;
    }


    /**
     * Sets the zqu__Tenant_Id__c value for this Zqu__Sync_History__c.
     * 
     * @param zqu__Tenant_Id__c
     */
    public void setZqu__Tenant_Id__c(java.lang.String zqu__Tenant_Id__c) {
        this.zqu__Tenant_Id__c = zqu__Tenant_Id__c;
    }


    /**
     * Gets the zqu__Zuora_Hostname__c value for this Zqu__Sync_History__c.
     * 
     * @return zqu__Zuora_Hostname__c
     */
    public java.lang.String getZqu__Zuora_Hostname__c() {
        return zqu__Zuora_Hostname__c;
    }


    /**
     * Sets the zqu__Zuora_Hostname__c value for this Zqu__Sync_History__c.
     * 
     * @param zqu__Zuora_Hostname__c
     */
    public void setZqu__Zuora_Hostname__c(java.lang.String zqu__Zuora_Hostname__c) {
        this.zqu__Zuora_Hostname__c = zqu__Zuora_Hostname__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Zqu__Sync_History__c)) return false;
        Zqu__Sync_History__c other = (Zqu__Sync_History__c) obj;
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
            ((this.zqu__External_Id__c==null && other.getZqu__External_Id__c()==null) || 
             (this.zqu__External_Id__c!=null &&
              this.zqu__External_Id__c.equals(other.getZqu__External_Id__c()))) &&
            ((this.zqu__Failure_Log__c==null && other.getZqu__Failure_Log__c()==null) || 
             (this.zqu__Failure_Log__c!=null &&
              this.zqu__Failure_Log__c.equals(other.getZqu__Failure_Log__c()))) &&
            ((this.zqu__Finished_On__c==null && other.getZqu__Finished_On__c()==null) || 
             (this.zqu__Finished_On__c!=null &&
              this.zqu__Finished_On__c.equals(other.getZqu__Finished_On__c()))) &&
            ((this.zqu__Is_Async__c==null && other.getZqu__Is_Async__c()==null) || 
             (this.zqu__Is_Async__c!=null &&
              this.zqu__Is_Async__c.equals(other.getZqu__Is_Async__c()))) &&
            ((this.zqu__Is_Cancel__c==null && other.getZqu__Is_Cancel__c()==null) || 
             (this.zqu__Is_Cancel__c!=null &&
              this.zqu__Is_Cancel__c.equals(other.getZqu__Is_Cancel__c()))) &&
            ((this.zqu__Is_Incremental__c==null && other.getZqu__Is_Incremental__c()==null) || 
             (this.zqu__Is_Incremental__c!=null &&
              this.zqu__Is_Incremental__c.equals(other.getZqu__Is_Incremental__c()))) &&
            ((this.zqu__Is_Success__c==null && other.getZqu__Is_Success__c()==null) || 
             (this.zqu__Is_Success__c!=null &&
              this.zqu__Is_Success__c.equals(other.getZqu__Is_Success__c()))) &&
            ((this.zqu__Job_State_Id__c==null && other.getZqu__Job_State_Id__c()==null) || 
             (this.zqu__Job_State_Id__c!=null &&
              this.zqu__Job_State_Id__c.equals(other.getZqu__Job_State_Id__c()))) &&
            ((this.zqu__Process_For_CrmId_Change__c==null && other.getZqu__Process_For_CrmId_Change__c()==null) || 
             (this.zqu__Process_For_CrmId_Change__c!=null &&
              this.zqu__Process_For_CrmId_Change__c.equals(other.getZqu__Process_For_CrmId_Change__c()))) &&
            ((this.zqu__Sync_By__c==null && other.getZqu__Sync_By__c()==null) || 
             (this.zqu__Sync_By__c!=null &&
              this.zqu__Sync_By__c.equals(other.getZqu__Sync_By__c()))) &&
            ((this.zqu__Sync_Error__c==null && other.getZqu__Sync_Error__c()==null) || 
             (this.zqu__Sync_Error__c!=null &&
              this.zqu__Sync_Error__c.equals(other.getZqu__Sync_Error__c()))) &&
            ((this.zqu__Sync_On__c==null && other.getZqu__Sync_On__c()==null) || 
             (this.zqu__Sync_On__c!=null &&
              this.zqu__Sync_On__c.equals(other.getZqu__Sync_On__c()))) &&
            ((this.zqu__Sync_Target__c==null && other.getZqu__Sync_Target__c()==null) || 
             (this.zqu__Sync_Target__c!=null &&
              this.zqu__Sync_Target__c.equals(other.getZqu__Sync_Target__c()))) &&
            ((this.zqu__Sync_To__c==null && other.getZqu__Sync_To__c()==null) || 
             (this.zqu__Sync_To__c!=null &&
              this.zqu__Sync_To__c.equals(other.getZqu__Sync_To__c()))) &&
            ((this.zqu__Target_Id__c==null && other.getZqu__Target_Id__c()==null) || 
             (this.zqu__Target_Id__c!=null &&
              this.zqu__Target_Id__c.equals(other.getZqu__Target_Id__c()))) &&
            ((this.zqu__Tenant_Id__c==null && other.getZqu__Tenant_Id__c()==null) || 
             (this.zqu__Tenant_Id__c!=null &&
              this.zqu__Tenant_Id__c.equals(other.getZqu__Tenant_Id__c()))) &&
            ((this.zqu__Zuora_Hostname__c==null && other.getZqu__Zuora_Hostname__c()==null) || 
             (this.zqu__Zuora_Hostname__c!=null &&
              this.zqu__Zuora_Hostname__c.equals(other.getZqu__Zuora_Hostname__c())));
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
        if (getZqu__External_Id__c() != null) {
            _hashCode += getZqu__External_Id__c().hashCode();
        }
        if (getZqu__Failure_Log__c() != null) {
            _hashCode += getZqu__Failure_Log__c().hashCode();
        }
        if (getZqu__Finished_On__c() != null) {
            _hashCode += getZqu__Finished_On__c().hashCode();
        }
        if (getZqu__Is_Async__c() != null) {
            _hashCode += getZqu__Is_Async__c().hashCode();
        }
        if (getZqu__Is_Cancel__c() != null) {
            _hashCode += getZqu__Is_Cancel__c().hashCode();
        }
        if (getZqu__Is_Incremental__c() != null) {
            _hashCode += getZqu__Is_Incremental__c().hashCode();
        }
        if (getZqu__Is_Success__c() != null) {
            _hashCode += getZqu__Is_Success__c().hashCode();
        }
        if (getZqu__Job_State_Id__c() != null) {
            _hashCode += getZqu__Job_State_Id__c().hashCode();
        }
        if (getZqu__Process_For_CrmId_Change__c() != null) {
            _hashCode += getZqu__Process_For_CrmId_Change__c().hashCode();
        }
        if (getZqu__Sync_By__c() != null) {
            _hashCode += getZqu__Sync_By__c().hashCode();
        }
        if (getZqu__Sync_Error__c() != null) {
            _hashCode += getZqu__Sync_Error__c().hashCode();
        }
        if (getZqu__Sync_On__c() != null) {
            _hashCode += getZqu__Sync_On__c().hashCode();
        }
        if (getZqu__Sync_Target__c() != null) {
            _hashCode += getZqu__Sync_Target__c().hashCode();
        }
        if (getZqu__Sync_To__c() != null) {
            _hashCode += getZqu__Sync_To__c().hashCode();
        }
        if (getZqu__Target_Id__c() != null) {
            _hashCode += getZqu__Target_Id__c().hashCode();
        }
        if (getZqu__Tenant_Id__c() != null) {
            _hashCode += getZqu__Tenant_Id__c().hashCode();
        }
        if (getZqu__Zuora_Hostname__c() != null) {
            _hashCode += getZqu__Zuora_Hostname__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Zqu__Sync_History__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Sync_History__c"));
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
        elemField.setFieldName("zqu__External_Id__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__External_Id__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Failure_Log__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Failure_Log__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Finished_On__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Finished_On__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Is_Async__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Is_Async__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Is_Cancel__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Is_Cancel__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Is_Incremental__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Is_Incremental__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Is_Success__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Is_Success__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Job_State_Id__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Job_State_Id__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Process_For_CrmId_Change__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Process_For_CrmId_Change__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Sync_By__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Sync_By__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Sync_Error__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Sync_Error__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Sync_On__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Sync_On__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Sync_Target__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Sync_Target__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Sync_To__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Sync_To__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Target_Id__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Target_Id__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Tenant_Id__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Tenant_Id__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__Zuora_Hostname__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__Zuora_Hostname__c"));
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
