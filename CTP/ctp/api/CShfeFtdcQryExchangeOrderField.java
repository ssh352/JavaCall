/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcQryExchangeOrderField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcQryExchangeOrderField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcQryExchangeOrderField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcQryExchangeOrderField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setParticipantID(String value) {
    ctpJNI.CShfeFtdcQryExchangeOrderField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return ctpJNI.CShfeFtdcQryExchangeOrderField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    ctpJNI.CShfeFtdcQryExchangeOrderField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return ctpJNI.CShfeFtdcQryExchangeOrderField_ClientID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    ctpJNI.CShfeFtdcQryExchangeOrderField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return ctpJNI.CShfeFtdcQryExchangeOrderField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpJNI.CShfeFtdcQryExchangeOrderField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpJNI.CShfeFtdcQryExchangeOrderField_ExchangeID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    ctpJNI.CShfeFtdcQryExchangeOrderField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return ctpJNI.CShfeFtdcQryExchangeOrderField_TraderID_get(swigCPtr, this);
  }

  public CShfeFtdcQryExchangeOrderField() {
    this(ctpJNI.new_CShfeFtdcQryExchangeOrderField(), true);
  }

}
