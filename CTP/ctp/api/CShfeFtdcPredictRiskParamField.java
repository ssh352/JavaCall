/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcPredictRiskParamField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcPredictRiskParamField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcPredictRiskParamField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcPredictRiskParamField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setD1(int value) {
    ctpJNI.CShfeFtdcPredictRiskParamField_D1_set(swigCPtr, this, value);
  }

  public int getD1() {
    return ctpJNI.CShfeFtdcPredictRiskParamField_D1_get(swigCPtr, this);
  }

  public void setIsFilter(int value) {
    ctpJNI.CShfeFtdcPredictRiskParamField_IsFilter_set(swigCPtr, this, value);
  }

  public int getIsFilter() {
    return ctpJNI.CShfeFtdcPredictRiskParamField_IsFilter_get(swigCPtr, this);
  }

  public CShfeFtdcPredictRiskParamField() {
    this(ctpJNI.new_CShfeFtdcPredictRiskParamField(), true);
  }

}
