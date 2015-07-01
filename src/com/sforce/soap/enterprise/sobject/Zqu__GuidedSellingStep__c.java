/**
 * Zqu__GuidedSellingStep__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Zqu__GuidedSellingStep__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
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

    private java.lang.Boolean zqu__FilterProductCatalog__c;

    private com.sforce.soap.enterprise.QueryResult zqu__GuidedSellingParts__r;

    private java.lang.Boolean zqu__IncludeCategoryNavigation__c;

    private java.lang.Boolean zqu__IncludeContextFilters__c;

    private java.lang.Boolean zqu__IncludeSearchBox__c;

    private java.lang.Boolean zqu__IncludeUserFilters__c;

    private com.sforce.soap.enterprise.QueryResult zqu__PartToFilterMap__r;

    private java.lang.String zqu__ProductContextFieldName__c;

    private java.lang.String zqu__ProductContext__c;

    private java.lang.String zqu__StepTitle__c;

    private com.sforce.soap.enterprise.QueryResult zqu__StepToFlowMaps__r;

    private java.lang.String zqu__ZFilter__c;

    private com.sforce.soap.enterprise.sobject.Zqu__ZFilter__c zqu__ZFilter__r;

    private java.lang.String zqu__ZList__c;

    private com.sforce.soap.enterprise.sobject.Zqu__ZList__c zqu__ZList__r;

    public Zqu__GuidedSellingStep__c() {
    }

    public Zqu__GuidedSellingStep__c(
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
           java.lang.Boolean zqu__FilterProductCatalog__c,
           com.sforce.soap.enterprise.QueryResult zqu__GuidedSellingParts__r,
           java.lang.Boolean zqu__IncludeCategoryNavigation__c,
           java.lang.Boolean zqu__IncludeContextFilters__c,
           java.lang.Boolean zqu__IncludeSearchBox__c,
           java.lang.Boolean zqu__IncludeUserFilters__c,
           com.sforce.soap.enterprise.QueryResult zqu__PartToFilterMap__r,
           java.lang.String zqu__ProductContextFieldName__c,
           java.lang.String zqu__ProductContext__c,
           java.lang.String zqu__StepTitle__c,
           com.sforce.soap.enterprise.QueryResult zqu__StepToFlowMaps__r,
           java.lang.String zqu__ZFilter__c,
           com.sforce.soap.enterprise.sobject.Zqu__ZFilter__c zqu__ZFilter__r,
           java.lang.String zqu__ZList__c,
           com.sforce.soap.enterprise.sobject.Zqu__ZList__c zqu__ZList__r) {
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
        this.zqu__FilterProductCatalog__c = zqu__FilterProductCatalog__c;
        this.zqu__GuidedSellingParts__r = zqu__GuidedSellingParts__r;
        this.zqu__IncludeCategoryNavigation__c = zqu__IncludeCategoryNavigation__c;
        this.zqu__IncludeContextFilters__c = zqu__IncludeContextFilters__c;
        this.zqu__IncludeSearchBox__c = zqu__IncludeSearchBox__c;
        this.zqu__IncludeUserFilters__c = zqu__IncludeUserFilters__c;
        this.zqu__PartToFilterMap__r = zqu__PartToFilterMap__r;
        this.zqu__ProductContextFieldName__c = zqu__ProductContextFieldName__c;
        this.zqu__ProductContext__c = zqu__ProductContext__c;
        this.zqu__StepTitle__c = zqu__StepTitle__c;
        this.zqu__StepToFlowMaps__r = zqu__StepToFlowMaps__r;
        this.zqu__ZFilter__c = zqu__ZFilter__c;
        this.zqu__ZFilter__r = zqu__ZFilter__r;
        this.zqu__ZList__c = zqu__ZList__c;
        this.zqu__ZList__r = zqu__ZList__r;
    }


    /**
     * Gets the attachedContentDocuments value for this Zqu__GuidedSellingStep__c.
     * 
     * @return attachedContentDocuments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachedContentDocuments() {
        return attachedContentDocuments;
    }


    /**
     * Sets the attachedContentDocuments value for this Zqu__GuidedSellingStep__c.
     * 
     * @param attachedContentDocuments
     */
    public void setAttachedContentDocuments(com.sforce.soap.enterprise.QueryResult attachedContentDocuments) {
        this.attachedContentDocuments = attachedContentDocuments;
    }


    /**
     * Gets the attachments value for this Zqu__GuidedSellingStep__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Zqu__GuidedSellingStep__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the combinedAttachments value for this Zqu__GuidedSellingStep__c.
     * 
     * @return combinedAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getCombinedAttachments() {
        return combinedAttachments;
    }


    /**
     * Sets the combinedAttachments value for this Zqu__GuidedSellingStep__c.
     * 
     * @param combinedAttachments
     */
    public void setCombinedAttachments(com.sforce.soap.enterprise.QueryResult combinedAttachments) {
        this.combinedAttachments = combinedAttachments;
    }


    /**
     * Gets the createdBy value for this Zqu__GuidedSellingStep__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Zqu__GuidedSellingStep__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Zqu__GuidedSellingStep__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Zqu__GuidedSellingStep__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Zqu__GuidedSellingStep__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Zqu__GuidedSellingStep__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the duplicateRecordItems value for this Zqu__GuidedSellingStep__c.
     * 
     * @return duplicateRecordItems
     */
    public com.sforce.soap.enterprise.QueryResult getDuplicateRecordItems() {
        return duplicateRecordItems;
    }


    /**
     * Sets the duplicateRecordItems value for this Zqu__GuidedSellingStep__c.
     * 
     * @param duplicateRecordItems
     */
    public void setDuplicateRecordItems(com.sforce.soap.enterprise.QueryResult duplicateRecordItems) {
        this.duplicateRecordItems = duplicateRecordItems;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Zqu__GuidedSellingStep__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Zqu__GuidedSellingStep__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the isDeleted value for this Zqu__GuidedSellingStep__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Zqu__GuidedSellingStep__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this Zqu__GuidedSellingStep__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Zqu__GuidedSellingStep__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Zqu__GuidedSellingStep__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Zqu__GuidedSellingStep__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Zqu__GuidedSellingStep__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Zqu__GuidedSellingStep__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lookedUpFromActivities value for this Zqu__GuidedSellingStep__c.
     * 
     * @return lookedUpFromActivities
     */
    public com.sforce.soap.enterprise.QueryResult getLookedUpFromActivities() {
        return lookedUpFromActivities;
    }


    /**
     * Sets the lookedUpFromActivities value for this Zqu__GuidedSellingStep__c.
     * 
     * @param lookedUpFromActivities
     */
    public void setLookedUpFromActivities(com.sforce.soap.enterprise.QueryResult lookedUpFromActivities) {
        this.lookedUpFromActivities = lookedUpFromActivities;
    }


    /**
     * Gets the name value for this Zqu__GuidedSellingStep__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Zqu__GuidedSellingStep__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Zqu__GuidedSellingStep__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Zqu__GuidedSellingStep__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Zqu__GuidedSellingStep__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Zqu__GuidedSellingStep__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the owner value for this Zqu__GuidedSellingStep__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.SObject getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Zqu__GuidedSellingStep__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.SObject owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Zqu__GuidedSellingStep__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Zqu__GuidedSellingStep__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the processInstances value for this Zqu__GuidedSellingStep__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Zqu__GuidedSellingStep__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Zqu__GuidedSellingStep__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Zqu__GuidedSellingStep__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the recordAssociatedGroups value for this Zqu__GuidedSellingStep__c.
     * 
     * @return recordAssociatedGroups
     */
    public com.sforce.soap.enterprise.QueryResult getRecordAssociatedGroups() {
        return recordAssociatedGroups;
    }


    /**
     * Sets the recordAssociatedGroups value for this Zqu__GuidedSellingStep__c.
     * 
     * @param recordAssociatedGroups
     */
    public void setRecordAssociatedGroups(com.sforce.soap.enterprise.QueryResult recordAssociatedGroups) {
        this.recordAssociatedGroups = recordAssociatedGroups;
    }


    /**
     * Gets the systemModstamp value for this Zqu__GuidedSellingStep__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Zqu__GuidedSellingStep__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the topicAssignments value for this Zqu__GuidedSellingStep__c.
     * 
     * @return topicAssignments
     */
    public com.sforce.soap.enterprise.QueryResult getTopicAssignments() {
        return topicAssignments;
    }


    /**
     * Sets the topicAssignments value for this Zqu__GuidedSellingStep__c.
     * 
     * @param topicAssignments
     */
    public void setTopicAssignments(com.sforce.soap.enterprise.QueryResult topicAssignments) {
        this.topicAssignments = topicAssignments;
    }


    /**
     * Gets the userRecordAccess value for this Zqu__GuidedSellingStep__c.
     * 
     * @return userRecordAccess
     */
    public com.sforce.soap.enterprise.sobject.UserRecordAccess getUserRecordAccess() {
        return userRecordAccess;
    }


    /**
     * Sets the userRecordAccess value for this Zqu__GuidedSellingStep__c.
     * 
     * @param userRecordAccess
     */
    public void setUserRecordAccess(com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess) {
        this.userRecordAccess = userRecordAccess;
    }


    /**
     * Gets the zqu__FilterProductCatalog__c value for this Zqu__GuidedSellingStep__c.
     * 
     * @return zqu__FilterProductCatalog__c
     */
    public java.lang.Boolean getZqu__FilterProductCatalog__c() {
        return zqu__FilterProductCatalog__c;
    }


    /**
     * Sets the zqu__FilterProductCatalog__c value for this Zqu__GuidedSellingStep__c.
     * 
     * @param zqu__FilterProductCatalog__c
     */
    public void setZqu__FilterProductCatalog__c(java.lang.Boolean zqu__FilterProductCatalog__c) {
        this.zqu__FilterProductCatalog__c = zqu__FilterProductCatalog__c;
    }


    /**
     * Gets the zqu__GuidedSellingParts__r value for this Zqu__GuidedSellingStep__c.
     * 
     * @return zqu__GuidedSellingParts__r
     */
    public com.sforce.soap.enterprise.QueryResult getZqu__GuidedSellingParts__r() {
        return zqu__GuidedSellingParts__r;
    }


    /**
     * Sets the zqu__GuidedSellingParts__r value for this Zqu__GuidedSellingStep__c.
     * 
     * @param zqu__GuidedSellingParts__r
     */
    public void setZqu__GuidedSellingParts__r(com.sforce.soap.enterprise.QueryResult zqu__GuidedSellingParts__r) {
        this.zqu__GuidedSellingParts__r = zqu__GuidedSellingParts__r;
    }


    /**
     * Gets the zqu__IncludeCategoryNavigation__c value for this Zqu__GuidedSellingStep__c.
     * 
     * @return zqu__IncludeCategoryNavigation__c
     */
    public java.lang.Boolean getZqu__IncludeCategoryNavigation__c() {
        return zqu__IncludeCategoryNavigation__c;
    }


    /**
     * Sets the zqu__IncludeCategoryNavigation__c value for this Zqu__GuidedSellingStep__c.
     * 
     * @param zqu__IncludeCategoryNavigation__c
     */
    public void setZqu__IncludeCategoryNavigation__c(java.lang.Boolean zqu__IncludeCategoryNavigation__c) {
        this.zqu__IncludeCategoryNavigation__c = zqu__IncludeCategoryNavigation__c;
    }


    /**
     * Gets the zqu__IncludeContextFilters__c value for this Zqu__GuidedSellingStep__c.
     * 
     * @return zqu__IncludeContextFilters__c
     */
    public java.lang.Boolean getZqu__IncludeContextFilters__c() {
        return zqu__IncludeContextFilters__c;
    }


    /**
     * Sets the zqu__IncludeContextFilters__c value for this Zqu__GuidedSellingStep__c.
     * 
     * @param zqu__IncludeContextFilters__c
     */
    public void setZqu__IncludeContextFilters__c(java.lang.Boolean zqu__IncludeContextFilters__c) {
        this.zqu__IncludeContextFilters__c = zqu__IncludeContextFilters__c;
    }


    /**
     * Gets the zqu__IncludeSearchBox__c value for this Zqu__GuidedSellingStep__c.
     * 
     * @return zqu__IncludeSearchBox__c
     */
    public java.lang.Boolean getZqu__IncludeSearchBox__c() {
        return zqu__IncludeSearchBox__c;
    }


    /**
     * Sets the zqu__IncludeSearchBox__c value for this Zqu__GuidedSellingStep__c.
     * 
     * @param zqu__IncludeSearchBox__c
     */
    public void setZqu__IncludeSearchBox__c(java.lang.Boolean zqu__IncludeSearchBox__c) {
        this.zqu__IncludeSearchBox__c = zqu__IncludeSearchBox__c;
    }


    /**
     * Gets the zqu__IncludeUserFilters__c value for this Zqu__GuidedSellingStep__c.
     * 
     * @return zqu__IncludeUserFilters__c
     */
    public java.lang.Boolean getZqu__IncludeUserFilters__c() {
        return zqu__IncludeUserFilters__c;
    }


    /**
     * Sets the zqu__IncludeUserFilters__c value for this Zqu__GuidedSellingStep__c.
     * 
     * @param zqu__IncludeUserFilters__c
     */
    public void setZqu__IncludeUserFilters__c(java.lang.Boolean zqu__IncludeUserFilters__c) {
        this.zqu__IncludeUserFilters__c = zqu__IncludeUserFilters__c;
    }


    /**
     * Gets the zqu__PartToFilterMap__r value for this Zqu__GuidedSellingStep__c.
     * 
     * @return zqu__PartToFilterMap__r
     */
    public com.sforce.soap.enterprise.QueryResult getZqu__PartToFilterMap__r() {
        return zqu__PartToFilterMap__r;
    }


    /**
     * Sets the zqu__PartToFilterMap__r value for this Zqu__GuidedSellingStep__c.
     * 
     * @param zqu__PartToFilterMap__r
     */
    public void setZqu__PartToFilterMap__r(com.sforce.soap.enterprise.QueryResult zqu__PartToFilterMap__r) {
        this.zqu__PartToFilterMap__r = zqu__PartToFilterMap__r;
    }


    /**
     * Gets the zqu__ProductContextFieldName__c value for this Zqu__GuidedSellingStep__c.
     * 
     * @return zqu__ProductContextFieldName__c
     */
    public java.lang.String getZqu__ProductContextFieldName__c() {
        return zqu__ProductContextFieldName__c;
    }


    /**
     * Sets the zqu__ProductContextFieldName__c value for this Zqu__GuidedSellingStep__c.
     * 
     * @param zqu__ProductContextFieldName__c
     */
    public void setZqu__ProductContextFieldName__c(java.lang.String zqu__ProductContextFieldName__c) {
        this.zqu__ProductContextFieldName__c = zqu__ProductContextFieldName__c;
    }


    /**
     * Gets the zqu__ProductContext__c value for this Zqu__GuidedSellingStep__c.
     * 
     * @return zqu__ProductContext__c
     */
    public java.lang.String getZqu__ProductContext__c() {
        return zqu__ProductContext__c;
    }


    /**
     * Sets the zqu__ProductContext__c value for this Zqu__GuidedSellingStep__c.
     * 
     * @param zqu__ProductContext__c
     */
    public void setZqu__ProductContext__c(java.lang.String zqu__ProductContext__c) {
        this.zqu__ProductContext__c = zqu__ProductContext__c;
    }


    /**
     * Gets the zqu__StepTitle__c value for this Zqu__GuidedSellingStep__c.
     * 
     * @return zqu__StepTitle__c
     */
    public java.lang.String getZqu__StepTitle__c() {
        return zqu__StepTitle__c;
    }


    /**
     * Sets the zqu__StepTitle__c value for this Zqu__GuidedSellingStep__c.
     * 
     * @param zqu__StepTitle__c
     */
    public void setZqu__StepTitle__c(java.lang.String zqu__StepTitle__c) {
        this.zqu__StepTitle__c = zqu__StepTitle__c;
    }


    /**
     * Gets the zqu__StepToFlowMaps__r value for this Zqu__GuidedSellingStep__c.
     * 
     * @return zqu__StepToFlowMaps__r
     */
    public com.sforce.soap.enterprise.QueryResult getZqu__StepToFlowMaps__r() {
        return zqu__StepToFlowMaps__r;
    }


    /**
     * Sets the zqu__StepToFlowMaps__r value for this Zqu__GuidedSellingStep__c.
     * 
     * @param zqu__StepToFlowMaps__r
     */
    public void setZqu__StepToFlowMaps__r(com.sforce.soap.enterprise.QueryResult zqu__StepToFlowMaps__r) {
        this.zqu__StepToFlowMaps__r = zqu__StepToFlowMaps__r;
    }


    /**
     * Gets the zqu__ZFilter__c value for this Zqu__GuidedSellingStep__c.
     * 
     * @return zqu__ZFilter__c
     */
    public java.lang.String getZqu__ZFilter__c() {
        return zqu__ZFilter__c;
    }


    /**
     * Sets the zqu__ZFilter__c value for this Zqu__GuidedSellingStep__c.
     * 
     * @param zqu__ZFilter__c
     */
    public void setZqu__ZFilter__c(java.lang.String zqu__ZFilter__c) {
        this.zqu__ZFilter__c = zqu__ZFilter__c;
    }


    /**
     * Gets the zqu__ZFilter__r value for this Zqu__GuidedSellingStep__c.
     * 
     * @return zqu__ZFilter__r
     */
    public com.sforce.soap.enterprise.sobject.Zqu__ZFilter__c getZqu__ZFilter__r() {
        return zqu__ZFilter__r;
    }


    /**
     * Sets the zqu__ZFilter__r value for this Zqu__GuidedSellingStep__c.
     * 
     * @param zqu__ZFilter__r
     */
    public void setZqu__ZFilter__r(com.sforce.soap.enterprise.sobject.Zqu__ZFilter__c zqu__ZFilter__r) {
        this.zqu__ZFilter__r = zqu__ZFilter__r;
    }


    /**
     * Gets the zqu__ZList__c value for this Zqu__GuidedSellingStep__c.
     * 
     * @return zqu__ZList__c
     */
    public java.lang.String getZqu__ZList__c() {
        return zqu__ZList__c;
    }


    /**
     * Sets the zqu__ZList__c value for this Zqu__GuidedSellingStep__c.
     * 
     * @param zqu__ZList__c
     */
    public void setZqu__ZList__c(java.lang.String zqu__ZList__c) {
        this.zqu__ZList__c = zqu__ZList__c;
    }


    /**
     * Gets the zqu__ZList__r value for this Zqu__GuidedSellingStep__c.
     * 
     * @return zqu__ZList__r
     */
    public com.sforce.soap.enterprise.sobject.Zqu__ZList__c getZqu__ZList__r() {
        return zqu__ZList__r;
    }


    /**
     * Sets the zqu__ZList__r value for this Zqu__GuidedSellingStep__c.
     * 
     * @param zqu__ZList__r
     */
    public void setZqu__ZList__r(com.sforce.soap.enterprise.sobject.Zqu__ZList__c zqu__ZList__r) {
        this.zqu__ZList__r = zqu__ZList__r;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Zqu__GuidedSellingStep__c)) return false;
        Zqu__GuidedSellingStep__c other = (Zqu__GuidedSellingStep__c) obj;
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
            ((this.zqu__FilterProductCatalog__c==null && other.getZqu__FilterProductCatalog__c()==null) || 
             (this.zqu__FilterProductCatalog__c!=null &&
              this.zqu__FilterProductCatalog__c.equals(other.getZqu__FilterProductCatalog__c()))) &&
            ((this.zqu__GuidedSellingParts__r==null && other.getZqu__GuidedSellingParts__r()==null) || 
             (this.zqu__GuidedSellingParts__r!=null &&
              this.zqu__GuidedSellingParts__r.equals(other.getZqu__GuidedSellingParts__r()))) &&
            ((this.zqu__IncludeCategoryNavigation__c==null && other.getZqu__IncludeCategoryNavigation__c()==null) || 
             (this.zqu__IncludeCategoryNavigation__c!=null &&
              this.zqu__IncludeCategoryNavigation__c.equals(other.getZqu__IncludeCategoryNavigation__c()))) &&
            ((this.zqu__IncludeContextFilters__c==null && other.getZqu__IncludeContextFilters__c()==null) || 
             (this.zqu__IncludeContextFilters__c!=null &&
              this.zqu__IncludeContextFilters__c.equals(other.getZqu__IncludeContextFilters__c()))) &&
            ((this.zqu__IncludeSearchBox__c==null && other.getZqu__IncludeSearchBox__c()==null) || 
             (this.zqu__IncludeSearchBox__c!=null &&
              this.zqu__IncludeSearchBox__c.equals(other.getZqu__IncludeSearchBox__c()))) &&
            ((this.zqu__IncludeUserFilters__c==null && other.getZqu__IncludeUserFilters__c()==null) || 
             (this.zqu__IncludeUserFilters__c!=null &&
              this.zqu__IncludeUserFilters__c.equals(other.getZqu__IncludeUserFilters__c()))) &&
            ((this.zqu__PartToFilterMap__r==null && other.getZqu__PartToFilterMap__r()==null) || 
             (this.zqu__PartToFilterMap__r!=null &&
              this.zqu__PartToFilterMap__r.equals(other.getZqu__PartToFilterMap__r()))) &&
            ((this.zqu__ProductContextFieldName__c==null && other.getZqu__ProductContextFieldName__c()==null) || 
             (this.zqu__ProductContextFieldName__c!=null &&
              this.zqu__ProductContextFieldName__c.equals(other.getZqu__ProductContextFieldName__c()))) &&
            ((this.zqu__ProductContext__c==null && other.getZqu__ProductContext__c()==null) || 
             (this.zqu__ProductContext__c!=null &&
              this.zqu__ProductContext__c.equals(other.getZqu__ProductContext__c()))) &&
            ((this.zqu__StepTitle__c==null && other.getZqu__StepTitle__c()==null) || 
             (this.zqu__StepTitle__c!=null &&
              this.zqu__StepTitle__c.equals(other.getZqu__StepTitle__c()))) &&
            ((this.zqu__StepToFlowMaps__r==null && other.getZqu__StepToFlowMaps__r()==null) || 
             (this.zqu__StepToFlowMaps__r!=null &&
              this.zqu__StepToFlowMaps__r.equals(other.getZqu__StepToFlowMaps__r()))) &&
            ((this.zqu__ZFilter__c==null && other.getZqu__ZFilter__c()==null) || 
             (this.zqu__ZFilter__c!=null &&
              this.zqu__ZFilter__c.equals(other.getZqu__ZFilter__c()))) &&
            ((this.zqu__ZFilter__r==null && other.getZqu__ZFilter__r()==null) || 
             (this.zqu__ZFilter__r!=null &&
              this.zqu__ZFilter__r.equals(other.getZqu__ZFilter__r()))) &&
            ((this.zqu__ZList__c==null && other.getZqu__ZList__c()==null) || 
             (this.zqu__ZList__c!=null &&
              this.zqu__ZList__c.equals(other.getZqu__ZList__c()))) &&
            ((this.zqu__ZList__r==null && other.getZqu__ZList__r()==null) || 
             (this.zqu__ZList__r!=null &&
              this.zqu__ZList__r.equals(other.getZqu__ZList__r())));
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
        if (getZqu__FilterProductCatalog__c() != null) {
            _hashCode += getZqu__FilterProductCatalog__c().hashCode();
        }
        if (getZqu__GuidedSellingParts__r() != null) {
            _hashCode += getZqu__GuidedSellingParts__r().hashCode();
        }
        if (getZqu__IncludeCategoryNavigation__c() != null) {
            _hashCode += getZqu__IncludeCategoryNavigation__c().hashCode();
        }
        if (getZqu__IncludeContextFilters__c() != null) {
            _hashCode += getZqu__IncludeContextFilters__c().hashCode();
        }
        if (getZqu__IncludeSearchBox__c() != null) {
            _hashCode += getZqu__IncludeSearchBox__c().hashCode();
        }
        if (getZqu__IncludeUserFilters__c() != null) {
            _hashCode += getZqu__IncludeUserFilters__c().hashCode();
        }
        if (getZqu__PartToFilterMap__r() != null) {
            _hashCode += getZqu__PartToFilterMap__r().hashCode();
        }
        if (getZqu__ProductContextFieldName__c() != null) {
            _hashCode += getZqu__ProductContextFieldName__c().hashCode();
        }
        if (getZqu__ProductContext__c() != null) {
            _hashCode += getZqu__ProductContext__c().hashCode();
        }
        if (getZqu__StepTitle__c() != null) {
            _hashCode += getZqu__StepTitle__c().hashCode();
        }
        if (getZqu__StepToFlowMaps__r() != null) {
            _hashCode += getZqu__StepToFlowMaps__r().hashCode();
        }
        if (getZqu__ZFilter__c() != null) {
            _hashCode += getZqu__ZFilter__c().hashCode();
        }
        if (getZqu__ZFilter__r() != null) {
            _hashCode += getZqu__ZFilter__r().hashCode();
        }
        if (getZqu__ZList__c() != null) {
            _hashCode += getZqu__ZList__c().hashCode();
        }
        if (getZqu__ZList__r() != null) {
            _hashCode += getZqu__ZList__r().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Zqu__GuidedSellingStep__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__GuidedSellingStep__c"));
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
        elemField.setFieldName("zqu__FilterProductCatalog__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__FilterProductCatalog__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__GuidedSellingParts__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__GuidedSellingParts__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__IncludeCategoryNavigation__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__IncludeCategoryNavigation__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__IncludeContextFilters__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__IncludeContextFilters__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__IncludeSearchBox__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__IncludeSearchBox__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__IncludeUserFilters__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__IncludeUserFilters__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__PartToFilterMap__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__PartToFilterMap__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__ProductContextFieldName__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ProductContextFieldName__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__ProductContext__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ProductContext__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__StepTitle__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__StepTitle__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__StepToFlowMaps__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__StepToFlowMaps__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__ZFilter__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ZFilter__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__ZFilter__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ZFilter__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ZFilter__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__ZList__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ZList__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zqu__ZList__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ZList__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "zqu__ZList__c"));
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
