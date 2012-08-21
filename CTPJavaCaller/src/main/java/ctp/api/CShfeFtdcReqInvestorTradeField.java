/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcReqInvestorTradeField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcReqInvestorTradeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcReqInvestorTradeField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcReqInvestorTradeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcReqInvestorTradeField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcReqInvestorTradeField_BrokerID_get(swigCPtr, this);
  }

  public void setTradingDayStart(String value) {
    ctpJNI.CShfeFtdcReqInvestorTradeField_TradingDayStart_set(swigCPtr, this, value);
  }

  public String getTradingDayStart() {
    return ctpJNI.CShfeFtdcReqInvestorTradeField_TradingDayStart_get(swigCPtr, this);
  }

  public void setTradingDayEnd(String value) {
    ctpJNI.CShfeFtdcReqInvestorTradeField_TradingDayEnd_set(swigCPtr, this, value);
  }

  public String getTradingDayEnd() {
    return ctpJNI.CShfeFtdcReqInvestorTradeField_TradingDayEnd_get(swigCPtr, this);
  }

  public void setInvestorIDStart(String value) {
    ctpJNI.CShfeFtdcReqInvestorTradeField_InvestorIDStart_set(swigCPtr, this, value);
  }

  public String getInvestorIDStart() {
    return ctpJNI.CShfeFtdcReqInvestorTradeField_InvestorIDStart_get(swigCPtr, this);
  }

  public void setInvestorIDEnd(String value) {
    ctpJNI.CShfeFtdcReqInvestorTradeField_InvestorIDEnd_set(swigCPtr, this, value);
  }

  public String getInvestorIDEnd() {
    return ctpJNI.CShfeFtdcReqInvestorTradeField_InvestorIDEnd_get(swigCPtr, this);
  }

  public void setInstIDStart(String value) {
    ctpJNI.CShfeFtdcReqInvestorTradeField_InstIDStart_set(swigCPtr, this, value);
  }

  public String getInstIDStart() {
    return ctpJNI.CShfeFtdcReqInvestorTradeField_InstIDStart_get(swigCPtr, this);
  }

  public void setInstIDEnd(String value) {
    ctpJNI.CShfeFtdcReqInvestorTradeField_InstIDEnd_set(swigCPtr, this, value);
  }

  public String getInstIDEnd() {
    return ctpJNI.CShfeFtdcReqInvestorTradeField_InstIDEnd_get(swigCPtr, this);
  }

  public void setProductIDStart(String value) {
    ctpJNI.CShfeFtdcReqInvestorTradeField_ProductIDStart_set(swigCPtr, this, value);
  }

  public String getProductIDStart() {
    return ctpJNI.CShfeFtdcReqInvestorTradeField_ProductIDStart_get(swigCPtr, this);
  }

  public void setProductIDEnd(String value) {
    ctpJNI.CShfeFtdcReqInvestorTradeField_ProductIDEnd_set(swigCPtr, this, value);
  }

  public String getProductIDEnd() {
    return ctpJNI.CShfeFtdcReqInvestorTradeField_ProductIDEnd_get(swigCPtr, this);
  }

  public void setSortType(char value) {
    ctpJNI.CShfeFtdcReqInvestorTradeField_SortType_set(swigCPtr, this, value);
  }

  public char getSortType() {
    return ctpJNI.CShfeFtdcReqInvestorTradeField_SortType_get(swigCPtr, this);
  }

  public void setResultCount(int value) {
    ctpJNI.CShfeFtdcReqInvestorTradeField_ResultCount_set(swigCPtr, this, value);
  }

  public int getResultCount() {
    return ctpJNI.CShfeFtdcReqInvestorTradeField_ResultCount_get(swigCPtr, this);
  }

  public void setResultRatio(double value) {
    ctpJNI.CShfeFtdcReqInvestorTradeField_ResultRatio_set(swigCPtr, this, value);
  }

  public double getResultRatio() {
    return ctpJNI.CShfeFtdcReqInvestorTradeField_ResultRatio_get(swigCPtr, this);
  }

  public CShfeFtdcReqInvestorTradeField() {
    this(ctpJNI.new_CShfeFtdcReqInvestorTradeField(), true);
  }

}
