/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcUserRightField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcUserRightField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcUserRightField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcUserRightField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcUserRightField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcUserRightField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpJNI.CShfeFtdcUserRightField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpJNI.CShfeFtdcUserRightField_UserID_get(swigCPtr, this);
  }

  public void setUserRightType(char value) {
    ctpJNI.CShfeFtdcUserRightField_UserRightType_set(swigCPtr, this, value);
  }

  public char getUserRightType() {
    return ctpJNI.CShfeFtdcUserRightField_UserRightType_get(swigCPtr, this);
  }

  public void setIsForbidden(int value) {
    ctpJNI.CShfeFtdcUserRightField_IsForbidden_set(swigCPtr, this, value);
  }

  public int getIsForbidden() {
    return ctpJNI.CShfeFtdcUserRightField_IsForbidden_get(swigCPtr, this);
  }

  public CShfeFtdcUserRightField() {
    this(ctpJNI.new_CShfeFtdcUserRightField(), true);
  }

}
