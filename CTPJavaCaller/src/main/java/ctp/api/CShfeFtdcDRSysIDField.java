/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcDRSysIDField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcDRSysIDField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcDRSysIDField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcDRSysIDField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setDRSysID(int value) {
    ctpJNI.CShfeFtdcDRSysIDField_DRSysID_set(swigCPtr, this, value);
  }

  public int getDRSysID() {
    return ctpJNI.CShfeFtdcDRSysIDField_DRSysID_get(swigCPtr, this);
  }

  public CShfeFtdcDRSysIDField() {
    this(ctpJNI.new_CShfeFtdcDRSysIDField(), true);
  }

}
