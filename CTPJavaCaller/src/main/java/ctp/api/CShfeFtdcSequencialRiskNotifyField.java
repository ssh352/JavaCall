/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcSequencialRiskNotifyField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcSequencialRiskNotifyField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcSequencialRiskNotifyField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcSequencialRiskNotifyField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setUniqSequenceNo(int value) {
    ctpJNI.CShfeFtdcSequencialRiskNotifyField_UniqSequenceNo_set(swigCPtr, this, value);
  }

  public int getUniqSequenceNo() {
    return ctpJNI.CShfeFtdcSequencialRiskNotifyField_UniqSequenceNo_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcSequencialRiskNotifyField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcSequencialRiskNotifyField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpJNI.CShfeFtdcSequencialRiskNotifyField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpJNI.CShfeFtdcSequencialRiskNotifyField_UserID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    ctpJNI.CShfeFtdcSequencialRiskNotifyField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return ctpJNI.CShfeFtdcSequencialRiskNotifyField_SequenceNo_get(swigCPtr, this);
  }

  public void setEventDate(String value) {
    ctpJNI.CShfeFtdcSequencialRiskNotifyField_EventDate_set(swigCPtr, this, value);
  }

  public String getEventDate() {
    return ctpJNI.CShfeFtdcSequencialRiskNotifyField_EventDate_get(swigCPtr, this);
  }

  public void setEventTime(String value) {
    ctpJNI.CShfeFtdcSequencialRiskNotifyField_EventTime_set(swigCPtr, this, value);
  }

  public String getEventTime() {
    return ctpJNI.CShfeFtdcSequencialRiskNotifyField_EventTime_get(swigCPtr, this);
  }

  public void setNotifyClass(char value) {
    ctpJNI.CShfeFtdcSequencialRiskNotifyField_NotifyClass_set(swigCPtr, this, value);
  }

  public char getNotifyClass() {
    return ctpJNI.CShfeFtdcSequencialRiskNotifyField_NotifyClass_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CShfeFtdcSequencialRiskNotifyField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CShfeFtdcSequencialRiskNotifyField_InvestorID_get(swigCPtr, this);
  }

  public void setIsAutoSystem(int value) {
    ctpJNI.CShfeFtdcSequencialRiskNotifyField_IsAutoSystem_set(swigCPtr, this, value);
  }

  public int getIsAutoSystem() {
    return ctpJNI.CShfeFtdcSequencialRiskNotifyField_IsAutoSystem_get(swigCPtr, this);
  }

  public void setIsAutoSMS(int value) {
    ctpJNI.CShfeFtdcSequencialRiskNotifyField_IsAutoSMS_set(swigCPtr, this, value);
  }

  public int getIsAutoSMS() {
    return ctpJNI.CShfeFtdcSequencialRiskNotifyField_IsAutoSMS_get(swigCPtr, this);
  }

  public void setIsAutoEmail(int value) {
    ctpJNI.CShfeFtdcSequencialRiskNotifyField_IsAutoEmail_set(swigCPtr, this, value);
  }

  public int getIsAutoEmail() {
    return ctpJNI.CShfeFtdcSequencialRiskNotifyField_IsAutoEmail_get(swigCPtr, this);
  }

  public void setSystemMsg(String value) {
    ctpJNI.CShfeFtdcSequencialRiskNotifyField_SystemMsg_set(swigCPtr, this, value);
  }

  public String getSystemMsg() {
    return ctpJNI.CShfeFtdcSequencialRiskNotifyField_SystemMsg_get(swigCPtr, this);
  }

  public void setSMSMsg(String value) {
    ctpJNI.CShfeFtdcSequencialRiskNotifyField_SMSMsg_set(swigCPtr, this, value);
  }

  public String getSMSMsg() {
    return ctpJNI.CShfeFtdcSequencialRiskNotifyField_SMSMsg_get(swigCPtr, this);
  }

  public void setEmailMsg(String value) {
    ctpJNI.CShfeFtdcSequencialRiskNotifyField_EmailMsg_set(swigCPtr, this, value);
  }

  public String getEmailMsg() {
    return ctpJNI.CShfeFtdcSequencialRiskNotifyField_EmailMsg_get(swigCPtr, this);
  }

  public CShfeFtdcSequencialRiskNotifyField() {
    this(ctpJNI.new_CShfeFtdcSequencialRiskNotifyField(), true);
  }

}
