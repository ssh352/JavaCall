/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CThostFtdcMarketDataLastMatchField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CThostFtdcMarketDataLastMatchField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CThostFtdcMarketDataLastMatchField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcMarketDataLastMatchField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setLastPrice(double value) {
    ctpJNI.CThostFtdcMarketDataLastMatchField_LastPrice_set(swigCPtr, this, value);
  }

  public double getLastPrice() {
    return ctpJNI.CThostFtdcMarketDataLastMatchField_LastPrice_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    ctpJNI.CThostFtdcMarketDataLastMatchField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return ctpJNI.CThostFtdcMarketDataLastMatchField_Volume_get(swigCPtr, this);
  }

  public void setTurnover(double value) {
    ctpJNI.CThostFtdcMarketDataLastMatchField_Turnover_set(swigCPtr, this, value);
  }

  public double getTurnover() {
    return ctpJNI.CThostFtdcMarketDataLastMatchField_Turnover_get(swigCPtr, this);
  }

  public void setOpenInterest(double value) {
    ctpJNI.CThostFtdcMarketDataLastMatchField_OpenInterest_set(swigCPtr, this, value);
  }

  public double getOpenInterest() {
    return ctpJNI.CThostFtdcMarketDataLastMatchField_OpenInterest_get(swigCPtr, this);
  }

  public CThostFtdcMarketDataLastMatchField() {
    this(ctpJNI.new_CThostFtdcMarketDataLastMatchField(), true);
  }

}
