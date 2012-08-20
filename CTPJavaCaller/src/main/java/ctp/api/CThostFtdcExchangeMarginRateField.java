/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CThostFtdcExchangeMarginRateField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CThostFtdcExchangeMarginRateField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CThostFtdcExchangeMarginRateField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcExchangeMarginRateField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcExchangeMarginRateField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcExchangeMarginRateField_BrokerID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ctpJNI.CThostFtdcExchangeMarginRateField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpJNI.CThostFtdcExchangeMarginRateField_InstrumentID_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    ctpJNI.CThostFtdcExchangeMarginRateField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return ctpJNI.CThostFtdcExchangeMarginRateField_HedgeFlag_get(swigCPtr, this);
  }

  public void setLongMarginRatioByMoney(double value) {
    ctpJNI.CThostFtdcExchangeMarginRateField_LongMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getLongMarginRatioByMoney() {
    return ctpJNI.CThostFtdcExchangeMarginRateField_LongMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setLongMarginRatioByVolume(double value) {
    ctpJNI.CThostFtdcExchangeMarginRateField_LongMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getLongMarginRatioByVolume() {
    return ctpJNI.CThostFtdcExchangeMarginRateField_LongMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setShortMarginRatioByMoney(double value) {
    ctpJNI.CThostFtdcExchangeMarginRateField_ShortMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getShortMarginRatioByMoney() {
    return ctpJNI.CThostFtdcExchangeMarginRateField_ShortMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setShortMarginRatioByVolume(double value) {
    ctpJNI.CThostFtdcExchangeMarginRateField_ShortMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getShortMarginRatioByVolume() {
    return ctpJNI.CThostFtdcExchangeMarginRateField_ShortMarginRatioByVolume_get(swigCPtr, this);
  }

  public CThostFtdcExchangeMarginRateField() {
    this(ctpJNI.new_CThostFtdcExchangeMarginRateField(), true);
  }

}
