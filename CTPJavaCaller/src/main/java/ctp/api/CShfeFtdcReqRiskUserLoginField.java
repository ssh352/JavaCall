/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcReqRiskUserLoginField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcReqRiskUserLoginField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcReqRiskUserLoginField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcReqRiskUserLoginField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcReqRiskUserLoginField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcReqRiskUserLoginField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpJNI.CShfeFtdcReqRiskUserLoginField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpJNI.CShfeFtdcReqRiskUserLoginField_UserID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    ctpJNI.CShfeFtdcReqRiskUserLoginField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return ctpJNI.CShfeFtdcReqRiskUserLoginField_Password_get(swigCPtr, this);
  }

  public void setVersion(int value) {
    ctpJNI.CShfeFtdcReqRiskUserLoginField_Version_set(swigCPtr, this, value);
  }

  public int getVersion() {
    return ctpJNI.CShfeFtdcReqRiskUserLoginField_Version_get(swigCPtr, this);
  }

  public void setLocalSessionID(int value) {
    ctpJNI.CShfeFtdcReqRiskUserLoginField_LocalSessionID_set(swigCPtr, this, value);
  }

  public int getLocalSessionID() {
    return ctpJNI.CShfeFtdcReqRiskUserLoginField_LocalSessionID_get(swigCPtr, this);
  }

  public CShfeFtdcReqRiskUserLoginField() {
    this(ctpJNI.new_CShfeFtdcReqRiskUserLoginField(), true);
  }

}
