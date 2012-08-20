/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcBrokerWithdrawAlgorithmField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcBrokerWithdrawAlgorithmField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcBrokerWithdrawAlgorithmField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcBrokerWithdrawAlgorithmField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcBrokerWithdrawAlgorithmField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcBrokerWithdrawAlgorithmField_BrokerID_get(swigCPtr, this);
  }

  public void setWithdrawAlgorithm(char value) {
    ctpJNI.CShfeFtdcBrokerWithdrawAlgorithmField_WithdrawAlgorithm_set(swigCPtr, this, value);
  }

  public char getWithdrawAlgorithm() {
    return ctpJNI.CShfeFtdcBrokerWithdrawAlgorithmField_WithdrawAlgorithm_get(swigCPtr, this);
  }

  public void setUsingRatio(double value) {
    ctpJNI.CShfeFtdcBrokerWithdrawAlgorithmField_UsingRatio_set(swigCPtr, this, value);
  }

  public double getUsingRatio() {
    return ctpJNI.CShfeFtdcBrokerWithdrawAlgorithmField_UsingRatio_get(swigCPtr, this);
  }

  public void setIncludeCloseProfit(char value) {
    ctpJNI.CShfeFtdcBrokerWithdrawAlgorithmField_IncludeCloseProfit_set(swigCPtr, this, value);
  }

  public char getIncludeCloseProfit() {
    return ctpJNI.CShfeFtdcBrokerWithdrawAlgorithmField_IncludeCloseProfit_get(swigCPtr, this);
  }

  public void setAllWithoutTrade(char value) {
    ctpJNI.CShfeFtdcBrokerWithdrawAlgorithmField_AllWithoutTrade_set(swigCPtr, this, value);
  }

  public char getAllWithoutTrade() {
    return ctpJNI.CShfeFtdcBrokerWithdrawAlgorithmField_AllWithoutTrade_get(swigCPtr, this);
  }

  public void setAvailIncludeCloseProfit(char value) {
    ctpJNI.CShfeFtdcBrokerWithdrawAlgorithmField_AvailIncludeCloseProfit_set(swigCPtr, this, value);
  }

  public char getAvailIncludeCloseProfit() {
    return ctpJNI.CShfeFtdcBrokerWithdrawAlgorithmField_AvailIncludeCloseProfit_get(swigCPtr, this);
  }

  public void setIsBrokerUserEvent(int value) {
    ctpJNI.CShfeFtdcBrokerWithdrawAlgorithmField_IsBrokerUserEvent_set(swigCPtr, this, value);
  }

  public int getIsBrokerUserEvent() {
    return ctpJNI.CShfeFtdcBrokerWithdrawAlgorithmField_IsBrokerUserEvent_get(swigCPtr, this);
  }

  public CShfeFtdcBrokerWithdrawAlgorithmField() {
    this(ctpJNI.new_CShfeFtdcBrokerWithdrawAlgorithmField(), true);
  }

}
