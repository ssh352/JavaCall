/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CThostFtdcTransferFutureToBankRspField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CThostFtdcTransferFutureToBankRspField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CThostFtdcTransferFutureToBankRspField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcTransferFutureToBankRspField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setRetCode(String value) {
    ctpJNI.CThostFtdcTransferFutureToBankRspField_RetCode_set(swigCPtr, this, value);
  }

  public String getRetCode() {
    return ctpJNI.CThostFtdcTransferFutureToBankRspField_RetCode_get(swigCPtr, this);
  }

  public void setRetInfo(String value) {
    ctpJNI.CThostFtdcTransferFutureToBankRspField_RetInfo_set(swigCPtr, this, value);
  }

  public String getRetInfo() {
    return ctpJNI.CThostFtdcTransferFutureToBankRspField_RetInfo_get(swigCPtr, this);
  }

  public void setFutureAccount(String value) {
    ctpJNI.CThostFtdcTransferFutureToBankRspField_FutureAccount_set(swigCPtr, this, value);
  }

  public String getFutureAccount() {
    return ctpJNI.CThostFtdcTransferFutureToBankRspField_FutureAccount_get(swigCPtr, this);
  }

  public void setTradeAmt(double value) {
    ctpJNI.CThostFtdcTransferFutureToBankRspField_TradeAmt_set(swigCPtr, this, value);
  }

  public double getTradeAmt() {
    return ctpJNI.CThostFtdcTransferFutureToBankRspField_TradeAmt_get(swigCPtr, this);
  }

  public void setCustFee(double value) {
    ctpJNI.CThostFtdcTransferFutureToBankRspField_CustFee_set(swigCPtr, this, value);
  }

  public double getCustFee() {
    return ctpJNI.CThostFtdcTransferFutureToBankRspField_CustFee_get(swigCPtr, this);
  }

  public void setCurrencyCode(String value) {
    ctpJNI.CThostFtdcTransferFutureToBankRspField_CurrencyCode_set(swigCPtr, this, value);
  }

  public String getCurrencyCode() {
    return ctpJNI.CThostFtdcTransferFutureToBankRspField_CurrencyCode_get(swigCPtr, this);
  }

  public CThostFtdcTransferFutureToBankRspField() {
    this(ctpJNI.new_CThostFtdcTransferFutureToBankRspField(), true);
  }

}
