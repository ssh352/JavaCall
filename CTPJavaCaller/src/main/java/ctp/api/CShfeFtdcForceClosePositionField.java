/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcForceClosePositionField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcForceClosePositionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcForceClosePositionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcForceClosePositionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    ctpJNI.CShfeFtdcForceClosePositionField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpJNI.CShfeFtdcForceClosePositionField_InstrumentID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcForceClosePositionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcForceClosePositionField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CShfeFtdcForceClosePositionField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CShfeFtdcForceClosePositionField_InvestorID_get(swigCPtr, this);
  }

  public void setPosiDirection(char value) {
    ctpJNI.CShfeFtdcForceClosePositionField_PosiDirection_set(swigCPtr, this, value);
  }

  public char getPosiDirection() {
    return ctpJNI.CShfeFtdcForceClosePositionField_PosiDirection_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    ctpJNI.CShfeFtdcForceClosePositionField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return ctpJNI.CShfeFtdcForceClosePositionField_HedgeFlag_get(swigCPtr, this);
  }

  public void setPositionDate(char value) {
    ctpJNI.CShfeFtdcForceClosePositionField_PositionDate_set(swigCPtr, this, value);
  }

  public char getPositionDate() {
    return ctpJNI.CShfeFtdcForceClosePositionField_PositionDate_get(swigCPtr, this);
  }

  public void setPosition(int value) {
    ctpJNI.CShfeFtdcForceClosePositionField_Position_set(swigCPtr, this, value);
  }

  public int getPosition() {
    return ctpJNI.CShfeFtdcForceClosePositionField_Position_get(swigCPtr, this);
  }

  public void setFCPosition(int value) {
    ctpJNI.CShfeFtdcForceClosePositionField_FCPosition_set(swigCPtr, this, value);
  }

  public int getFCPosition() {
    return ctpJNI.CShfeFtdcForceClosePositionField_FCPosition_get(swigCPtr, this);
  }

  public void setFCPriceType(char value) {
    ctpJNI.CShfeFtdcForceClosePositionField_FCPriceType_set(swigCPtr, this, value);
  }

  public char getFCPriceType() {
    return ctpJNI.CShfeFtdcForceClosePositionField_FCPriceType_get(swigCPtr, this);
  }

  public void setPriceTick(int value) {
    ctpJNI.CShfeFtdcForceClosePositionField_PriceTick_set(swigCPtr, this, value);
  }

  public int getPriceTick() {
    return ctpJNI.CShfeFtdcForceClosePositionField_PriceTick_get(swigCPtr, this);
  }

  public void setFCPrice(double value) {
    ctpJNI.CShfeFtdcForceClosePositionField_FCPrice_set(swigCPtr, this, value);
  }

  public double getFCPrice() {
    return ctpJNI.CShfeFtdcForceClosePositionField_FCPrice_get(swigCPtr, this);
  }

  public void setReleaseMargin(double value) {
    ctpJNI.CShfeFtdcForceClosePositionField_ReleaseMargin_set(swigCPtr, this, value);
  }

  public double getReleaseMargin() {
    return ctpJNI.CShfeFtdcForceClosePositionField_ReleaseMargin_get(swigCPtr, this);
  }

  public void setCloseProfit(double value) {
    ctpJNI.CShfeFtdcForceClosePositionField_CloseProfit_set(swigCPtr, this, value);
  }

  public double getCloseProfit() {
    return ctpJNI.CShfeFtdcForceClosePositionField_CloseProfit_get(swigCPtr, this);
  }

  public void setExchReleaseMargin(double value) {
    ctpJNI.CShfeFtdcForceClosePositionField_ExchReleaseMargin_set(swigCPtr, this, value);
  }

  public double getExchReleaseMargin() {
    return ctpJNI.CShfeFtdcForceClosePositionField_ExchReleaseMargin_get(swigCPtr, this);
  }

  public CShfeFtdcForceClosePositionField() {
    this(ctpJNI.new_CShfeFtdcForceClosePositionField(), true);
  }

}
