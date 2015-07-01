/**
 * PaymentMethodSnapshot.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zuora.api.object;

public class PaymentMethodSnapshot  extends com.zuora.api.object.ZObject  implements java.io.Serializable {
    private java.lang.String accountId;

    private java.lang.String achAbaCode;

    private java.lang.String achAccountName;

    private java.lang.String achAccountNumber;

    private java.lang.String achAccountNumberMask;

    private java.lang.String achAccountType;

    private java.lang.String achBankName;

    private java.lang.String bankBranchCode;

    private java.lang.String bankCheckDigit;

    private java.lang.String bankCity;

    private java.lang.String bankCode;

    private java.lang.String bankIdentificationNumber;

    private java.lang.String bankName;

    private java.lang.String bankPostalCode;

    private java.lang.String bankStreetName;

    private java.lang.String bankStreetNumber;

    private java.lang.String bankTransferAccountName;

    private java.lang.String bankTransferAccountNumber;

    private java.lang.String bankTransferAccountNumberMask;

    private java.lang.String bankTransferAccountType;

    private java.lang.String bankTransferType;

    private java.lang.String businessIdentificationCode;

    private java.lang.String city;

    private java.lang.String country;

    private java.lang.String creditCardAddress1;

    private java.lang.String creditCardAddress2;

    private java.lang.String creditCardCity;

    private java.lang.String creditCardCountry;

    private java.lang.Integer creditCardExpirationMonth;

    private java.lang.Integer creditCardExpirationYear;

    private java.lang.String creditCardHolderName;

    private java.lang.String creditCardMaskNumber;

    private java.lang.String creditCardNumber;

    private java.lang.String creditCardPostalCode;

    private java.lang.String creditCardState;

    private java.lang.String creditCardType;

    private java.lang.String deviceSessionId;

    private java.lang.String email;

    private java.lang.String existingMandate;

    private java.lang.String firstName;

    private java.lang.String IBAN;

    private java.lang.String IPAddress;

    private java.util.Calendar lastFailedSaleTransactionDate;

    private java.lang.String lastName;

    private java.util.Calendar lastTransactionDateTime;

    private java.lang.String lastTransactionStatus;

    private java.util.Calendar mandateCreationDate;

    private java.lang.String mandateID;

    private java.lang.String mandateReceived;

    private java.util.Calendar mandateUpdateDate;

    private java.lang.Short maxConsecutivePaymentFailures;

    private java.lang.String name;

    private java.lang.Integer numConsecutiveFailures;

    private java.lang.String paymentMethodId;

    private java.lang.String paymentMethodStatus;

    private java.lang.Short paymentRetryWindow;

    private java.lang.String paypalBaid;

    private java.lang.String paypalEmail;

    private java.lang.String paypalPreapprovalKey;

    private java.lang.String paypalType;

    private java.lang.String phone;

    private java.lang.String postalCode;

    private java.lang.String secondTokenId;

    private java.lang.String state;

    private java.lang.String streetName;

    private java.lang.String streetNumber;

    private java.lang.String tokenId;

    private java.lang.Integer totalNumberOfErrorPayments;

    private java.lang.Integer totalNumberOfProcessedPayments;

    private java.lang.String type;

    private java.lang.Boolean useDefaultRetryRule;

    public PaymentMethodSnapshot() {
    }

    public PaymentMethodSnapshot(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String accountId,
           java.lang.String achAbaCode,
           java.lang.String achAccountName,
           java.lang.String achAccountNumber,
           java.lang.String achAccountNumberMask,
           java.lang.String achAccountType,
           java.lang.String achBankName,
           java.lang.String bankBranchCode,
           java.lang.String bankCheckDigit,
           java.lang.String bankCity,
           java.lang.String bankCode,
           java.lang.String bankIdentificationNumber,
           java.lang.String bankName,
           java.lang.String bankPostalCode,
           java.lang.String bankStreetName,
           java.lang.String bankStreetNumber,
           java.lang.String bankTransferAccountName,
           java.lang.String bankTransferAccountNumber,
           java.lang.String bankTransferAccountNumberMask,
           java.lang.String bankTransferAccountType,
           java.lang.String bankTransferType,
           java.lang.String businessIdentificationCode,
           java.lang.String city,
           java.lang.String country,
           java.lang.String creditCardAddress1,
           java.lang.String creditCardAddress2,
           java.lang.String creditCardCity,
           java.lang.String creditCardCountry,
           java.lang.Integer creditCardExpirationMonth,
           java.lang.Integer creditCardExpirationYear,
           java.lang.String creditCardHolderName,
           java.lang.String creditCardMaskNumber,
           java.lang.String creditCardNumber,
           java.lang.String creditCardPostalCode,
           java.lang.String creditCardState,
           java.lang.String creditCardType,
           java.lang.String deviceSessionId,
           java.lang.String email,
           java.lang.String existingMandate,
           java.lang.String firstName,
           java.lang.String IBAN,
           java.lang.String IPAddress,
           java.util.Calendar lastFailedSaleTransactionDate,
           java.lang.String lastName,
           java.util.Calendar lastTransactionDateTime,
           java.lang.String lastTransactionStatus,
           java.util.Calendar mandateCreationDate,
           java.lang.String mandateID,
           java.lang.String mandateReceived,
           java.util.Calendar mandateUpdateDate,
           java.lang.Short maxConsecutivePaymentFailures,
           java.lang.String name,
           java.lang.Integer numConsecutiveFailures,
           java.lang.String paymentMethodId,
           java.lang.String paymentMethodStatus,
           java.lang.Short paymentRetryWindow,
           java.lang.String paypalBaid,
           java.lang.String paypalEmail,
           java.lang.String paypalPreapprovalKey,
           java.lang.String paypalType,
           java.lang.String phone,
           java.lang.String postalCode,
           java.lang.String secondTokenId,
           java.lang.String state,
           java.lang.String streetName,
           java.lang.String streetNumber,
           java.lang.String tokenId,
           java.lang.Integer totalNumberOfErrorPayments,
           java.lang.Integer totalNumberOfProcessedPayments,
           java.lang.String type,
           java.lang.Boolean useDefaultRetryRule) {
        super(
            fieldsToNull,
            id);
        this.accountId = accountId;
        this.achAbaCode = achAbaCode;
        this.achAccountName = achAccountName;
        this.achAccountNumber = achAccountNumber;
        this.achAccountNumberMask = achAccountNumberMask;
        this.achAccountType = achAccountType;
        this.achBankName = achBankName;
        this.bankBranchCode = bankBranchCode;
        this.bankCheckDigit = bankCheckDigit;
        this.bankCity = bankCity;
        this.bankCode = bankCode;
        this.bankIdentificationNumber = bankIdentificationNumber;
        this.bankName = bankName;
        this.bankPostalCode = bankPostalCode;
        this.bankStreetName = bankStreetName;
        this.bankStreetNumber = bankStreetNumber;
        this.bankTransferAccountName = bankTransferAccountName;
        this.bankTransferAccountNumber = bankTransferAccountNumber;
        this.bankTransferAccountNumberMask = bankTransferAccountNumberMask;
        this.bankTransferAccountType = bankTransferAccountType;
        this.bankTransferType = bankTransferType;
        this.businessIdentificationCode = businessIdentificationCode;
        this.city = city;
        this.country = country;
        this.creditCardAddress1 = creditCardAddress1;
        this.creditCardAddress2 = creditCardAddress2;
        this.creditCardCity = creditCardCity;
        this.creditCardCountry = creditCardCountry;
        this.creditCardExpirationMonth = creditCardExpirationMonth;
        this.creditCardExpirationYear = creditCardExpirationYear;
        this.creditCardHolderName = creditCardHolderName;
        this.creditCardMaskNumber = creditCardMaskNumber;
        this.creditCardNumber = creditCardNumber;
        this.creditCardPostalCode = creditCardPostalCode;
        this.creditCardState = creditCardState;
        this.creditCardType = creditCardType;
        this.deviceSessionId = deviceSessionId;
        this.email = email;
        this.existingMandate = existingMandate;
        this.firstName = firstName;
        this.IBAN = IBAN;
        this.IPAddress = IPAddress;
        this.lastFailedSaleTransactionDate = lastFailedSaleTransactionDate;
        this.lastName = lastName;
        this.lastTransactionDateTime = lastTransactionDateTime;
        this.lastTransactionStatus = lastTransactionStatus;
        this.mandateCreationDate = mandateCreationDate;
        this.mandateID = mandateID;
        this.mandateReceived = mandateReceived;
        this.mandateUpdateDate = mandateUpdateDate;
        this.maxConsecutivePaymentFailures = maxConsecutivePaymentFailures;
        this.name = name;
        this.numConsecutiveFailures = numConsecutiveFailures;
        this.paymentMethodId = paymentMethodId;
        this.paymentMethodStatus = paymentMethodStatus;
        this.paymentRetryWindow = paymentRetryWindow;
        this.paypalBaid = paypalBaid;
        this.paypalEmail = paypalEmail;
        this.paypalPreapprovalKey = paypalPreapprovalKey;
        this.paypalType = paypalType;
        this.phone = phone;
        this.postalCode = postalCode;
        this.secondTokenId = secondTokenId;
        this.state = state;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.tokenId = tokenId;
        this.totalNumberOfErrorPayments = totalNumberOfErrorPayments;
        this.totalNumberOfProcessedPayments = totalNumberOfProcessedPayments;
        this.type = type;
        this.useDefaultRetryRule = useDefaultRetryRule;
    }


    /**
     * Gets the accountId value for this PaymentMethodSnapshot.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this PaymentMethodSnapshot.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the achAbaCode value for this PaymentMethodSnapshot.
     * 
     * @return achAbaCode
     */
    public java.lang.String getAchAbaCode() {
        return achAbaCode;
    }


    /**
     * Sets the achAbaCode value for this PaymentMethodSnapshot.
     * 
     * @param achAbaCode
     */
    public void setAchAbaCode(java.lang.String achAbaCode) {
        this.achAbaCode = achAbaCode;
    }


    /**
     * Gets the achAccountName value for this PaymentMethodSnapshot.
     * 
     * @return achAccountName
     */
    public java.lang.String getAchAccountName() {
        return achAccountName;
    }


    /**
     * Sets the achAccountName value for this PaymentMethodSnapshot.
     * 
     * @param achAccountName
     */
    public void setAchAccountName(java.lang.String achAccountName) {
        this.achAccountName = achAccountName;
    }


    /**
     * Gets the achAccountNumber value for this PaymentMethodSnapshot.
     * 
     * @return achAccountNumber
     */
    public java.lang.String getAchAccountNumber() {
        return achAccountNumber;
    }


    /**
     * Sets the achAccountNumber value for this PaymentMethodSnapshot.
     * 
     * @param achAccountNumber
     */
    public void setAchAccountNumber(java.lang.String achAccountNumber) {
        this.achAccountNumber = achAccountNumber;
    }


    /**
     * Gets the achAccountNumberMask value for this PaymentMethodSnapshot.
     * 
     * @return achAccountNumberMask
     */
    public java.lang.String getAchAccountNumberMask() {
        return achAccountNumberMask;
    }


    /**
     * Sets the achAccountNumberMask value for this PaymentMethodSnapshot.
     * 
     * @param achAccountNumberMask
     */
    public void setAchAccountNumberMask(java.lang.String achAccountNumberMask) {
        this.achAccountNumberMask = achAccountNumberMask;
    }


    /**
     * Gets the achAccountType value for this PaymentMethodSnapshot.
     * 
     * @return achAccountType
     */
    public java.lang.String getAchAccountType() {
        return achAccountType;
    }


    /**
     * Sets the achAccountType value for this PaymentMethodSnapshot.
     * 
     * @param achAccountType
     */
    public void setAchAccountType(java.lang.String achAccountType) {
        this.achAccountType = achAccountType;
    }


    /**
     * Gets the achBankName value for this PaymentMethodSnapshot.
     * 
     * @return achBankName
     */
    public java.lang.String getAchBankName() {
        return achBankName;
    }


    /**
     * Sets the achBankName value for this PaymentMethodSnapshot.
     * 
     * @param achBankName
     */
    public void setAchBankName(java.lang.String achBankName) {
        this.achBankName = achBankName;
    }


    /**
     * Gets the bankBranchCode value for this PaymentMethodSnapshot.
     * 
     * @return bankBranchCode
     */
    public java.lang.String getBankBranchCode() {
        return bankBranchCode;
    }


    /**
     * Sets the bankBranchCode value for this PaymentMethodSnapshot.
     * 
     * @param bankBranchCode
     */
    public void setBankBranchCode(java.lang.String bankBranchCode) {
        this.bankBranchCode = bankBranchCode;
    }


    /**
     * Gets the bankCheckDigit value for this PaymentMethodSnapshot.
     * 
     * @return bankCheckDigit
     */
    public java.lang.String getBankCheckDigit() {
        return bankCheckDigit;
    }


    /**
     * Sets the bankCheckDigit value for this PaymentMethodSnapshot.
     * 
     * @param bankCheckDigit
     */
    public void setBankCheckDigit(java.lang.String bankCheckDigit) {
        this.bankCheckDigit = bankCheckDigit;
    }


    /**
     * Gets the bankCity value for this PaymentMethodSnapshot.
     * 
     * @return bankCity
     */
    public java.lang.String getBankCity() {
        return bankCity;
    }


    /**
     * Sets the bankCity value for this PaymentMethodSnapshot.
     * 
     * @param bankCity
     */
    public void setBankCity(java.lang.String bankCity) {
        this.bankCity = bankCity;
    }


    /**
     * Gets the bankCode value for this PaymentMethodSnapshot.
     * 
     * @return bankCode
     */
    public java.lang.String getBankCode() {
        return bankCode;
    }


    /**
     * Sets the bankCode value for this PaymentMethodSnapshot.
     * 
     * @param bankCode
     */
    public void setBankCode(java.lang.String bankCode) {
        this.bankCode = bankCode;
    }


    /**
     * Gets the bankIdentificationNumber value for this PaymentMethodSnapshot.
     * 
     * @return bankIdentificationNumber
     */
    public java.lang.String getBankIdentificationNumber() {
        return bankIdentificationNumber;
    }


    /**
     * Sets the bankIdentificationNumber value for this PaymentMethodSnapshot.
     * 
     * @param bankIdentificationNumber
     */
    public void setBankIdentificationNumber(java.lang.String bankIdentificationNumber) {
        this.bankIdentificationNumber = bankIdentificationNumber;
    }


    /**
     * Gets the bankName value for this PaymentMethodSnapshot.
     * 
     * @return bankName
     */
    public java.lang.String getBankName() {
        return bankName;
    }


    /**
     * Sets the bankName value for this PaymentMethodSnapshot.
     * 
     * @param bankName
     */
    public void setBankName(java.lang.String bankName) {
        this.bankName = bankName;
    }


    /**
     * Gets the bankPostalCode value for this PaymentMethodSnapshot.
     * 
     * @return bankPostalCode
     */
    public java.lang.String getBankPostalCode() {
        return bankPostalCode;
    }


    /**
     * Sets the bankPostalCode value for this PaymentMethodSnapshot.
     * 
     * @param bankPostalCode
     */
    public void setBankPostalCode(java.lang.String bankPostalCode) {
        this.bankPostalCode = bankPostalCode;
    }


    /**
     * Gets the bankStreetName value for this PaymentMethodSnapshot.
     * 
     * @return bankStreetName
     */
    public java.lang.String getBankStreetName() {
        return bankStreetName;
    }


    /**
     * Sets the bankStreetName value for this PaymentMethodSnapshot.
     * 
     * @param bankStreetName
     */
    public void setBankStreetName(java.lang.String bankStreetName) {
        this.bankStreetName = bankStreetName;
    }


    /**
     * Gets the bankStreetNumber value for this PaymentMethodSnapshot.
     * 
     * @return bankStreetNumber
     */
    public java.lang.String getBankStreetNumber() {
        return bankStreetNumber;
    }


    /**
     * Sets the bankStreetNumber value for this PaymentMethodSnapshot.
     * 
     * @param bankStreetNumber
     */
    public void setBankStreetNumber(java.lang.String bankStreetNumber) {
        this.bankStreetNumber = bankStreetNumber;
    }


    /**
     * Gets the bankTransferAccountName value for this PaymentMethodSnapshot.
     * 
     * @return bankTransferAccountName
     */
    public java.lang.String getBankTransferAccountName() {
        return bankTransferAccountName;
    }


    /**
     * Sets the bankTransferAccountName value for this PaymentMethodSnapshot.
     * 
     * @param bankTransferAccountName
     */
    public void setBankTransferAccountName(java.lang.String bankTransferAccountName) {
        this.bankTransferAccountName = bankTransferAccountName;
    }


    /**
     * Gets the bankTransferAccountNumber value for this PaymentMethodSnapshot.
     * 
     * @return bankTransferAccountNumber
     */
    public java.lang.String getBankTransferAccountNumber() {
        return bankTransferAccountNumber;
    }


    /**
     * Sets the bankTransferAccountNumber value for this PaymentMethodSnapshot.
     * 
     * @param bankTransferAccountNumber
     */
    public void setBankTransferAccountNumber(java.lang.String bankTransferAccountNumber) {
        this.bankTransferAccountNumber = bankTransferAccountNumber;
    }


    /**
     * Gets the bankTransferAccountNumberMask value for this PaymentMethodSnapshot.
     * 
     * @return bankTransferAccountNumberMask
     */
    public java.lang.String getBankTransferAccountNumberMask() {
        return bankTransferAccountNumberMask;
    }


    /**
     * Sets the bankTransferAccountNumberMask value for this PaymentMethodSnapshot.
     * 
     * @param bankTransferAccountNumberMask
     */
    public void setBankTransferAccountNumberMask(java.lang.String bankTransferAccountNumberMask) {
        this.bankTransferAccountNumberMask = bankTransferAccountNumberMask;
    }


    /**
     * Gets the bankTransferAccountType value for this PaymentMethodSnapshot.
     * 
     * @return bankTransferAccountType
     */
    public java.lang.String getBankTransferAccountType() {
        return bankTransferAccountType;
    }


    /**
     * Sets the bankTransferAccountType value for this PaymentMethodSnapshot.
     * 
     * @param bankTransferAccountType
     */
    public void setBankTransferAccountType(java.lang.String bankTransferAccountType) {
        this.bankTransferAccountType = bankTransferAccountType;
    }


    /**
     * Gets the bankTransferType value for this PaymentMethodSnapshot.
     * 
     * @return bankTransferType
     */
    public java.lang.String getBankTransferType() {
        return bankTransferType;
    }


    /**
     * Sets the bankTransferType value for this PaymentMethodSnapshot.
     * 
     * @param bankTransferType
     */
    public void setBankTransferType(java.lang.String bankTransferType) {
        this.bankTransferType = bankTransferType;
    }


    /**
     * Gets the businessIdentificationCode value for this PaymentMethodSnapshot.
     * 
     * @return businessIdentificationCode
     */
    public java.lang.String getBusinessIdentificationCode() {
        return businessIdentificationCode;
    }


    /**
     * Sets the businessIdentificationCode value for this PaymentMethodSnapshot.
     * 
     * @param businessIdentificationCode
     */
    public void setBusinessIdentificationCode(java.lang.String businessIdentificationCode) {
        this.businessIdentificationCode = businessIdentificationCode;
    }


    /**
     * Gets the city value for this PaymentMethodSnapshot.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this PaymentMethodSnapshot.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the country value for this PaymentMethodSnapshot.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this PaymentMethodSnapshot.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the creditCardAddress1 value for this PaymentMethodSnapshot.
     * 
     * @return creditCardAddress1
     */
    public java.lang.String getCreditCardAddress1() {
        return creditCardAddress1;
    }


    /**
     * Sets the creditCardAddress1 value for this PaymentMethodSnapshot.
     * 
     * @param creditCardAddress1
     */
    public void setCreditCardAddress1(java.lang.String creditCardAddress1) {
        this.creditCardAddress1 = creditCardAddress1;
    }


    /**
     * Gets the creditCardAddress2 value for this PaymentMethodSnapshot.
     * 
     * @return creditCardAddress2
     */
    public java.lang.String getCreditCardAddress2() {
        return creditCardAddress2;
    }


    /**
     * Sets the creditCardAddress2 value for this PaymentMethodSnapshot.
     * 
     * @param creditCardAddress2
     */
    public void setCreditCardAddress2(java.lang.String creditCardAddress2) {
        this.creditCardAddress2 = creditCardAddress2;
    }


    /**
     * Gets the creditCardCity value for this PaymentMethodSnapshot.
     * 
     * @return creditCardCity
     */
    public java.lang.String getCreditCardCity() {
        return creditCardCity;
    }


    /**
     * Sets the creditCardCity value for this PaymentMethodSnapshot.
     * 
     * @param creditCardCity
     */
    public void setCreditCardCity(java.lang.String creditCardCity) {
        this.creditCardCity = creditCardCity;
    }


    /**
     * Gets the creditCardCountry value for this PaymentMethodSnapshot.
     * 
     * @return creditCardCountry
     */
    public java.lang.String getCreditCardCountry() {
        return creditCardCountry;
    }


    /**
     * Sets the creditCardCountry value for this PaymentMethodSnapshot.
     * 
     * @param creditCardCountry
     */
    public void setCreditCardCountry(java.lang.String creditCardCountry) {
        this.creditCardCountry = creditCardCountry;
    }


    /**
     * Gets the creditCardExpirationMonth value for this PaymentMethodSnapshot.
     * 
     * @return creditCardExpirationMonth
     */
    public java.lang.Integer getCreditCardExpirationMonth() {
        return creditCardExpirationMonth;
    }


    /**
     * Sets the creditCardExpirationMonth value for this PaymentMethodSnapshot.
     * 
     * @param creditCardExpirationMonth
     */
    public void setCreditCardExpirationMonth(java.lang.Integer creditCardExpirationMonth) {
        this.creditCardExpirationMonth = creditCardExpirationMonth;
    }


    /**
     * Gets the creditCardExpirationYear value for this PaymentMethodSnapshot.
     * 
     * @return creditCardExpirationYear
     */
    public java.lang.Integer getCreditCardExpirationYear() {
        return creditCardExpirationYear;
    }


    /**
     * Sets the creditCardExpirationYear value for this PaymentMethodSnapshot.
     * 
     * @param creditCardExpirationYear
     */
    public void setCreditCardExpirationYear(java.lang.Integer creditCardExpirationYear) {
        this.creditCardExpirationYear = creditCardExpirationYear;
    }


    /**
     * Gets the creditCardHolderName value for this PaymentMethodSnapshot.
     * 
     * @return creditCardHolderName
     */
    public java.lang.String getCreditCardHolderName() {
        return creditCardHolderName;
    }


    /**
     * Sets the creditCardHolderName value for this PaymentMethodSnapshot.
     * 
     * @param creditCardHolderName
     */
    public void setCreditCardHolderName(java.lang.String creditCardHolderName) {
        this.creditCardHolderName = creditCardHolderName;
    }


    /**
     * Gets the creditCardMaskNumber value for this PaymentMethodSnapshot.
     * 
     * @return creditCardMaskNumber
     */
    public java.lang.String getCreditCardMaskNumber() {
        return creditCardMaskNumber;
    }


    /**
     * Sets the creditCardMaskNumber value for this PaymentMethodSnapshot.
     * 
     * @param creditCardMaskNumber
     */
    public void setCreditCardMaskNumber(java.lang.String creditCardMaskNumber) {
        this.creditCardMaskNumber = creditCardMaskNumber;
    }


    /**
     * Gets the creditCardNumber value for this PaymentMethodSnapshot.
     * 
     * @return creditCardNumber
     */
    public java.lang.String getCreditCardNumber() {
        return creditCardNumber;
    }


    /**
     * Sets the creditCardNumber value for this PaymentMethodSnapshot.
     * 
     * @param creditCardNumber
     */
    public void setCreditCardNumber(java.lang.String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }


    /**
     * Gets the creditCardPostalCode value for this PaymentMethodSnapshot.
     * 
     * @return creditCardPostalCode
     */
    public java.lang.String getCreditCardPostalCode() {
        return creditCardPostalCode;
    }


    /**
     * Sets the creditCardPostalCode value for this PaymentMethodSnapshot.
     * 
     * @param creditCardPostalCode
     */
    public void setCreditCardPostalCode(java.lang.String creditCardPostalCode) {
        this.creditCardPostalCode = creditCardPostalCode;
    }


    /**
     * Gets the creditCardState value for this PaymentMethodSnapshot.
     * 
     * @return creditCardState
     */
    public java.lang.String getCreditCardState() {
        return creditCardState;
    }


    /**
     * Sets the creditCardState value for this PaymentMethodSnapshot.
     * 
     * @param creditCardState
     */
    public void setCreditCardState(java.lang.String creditCardState) {
        this.creditCardState = creditCardState;
    }


    /**
     * Gets the creditCardType value for this PaymentMethodSnapshot.
     * 
     * @return creditCardType
     */
    public java.lang.String getCreditCardType() {
        return creditCardType;
    }


    /**
     * Sets the creditCardType value for this PaymentMethodSnapshot.
     * 
     * @param creditCardType
     */
    public void setCreditCardType(java.lang.String creditCardType) {
        this.creditCardType = creditCardType;
    }


    /**
     * Gets the deviceSessionId value for this PaymentMethodSnapshot.
     * 
     * @return deviceSessionId
     */
    public java.lang.String getDeviceSessionId() {
        return deviceSessionId;
    }


    /**
     * Sets the deviceSessionId value for this PaymentMethodSnapshot.
     * 
     * @param deviceSessionId
     */
    public void setDeviceSessionId(java.lang.String deviceSessionId) {
        this.deviceSessionId = deviceSessionId;
    }


    /**
     * Gets the email value for this PaymentMethodSnapshot.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this PaymentMethodSnapshot.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the existingMandate value for this PaymentMethodSnapshot.
     * 
     * @return existingMandate
     */
    public java.lang.String getExistingMandate() {
        return existingMandate;
    }


    /**
     * Sets the existingMandate value for this PaymentMethodSnapshot.
     * 
     * @param existingMandate
     */
    public void setExistingMandate(java.lang.String existingMandate) {
        this.existingMandate = existingMandate;
    }


    /**
     * Gets the firstName value for this PaymentMethodSnapshot.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this PaymentMethodSnapshot.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the IBAN value for this PaymentMethodSnapshot.
     * 
     * @return IBAN
     */
    public java.lang.String getIBAN() {
        return IBAN;
    }


    /**
     * Sets the IBAN value for this PaymentMethodSnapshot.
     * 
     * @param IBAN
     */
    public void setIBAN(java.lang.String IBAN) {
        this.IBAN = IBAN;
    }


    /**
     * Gets the IPAddress value for this PaymentMethodSnapshot.
     * 
     * @return IPAddress
     */
    public java.lang.String getIPAddress() {
        return IPAddress;
    }


    /**
     * Sets the IPAddress value for this PaymentMethodSnapshot.
     * 
     * @param IPAddress
     */
    public void setIPAddress(java.lang.String IPAddress) {
        this.IPAddress = IPAddress;
    }


    /**
     * Gets the lastFailedSaleTransactionDate value for this PaymentMethodSnapshot.
     * 
     * @return lastFailedSaleTransactionDate
     */
    public java.util.Calendar getLastFailedSaleTransactionDate() {
        return lastFailedSaleTransactionDate;
    }


    /**
     * Sets the lastFailedSaleTransactionDate value for this PaymentMethodSnapshot.
     * 
     * @param lastFailedSaleTransactionDate
     */
    public void setLastFailedSaleTransactionDate(java.util.Calendar lastFailedSaleTransactionDate) {
        this.lastFailedSaleTransactionDate = lastFailedSaleTransactionDate;
    }


    /**
     * Gets the lastName value for this PaymentMethodSnapshot.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this PaymentMethodSnapshot.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the lastTransactionDateTime value for this PaymentMethodSnapshot.
     * 
     * @return lastTransactionDateTime
     */
    public java.util.Calendar getLastTransactionDateTime() {
        return lastTransactionDateTime;
    }


    /**
     * Sets the lastTransactionDateTime value for this PaymentMethodSnapshot.
     * 
     * @param lastTransactionDateTime
     */
    public void setLastTransactionDateTime(java.util.Calendar lastTransactionDateTime) {
        this.lastTransactionDateTime = lastTransactionDateTime;
    }


    /**
     * Gets the lastTransactionStatus value for this PaymentMethodSnapshot.
     * 
     * @return lastTransactionStatus
     */
    public java.lang.String getLastTransactionStatus() {
        return lastTransactionStatus;
    }


    /**
     * Sets the lastTransactionStatus value for this PaymentMethodSnapshot.
     * 
     * @param lastTransactionStatus
     */
    public void setLastTransactionStatus(java.lang.String lastTransactionStatus) {
        this.lastTransactionStatus = lastTransactionStatus;
    }


    /**
     * Gets the mandateCreationDate value for this PaymentMethodSnapshot.
     * 
     * @return mandateCreationDate
     */
    public java.util.Calendar getMandateCreationDate() {
        return mandateCreationDate;
    }


    /**
     * Sets the mandateCreationDate value for this PaymentMethodSnapshot.
     * 
     * @param mandateCreationDate
     */
    public void setMandateCreationDate(java.util.Calendar mandateCreationDate) {
        this.mandateCreationDate = mandateCreationDate;
    }


    /**
     * Gets the mandateID value for this PaymentMethodSnapshot.
     * 
     * @return mandateID
     */
    public java.lang.String getMandateID() {
        return mandateID;
    }


    /**
     * Sets the mandateID value for this PaymentMethodSnapshot.
     * 
     * @param mandateID
     */
    public void setMandateID(java.lang.String mandateID) {
        this.mandateID = mandateID;
    }


    /**
     * Gets the mandateReceived value for this PaymentMethodSnapshot.
     * 
     * @return mandateReceived
     */
    public java.lang.String getMandateReceived() {
        return mandateReceived;
    }


    /**
     * Sets the mandateReceived value for this PaymentMethodSnapshot.
     * 
     * @param mandateReceived
     */
    public void setMandateReceived(java.lang.String mandateReceived) {
        this.mandateReceived = mandateReceived;
    }


    /**
     * Gets the mandateUpdateDate value for this PaymentMethodSnapshot.
     * 
     * @return mandateUpdateDate
     */
    public java.util.Calendar getMandateUpdateDate() {
        return mandateUpdateDate;
    }


    /**
     * Sets the mandateUpdateDate value for this PaymentMethodSnapshot.
     * 
     * @param mandateUpdateDate
     */
    public void setMandateUpdateDate(java.util.Calendar mandateUpdateDate) {
        this.mandateUpdateDate = mandateUpdateDate;
    }


    /**
     * Gets the maxConsecutivePaymentFailures value for this PaymentMethodSnapshot.
     * 
     * @return maxConsecutivePaymentFailures
     */
    public java.lang.Short getMaxConsecutivePaymentFailures() {
        return maxConsecutivePaymentFailures;
    }


    /**
     * Sets the maxConsecutivePaymentFailures value for this PaymentMethodSnapshot.
     * 
     * @param maxConsecutivePaymentFailures
     */
    public void setMaxConsecutivePaymentFailures(java.lang.Short maxConsecutivePaymentFailures) {
        this.maxConsecutivePaymentFailures = maxConsecutivePaymentFailures;
    }


    /**
     * Gets the name value for this PaymentMethodSnapshot.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this PaymentMethodSnapshot.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the numConsecutiveFailures value for this PaymentMethodSnapshot.
     * 
     * @return numConsecutiveFailures
     */
    public java.lang.Integer getNumConsecutiveFailures() {
        return numConsecutiveFailures;
    }


    /**
     * Sets the numConsecutiveFailures value for this PaymentMethodSnapshot.
     * 
     * @param numConsecutiveFailures
     */
    public void setNumConsecutiveFailures(java.lang.Integer numConsecutiveFailures) {
        this.numConsecutiveFailures = numConsecutiveFailures;
    }


    /**
     * Gets the paymentMethodId value for this PaymentMethodSnapshot.
     * 
     * @return paymentMethodId
     */
    public java.lang.String getPaymentMethodId() {
        return paymentMethodId;
    }


    /**
     * Sets the paymentMethodId value for this PaymentMethodSnapshot.
     * 
     * @param paymentMethodId
     */
    public void setPaymentMethodId(java.lang.String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }


    /**
     * Gets the paymentMethodStatus value for this PaymentMethodSnapshot.
     * 
     * @return paymentMethodStatus
     */
    public java.lang.String getPaymentMethodStatus() {
        return paymentMethodStatus;
    }


    /**
     * Sets the paymentMethodStatus value for this PaymentMethodSnapshot.
     * 
     * @param paymentMethodStatus
     */
    public void setPaymentMethodStatus(java.lang.String paymentMethodStatus) {
        this.paymentMethodStatus = paymentMethodStatus;
    }


    /**
     * Gets the paymentRetryWindow value for this PaymentMethodSnapshot.
     * 
     * @return paymentRetryWindow
     */
    public java.lang.Short getPaymentRetryWindow() {
        return paymentRetryWindow;
    }


    /**
     * Sets the paymentRetryWindow value for this PaymentMethodSnapshot.
     * 
     * @param paymentRetryWindow
     */
    public void setPaymentRetryWindow(java.lang.Short paymentRetryWindow) {
        this.paymentRetryWindow = paymentRetryWindow;
    }


    /**
     * Gets the paypalBaid value for this PaymentMethodSnapshot.
     * 
     * @return paypalBaid
     */
    public java.lang.String getPaypalBaid() {
        return paypalBaid;
    }


    /**
     * Sets the paypalBaid value for this PaymentMethodSnapshot.
     * 
     * @param paypalBaid
     */
    public void setPaypalBaid(java.lang.String paypalBaid) {
        this.paypalBaid = paypalBaid;
    }


    /**
     * Gets the paypalEmail value for this PaymentMethodSnapshot.
     * 
     * @return paypalEmail
     */
    public java.lang.String getPaypalEmail() {
        return paypalEmail;
    }


    /**
     * Sets the paypalEmail value for this PaymentMethodSnapshot.
     * 
     * @param paypalEmail
     */
    public void setPaypalEmail(java.lang.String paypalEmail) {
        this.paypalEmail = paypalEmail;
    }


    /**
     * Gets the paypalPreapprovalKey value for this PaymentMethodSnapshot.
     * 
     * @return paypalPreapprovalKey
     */
    public java.lang.String getPaypalPreapprovalKey() {
        return paypalPreapprovalKey;
    }


    /**
     * Sets the paypalPreapprovalKey value for this PaymentMethodSnapshot.
     * 
     * @param paypalPreapprovalKey
     */
    public void setPaypalPreapprovalKey(java.lang.String paypalPreapprovalKey) {
        this.paypalPreapprovalKey = paypalPreapprovalKey;
    }


    /**
     * Gets the paypalType value for this PaymentMethodSnapshot.
     * 
     * @return paypalType
     */
    public java.lang.String getPaypalType() {
        return paypalType;
    }


    /**
     * Sets the paypalType value for this PaymentMethodSnapshot.
     * 
     * @param paypalType
     */
    public void setPaypalType(java.lang.String paypalType) {
        this.paypalType = paypalType;
    }


    /**
     * Gets the phone value for this PaymentMethodSnapshot.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this PaymentMethodSnapshot.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the postalCode value for this PaymentMethodSnapshot.
     * 
     * @return postalCode
     */
    public java.lang.String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this PaymentMethodSnapshot.
     * 
     * @param postalCode
     */
    public void setPostalCode(java.lang.String postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the secondTokenId value for this PaymentMethodSnapshot.
     * 
     * @return secondTokenId
     */
    public java.lang.String getSecondTokenId() {
        return secondTokenId;
    }


    /**
     * Sets the secondTokenId value for this PaymentMethodSnapshot.
     * 
     * @param secondTokenId
     */
    public void setSecondTokenId(java.lang.String secondTokenId) {
        this.secondTokenId = secondTokenId;
    }


    /**
     * Gets the state value for this PaymentMethodSnapshot.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this PaymentMethodSnapshot.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the streetName value for this PaymentMethodSnapshot.
     * 
     * @return streetName
     */
    public java.lang.String getStreetName() {
        return streetName;
    }


    /**
     * Sets the streetName value for this PaymentMethodSnapshot.
     * 
     * @param streetName
     */
    public void setStreetName(java.lang.String streetName) {
        this.streetName = streetName;
    }


    /**
     * Gets the streetNumber value for this PaymentMethodSnapshot.
     * 
     * @return streetNumber
     */
    public java.lang.String getStreetNumber() {
        return streetNumber;
    }


    /**
     * Sets the streetNumber value for this PaymentMethodSnapshot.
     * 
     * @param streetNumber
     */
    public void setStreetNumber(java.lang.String streetNumber) {
        this.streetNumber = streetNumber;
    }


    /**
     * Gets the tokenId value for this PaymentMethodSnapshot.
     * 
     * @return tokenId
     */
    public java.lang.String getTokenId() {
        return tokenId;
    }


    /**
     * Sets the tokenId value for this PaymentMethodSnapshot.
     * 
     * @param tokenId
     */
    public void setTokenId(java.lang.String tokenId) {
        this.tokenId = tokenId;
    }


    /**
     * Gets the totalNumberOfErrorPayments value for this PaymentMethodSnapshot.
     * 
     * @return totalNumberOfErrorPayments
     */
    public java.lang.Integer getTotalNumberOfErrorPayments() {
        return totalNumberOfErrorPayments;
    }


    /**
     * Sets the totalNumberOfErrorPayments value for this PaymentMethodSnapshot.
     * 
     * @param totalNumberOfErrorPayments
     */
    public void setTotalNumberOfErrorPayments(java.lang.Integer totalNumberOfErrorPayments) {
        this.totalNumberOfErrorPayments = totalNumberOfErrorPayments;
    }


    /**
     * Gets the totalNumberOfProcessedPayments value for this PaymentMethodSnapshot.
     * 
     * @return totalNumberOfProcessedPayments
     */
    public java.lang.Integer getTotalNumberOfProcessedPayments() {
        return totalNumberOfProcessedPayments;
    }


    /**
     * Sets the totalNumberOfProcessedPayments value for this PaymentMethodSnapshot.
     * 
     * @param totalNumberOfProcessedPayments
     */
    public void setTotalNumberOfProcessedPayments(java.lang.Integer totalNumberOfProcessedPayments) {
        this.totalNumberOfProcessedPayments = totalNumberOfProcessedPayments;
    }


    /**
     * Gets the type value for this PaymentMethodSnapshot.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this PaymentMethodSnapshot.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the useDefaultRetryRule value for this PaymentMethodSnapshot.
     * 
     * @return useDefaultRetryRule
     */
    public java.lang.Boolean getUseDefaultRetryRule() {
        return useDefaultRetryRule;
    }


    /**
     * Sets the useDefaultRetryRule value for this PaymentMethodSnapshot.
     * 
     * @param useDefaultRetryRule
     */
    public void setUseDefaultRetryRule(java.lang.Boolean useDefaultRetryRule) {
        this.useDefaultRetryRule = useDefaultRetryRule;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentMethodSnapshot)) return false;
        PaymentMethodSnapshot other = (PaymentMethodSnapshot) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.achAbaCode==null && other.getAchAbaCode()==null) || 
             (this.achAbaCode!=null &&
              this.achAbaCode.equals(other.getAchAbaCode()))) &&
            ((this.achAccountName==null && other.getAchAccountName()==null) || 
             (this.achAccountName!=null &&
              this.achAccountName.equals(other.getAchAccountName()))) &&
            ((this.achAccountNumber==null && other.getAchAccountNumber()==null) || 
             (this.achAccountNumber!=null &&
              this.achAccountNumber.equals(other.getAchAccountNumber()))) &&
            ((this.achAccountNumberMask==null && other.getAchAccountNumberMask()==null) || 
             (this.achAccountNumberMask!=null &&
              this.achAccountNumberMask.equals(other.getAchAccountNumberMask()))) &&
            ((this.achAccountType==null && other.getAchAccountType()==null) || 
             (this.achAccountType!=null &&
              this.achAccountType.equals(other.getAchAccountType()))) &&
            ((this.achBankName==null && other.getAchBankName()==null) || 
             (this.achBankName!=null &&
              this.achBankName.equals(other.getAchBankName()))) &&
            ((this.bankBranchCode==null && other.getBankBranchCode()==null) || 
             (this.bankBranchCode!=null &&
              this.bankBranchCode.equals(other.getBankBranchCode()))) &&
            ((this.bankCheckDigit==null && other.getBankCheckDigit()==null) || 
             (this.bankCheckDigit!=null &&
              this.bankCheckDigit.equals(other.getBankCheckDigit()))) &&
            ((this.bankCity==null && other.getBankCity()==null) || 
             (this.bankCity!=null &&
              this.bankCity.equals(other.getBankCity()))) &&
            ((this.bankCode==null && other.getBankCode()==null) || 
             (this.bankCode!=null &&
              this.bankCode.equals(other.getBankCode()))) &&
            ((this.bankIdentificationNumber==null && other.getBankIdentificationNumber()==null) || 
             (this.bankIdentificationNumber!=null &&
              this.bankIdentificationNumber.equals(other.getBankIdentificationNumber()))) &&
            ((this.bankName==null && other.getBankName()==null) || 
             (this.bankName!=null &&
              this.bankName.equals(other.getBankName()))) &&
            ((this.bankPostalCode==null && other.getBankPostalCode()==null) || 
             (this.bankPostalCode!=null &&
              this.bankPostalCode.equals(other.getBankPostalCode()))) &&
            ((this.bankStreetName==null && other.getBankStreetName()==null) || 
             (this.bankStreetName!=null &&
              this.bankStreetName.equals(other.getBankStreetName()))) &&
            ((this.bankStreetNumber==null && other.getBankStreetNumber()==null) || 
             (this.bankStreetNumber!=null &&
              this.bankStreetNumber.equals(other.getBankStreetNumber()))) &&
            ((this.bankTransferAccountName==null && other.getBankTransferAccountName()==null) || 
             (this.bankTransferAccountName!=null &&
              this.bankTransferAccountName.equals(other.getBankTransferAccountName()))) &&
            ((this.bankTransferAccountNumber==null && other.getBankTransferAccountNumber()==null) || 
             (this.bankTransferAccountNumber!=null &&
              this.bankTransferAccountNumber.equals(other.getBankTransferAccountNumber()))) &&
            ((this.bankTransferAccountNumberMask==null && other.getBankTransferAccountNumberMask()==null) || 
             (this.bankTransferAccountNumberMask!=null &&
              this.bankTransferAccountNumberMask.equals(other.getBankTransferAccountNumberMask()))) &&
            ((this.bankTransferAccountType==null && other.getBankTransferAccountType()==null) || 
             (this.bankTransferAccountType!=null &&
              this.bankTransferAccountType.equals(other.getBankTransferAccountType()))) &&
            ((this.bankTransferType==null && other.getBankTransferType()==null) || 
             (this.bankTransferType!=null &&
              this.bankTransferType.equals(other.getBankTransferType()))) &&
            ((this.businessIdentificationCode==null && other.getBusinessIdentificationCode()==null) || 
             (this.businessIdentificationCode!=null &&
              this.businessIdentificationCode.equals(other.getBusinessIdentificationCode()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.creditCardAddress1==null && other.getCreditCardAddress1()==null) || 
             (this.creditCardAddress1!=null &&
              this.creditCardAddress1.equals(other.getCreditCardAddress1()))) &&
            ((this.creditCardAddress2==null && other.getCreditCardAddress2()==null) || 
             (this.creditCardAddress2!=null &&
              this.creditCardAddress2.equals(other.getCreditCardAddress2()))) &&
            ((this.creditCardCity==null && other.getCreditCardCity()==null) || 
             (this.creditCardCity!=null &&
              this.creditCardCity.equals(other.getCreditCardCity()))) &&
            ((this.creditCardCountry==null && other.getCreditCardCountry()==null) || 
             (this.creditCardCountry!=null &&
              this.creditCardCountry.equals(other.getCreditCardCountry()))) &&
            ((this.creditCardExpirationMonth==null && other.getCreditCardExpirationMonth()==null) || 
             (this.creditCardExpirationMonth!=null &&
              this.creditCardExpirationMonth.equals(other.getCreditCardExpirationMonth()))) &&
            ((this.creditCardExpirationYear==null && other.getCreditCardExpirationYear()==null) || 
             (this.creditCardExpirationYear!=null &&
              this.creditCardExpirationYear.equals(other.getCreditCardExpirationYear()))) &&
            ((this.creditCardHolderName==null && other.getCreditCardHolderName()==null) || 
             (this.creditCardHolderName!=null &&
              this.creditCardHolderName.equals(other.getCreditCardHolderName()))) &&
            ((this.creditCardMaskNumber==null && other.getCreditCardMaskNumber()==null) || 
             (this.creditCardMaskNumber!=null &&
              this.creditCardMaskNumber.equals(other.getCreditCardMaskNumber()))) &&
            ((this.creditCardNumber==null && other.getCreditCardNumber()==null) || 
             (this.creditCardNumber!=null &&
              this.creditCardNumber.equals(other.getCreditCardNumber()))) &&
            ((this.creditCardPostalCode==null && other.getCreditCardPostalCode()==null) || 
             (this.creditCardPostalCode!=null &&
              this.creditCardPostalCode.equals(other.getCreditCardPostalCode()))) &&
            ((this.creditCardState==null && other.getCreditCardState()==null) || 
             (this.creditCardState!=null &&
              this.creditCardState.equals(other.getCreditCardState()))) &&
            ((this.creditCardType==null && other.getCreditCardType()==null) || 
             (this.creditCardType!=null &&
              this.creditCardType.equals(other.getCreditCardType()))) &&
            ((this.deviceSessionId==null && other.getDeviceSessionId()==null) || 
             (this.deviceSessionId!=null &&
              this.deviceSessionId.equals(other.getDeviceSessionId()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.existingMandate==null && other.getExistingMandate()==null) || 
             (this.existingMandate!=null &&
              this.existingMandate.equals(other.getExistingMandate()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.IBAN==null && other.getIBAN()==null) || 
             (this.IBAN!=null &&
              this.IBAN.equals(other.getIBAN()))) &&
            ((this.IPAddress==null && other.getIPAddress()==null) || 
             (this.IPAddress!=null &&
              this.IPAddress.equals(other.getIPAddress()))) &&
            ((this.lastFailedSaleTransactionDate==null && other.getLastFailedSaleTransactionDate()==null) || 
             (this.lastFailedSaleTransactionDate!=null &&
              this.lastFailedSaleTransactionDate.equals(other.getLastFailedSaleTransactionDate()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.lastTransactionDateTime==null && other.getLastTransactionDateTime()==null) || 
             (this.lastTransactionDateTime!=null &&
              this.lastTransactionDateTime.equals(other.getLastTransactionDateTime()))) &&
            ((this.lastTransactionStatus==null && other.getLastTransactionStatus()==null) || 
             (this.lastTransactionStatus!=null &&
              this.lastTransactionStatus.equals(other.getLastTransactionStatus()))) &&
            ((this.mandateCreationDate==null && other.getMandateCreationDate()==null) || 
             (this.mandateCreationDate!=null &&
              this.mandateCreationDate.equals(other.getMandateCreationDate()))) &&
            ((this.mandateID==null && other.getMandateID()==null) || 
             (this.mandateID!=null &&
              this.mandateID.equals(other.getMandateID()))) &&
            ((this.mandateReceived==null && other.getMandateReceived()==null) || 
             (this.mandateReceived!=null &&
              this.mandateReceived.equals(other.getMandateReceived()))) &&
            ((this.mandateUpdateDate==null && other.getMandateUpdateDate()==null) || 
             (this.mandateUpdateDate!=null &&
              this.mandateUpdateDate.equals(other.getMandateUpdateDate()))) &&
            ((this.maxConsecutivePaymentFailures==null && other.getMaxConsecutivePaymentFailures()==null) || 
             (this.maxConsecutivePaymentFailures!=null &&
              this.maxConsecutivePaymentFailures.equals(other.getMaxConsecutivePaymentFailures()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.numConsecutiveFailures==null && other.getNumConsecutiveFailures()==null) || 
             (this.numConsecutiveFailures!=null &&
              this.numConsecutiveFailures.equals(other.getNumConsecutiveFailures()))) &&
            ((this.paymentMethodId==null && other.getPaymentMethodId()==null) || 
             (this.paymentMethodId!=null &&
              this.paymentMethodId.equals(other.getPaymentMethodId()))) &&
            ((this.paymentMethodStatus==null && other.getPaymentMethodStatus()==null) || 
             (this.paymentMethodStatus!=null &&
              this.paymentMethodStatus.equals(other.getPaymentMethodStatus()))) &&
            ((this.paymentRetryWindow==null && other.getPaymentRetryWindow()==null) || 
             (this.paymentRetryWindow!=null &&
              this.paymentRetryWindow.equals(other.getPaymentRetryWindow()))) &&
            ((this.paypalBaid==null && other.getPaypalBaid()==null) || 
             (this.paypalBaid!=null &&
              this.paypalBaid.equals(other.getPaypalBaid()))) &&
            ((this.paypalEmail==null && other.getPaypalEmail()==null) || 
             (this.paypalEmail!=null &&
              this.paypalEmail.equals(other.getPaypalEmail()))) &&
            ((this.paypalPreapprovalKey==null && other.getPaypalPreapprovalKey()==null) || 
             (this.paypalPreapprovalKey!=null &&
              this.paypalPreapprovalKey.equals(other.getPaypalPreapprovalKey()))) &&
            ((this.paypalType==null && other.getPaypalType()==null) || 
             (this.paypalType!=null &&
              this.paypalType.equals(other.getPaypalType()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            ((this.secondTokenId==null && other.getSecondTokenId()==null) || 
             (this.secondTokenId!=null &&
              this.secondTokenId.equals(other.getSecondTokenId()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.streetName==null && other.getStreetName()==null) || 
             (this.streetName!=null &&
              this.streetName.equals(other.getStreetName()))) &&
            ((this.streetNumber==null && other.getStreetNumber()==null) || 
             (this.streetNumber!=null &&
              this.streetNumber.equals(other.getStreetNumber()))) &&
            ((this.tokenId==null && other.getTokenId()==null) || 
             (this.tokenId!=null &&
              this.tokenId.equals(other.getTokenId()))) &&
            ((this.totalNumberOfErrorPayments==null && other.getTotalNumberOfErrorPayments()==null) || 
             (this.totalNumberOfErrorPayments!=null &&
              this.totalNumberOfErrorPayments.equals(other.getTotalNumberOfErrorPayments()))) &&
            ((this.totalNumberOfProcessedPayments==null && other.getTotalNumberOfProcessedPayments()==null) || 
             (this.totalNumberOfProcessedPayments!=null &&
              this.totalNumberOfProcessedPayments.equals(other.getTotalNumberOfProcessedPayments()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.useDefaultRetryRule==null && other.getUseDefaultRetryRule()==null) || 
             (this.useDefaultRetryRule!=null &&
              this.useDefaultRetryRule.equals(other.getUseDefaultRetryRule())));
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
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getAchAbaCode() != null) {
            _hashCode += getAchAbaCode().hashCode();
        }
        if (getAchAccountName() != null) {
            _hashCode += getAchAccountName().hashCode();
        }
        if (getAchAccountNumber() != null) {
            _hashCode += getAchAccountNumber().hashCode();
        }
        if (getAchAccountNumberMask() != null) {
            _hashCode += getAchAccountNumberMask().hashCode();
        }
        if (getAchAccountType() != null) {
            _hashCode += getAchAccountType().hashCode();
        }
        if (getAchBankName() != null) {
            _hashCode += getAchBankName().hashCode();
        }
        if (getBankBranchCode() != null) {
            _hashCode += getBankBranchCode().hashCode();
        }
        if (getBankCheckDigit() != null) {
            _hashCode += getBankCheckDigit().hashCode();
        }
        if (getBankCity() != null) {
            _hashCode += getBankCity().hashCode();
        }
        if (getBankCode() != null) {
            _hashCode += getBankCode().hashCode();
        }
        if (getBankIdentificationNumber() != null) {
            _hashCode += getBankIdentificationNumber().hashCode();
        }
        if (getBankName() != null) {
            _hashCode += getBankName().hashCode();
        }
        if (getBankPostalCode() != null) {
            _hashCode += getBankPostalCode().hashCode();
        }
        if (getBankStreetName() != null) {
            _hashCode += getBankStreetName().hashCode();
        }
        if (getBankStreetNumber() != null) {
            _hashCode += getBankStreetNumber().hashCode();
        }
        if (getBankTransferAccountName() != null) {
            _hashCode += getBankTransferAccountName().hashCode();
        }
        if (getBankTransferAccountNumber() != null) {
            _hashCode += getBankTransferAccountNumber().hashCode();
        }
        if (getBankTransferAccountNumberMask() != null) {
            _hashCode += getBankTransferAccountNumberMask().hashCode();
        }
        if (getBankTransferAccountType() != null) {
            _hashCode += getBankTransferAccountType().hashCode();
        }
        if (getBankTransferType() != null) {
            _hashCode += getBankTransferType().hashCode();
        }
        if (getBusinessIdentificationCode() != null) {
            _hashCode += getBusinessIdentificationCode().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getCreditCardAddress1() != null) {
            _hashCode += getCreditCardAddress1().hashCode();
        }
        if (getCreditCardAddress2() != null) {
            _hashCode += getCreditCardAddress2().hashCode();
        }
        if (getCreditCardCity() != null) {
            _hashCode += getCreditCardCity().hashCode();
        }
        if (getCreditCardCountry() != null) {
            _hashCode += getCreditCardCountry().hashCode();
        }
        if (getCreditCardExpirationMonth() != null) {
            _hashCode += getCreditCardExpirationMonth().hashCode();
        }
        if (getCreditCardExpirationYear() != null) {
            _hashCode += getCreditCardExpirationYear().hashCode();
        }
        if (getCreditCardHolderName() != null) {
            _hashCode += getCreditCardHolderName().hashCode();
        }
        if (getCreditCardMaskNumber() != null) {
            _hashCode += getCreditCardMaskNumber().hashCode();
        }
        if (getCreditCardNumber() != null) {
            _hashCode += getCreditCardNumber().hashCode();
        }
        if (getCreditCardPostalCode() != null) {
            _hashCode += getCreditCardPostalCode().hashCode();
        }
        if (getCreditCardState() != null) {
            _hashCode += getCreditCardState().hashCode();
        }
        if (getCreditCardType() != null) {
            _hashCode += getCreditCardType().hashCode();
        }
        if (getDeviceSessionId() != null) {
            _hashCode += getDeviceSessionId().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getExistingMandate() != null) {
            _hashCode += getExistingMandate().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getIBAN() != null) {
            _hashCode += getIBAN().hashCode();
        }
        if (getIPAddress() != null) {
            _hashCode += getIPAddress().hashCode();
        }
        if (getLastFailedSaleTransactionDate() != null) {
            _hashCode += getLastFailedSaleTransactionDate().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getLastTransactionDateTime() != null) {
            _hashCode += getLastTransactionDateTime().hashCode();
        }
        if (getLastTransactionStatus() != null) {
            _hashCode += getLastTransactionStatus().hashCode();
        }
        if (getMandateCreationDate() != null) {
            _hashCode += getMandateCreationDate().hashCode();
        }
        if (getMandateID() != null) {
            _hashCode += getMandateID().hashCode();
        }
        if (getMandateReceived() != null) {
            _hashCode += getMandateReceived().hashCode();
        }
        if (getMandateUpdateDate() != null) {
            _hashCode += getMandateUpdateDate().hashCode();
        }
        if (getMaxConsecutivePaymentFailures() != null) {
            _hashCode += getMaxConsecutivePaymentFailures().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNumConsecutiveFailures() != null) {
            _hashCode += getNumConsecutiveFailures().hashCode();
        }
        if (getPaymentMethodId() != null) {
            _hashCode += getPaymentMethodId().hashCode();
        }
        if (getPaymentMethodStatus() != null) {
            _hashCode += getPaymentMethodStatus().hashCode();
        }
        if (getPaymentRetryWindow() != null) {
            _hashCode += getPaymentRetryWindow().hashCode();
        }
        if (getPaypalBaid() != null) {
            _hashCode += getPaypalBaid().hashCode();
        }
        if (getPaypalEmail() != null) {
            _hashCode += getPaypalEmail().hashCode();
        }
        if (getPaypalPreapprovalKey() != null) {
            _hashCode += getPaypalPreapprovalKey().hashCode();
        }
        if (getPaypalType() != null) {
            _hashCode += getPaypalType().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        if (getSecondTokenId() != null) {
            _hashCode += getSecondTokenId().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getStreetName() != null) {
            _hashCode += getStreetName().hashCode();
        }
        if (getStreetNumber() != null) {
            _hashCode += getStreetNumber().hashCode();
        }
        if (getTokenId() != null) {
            _hashCode += getTokenId().hashCode();
        }
        if (getTotalNumberOfErrorPayments() != null) {
            _hashCode += getTotalNumberOfErrorPayments().hashCode();
        }
        if (getTotalNumberOfProcessedPayments() != null) {
            _hashCode += getTotalNumberOfProcessedPayments().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getUseDefaultRetryRule() != null) {
            _hashCode += getUseDefaultRetryRule().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentMethodSnapshot.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://object.api.zuora.com/", "PaymentMethodSnapshot"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("achAbaCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "AchAbaCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("achAccountName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "AchAccountName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("achAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "AchAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("achAccountNumberMask");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "AchAccountNumberMask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("achAccountType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "AchAccountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("achBankName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "AchBankName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankBranchCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "BankBranchCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankCheckDigit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "BankCheckDigit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "BankCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "BankCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankIdentificationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "BankIdentificationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "BankName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankPostalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "BankPostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankStreetName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "BankStreetName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankStreetNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "BankStreetNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankTransferAccountName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "BankTransferAccountName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankTransferAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "BankTransferAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankTransferAccountNumberMask");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "BankTransferAccountNumberMask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankTransferAccountType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "BankTransferAccountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankTransferType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "BankTransferType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessIdentificationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "BusinessIdentificationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardAddress1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CreditCardAddress1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardAddress2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CreditCardAddress2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CreditCardCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CreditCardCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardExpirationMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CreditCardExpirationMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardExpirationYear");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CreditCardExpirationYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardHolderName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CreditCardHolderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardMaskNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CreditCardMaskNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CreditCardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardPostalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CreditCardPostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CreditCardState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CreditCardType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceSessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "DeviceSessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("existingMandate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "ExistingMandate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "FirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IBAN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "IBAN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IPAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "IPAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastFailedSaleTransactionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "LastFailedSaleTransactionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "LastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastTransactionDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "LastTransactionDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastTransactionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "LastTransactionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mandateCreationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "MandateCreationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mandateID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "MandateID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mandateReceived");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "MandateReceived"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mandateUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "MandateUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxConsecutivePaymentFailures");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "MaxConsecutivePaymentFailures"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numConsecutiveFailures");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "NumConsecutiveFailures"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethodId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "PaymentMethodId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethodStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "PaymentMethodStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentRetryWindow");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "PaymentRetryWindow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paypalBaid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "PaypalBaid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paypalEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "PaypalEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paypalPreapprovalKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "PaypalPreapprovalKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paypalType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "PaypalType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "PostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondTokenId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "SecondTokenId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streetName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "StreetName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streetNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "StreetNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "TokenId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalNumberOfErrorPayments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "TotalNumberOfErrorPayments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalNumberOfProcessedPayments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "TotalNumberOfProcessedPayments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useDefaultRetryRule");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "UseDefaultRetryRule"));
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
