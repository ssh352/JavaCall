/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CThostFtdcTransferQryBankRspField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CThostFtdcTransferQryBankRspField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CThostFtdcTransferQryBankRspField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcTransferQryBankRspField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setRetCode(String value) {
    ctpJNI.CThostFtdcTransferQryBankRspField_RetCode_set(swigCPtr, this, value);
  }

  public String getRetCode() {
    return ctpJNI.CThostFtdcTransferQryBankRspField_RetCode_get(swigCPtr, this);
  }

  public void setRetInfo(String value) {
    ctpJNI.CThostFtdcTransferQryBankRspField_RetInfo_set(swigCPtr, this, value);
  }

  public String getRetInfo() {
    return ctpJNI.CThostFtdcTransferQryBankRspField_RetInfo_get(swigCPtr, this);
  }

  public void setFutureAccount(String value) {
    ctpJNI.CThostFtdcTransferQryBankRspField_FutureAccount_set(swigCPtr, this, value);
  }

  public String getFutureAccount() {
    return ctpJNI.CThostFtdcTransferQryBankRspField_FutureAccount_get(swigCPtr, this);
  }

  public void setTradeAmt(double value) {
    ctpJNI.CThostFtdcTransferQryBankRspField_TradeAmt_set(swigCPtr, this, value);
  }

  public double getTradeAmt() {
    return ctpJNI.CThostFtdcTransferQryBankRspField_TradeAmt_get(swigCPtr, this);
  }

  public void setUseAmt(double value) {
    ctpJNI.CThostFtdcTransferQryBankRspField_UseAmt_set(swigCPtr, this, value);
  }

  public double getUseAmt() {
    return ctpJNI.CThostFtdcTransferQryBankRspField_UseAmt_get(swigCPtr, this);
  }

  public void setFetchAmt(double value) {
    ctpJNI.CThostFtdcTransferQryBankRspField_FetchAmt_set(swigCPtr, this, value);
  }

  public double getFetchAmt() {
    return ctpJNI.CThostFtdcTransferQryBankRspField_FetchAmt_get(swigCPtr, this);
  }

  public void setCurrencyCode(String value) {
    ctpJNI.CThostFtdcTransferQryBankRspField_CurrencyCode_set(swigCPtr, this, value);
  }

  public String getCurrencyCode() {
    return ctpJNI.CThostFtdcTransferQryBankRspField_CurrencyCode_get(swigCPtr, this);
  }

  public CThostFtdcTransferQryBankRspField() {
    this(ctpJNI.new_CThostFtdcTransferQryBankRspField(), true);
  }

}
