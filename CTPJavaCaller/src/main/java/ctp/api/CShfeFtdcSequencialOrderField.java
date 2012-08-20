/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcSequencialOrderField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcSequencialOrderField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcSequencialOrderField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcSequencialOrderField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setUniqSequenceNo(int value) {
    ctpJNI.CShfeFtdcSequencialOrderField_UniqSequenceNo_set(swigCPtr, this, value);
  }

  public int getUniqSequenceNo() {
    return ctpJNI.CShfeFtdcSequencialOrderField_UniqSequenceNo_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcSequencialOrderField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcSequencialOrderField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CShfeFtdcSequencialOrderField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CShfeFtdcSequencialOrderField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ctpJNI.CShfeFtdcSequencialOrderField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpJNI.CShfeFtdcSequencialOrderField_InstrumentID_get(swigCPtr, this);
  }

  public void setOrderRef(String value) {
    ctpJNI.CShfeFtdcSequencialOrderField_OrderRef_set(swigCPtr, this, value);
  }

  public String getOrderRef() {
    return ctpJNI.CShfeFtdcSequencialOrderField_OrderRef_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpJNI.CShfeFtdcSequencialOrderField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpJNI.CShfeFtdcSequencialOrderField_UserID_get(swigCPtr, this);
  }

  public void setOrderPriceType(char value) {
    ctpJNI.CShfeFtdcSequencialOrderField_OrderPriceType_set(swigCPtr, this, value);
  }

  public char getOrderPriceType() {
    return ctpJNI.CShfeFtdcSequencialOrderField_OrderPriceType_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    ctpJNI.CShfeFtdcSequencialOrderField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return ctpJNI.CShfeFtdcSequencialOrderField_Direction_get(swigCPtr, this);
  }

  public void setCombOffsetFlag(String value) {
    ctpJNI.CShfeFtdcSequencialOrderField_CombOffsetFlag_set(swigCPtr, this, value);
  }

  public String getCombOffsetFlag() {
    return ctpJNI.CShfeFtdcSequencialOrderField_CombOffsetFlag_get(swigCPtr, this);
  }

  public void setCombHedgeFlag(String value) {
    ctpJNI.CShfeFtdcSequencialOrderField_CombHedgeFlag_set(swigCPtr, this, value);
  }

  public String getCombHedgeFlag() {
    return ctpJNI.CShfeFtdcSequencialOrderField_CombHedgeFlag_get(swigCPtr, this);
  }

  public void setLimitPrice(double value) {
    ctpJNI.CShfeFtdcSequencialOrderField_LimitPrice_set(swigCPtr, this, value);
  }

  public double getLimitPrice() {
    return ctpJNI.CShfeFtdcSequencialOrderField_LimitPrice_get(swigCPtr, this);
  }

  public void setVolumeTotalOriginal(int value) {
    ctpJNI.CShfeFtdcSequencialOrderField_VolumeTotalOriginal_set(swigCPtr, this, value);
  }

  public int getVolumeTotalOriginal() {
    return ctpJNI.CShfeFtdcSequencialOrderField_VolumeTotalOriginal_get(swigCPtr, this);
  }

  public void setTimeCondition(char value) {
    ctpJNI.CShfeFtdcSequencialOrderField_TimeCondition_set(swigCPtr, this, value);
  }

  public char getTimeCondition() {
    return ctpJNI.CShfeFtdcSequencialOrderField_TimeCondition_get(swigCPtr, this);
  }

  public void setGTDDate(String value) {
    ctpJNI.CShfeFtdcSequencialOrderField_GTDDate_set(swigCPtr, this, value);
  }

  public String getGTDDate() {
    return ctpJNI.CShfeFtdcSequencialOrderField_GTDDate_get(swigCPtr, this);
  }

  public void setVolumeCondition(char value) {
    ctpJNI.CShfeFtdcSequencialOrderField_VolumeCondition_set(swigCPtr, this, value);
  }

  public char getVolumeCondition() {
    return ctpJNI.CShfeFtdcSequencialOrderField_VolumeCondition_get(swigCPtr, this);
  }

  public void setMinVolume(int value) {
    ctpJNI.CShfeFtdcSequencialOrderField_MinVolume_set(swigCPtr, this, value);
  }

  public int getMinVolume() {
    return ctpJNI.CShfeFtdcSequencialOrderField_MinVolume_get(swigCPtr, this);
  }

  public void setContingentCondition(char value) {
    ctpJNI.CShfeFtdcSequencialOrderField_ContingentCondition_set(swigCPtr, this, value);
  }

  public char getContingentCondition() {
    return ctpJNI.CShfeFtdcSequencialOrderField_ContingentCondition_get(swigCPtr, this);
  }

  public void setStopPrice(double value) {
    ctpJNI.CShfeFtdcSequencialOrderField_StopPrice_set(swigCPtr, this, value);
  }

  public double getStopPrice() {
    return ctpJNI.CShfeFtdcSequencialOrderField_StopPrice_get(swigCPtr, this);
  }

  public void setForceCloseReason(char value) {
    ctpJNI.CShfeFtdcSequencialOrderField_ForceCloseReason_set(swigCPtr, this, value);
  }

  public char getForceCloseReason() {
    return ctpJNI.CShfeFtdcSequencialOrderField_ForceCloseReason_get(swigCPtr, this);
  }

  public void setIsAutoSuspend(int value) {
    ctpJNI.CShfeFtdcSequencialOrderField_IsAutoSuspend_set(swigCPtr, this, value);
  }

  public int getIsAutoSuspend() {
    return ctpJNI.CShfeFtdcSequencialOrderField_IsAutoSuspend_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    ctpJNI.CShfeFtdcSequencialOrderField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return ctpJNI.CShfeFtdcSequencialOrderField_BusinessUnit_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    ctpJNI.CShfeFtdcSequencialOrderField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return ctpJNI.CShfeFtdcSequencialOrderField_RequestID_get(swigCPtr, this);
  }

  public void setOrderLocalID(String value) {
    ctpJNI.CShfeFtdcSequencialOrderField_OrderLocalID_set(swigCPtr, this, value);
  }

  public String getOrderLocalID() {
    return ctpJNI.CShfeFtdcSequencialOrderField_OrderLocalID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpJNI.CShfeFtdcSequencialOrderField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpJNI.CShfeFtdcSequencialOrderField_ExchangeID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    ctpJNI.CShfeFtdcSequencialOrderField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return ctpJNI.CShfeFtdcSequencialOrderField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    ctpJNI.CShfeFtdcSequencialOrderField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return ctpJNI.CShfeFtdcSequencialOrderField_ClientID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    ctpJNI.CShfeFtdcSequencialOrderField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return ctpJNI.CShfeFtdcSequencialOrderField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    ctpJNI.CShfeFtdcSequencialOrderField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return ctpJNI.CShfeFtdcSequencialOrderField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ctpJNI.CShfeFtdcSequencialOrderField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ctpJNI.CShfeFtdcSequencialOrderField_InstallID_get(swigCPtr, this);
  }

  public void setOrderSubmitStatus(char value) {
    ctpJNI.CShfeFtdcSequencialOrderField_OrderSubmitStatus_set(swigCPtr, this, value);
  }

  public char getOrderSubmitStatus() {
    return ctpJNI.CShfeFtdcSequencialOrderField_OrderSubmitStatus_get(swigCPtr, this);
  }

  public void setNotifySequence(int value) {
    ctpJNI.CShfeFtdcSequencialOrderField_NotifySequence_set(swigCPtr, this, value);
  }

  public int getNotifySequence() {
    return ctpJNI.CShfeFtdcSequencialOrderField_NotifySequence_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ctpJNI.CShfeFtdcSequencialOrderField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ctpJNI.CShfeFtdcSequencialOrderField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    ctpJNI.CShfeFtdcSequencialOrderField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return ctpJNI.CShfeFtdcSequencialOrderField_SettlementID_get(swigCPtr, this);
  }

  public void setOrderSysID(String value) {
    ctpJNI.CShfeFtdcSequencialOrderField_OrderSysID_set(swigCPtr, this, value);
  }

  public String getOrderSysID() {
    return ctpJNI.CShfeFtdcSequencialOrderField_OrderSysID_get(swigCPtr, this);
  }

  public void setOrderSource(char value) {
    ctpJNI.CShfeFtdcSequencialOrderField_OrderSource_set(swigCPtr, this, value);
  }

  public char getOrderSource() {
    return ctpJNI.CShfeFtdcSequencialOrderField_OrderSource_get(swigCPtr, this);
  }

  public void setOrderStatus(char value) {
    ctpJNI.CShfeFtdcSequencialOrderField_OrderStatus_set(swigCPtr, this, value);
  }

  public char getOrderStatus() {
    return ctpJNI.CShfeFtdcSequencialOrderField_OrderStatus_get(swigCPtr, this);
  }

  public void setOrderType(char value) {
    ctpJNI.CShfeFtdcSequencialOrderField_OrderType_set(swigCPtr, this, value);
  }

  public char getOrderType() {
    return ctpJNI.CShfeFtdcSequencialOrderField_OrderType_get(swigCPtr, this);
  }

  public void setVolumeTraded(int value) {
    ctpJNI.CShfeFtdcSequencialOrderField_VolumeTraded_set(swigCPtr, this, value);
  }

  public int getVolumeTraded() {
    return ctpJNI.CShfeFtdcSequencialOrderField_VolumeTraded_get(swigCPtr, this);
  }

  public void setVolumeTotal(int value) {
    ctpJNI.CShfeFtdcSequencialOrderField_VolumeTotal_set(swigCPtr, this, value);
  }

  public int getVolumeTotal() {
    return ctpJNI.CShfeFtdcSequencialOrderField_VolumeTotal_get(swigCPtr, this);
  }

  public void setInsertDate(String value) {
    ctpJNI.CShfeFtdcSequencialOrderField_InsertDate_set(swigCPtr, this, value);
  }

  public String getInsertDate() {
    return ctpJNI.CShfeFtdcSequencialOrderField_InsertDate_get(swigCPtr, this);
  }

  public void setInsertTime(String value) {
    ctpJNI.CShfeFtdcSequencialOrderField_InsertTime_set(swigCPtr, this, value);
  }

  public String getInsertTime() {
    return ctpJNI.CShfeFtdcSequencialOrderField_InsertTime_get(swigCPtr, this);
  }

  public void setActiveTime(String value) {
    ctpJNI.CShfeFtdcSequencialOrderField_ActiveTime_set(swigCPtr, this, value);
  }

  public String getActiveTime() {
    return ctpJNI.CShfeFtdcSequencialOrderField_ActiveTime_get(swigCPtr, this);
  }

  public void setSuspendTime(String value) {
    ctpJNI.CShfeFtdcSequencialOrderField_SuspendTime_set(swigCPtr, this, value);
  }

  public String getSuspendTime() {
    return ctpJNI.CShfeFtdcSequencialOrderField_SuspendTime_get(swigCPtr, this);
  }

  public void setUpdateTime(String value) {
    ctpJNI.CShfeFtdcSequencialOrderField_UpdateTime_set(swigCPtr, this, value);
  }

  public String getUpdateTime() {
    return ctpJNI.CShfeFtdcSequencialOrderField_UpdateTime_get(swigCPtr, this);
  }

  public void setCancelTime(String value) {
    ctpJNI.CShfeFtdcSequencialOrderField_CancelTime_set(swigCPtr, this, value);
  }

  public String getCancelTime() {
    return ctpJNI.CShfeFtdcSequencialOrderField_CancelTime_get(swigCPtr, this);
  }

  public void setActiveTraderID(String value) {
    ctpJNI.CShfeFtdcSequencialOrderField_ActiveTraderID_set(swigCPtr, this, value);
  }

  public String getActiveTraderID() {
    return ctpJNI.CShfeFtdcSequencialOrderField_ActiveTraderID_get(swigCPtr, this);
  }

  public void setClearingPartID(String value) {
    ctpJNI.CShfeFtdcSequencialOrderField_ClearingPartID_set(swigCPtr, this, value);
  }

  public String getClearingPartID() {
    return ctpJNI.CShfeFtdcSequencialOrderField_ClearingPartID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    ctpJNI.CShfeFtdcSequencialOrderField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return ctpJNI.CShfeFtdcSequencialOrderField_SequenceNo_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    ctpJNI.CShfeFtdcSequencialOrderField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return ctpJNI.CShfeFtdcSequencialOrderField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ctpJNI.CShfeFtdcSequencialOrderField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ctpJNI.CShfeFtdcSequencialOrderField_SessionID_get(swigCPtr, this);
  }

  public void setUserProductInfo(String value) {
    ctpJNI.CShfeFtdcSequencialOrderField_UserProductInfo_set(swigCPtr, this, value);
  }

  public String getUserProductInfo() {
    return ctpJNI.CShfeFtdcSequencialOrderField_UserProductInfo_get(swigCPtr, this);
  }

  public void setStatusMsg(String value) {
    ctpJNI.CShfeFtdcSequencialOrderField_StatusMsg_set(swigCPtr, this, value);
  }

  public String getStatusMsg() {
    return ctpJNI.CShfeFtdcSequencialOrderField_StatusMsg_get(swigCPtr, this);
  }

  public void setUserForceClose(int value) {
    ctpJNI.CShfeFtdcSequencialOrderField_UserForceClose_set(swigCPtr, this, value);
  }

  public int getUserForceClose() {
    return ctpJNI.CShfeFtdcSequencialOrderField_UserForceClose_get(swigCPtr, this);
  }

  public void setActiveUserID(String value) {
    ctpJNI.CShfeFtdcSequencialOrderField_ActiveUserID_set(swigCPtr, this, value);
  }

  public String getActiveUserID() {
    return ctpJNI.CShfeFtdcSequencialOrderField_ActiveUserID_get(swigCPtr, this);
  }

  public void setBrokerOrderSeq(int value) {
    ctpJNI.CShfeFtdcSequencialOrderField_BrokerOrderSeq_set(swigCPtr, this, value);
  }

  public int getBrokerOrderSeq() {
    return ctpJNI.CShfeFtdcSequencialOrderField_BrokerOrderSeq_get(swigCPtr, this);
  }

  public void setRelativeOrderSysID(String value) {
    ctpJNI.CShfeFtdcSequencialOrderField_RelativeOrderSysID_set(swigCPtr, this, value);
  }

  public String getRelativeOrderSysID() {
    return ctpJNI.CShfeFtdcSequencialOrderField_RelativeOrderSysID_get(swigCPtr, this);
  }

  public void setZCETotalTradedVolume(int value) {
    ctpJNI.CShfeFtdcSequencialOrderField_ZCETotalTradedVolume_set(swigCPtr, this, value);
  }

  public int getZCETotalTradedVolume() {
    return ctpJNI.CShfeFtdcSequencialOrderField_ZCETotalTradedVolume_get(swigCPtr, this);
  }

  public CShfeFtdcSequencialOrderField() {
    this(ctpJNI.new_CShfeFtdcSequencialOrderField(), true);
  }

}
