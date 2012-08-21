/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CThostFtdcTradeField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CThostFtdcTradeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CThostFtdcTradeField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcTradeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcTradeField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcTradeField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CThostFtdcTradeField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CThostFtdcTradeField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ctpJNI.CThostFtdcTradeField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpJNI.CThostFtdcTradeField_InstrumentID_get(swigCPtr, this);
  }

  public void setOrderRef(String value) {
    ctpJNI.CThostFtdcTradeField_OrderRef_set(swigCPtr, this, value);
  }

  public String getOrderRef() {
    return ctpJNI.CThostFtdcTradeField_OrderRef_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpJNI.CThostFtdcTradeField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpJNI.CThostFtdcTradeField_UserID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpJNI.CThostFtdcTradeField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpJNI.CThostFtdcTradeField_ExchangeID_get(swigCPtr, this);
  }

  public void setTradeID(String value) {
    ctpJNI.CThostFtdcTradeField_TradeID_set(swigCPtr, this, value);
  }

  public String getTradeID() {
    return ctpJNI.CThostFtdcTradeField_TradeID_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    ctpJNI.CThostFtdcTradeField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return ctpJNI.CThostFtdcTradeField_Direction_get(swigCPtr, this);
  }

  public void setOrderSysID(String value) {
    ctpJNI.CThostFtdcTradeField_OrderSysID_set(swigCPtr, this, value);
  }

  public String getOrderSysID() {
    return ctpJNI.CThostFtdcTradeField_OrderSysID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    ctpJNI.CThostFtdcTradeField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return ctpJNI.CThostFtdcTradeField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    ctpJNI.CThostFtdcTradeField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return ctpJNI.CThostFtdcTradeField_ClientID_get(swigCPtr, this);
  }

  public void setTradingRole(char value) {
    ctpJNI.CThostFtdcTradeField_TradingRole_set(swigCPtr, this, value);
  }

  public char getTradingRole() {
    return ctpJNI.CThostFtdcTradeField_TradingRole_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    ctpJNI.CThostFtdcTradeField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return ctpJNI.CThostFtdcTradeField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setOffsetFlag(char value) {
    ctpJNI.CThostFtdcTradeField_OffsetFlag_set(swigCPtr, this, value);
  }

  public char getOffsetFlag() {
    return ctpJNI.CThostFtdcTradeField_OffsetFlag_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    ctpJNI.CThostFtdcTradeField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return ctpJNI.CThostFtdcTradeField_HedgeFlag_get(swigCPtr, this);
  }

  public void setPrice(double value) {
    ctpJNI.CThostFtdcTradeField_Price_set(swigCPtr, this, value);
  }

  public double getPrice() {
    return ctpJNI.CThostFtdcTradeField_Price_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    ctpJNI.CThostFtdcTradeField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return ctpJNI.CThostFtdcTradeField_Volume_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    ctpJNI.CThostFtdcTradeField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return ctpJNI.CThostFtdcTradeField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    ctpJNI.CThostFtdcTradeField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return ctpJNI.CThostFtdcTradeField_TradeTime_get(swigCPtr, this);
  }

  public void setTradeType(char value) {
    ctpJNI.CThostFtdcTradeField_TradeType_set(swigCPtr, this, value);
  }

  public char getTradeType() {
    return ctpJNI.CThostFtdcTradeField_TradeType_get(swigCPtr, this);
  }

  public void setPriceSource(char value) {
    ctpJNI.CThostFtdcTradeField_PriceSource_set(swigCPtr, this, value);
  }

  public char getPriceSource() {
    return ctpJNI.CThostFtdcTradeField_PriceSource_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    ctpJNI.CThostFtdcTradeField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return ctpJNI.CThostFtdcTradeField_TraderID_get(swigCPtr, this);
  }

  public void setOrderLocalID(String value) {
    ctpJNI.CThostFtdcTradeField_OrderLocalID_set(swigCPtr, this, value);
  }

  public String getOrderLocalID() {
    return ctpJNI.CThostFtdcTradeField_OrderLocalID_get(swigCPtr, this);
  }

  public void setClearingPartID(String value) {
    ctpJNI.CThostFtdcTradeField_ClearingPartID_set(swigCPtr, this, value);
  }

  public String getClearingPartID() {
    return ctpJNI.CThostFtdcTradeField_ClearingPartID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    ctpJNI.CThostFtdcTradeField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return ctpJNI.CThostFtdcTradeField_BusinessUnit_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    ctpJNI.CThostFtdcTradeField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return ctpJNI.CThostFtdcTradeField_SequenceNo_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ctpJNI.CThostFtdcTradeField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ctpJNI.CThostFtdcTradeField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    ctpJNI.CThostFtdcTradeField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return ctpJNI.CThostFtdcTradeField_SettlementID_get(swigCPtr, this);
  }

  public void setBrokerOrderSeq(int value) {
    ctpJNI.CThostFtdcTradeField_BrokerOrderSeq_set(swigCPtr, this, value);
  }

  public int getBrokerOrderSeq() {
    return ctpJNI.CThostFtdcTradeField_BrokerOrderSeq_get(swigCPtr, this);
  }

  public void setTradeSource(char value) {
    ctpJNI.CThostFtdcTradeField_TradeSource_set(swigCPtr, this, value);
  }

  public char getTradeSource() {
    return ctpJNI.CThostFtdcTradeField_TradeSource_get(swigCPtr, this);
  }

  public CThostFtdcTradeField() {
    this(ctpJNI.new_CThostFtdcTradeField(), true);
  }

}
