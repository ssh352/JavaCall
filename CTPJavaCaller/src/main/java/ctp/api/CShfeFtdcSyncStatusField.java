/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcSyncStatusField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcSyncStatusField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcSyncStatusField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcSyncStatusField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    ctpJNI.CShfeFtdcSyncStatusField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ctpJNI.CShfeFtdcSyncStatusField_TradingDay_get(swigCPtr, this);
  }

  public void setDataSyncStatus(char value) {
    ctpJNI.CShfeFtdcSyncStatusField_DataSyncStatus_set(swigCPtr, this, value);
  }

  public char getDataSyncStatus() {
    return ctpJNI.CShfeFtdcSyncStatusField_DataSyncStatus_get(swigCPtr, this);
  }

  public CShfeFtdcSyncStatusField() {
    this(ctpJNI.new_CShfeFtdcSyncStatusField(), true);
  }

}
