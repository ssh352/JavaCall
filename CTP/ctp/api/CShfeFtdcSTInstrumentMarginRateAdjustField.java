/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcSTInstrumentMarginRateAdjustField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcSTInstrumentMarginRateAdjustField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcSTInstrumentMarginRateAdjustField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcSTInstrumentMarginRateAdjustField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setDay(int value) {
    ctpJNI.CShfeFtdcSTInstrumentMarginRateAdjustField_Day_set(swigCPtr, this, value);
  }

  public int getDay() {
    return ctpJNI.CShfeFtdcSTInstrumentMarginRateAdjustField_Day_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ctpJNI.CShfeFtdcSTInstrumentMarginRateAdjustField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpJNI.CShfeFtdcSTInstrumentMarginRateAdjustField_InstrumentID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    ctpJNI.CShfeFtdcSTInstrumentMarginRateAdjustField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return ctpJNI.CShfeFtdcSTInstrumentMarginRateAdjustField_InvestorRange_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcSTInstrumentMarginRateAdjustField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcSTInstrumentMarginRateAdjustField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CShfeFtdcSTInstrumentMarginRateAdjustField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CShfeFtdcSTInstrumentMarginRateAdjustField_InvestorID_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    ctpJNI.CShfeFtdcSTInstrumentMarginRateAdjustField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return ctpJNI.CShfeFtdcSTInstrumentMarginRateAdjustField_HedgeFlag_get(swigCPtr, this);
  }

  public void setLongMarginRatioByMoney(double value) {
    ctpJNI.CShfeFtdcSTInstrumentMarginRateAdjustField_LongMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getLongMarginRatioByMoney() {
    return ctpJNI.CShfeFtdcSTInstrumentMarginRateAdjustField_LongMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setLongMarginRatioByVolume(double value) {
    ctpJNI.CShfeFtdcSTInstrumentMarginRateAdjustField_LongMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getLongMarginRatioByVolume() {
    return ctpJNI.CShfeFtdcSTInstrumentMarginRateAdjustField_LongMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setShortMarginRatioByMoney(double value) {
    ctpJNI.CShfeFtdcSTInstrumentMarginRateAdjustField_ShortMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getShortMarginRatioByMoney() {
    return ctpJNI.CShfeFtdcSTInstrumentMarginRateAdjustField_ShortMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setShortMarginRatioByVolume(double value) {
    ctpJNI.CShfeFtdcSTInstrumentMarginRateAdjustField_ShortMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getShortMarginRatioByVolume() {
    return ctpJNI.CShfeFtdcSTInstrumentMarginRateAdjustField_ShortMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setIsRelative(int value) {
    ctpJNI.CShfeFtdcSTInstrumentMarginRateAdjustField_IsRelative_set(swigCPtr, this, value);
  }

  public int getIsRelative() {
    return ctpJNI.CShfeFtdcSTInstrumentMarginRateAdjustField_IsRelative_get(swigCPtr, this);
  }

  public CShfeFtdcSTInstrumentMarginRateAdjustField() {
    this(ctpJNI.new_CShfeFtdcSTInstrumentMarginRateAdjustField(), true);
  }

}
