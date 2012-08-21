/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcLoginInfoField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcLoginInfoField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcLoginInfoField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcLoginInfoField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFrontID(int value) {
    ctpJNI.CShfeFtdcLoginInfoField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return ctpJNI.CShfeFtdcLoginInfoField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ctpJNI.CShfeFtdcLoginInfoField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ctpJNI.CShfeFtdcLoginInfoField_SessionID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcLoginInfoField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcLoginInfoField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpJNI.CShfeFtdcLoginInfoField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpJNI.CShfeFtdcLoginInfoField_UserID_get(swigCPtr, this);
  }

  public void setLoginDate(String value) {
    ctpJNI.CShfeFtdcLoginInfoField_LoginDate_set(swigCPtr, this, value);
  }

  public String getLoginDate() {
    return ctpJNI.CShfeFtdcLoginInfoField_LoginDate_get(swigCPtr, this);
  }

  public void setLoginTime(String value) {
    ctpJNI.CShfeFtdcLoginInfoField_LoginTime_set(swigCPtr, this, value);
  }

  public String getLoginTime() {
    return ctpJNI.CShfeFtdcLoginInfoField_LoginTime_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    ctpJNI.CShfeFtdcLoginInfoField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return ctpJNI.CShfeFtdcLoginInfoField_IPAddress_get(swigCPtr, this);
  }

  public void setUserProductInfo(String value) {
    ctpJNI.CShfeFtdcLoginInfoField_UserProductInfo_set(swigCPtr, this, value);
  }

  public String getUserProductInfo() {
    return ctpJNI.CShfeFtdcLoginInfoField_UserProductInfo_get(swigCPtr, this);
  }

  public void setInterfaceProductInfo(String value) {
    ctpJNI.CShfeFtdcLoginInfoField_InterfaceProductInfo_set(swigCPtr, this, value);
  }

  public String getInterfaceProductInfo() {
    return ctpJNI.CShfeFtdcLoginInfoField_InterfaceProductInfo_get(swigCPtr, this);
  }

  public void setProtocolInfo(String value) {
    ctpJNI.CShfeFtdcLoginInfoField_ProtocolInfo_set(swigCPtr, this, value);
  }

  public String getProtocolInfo() {
    return ctpJNI.CShfeFtdcLoginInfoField_ProtocolInfo_get(swigCPtr, this);
  }

  public void setSystemName(String value) {
    ctpJNI.CShfeFtdcLoginInfoField_SystemName_set(swigCPtr, this, value);
  }

  public String getSystemName() {
    return ctpJNI.CShfeFtdcLoginInfoField_SystemName_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    ctpJNI.CShfeFtdcLoginInfoField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return ctpJNI.CShfeFtdcLoginInfoField_Password_get(swigCPtr, this);
  }

  public void setMaxOrderRef(String value) {
    ctpJNI.CShfeFtdcLoginInfoField_MaxOrderRef_set(swigCPtr, this, value);
  }

  public String getMaxOrderRef() {
    return ctpJNI.CShfeFtdcLoginInfoField_MaxOrderRef_get(swigCPtr, this);
  }

  public void setSHFETime(String value) {
    ctpJNI.CShfeFtdcLoginInfoField_SHFETime_set(swigCPtr, this, value);
  }

  public String getSHFETime() {
    return ctpJNI.CShfeFtdcLoginInfoField_SHFETime_get(swigCPtr, this);
  }

  public void setDCETime(String value) {
    ctpJNI.CShfeFtdcLoginInfoField_DCETime_set(swigCPtr, this, value);
  }

  public String getDCETime() {
    return ctpJNI.CShfeFtdcLoginInfoField_DCETime_get(swigCPtr, this);
  }

  public void setCZCETime(String value) {
    ctpJNI.CShfeFtdcLoginInfoField_CZCETime_set(swigCPtr, this, value);
  }

  public String getCZCETime() {
    return ctpJNI.CShfeFtdcLoginInfoField_CZCETime_get(swigCPtr, this);
  }

  public void setFFEXTime(String value) {
    ctpJNI.CShfeFtdcLoginInfoField_FFEXTime_set(swigCPtr, this, value);
  }

  public String getFFEXTime() {
    return ctpJNI.CShfeFtdcLoginInfoField_FFEXTime_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    ctpJNI.CShfeFtdcLoginInfoField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return ctpJNI.CShfeFtdcLoginInfoField_MacAddress_get(swigCPtr, this);
  }

  public void setOneTimePassword(String value) {
    ctpJNI.CShfeFtdcLoginInfoField_OneTimePassword_set(swigCPtr, this, value);
  }

  public String getOneTimePassword() {
    return ctpJNI.CShfeFtdcLoginInfoField_OneTimePassword_get(swigCPtr, this);
  }

  public CShfeFtdcLoginInfoField() {
    this(ctpJNI.new_CShfeFtdcLoginInfoField(), true);
  }

}
