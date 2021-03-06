/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcTradingNoticeField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcTradingNoticeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcTradingNoticeField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcTradingNoticeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcTradingNoticeField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcTradingNoticeField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    ctpJNI.CShfeFtdcTradingNoticeField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return ctpJNI.CShfeFtdcTradingNoticeField_InvestorRange_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CShfeFtdcTradingNoticeField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CShfeFtdcTradingNoticeField_InvestorID_get(swigCPtr, this);
  }

  public void setSequenceSeries(short value) {
    ctpJNI.CShfeFtdcTradingNoticeField_SequenceSeries_set(swigCPtr, this, value);
  }

  public short getSequenceSeries() {
    return ctpJNI.CShfeFtdcTradingNoticeField_SequenceSeries_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpJNI.CShfeFtdcTradingNoticeField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpJNI.CShfeFtdcTradingNoticeField_UserID_get(swigCPtr, this);
  }

  public void setSendTime(String value) {
    ctpJNI.CShfeFtdcTradingNoticeField_SendTime_set(swigCPtr, this, value);
  }

  public String getSendTime() {
    return ctpJNI.CShfeFtdcTradingNoticeField_SendTime_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    ctpJNI.CShfeFtdcTradingNoticeField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return ctpJNI.CShfeFtdcTradingNoticeField_SequenceNo_get(swigCPtr, this);
  }

  public void setFieldContent(String value) {
    ctpJNI.CShfeFtdcTradingNoticeField_FieldContent_set(swigCPtr, this, value);
  }

  public String getFieldContent() {
    return ctpJNI.CShfeFtdcTradingNoticeField_FieldContent_get(swigCPtr, this);
  }

  public CShfeFtdcTradingNoticeField() {
    this(ctpJNI.new_CShfeFtdcTradingNoticeField(), true);
  }

}
