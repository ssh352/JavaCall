/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CThostFtdcExchangeOrderActionField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CThostFtdcExchangeOrderActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CThostFtdcExchangeOrderActionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcExchangeOrderActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    ctpJNI.CThostFtdcExchangeOrderActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpJNI.CThostFtdcExchangeOrderActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setOrderSysID(String value) {
    ctpJNI.CThostFtdcExchangeOrderActionField_OrderSysID_set(swigCPtr, this, value);
  }

  public String getOrderSysID() {
    return ctpJNI.CThostFtdcExchangeOrderActionField_OrderSysID_get(swigCPtr, this);
  }

  public void setActionFlag(char value) {
    ctpJNI.CThostFtdcExchangeOrderActionField_ActionFlag_set(swigCPtr, this, value);
  }

  public char getActionFlag() {
    return ctpJNI.CThostFtdcExchangeOrderActionField_ActionFlag_get(swigCPtr, this);
  }

  public void setLimitPrice(double value) {
    ctpJNI.CThostFtdcExchangeOrderActionField_LimitPrice_set(swigCPtr, this, value);
  }

  public double getLimitPrice() {
    return ctpJNI.CThostFtdcExchangeOrderActionField_LimitPrice_get(swigCPtr, this);
  }

  public void setVolumeChange(int value) {
    ctpJNI.CThostFtdcExchangeOrderActionField_VolumeChange_set(swigCPtr, this, value);
  }

  public int getVolumeChange() {
    return ctpJNI.CThostFtdcExchangeOrderActionField_VolumeChange_get(swigCPtr, this);
  }

  public void setActionDate(String value) {
    ctpJNI.CThostFtdcExchangeOrderActionField_ActionDate_set(swigCPtr, this, value);
  }

  public String getActionDate() {
    return ctpJNI.CThostFtdcExchangeOrderActionField_ActionDate_get(swigCPtr, this);
  }

  public void setActionTime(String value) {
    ctpJNI.CThostFtdcExchangeOrderActionField_ActionTime_set(swigCPtr, this, value);
  }

  public String getActionTime() {
    return ctpJNI.CThostFtdcExchangeOrderActionField_ActionTime_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    ctpJNI.CThostFtdcExchangeOrderActionField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return ctpJNI.CThostFtdcExchangeOrderActionField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ctpJNI.CThostFtdcExchangeOrderActionField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ctpJNI.CThostFtdcExchangeOrderActionField_InstallID_get(swigCPtr, this);
  }

  public void setOrderLocalID(String value) {
    ctpJNI.CThostFtdcExchangeOrderActionField_OrderLocalID_set(swigCPtr, this, value);
  }

  public String getOrderLocalID() {
    return ctpJNI.CThostFtdcExchangeOrderActionField_OrderLocalID_get(swigCPtr, this);
  }

  public void setActionLocalID(String value) {
    ctpJNI.CThostFtdcExchangeOrderActionField_ActionLocalID_set(swigCPtr, this, value);
  }

  public String getActionLocalID() {
    return ctpJNI.CThostFtdcExchangeOrderActionField_ActionLocalID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    ctpJNI.CThostFtdcExchangeOrderActionField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return ctpJNI.CThostFtdcExchangeOrderActionField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    ctpJNI.CThostFtdcExchangeOrderActionField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return ctpJNI.CThostFtdcExchangeOrderActionField_ClientID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    ctpJNI.CThostFtdcExchangeOrderActionField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return ctpJNI.CThostFtdcExchangeOrderActionField_BusinessUnit_get(swigCPtr, this);
  }

  public void setOrderActionStatus(char value) {
    ctpJNI.CThostFtdcExchangeOrderActionField_OrderActionStatus_set(swigCPtr, this, value);
  }

  public char getOrderActionStatus() {
    return ctpJNI.CThostFtdcExchangeOrderActionField_OrderActionStatus_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpJNI.CThostFtdcExchangeOrderActionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpJNI.CThostFtdcExchangeOrderActionField_UserID_get(swigCPtr, this);
  }

  public CThostFtdcExchangeOrderActionField() {
    this(ctpJNI.new_CThostFtdcExchangeOrderActionField(), true);
  }

}
