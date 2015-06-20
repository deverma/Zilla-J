package com.sforce.soap.enterprise;

import com.sforce.ws.ConnectionException;
import com.sforce.ws.ConnectorConfig;
import com.sforce.ws.bind.XMLizable;
import com.sforce.ws.bind.TypeMapper;
import java.util.HashMap;
import javax.xml.namespace.QName;

/** * Generated class, please do not edit. */
public class EnterpriseConnection {
	private TypeMapper __typeMapper = new TypeMapper();
	private ConnectorConfig __config;
	private HashMap<QName, XMLizable> __extraHeaders = new HashMap<QName, XMLizable>();

	public ConnectorConfig getConfig() {
		return __config;
	}

	private com.sforce.soap.enterprise.QueryOptions_element __QueryOptions;

	public void setQueryOptions(int batchSize) {
		__QueryOptions = new com.sforce.soap.enterprise.QueryOptions_element();
		__QueryOptions.setBatchSize(batchSize);
	}

	public void clearQueryOptions() {
		__QueryOptions = null;
	}

	public com.sforce.soap.enterprise.QueryOptions_element getQueryOptions() {
		return __QueryOptions;
	}

	public void __setQueryOptions(
			com.sforce.soap.enterprise.QueryOptions_element __header) {
		__QueryOptions = __header;
	}

	private com.sforce.soap.enterprise.EmailHeader_element __EmailHeader;

	public void setEmailHeader(boolean triggerAutoResponseEmail,
			boolean triggerOtherEmail, boolean triggerUserEmail) {
		__EmailHeader = new com.sforce.soap.enterprise.EmailHeader_element();
		__EmailHeader.setTriggerAutoResponseEmail(triggerAutoResponseEmail);
		__EmailHeader.setTriggerOtherEmail(triggerOtherEmail);
		__EmailHeader.setTriggerUserEmail(triggerUserEmail);
	}

	public void clearEmailHeader() {
		__EmailHeader = null;
	}

	public com.sforce.soap.enterprise.EmailHeader_element getEmailHeader() {
		return __EmailHeader;
	}

	public void __setEmailHeader(
			com.sforce.soap.enterprise.EmailHeader_element __header) {
		__EmailHeader = __header;
	}

	private com.sforce.soap.enterprise.DebuggingInfo_element __DebuggingInfo;

	public void setDebuggingInfo(java.lang.String debugLog) {
		__DebuggingInfo = new com.sforce.soap.enterprise.DebuggingInfo_element();
		__DebuggingInfo.setDebugLog(debugLog);
	}

	public void clearDebuggingInfo() {
		__DebuggingInfo = null;
	}

	public com.sforce.soap.enterprise.DebuggingInfo_element getDebuggingInfo() {
		return __DebuggingInfo;
	}

	public void __setDebuggingInfo(
			com.sforce.soap.enterprise.DebuggingInfo_element __header) {
		__DebuggingInfo = __header;
	}

	private com.sforce.soap.enterprise.MruHeader_element __MruHeader;

	public void setMruHeader(boolean updateMru) {
		__MruHeader = new com.sforce.soap.enterprise.MruHeader_element();
		__MruHeader.setUpdateMru(updateMru);
	}

	public void clearMruHeader() {
		__MruHeader = null;
	}

	public com.sforce.soap.enterprise.MruHeader_element getMruHeader() {
		return __MruHeader;
	}

	public void __setMruHeader(
			com.sforce.soap.enterprise.MruHeader_element __header) {
		__MruHeader = __header;
	}

	private com.sforce.soap.enterprise.PackageVersionHeader_element __PackageVersionHeader;

	public void setPackageVersionHeader(
			com.sforce.soap.enterprise.PackageVersion[] packageVersions) {
		__PackageVersionHeader = new com.sforce.soap.enterprise.PackageVersionHeader_element();
		__PackageVersionHeader.setPackageVersions(packageVersions);
	}

	public void clearPackageVersionHeader() {
		__PackageVersionHeader = null;
	}

	public com.sforce.soap.enterprise.PackageVersionHeader_element getPackageVersionHeader() {
		return __PackageVersionHeader;
	}

	public void __setPackageVersionHeader(
			com.sforce.soap.enterprise.PackageVersionHeader_element __header) {
		__PackageVersionHeader = __header;
	}

	private com.sforce.soap.enterprise.SessionHeader_element __SessionHeader;

	public void setSessionHeader(java.lang.String sessionId) {
		__SessionHeader = new com.sforce.soap.enterprise.SessionHeader_element();
		__SessionHeader.setSessionId(sessionId);
	}

	public void clearSessionHeader() {
		__SessionHeader = null;
	}

	public com.sforce.soap.enterprise.SessionHeader_element getSessionHeader() {
		return __SessionHeader;
	}

	public void __setSessionHeader(
			com.sforce.soap.enterprise.SessionHeader_element __header) {
		__SessionHeader = __header;
	}

	private com.sforce.soap.enterprise.LoginScopeHeader_element __LoginScopeHeader;

	public void setLoginScopeHeader(java.lang.String organizationId,
			java.lang.String portalId) {
		__LoginScopeHeader = new com.sforce.soap.enterprise.LoginScopeHeader_element();
		__LoginScopeHeader.setOrganizationId(organizationId);
		__LoginScopeHeader.setPortalId(portalId);
	}

	public void clearLoginScopeHeader() {
		__LoginScopeHeader = null;
	}

	public com.sforce.soap.enterprise.LoginScopeHeader_element getLoginScopeHeader() {
		return __LoginScopeHeader;
	}

	public void __setLoginScopeHeader(
			com.sforce.soap.enterprise.LoginScopeHeader_element __header) {
		__LoginScopeHeader = __header;
	}

	private com.sforce.soap.enterprise.UserTerritoryDeleteHeader_element __UserTerritoryDeleteHeader;

	public void setUserTerritoryDeleteHeader(java.lang.String transferToUserId) {
		__UserTerritoryDeleteHeader = new com.sforce.soap.enterprise.UserTerritoryDeleteHeader_element();
		__UserTerritoryDeleteHeader.setTransferToUserId(transferToUserId);
	}

	public void clearUserTerritoryDeleteHeader() {
		__UserTerritoryDeleteHeader = null;
	}

	public com.sforce.soap.enterprise.UserTerritoryDeleteHeader_element getUserTerritoryDeleteHeader() {
		return __UserTerritoryDeleteHeader;
	}

	public void __setUserTerritoryDeleteHeader(
			com.sforce.soap.enterprise.UserTerritoryDeleteHeader_element __header) {
		__UserTerritoryDeleteHeader = __header;
	}

	private com.sforce.soap.enterprise.AllowFieldTruncationHeader_element __AllowFieldTruncationHeader;

	public void setAllowFieldTruncationHeader(boolean allowFieldTruncation) {
		__AllowFieldTruncationHeader = new com.sforce.soap.enterprise.AllowFieldTruncationHeader_element();
		__AllowFieldTruncationHeader
				.setAllowFieldTruncation(allowFieldTruncation);
	}

	public void clearAllowFieldTruncationHeader() {
		__AllowFieldTruncationHeader = null;
	}

	public com.sforce.soap.enterprise.AllowFieldTruncationHeader_element getAllowFieldTruncationHeader() {
		return __AllowFieldTruncationHeader;
	}

	public void __setAllowFieldTruncationHeader(
			com.sforce.soap.enterprise.AllowFieldTruncationHeader_element __header) {
		__AllowFieldTruncationHeader = __header;
	}

	private com.sforce.soap.enterprise.DebuggingHeader_element __DebuggingHeader;

	public void setDebuggingHeader(
			com.sforce.soap.enterprise.DebugLevel debugLevel) {
		__DebuggingHeader = new com.sforce.soap.enterprise.DebuggingHeader_element();
		__DebuggingHeader.setDebugLevel(debugLevel);
	}

	public void clearDebuggingHeader() {
		__DebuggingHeader = null;
	}

	public com.sforce.soap.enterprise.DebuggingHeader_element getDebuggingHeader() {
		return __DebuggingHeader;
	}

	public void __setDebuggingHeader(
			com.sforce.soap.enterprise.DebuggingHeader_element __header) {
		__DebuggingHeader = __header;
	}

	private com.sforce.soap.enterprise.AllOrNoneHeader_element __AllOrNoneHeader;

	public void setAllOrNoneHeader(boolean allOrNone) {
		__AllOrNoneHeader = new com.sforce.soap.enterprise.AllOrNoneHeader_element();
		__AllOrNoneHeader.setAllOrNone(allOrNone);
	}

	public void clearAllOrNoneHeader() {
		__AllOrNoneHeader = null;
	}

	public com.sforce.soap.enterprise.AllOrNoneHeader_element getAllOrNoneHeader() {
		return __AllOrNoneHeader;
	}

	public void __setAllOrNoneHeader(
			com.sforce.soap.enterprise.AllOrNoneHeader_element __header) {
		__AllOrNoneHeader = __header;
	}

	private com.sforce.soap.enterprise.LocaleOptions_element __LocaleOptions;

	public void setLocaleOptions(java.lang.String language) {
		__LocaleOptions = new com.sforce.soap.enterprise.LocaleOptions_element();
		__LocaleOptions.setLanguage(language);
	}

	public void clearLocaleOptions() {
		__LocaleOptions = null;
	}

	public com.sforce.soap.enterprise.LocaleOptions_element getLocaleOptions() {
		return __LocaleOptions;
	}

	public void __setLocaleOptions(
			com.sforce.soap.enterprise.LocaleOptions_element __header) {
		__LocaleOptions = __header;
	}

	private com.sforce.soap.enterprise.AssignmentRuleHeader_element __AssignmentRuleHeader;

	public void setAssignmentRuleHeader(java.lang.String assignmentRuleId,
			java.lang.Boolean useDefaultRule) {
		__AssignmentRuleHeader = new com.sforce.soap.enterprise.AssignmentRuleHeader_element();
		__AssignmentRuleHeader.setAssignmentRuleId(assignmentRuleId);
		__AssignmentRuleHeader.setUseDefaultRule(useDefaultRule);
	}

	public void clearAssignmentRuleHeader() {
		__AssignmentRuleHeader = null;
	}

	public com.sforce.soap.enterprise.AssignmentRuleHeader_element getAssignmentRuleHeader() {
		return __AssignmentRuleHeader;
	}

	public void __setAssignmentRuleHeader(
			com.sforce.soap.enterprise.AssignmentRuleHeader_element __header) {
		__AssignmentRuleHeader = __header;
	}

	private com.sforce.soap.enterprise.DisableFeedTrackingHeader_element __DisableFeedTrackingHeader;

	public void setDisableFeedTrackingHeader(boolean disableFeedTracking) {
		__DisableFeedTrackingHeader = new com.sforce.soap.enterprise.DisableFeedTrackingHeader_element();
		__DisableFeedTrackingHeader.setDisableFeedTracking(disableFeedTracking);
	}

	public void clearDisableFeedTrackingHeader() {
		__DisableFeedTrackingHeader = null;
	}

	public com.sforce.soap.enterprise.DisableFeedTrackingHeader_element getDisableFeedTrackingHeader() {
		return __DisableFeedTrackingHeader;
	}

	public void __setDisableFeedTrackingHeader(
			com.sforce.soap.enterprise.DisableFeedTrackingHeader_element __header) {
		__DisableFeedTrackingHeader = __header;
	}

	private com.sforce.soap.enterprise.StreamingEnabledHeader_element __StreamingEnabledHeader;

	public void setStreamingEnabledHeader(boolean streamingEnabled) {
		__StreamingEnabledHeader = new com.sforce.soap.enterprise.StreamingEnabledHeader_element();
		__StreamingEnabledHeader.setStreamingEnabled(streamingEnabled);
	}

	public void clearStreamingEnabledHeader() {
		__StreamingEnabledHeader = null;
	}

	public com.sforce.soap.enterprise.StreamingEnabledHeader_element getStreamingEnabledHeader() {
		return __StreamingEnabledHeader;
	}

	public void __setStreamingEnabledHeader(
			com.sforce.soap.enterprise.StreamingEnabledHeader_element __header) {
		__StreamingEnabledHeader = __header;
	}

	public EnterpriseConnection(ConnectorConfig config)
			throws ConnectionException {
		this.__config = config;
		this.__typeMapper.setPackagePrefix(null);
		this.__typeMapper.setConfig(config);
		config.verifyEnterpriseEndpoint();
		if (!config.isManualLogin()) {
			if (config.getSessionId() == null) {
				config.setServiceEndpoint(config.getAuthEndpoint());
				com.sforce.soap.enterprise.LoginResult result = login(
						config.getUsername(), config.getPassword());
				config.setSessionId(result.getSessionId());
				config.setServiceEndpoint(result.getServerUrl());
			} else {
				if (config.getServiceEndpoint() == null) {
					throw new com.sforce.ws.ConnectionException(
							"Please set ServiceEndpoint");
				}
			}
		}
		__SessionHeader = new SessionHeader_element();
		__SessionHeader.setSessionId(config.getSessionId());
	}

	private com.sforce.ws.transport.SoapConnection newConnection() {
		com.sforce.ws.transport.SoapConnection __c = new com.sforce.ws.transport.SoapConnection(
				__config.getServiceEndpoint(),
				"urn:sobject.enterprise.soap.sforce.com", __typeMapper,
				__config);
		__c.setConnection(this);
		__c.setKnownHeaders(knownHeaders);
		return __c;
	}

	public com.sforce.soap.enterprise.SearchResult search(
			java.lang.String searchString)
			throws com.sforce.ws.ConnectionException {
		com.sforce.ws.transport.SoapConnection __connection = newConnection();
		com.sforce.soap.enterprise.Search_element __request = new com.sforce.soap.enterprise.Search_element();
		com.sforce.soap.enterprise.SearchResponse_element __response = new com.sforce.soap.enterprise.SearchResponse_element();
		__request.setSearchString(searchString);
		if (__SessionHeader != null)
			__connection.addHeader(SessionHeader_qname, __SessionHeader);
		if (__PackageVersionHeader != null)
			__connection.addHeader(PackageVersionHeader_qname,
					__PackageVersionHeader);
		addHeaders(__connection);
		__response = (com.sforce.soap.enterprise.SearchResponse_element) __connection
				.send("", search_qname, __request, searchResponse_qname,
						com.sforce.soap.enterprise.SearchResponse_element.class);
		return __response.getResult();
	}

	public com.sforce.soap.enterprise.QueryResult queryMore(
			java.lang.String queryLocator)
			throws com.sforce.ws.ConnectionException {
		com.sforce.ws.transport.SoapConnection __connection = newConnection();
		com.sforce.soap.enterprise.QueryMore_element __request = new com.sforce.soap.enterprise.QueryMore_element();
		com.sforce.soap.enterprise.QueryMoreResponse_element __response = new com.sforce.soap.enterprise.QueryMoreResponse_element();
		__request.setQueryLocator(queryLocator);
		if (__SessionHeader != null)
			__connection.addHeader(SessionHeader_qname, __SessionHeader);
		if (__QueryOptions != null)
			__connection.addHeader(QueryOptions_qname, __QueryOptions);
		addHeaders(__connection);
		__response = (com.sforce.soap.enterprise.QueryMoreResponse_element) __connection
				.send("",
						queryMore_qname,
						__request,
						queryMoreResponse_qname,
						com.sforce.soap.enterprise.QueryMoreResponse_element.class);
		return __response.getResult();
	}

	public com.sforce.soap.enterprise.DescribeDataCategoryGroupResult[] describeDataCategoryGroups(
			java.lang.String[] sObjectType)
			throws com.sforce.ws.ConnectionException {
		com.sforce.ws.transport.SoapConnection __connection = newConnection();
		com.sforce.soap.enterprise.DescribeDataCategoryGroups_element __request = new com.sforce.soap.enterprise.DescribeDataCategoryGroups_element();
		com.sforce.soap.enterprise.DescribeDataCategoryGroupsResponse_element __response = new com.sforce.soap.enterprise.DescribeDataCategoryGroupsResponse_element();
		__request.setSObjectType(sObjectType);
		if (__SessionHeader != null)
			__connection.addHeader(SessionHeader_qname, __SessionHeader);
		if (__PackageVersionHeader != null)
			__connection.addHeader(PackageVersionHeader_qname,
					__PackageVersionHeader);
		if (__LocaleOptions != null)
			__connection.addHeader(LocaleOptions_qname, __LocaleOptions);
		addHeaders(__connection);
		__response = (com.sforce.soap.enterprise.DescribeDataCategoryGroupsResponse_element) __connection
				.send("",
						describeDataCategoryGroups_qname,
						__request,
						describeDataCategoryGroupsResponse_qname,
						com.sforce.soap.enterprise.DescribeDataCategoryGroupsResponse_element.class);
		return __response.getResult();
	}

	public com.sforce.soap.enterprise.DescribeSObjectResult describeSObject(
			java.lang.String sObjectType)
			throws com.sforce.ws.ConnectionException {
		com.sforce.ws.transport.SoapConnection __connection = newConnection();
		com.sforce.soap.enterprise.DescribeSObject_element __request = new com.sforce.soap.enterprise.DescribeSObject_element();
		com.sforce.soap.enterprise.DescribeSObjectResponse_element __response = new com.sforce.soap.enterprise.DescribeSObjectResponse_element();
		__request.setSObjectType(sObjectType);
		if (__SessionHeader != null)
			__connection.addHeader(SessionHeader_qname, __SessionHeader);
		if (__PackageVersionHeader != null)
			__connection.addHeader(PackageVersionHeader_qname,
					__PackageVersionHeader);
		if (__LocaleOptions != null)
			__connection.addHeader(LocaleOptions_qname, __LocaleOptions);
		addHeaders(__connection);
		__response = (com.sforce.soap.enterprise.DescribeSObjectResponse_element) __connection
				.send("",
						describeSObject_qname,
						__request,
						describeSObjectResponse_qname,
						com.sforce.soap.enterprise.DescribeSObjectResponse_element.class);
		return __response.getResult();
	}

	public com.sforce.soap.enterprise.DescribeSoftphoneLayoutResult describeSoftphoneLayout()
			throws com.sforce.ws.ConnectionException {
		com.sforce.ws.transport.SoapConnection __connection = newConnection();
		com.sforce.soap.enterprise.DescribeSoftphoneLayout_element __request = new com.sforce.soap.enterprise.DescribeSoftphoneLayout_element();
		com.sforce.soap.enterprise.DescribeSoftphoneLayoutResponse_element __response = new com.sforce.soap.enterprise.DescribeSoftphoneLayoutResponse_element();
		if (__SessionHeader != null)
			__connection.addHeader(SessionHeader_qname, __SessionHeader);
		if (__PackageVersionHeader != null)
			__connection.addHeader(PackageVersionHeader_qname,
					__PackageVersionHeader);
		addHeaders(__connection);
		__response = (com.sforce.soap.enterprise.DescribeSoftphoneLayoutResponse_element) __connection
				.send("",
						describeSoftphoneLayout_qname,
						__request,
						describeSoftphoneLayoutResponse_qname,
						com.sforce.soap.enterprise.DescribeSoftphoneLayoutResponse_element.class);
		return __response.getResult();
	}

	public com.sforce.soap.enterprise.SetPasswordResult setPassword(
			java.lang.String userId, java.lang.String password)
			throws com.sforce.ws.ConnectionException {
		com.sforce.ws.transport.SoapConnection __connection = newConnection();
		com.sforce.soap.enterprise.SetPassword_element __request = new com.sforce.soap.enterprise.SetPassword_element();
		com.sforce.soap.enterprise.SetPasswordResponse_element __response = new com.sforce.soap.enterprise.SetPasswordResponse_element();
		__request.setUserId(userId);
		__request.setPassword(password);
		if (__SessionHeader != null)
			__connection.addHeader(SessionHeader_qname, __SessionHeader);
		addHeaders(__connection);
		__response = (com.sforce.soap.enterprise.SetPasswordResponse_element) __connection
				.send("",
						setPassword_qname,
						__request,
						setPasswordResponse_qname,
						com.sforce.soap.enterprise.SetPasswordResponse_element.class);
		return __response.getResult();
	}

	public com.sforce.soap.enterprise.DescribeTabSetResult[] describeTabs()
			throws com.sforce.ws.ConnectionException {
		com.sforce.ws.transport.SoapConnection __connection = newConnection();
		com.sforce.soap.enterprise.DescribeTabs_element __request = new com.sforce.soap.enterprise.DescribeTabs_element();
		com.sforce.soap.enterprise.DescribeTabsResponse_element __response = new com.sforce.soap.enterprise.DescribeTabsResponse_element();
		if (__SessionHeader != null)
			__connection.addHeader(SessionHeader_qname, __SessionHeader);
		if (__PackageVersionHeader != null)
			__connection.addHeader(PackageVersionHeader_qname,
					__PackageVersionHeader);
		addHeaders(__connection);
		__response = (com.sforce.soap.enterprise.DescribeTabsResponse_element) __connection
				.send("",
						describeTabs_qname,
						__request,
						describeTabsResponse_qname,
						com.sforce.soap.enterprise.DescribeTabsResponse_element.class);
		return __response.getResult();
	}

	public com.sforce.soap.enterprise.LoginResult login(
			java.lang.String username, java.lang.String password)
			throws com.sforce.ws.ConnectionException {
		com.sforce.ws.transport.SoapConnection __connection = newConnection();
		com.sforce.soap.enterprise.Login_element __request = new com.sforce.soap.enterprise.Login_element();
		com.sforce.soap.enterprise.LoginResponse_element __response = new com.sforce.soap.enterprise.LoginResponse_element();
		__request.setUsername(username);
		__request.setPassword(password);
		if (__LoginScopeHeader != null)
			__connection.addHeader(LoginScopeHeader_qname, __LoginScopeHeader);
		addHeaders(__connection);
		__response = (com.sforce.soap.enterprise.LoginResponse_element) __connection
				.send("", login_qname, __request, loginResponse_qname,
						com.sforce.soap.enterprise.LoginResponse_element.class);
		return __response.getResult();
	}

	public com.sforce.soap.enterprise.DeleteResult[] delete(
			java.lang.String[] ids) throws com.sforce.ws.ConnectionException {
		com.sforce.ws.transport.SoapConnection __connection = newConnection();
		com.sforce.soap.enterprise.Delete_element __request = new com.sforce.soap.enterprise.Delete_element();
		com.sforce.soap.enterprise.DeleteResponse_element __response = new com.sforce.soap.enterprise.DeleteResponse_element();
		__request.setIds(ids);
		if (__SessionHeader != null)
			__connection.addHeader(SessionHeader_qname, __SessionHeader);
		if (__PackageVersionHeader != null)
			__connection.addHeader(PackageVersionHeader_qname,
					__PackageVersionHeader);
		if (__UserTerritoryDeleteHeader != null)
			__connection.addHeader(UserTerritoryDeleteHeader_qname,
					__UserTerritoryDeleteHeader);
		if (__EmailHeader != null)
			__connection.addHeader(EmailHeader_qname, __EmailHeader);
		if (__AllowFieldTruncationHeader != null)
			__connection.addHeader(AllowFieldTruncationHeader_qname,
					__AllowFieldTruncationHeader);
		if (__DisableFeedTrackingHeader != null)
			__connection.addHeader(DisableFeedTrackingHeader_qname,
					__DisableFeedTrackingHeader);
		if (__StreamingEnabledHeader != null)
			__connection.addHeader(StreamingEnabledHeader_qname,
					__StreamingEnabledHeader);
		if (__AllOrNoneHeader != null)
			__connection.addHeader(AllOrNoneHeader_qname, __AllOrNoneHeader);
		if (__DebuggingHeader != null)
			__connection.addHeader(DebuggingHeader_qname, __DebuggingHeader);
		addHeaders(__connection);
		__response = (com.sforce.soap.enterprise.DeleteResponse_element) __connection
				.send("", delete_qname, __request, deleteResponse_qname,
						com.sforce.soap.enterprise.DeleteResponse_element.class);
		return __response.getResult();
	}

	public com.sforce.soap.enterprise.MergeResult[] merge(
			com.sforce.soap.enterprise.MergeRequest[] request)
			throws com.sforce.ws.ConnectionException {
		com.sforce.ws.transport.SoapConnection __connection = newConnection();
		com.sforce.soap.enterprise.Merge_element __request = new com.sforce.soap.enterprise.Merge_element();
		com.sforce.soap.enterprise.MergeResponse_element __response = new com.sforce.soap.enterprise.MergeResponse_element();
		__request.setRequest(request);
		if (__SessionHeader != null)
			__connection.addHeader(SessionHeader_qname, __SessionHeader);
		if (__AssignmentRuleHeader != null)
			__connection.addHeader(AssignmentRuleHeader_qname,
					__AssignmentRuleHeader);
		if (__MruHeader != null)
			__connection.addHeader(MruHeader_qname, __MruHeader);
		if (__AllowFieldTruncationHeader != null)
			__connection.addHeader(AllowFieldTruncationHeader_qname,
					__AllowFieldTruncationHeader);
		if (__DisableFeedTrackingHeader != null)
			__connection.addHeader(DisableFeedTrackingHeader_qname,
					__DisableFeedTrackingHeader);
		if (__StreamingEnabledHeader != null)
			__connection.addHeader(StreamingEnabledHeader_qname,
					__StreamingEnabledHeader);
		if (__DebuggingHeader != null)
			__connection.addHeader(DebuggingHeader_qname, __DebuggingHeader);
		if (__PackageVersionHeader != null)
			__connection.addHeader(PackageVersionHeader_qname,
					__PackageVersionHeader);
		if (__EmailHeader != null)
			__connection.addHeader(EmailHeader_qname, __EmailHeader);
		addHeaders(__connection);
		__response = (com.sforce.soap.enterprise.MergeResponse_element) __connection
				.send("", merge_qname, __request, mergeResponse_qname,
						com.sforce.soap.enterprise.MergeResponse_element.class);
		return __response.getResult();
	}

	public com.sforce.soap.enterprise.QueryResult query(
			java.lang.String queryString)
			throws com.sforce.ws.ConnectionException {
		com.sforce.ws.transport.SoapConnection __connection = newConnection();
		com.sforce.soap.enterprise.Query_element __request = new com.sforce.soap.enterprise.Query_element();
		com.sforce.soap.enterprise.QueryResponse_element __response = new com.sforce.soap.enterprise.QueryResponse_element();
		__request.setQueryString(queryString);
		if (__SessionHeader != null)
			__connection.addHeader(SessionHeader_qname, __SessionHeader);
		if (__QueryOptions != null)
			__connection.addHeader(QueryOptions_qname, __QueryOptions);
		if (__MruHeader != null)
			__connection.addHeader(MruHeader_qname, __MruHeader);
		if (__PackageVersionHeader != null)
			__connection.addHeader(PackageVersionHeader_qname,
					__PackageVersionHeader);
		addHeaders(__connection);
		__response = (com.sforce.soap.enterprise.QueryResponse_element) __connection
				.send("", query_qname, __request, queryResponse_qname,
						com.sforce.soap.enterprise.QueryResponse_element.class);
		return __response.getResult();
	}

	public com.sforce.soap.enterprise.ResetPasswordResult resetPassword(
			java.lang.String userId) throws com.sforce.ws.ConnectionException {
		com.sforce.ws.transport.SoapConnection __connection = newConnection();
		com.sforce.soap.enterprise.ResetPassword_element __request = new com.sforce.soap.enterprise.ResetPassword_element();
		com.sforce.soap.enterprise.ResetPasswordResponse_element __response = new com.sforce.soap.enterprise.ResetPasswordResponse_element();
		__request.setUserId(userId);
		if (__SessionHeader != null)
			__connection.addHeader(SessionHeader_qname, __SessionHeader);
		if (__EmailHeader != null)
			__connection.addHeader(EmailHeader_qname, __EmailHeader);
		addHeaders(__connection);
		__response = (com.sforce.soap.enterprise.ResetPasswordResponse_element) __connection
				.send("",
						resetPassword_qname,
						__request,
						resetPasswordResponse_qname,
						com.sforce.soap.enterprise.ResetPasswordResponse_element.class);
		return __response.getResult();
	}

	public com.sforce.soap.enterprise.SaveResult[] update(
			com.sforce.soap.enterprise.sobject.SObject[] sObjects)
			throws com.sforce.ws.ConnectionException {
		com.sforce.ws.transport.SoapConnection __connection = newConnection();
		com.sforce.soap.enterprise.Update_element __request = new com.sforce.soap.enterprise.Update_element();
		com.sforce.soap.enterprise.UpdateResponse_element __response = new com.sforce.soap.enterprise.UpdateResponse_element();
		__request.setSObjects(sObjects);
		if (__SessionHeader != null)
			__connection.addHeader(SessionHeader_qname, __SessionHeader);
		if (__AssignmentRuleHeader != null)
			__connection.addHeader(AssignmentRuleHeader_qname,
					__AssignmentRuleHeader);
		if (__MruHeader != null)
			__connection.addHeader(MruHeader_qname, __MruHeader);
		if (__AllowFieldTruncationHeader != null)
			__connection.addHeader(AllowFieldTruncationHeader_qname,
					__AllowFieldTruncationHeader);
		if (__DisableFeedTrackingHeader != null)
			__connection.addHeader(DisableFeedTrackingHeader_qname,
					__DisableFeedTrackingHeader);
		if (__StreamingEnabledHeader != null)
			__connection.addHeader(StreamingEnabledHeader_qname,
					__StreamingEnabledHeader);
		if (__AllOrNoneHeader != null)
			__connection.addHeader(AllOrNoneHeader_qname, __AllOrNoneHeader);
		if (__DebuggingHeader != null)
			__connection.addHeader(DebuggingHeader_qname, __DebuggingHeader);
		if (__PackageVersionHeader != null)
			__connection.addHeader(PackageVersionHeader_qname,
					__PackageVersionHeader);
		if (__EmailHeader != null)
			__connection.addHeader(EmailHeader_qname, __EmailHeader);
		addHeaders(__connection);
		__response = (com.sforce.soap.enterprise.UpdateResponse_element) __connection
				.send("", update_qname, __request, updateResponse_qname,
						com.sforce.soap.enterprise.UpdateResponse_element.class);
		return __response.getResult();
	}

	public com.sforce.soap.enterprise.UndeleteResult[] undelete(
			java.lang.String[] ids) throws com.sforce.ws.ConnectionException {
		com.sforce.ws.transport.SoapConnection __connection = newConnection();
		com.sforce.soap.enterprise.Undelete_element __request = new com.sforce.soap.enterprise.Undelete_element();
		com.sforce.soap.enterprise.UndeleteResponse_element __response = new com.sforce.soap.enterprise.UndeleteResponse_element();
		__request.setIds(ids);
		if (__SessionHeader != null)
			__connection.addHeader(SessionHeader_qname, __SessionHeader);
		if (__AllowFieldTruncationHeader != null)
			__connection.addHeader(AllowFieldTruncationHeader_qname,
					__AllowFieldTruncationHeader);
		if (__DisableFeedTrackingHeader != null)
			__connection.addHeader(DisableFeedTrackingHeader_qname,
					__DisableFeedTrackingHeader);
		if (__StreamingEnabledHeader != null)
			__connection.addHeader(StreamingEnabledHeader_qname,
					__StreamingEnabledHeader);
		if (__AllOrNoneHeader != null)
			__connection.addHeader(AllOrNoneHeader_qname, __AllOrNoneHeader);
		if (__DebuggingHeader != null)
			__connection.addHeader(DebuggingHeader_qname, __DebuggingHeader);
		if (__PackageVersionHeader != null)
			__connection.addHeader(PackageVersionHeader_qname,
					__PackageVersionHeader);
		addHeaders(__connection);
		__response = (com.sforce.soap.enterprise.UndeleteResponse_element) __connection
				.send("",
						undelete_qname,
						__request,
						undeleteResponse_qname,
						com.sforce.soap.enterprise.UndeleteResponse_element.class);
		return __response.getResult();
	}

	public com.sforce.soap.enterprise.UpsertResult[] upsert(
			java.lang.String externalIDFieldName,
			com.sforce.soap.enterprise.sobject.SObject[] sObjects)
			throws com.sforce.ws.ConnectionException {
		com.sforce.ws.transport.SoapConnection __connection = newConnection();
		com.sforce.soap.enterprise.Upsert_element __request = new com.sforce.soap.enterprise.Upsert_element();
		com.sforce.soap.enterprise.UpsertResponse_element __response = new com.sforce.soap.enterprise.UpsertResponse_element();
		__request.setExternalIDFieldName(externalIDFieldName);
		__request.setSObjects(sObjects);
		if (__SessionHeader != null)
			__connection.addHeader(SessionHeader_qname, __SessionHeader);
		if (__AssignmentRuleHeader != null)
			__connection.addHeader(AssignmentRuleHeader_qname,
					__AssignmentRuleHeader);
		if (__MruHeader != null)
			__connection.addHeader(MruHeader_qname, __MruHeader);
		if (__AllowFieldTruncationHeader != null)
			__connection.addHeader(AllowFieldTruncationHeader_qname,
					__AllowFieldTruncationHeader);
		if (__DisableFeedTrackingHeader != null)
			__connection.addHeader(DisableFeedTrackingHeader_qname,
					__DisableFeedTrackingHeader);
		if (__StreamingEnabledHeader != null)
			__connection.addHeader(StreamingEnabledHeader_qname,
					__StreamingEnabledHeader);
		if (__AllOrNoneHeader != null)
			__connection.addHeader(AllOrNoneHeader_qname, __AllOrNoneHeader);
		if (__DebuggingHeader != null)
			__connection.addHeader(DebuggingHeader_qname, __DebuggingHeader);
		if (__PackageVersionHeader != null)
			__connection.addHeader(PackageVersionHeader_qname,
					__PackageVersionHeader);
		if (__EmailHeader != null)
			__connection.addHeader(EmailHeader_qname, __EmailHeader);
		addHeaders(__connection);
		__response = (com.sforce.soap.enterprise.UpsertResponse_element) __connection
				.send("", upsert_qname, __request, upsertResponse_qname,
						com.sforce.soap.enterprise.UpsertResponse_element.class);
		return __response.getResult();
	}

	public com.sforce.soap.enterprise.DescribeSObjectResult[] describeSObjects(
			java.lang.String[] sObjectType)
			throws com.sforce.ws.ConnectionException {
		com.sforce.ws.transport.SoapConnection __connection = newConnection();
		com.sforce.soap.enterprise.DescribeSObjects_element __request = new com.sforce.soap.enterprise.DescribeSObjects_element();
		com.sforce.soap.enterprise.DescribeSObjectsResponse_element __response = new com.sforce.soap.enterprise.DescribeSObjectsResponse_element();
		__request.setSObjectType(sObjectType);
		if (__SessionHeader != null)
			__connection.addHeader(SessionHeader_qname, __SessionHeader);
		if (__PackageVersionHeader != null)
			__connection.addHeader(PackageVersionHeader_qname,
					__PackageVersionHeader);
		if (__LocaleOptions != null)
			__connection.addHeader(LocaleOptions_qname, __LocaleOptions);
		addHeaders(__connection);
		__response = (com.sforce.soap.enterprise.DescribeSObjectsResponse_element) __connection
				.send("",
						describeSObjects_qname,
						__request,
						describeSObjectsResponse_qname,
						com.sforce.soap.enterprise.DescribeSObjectsResponse_element.class);
		return __response.getResult();
	}

	public com.sforce.soap.enterprise.GetUpdatedResult getUpdated(
			java.lang.String sObjectType, java.util.Calendar startDate,
			java.util.Calendar endDate)
			throws com.sforce.ws.ConnectionException {
		com.sforce.ws.transport.SoapConnection __connection = newConnection();
		com.sforce.soap.enterprise.GetUpdated_element __request = new com.sforce.soap.enterprise.GetUpdated_element();
		com.sforce.soap.enterprise.GetUpdatedResponse_element __response = new com.sforce.soap.enterprise.GetUpdatedResponse_element();
		__request.setSObjectType(sObjectType);
		__request.setStartDate(startDate);
		__request.setEndDate(endDate);
		if (__SessionHeader != null)
			__connection.addHeader(SessionHeader_qname, __SessionHeader);
		addHeaders(__connection);
		__response = (com.sforce.soap.enterprise.GetUpdatedResponse_element) __connection
				.send("",
						getUpdated_qname,
						__request,
						getUpdatedResponse_qname,
						com.sforce.soap.enterprise.GetUpdatedResponse_element.class);
		return __response.getResult();
	}

	public com.sforce.soap.enterprise.QueryResult queryAll(
			java.lang.String queryString)
			throws com.sforce.ws.ConnectionException {
		com.sforce.ws.transport.SoapConnection __connection = newConnection();
		com.sforce.soap.enterprise.QueryAll_element __request = new com.sforce.soap.enterprise.QueryAll_element();
		com.sforce.soap.enterprise.QueryAllResponse_element __response = new com.sforce.soap.enterprise.QueryAllResponse_element();
		__request.setQueryString(queryString);
		if (__SessionHeader != null)
			__connection.addHeader(SessionHeader_qname, __SessionHeader);
		if (__QueryOptions != null)
			__connection.addHeader(QueryOptions_qname, __QueryOptions);
		addHeaders(__connection);
		__response = (com.sforce.soap.enterprise.QueryAllResponse_element) __connection
				.send("",
						queryAll_qname,
						__request,
						queryAllResponse_qname,
						com.sforce.soap.enterprise.QueryAllResponse_element.class);
		return __response.getResult();
	}

	public com.sforce.soap.enterprise.DescribeGlobalResult describeGlobal()
			throws com.sforce.ws.ConnectionException {
		com.sforce.ws.transport.SoapConnection __connection = newConnection();
		com.sforce.soap.enterprise.DescribeGlobal_element __request = new com.sforce.soap.enterprise.DescribeGlobal_element();
		com.sforce.soap.enterprise.DescribeGlobalResponse_element __response = new com.sforce.soap.enterprise.DescribeGlobalResponse_element();
		if (__SessionHeader != null)
			__connection.addHeader(SessionHeader_qname, __SessionHeader);
		if (__PackageVersionHeader != null)
			__connection.addHeader(PackageVersionHeader_qname,
					__PackageVersionHeader);
		addHeaders(__connection);
		__response = (com.sforce.soap.enterprise.DescribeGlobalResponse_element) __connection
				.send("",
						describeGlobal_qname,
						__request,
						describeGlobalResponse_qname,
						com.sforce.soap.enterprise.DescribeGlobalResponse_element.class);
		return __response.getResult();
	}

	public com.sforce.soap.enterprise.sobject.SObject[] retrieve(
			java.lang.String fieldList, java.lang.String sObjectType,
			java.lang.String[] ids) throws com.sforce.ws.ConnectionException {
		com.sforce.ws.transport.SoapConnection __connection = newConnection();
		com.sforce.soap.enterprise.Retrieve_element __request = new com.sforce.soap.enterprise.Retrieve_element();
		com.sforce.soap.enterprise.RetrieveResponse_element __response = new com.sforce.soap.enterprise.RetrieveResponse_element();
		__request.setFieldList(fieldList);
		__request.setSObjectType(sObjectType);
		__request.setIds(ids);
		if (__SessionHeader != null)
			__connection.addHeader(SessionHeader_qname, __SessionHeader);
		if (__QueryOptions != null)
			__connection.addHeader(QueryOptions_qname, __QueryOptions);
		if (__MruHeader != null)
			__connection.addHeader(MruHeader_qname, __MruHeader);
		if (__PackageVersionHeader != null)
			__connection.addHeader(PackageVersionHeader_qname,
					__PackageVersionHeader);
		addHeaders(__connection);
		__response = (com.sforce.soap.enterprise.RetrieveResponse_element) __connection
				.send("",
						retrieve_qname,
						__request,
						retrieveResponse_qname,
						com.sforce.soap.enterprise.RetrieveResponse_element.class);
		return __response.getResult();
	}

	public void logout() throws com.sforce.ws.ConnectionException {
		com.sforce.ws.transport.SoapConnection __connection = newConnection();
		com.sforce.soap.enterprise.Logout_element __request = new com.sforce.soap.enterprise.Logout_element();
		com.sforce.soap.enterprise.LogoutResponse_element __response = new com.sforce.soap.enterprise.LogoutResponse_element();
		if (__SessionHeader != null)
			__connection.addHeader(SessionHeader_qname, __SessionHeader);
		addHeaders(__connection);
		__response = (com.sforce.soap.enterprise.LogoutResponse_element) __connection
				.send("", logout_qname, __request, logoutResponse_qname,
						com.sforce.soap.enterprise.LogoutResponse_element.class);
	}

	public com.sforce.soap.enterprise.DescribeLayoutResult describeLayout(
			java.lang.String sObjectType, java.lang.String[] recordTypeIds)
			throws com.sforce.ws.ConnectionException {
		com.sforce.ws.transport.SoapConnection __connection = newConnection();
		com.sforce.soap.enterprise.DescribeLayout_element __request = new com.sforce.soap.enterprise.DescribeLayout_element();
		com.sforce.soap.enterprise.DescribeLayoutResponse_element __response = new com.sforce.soap.enterprise.DescribeLayoutResponse_element();
		__request.setSObjectType(sObjectType);
		__request.setRecordTypeIds(recordTypeIds);
		if (__SessionHeader != null)
			__connection.addHeader(SessionHeader_qname, __SessionHeader);
		if (__PackageVersionHeader != null)
			__connection.addHeader(PackageVersionHeader_qname,
					__PackageVersionHeader);
		addHeaders(__connection);
		__response = (com.sforce.soap.enterprise.DescribeLayoutResponse_element) __connection
				.send("",
						describeLayout_qname,
						__request,
						describeLayoutResponse_qname,
						com.sforce.soap.enterprise.DescribeLayoutResponse_element.class);
		return __response.getResult();
	}

	public com.sforce.soap.enterprise.EmptyRecycleBinResult[] emptyRecycleBin(
			java.lang.String[] ids) throws com.sforce.ws.ConnectionException {
		com.sforce.ws.transport.SoapConnection __connection = newConnection();
		com.sforce.soap.enterprise.EmptyRecycleBin_element __request = new com.sforce.soap.enterprise.EmptyRecycleBin_element();
		com.sforce.soap.enterprise.EmptyRecycleBinResponse_element __response = new com.sforce.soap.enterprise.EmptyRecycleBinResponse_element();
		__request.setIds(ids);
		if (__SessionHeader != null)
			__connection.addHeader(SessionHeader_qname, __SessionHeader);
		addHeaders(__connection);
		__response = (com.sforce.soap.enterprise.EmptyRecycleBinResponse_element) __connection
				.send("",
						emptyRecycleBin_qname,
						__request,
						emptyRecycleBinResponse_qname,
						com.sforce.soap.enterprise.EmptyRecycleBinResponse_element.class);
		return __response.getResult();
	}

	public com.sforce.soap.enterprise.ProcessResult[] process(
			com.sforce.soap.enterprise.ProcessRequest[] actions)
			throws com.sforce.ws.ConnectionException {
		com.sforce.ws.transport.SoapConnection __connection = newConnection();
		com.sforce.soap.enterprise.Process_element __request = new com.sforce.soap.enterprise.Process_element();
		com.sforce.soap.enterprise.ProcessResponse_element __response = new com.sforce.soap.enterprise.ProcessResponse_element();
		__request.setActions(actions);
		if (__SessionHeader != null)
			__connection.addHeader(SessionHeader_qname, __SessionHeader);
		if (__AllowFieldTruncationHeader != null)
			__connection.addHeader(AllowFieldTruncationHeader_qname,
					__AllowFieldTruncationHeader);
		if (__DisableFeedTrackingHeader != null)
			__connection.addHeader(DisableFeedTrackingHeader_qname,
					__DisableFeedTrackingHeader);
		if (__StreamingEnabledHeader != null)
			__connection.addHeader(StreamingEnabledHeader_qname,
					__StreamingEnabledHeader);
		if (__DebuggingHeader != null)
			__connection.addHeader(DebuggingHeader_qname, __DebuggingHeader);
		if (__PackageVersionHeader != null)
			__connection.addHeader(PackageVersionHeader_qname,
					__PackageVersionHeader);
		addHeaders(__connection);
		__response = (com.sforce.soap.enterprise.ProcessResponse_element) __connection
				.send("",
						process_qname,
						__request,
						processResponse_qname,
						com.sforce.soap.enterprise.ProcessResponse_element.class);
		return __response.getResult();
	}

	public com.sforce.soap.enterprise.DescribeDataCategoryGroupStructureResult[] describeDataCategoryGroupStructures(
			com.sforce.soap.enterprise.DataCategoryGroupSobjectTypePair[] pairs,
			boolean topCategoriesOnly) throws com.sforce.ws.ConnectionException {
		com.sforce.ws.transport.SoapConnection __connection = newConnection();
		com.sforce.soap.enterprise.DescribeDataCategoryGroupStructures_element __request = new com.sforce.soap.enterprise.DescribeDataCategoryGroupStructures_element();
		com.sforce.soap.enterprise.DescribeDataCategoryGroupStructuresResponse_element __response = new com.sforce.soap.enterprise.DescribeDataCategoryGroupStructuresResponse_element();
		__request.setPairs(pairs);
		__request.setTopCategoriesOnly(topCategoriesOnly);
		if (__SessionHeader != null)
			__connection.addHeader(SessionHeader_qname, __SessionHeader);
		if (__PackageVersionHeader != null)
			__connection.addHeader(PackageVersionHeader_qname,
					__PackageVersionHeader);
		if (__LocaleOptions != null)
			__connection.addHeader(LocaleOptions_qname, __LocaleOptions);
		addHeaders(__connection);
		__response = (com.sforce.soap.enterprise.DescribeDataCategoryGroupStructuresResponse_element) __connection
				.send("",
						describeDataCategoryGroupStructures_qname,
						__request,
						describeDataCategoryGroupStructuresResponse_qname,
						com.sforce.soap.enterprise.DescribeDataCategoryGroupStructuresResponse_element.class);
		return __response.getResult();
	}

	public com.sforce.soap.enterprise.SendEmailResult[] sendEmail(
			com.sforce.soap.enterprise.Email[] messages)
			throws com.sforce.ws.ConnectionException {
		com.sforce.ws.transport.SoapConnection __connection = newConnection();
		com.sforce.soap.enterprise.SendEmail_element __request = new com.sforce.soap.enterprise.SendEmail_element();
		com.sforce.soap.enterprise.SendEmailResponse_element __response = new com.sforce.soap.enterprise.SendEmailResponse_element();
		__request.setMessages(messages);
		if (__SessionHeader != null)
			__connection.addHeader(SessionHeader_qname, __SessionHeader);
		addHeaders(__connection);
		__response = (com.sforce.soap.enterprise.SendEmailResponse_element) __connection
				.send("",
						sendEmail_qname,
						__request,
						sendEmailResponse_qname,
						com.sforce.soap.enterprise.SendEmailResponse_element.class);
		return __response.getResult();
	}

	public com.sforce.soap.enterprise.LeadConvertResult[] convertLead(
			com.sforce.soap.enterprise.LeadConvert[] leadConverts)
			throws com.sforce.ws.ConnectionException {
		com.sforce.ws.transport.SoapConnection __connection = newConnection();
		com.sforce.soap.enterprise.ConvertLead_element __request = new com.sforce.soap.enterprise.ConvertLead_element();
		com.sforce.soap.enterprise.ConvertLeadResponse_element __response = new com.sforce.soap.enterprise.ConvertLeadResponse_element();
		__request.setLeadConverts(leadConverts);
		if (__SessionHeader != null)
			__connection.addHeader(SessionHeader_qname, __SessionHeader);
		if (__AllowFieldTruncationHeader != null)
			__connection.addHeader(AllowFieldTruncationHeader_qname,
					__AllowFieldTruncationHeader);
		if (__DisableFeedTrackingHeader != null)
			__connection.addHeader(DisableFeedTrackingHeader_qname,
					__DisableFeedTrackingHeader);
		if (__StreamingEnabledHeader != null)
			__connection.addHeader(StreamingEnabledHeader_qname,
					__StreamingEnabledHeader);
		if (__DebuggingHeader != null)
			__connection.addHeader(DebuggingHeader_qname, __DebuggingHeader);
		if (__PackageVersionHeader != null)
			__connection.addHeader(PackageVersionHeader_qname,
					__PackageVersionHeader);
		addHeaders(__connection);
		__response = (com.sforce.soap.enterprise.ConvertLeadResponse_element) __connection
				.send("",
						convertLead_qname,
						__request,
						convertLeadResponse_qname,
						com.sforce.soap.enterprise.ConvertLeadResponse_element.class);
		return __response.getResult();
	}

	public com.sforce.soap.enterprise.GetDeletedResult getDeleted(
			java.lang.String sObjectType, java.util.Calendar startDate,
			java.util.Calendar endDate)
			throws com.sforce.ws.ConnectionException {
		com.sforce.ws.transport.SoapConnection __connection = newConnection();
		com.sforce.soap.enterprise.GetDeleted_element __request = new com.sforce.soap.enterprise.GetDeleted_element();
		com.sforce.soap.enterprise.GetDeletedResponse_element __response = new com.sforce.soap.enterprise.GetDeletedResponse_element();
		__request.setSObjectType(sObjectType);
		__request.setStartDate(startDate);
		__request.setEndDate(endDate);
		if (__SessionHeader != null)
			__connection.addHeader(SessionHeader_qname, __SessionHeader);
		addHeaders(__connection);
		__response = (com.sforce.soap.enterprise.GetDeletedResponse_element) __connection
				.send("",
						getDeleted_qname,
						__request,
						getDeletedResponse_qname,
						com.sforce.soap.enterprise.GetDeletedResponse_element.class);
		return __response.getResult();
	}

	public com.sforce.soap.enterprise.SaveResult[] create(
			com.sforce.soap.enterprise.sobject.SObject[] sObjects)
			throws com.sforce.ws.ConnectionException {
		com.sforce.ws.transport.SoapConnection __connection = newConnection();
		com.sforce.soap.enterprise.Create_element __request = new com.sforce.soap.enterprise.Create_element();
		com.sforce.soap.enterprise.CreateResponse_element __response = new com.sforce.soap.enterprise.CreateResponse_element();
		__request.setSObjects(sObjects);
		if (__SessionHeader != null)
			__connection.addHeader(SessionHeader_qname, __SessionHeader);
		if (__AssignmentRuleHeader != null)
			__connection.addHeader(AssignmentRuleHeader_qname,
					__AssignmentRuleHeader);
		if (__MruHeader != null)
			__connection.addHeader(MruHeader_qname, __MruHeader);
		if (__AllowFieldTruncationHeader != null)
			__connection.addHeader(AllowFieldTruncationHeader_qname,
					__AllowFieldTruncationHeader);
		if (__DisableFeedTrackingHeader != null)
			__connection.addHeader(DisableFeedTrackingHeader_qname,
					__DisableFeedTrackingHeader);
		if (__StreamingEnabledHeader != null)
			__connection.addHeader(StreamingEnabledHeader_qname,
					__StreamingEnabledHeader);
		if (__AllOrNoneHeader != null)
			__connection.addHeader(AllOrNoneHeader_qname, __AllOrNoneHeader);
		if (__DebuggingHeader != null)
			__connection.addHeader(DebuggingHeader_qname, __DebuggingHeader);
		if (__PackageVersionHeader != null)
			__connection.addHeader(PackageVersionHeader_qname,
					__PackageVersionHeader);
		if (__EmailHeader != null)
			__connection.addHeader(EmailHeader_qname, __EmailHeader);
		addHeaders(__connection);
		__response = (com.sforce.soap.enterprise.CreateResponse_element) __connection
				.send("", create_qname, __request, createResponse_qname,
						com.sforce.soap.enterprise.CreateResponse_element.class);
		return __response.getResult();
	}

	public com.sforce.soap.enterprise.InvalidateSessionsResult[] invalidateSessions(
			java.lang.String[] sessionIds)
			throws com.sforce.ws.ConnectionException {
		com.sforce.ws.transport.SoapConnection __connection = newConnection();
		com.sforce.soap.enterprise.InvalidateSessions_element __request = new com.sforce.soap.enterprise.InvalidateSessions_element();
		com.sforce.soap.enterprise.InvalidateSessionsResponse_element __response = new com.sforce.soap.enterprise.InvalidateSessionsResponse_element();
		__request.setSessionIds(sessionIds);
		if (__SessionHeader != null)
			__connection.addHeader(SessionHeader_qname, __SessionHeader);
		addHeaders(__connection);
		__response = (com.sforce.soap.enterprise.InvalidateSessionsResponse_element) __connection
				.send("",
						invalidateSessions_qname,
						__request,
						invalidateSessionsResponse_qname,
						com.sforce.soap.enterprise.InvalidateSessionsResponse_element.class);
		return __response.getResult();
	}

	public com.sforce.soap.enterprise.GetServerTimestampResult getServerTimestamp()
			throws com.sforce.ws.ConnectionException {
		com.sforce.ws.transport.SoapConnection __connection = newConnection();
		com.sforce.soap.enterprise.GetServerTimestamp_element __request = new com.sforce.soap.enterprise.GetServerTimestamp_element();
		com.sforce.soap.enterprise.GetServerTimestampResponse_element __response = new com.sforce.soap.enterprise.GetServerTimestampResponse_element();
		if (__SessionHeader != null)
			__connection.addHeader(SessionHeader_qname, __SessionHeader);
		addHeaders(__connection);
		__response = (com.sforce.soap.enterprise.GetServerTimestampResponse_element) __connection
				.send("",
						getServerTimestamp_qname,
						__request,
						getServerTimestampResponse_qname,
						com.sforce.soap.enterprise.GetServerTimestampResponse_element.class);
		return __response.getResult();
	}

	public com.sforce.soap.enterprise.GetUserInfoResult getUserInfo()
			throws com.sforce.ws.ConnectionException {
		com.sforce.ws.transport.SoapConnection __connection = newConnection();
		com.sforce.soap.enterprise.GetUserInfo_element __request = new com.sforce.soap.enterprise.GetUserInfo_element();
		com.sforce.soap.enterprise.GetUserInfoResponse_element __response = new com.sforce.soap.enterprise.GetUserInfoResponse_element();
		if (__SessionHeader != null)
			__connection.addHeader(SessionHeader_qname, __SessionHeader);
		addHeaders(__connection);
		__response = (com.sforce.soap.enterprise.GetUserInfoResponse_element) __connection
				.send("",
						getUserInfo_qname,
						__request,
						getUserInfoResponse_qname,
						com.sforce.soap.enterprise.GetUserInfoResponse_element.class);
		return __response.getResult();
	}

	private void addHeaders(com.sforce.ws.transport.SoapConnection __connection) {
		for (java.util.Map.Entry<QName, XMLizable> entry : __extraHeaders
				.entrySet()) {
			__connection.addHeader(entry.getKey(), entry.getValue());
		}
	}

	public void addExtraHeader(QName __headerName, XMLizable __value) {
		__extraHeaders.put(__headerName, __value);
	}

	public void removeExtraHeader(QName __headerName) {
		__extraHeaders.remove(__headerName);
	}

	public XMLizable getExtraHeader(QName __headerName) {
		return __extraHeaders.get(__headerName);
	}

	public void clearExtraHeaders() {
		__extraHeaders = new HashMap<QName, XMLizable>();
	}

	private static final javax.xml.namespace.QName search_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "search");
	private static final javax.xml.namespace.QName searchResponse_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "searchResponse");
	private static final javax.xml.namespace.QName queryMore_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "queryMore");
	private static final javax.xml.namespace.QName queryMoreResponse_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "queryMoreResponse");
	private static final javax.xml.namespace.QName describeDataCategoryGroups_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "describeDataCategoryGroups");
	private static final javax.xml.namespace.QName describeDataCategoryGroupsResponse_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com",
			"describeDataCategoryGroupsResponse");
	private static final javax.xml.namespace.QName describeSObject_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "describeSObject");
	private static final javax.xml.namespace.QName describeSObjectResponse_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "describeSObjectResponse");
	private static final javax.xml.namespace.QName describeSoftphoneLayout_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "describeSoftphoneLayout");
	private static final javax.xml.namespace.QName describeSoftphoneLayoutResponse_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "describeSoftphoneLayoutResponse");
	private static final javax.xml.namespace.QName setPassword_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "setPassword");
	private static final javax.xml.namespace.QName setPasswordResponse_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "setPasswordResponse");
	private static final javax.xml.namespace.QName describeTabs_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "describeTabs");
	private static final javax.xml.namespace.QName describeTabsResponse_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "describeTabsResponse");
	private static final javax.xml.namespace.QName login_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "login");
	private static final javax.xml.namespace.QName loginResponse_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "loginResponse");
	private static final javax.xml.namespace.QName delete_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "delete");
	private static final javax.xml.namespace.QName deleteResponse_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "deleteResponse");
	private static final javax.xml.namespace.QName merge_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "merge");
	private static final javax.xml.namespace.QName mergeResponse_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "mergeResponse");
	private static final javax.xml.namespace.QName query_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "query");
	private static final javax.xml.namespace.QName queryResponse_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "queryResponse");
	private static final javax.xml.namespace.QName resetPassword_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "resetPassword");
	private static final javax.xml.namespace.QName resetPasswordResponse_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "resetPasswordResponse");
	private static final javax.xml.namespace.QName update_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "update");
	private static final javax.xml.namespace.QName updateResponse_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "updateResponse");
	private static final javax.xml.namespace.QName undelete_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "undelete");
	private static final javax.xml.namespace.QName undeleteResponse_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "undeleteResponse");
	private static final javax.xml.namespace.QName upsert_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "upsert");
	private static final javax.xml.namespace.QName upsertResponse_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "upsertResponse");
	private static final javax.xml.namespace.QName describeSObjects_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "describeSObjects");
	private static final javax.xml.namespace.QName describeSObjectsResponse_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "describeSObjectsResponse");
	private static final javax.xml.namespace.QName getUpdated_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "getUpdated");
	private static final javax.xml.namespace.QName getUpdatedResponse_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "getUpdatedResponse");
	private static final javax.xml.namespace.QName queryAll_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "queryAll");
	private static final javax.xml.namespace.QName queryAllResponse_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "queryAllResponse");
	private static final javax.xml.namespace.QName describeGlobal_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "describeGlobal");
	private static final javax.xml.namespace.QName describeGlobalResponse_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "describeGlobalResponse");
	private static final javax.xml.namespace.QName retrieve_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "retrieve");
	private static final javax.xml.namespace.QName retrieveResponse_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "retrieveResponse");
	private static final javax.xml.namespace.QName logout_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "logout");
	private static final javax.xml.namespace.QName logoutResponse_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "logoutResponse");
	private static final javax.xml.namespace.QName describeLayout_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "describeLayout");
	private static final javax.xml.namespace.QName describeLayoutResponse_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "describeLayoutResponse");
	private static final javax.xml.namespace.QName emptyRecycleBin_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "emptyRecycleBin");
	private static final javax.xml.namespace.QName emptyRecycleBinResponse_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "emptyRecycleBinResponse");
	private static final javax.xml.namespace.QName process_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "process");
	private static final javax.xml.namespace.QName processResponse_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "processResponse");
	private static final javax.xml.namespace.QName describeDataCategoryGroupStructures_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com",
			"describeDataCategoryGroupStructures");
	private static final javax.xml.namespace.QName describeDataCategoryGroupStructuresResponse_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com",
			"describeDataCategoryGroupStructuresResponse");
	private static final javax.xml.namespace.QName sendEmail_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "sendEmail");
	private static final javax.xml.namespace.QName sendEmailResponse_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "sendEmailResponse");
	private static final javax.xml.namespace.QName convertLead_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "convertLead");
	private static final javax.xml.namespace.QName convertLeadResponse_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "convertLeadResponse");
	private static final javax.xml.namespace.QName getDeleted_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "getDeleted");
	private static final javax.xml.namespace.QName getDeletedResponse_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "getDeletedResponse");
	private static final javax.xml.namespace.QName create_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "create");
	private static final javax.xml.namespace.QName createResponse_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "createResponse");
	private static final javax.xml.namespace.QName invalidateSessions_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "invalidateSessions");
	private static final javax.xml.namespace.QName invalidateSessionsResponse_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "invalidateSessionsResponse");
	private static final javax.xml.namespace.QName getServerTimestamp_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "getServerTimestamp");
	private static final javax.xml.namespace.QName getServerTimestampResponse_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "getServerTimestampResponse");
	private static final javax.xml.namespace.QName getUserInfo_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "getUserInfo");
	private static final javax.xml.namespace.QName getUserInfoResponse_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "getUserInfoResponse");
	private static final javax.xml.namespace.QName QueryOptions_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "QueryOptions");
	private static final javax.xml.namespace.QName EmailHeader_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "EmailHeader");
	private static final javax.xml.namespace.QName DebuggingInfo_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "DebuggingInfo");
	private static final javax.xml.namespace.QName MruHeader_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "MruHeader");
	private static final javax.xml.namespace.QName PackageVersionHeader_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "PackageVersionHeader");
	private static final javax.xml.namespace.QName SessionHeader_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "SessionHeader");
	private static final javax.xml.namespace.QName LoginScopeHeader_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "LoginScopeHeader");
	private static final javax.xml.namespace.QName UserTerritoryDeleteHeader_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "UserTerritoryDeleteHeader");
	private static final javax.xml.namespace.QName AllowFieldTruncationHeader_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "AllowFieldTruncationHeader");
	private static final javax.xml.namespace.QName DebuggingHeader_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "DebuggingHeader");
	private static final javax.xml.namespace.QName AllOrNoneHeader_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "AllOrNoneHeader");
	private static final javax.xml.namespace.QName LocaleOptions_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "LocaleOptions");
	private static final javax.xml.namespace.QName AssignmentRuleHeader_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "AssignmentRuleHeader");
	private static final javax.xml.namespace.QName DisableFeedTrackingHeader_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "DisableFeedTrackingHeader");
	private static final javax.xml.namespace.QName StreamingEnabledHeader_qname = new javax.xml.namespace.QName(
			"urn:enterprise.soap.sforce.com", "StreamingEnabledHeader");
	private static HashMap<QName, java.lang.Class> knownHeaders = new HashMap<QName, java.lang.Class>();
	static {
		knownHeaders.put(QueryOptions_qname,
				com.sforce.soap.enterprise.QueryOptions_element.class);
		knownHeaders.put(EmailHeader_qname,
				com.sforce.soap.enterprise.EmailHeader_element.class);
		knownHeaders.put(DebuggingInfo_qname,
				com.sforce.soap.enterprise.DebuggingInfo_element.class);
		knownHeaders.put(MruHeader_qname,
				com.sforce.soap.enterprise.MruHeader_element.class);
		knownHeaders.put(PackageVersionHeader_qname,
				com.sforce.soap.enterprise.PackageVersionHeader_element.class);
		knownHeaders.put(SessionHeader_qname,
				com.sforce.soap.enterprise.SessionHeader_element.class);
		knownHeaders.put(LoginScopeHeader_qname,
				com.sforce.soap.enterprise.LoginScopeHeader_element.class);
		knownHeaders
				.put(UserTerritoryDeleteHeader_qname,
						com.sforce.soap.enterprise.UserTerritoryDeleteHeader_element.class);
		knownHeaders
				.put(AllowFieldTruncationHeader_qname,
						com.sforce.soap.enterprise.AllowFieldTruncationHeader_element.class);
		knownHeaders.put(DebuggingHeader_qname,
				com.sforce.soap.enterprise.DebuggingHeader_element.class);
		knownHeaders.put(AllOrNoneHeader_qname,
				com.sforce.soap.enterprise.AllOrNoneHeader_element.class);
		knownHeaders.put(LocaleOptions_qname,
				com.sforce.soap.enterprise.LocaleOptions_element.class);
		knownHeaders.put(AssignmentRuleHeader_qname,
				com.sforce.soap.enterprise.AssignmentRuleHeader_element.class);
		knownHeaders
				.put(DisableFeedTrackingHeader_qname,
						com.sforce.soap.enterprise.DisableFeedTrackingHeader_element.class);
		knownHeaders
				.put(StreamingEnabledHeader_qname,
						com.sforce.soap.enterprise.StreamingEnabledHeader_element.class);
	}
}