/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcInvestorWithdrawAlgorithmField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcInvestorWithdrawAlgorithmField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcInvestorWithdrawAlgorithmField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcInvestorWithdrawAlgorithmField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcInvestorWithdrawAlgorithmField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcInvestorWithdrawAlgorithmField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    ctpJNI.CShfeFtdcInvestorWithdrawAlgorithmField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return ctpJNI.CShfeFtdcInvestorWithdrawAlgorithmField_InvestorRange_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CShfeFtdcInvestorWithdrawAlgorithmField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CShfeFtdcInvestorWithdrawAlgorithmField_InvestorID_get(swigCPtr, this);
  }

  public void setUsingRatio(double value) {
    ctpJNI.CShfeFtdcInvestorWithdrawAlgorithmField_UsingRatio_set(swigCPtr, this, value);
  }

  public double getUsingRatio() {
    return ctpJNI.CShfeFtdcInvestorWithdrawAlgorithmField_UsingRatio_get(swigCPtr, this);
  }

  public CShfeFtdcInvestorWithdrawAlgorithmField() {
    this(ctpJNI.new_CShfeFtdcInvestorWithdrawAlgorithmField(), true);
  }

}
