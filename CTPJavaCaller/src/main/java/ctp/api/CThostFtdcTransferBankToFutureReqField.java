/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CThostFtdcTransferBankToFutureReqField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CThostFtdcTransferBankToFutureReqField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CThostFtdcTransferBankToFutureReqField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcTransferBankToFutureReqField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFutureAccount(String value) {
    ctpJNI.CThostFtdcTransferBankToFutureReqField_FutureAccount_set(swigCPtr, this, value);
  }

  public String getFutureAccount() {
    return ctpJNI.CThostFtdcTransferBankToFutureReqField_FutureAccount_get(swigCPtr, this);
  }

  public void setFuturePwdFlag(char value) {
    ctpJNI.CThostFtdcTransferBankToFutureReqField_FuturePwdFlag_set(swigCPtr, this, value);
  }

  public char getFuturePwdFlag() {
    return ctpJNI.CThostFtdcTransferBankToFutureReqField_FuturePwdFlag_get(swigCPtr, this);
  }

  public void setFutureAccPwd(String value) {
    ctpJNI.CThostFtdcTransferBankToFutureReqField_FutureAccPwd_set(swigCPtr, this, value);
  }

  public String getFutureAccPwd() {
    return ctpJNI.CThostFtdcTransferBankToFutureReqField_FutureAccPwd_get(swigCPtr, this);
  }

  public void setTradeAmt(double value) {
    ctpJNI.CThostFtdcTransferBankToFutureReqField_TradeAmt_set(swigCPtr, this, value);
  }

  public double getTradeAmt() {
    return ctpJNI.CThostFtdcTransferBankToFutureReqField_TradeAmt_get(swigCPtr, this);
  }

  public void setCustFee(double value) {
    ctpJNI.CThostFtdcTransferBankToFutureReqField_CustFee_set(swigCPtr, this, value);
  }

  public double getCustFee() {
    return ctpJNI.CThostFtdcTransferBankToFutureReqField_CustFee_get(swigCPtr, this);
  }

  public void setCurrencyCode(String value) {
    ctpJNI.CThostFtdcTransferBankToFutureReqField_CurrencyCode_set(swigCPtr, this, value);
  }

  public String getCurrencyCode() {
    return ctpJNI.CThostFtdcTransferBankToFutureReqField_CurrencyCode_get(swigCPtr, this);
  }

  public CThostFtdcTransferBankToFutureReqField() {
    this(ctpJNI.new_CThostFtdcTransferBankToFutureReqField(), true);
  }

}
