/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CThostFtdcQueryMaxOrderVolumeField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CThostFtdcQueryMaxOrderVolumeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CThostFtdcQueryMaxOrderVolumeField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcQueryMaxOrderVolumeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcQueryMaxOrderVolumeField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcQueryMaxOrderVolumeField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CThostFtdcQueryMaxOrderVolumeField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CThostFtdcQueryMaxOrderVolumeField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ctpJNI.CThostFtdcQueryMaxOrderVolumeField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpJNI.CThostFtdcQueryMaxOrderVolumeField_InstrumentID_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    ctpJNI.CThostFtdcQueryMaxOrderVolumeField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return ctpJNI.CThostFtdcQueryMaxOrderVolumeField_Direction_get(swigCPtr, this);
  }

  public void setOffsetFlag(char value) {
    ctpJNI.CThostFtdcQueryMaxOrderVolumeField_OffsetFlag_set(swigCPtr, this, value);
  }

  public char getOffsetFlag() {
    return ctpJNI.CThostFtdcQueryMaxOrderVolumeField_OffsetFlag_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    ctpJNI.CThostFtdcQueryMaxOrderVolumeField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return ctpJNI.CThostFtdcQueryMaxOrderVolumeField_HedgeFlag_get(swigCPtr, this);
  }

  public void setMaxVolume(int value) {
    ctpJNI.CThostFtdcQueryMaxOrderVolumeField_MaxVolume_set(swigCPtr, this, value);
  }

  public int getMaxVolume() {
    return ctpJNI.CThostFtdcQueryMaxOrderVolumeField_MaxVolume_get(swigCPtr, this);
  }

  public CThostFtdcQueryMaxOrderVolumeField() {
    this(ctpJNI.new_CThostFtdcQueryMaxOrderVolumeField(), true);
  }

}
