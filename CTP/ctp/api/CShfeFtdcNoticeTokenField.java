/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcNoticeTokenField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcNoticeTokenField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcNoticeTokenField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcNoticeTokenField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setToken(String value) {
    ctpJNI.CShfeFtdcNoticeTokenField_Token_set(swigCPtr, this, value);
  }

  public String getToken() {
    return ctpJNI.CShfeFtdcNoticeTokenField_Token_get(swigCPtr, this);
  }

  public void setDescription(String value) {
    ctpJNI.CShfeFtdcNoticeTokenField_Description_set(swigCPtr, this, value);
  }

  public String getDescription() {
    return ctpJNI.CShfeFtdcNoticeTokenField_Description_get(swigCPtr, this);
  }

  public CShfeFtdcNoticeTokenField() {
    this(ctpJNI.new_CShfeFtdcNoticeTokenField(), true);
  }

}
