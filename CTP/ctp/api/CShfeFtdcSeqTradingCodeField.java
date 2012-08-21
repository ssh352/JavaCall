/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcSeqTradingCodeField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcSeqTradingCodeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcSeqTradingCodeField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcSeqTradingCodeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setUniqSequenceNo(int value) {
    ctpJNI.CShfeFtdcSeqTradingCodeField_UniqSequenceNo_set(swigCPtr, this, value);
  }

  public int getUniqSequenceNo() {
    return ctpJNI.CShfeFtdcSeqTradingCodeField_UniqSequenceNo_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CShfeFtdcSeqTradingCodeField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CShfeFtdcSeqTradingCodeField_InvestorID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcSeqTradingCodeField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcSeqTradingCodeField_BrokerID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpJNI.CShfeFtdcSeqTradingCodeField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpJNI.CShfeFtdcSeqTradingCodeField_ExchangeID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    ctpJNI.CShfeFtdcSeqTradingCodeField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return ctpJNI.CShfeFtdcSeqTradingCodeField_ClientID_get(swigCPtr, this);
  }

  public void setIsActive(int value) {
    ctpJNI.CShfeFtdcSeqTradingCodeField_IsActive_set(swigCPtr, this, value);
  }

  public int getIsActive() {
    return ctpJNI.CShfeFtdcSeqTradingCodeField_IsActive_get(swigCPtr, this);
  }

  public void setAction(char value) {
    ctpJNI.CShfeFtdcSeqTradingCodeField_Action_set(swigCPtr, this, value);
  }

  public char getAction() {
    return ctpJNI.CShfeFtdcSeqTradingCodeField_Action_get(swigCPtr, this);
  }

  public void setClientIDType(char value) {
    ctpJNI.CShfeFtdcSeqTradingCodeField_ClientIDType_set(swigCPtr, this, value);
  }

  public char getClientIDType() {
    return ctpJNI.CShfeFtdcSeqTradingCodeField_ClientIDType_get(swigCPtr, this);
  }

  public CShfeFtdcSeqTradingCodeField() {
    this(ctpJNI.new_CShfeFtdcSeqTradingCodeField(), true);
  }

}
