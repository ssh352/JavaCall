/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CThostFtdcReturnResultField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CThostFtdcReturnResultField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CThostFtdcReturnResultField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcReturnResultField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setReturnCode(String value) {
    ctpJNI.CThostFtdcReturnResultField_ReturnCode_set(swigCPtr, this, value);
  }

  public String getReturnCode() {
    return ctpJNI.CThostFtdcReturnResultField_ReturnCode_get(swigCPtr, this);
  }

  public void setDescrInfoForReturnCode(String value) {
    ctpJNI.CThostFtdcReturnResultField_DescrInfoForReturnCode_set(swigCPtr, this, value);
  }

  public String getDescrInfoForReturnCode() {
    return ctpJNI.CThostFtdcReturnResultField_DescrInfoForReturnCode_get(swigCPtr, this);
  }

  public CThostFtdcReturnResultField() {
    this(ctpJNI.new_CThostFtdcReturnResultField(), true);
  }

}
