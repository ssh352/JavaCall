/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcInvestorDepartmentFlatField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcInvestorDepartmentFlatField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcInvestorDepartmentFlatField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcInvestorDepartmentFlatField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcInvestorDepartmentFlatField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcInvestorDepartmentFlatField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CShfeFtdcInvestorDepartmentFlatField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CShfeFtdcInvestorDepartmentFlatField_InvestorID_get(swigCPtr, this);
  }

  public void setDepartmentID(String value) {
    ctpJNI.CShfeFtdcInvestorDepartmentFlatField_DepartmentID_set(swigCPtr, this, value);
  }

  public String getDepartmentID() {
    return ctpJNI.CShfeFtdcInvestorDepartmentFlatField_DepartmentID_get(swigCPtr, this);
  }

  public CShfeFtdcInvestorDepartmentFlatField() {
    this(ctpJNI.new_CShfeFtdcInvestorDepartmentFlatField(), true);
  }

}