/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CThostFtdcSyncingTradingCodeField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CThostFtdcSyncingTradingCodeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CThostFtdcSyncingTradingCodeField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcSyncingTradingCodeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInvestorID(String value) {
    ctpJNI.CThostFtdcSyncingTradingCodeField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CThostFtdcSyncingTradingCodeField_InvestorID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcSyncingTradingCodeField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcSyncingTradingCodeField_BrokerID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpJNI.CThostFtdcSyncingTradingCodeField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpJNI.CThostFtdcSyncingTradingCodeField_ExchangeID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    ctpJNI.CThostFtdcSyncingTradingCodeField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return ctpJNI.CThostFtdcSyncingTradingCodeField_ClientID_get(swigCPtr, this);
  }

  public void setIsActive(int value) {
    ctpJNI.CThostFtdcSyncingTradingCodeField_IsActive_set(swigCPtr, this, value);
  }

  public int getIsActive() {
    return ctpJNI.CThostFtdcSyncingTradingCodeField_IsActive_get(swigCPtr, this);
  }

  public void setClientIDType(char value) {
    ctpJNI.CThostFtdcSyncingTradingCodeField_ClientIDType_set(swigCPtr, this, value);
  }

  public char getClientIDType() {
    return ctpJNI.CThostFtdcSyncingTradingCodeField_ClientIDType_get(swigCPtr, this);
  }

  public CThostFtdcSyncingTradingCodeField() {
    this(ctpJNI.new_CThostFtdcSyncingTradingCodeField(), true);
  }

}
