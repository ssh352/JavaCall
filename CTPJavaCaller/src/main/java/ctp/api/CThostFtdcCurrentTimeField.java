/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CThostFtdcCurrentTimeField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CThostFtdcCurrentTimeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CThostFtdcCurrentTimeField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcCurrentTimeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setCurrDate(String value) {
    ctpJNI.CThostFtdcCurrentTimeField_CurrDate_set(swigCPtr, this, value);
  }

  public String getCurrDate() {
    return ctpJNI.CThostFtdcCurrentTimeField_CurrDate_get(swigCPtr, this);
  }

  public void setCurrTime(String value) {
    ctpJNI.CThostFtdcCurrentTimeField_CurrTime_set(swigCPtr, this, value);
  }

  public String getCurrTime() {
    return ctpJNI.CThostFtdcCurrentTimeField_CurrTime_get(swigCPtr, this);
  }

  public void setCurrMillisec(int value) {
    ctpJNI.CThostFtdcCurrentTimeField_CurrMillisec_set(swigCPtr, this, value);
  }

  public int getCurrMillisec() {
    return ctpJNI.CThostFtdcCurrentTimeField_CurrMillisec_get(swigCPtr, this);
  }

  public CThostFtdcCurrentTimeField() {
    this(ctpJNI.new_CThostFtdcCurrentTimeField(), true);
  }

}
