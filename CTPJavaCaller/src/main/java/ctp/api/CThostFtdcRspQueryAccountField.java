/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CThostFtdcRspQueryAccountField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CThostFtdcRspQueryAccountField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CThostFtdcRspQueryAccountField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcRspQueryAccountField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    ctpJNI.CThostFtdcRspQueryAccountField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return ctpJNI.CThostFtdcRspQueryAccountField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    ctpJNI.CThostFtdcRspQueryAccountField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return ctpJNI.CThostFtdcRspQueryAccountField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    ctpJNI.CThostFtdcRspQueryAccountField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return ctpJNI.CThostFtdcRspQueryAccountField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcRspQueryAccountField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcRspQueryAccountField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    ctpJNI.CThostFtdcRspQueryAccountField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return ctpJNI.CThostFtdcRspQueryAccountField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    ctpJNI.CThostFtdcRspQueryAccountField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return ctpJNI.CThostFtdcRspQueryAccountField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    ctpJNI.CThostFtdcRspQueryAccountField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return ctpJNI.CThostFtdcRspQueryAccountField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    ctpJNI.CThostFtdcRspQueryAccountField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return ctpJNI.CThostFtdcRspQueryAccountField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ctpJNI.CThostFtdcRspQueryAccountField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ctpJNI.CThostFtdcRspQueryAccountField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    ctpJNI.CThostFtdcRspQueryAccountField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return ctpJNI.CThostFtdcRspQueryAccountField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    ctpJNI.CThostFtdcRspQueryAccountField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return ctpJNI.CThostFtdcRspQueryAccountField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ctpJNI.CThostFtdcRspQueryAccountField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ctpJNI.CThostFtdcRspQueryAccountField_SessionID_get(swigCPtr, this);
  }

  public void setCustomerName(String value) {
    ctpJNI.CThostFtdcRspQueryAccountField_CustomerName_set(swigCPtr, this, value);
  }

  public String getCustomerName() {
    return ctpJNI.CThostFtdcRspQueryAccountField_CustomerName_get(swigCPtr, this);
  }

  public void setIdCardType(char value) {
    ctpJNI.CThostFtdcRspQueryAccountField_IdCardType_set(swigCPtr, this, value);
  }

  public char getIdCardType() {
    return ctpJNI.CThostFtdcRspQueryAccountField_IdCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    ctpJNI.CThostFtdcRspQueryAccountField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return ctpJNI.CThostFtdcRspQueryAccountField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setCustType(char value) {
    ctpJNI.CThostFtdcRspQueryAccountField_CustType_set(swigCPtr, this, value);
  }

  public char getCustType() {
    return ctpJNI.CThostFtdcRspQueryAccountField_CustType_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    ctpJNI.CThostFtdcRspQueryAccountField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return ctpJNI.CThostFtdcRspQueryAccountField_BankAccount_get(swigCPtr, this);
  }

  public void setBankPassWord(String value) {
    ctpJNI.CThostFtdcRspQueryAccountField_BankPassWord_set(swigCPtr, this, value);
  }

  public String getBankPassWord() {
    return ctpJNI.CThostFtdcRspQueryAccountField_BankPassWord_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    ctpJNI.CThostFtdcRspQueryAccountField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return ctpJNI.CThostFtdcRspQueryAccountField_AccountID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    ctpJNI.CThostFtdcRspQueryAccountField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return ctpJNI.CThostFtdcRspQueryAccountField_Password_get(swigCPtr, this);
  }

  public void setFutureSerial(int value) {
    ctpJNI.CThostFtdcRspQueryAccountField_FutureSerial_set(swigCPtr, this, value);
  }

  public int getFutureSerial() {
    return ctpJNI.CThostFtdcRspQueryAccountField_FutureSerial_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ctpJNI.CThostFtdcRspQueryAccountField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ctpJNI.CThostFtdcRspQueryAccountField_InstallID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpJNI.CThostFtdcRspQueryAccountField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpJNI.CThostFtdcRspQueryAccountField_UserID_get(swigCPtr, this);
  }

  public void setVerifyCertNoFlag(char value) {
    ctpJNI.CThostFtdcRspQueryAccountField_VerifyCertNoFlag_set(swigCPtr, this, value);
  }

  public char getVerifyCertNoFlag() {
    return ctpJNI.CThostFtdcRspQueryAccountField_VerifyCertNoFlag_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    ctpJNI.CThostFtdcRspQueryAccountField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return ctpJNI.CThostFtdcRspQueryAccountField_CurrencyID_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    ctpJNI.CThostFtdcRspQueryAccountField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return ctpJNI.CThostFtdcRspQueryAccountField_Digest_get(swigCPtr, this);
  }

  public void setBankAccType(char value) {
    ctpJNI.CThostFtdcRspQueryAccountField_BankAccType_set(swigCPtr, this, value);
  }

  public char getBankAccType() {
    return ctpJNI.CThostFtdcRspQueryAccountField_BankAccType_get(swigCPtr, this);
  }

  public void setDeviceID(String value) {
    ctpJNI.CThostFtdcRspQueryAccountField_DeviceID_set(swigCPtr, this, value);
  }

  public String getDeviceID() {
    return ctpJNI.CThostFtdcRspQueryAccountField_DeviceID_get(swigCPtr, this);
  }

  public void setBankSecuAccType(char value) {
    ctpJNI.CThostFtdcRspQueryAccountField_BankSecuAccType_set(swigCPtr, this, value);
  }

  public char getBankSecuAccType() {
    return ctpJNI.CThostFtdcRspQueryAccountField_BankSecuAccType_get(swigCPtr, this);
  }

  public void setBrokerIDByBank(String value) {
    ctpJNI.CThostFtdcRspQueryAccountField_BrokerIDByBank_set(swigCPtr, this, value);
  }

  public String getBrokerIDByBank() {
    return ctpJNI.CThostFtdcRspQueryAccountField_BrokerIDByBank_get(swigCPtr, this);
  }

  public void setBankSecuAcc(String value) {
    ctpJNI.CThostFtdcRspQueryAccountField_BankSecuAcc_set(swigCPtr, this, value);
  }

  public String getBankSecuAcc() {
    return ctpJNI.CThostFtdcRspQueryAccountField_BankSecuAcc_get(swigCPtr, this);
  }

  public void setBankPwdFlag(char value) {
    ctpJNI.CThostFtdcRspQueryAccountField_BankPwdFlag_set(swigCPtr, this, value);
  }

  public char getBankPwdFlag() {
    return ctpJNI.CThostFtdcRspQueryAccountField_BankPwdFlag_get(swigCPtr, this);
  }

  public void setSecuPwdFlag(char value) {
    ctpJNI.CThostFtdcRspQueryAccountField_SecuPwdFlag_set(swigCPtr, this, value);
  }

  public char getSecuPwdFlag() {
    return ctpJNI.CThostFtdcRspQueryAccountField_SecuPwdFlag_get(swigCPtr, this);
  }

  public void setOperNo(String value) {
    ctpJNI.CThostFtdcRspQueryAccountField_OperNo_set(swigCPtr, this, value);
  }

  public String getOperNo() {
    return ctpJNI.CThostFtdcRspQueryAccountField_OperNo_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    ctpJNI.CThostFtdcRspQueryAccountField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return ctpJNI.CThostFtdcRspQueryAccountField_RequestID_get(swigCPtr, this);
  }

  public void setTID(int value) {
    ctpJNI.CThostFtdcRspQueryAccountField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return ctpJNI.CThostFtdcRspQueryAccountField_TID_get(swigCPtr, this);
  }

  public void setBankUseAmount(double value) {
    ctpJNI.CThostFtdcRspQueryAccountField_BankUseAmount_set(swigCPtr, this, value);
  }

  public double getBankUseAmount() {
    return ctpJNI.CThostFtdcRspQueryAccountField_BankUseAmount_get(swigCPtr, this);
  }

  public void setBankFetchAmount(double value) {
    ctpJNI.CThostFtdcRspQueryAccountField_BankFetchAmount_set(swigCPtr, this, value);
  }

  public double getBankFetchAmount() {
    return ctpJNI.CThostFtdcRspQueryAccountField_BankFetchAmount_get(swigCPtr, this);
  }

  public CThostFtdcRspQueryAccountField() {
    this(ctpJNI.new_CThostFtdcRspQueryAccountField(), true);
  }

}
