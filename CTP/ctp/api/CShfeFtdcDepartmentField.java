/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcDepartmentField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcDepartmentField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcDepartmentField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcDepartmentField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcDepartmentField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcDepartmentField_BrokerID_get(swigCPtr, this);
  }

  public void setDepartmentID(String value) {
    ctpJNI.CShfeFtdcDepartmentField_DepartmentID_set(swigCPtr, this, value);
  }

  public String getDepartmentID() {
    return ctpJNI.CShfeFtdcDepartmentField_DepartmentID_get(swigCPtr, this);
  }

  public void setDepartmentName(String value) {
    ctpJNI.CShfeFtdcDepartmentField_DepartmentName_set(swigCPtr, this, value);
  }

  public String getDepartmentName() {
    return ctpJNI.CShfeFtdcDepartmentField_DepartmentName_get(swigCPtr, this);
  }

  public CShfeFtdcDepartmentField() {
    this(ctpJNI.new_CShfeFtdcDepartmentField(), true);
  }

}
