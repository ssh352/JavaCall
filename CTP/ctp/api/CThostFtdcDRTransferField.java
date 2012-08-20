/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CThostFtdcDRTransferField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CThostFtdcDRTransferField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CThostFtdcDRTransferField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcDRTransferField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setOrigDRIdentityID(int value) {
    ctpJNI.CThostFtdcDRTransferField_OrigDRIdentityID_set(swigCPtr, this, value);
  }

  public int getOrigDRIdentityID() {
    return ctpJNI.CThostFtdcDRTransferField_OrigDRIdentityID_get(swigCPtr, this);
  }

  public void setDestDRIdentityID(int value) {
    ctpJNI.CThostFtdcDRTransferField_DestDRIdentityID_set(swigCPtr, this, value);
  }

  public int getDestDRIdentityID() {
    return ctpJNI.CThostFtdcDRTransferField_DestDRIdentityID_get(swigCPtr, this);
  }

  public void setOrigBrokerID(String value) {
    ctpJNI.CThostFtdcDRTransferField_OrigBrokerID_set(swigCPtr, this, value);
  }

  public String getOrigBrokerID() {
    return ctpJNI.CThostFtdcDRTransferField_OrigBrokerID_get(swigCPtr, this);
  }

  public void setDestBrokerID(String value) {
    ctpJNI.CThostFtdcDRTransferField_DestBrokerID_set(swigCPtr, this, value);
  }

  public String getDestBrokerID() {
    return ctpJNI.CThostFtdcDRTransferField_DestBrokerID_get(swigCPtr, this);
  }

  public CThostFtdcDRTransferField() {
    this(ctpJNI.new_CThostFtdcDRTransferField(), true);
  }

}
