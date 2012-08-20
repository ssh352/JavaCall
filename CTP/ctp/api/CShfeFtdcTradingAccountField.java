/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcTradingAccountField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcTradingAccountField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcTradingAccountField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcTradingAccountField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcTradingAccountField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcTradingAccountField_BrokerID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    ctpJNI.CShfeFtdcTradingAccountField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return ctpJNI.CShfeFtdcTradingAccountField_AccountID_get(swigCPtr, this);
  }

  public void setPreMortgage(double value) {
    ctpJNI.CShfeFtdcTradingAccountField_PreMortgage_set(swigCPtr, this, value);
  }

  public double getPreMortgage() {
    return ctpJNI.CShfeFtdcTradingAccountField_PreMortgage_get(swigCPtr, this);
  }

  public void setPreCredit(double value) {
    ctpJNI.CShfeFtdcTradingAccountField_PreCredit_set(swigCPtr, this, value);
  }

  public double getPreCredit() {
    return ctpJNI.CShfeFtdcTradingAccountField_PreCredit_get(swigCPtr, this);
  }

  public void setPreDeposit(double value) {
    ctpJNI.CShfeFtdcTradingAccountField_PreDeposit_set(swigCPtr, this, value);
  }

  public double getPreDeposit() {
    return ctpJNI.CShfeFtdcTradingAccountField_PreDeposit_get(swigCPtr, this);
  }

  public void setPreBalance(double value) {
    ctpJNI.CShfeFtdcTradingAccountField_PreBalance_set(swigCPtr, this, value);
  }

  public double getPreBalance() {
    return ctpJNI.CShfeFtdcTradingAccountField_PreBalance_get(swigCPtr, this);
  }

  public void setPreMargin(double value) {
    ctpJNI.CShfeFtdcTradingAccountField_PreMargin_set(swigCPtr, this, value);
  }

  public double getPreMargin() {
    return ctpJNI.CShfeFtdcTradingAccountField_PreMargin_get(swigCPtr, this);
  }

  public void setInterestBase(double value) {
    ctpJNI.CShfeFtdcTradingAccountField_InterestBase_set(swigCPtr, this, value);
  }

  public double getInterestBase() {
    return ctpJNI.CShfeFtdcTradingAccountField_InterestBase_get(swigCPtr, this);
  }

  public void setInterest(double value) {
    ctpJNI.CShfeFtdcTradingAccountField_Interest_set(swigCPtr, this, value);
  }

  public double getInterest() {
    return ctpJNI.CShfeFtdcTradingAccountField_Interest_get(swigCPtr, this);
  }

  public void setDeposit(double value) {
    ctpJNI.CShfeFtdcTradingAccountField_Deposit_set(swigCPtr, this, value);
  }

  public double getDeposit() {
    return ctpJNI.CShfeFtdcTradingAccountField_Deposit_get(swigCPtr, this);
  }

  public void setWithdraw(double value) {
    ctpJNI.CShfeFtdcTradingAccountField_Withdraw_set(swigCPtr, this, value);
  }

  public double getWithdraw() {
    return ctpJNI.CShfeFtdcTradingAccountField_Withdraw_get(swigCPtr, this);
  }

  public void setFrozenMargin(double value) {
    ctpJNI.CShfeFtdcTradingAccountField_FrozenMargin_set(swigCPtr, this, value);
  }

  public double getFrozenMargin() {
    return ctpJNI.CShfeFtdcTradingAccountField_FrozenMargin_get(swigCPtr, this);
  }

  public void setFrozenCash(double value) {
    ctpJNI.CShfeFtdcTradingAccountField_FrozenCash_set(swigCPtr, this, value);
  }

  public double getFrozenCash() {
    return ctpJNI.CShfeFtdcTradingAccountField_FrozenCash_get(swigCPtr, this);
  }

  public void setFrozenCommission(double value) {
    ctpJNI.CShfeFtdcTradingAccountField_FrozenCommission_set(swigCPtr, this, value);
  }

  public double getFrozenCommission() {
    return ctpJNI.CShfeFtdcTradingAccountField_FrozenCommission_get(swigCPtr, this);
  }

  public void setCurrMargin(double value) {
    ctpJNI.CShfeFtdcTradingAccountField_CurrMargin_set(swigCPtr, this, value);
  }

  public double getCurrMargin() {
    return ctpJNI.CShfeFtdcTradingAccountField_CurrMargin_get(swigCPtr, this);
  }

  public void setCashIn(double value) {
    ctpJNI.CShfeFtdcTradingAccountField_CashIn_set(swigCPtr, this, value);
  }

  public double getCashIn() {
    return ctpJNI.CShfeFtdcTradingAccountField_CashIn_get(swigCPtr, this);
  }

  public void setCommission(double value) {
    ctpJNI.CShfeFtdcTradingAccountField_Commission_set(swigCPtr, this, value);
  }

  public double getCommission() {
    return ctpJNI.CShfeFtdcTradingAccountField_Commission_get(swigCPtr, this);
  }

  public void setCloseProfit(double value) {
    ctpJNI.CShfeFtdcTradingAccountField_CloseProfit_set(swigCPtr, this, value);
  }

  public double getCloseProfit() {
    return ctpJNI.CShfeFtdcTradingAccountField_CloseProfit_get(swigCPtr, this);
  }

  public void setPositionProfit(double value) {
    ctpJNI.CShfeFtdcTradingAccountField_PositionProfit_set(swigCPtr, this, value);
  }

  public double getPositionProfit() {
    return ctpJNI.CShfeFtdcTradingAccountField_PositionProfit_get(swigCPtr, this);
  }

  public void setBalance(double value) {
    ctpJNI.CShfeFtdcTradingAccountField_Balance_set(swigCPtr, this, value);
  }

  public double getBalance() {
    return ctpJNI.CShfeFtdcTradingAccountField_Balance_get(swigCPtr, this);
  }

  public void setAvailable(double value) {
    ctpJNI.CShfeFtdcTradingAccountField_Available_set(swigCPtr, this, value);
  }

  public double getAvailable() {
    return ctpJNI.CShfeFtdcTradingAccountField_Available_get(swigCPtr, this);
  }

  public void setWithdrawQuota(double value) {
    ctpJNI.CShfeFtdcTradingAccountField_WithdrawQuota_set(swigCPtr, this, value);
  }

  public double getWithdrawQuota() {
    return ctpJNI.CShfeFtdcTradingAccountField_WithdrawQuota_get(swigCPtr, this);
  }

  public void setReserve(double value) {
    ctpJNI.CShfeFtdcTradingAccountField_Reserve_set(swigCPtr, this, value);
  }

  public double getReserve() {
    return ctpJNI.CShfeFtdcTradingAccountField_Reserve_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ctpJNI.CShfeFtdcTradingAccountField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ctpJNI.CShfeFtdcTradingAccountField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    ctpJNI.CShfeFtdcTradingAccountField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return ctpJNI.CShfeFtdcTradingAccountField_SettlementID_get(swigCPtr, this);
  }

  public void setCredit(double value) {
    ctpJNI.CShfeFtdcTradingAccountField_Credit_set(swigCPtr, this, value);
  }

  public double getCredit() {
    return ctpJNI.CShfeFtdcTradingAccountField_Credit_get(swigCPtr, this);
  }

  public void setMortgage(double value) {
    ctpJNI.CShfeFtdcTradingAccountField_Mortgage_set(swigCPtr, this, value);
  }

  public double getMortgage() {
    return ctpJNI.CShfeFtdcTradingAccountField_Mortgage_get(swigCPtr, this);
  }

  public void setExchangeMargin(double value) {
    ctpJNI.CShfeFtdcTradingAccountField_ExchangeMargin_set(swigCPtr, this, value);
  }

  public double getExchangeMargin() {
    return ctpJNI.CShfeFtdcTradingAccountField_ExchangeMargin_get(swigCPtr, this);
  }

  public void setDeliveryMargin(double value) {
    ctpJNI.CShfeFtdcTradingAccountField_DeliveryMargin_set(swigCPtr, this, value);
  }

  public double getDeliveryMargin() {
    return ctpJNI.CShfeFtdcTradingAccountField_DeliveryMargin_get(swigCPtr, this);
  }

  public void setExchangeDeliveryMargin(double value) {
    ctpJNI.CShfeFtdcTradingAccountField_ExchangeDeliveryMargin_set(swigCPtr, this, value);
  }

  public double getExchangeDeliveryMargin() {
    return ctpJNI.CShfeFtdcTradingAccountField_ExchangeDeliveryMargin_get(swigCPtr, this);
  }

  public CShfeFtdcTradingAccountField() {
    this(ctpJNI.new_CShfeFtdcTradingAccountField(), true);
  }

}
