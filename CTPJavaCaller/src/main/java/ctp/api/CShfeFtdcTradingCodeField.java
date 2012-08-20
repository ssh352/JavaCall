/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcTradingCodeField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcTradingCodeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcTradingCodeField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcTradingCodeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInvestorID(String value) {
    ctpJNI.CShfeFtdcTradingCodeField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CShfeFtdcTradingCodeField_InvestorID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcTradingCodeField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcTradingCodeField_BrokerID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpJNI.CShfeFtdcTradingCodeField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpJNI.CShfeFtdcTradingCodeField_ExchangeID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    ctpJNI.CShfeFtdcTradingCodeField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return ctpJNI.CShfeFtdcTradingCodeField_ClientID_get(swigCPtr, this);
  }

  public void setIsActive(int value) {
    ctpJNI.CShfeFtdcTradingCodeField_IsActive_set(swigCPtr, this, value);
  }

  public int getIsActive() {
    return ctpJNI.CShfeFtdcTradingCodeField_IsActive_get(swigCPtr, this);
  }

  public void setClientIDType(char value) {
    ctpJNI.CShfeFtdcTradingCodeField_ClientIDType_set(swigCPtr, this, value);
  }

  public char getClientIDType() {
    return ctpJNI.CShfeFtdcTradingCodeField_ClientIDType_get(swigCPtr, this);
  }

  public CShfeFtdcTradingCodeField() {
    this(ctpJNI.new_CShfeFtdcTradingCodeField(), true);
  }

}
