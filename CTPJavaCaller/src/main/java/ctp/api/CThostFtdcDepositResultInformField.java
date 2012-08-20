/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CThostFtdcDepositResultInformField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CThostFtdcDepositResultInformField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CThostFtdcDepositResultInformField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcDepositResultInformField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setDepositSeqNo(String value) {
    ctpJNI.CThostFtdcDepositResultInformField_DepositSeqNo_set(swigCPtr, this, value);
  }

  public String getDepositSeqNo() {
    return ctpJNI.CThostFtdcDepositResultInformField_DepositSeqNo_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcDepositResultInformField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcDepositResultInformField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CThostFtdcDepositResultInformField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CThostFtdcDepositResultInformField_InvestorID_get(swigCPtr, this);
  }

  public void setDeposit(double value) {
    ctpJNI.CThostFtdcDepositResultInformField_Deposit_set(swigCPtr, this, value);
  }

  public double getDeposit() {
    return ctpJNI.CThostFtdcDepositResultInformField_Deposit_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    ctpJNI.CThostFtdcDepositResultInformField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return ctpJNI.CThostFtdcDepositResultInformField_RequestID_get(swigCPtr, this);
  }

  public void setReturnCode(String value) {
    ctpJNI.CThostFtdcDepositResultInformField_ReturnCode_set(swigCPtr, this, value);
  }

  public String getReturnCode() {
    return ctpJNI.CThostFtdcDepositResultInformField_ReturnCode_get(swigCPtr, this);
  }

  public void setDescrInfoForReturnCode(String value) {
    ctpJNI.CThostFtdcDepositResultInformField_DescrInfoForReturnCode_set(swigCPtr, this, value);
  }

  public String getDescrInfoForReturnCode() {
    return ctpJNI.CThostFtdcDepositResultInformField_DescrInfoForReturnCode_get(swigCPtr, this);
  }

  public CThostFtdcDepositResultInformField() {
    this(ctpJNI.new_CThostFtdcDepositResultInformField(), true);
  }

}
