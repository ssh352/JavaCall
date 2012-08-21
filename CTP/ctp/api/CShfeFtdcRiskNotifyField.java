/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcRiskNotifyField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcRiskNotifyField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcRiskNotifyField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcRiskNotifyField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcRiskNotifyField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcRiskNotifyField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpJNI.CShfeFtdcRiskNotifyField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpJNI.CShfeFtdcRiskNotifyField_UserID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    ctpJNI.CShfeFtdcRiskNotifyField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return ctpJNI.CShfeFtdcRiskNotifyField_SequenceNo_get(swigCPtr, this);
  }

  public void setEventDate(String value) {
    ctpJNI.CShfeFtdcRiskNotifyField_EventDate_set(swigCPtr, this, value);
  }

  public String getEventDate() {
    return ctpJNI.CShfeFtdcRiskNotifyField_EventDate_get(swigCPtr, this);
  }

  public void setEventTime(String value) {
    ctpJNI.CShfeFtdcRiskNotifyField_EventTime_set(swigCPtr, this, value);
  }

  public String getEventTime() {
    return ctpJNI.CShfeFtdcRiskNotifyField_EventTime_get(swigCPtr, this);
  }

  public void setNotifyClass(char value) {
    ctpJNI.CShfeFtdcRiskNotifyField_NotifyClass_set(swigCPtr, this, value);
  }

  public char getNotifyClass() {
    return ctpJNI.CShfeFtdcRiskNotifyField_NotifyClass_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CShfeFtdcRiskNotifyField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CShfeFtdcRiskNotifyField_InvestorID_get(swigCPtr, this);
  }

  public void setIsAutoSystem(int value) {
    ctpJNI.CShfeFtdcRiskNotifyField_IsAutoSystem_set(swigCPtr, this, value);
  }

  public int getIsAutoSystem() {
    return ctpJNI.CShfeFtdcRiskNotifyField_IsAutoSystem_get(swigCPtr, this);
  }

  public void setIsAutoSMS(int value) {
    ctpJNI.CShfeFtdcRiskNotifyField_IsAutoSMS_set(swigCPtr, this, value);
  }

  public int getIsAutoSMS() {
    return ctpJNI.CShfeFtdcRiskNotifyField_IsAutoSMS_get(swigCPtr, this);
  }

  public void setIsAutoEmail(int value) {
    ctpJNI.CShfeFtdcRiskNotifyField_IsAutoEmail_set(swigCPtr, this, value);
  }

  public int getIsAutoEmail() {
    return ctpJNI.CShfeFtdcRiskNotifyField_IsAutoEmail_get(swigCPtr, this);
  }

  public void setSystemMsg(String value) {
    ctpJNI.CShfeFtdcRiskNotifyField_SystemMsg_set(swigCPtr, this, value);
  }

  public String getSystemMsg() {
    return ctpJNI.CShfeFtdcRiskNotifyField_SystemMsg_get(swigCPtr, this);
  }

  public void setSMSMsg(String value) {
    ctpJNI.CShfeFtdcRiskNotifyField_SMSMsg_set(swigCPtr, this, value);
  }

  public String getSMSMsg() {
    return ctpJNI.CShfeFtdcRiskNotifyField_SMSMsg_get(swigCPtr, this);
  }

  public void setEmailMsg(String value) {
    ctpJNI.CShfeFtdcRiskNotifyField_EmailMsg_set(swigCPtr, this, value);
  }

  public String getEmailMsg() {
    return ctpJNI.CShfeFtdcRiskNotifyField_EmailMsg_get(swigCPtr, this);
  }

  public CShfeFtdcRiskNotifyField() {
    this(ctpJNI.new_CShfeFtdcRiskNotifyField(), true);
  }

}
