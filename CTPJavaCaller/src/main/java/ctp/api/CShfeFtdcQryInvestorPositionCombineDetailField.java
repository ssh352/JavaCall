/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcQryInvestorPositionCombineDetailField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcQryInvestorPositionCombineDetailField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcQryInvestorPositionCombineDetailField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcQryInvestorPositionCombineDetailField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcQryInvestorPositionCombineDetailField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcQryInvestorPositionCombineDetailField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CShfeFtdcQryInvestorPositionCombineDetailField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CShfeFtdcQryInvestorPositionCombineDetailField_InvestorID_get(swigCPtr, this);
  }

  public void setCombInstrumentID(String value) {
    ctpJNI.CShfeFtdcQryInvestorPositionCombineDetailField_CombInstrumentID_set(swigCPtr, this, value);
  }

  public String getCombInstrumentID() {
    return ctpJNI.CShfeFtdcQryInvestorPositionCombineDetailField_CombInstrumentID_get(swigCPtr, this);
  }

  public CShfeFtdcQryInvestorPositionCombineDetailField() {
    this(ctpJNI.new_CShfeFtdcQryInvestorPositionCombineDetailField(), true);
  }

}
