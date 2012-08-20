/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcMDTraderOfferField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcMDTraderOfferField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcMDTraderOfferField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcMDTraderOfferField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    ctpJNI.CShfeFtdcMDTraderOfferField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpJNI.CShfeFtdcMDTraderOfferField_ExchangeID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    ctpJNI.CShfeFtdcMDTraderOfferField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return ctpJNI.CShfeFtdcMDTraderOfferField_TraderID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    ctpJNI.CShfeFtdcMDTraderOfferField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return ctpJNI.CShfeFtdcMDTraderOfferField_ParticipantID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    ctpJNI.CShfeFtdcMDTraderOfferField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return ctpJNI.CShfeFtdcMDTraderOfferField_Password_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ctpJNI.CShfeFtdcMDTraderOfferField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ctpJNI.CShfeFtdcMDTraderOfferField_InstallID_get(swigCPtr, this);
  }

  public void setOrderLocalID(String value) {
    ctpJNI.CShfeFtdcMDTraderOfferField_OrderLocalID_set(swigCPtr, this, value);
  }

  public String getOrderLocalID() {
    return ctpJNI.CShfeFtdcMDTraderOfferField_OrderLocalID_get(swigCPtr, this);
  }

  public void setTraderConnectStatus(char value) {
    ctpJNI.CShfeFtdcMDTraderOfferField_TraderConnectStatus_set(swigCPtr, this, value);
  }

  public char getTraderConnectStatus() {
    return ctpJNI.CShfeFtdcMDTraderOfferField_TraderConnectStatus_get(swigCPtr, this);
  }

  public void setConnectRequestDate(String value) {
    ctpJNI.CShfeFtdcMDTraderOfferField_ConnectRequestDate_set(swigCPtr, this, value);
  }

  public String getConnectRequestDate() {
    return ctpJNI.CShfeFtdcMDTraderOfferField_ConnectRequestDate_get(swigCPtr, this);
  }

  public void setConnectRequestTime(String value) {
    ctpJNI.CShfeFtdcMDTraderOfferField_ConnectRequestTime_set(swigCPtr, this, value);
  }

  public String getConnectRequestTime() {
    return ctpJNI.CShfeFtdcMDTraderOfferField_ConnectRequestTime_get(swigCPtr, this);
  }

  public void setLastReportDate(String value) {
    ctpJNI.CShfeFtdcMDTraderOfferField_LastReportDate_set(swigCPtr, this, value);
  }

  public String getLastReportDate() {
    return ctpJNI.CShfeFtdcMDTraderOfferField_LastReportDate_get(swigCPtr, this);
  }

  public void setLastReportTime(String value) {
    ctpJNI.CShfeFtdcMDTraderOfferField_LastReportTime_set(swigCPtr, this, value);
  }

  public String getLastReportTime() {
    return ctpJNI.CShfeFtdcMDTraderOfferField_LastReportTime_get(swigCPtr, this);
  }

  public void setConnectDate(String value) {
    ctpJNI.CShfeFtdcMDTraderOfferField_ConnectDate_set(swigCPtr, this, value);
  }

  public String getConnectDate() {
    return ctpJNI.CShfeFtdcMDTraderOfferField_ConnectDate_get(swigCPtr, this);
  }

  public void setConnectTime(String value) {
    ctpJNI.CShfeFtdcMDTraderOfferField_ConnectTime_set(swigCPtr, this, value);
  }

  public String getConnectTime() {
    return ctpJNI.CShfeFtdcMDTraderOfferField_ConnectTime_get(swigCPtr, this);
  }

  public void setStartDate(String value) {
    ctpJNI.CShfeFtdcMDTraderOfferField_StartDate_set(swigCPtr, this, value);
  }

  public String getStartDate() {
    return ctpJNI.CShfeFtdcMDTraderOfferField_StartDate_get(swigCPtr, this);
  }

  public void setStartTime(String value) {
    ctpJNI.CShfeFtdcMDTraderOfferField_StartTime_set(swigCPtr, this, value);
  }

  public String getStartTime() {
    return ctpJNI.CShfeFtdcMDTraderOfferField_StartTime_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ctpJNI.CShfeFtdcMDTraderOfferField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ctpJNI.CShfeFtdcMDTraderOfferField_TradingDay_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcMDTraderOfferField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcMDTraderOfferField_BrokerID_get(swigCPtr, this);
  }

  public void setMaxTradeID(String value) {
    ctpJNI.CShfeFtdcMDTraderOfferField_MaxTradeID_set(swigCPtr, this, value);
  }

  public String getMaxTradeID() {
    return ctpJNI.CShfeFtdcMDTraderOfferField_MaxTradeID_get(swigCPtr, this);
  }

  public void setMaxOrderMessageReference(String value) {
    ctpJNI.CShfeFtdcMDTraderOfferField_MaxOrderMessageReference_set(swigCPtr, this, value);
  }

  public String getMaxOrderMessageReference() {
    return ctpJNI.CShfeFtdcMDTraderOfferField_MaxOrderMessageReference_get(swigCPtr, this);
  }

  public CShfeFtdcMDTraderOfferField() {
    this(ctpJNI.new_CShfeFtdcMDTraderOfferField(), true);
  }

}
