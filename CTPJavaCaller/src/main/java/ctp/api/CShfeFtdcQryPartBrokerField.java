/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcQryPartBrokerField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcQryPartBrokerField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcQryPartBrokerField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcQryPartBrokerField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    ctpJNI.CShfeFtdcQryPartBrokerField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpJNI.CShfeFtdcQryPartBrokerField_ExchangeID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcQryPartBrokerField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcQryPartBrokerField_BrokerID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    ctpJNI.CShfeFtdcQryPartBrokerField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return ctpJNI.CShfeFtdcQryPartBrokerField_ParticipantID_get(swigCPtr, this);
  }

  public CShfeFtdcQryPartBrokerField() {
    this(ctpJNI.new_CShfeFtdcQryPartBrokerField(), true);
  }

}