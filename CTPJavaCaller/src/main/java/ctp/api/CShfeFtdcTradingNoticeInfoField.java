/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcTradingNoticeInfoField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcTradingNoticeInfoField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcTradingNoticeInfoField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcTradingNoticeInfoField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcTradingNoticeInfoField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcTradingNoticeInfoField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CShfeFtdcTradingNoticeInfoField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CShfeFtdcTradingNoticeInfoField_InvestorID_get(swigCPtr, this);
  }

  public void setSendTime(String value) {
    ctpJNI.CShfeFtdcTradingNoticeInfoField_SendTime_set(swigCPtr, this, value);
  }

  public String getSendTime() {
    return ctpJNI.CShfeFtdcTradingNoticeInfoField_SendTime_get(swigCPtr, this);
  }

  public void setFieldContent(String value) {
    ctpJNI.CShfeFtdcTradingNoticeInfoField_FieldContent_set(swigCPtr, this, value);
  }

  public String getFieldContent() {
    return ctpJNI.CShfeFtdcTradingNoticeInfoField_FieldContent_get(swigCPtr, this);
  }

  public void setSequenceSeries(short value) {
    ctpJNI.CShfeFtdcTradingNoticeInfoField_SequenceSeries_set(swigCPtr, this, value);
  }

  public short getSequenceSeries() {
    return ctpJNI.CShfeFtdcTradingNoticeInfoField_SequenceSeries_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    ctpJNI.CShfeFtdcTradingNoticeInfoField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return ctpJNI.CShfeFtdcTradingNoticeInfoField_SequenceNo_get(swigCPtr, this);
  }

  public CShfeFtdcTradingNoticeInfoField() {
    this(ctpJNI.new_CShfeFtdcTradingNoticeInfoField(), true);
  }

}
