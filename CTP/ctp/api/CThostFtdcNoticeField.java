/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CThostFtdcNoticeField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CThostFtdcNoticeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CThostFtdcNoticeField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcNoticeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcNoticeField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcNoticeField_BrokerID_get(swigCPtr, this);
  }

  public void setContent(String value) {
    ctpJNI.CThostFtdcNoticeField_Content_set(swigCPtr, this, value);
  }

  public String getContent() {
    return ctpJNI.CThostFtdcNoticeField_Content_get(swigCPtr, this);
  }

  public void setSequenceLabel(String value) {
    ctpJNI.CThostFtdcNoticeField_SequenceLabel_set(swigCPtr, this, value);
  }

  public String getSequenceLabel() {
    return ctpJNI.CThostFtdcNoticeField_SequenceLabel_get(swigCPtr, this);
  }

  public CThostFtdcNoticeField() {
    this(ctpJNI.new_CThostFtdcNoticeField(), true);
  }

}