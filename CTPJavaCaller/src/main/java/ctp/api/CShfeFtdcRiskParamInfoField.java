/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcRiskParamInfoField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcRiskParamInfoField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcRiskParamInfoField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcRiskParamInfoField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setParamID(int value) {
    ctpJNI.CShfeFtdcRiskParamInfoField_ParamID_set(swigCPtr, this, value);
  }

  public int getParamID() {
    return ctpJNI.CShfeFtdcRiskParamInfoField_ParamID_get(swigCPtr, this);
  }

  public void setDescription(String value) {
    ctpJNI.CShfeFtdcRiskParamInfoField_Description_set(swigCPtr, this, value);
  }

  public String getDescription() {
    return ctpJNI.CShfeFtdcRiskParamInfoField_Description_get(swigCPtr, this);
  }

  public CShfeFtdcRiskParamInfoField() {
    this(ctpJNI.new_CShfeFtdcRiskParamInfoField(), true);
  }

}
