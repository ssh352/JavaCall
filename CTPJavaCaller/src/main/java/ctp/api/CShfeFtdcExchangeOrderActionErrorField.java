/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcExchangeOrderActionErrorField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcExchangeOrderActionErrorField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcExchangeOrderActionErrorField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcExchangeOrderActionErrorField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    ctpJNI.CShfeFtdcExchangeOrderActionErrorField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpJNI.CShfeFtdcExchangeOrderActionErrorField_ExchangeID_get(swigCPtr, this);
  }

  public void setOrderSysID(String value) {
    ctpJNI.CShfeFtdcExchangeOrderActionErrorField_OrderSysID_set(swigCPtr, this, value);
  }

  public String getOrderSysID() {
    return ctpJNI.CShfeFtdcExchangeOrderActionErrorField_OrderSysID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    ctpJNI.CShfeFtdcExchangeOrderActionErrorField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return ctpJNI.CShfeFtdcExchangeOrderActionErrorField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ctpJNI.CShfeFtdcExchangeOrderActionErrorField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ctpJNI.CShfeFtdcExchangeOrderActionErrorField_InstallID_get(swigCPtr, this);
  }

  public void setOrderLocalID(String value) {
    ctpJNI.CShfeFtdcExchangeOrderActionErrorField_OrderLocalID_set(swigCPtr, this, value);
  }

  public String getOrderLocalID() {
    return ctpJNI.CShfeFtdcExchangeOrderActionErrorField_OrderLocalID_get(swigCPtr, this);
  }

  public void setActionLocalID(String value) {
    ctpJNI.CShfeFtdcExchangeOrderActionErrorField_ActionLocalID_set(swigCPtr, this, value);
  }

  public String getActionLocalID() {
    return ctpJNI.CShfeFtdcExchangeOrderActionErrorField_ActionLocalID_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    ctpJNI.CShfeFtdcExchangeOrderActionErrorField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return ctpJNI.CShfeFtdcExchangeOrderActionErrorField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    ctpJNI.CShfeFtdcExchangeOrderActionErrorField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return ctpJNI.CShfeFtdcExchangeOrderActionErrorField_ErrorMsg_get(swigCPtr, this);
  }

  public CShfeFtdcExchangeOrderActionErrorField() {
    this(ctpJNI.new_CShfeFtdcExchangeOrderActionErrorField(), true);
  }

}
