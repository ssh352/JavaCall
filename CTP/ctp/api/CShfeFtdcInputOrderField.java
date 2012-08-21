/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcInputOrderField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcInputOrderField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcInputOrderField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcInputOrderField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcInputOrderField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcInputOrderField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CShfeFtdcInputOrderField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CShfeFtdcInputOrderField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ctpJNI.CShfeFtdcInputOrderField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpJNI.CShfeFtdcInputOrderField_InstrumentID_get(swigCPtr, this);
  }

  public void setOrderRef(String value) {
    ctpJNI.CShfeFtdcInputOrderField_OrderRef_set(swigCPtr, this, value);
  }

  public String getOrderRef() {
    return ctpJNI.CShfeFtdcInputOrderField_OrderRef_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpJNI.CShfeFtdcInputOrderField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpJNI.CShfeFtdcInputOrderField_UserID_get(swigCPtr, this);
  }

  public void setOrderPriceType(char value) {
    ctpJNI.CShfeFtdcInputOrderField_OrderPriceType_set(swigCPtr, this, value);
  }

  public char getOrderPriceType() {
    return ctpJNI.CShfeFtdcInputOrderField_OrderPriceType_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    ctpJNI.CShfeFtdcInputOrderField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return ctpJNI.CShfeFtdcInputOrderField_Direction_get(swigCPtr, this);
  }

  public void setCombOffsetFlag(String value) {
    ctpJNI.CShfeFtdcInputOrderField_CombOffsetFlag_set(swigCPtr, this, value);
  }

  public String getCombOffsetFlag() {
    return ctpJNI.CShfeFtdcInputOrderField_CombOffsetFlag_get(swigCPtr, this);
  }

  public void setCombHedgeFlag(String value) {
    ctpJNI.CShfeFtdcInputOrderField_CombHedgeFlag_set(swigCPtr, this, value);
  }

  public String getCombHedgeFlag() {
    return ctpJNI.CShfeFtdcInputOrderField_CombHedgeFlag_get(swigCPtr, this);
  }

  public void setLimitPrice(double value) {
    ctpJNI.CShfeFtdcInputOrderField_LimitPrice_set(swigCPtr, this, value);
  }

  public double getLimitPrice() {
    return ctpJNI.CShfeFtdcInputOrderField_LimitPrice_get(swigCPtr, this);
  }

  public void setVolumeTotalOriginal(int value) {
    ctpJNI.CShfeFtdcInputOrderField_VolumeTotalOriginal_set(swigCPtr, this, value);
  }

  public int getVolumeTotalOriginal() {
    return ctpJNI.CShfeFtdcInputOrderField_VolumeTotalOriginal_get(swigCPtr, this);
  }

  public void setTimeCondition(char value) {
    ctpJNI.CShfeFtdcInputOrderField_TimeCondition_set(swigCPtr, this, value);
  }

  public char getTimeCondition() {
    return ctpJNI.CShfeFtdcInputOrderField_TimeCondition_get(swigCPtr, this);
  }

  public void setGTDDate(String value) {
    ctpJNI.CShfeFtdcInputOrderField_GTDDate_set(swigCPtr, this, value);
  }

  public String getGTDDate() {
    return ctpJNI.CShfeFtdcInputOrderField_GTDDate_get(swigCPtr, this);
  }

  public void setVolumeCondition(char value) {
    ctpJNI.CShfeFtdcInputOrderField_VolumeCondition_set(swigCPtr, this, value);
  }

  public char getVolumeCondition() {
    return ctpJNI.CShfeFtdcInputOrderField_VolumeCondition_get(swigCPtr, this);
  }

  public void setMinVolume(int value) {
    ctpJNI.CShfeFtdcInputOrderField_MinVolume_set(swigCPtr, this, value);
  }

  public int getMinVolume() {
    return ctpJNI.CShfeFtdcInputOrderField_MinVolume_get(swigCPtr, this);
  }

  public void setContingentCondition(char value) {
    ctpJNI.CShfeFtdcInputOrderField_ContingentCondition_set(swigCPtr, this, value);
  }

  public char getContingentCondition() {
    return ctpJNI.CShfeFtdcInputOrderField_ContingentCondition_get(swigCPtr, this);
  }

  public void setStopPrice(double value) {
    ctpJNI.CShfeFtdcInputOrderField_StopPrice_set(swigCPtr, this, value);
  }

  public double getStopPrice() {
    return ctpJNI.CShfeFtdcInputOrderField_StopPrice_get(swigCPtr, this);
  }

  public void setForceCloseReason(char value) {
    ctpJNI.CShfeFtdcInputOrderField_ForceCloseReason_set(swigCPtr, this, value);
  }

  public char getForceCloseReason() {
    return ctpJNI.CShfeFtdcInputOrderField_ForceCloseReason_get(swigCPtr, this);
  }

  public void setIsAutoSuspend(int value) {
    ctpJNI.CShfeFtdcInputOrderField_IsAutoSuspend_set(swigCPtr, this, value);
  }

  public int getIsAutoSuspend() {
    return ctpJNI.CShfeFtdcInputOrderField_IsAutoSuspend_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    ctpJNI.CShfeFtdcInputOrderField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return ctpJNI.CShfeFtdcInputOrderField_BusinessUnit_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    ctpJNI.CShfeFtdcInputOrderField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return ctpJNI.CShfeFtdcInputOrderField_RequestID_get(swigCPtr, this);
  }

  public void setUserForceClose(int value) {
    ctpJNI.CShfeFtdcInputOrderField_UserForceClose_set(swigCPtr, this, value);
  }

  public int getUserForceClose() {
    return ctpJNI.CShfeFtdcInputOrderField_UserForceClose_get(swigCPtr, this);
  }

  public CShfeFtdcInputOrderField() {
    this(ctpJNI.new_CShfeFtdcInputOrderField(), true);
  }

}
