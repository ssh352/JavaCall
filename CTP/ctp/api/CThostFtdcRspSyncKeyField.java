/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CThostFtdcRspSyncKeyField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CThostFtdcRspSyncKeyField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CThostFtdcRspSyncKeyField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcRspSyncKeyField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    ctpJNI.CThostFtdcRspSyncKeyField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return ctpJNI.CThostFtdcRspSyncKeyField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    ctpJNI.CThostFtdcRspSyncKeyField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return ctpJNI.CThostFtdcRspSyncKeyField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    ctpJNI.CThostFtdcRspSyncKeyField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return ctpJNI.CThostFtdcRspSyncKeyField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcRspSyncKeyField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcRspSyncKeyField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    ctpJNI.CThostFtdcRspSyncKeyField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return ctpJNI.CThostFtdcRspSyncKeyField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    ctpJNI.CThostFtdcRspSyncKeyField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return ctpJNI.CThostFtdcRspSyncKeyField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    ctpJNI.CThostFtdcRspSyncKeyField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return ctpJNI.CThostFtdcRspSyncKeyField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    ctpJNI.CThostFtdcRspSyncKeyField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return ctpJNI.CThostFtdcRspSyncKeyField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ctpJNI.CThostFtdcRspSyncKeyField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ctpJNI.CThostFtdcRspSyncKeyField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    ctpJNI.CThostFtdcRspSyncKeyField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return ctpJNI.CThostFtdcRspSyncKeyField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    ctpJNI.CThostFtdcRspSyncKeyField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return ctpJNI.CThostFtdcRspSyncKeyField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ctpJNI.CThostFtdcRspSyncKeyField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ctpJNI.CThostFtdcRspSyncKeyField_SessionID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ctpJNI.CThostFtdcRspSyncKeyField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ctpJNI.CThostFtdcRspSyncKeyField_InstallID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpJNI.CThostFtdcRspSyncKeyField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpJNI.CThostFtdcRspSyncKeyField_UserID_get(swigCPtr, this);
  }

  public void setMessage(String value) {
    ctpJNI.CThostFtdcRspSyncKeyField_Message_set(swigCPtr, this, value);
  }

  public String getMessage() {
    return ctpJNI.CThostFtdcRspSyncKeyField_Message_get(swigCPtr, this);
  }

  public void setDeviceID(String value) {
    ctpJNI.CThostFtdcRspSyncKeyField_DeviceID_set(swigCPtr, this, value);
  }

  public String getDeviceID() {
    return ctpJNI.CThostFtdcRspSyncKeyField_DeviceID_get(swigCPtr, this);
  }

  public void setBrokerIDByBank(String value) {
    ctpJNI.CThostFtdcRspSyncKeyField_BrokerIDByBank_set(swigCPtr, this, value);
  }

  public String getBrokerIDByBank() {
    return ctpJNI.CThostFtdcRspSyncKeyField_BrokerIDByBank_get(swigCPtr, this);
  }

  public void setOperNo(String value) {
    ctpJNI.CThostFtdcRspSyncKeyField_OperNo_set(swigCPtr, this, value);
  }

  public String getOperNo() {
    return ctpJNI.CThostFtdcRspSyncKeyField_OperNo_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    ctpJNI.CThostFtdcRspSyncKeyField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return ctpJNI.CThostFtdcRspSyncKeyField_RequestID_get(swigCPtr, this);
  }

  public void setTID(int value) {
    ctpJNI.CThostFtdcRspSyncKeyField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return ctpJNI.CThostFtdcRspSyncKeyField_TID_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    ctpJNI.CThostFtdcRspSyncKeyField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return ctpJNI.CThostFtdcRspSyncKeyField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    ctpJNI.CThostFtdcRspSyncKeyField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return ctpJNI.CThostFtdcRspSyncKeyField_ErrorMsg_get(swigCPtr, this);
  }

  public CThostFtdcRspSyncKeyField() {
    this(ctpJNI.new_CThostFtdcRspSyncKeyField(), true);
  }

}
