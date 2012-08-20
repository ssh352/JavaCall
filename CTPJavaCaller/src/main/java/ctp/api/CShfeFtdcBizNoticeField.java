/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcBizNoticeField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcBizNoticeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcBizNoticeField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcBizNoticeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    ctpJNI.CShfeFtdcBizNoticeField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ctpJNI.CShfeFtdcBizNoticeField_TradingDay_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    ctpJNI.CShfeFtdcBizNoticeField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return ctpJNI.CShfeFtdcBizNoticeField_SequenceNo_get(swigCPtr, this);
  }

  public void setMethod(char value) {
    ctpJNI.CShfeFtdcBizNoticeField_Method_set(swigCPtr, this, value);
  }

  public char getMethod() {
    return ctpJNI.CShfeFtdcBizNoticeField_Method_get(swigCPtr, this);
  }

  public void setEventTime(String value) {
    ctpJNI.CShfeFtdcBizNoticeField_EventTime_set(swigCPtr, this, value);
  }

  public String getEventTime() {
    return ctpJNI.CShfeFtdcBizNoticeField_EventTime_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcBizNoticeField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcBizNoticeField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpJNI.CShfeFtdcBizNoticeField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpJNI.CShfeFtdcBizNoticeField_UserID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CShfeFtdcBizNoticeField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CShfeFtdcBizNoticeField_InvestorID_get(swigCPtr, this);
  }

  public void setBizType(String value) {
    ctpJNI.CShfeFtdcBizNoticeField_BizType_set(swigCPtr, this, value);
  }

  public String getBizType() {
    return ctpJNI.CShfeFtdcBizNoticeField_BizType_get(swigCPtr, this);
  }

  public void setStatus(char value) {
    ctpJNI.CShfeFtdcBizNoticeField_Status_set(swigCPtr, this, value);
  }

  public char getStatus() {
    return ctpJNI.CShfeFtdcBizNoticeField_Status_get(swigCPtr, this);
  }

  public void setMessage(String value) {
    ctpJNI.CShfeFtdcBizNoticeField_Message_set(swigCPtr, this, value);
  }

  public String getMessage() {
    return ctpJNI.CShfeFtdcBizNoticeField_Message_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    ctpJNI.CShfeFtdcBizNoticeField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return ctpJNI.CShfeFtdcBizNoticeField_ErrorMsg_get(swigCPtr, this);
  }

  public CShfeFtdcBizNoticeField() {
    this(ctpJNI.new_CShfeFtdcBizNoticeField(), true);
  }

}
