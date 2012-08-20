/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcTransferQryDetailRspField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcTransferQryDetailRspField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcTransferQryDetailRspField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcTransferQryDetailRspField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeDate(String value) {
    ctpJNI.CShfeFtdcTransferQryDetailRspField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return ctpJNI.CShfeFtdcTransferQryDetailRspField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    ctpJNI.CShfeFtdcTransferQryDetailRspField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return ctpJNI.CShfeFtdcTransferQryDetailRspField_TradeTime_get(swigCPtr, this);
  }

  public void setTradeCode(String value) {
    ctpJNI.CShfeFtdcTransferQryDetailRspField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return ctpJNI.CShfeFtdcTransferQryDetailRspField_TradeCode_get(swigCPtr, this);
  }

  public void setFutureSerial(int value) {
    ctpJNI.CShfeFtdcTransferQryDetailRspField_FutureSerial_set(swigCPtr, this, value);
  }

  public int getFutureSerial() {
    return ctpJNI.CShfeFtdcTransferQryDetailRspField_FutureSerial_get(swigCPtr, this);
  }

  public void setFutureID(String value) {
    ctpJNI.CShfeFtdcTransferQryDetailRspField_FutureID_set(swigCPtr, this, value);
  }

  public String getFutureID() {
    return ctpJNI.CShfeFtdcTransferQryDetailRspField_FutureID_get(swigCPtr, this);
  }

  public void setFutureAccount(String value) {
    ctpJNI.CShfeFtdcTransferQryDetailRspField_FutureAccount_set(swigCPtr, this, value);
  }

  public String getFutureAccount() {
    return ctpJNI.CShfeFtdcTransferQryDetailRspField_FutureAccount_get(swigCPtr, this);
  }

  public void setBankSerial(int value) {
    ctpJNI.CShfeFtdcTransferQryDetailRspField_BankSerial_set(swigCPtr, this, value);
  }

  public int getBankSerial() {
    return ctpJNI.CShfeFtdcTransferQryDetailRspField_BankSerial_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    ctpJNI.CShfeFtdcTransferQryDetailRspField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return ctpJNI.CShfeFtdcTransferQryDetailRspField_BankID_get(swigCPtr, this);
  }

  public void setBankBrchID(String value) {
    ctpJNI.CShfeFtdcTransferQryDetailRspField_BankBrchID_set(swigCPtr, this, value);
  }

  public String getBankBrchID() {
    return ctpJNI.CShfeFtdcTransferQryDetailRspField_BankBrchID_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    ctpJNI.CShfeFtdcTransferQryDetailRspField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return ctpJNI.CShfeFtdcTransferQryDetailRspField_BankAccount_get(swigCPtr, this);
  }

  public void setCertCode(String value) {
    ctpJNI.CShfeFtdcTransferQryDetailRspField_CertCode_set(swigCPtr, this, value);
  }

  public String getCertCode() {
    return ctpJNI.CShfeFtdcTransferQryDetailRspField_CertCode_get(swigCPtr, this);
  }

  public void setCurrencyCode(String value) {
    ctpJNI.CShfeFtdcTransferQryDetailRspField_CurrencyCode_set(swigCPtr, this, value);
  }

  public String getCurrencyCode() {
    return ctpJNI.CShfeFtdcTransferQryDetailRspField_CurrencyCode_get(swigCPtr, this);
  }

  public void setTxAmount(double value) {
    ctpJNI.CShfeFtdcTransferQryDetailRspField_TxAmount_set(swigCPtr, this, value);
  }

  public double getTxAmount() {
    return ctpJNI.CShfeFtdcTransferQryDetailRspField_TxAmount_get(swigCPtr, this);
  }

  public void setFlag(char value) {
    ctpJNI.CShfeFtdcTransferQryDetailRspField_Flag_set(swigCPtr, this, value);
  }

  public char getFlag() {
    return ctpJNI.CShfeFtdcTransferQryDetailRspField_Flag_get(swigCPtr, this);
  }

  public CShfeFtdcTransferQryDetailRspField() {
    this(ctpJNI.new_CShfeFtdcTransferQryDetailRspField(), true);
  }

}
