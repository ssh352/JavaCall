/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcSyncingInvestorPositionField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcSyncingInvestorPositionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcSyncingInvestorPositionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcSyncingInvestorPositionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    ctpJNI.CShfeFtdcSyncingInvestorPositionField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpJNI.CShfeFtdcSyncingInvestorPositionField_InstrumentID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcSyncingInvestorPositionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcSyncingInvestorPositionField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CShfeFtdcSyncingInvestorPositionField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CShfeFtdcSyncingInvestorPositionField_InvestorID_get(swigCPtr, this);
  }

  public void setPosiDirection(char value) {
    ctpJNI.CShfeFtdcSyncingInvestorPositionField_PosiDirection_set(swigCPtr, this, value);
  }

  public char getPosiDirection() {
    return ctpJNI.CShfeFtdcSyncingInvestorPositionField_PosiDirection_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    ctpJNI.CShfeFtdcSyncingInvestorPositionField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return ctpJNI.CShfeFtdcSyncingInvestorPositionField_HedgeFlag_get(swigCPtr, this);
  }

  public void setPositionDate(char value) {
    ctpJNI.CShfeFtdcSyncingInvestorPositionField_PositionDate_set(swigCPtr, this, value);
  }

  public char getPositionDate() {
    return ctpJNI.CShfeFtdcSyncingInvestorPositionField_PositionDate_get(swigCPtr, this);
  }

  public void setYdPosition(int value) {
    ctpJNI.CShfeFtdcSyncingInvestorPositionField_YdPosition_set(swigCPtr, this, value);
  }

  public int getYdPosition() {
    return ctpJNI.CShfeFtdcSyncingInvestorPositionField_YdPosition_get(swigCPtr, this);
  }

  public void setPosition(int value) {
    ctpJNI.CShfeFtdcSyncingInvestorPositionField_Position_set(swigCPtr, this, value);
  }

  public int getPosition() {
    return ctpJNI.CShfeFtdcSyncingInvestorPositionField_Position_get(swigCPtr, this);
  }

  public void setLongFrozen(int value) {
    ctpJNI.CShfeFtdcSyncingInvestorPositionField_LongFrozen_set(swigCPtr, this, value);
  }

  public int getLongFrozen() {
    return ctpJNI.CShfeFtdcSyncingInvestorPositionField_LongFrozen_get(swigCPtr, this);
  }

  public void setShortFrozen(int value) {
    ctpJNI.CShfeFtdcSyncingInvestorPositionField_ShortFrozen_set(swigCPtr, this, value);
  }

  public int getShortFrozen() {
    return ctpJNI.CShfeFtdcSyncingInvestorPositionField_ShortFrozen_get(swigCPtr, this);
  }

  public void setLongFrozenAmount(double value) {
    ctpJNI.CShfeFtdcSyncingInvestorPositionField_LongFrozenAmount_set(swigCPtr, this, value);
  }

  public double getLongFrozenAmount() {
    return ctpJNI.CShfeFtdcSyncingInvestorPositionField_LongFrozenAmount_get(swigCPtr, this);
  }

  public void setShortFrozenAmount(double value) {
    ctpJNI.CShfeFtdcSyncingInvestorPositionField_ShortFrozenAmount_set(swigCPtr, this, value);
  }

  public double getShortFrozenAmount() {
    return ctpJNI.CShfeFtdcSyncingInvestorPositionField_ShortFrozenAmount_get(swigCPtr, this);
  }

  public void setOpenVolume(int value) {
    ctpJNI.CShfeFtdcSyncingInvestorPositionField_OpenVolume_set(swigCPtr, this, value);
  }

  public int getOpenVolume() {
    return ctpJNI.CShfeFtdcSyncingInvestorPositionField_OpenVolume_get(swigCPtr, this);
  }

  public void setCloseVolume(int value) {
    ctpJNI.CShfeFtdcSyncingInvestorPositionField_CloseVolume_set(swigCPtr, this, value);
  }

  public int getCloseVolume() {
    return ctpJNI.CShfeFtdcSyncingInvestorPositionField_CloseVolume_get(swigCPtr, this);
  }

  public void setOpenAmount(double value) {
    ctpJNI.CShfeFtdcSyncingInvestorPositionField_OpenAmount_set(swigCPtr, this, value);
  }

  public double getOpenAmount() {
    return ctpJNI.CShfeFtdcSyncingInvestorPositionField_OpenAmount_get(swigCPtr, this);
  }

  public void setCloseAmount(double value) {
    ctpJNI.CShfeFtdcSyncingInvestorPositionField_CloseAmount_set(swigCPtr, this, value);
  }

  public double getCloseAmount() {
    return ctpJNI.CShfeFtdcSyncingInvestorPositionField_CloseAmount_get(swigCPtr, this);
  }

  public void setPositionCost(double value) {
    ctpJNI.CShfeFtdcSyncingInvestorPositionField_PositionCost_set(swigCPtr, this, value);
  }

  public double getPositionCost() {
    return ctpJNI.CShfeFtdcSyncingInvestorPositionField_PositionCost_get(swigCPtr, this);
  }

  public void setPreMargin(double value) {
    ctpJNI.CShfeFtdcSyncingInvestorPositionField_PreMargin_set(swigCPtr, this, value);
  }

  public double getPreMargin() {
    return ctpJNI.CShfeFtdcSyncingInvestorPositionField_PreMargin_get(swigCPtr, this);
  }

  public void setUseMargin(double value) {
    ctpJNI.CShfeFtdcSyncingInvestorPositionField_UseMargin_set(swigCPtr, this, value);
  }

  public double getUseMargin() {
    return ctpJNI.CShfeFtdcSyncingInvestorPositionField_UseMargin_get(swigCPtr, this);
  }

  public void setFrozenMargin(double value) {
    ctpJNI.CShfeFtdcSyncingInvestorPositionField_FrozenMargin_set(swigCPtr, this, value);
  }

  public double getFrozenMargin() {
    return ctpJNI.CShfeFtdcSyncingInvestorPositionField_FrozenMargin_get(swigCPtr, this);
  }

  public void setFrozenCash(double value) {
    ctpJNI.CShfeFtdcSyncingInvestorPositionField_FrozenCash_set(swigCPtr, this, value);
  }

  public double getFrozenCash() {
    return ctpJNI.CShfeFtdcSyncingInvestorPositionField_FrozenCash_get(swigCPtr, this);
  }

  public void setFrozenCommission(double value) {
    ctpJNI.CShfeFtdcSyncingInvestorPositionField_FrozenCommission_set(swigCPtr, this, value);
  }

  public double getFrozenCommission() {
    return ctpJNI.CShfeFtdcSyncingInvestorPositionField_FrozenCommission_get(swigCPtr, this);
  }

  public void setCashIn(double value) {
    ctpJNI.CShfeFtdcSyncingInvestorPositionField_CashIn_set(swigCPtr, this, value);
  }

  public double getCashIn() {
    return ctpJNI.CShfeFtdcSyncingInvestorPositionField_CashIn_get(swigCPtr, this);
  }

  public void setCommission(double value) {
    ctpJNI.CShfeFtdcSyncingInvestorPositionField_Commission_set(swigCPtr, this, value);
  }

  public double getCommission() {
    return ctpJNI.CShfeFtdcSyncingInvestorPositionField_Commission_get(swigCPtr, this);
  }

  public void setCloseProfit(double value) {
    ctpJNI.CShfeFtdcSyncingInvestorPositionField_CloseProfit_set(swigCPtr, this, value);
  }

  public double getCloseProfit() {
    return ctpJNI.CShfeFtdcSyncingInvestorPositionField_CloseProfit_get(swigCPtr, this);
  }

  public void setPositionProfit(double value) {
    ctpJNI.CShfeFtdcSyncingInvestorPositionField_PositionProfit_set(swigCPtr, this, value);
  }

  public double getPositionProfit() {
    return ctpJNI.CShfeFtdcSyncingInvestorPositionField_PositionProfit_get(swigCPtr, this);
  }

  public void setPreSettlementPrice(double value) {
    ctpJNI.CShfeFtdcSyncingInvestorPositionField_PreSettlementPrice_set(swigCPtr, this, value);
  }

  public double getPreSettlementPrice() {
    return ctpJNI.CShfeFtdcSyncingInvestorPositionField_PreSettlementPrice_get(swigCPtr, this);
  }

  public void setSettlementPrice(double value) {
    ctpJNI.CShfeFtdcSyncingInvestorPositionField_SettlementPrice_set(swigCPtr, this, value);
  }

  public double getSettlementPrice() {
    return ctpJNI.CShfeFtdcSyncingInvestorPositionField_SettlementPrice_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ctpJNI.CShfeFtdcSyncingInvestorPositionField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ctpJNI.CShfeFtdcSyncingInvestorPositionField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    ctpJNI.CShfeFtdcSyncingInvestorPositionField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return ctpJNI.CShfeFtdcSyncingInvestorPositionField_SettlementID_get(swigCPtr, this);
  }

  public void setOpenCost(double value) {
    ctpJNI.CShfeFtdcSyncingInvestorPositionField_OpenCost_set(swigCPtr, this, value);
  }

  public double getOpenCost() {
    return ctpJNI.CShfeFtdcSyncingInvestorPositionField_OpenCost_get(swigCPtr, this);
  }

  public void setExchangeMargin(double value) {
    ctpJNI.CShfeFtdcSyncingInvestorPositionField_ExchangeMargin_set(swigCPtr, this, value);
  }

  public double getExchangeMargin() {
    return ctpJNI.CShfeFtdcSyncingInvestorPositionField_ExchangeMargin_get(swigCPtr, this);
  }

  public void setCombPosition(int value) {
    ctpJNI.CShfeFtdcSyncingInvestorPositionField_CombPosition_set(swigCPtr, this, value);
  }

  public int getCombPosition() {
    return ctpJNI.CShfeFtdcSyncingInvestorPositionField_CombPosition_get(swigCPtr, this);
  }

  public void setCombLongFrozen(int value) {
    ctpJNI.CShfeFtdcSyncingInvestorPositionField_CombLongFrozen_set(swigCPtr, this, value);
  }

  public int getCombLongFrozen() {
    return ctpJNI.CShfeFtdcSyncingInvestorPositionField_CombLongFrozen_get(swigCPtr, this);
  }

  public void setCombShortFrozen(int value) {
    ctpJNI.CShfeFtdcSyncingInvestorPositionField_CombShortFrozen_set(swigCPtr, this, value);
  }

  public int getCombShortFrozen() {
    return ctpJNI.CShfeFtdcSyncingInvestorPositionField_CombShortFrozen_get(swigCPtr, this);
  }

  public void setCloseProfitByDate(double value) {
    ctpJNI.CShfeFtdcSyncingInvestorPositionField_CloseProfitByDate_set(swigCPtr, this, value);
  }

  public double getCloseProfitByDate() {
    return ctpJNI.CShfeFtdcSyncingInvestorPositionField_CloseProfitByDate_get(swigCPtr, this);
  }

  public void setCloseProfitByTrade(double value) {
    ctpJNI.CShfeFtdcSyncingInvestorPositionField_CloseProfitByTrade_set(swigCPtr, this, value);
  }

  public double getCloseProfitByTrade() {
    return ctpJNI.CShfeFtdcSyncingInvestorPositionField_CloseProfitByTrade_get(swigCPtr, this);
  }

  public void setTodayPosition(int value) {
    ctpJNI.CShfeFtdcSyncingInvestorPositionField_TodayPosition_set(swigCPtr, this, value);
  }

  public int getTodayPosition() {
    return ctpJNI.CShfeFtdcSyncingInvestorPositionField_TodayPosition_get(swigCPtr, this);
  }

  public void setMarginRateByMoney(double value) {
    ctpJNI.CShfeFtdcSyncingInvestorPositionField_MarginRateByMoney_set(swigCPtr, this, value);
  }

  public double getMarginRateByMoney() {
    return ctpJNI.CShfeFtdcSyncingInvestorPositionField_MarginRateByMoney_get(swigCPtr, this);
  }

  public void setMarginRateByVolume(double value) {
    ctpJNI.CShfeFtdcSyncingInvestorPositionField_MarginRateByVolume_set(swigCPtr, this, value);
  }

  public double getMarginRateByVolume() {
    return ctpJNI.CShfeFtdcSyncingInvestorPositionField_MarginRateByVolume_get(swigCPtr, this);
  }

  public CShfeFtdcSyncingInvestorPositionField() {
    this(ctpJNI.new_CShfeFtdcSyncingInvestorPositionField(), true);
  }

}
