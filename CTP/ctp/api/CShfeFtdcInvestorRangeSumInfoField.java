/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcInvestorRangeSumInfoField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcInvestorRangeSumInfoField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcInvestorRangeSumInfoField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcInvestorRangeSumInfoField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setStartindex(int value) {
    ctpJNI.CShfeFtdcInvestorRangeSumInfoField_startindex_set(swigCPtr, this, value);
  }

  public int getStartindex() {
    return ctpJNI.CShfeFtdcInvestorRangeSumInfoField_startindex_get(swigCPtr, this);
  }

  public void setEndindex(int value) {
    ctpJNI.CShfeFtdcInvestorRangeSumInfoField_endindex_set(swigCPtr, this, value);
  }

  public int getEndindex() {
    return ctpJNI.CShfeFtdcInvestorRangeSumInfoField_endindex_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcInvestorRangeSumInfoField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcInvestorRangeSumInfoField_BrokerID_get(swigCPtr, this);
  }

  public CShfeFtdcInvestorRangeSumInfoField() {
    this(ctpJNI.new_CShfeFtdcInvestorRangeSumInfoField(), true);
  }

}
