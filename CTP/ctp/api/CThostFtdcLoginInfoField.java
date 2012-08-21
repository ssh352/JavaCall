/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CThostFtdcLoginInfoField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CThostFtdcLoginInfoField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CThostFtdcLoginInfoField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcLoginInfoField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFrontID(int value) {
    ctpJNI.CThostFtdcLoginInfoField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return ctpJNI.CThostFtdcLoginInfoField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ctpJNI.CThostFtdcLoginInfoField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ctpJNI.CThostFtdcLoginInfoField_SessionID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcLoginInfoField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcLoginInfoField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpJNI.CThostFtdcLoginInfoField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpJNI.CThostFtdcLoginInfoField_UserID_get(swigCPtr, this);
  }

  public void setLoginDate(String value) {
    ctpJNI.CThostFtdcLoginInfoField_LoginDate_set(swigCPtr, this, value);
  }

  public String getLoginDate() {
    return ctpJNI.CThostFtdcLoginInfoField_LoginDate_get(swigCPtr, this);
  }

  public void setLoginTime(String value) {
    ctpJNI.CThostFtdcLoginInfoField_LoginTime_set(swigCPtr, this, value);
  }

  public String getLoginTime() {
    return ctpJNI.CThostFtdcLoginInfoField_LoginTime_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    ctpJNI.CThostFtdcLoginInfoField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return ctpJNI.CThostFtdcLoginInfoField_IPAddress_get(swigCPtr, this);
  }

  public void setUserProductInfo(String value) {
    ctpJNI.CThostFtdcLoginInfoField_UserProductInfo_set(swigCPtr, this, value);
  }

  public String getUserProductInfo() {
    return ctpJNI.CThostFtdcLoginInfoField_UserProductInfo_get(swigCPtr, this);
  }

  public void setInterfaceProductInfo(String value) {
    ctpJNI.CThostFtdcLoginInfoField_InterfaceProductInfo_set(swigCPtr, this, value);
  }

  public String getInterfaceProductInfo() {
    return ctpJNI.CThostFtdcLoginInfoField_InterfaceProductInfo_get(swigCPtr, this);
  }

  public void setProtocolInfo(String value) {
    ctpJNI.CThostFtdcLoginInfoField_ProtocolInfo_set(swigCPtr, this, value);
  }

  public String getProtocolInfo() {
    return ctpJNI.CThostFtdcLoginInfoField_ProtocolInfo_get(swigCPtr, this);
  }

  public void setSystemName(String value) {
    ctpJNI.CThostFtdcLoginInfoField_SystemName_set(swigCPtr, this, value);
  }

  public String getSystemName() {
    return ctpJNI.CThostFtdcLoginInfoField_SystemName_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    ctpJNI.CThostFtdcLoginInfoField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return ctpJNI.CThostFtdcLoginInfoField_Password_get(swigCPtr, this);
  }

  public void setMaxOrderRef(String value) {
    ctpJNI.CThostFtdcLoginInfoField_MaxOrderRef_set(swigCPtr, this, value);
  }

  public String getMaxOrderRef() {
    return ctpJNI.CThostFtdcLoginInfoField_MaxOrderRef_get(swigCPtr, this);
  }

  public void setSHFETime(String value) {
    ctpJNI.CThostFtdcLoginInfoField_SHFETime_set(swigCPtr, this, value);
  }

  public String getSHFETime() {
    return ctpJNI.CThostFtdcLoginInfoField_SHFETime_get(swigCPtr, this);
  }

  public void setDCETime(String value) {
    ctpJNI.CThostFtdcLoginInfoField_DCETime_set(swigCPtr, this, value);
  }

  public String getDCETime() {
    return ctpJNI.CThostFtdcLoginInfoField_DCETime_get(swigCPtr, this);
  }

  public void setCZCETime(String value) {
    ctpJNI.CThostFtdcLoginInfoField_CZCETime_set(swigCPtr, this, value);
  }

  public String getCZCETime() {
    return ctpJNI.CThostFtdcLoginInfoField_CZCETime_get(swigCPtr, this);
  }

  public void setFFEXTime(String value) {
    ctpJNI.CThostFtdcLoginInfoField_FFEXTime_set(swigCPtr, this, value);
  }

  public String getFFEXTime() {
    return ctpJNI.CThostFtdcLoginInfoField_FFEXTime_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    ctpJNI.CThostFtdcLoginInfoField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return ctpJNI.CThostFtdcLoginInfoField_MacAddress_get(swigCPtr, this);
  }

  public void setOneTimePassword(String value) {
    ctpJNI.CThostFtdcLoginInfoField_OneTimePassword_set(swigCPtr, this, value);
  }

  public String getOneTimePassword() {
    return ctpJNI.CThostFtdcLoginInfoField_OneTimePassword_get(swigCPtr, this);
  }

  public CThostFtdcLoginInfoField() {
    this(ctpJNI.new_CThostFtdcLoginInfoField(), true);
  }

}
