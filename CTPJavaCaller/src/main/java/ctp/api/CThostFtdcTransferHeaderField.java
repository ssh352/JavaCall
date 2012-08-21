/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CThostFtdcTransferHeaderField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CThostFtdcTransferHeaderField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CThostFtdcTransferHeaderField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcTransferHeaderField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setVersion(String value) {
    ctpJNI.CThostFtdcTransferHeaderField_Version_set(swigCPtr, this, value);
  }

  public String getVersion() {
    return ctpJNI.CThostFtdcTransferHeaderField_Version_get(swigCPtr, this);
  }

  public void setTradeCode(String value) {
    ctpJNI.CThostFtdcTransferHeaderField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return ctpJNI.CThostFtdcTransferHeaderField_TradeCode_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    ctpJNI.CThostFtdcTransferHeaderField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return ctpJNI.CThostFtdcTransferHeaderField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    ctpJNI.CThostFtdcTransferHeaderField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return ctpJNI.CThostFtdcTransferHeaderField_TradeTime_get(swigCPtr, this);
  }

  public void setTradeSerial(String value) {
    ctpJNI.CThostFtdcTransferHeaderField_TradeSerial_set(swigCPtr, this, value);
  }

  public String getTradeSerial() {
    return ctpJNI.CThostFtdcTransferHeaderField_TradeSerial_get(swigCPtr, this);
  }

  public void setFutureID(String value) {
    ctpJNI.CThostFtdcTransferHeaderField_FutureID_set(swigCPtr, this, value);
  }

  public String getFutureID() {
    return ctpJNI.CThostFtdcTransferHeaderField_FutureID_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    ctpJNI.CThostFtdcTransferHeaderField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return ctpJNI.CThostFtdcTransferHeaderField_BankID_get(swigCPtr, this);
  }

  public void setBankBrchID(String value) {
    ctpJNI.CThostFtdcTransferHeaderField_BankBrchID_set(swigCPtr, this, value);
  }

  public String getBankBrchID() {
    return ctpJNI.CThostFtdcTransferHeaderField_BankBrchID_get(swigCPtr, this);
  }

  public void setOperNo(String value) {
    ctpJNI.CThostFtdcTransferHeaderField_OperNo_set(swigCPtr, this, value);
  }

  public String getOperNo() {
    return ctpJNI.CThostFtdcTransferHeaderField_OperNo_get(swigCPtr, this);
  }

  public void setDeviceID(String value) {
    ctpJNI.CThostFtdcTransferHeaderField_DeviceID_set(swigCPtr, this, value);
  }

  public String getDeviceID() {
    return ctpJNI.CThostFtdcTransferHeaderField_DeviceID_get(swigCPtr, this);
  }

  public void setRecordNum(String value) {
    ctpJNI.CThostFtdcTransferHeaderField_RecordNum_set(swigCPtr, this, value);
  }

  public String getRecordNum() {
    return ctpJNI.CThostFtdcTransferHeaderField_RecordNum_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ctpJNI.CThostFtdcTransferHeaderField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ctpJNI.CThostFtdcTransferHeaderField_SessionID_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    ctpJNI.CThostFtdcTransferHeaderField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return ctpJNI.CThostFtdcTransferHeaderField_RequestID_get(swigCPtr, this);
  }

  public CThostFtdcTransferHeaderField() {
    this(ctpJNI.new_CThostFtdcTransferHeaderField(), true);
  }

}
