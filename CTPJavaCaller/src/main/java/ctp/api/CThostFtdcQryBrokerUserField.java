/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CThostFtdcQryBrokerUserField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CThostFtdcQryBrokerUserField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CThostFtdcQryBrokerUserField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcQryBrokerUserField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcQryBrokerUserField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcQryBrokerUserField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpJNI.CThostFtdcQryBrokerUserField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpJNI.CThostFtdcQryBrokerUserField_UserID_get(swigCPtr, this);
  }

  public CThostFtdcQryBrokerUserField() {
    this(ctpJNI.new_CThostFtdcQryBrokerUserField(), true);
  }

}
