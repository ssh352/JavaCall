/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcPriceRangeField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcPriceRangeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcPriceRangeField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcPriceRangeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    ctpJNI.CShfeFtdcPriceRangeField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpJNI.CShfeFtdcPriceRangeField_InstrumentID_get(swigCPtr, this);
  }

  public void setPrice1(double value) {
    ctpJNI.CShfeFtdcPriceRangeField_Price1_set(swigCPtr, this, value);
  }

  public double getPrice1() {
    return ctpJNI.CShfeFtdcPriceRangeField_Price1_get(swigCPtr, this);
  }

  public void setPrice2(double value) {
    ctpJNI.CShfeFtdcPriceRangeField_Price2_set(swigCPtr, this, value);
  }

  public double getPrice2() {
    return ctpJNI.CShfeFtdcPriceRangeField_Price2_get(swigCPtr, this);
  }

  public CShfeFtdcPriceRangeField() {
    this(ctpJNI.new_CShfeFtdcPriceRangeField(), true);
  }

}
