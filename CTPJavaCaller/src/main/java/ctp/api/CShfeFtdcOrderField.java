/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcOrderField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcOrderField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcOrderField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcOrderField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcOrderField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcOrderField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CShfeFtdcOrderField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CShfeFtdcOrderField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ctpJNI.CShfeFtdcOrderField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpJNI.CShfeFtdcOrderField_InstrumentID_get(swigCPtr, this);
  }

  public void setOrderRef(String value) {
    ctpJNI.CShfeFtdcOrderField_OrderRef_set(swigCPtr, this, value);
  }

  public String getOrderRef() {
    return ctpJNI.CShfeFtdcOrderField_OrderRef_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpJNI.CShfeFtdcOrderField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpJNI.CShfeFtdcOrderField_UserID_get(swigCPtr, this);
  }

  public void setOrderPriceType(char value) {
    ctpJNI.CShfeFtdcOrderField_OrderPriceType_set(swigCPtr, this, value);
  }

  public char getOrderPriceType() {
    return ctpJNI.CShfeFtdcOrderField_OrderPriceType_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    ctpJNI.CShfeFtdcOrderField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return ctpJNI.CShfeFtdcOrderField_Direction_get(swigCPtr, this);
  }

  public void setCombOffsetFlag(String value) {
    ctpJNI.CShfeFtdcOrderField_CombOffsetFlag_set(swigCPtr, this, value);
  }

  public String getCombOffsetFlag() {
    return ctpJNI.CShfeFtdcOrderField_CombOffsetFlag_get(swigCPtr, this);
  }

  public void setCombHedgeFlag(String value) {
    ctpJNI.CShfeFtdcOrderField_CombHedgeFlag_set(swigCPtr, this, value);
  }

  public String getCombHedgeFlag() {
    return ctpJNI.CShfeFtdcOrderField_CombHedgeFlag_get(swigCPtr, this);
  }

  public void setLimitPrice(double value) {
    ctpJNI.CShfeFtdcOrderField_LimitPrice_set(swigCPtr, this, value);
  }

  public double getLimitPrice() {
    return ctpJNI.CShfeFtdcOrderField_LimitPrice_get(swigCPtr, this);
  }

  public void setVolumeTotalOriginal(int value) {
    ctpJNI.CShfeFtdcOrderField_VolumeTotalOriginal_set(swigCPtr, this, value);
  }

  public int getVolumeTotalOriginal() {
    return ctpJNI.CShfeFtdcOrderField_VolumeTotalOriginal_get(swigCPtr, this);
  }

  public void setTimeCondition(char value) {
    ctpJNI.CShfeFtdcOrderField_TimeCondition_set(swigCPtr, this, value);
  }

  public char getTimeCondition() {
    return ctpJNI.CShfeFtdcOrderField_TimeCondition_get(swigCPtr, this);
  }

  public void setGTDDate(String value) {
    ctpJNI.CShfeFtdcOrderField_GTDDate_set(swigCPtr, this, value);
  }

  public String getGTDDate() {
    return ctpJNI.CShfeFtdcOrderField_GTDDate_get(swigCPtr, this);
  }

  public void setVolumeCondition(char value) {
    ctpJNI.CShfeFtdcOrderField_VolumeCondition_set(swigCPtr, this, value);
  }

  public char getVolumeCondition() {
    return ctpJNI.CShfeFtdcOrderField_VolumeCondition_get(swigCPtr, this);
  }

  public void setMinVolume(int value) {
    ctpJNI.CShfeFtdcOrderField_MinVolume_set(swigCPtr, this, value);
  }

  public int getMinVolume() {
    return ctpJNI.CShfeFtdcOrderField_MinVolume_get(swigCPtr, this);
  }

  public void setContingentCondition(char value) {
    ctpJNI.CShfeFtdcOrderField_ContingentCondition_set(swigCPtr, this, value);
  }

  public char getContingentCondition() {
    return ctpJNI.CShfeFtdcOrderField_ContingentCondition_get(swigCPtr, this);
  }

  public void setStopPrice(double value) {
    ctpJNI.CShfeFtdcOrderField_StopPrice_set(swigCPtr, this, value);
  }

  public double getStopPrice() {
    return ctpJNI.CShfeFtdcOrderField_StopPrice_get(swigCPtr, this);
  }

  public void setForceCloseReason(char value) {
    ctpJNI.CShfeFtdcOrderField_ForceCloseReason_set(swigCPtr, this, value);
  }

  public char getForceCloseReason() {
    return ctpJNI.CShfeFtdcOrderField_ForceCloseReason_get(swigCPtr, this);
  }

  public void setIsAutoSuspend(int value) {
    ctpJNI.CShfeFtdcOrderField_IsAutoSuspend_set(swigCPtr, this, value);
  }

  public int getIsAutoSuspend() {
    return ctpJNI.CShfeFtdcOrderField_IsAutoSuspend_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    ctpJNI.CShfeFtdcOrderField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return ctpJNI.CShfeFtdcOrderField_BusinessUnit_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    ctpJNI.CShfeFtdcOrderField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return ctpJNI.CShfeFtdcOrderField_RequestID_get(swigCPtr, this);
  }

  public void setOrderLocalID(String value) {
    ctpJNI.CShfeFtdcOrderField_OrderLocalID_set(swigCPtr, this, value);
  }

  public String getOrderLocalID() {
    return ctpJNI.CShfeFtdcOrderField_OrderLocalID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpJNI.CShfeFtdcOrderField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpJNI.CShfeFtdcOrderField_ExchangeID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    ctpJNI.CShfeFtdcOrderField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return ctpJNI.CShfeFtdcOrderField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    ctpJNI.CShfeFtdcOrderField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return ctpJNI.CShfeFtdcOrderField_ClientID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    ctpJNI.CShfeFtdcOrderField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return ctpJNI.CShfeFtdcOrderField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    ctpJNI.CShfeFtdcOrderField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return ctpJNI.CShfeFtdcOrderField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ctpJNI.CShfeFtdcOrderField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ctpJNI.CShfeFtdcOrderField_InstallID_get(swigCPtr, this);
  }

  public void setOrderSubmitStatus(char value) {
    ctpJNI.CShfeFtdcOrderField_OrderSubmitStatus_set(swigCPtr, this, value);
  }

  public char getOrderSubmitStatus() {
    return ctpJNI.CShfeFtdcOrderField_OrderSubmitStatus_get(swigCPtr, this);
  }

  public void setNotifySequence(int value) {
    ctpJNI.CShfeFtdcOrderField_NotifySequence_set(swigCPtr, this, value);
  }

  public int getNotifySequence() {
    return ctpJNI.CShfeFtdcOrderField_NotifySequence_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ctpJNI.CShfeFtdcOrderField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ctpJNI.CShfeFtdcOrderField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    ctpJNI.CShfeFtdcOrderField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return ctpJNI.CShfeFtdcOrderField_SettlementID_get(swigCPtr, this);
  }

  public void setOrderSysID(String value) {
    ctpJNI.CShfeFtdcOrderField_OrderSysID_set(swigCPtr, this, value);
  }

  public String getOrderSysID() {
    return ctpJNI.CShfeFtdcOrderField_OrderSysID_get(swigCPtr, this);
  }

  public void setOrderSource(char value) {
    ctpJNI.CShfeFtdcOrderField_OrderSource_set(swigCPtr, this, value);
  }

  public char getOrderSource() {
    return ctpJNI.CShfeFtdcOrderField_OrderSource_get(swigCPtr, this);
  }

  public void setOrderStatus(char value) {
    ctpJNI.CShfeFtdcOrderField_OrderStatus_set(swigCPtr, this, value);
  }

  public char getOrderStatus() {
    return ctpJNI.CShfeFtdcOrderField_OrderStatus_get(swigCPtr, this);
  }

  public void setOrderType(char value) {
    ctpJNI.CShfeFtdcOrderField_OrderType_set(swigCPtr, this, value);
  }

  public char getOrderType() {
    return ctpJNI.CShfeFtdcOrderField_OrderType_get(swigCPtr, this);
  }

  public void setVolumeTraded(int value) {
    ctpJNI.CShfeFtdcOrderField_VolumeTraded_set(swigCPtr, this, value);
  }

  public int getVolumeTraded() {
    return ctpJNI.CShfeFtdcOrderField_VolumeTraded_get(swigCPtr, this);
  }

  public void setVolumeTotal(int value) {
    ctpJNI.CShfeFtdcOrderField_VolumeTotal_set(swigCPtr, this, value);
  }

  public int getVolumeTotal() {
    return ctpJNI.CShfeFtdcOrderField_VolumeTotal_get(swigCPtr, this);
  }

  public void setInsertDate(String value) {
    ctpJNI.CShfeFtdcOrderField_InsertDate_set(swigCPtr, this, value);
  }

  public String getInsertDate() {
    return ctpJNI.CShfeFtdcOrderField_InsertDate_get(swigCPtr, this);
  }

  public void setInsertTime(String value) {
    ctpJNI.CShfeFtdcOrderField_InsertTime_set(swigCPtr, this, value);
  }

  public String getInsertTime() {
    return ctpJNI.CShfeFtdcOrderField_InsertTime_get(swigCPtr, this);
  }

  public void setActiveTime(String value) {
    ctpJNI.CShfeFtdcOrderField_ActiveTime_set(swigCPtr, this, value);
  }

  public String getActiveTime() {
    return ctpJNI.CShfeFtdcOrderField_ActiveTime_get(swigCPtr, this);
  }

  public void setSuspendTime(String value) {
    ctpJNI.CShfeFtdcOrderField_SuspendTime_set(swigCPtr, this, value);
  }

  public String getSuspendTime() {
    return ctpJNI.CShfeFtdcOrderField_SuspendTime_get(swigCPtr, this);
  }

  public void setUpdateTime(String value) {
    ctpJNI.CShfeFtdcOrderField_UpdateTime_set(swigCPtr, this, value);
  }

  public String getUpdateTime() {
    return ctpJNI.CShfeFtdcOrderField_UpdateTime_get(swigCPtr, this);
  }

  public void setCancelTime(String value) {
    ctpJNI.CShfeFtdcOrderField_CancelTime_set(swigCPtr, this, value);
  }

  public String getCancelTime() {
    return ctpJNI.CShfeFtdcOrderField_CancelTime_get(swigCPtr, this);
  }

  public void setActiveTraderID(String value) {
    ctpJNI.CShfeFtdcOrderField_ActiveTraderID_set(swigCPtr, this, value);
  }

  public String getActiveTraderID() {
    return ctpJNI.CShfeFtdcOrderField_ActiveTraderID_get(swigCPtr, this);
  }

  public void setClearingPartID(String value) {
    ctpJNI.CShfeFtdcOrderField_ClearingPartID_set(swigCPtr, this, value);
  }

  public String getClearingPartID() {
    return ctpJNI.CShfeFtdcOrderField_ClearingPartID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    ctpJNI.CShfeFtdcOrderField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return ctpJNI.CShfeFtdcOrderField_SequenceNo_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    ctpJNI.CShfeFtdcOrderField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return ctpJNI.CShfeFtdcOrderField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ctpJNI.CShfeFtdcOrderField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ctpJNI.CShfeFtdcOrderField_SessionID_get(swigCPtr, this);
  }

  public void setUserProductInfo(String value) {
    ctpJNI.CShfeFtdcOrderField_UserProductInfo_set(swigCPtr, this, value);
  }

  public String getUserProductInfo() {
    return ctpJNI.CShfeFtdcOrderField_UserProductInfo_get(swigCPtr, this);
  }

  public void setStatusMsg(String value) {
    ctpJNI.CShfeFtdcOrderField_StatusMsg_set(swigCPtr, this, value);
  }

  public String getStatusMsg() {
    return ctpJNI.CShfeFtdcOrderField_StatusMsg_get(swigCPtr, this);
  }

  public void setUserForceClose(int value) {
    ctpJNI.CShfeFtdcOrderField_UserForceClose_set(swigCPtr, this, value);
  }

  public int getUserForceClose() {
    return ctpJNI.CShfeFtdcOrderField_UserForceClose_get(swigCPtr, this);
  }

  public void setActiveUserID(String value) {
    ctpJNI.CShfeFtdcOrderField_ActiveUserID_set(swigCPtr, this, value);
  }

  public String getActiveUserID() {
    return ctpJNI.CShfeFtdcOrderField_ActiveUserID_get(swigCPtr, this);
  }

  public void setBrokerOrderSeq(int value) {
    ctpJNI.CShfeFtdcOrderField_BrokerOrderSeq_set(swigCPtr, this, value);
  }

  public int getBrokerOrderSeq() {
    return ctpJNI.CShfeFtdcOrderField_BrokerOrderSeq_get(swigCPtr, this);
  }

  public void setRelativeOrderSysID(String value) {
    ctpJNI.CShfeFtdcOrderField_RelativeOrderSysID_set(swigCPtr, this, value);
  }

  public String getRelativeOrderSysID() {
    return ctpJNI.CShfeFtdcOrderField_RelativeOrderSysID_get(swigCPtr, this);
  }

  public void setZCETotalTradedVolume(int value) {
    ctpJNI.CShfeFtdcOrderField_ZCETotalTradedVolume_set(swigCPtr, this, value);
  }

  public int getZCETotalTradedVolume() {
    return ctpJNI.CShfeFtdcOrderField_ZCETotalTradedVolume_get(swigCPtr, this);
  }

  public CShfeFtdcOrderField() {
    this(ctpJNI.new_CShfeFtdcOrderField(), true);
  }

}
