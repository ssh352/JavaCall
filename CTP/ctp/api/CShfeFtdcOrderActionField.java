/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcOrderActionField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcOrderActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcOrderActionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcOrderActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcOrderActionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcOrderActionField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CShfeFtdcOrderActionField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CShfeFtdcOrderActionField_InvestorID_get(swigCPtr, this);
  }

  public void setOrderActionRef(int value) {
    ctpJNI.CShfeFtdcOrderActionField_OrderActionRef_set(swigCPtr, this, value);
  }

  public int getOrderActionRef() {
    return ctpJNI.CShfeFtdcOrderActionField_OrderActionRef_get(swigCPtr, this);
  }

  public void setOrderRef(String value) {
    ctpJNI.CShfeFtdcOrderActionField_OrderRef_set(swigCPtr, this, value);
  }

  public String getOrderRef() {
    return ctpJNI.CShfeFtdcOrderActionField_OrderRef_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    ctpJNI.CShfeFtdcOrderActionField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return ctpJNI.CShfeFtdcOrderActionField_RequestID_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    ctpJNI.CShfeFtdcOrderActionField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return ctpJNI.CShfeFtdcOrderActionField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ctpJNI.CShfeFtdcOrderActionField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ctpJNI.CShfeFtdcOrderActionField_SessionID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpJNI.CShfeFtdcOrderActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpJNI.CShfeFtdcOrderActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setOrderSysID(String value) {
    ctpJNI.CShfeFtdcOrderActionField_OrderSysID_set(swigCPtr, this, value);
  }

  public String getOrderSysID() {
    return ctpJNI.CShfeFtdcOrderActionField_OrderSysID_get(swigCPtr, this);
  }

  public void setActionFlag(char value) {
    ctpJNI.CShfeFtdcOrderActionField_ActionFlag_set(swigCPtr, this, value);
  }

  public char getActionFlag() {
    return ctpJNI.CShfeFtdcOrderActionField_ActionFlag_get(swigCPtr, this);
  }

  public void setLimitPrice(double value) {
    ctpJNI.CShfeFtdcOrderActionField_LimitPrice_set(swigCPtr, this, value);
  }

  public double getLimitPrice() {
    return ctpJNI.CShfeFtdcOrderActionField_LimitPrice_get(swigCPtr, this);
  }

  public void setVolumeChange(int value) {
    ctpJNI.CShfeFtdcOrderActionField_VolumeChange_set(swigCPtr, this, value);
  }

  public int getVolumeChange() {
    return ctpJNI.CShfeFtdcOrderActionField_VolumeChange_get(swigCPtr, this);
  }

  public void setActionDate(String value) {
    ctpJNI.CShfeFtdcOrderActionField_ActionDate_set(swigCPtr, this, value);
  }

  public String getActionDate() {
    return ctpJNI.CShfeFtdcOrderActionField_ActionDate_get(swigCPtr, this);
  }

  public void setActionTime(String value) {
    ctpJNI.CShfeFtdcOrderActionField_ActionTime_set(swigCPtr, this, value);
  }

  public String getActionTime() {
    return ctpJNI.CShfeFtdcOrderActionField_ActionTime_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    ctpJNI.CShfeFtdcOrderActionField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return ctpJNI.CShfeFtdcOrderActionField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ctpJNI.CShfeFtdcOrderActionField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ctpJNI.CShfeFtdcOrderActionField_InstallID_get(swigCPtr, this);
  }

  public void setOrderLocalID(String value) {
    ctpJNI.CShfeFtdcOrderActionField_OrderLocalID_set(swigCPtr, this, value);
  }

  public String getOrderLocalID() {
    return ctpJNI.CShfeFtdcOrderActionField_OrderLocalID_get(swigCPtr, this);
  }

  public void setActionLocalID(String value) {
    ctpJNI.CShfeFtdcOrderActionField_ActionLocalID_set(swigCPtr, this, value);
  }

  public String getActionLocalID() {
    return ctpJNI.CShfeFtdcOrderActionField_ActionLocalID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    ctpJNI.CShfeFtdcOrderActionField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return ctpJNI.CShfeFtdcOrderActionField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    ctpJNI.CShfeFtdcOrderActionField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return ctpJNI.CShfeFtdcOrderActionField_ClientID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    ctpJNI.CShfeFtdcOrderActionField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return ctpJNI.CShfeFtdcOrderActionField_BusinessUnit_get(swigCPtr, this);
  }

  public void setOrderActionStatus(char value) {
    ctpJNI.CShfeFtdcOrderActionField_OrderActionStatus_set(swigCPtr, this, value);
  }

  public char getOrderActionStatus() {
    return ctpJNI.CShfeFtdcOrderActionField_OrderActionStatus_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpJNI.CShfeFtdcOrderActionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpJNI.CShfeFtdcOrderActionField_UserID_get(swigCPtr, this);
  }

  public void setStatusMsg(String value) {
    ctpJNI.CShfeFtdcOrderActionField_StatusMsg_set(swigCPtr, this, value);
  }

  public String getStatusMsg() {
    return ctpJNI.CShfeFtdcOrderActionField_StatusMsg_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ctpJNI.CShfeFtdcOrderActionField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpJNI.CShfeFtdcOrderActionField_InstrumentID_get(swigCPtr, this);
  }

  public CShfeFtdcOrderActionField() {
    this(ctpJNI.new_CShfeFtdcOrderActionField(), true);
  }

}
