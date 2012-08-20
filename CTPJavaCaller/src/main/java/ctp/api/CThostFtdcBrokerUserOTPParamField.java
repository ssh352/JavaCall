/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CThostFtdcBrokerUserOTPParamField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CThostFtdcBrokerUserOTPParamField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CThostFtdcBrokerUserOTPParamField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcBrokerUserOTPParamField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcBrokerUserOTPParamField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcBrokerUserOTPParamField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpJNI.CThostFtdcBrokerUserOTPParamField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpJNI.CThostFtdcBrokerUserOTPParamField_UserID_get(swigCPtr, this);
  }

  public void setOTPVendorsID(String value) {
    ctpJNI.CThostFtdcBrokerUserOTPParamField_OTPVendorsID_set(swigCPtr, this, value);
  }

  public String getOTPVendorsID() {
    return ctpJNI.CThostFtdcBrokerUserOTPParamField_OTPVendorsID_get(swigCPtr, this);
  }

  public void setSerialNumber(String value) {
    ctpJNI.CThostFtdcBrokerUserOTPParamField_SerialNumber_set(swigCPtr, this, value);
  }

  public String getSerialNumber() {
    return ctpJNI.CThostFtdcBrokerUserOTPParamField_SerialNumber_get(swigCPtr, this);
  }

  public void setAuthKey(String value) {
    ctpJNI.CThostFtdcBrokerUserOTPParamField_AuthKey_set(swigCPtr, this, value);
  }

  public String getAuthKey() {
    return ctpJNI.CThostFtdcBrokerUserOTPParamField_AuthKey_get(swigCPtr, this);
  }

  public void setLastDrift(int value) {
    ctpJNI.CThostFtdcBrokerUserOTPParamField_LastDrift_set(swigCPtr, this, value);
  }

  public int getLastDrift() {
    return ctpJNI.CThostFtdcBrokerUserOTPParamField_LastDrift_get(swigCPtr, this);
  }

  public void setLastSuccess(int value) {
    ctpJNI.CThostFtdcBrokerUserOTPParamField_LastSuccess_set(swigCPtr, this, value);
  }

  public int getLastSuccess() {
    return ctpJNI.CThostFtdcBrokerUserOTPParamField_LastSuccess_get(swigCPtr, this);
  }

  public void setOTPType(char value) {
    ctpJNI.CThostFtdcBrokerUserOTPParamField_OTPType_set(swigCPtr, this, value);
  }

  public char getOTPType() {
    return ctpJNI.CThostFtdcBrokerUserOTPParamField_OTPType_get(swigCPtr, this);
  }

  public CThostFtdcBrokerUserOTPParamField() {
    this(ctpJNI.new_CThostFtdcBrokerUserOTPParamField(), true);
  }

}
