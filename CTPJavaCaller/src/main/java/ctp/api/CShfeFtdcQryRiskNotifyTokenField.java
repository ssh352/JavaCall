/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcQryRiskNotifyTokenField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcQryRiskNotifyTokenField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcQryRiskNotifyTokenField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcQryRiskNotifyTokenField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcQryRiskNotifyTokenField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcQryRiskNotifyTokenField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpJNI.CShfeFtdcQryRiskNotifyTokenField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpJNI.CShfeFtdcQryRiskNotifyTokenField_UserID_get(swigCPtr, this);
  }

  public CShfeFtdcQryRiskNotifyTokenField() {
    this(ctpJNI.new_CShfeFtdcQryRiskNotifyTokenField(), true);
  }

}
