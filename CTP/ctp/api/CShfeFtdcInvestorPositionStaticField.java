/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcInvestorPositionStaticField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcInvestorPositionStaticField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcInvestorPositionStaticField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcInvestorPositionStaticField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setProductID(String value) {
    ctpJNI.CShfeFtdcInvestorPositionStaticField_ProductID_set(swigCPtr, this, value);
  }

  public String getProductID() {
    return ctpJNI.CShfeFtdcInvestorPositionStaticField_ProductID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ctpJNI.CShfeFtdcInvestorPositionStaticField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpJNI.CShfeFtdcInvestorPositionStaticField_InstrumentID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcInvestorPositionStaticField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcInvestorPositionStaticField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CShfeFtdcInvestorPositionStaticField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CShfeFtdcInvestorPositionStaticField_InvestorID_get(swigCPtr, this);
  }

  public void setYdPosition(int value) {
    ctpJNI.CShfeFtdcInvestorPositionStaticField_YdPosition_set(swigCPtr, this, value);
  }

  public int getYdPosition() {
    return ctpJNI.CShfeFtdcInvestorPositionStaticField_YdPosition_get(swigCPtr, this);
  }

  public void setPosition(int value) {
    ctpJNI.CShfeFtdcInvestorPositionStaticField_Position_set(swigCPtr, this, value);
  }

  public int getPosition() {
    return ctpJNI.CShfeFtdcInvestorPositionStaticField_Position_get(swigCPtr, this);
  }

  public void setLongPosition(int value) {
    ctpJNI.CShfeFtdcInvestorPositionStaticField_LongPosition_set(swigCPtr, this, value);
  }

  public int getLongPosition() {
    return ctpJNI.CShfeFtdcInvestorPositionStaticField_LongPosition_get(swigCPtr, this);
  }

  public void setShortPosition(int value) {
    ctpJNI.CShfeFtdcInvestorPositionStaticField_ShortPosition_set(swigCPtr, this, value);
  }

  public int getShortPosition() {
    return ctpJNI.CShfeFtdcInvestorPositionStaticField_ShortPosition_get(swigCPtr, this);
  }

  public void setNetPosition(int value) {
    ctpJNI.CShfeFtdcInvestorPositionStaticField_NetPosition_set(swigCPtr, this, value);
  }

  public int getNetPosition() {
    return ctpJNI.CShfeFtdcInvestorPositionStaticField_NetPosition_get(swigCPtr, this);
  }

  public void setSpecuLongPosi(int value) {
    ctpJNI.CShfeFtdcInvestorPositionStaticField_SpecuLongPosi_set(swigCPtr, this, value);
  }

  public int getSpecuLongPosi() {
    return ctpJNI.CShfeFtdcInvestorPositionStaticField_SpecuLongPosi_get(swigCPtr, this);
  }

  public void setSpecuShortPosi(int value) {
    ctpJNI.CShfeFtdcInvestorPositionStaticField_SpecuShortPosi_set(swigCPtr, this, value);
  }

  public int getSpecuShortPosi() {
    return ctpJNI.CShfeFtdcInvestorPositionStaticField_SpecuShortPosi_get(swigCPtr, this);
  }

  public void setHedgeLongPosi(int value) {
    ctpJNI.CShfeFtdcInvestorPositionStaticField_HedgeLongPosi_set(swigCPtr, this, value);
  }

  public int getHedgeLongPosi() {
    return ctpJNI.CShfeFtdcInvestorPositionStaticField_HedgeLongPosi_get(swigCPtr, this);
  }

  public void setHedgeShortPosi(int value) {
    ctpJNI.CShfeFtdcInvestorPositionStaticField_HedgeShortPosi_set(swigCPtr, this, value);
  }

  public int getHedgeShortPosi() {
    return ctpJNI.CShfeFtdcInvestorPositionStaticField_HedgeShortPosi_get(swigCPtr, this);
  }

  public void setTodayPosition(int value) {
    ctpJNI.CShfeFtdcInvestorPositionStaticField_TodayPosition_set(swigCPtr, this, value);
  }

  public int getTodayPosition() {
    return ctpJNI.CShfeFtdcInvestorPositionStaticField_TodayPosition_get(swigCPtr, this);
  }

  public void setPositionCost(double value) {
    ctpJNI.CShfeFtdcInvestorPositionStaticField_PositionCost_set(swigCPtr, this, value);
  }

  public double getPositionCost() {
    return ctpJNI.CShfeFtdcInvestorPositionStaticField_PositionCost_get(swigCPtr, this);
  }

  public CShfeFtdcInvestorPositionStaticField() {
    this(ctpJNI.new_CShfeFtdcInvestorPositionStaticField(), true);
  }

}
