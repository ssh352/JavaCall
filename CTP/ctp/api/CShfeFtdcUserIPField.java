/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcUserIPField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcUserIPField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcUserIPField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcUserIPField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcUserIPField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcUserIPField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpJNI.CShfeFtdcUserIPField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpJNI.CShfeFtdcUserIPField_UserID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    ctpJNI.CShfeFtdcUserIPField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return ctpJNI.CShfeFtdcUserIPField_IPAddress_get(swigCPtr, this);
  }

  public void setIPMask(String value) {
    ctpJNI.CShfeFtdcUserIPField_IPMask_set(swigCPtr, this, value);
  }

  public String getIPMask() {
    return ctpJNI.CShfeFtdcUserIPField_IPMask_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    ctpJNI.CShfeFtdcUserIPField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return ctpJNI.CShfeFtdcUserIPField_MacAddress_get(swigCPtr, this);
  }

  public CShfeFtdcUserIPField() {
    this(ctpJNI.new_CShfeFtdcUserIPField(), true);
  }

}
