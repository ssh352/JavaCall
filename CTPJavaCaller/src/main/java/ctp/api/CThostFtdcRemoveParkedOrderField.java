/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CThostFtdcRemoveParkedOrderField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CThostFtdcRemoveParkedOrderField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CThostFtdcRemoveParkedOrderField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcRemoveParkedOrderField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcRemoveParkedOrderField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcRemoveParkedOrderField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CThostFtdcRemoveParkedOrderField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CThostFtdcRemoveParkedOrderField_InvestorID_get(swigCPtr, this);
  }

  public void setParkedOrderID(String value) {
    ctpJNI.CThostFtdcRemoveParkedOrderField_ParkedOrderID_set(swigCPtr, this, value);
  }

  public String getParkedOrderID() {
    return ctpJNI.CThostFtdcRemoveParkedOrderField_ParkedOrderID_get(swigCPtr, this);
  }

  public CThostFtdcRemoveParkedOrderField() {
    this(ctpJNI.new_CThostFtdcRemoveParkedOrderField(), true);
  }

}
