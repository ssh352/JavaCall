/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CThostFtdcQrySettlementInfoField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CThostFtdcQrySettlementInfoField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CThostFtdcQrySettlementInfoField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcQrySettlementInfoField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcQrySettlementInfoField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcQrySettlementInfoField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CThostFtdcQrySettlementInfoField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CThostFtdcQrySettlementInfoField_InvestorID_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ctpJNI.CThostFtdcQrySettlementInfoField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ctpJNI.CThostFtdcQrySettlementInfoField_TradingDay_get(swigCPtr, this);
  }

  public CThostFtdcQrySettlementInfoField() {
    this(ctpJNI.new_CThostFtdcQrySettlementInfoField(), true);
  }

}
