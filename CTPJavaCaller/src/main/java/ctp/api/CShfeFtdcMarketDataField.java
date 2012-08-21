/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcMarketDataField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcMarketDataField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcMarketDataField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcMarketDataField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    ctpJNI.CShfeFtdcMarketDataField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ctpJNI.CShfeFtdcMarketDataField_TradingDay_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ctpJNI.CShfeFtdcMarketDataField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpJNI.CShfeFtdcMarketDataField_InstrumentID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpJNI.CShfeFtdcMarketDataField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpJNI.CShfeFtdcMarketDataField_ExchangeID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    ctpJNI.CShfeFtdcMarketDataField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return ctpJNI.CShfeFtdcMarketDataField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setLastPrice(double value) {
    ctpJNI.CShfeFtdcMarketDataField_LastPrice_set(swigCPtr, this, value);
  }

  public double getLastPrice() {
    return ctpJNI.CShfeFtdcMarketDataField_LastPrice_get(swigCPtr, this);
  }

  public void setPreSettlementPrice(double value) {
    ctpJNI.CShfeFtdcMarketDataField_PreSettlementPrice_set(swigCPtr, this, value);
  }

  public double getPreSettlementPrice() {
    return ctpJNI.CShfeFtdcMarketDataField_PreSettlementPrice_get(swigCPtr, this);
  }

  public void setPreClosePrice(double value) {
    ctpJNI.CShfeFtdcMarketDataField_PreClosePrice_set(swigCPtr, this, value);
  }

  public double getPreClosePrice() {
    return ctpJNI.CShfeFtdcMarketDataField_PreClosePrice_get(swigCPtr, this);
  }

  public void setPreOpenInterest(double value) {
    ctpJNI.CShfeFtdcMarketDataField_PreOpenInterest_set(swigCPtr, this, value);
  }

  public double getPreOpenInterest() {
    return ctpJNI.CShfeFtdcMarketDataField_PreOpenInterest_get(swigCPtr, this);
  }

  public void setOpenPrice(double value) {
    ctpJNI.CShfeFtdcMarketDataField_OpenPrice_set(swigCPtr, this, value);
  }

  public double getOpenPrice() {
    return ctpJNI.CShfeFtdcMarketDataField_OpenPrice_get(swigCPtr, this);
  }

  public void setHighestPrice(double value) {
    ctpJNI.CShfeFtdcMarketDataField_HighestPrice_set(swigCPtr, this, value);
  }

  public double getHighestPrice() {
    return ctpJNI.CShfeFtdcMarketDataField_HighestPrice_get(swigCPtr, this);
  }

  public void setLowestPrice(double value) {
    ctpJNI.CShfeFtdcMarketDataField_LowestPrice_set(swigCPtr, this, value);
  }

  public double getLowestPrice() {
    return ctpJNI.CShfeFtdcMarketDataField_LowestPrice_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    ctpJNI.CShfeFtdcMarketDataField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return ctpJNI.CShfeFtdcMarketDataField_Volume_get(swigCPtr, this);
  }

  public void setTurnover(double value) {
    ctpJNI.CShfeFtdcMarketDataField_Turnover_set(swigCPtr, this, value);
  }

  public double getTurnover() {
    return ctpJNI.CShfeFtdcMarketDataField_Turnover_get(swigCPtr, this);
  }

  public void setOpenInterest(double value) {
    ctpJNI.CShfeFtdcMarketDataField_OpenInterest_set(swigCPtr, this, value);
  }

  public double getOpenInterest() {
    return ctpJNI.CShfeFtdcMarketDataField_OpenInterest_get(swigCPtr, this);
  }

  public void setClosePrice(double value) {
    ctpJNI.CShfeFtdcMarketDataField_ClosePrice_set(swigCPtr, this, value);
  }

  public double getClosePrice() {
    return ctpJNI.CShfeFtdcMarketDataField_ClosePrice_get(swigCPtr, this);
  }

  public void setSettlementPrice(double value) {
    ctpJNI.CShfeFtdcMarketDataField_SettlementPrice_set(swigCPtr, this, value);
  }

  public double getSettlementPrice() {
    return ctpJNI.CShfeFtdcMarketDataField_SettlementPrice_get(swigCPtr, this);
  }

  public void setUpperLimitPrice(double value) {
    ctpJNI.CShfeFtdcMarketDataField_UpperLimitPrice_set(swigCPtr, this, value);
  }

  public double getUpperLimitPrice() {
    return ctpJNI.CShfeFtdcMarketDataField_UpperLimitPrice_get(swigCPtr, this);
  }

  public void setLowerLimitPrice(double value) {
    ctpJNI.CShfeFtdcMarketDataField_LowerLimitPrice_set(swigCPtr, this, value);
  }

  public double getLowerLimitPrice() {
    return ctpJNI.CShfeFtdcMarketDataField_LowerLimitPrice_get(swigCPtr, this);
  }

  public void setPreDelta(double value) {
    ctpJNI.CShfeFtdcMarketDataField_PreDelta_set(swigCPtr, this, value);
  }

  public double getPreDelta() {
    return ctpJNI.CShfeFtdcMarketDataField_PreDelta_get(swigCPtr, this);
  }

  public void setCurrDelta(double value) {
    ctpJNI.CShfeFtdcMarketDataField_CurrDelta_set(swigCPtr, this, value);
  }

  public double getCurrDelta() {
    return ctpJNI.CShfeFtdcMarketDataField_CurrDelta_get(swigCPtr, this);
  }

  public void setUpdateTime(String value) {
    ctpJNI.CShfeFtdcMarketDataField_UpdateTime_set(swigCPtr, this, value);
  }

  public String getUpdateTime() {
    return ctpJNI.CShfeFtdcMarketDataField_UpdateTime_get(swigCPtr, this);
  }

  public void setUpdateMillisec(int value) {
    ctpJNI.CShfeFtdcMarketDataField_UpdateMillisec_set(swigCPtr, this, value);
  }

  public int getUpdateMillisec() {
    return ctpJNI.CShfeFtdcMarketDataField_UpdateMillisec_get(swigCPtr, this);
  }

  public CShfeFtdcMarketDataField() {
    this(ctpJNI.new_CShfeFtdcMarketDataField(), true);
  }

}
