/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcQryInstrumentCommissionRateField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcQryInstrumentCommissionRateField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcQryInstrumentCommissionRateField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcQryInstrumentCommissionRateField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcQryInstrumentCommissionRateField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcQryInstrumentCommissionRateField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CShfeFtdcQryInstrumentCommissionRateField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CShfeFtdcQryInstrumentCommissionRateField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ctpJNI.CShfeFtdcQryInstrumentCommissionRateField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpJNI.CShfeFtdcQryInstrumentCommissionRateField_InstrumentID_get(swigCPtr, this);
  }

  public CShfeFtdcQryInstrumentCommissionRateField() {
    this(ctpJNI.new_CShfeFtdcQryInstrumentCommissionRateField(), true);
  }

}
