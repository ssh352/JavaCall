/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CThostFtdcExchangeOrderInsertErrorField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CThostFtdcExchangeOrderInsertErrorField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CThostFtdcExchangeOrderInsertErrorField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcExchangeOrderInsertErrorField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    ctpJNI.CThostFtdcExchangeOrderInsertErrorField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpJNI.CThostFtdcExchangeOrderInsertErrorField_ExchangeID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    ctpJNI.CThostFtdcExchangeOrderInsertErrorField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return ctpJNI.CThostFtdcExchangeOrderInsertErrorField_ParticipantID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    ctpJNI.CThostFtdcExchangeOrderInsertErrorField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return ctpJNI.CThostFtdcExchangeOrderInsertErrorField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ctpJNI.CThostFtdcExchangeOrderInsertErrorField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ctpJNI.CThostFtdcExchangeOrderInsertErrorField_InstallID_get(swigCPtr, this);
  }

  public void setOrderLocalID(String value) {
    ctpJNI.CThostFtdcExchangeOrderInsertErrorField_OrderLocalID_set(swigCPtr, this, value);
  }

  public String getOrderLocalID() {
    return ctpJNI.CThostFtdcExchangeOrderInsertErrorField_OrderLocalID_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    ctpJNI.CThostFtdcExchangeOrderInsertErrorField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return ctpJNI.CThostFtdcExchangeOrderInsertErrorField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    ctpJNI.CThostFtdcExchangeOrderInsertErrorField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return ctpJNI.CThostFtdcExchangeOrderInsertErrorField_ErrorMsg_get(swigCPtr, this);
  }

  public CThostFtdcExchangeOrderInsertErrorField() {
    this(ctpJNI.new_CThostFtdcExchangeOrderInsertErrorField(), true);
  }

}
