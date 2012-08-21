/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CThostFtdcUserSessionField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CThostFtdcUserSessionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CThostFtdcUserSessionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcUserSessionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFrontID(int value) {
    ctpJNI.CThostFtdcUserSessionField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return ctpJNI.CThostFtdcUserSessionField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ctpJNI.CThostFtdcUserSessionField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ctpJNI.CThostFtdcUserSessionField_SessionID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcUserSessionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcUserSessionField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpJNI.CThostFtdcUserSessionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpJNI.CThostFtdcUserSessionField_UserID_get(swigCPtr, this);
  }

  public void setLoginDate(String value) {
    ctpJNI.CThostFtdcUserSessionField_LoginDate_set(swigCPtr, this, value);
  }

  public String getLoginDate() {
    return ctpJNI.CThostFtdcUserSessionField_LoginDate_get(swigCPtr, this);
  }

  public void setLoginTime(String value) {
    ctpJNI.CThostFtdcUserSessionField_LoginTime_set(swigCPtr, this, value);
  }

  public String getLoginTime() {
    return ctpJNI.CThostFtdcUserSessionField_LoginTime_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    ctpJNI.CThostFtdcUserSessionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return ctpJNI.CThostFtdcUserSessionField_IPAddress_get(swigCPtr, this);
  }

  public void setUserProductInfo(String value) {
    ctpJNI.CThostFtdcUserSessionField_UserProductInfo_set(swigCPtr, this, value);
  }

  public String getUserProductInfo() {
    return ctpJNI.CThostFtdcUserSessionField_UserProductInfo_get(swigCPtr, this);
  }

  public void setInterfaceProductInfo(String value) {
    ctpJNI.CThostFtdcUserSessionField_InterfaceProductInfo_set(swigCPtr, this, value);
  }

  public String getInterfaceProductInfo() {
    return ctpJNI.CThostFtdcUserSessionField_InterfaceProductInfo_get(swigCPtr, this);
  }

  public void setProtocolInfo(String value) {
    ctpJNI.CThostFtdcUserSessionField_ProtocolInfo_set(swigCPtr, this, value);
  }

  public String getProtocolInfo() {
    return ctpJNI.CThostFtdcUserSessionField_ProtocolInfo_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    ctpJNI.CThostFtdcUserSessionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return ctpJNI.CThostFtdcUserSessionField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcUserSessionField() {
    this(ctpJNI.new_CThostFtdcUserSessionField(), true);
  }

}
