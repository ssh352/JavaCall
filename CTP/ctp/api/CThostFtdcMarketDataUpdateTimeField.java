/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CThostFtdcMarketDataUpdateTimeField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CThostFtdcMarketDataUpdateTimeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CThostFtdcMarketDataUpdateTimeField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcMarketDataUpdateTimeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    ctpJNI.CThostFtdcMarketDataUpdateTimeField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpJNI.CThostFtdcMarketDataUpdateTimeField_InstrumentID_get(swigCPtr, this);
  }

  public void setUpdateTime(String value) {
    ctpJNI.CThostFtdcMarketDataUpdateTimeField_UpdateTime_set(swigCPtr, this, value);
  }

  public String getUpdateTime() {
    return ctpJNI.CThostFtdcMarketDataUpdateTimeField_UpdateTime_get(swigCPtr, this);
  }

  public void setUpdateMillisec(int value) {
    ctpJNI.CThostFtdcMarketDataUpdateTimeField_UpdateMillisec_set(swigCPtr, this, value);
  }

  public int getUpdateMillisec() {
    return ctpJNI.CThostFtdcMarketDataUpdateTimeField_UpdateMillisec_get(swigCPtr, this);
  }

  public CThostFtdcMarketDataUpdateTimeField() {
    this(ctpJNI.new_CThostFtdcMarketDataUpdateTimeField(), true);
  }

}
