/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcDepthMarketDataField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcDepthMarketDataField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcDepthMarketDataField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcDepthMarketDataField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    ctpJNI.CShfeFtdcDepthMarketDataField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ctpJNI.CShfeFtdcDepthMarketDataField_TradingDay_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ctpJNI.CShfeFtdcDepthMarketDataField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpJNI.CShfeFtdcDepthMarketDataField_InstrumentID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpJNI.CShfeFtdcDepthMarketDataField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpJNI.CShfeFtdcDepthMarketDataField_ExchangeID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    ctpJNI.CShfeFtdcDepthMarketDataField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return ctpJNI.CShfeFtdcDepthMarketDataField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setLastPrice(double value) {
    ctpJNI.CShfeFtdcDepthMarketDataField_LastPrice_set(swigCPtr, this, value);
  }

  public double getLastPrice() {
    return ctpJNI.CShfeFtdcDepthMarketDataField_LastPrice_get(swigCPtr, this);
  }

  public void setPreSettlementPrice(double value) {
    ctpJNI.CShfeFtdcDepthMarketDataField_PreSettlementPrice_set(swigCPtr, this, value);
  }

  public double getPreSettlementPrice() {
    return ctpJNI.CShfeFtdcDepthMarketDataField_PreSettlementPrice_get(swigCPtr, this);
  }

  public void setPreClosePrice(double value) {
    ctpJNI.CShfeFtdcDepthMarketDataField_PreClosePrice_set(swigCPtr, this, value);
  }

  public double getPreClosePrice() {
    return ctpJNI.CShfeFtdcDepthMarketDataField_PreClosePrice_get(swigCPtr, this);
  }

  public void setPreOpenInterest(double value) {
    ctpJNI.CShfeFtdcDepthMarketDataField_PreOpenInterest_set(swigCPtr, this, value);
  }

  public double getPreOpenInterest() {
    return ctpJNI.CShfeFtdcDepthMarketDataField_PreOpenInterest_get(swigCPtr, this);
  }

  public void setOpenPrice(double value) {
    ctpJNI.CShfeFtdcDepthMarketDataField_OpenPrice_set(swigCPtr, this, value);
  }

  public double getOpenPrice() {
    return ctpJNI.CShfeFtdcDepthMarketDataField_OpenPrice_get(swigCPtr, this);
  }

  public void setHighestPrice(double value) {
    ctpJNI.CShfeFtdcDepthMarketDataField_HighestPrice_set(swigCPtr, this, value);
  }

  public double getHighestPrice() {
    return ctpJNI.CShfeFtdcDepthMarketDataField_HighestPrice_get(swigCPtr, this);
  }

  public void setLowestPrice(double value) {
    ctpJNI.CShfeFtdcDepthMarketDataField_LowestPrice_set(swigCPtr, this, value);
  }

  public double getLowestPrice() {
    return ctpJNI.CShfeFtdcDepthMarketDataField_LowestPrice_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    ctpJNI.CShfeFtdcDepthMarketDataField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return ctpJNI.CShfeFtdcDepthMarketDataField_Volume_get(swigCPtr, this);
  }

  public void setTurnover(double value) {
    ctpJNI.CShfeFtdcDepthMarketDataField_Turnover_set(swigCPtr, this, value);
  }

  public double getTurnover() {
    return ctpJNI.CShfeFtdcDepthMarketDataField_Turnover_get(swigCPtr, this);
  }

  public void setOpenInterest(double value) {
    ctpJNI.CShfeFtdcDepthMarketDataField_OpenInterest_set(swigCPtr, this, value);
  }

  public double getOpenInterest() {
    return ctpJNI.CShfeFtdcDepthMarketDataField_OpenInterest_get(swigCPtr, this);
  }

  public void setClosePrice(double value) {
    ctpJNI.CShfeFtdcDepthMarketDataField_ClosePrice_set(swigCPtr, this, value);
  }

  public double getClosePrice() {
    return ctpJNI.CShfeFtdcDepthMarketDataField_ClosePrice_get(swigCPtr, this);
  }

  public void setSettlementPrice(double value) {
    ctpJNI.CShfeFtdcDepthMarketDataField_SettlementPrice_set(swigCPtr, this, value);
  }

  public double getSettlementPrice() {
    return ctpJNI.CShfeFtdcDepthMarketDataField_SettlementPrice_get(swigCPtr, this);
  }

  public void setUpperLimitPrice(double value) {
    ctpJNI.CShfeFtdcDepthMarketDataField_UpperLimitPrice_set(swigCPtr, this, value);
  }

  public double getUpperLimitPrice() {
    return ctpJNI.CShfeFtdcDepthMarketDataField_UpperLimitPrice_get(swigCPtr, this);
  }

  public void setLowerLimitPrice(double value) {
    ctpJNI.CShfeFtdcDepthMarketDataField_LowerLimitPrice_set(swigCPtr, this, value);
  }

  public double getLowerLimitPrice() {
    return ctpJNI.CShfeFtdcDepthMarketDataField_LowerLimitPrice_get(swigCPtr, this);
  }

  public void setPreDelta(double value) {
    ctpJNI.CShfeFtdcDepthMarketDataField_PreDelta_set(swigCPtr, this, value);
  }

  public double getPreDelta() {
    return ctpJNI.CShfeFtdcDepthMarketDataField_PreDelta_get(swigCPtr, this);
  }

  public void setCurrDelta(double value) {
    ctpJNI.CShfeFtdcDepthMarketDataField_CurrDelta_set(swigCPtr, this, value);
  }

  public double getCurrDelta() {
    return ctpJNI.CShfeFtdcDepthMarketDataField_CurrDelta_get(swigCPtr, this);
  }

  public void setUpdateTime(String value) {
    ctpJNI.CShfeFtdcDepthMarketDataField_UpdateTime_set(swigCPtr, this, value);
  }

  public String getUpdateTime() {
    return ctpJNI.CShfeFtdcDepthMarketDataField_UpdateTime_get(swigCPtr, this);
  }

  public void setUpdateMillisec(int value) {
    ctpJNI.CShfeFtdcDepthMarketDataField_UpdateMillisec_set(swigCPtr, this, value);
  }

  public int getUpdateMillisec() {
    return ctpJNI.CShfeFtdcDepthMarketDataField_UpdateMillisec_get(swigCPtr, this);
  }

  public void setBidPrice1(double value) {
    ctpJNI.CShfeFtdcDepthMarketDataField_BidPrice1_set(swigCPtr, this, value);
  }

  public double getBidPrice1() {
    return ctpJNI.CShfeFtdcDepthMarketDataField_BidPrice1_get(swigCPtr, this);
  }

  public void setBidVolume1(int value) {
    ctpJNI.CShfeFtdcDepthMarketDataField_BidVolume1_set(swigCPtr, this, value);
  }

  public int getBidVolume1() {
    return ctpJNI.CShfeFtdcDepthMarketDataField_BidVolume1_get(swigCPtr, this);
  }

  public void setAskPrice1(double value) {
    ctpJNI.CShfeFtdcDepthMarketDataField_AskPrice1_set(swigCPtr, this, value);
  }

  public double getAskPrice1() {
    return ctpJNI.CShfeFtdcDepthMarketDataField_AskPrice1_get(swigCPtr, this);
  }

  public void setAskVolume1(int value) {
    ctpJNI.CShfeFtdcDepthMarketDataField_AskVolume1_set(swigCPtr, this, value);
  }

  public int getAskVolume1() {
    return ctpJNI.CShfeFtdcDepthMarketDataField_AskVolume1_get(swigCPtr, this);
  }

  public void setBidPrice2(double value) {
    ctpJNI.CShfeFtdcDepthMarketDataField_BidPrice2_set(swigCPtr, this, value);
  }

  public double getBidPrice2() {
    return ctpJNI.CShfeFtdcDepthMarketDataField_BidPrice2_get(swigCPtr, this);
  }

  public void setBidVolume2(int value) {
    ctpJNI.CShfeFtdcDepthMarketDataField_BidVolume2_set(swigCPtr, this, value);
  }

  public int getBidVolume2() {
    return ctpJNI.CShfeFtdcDepthMarketDataField_BidVolume2_get(swigCPtr, this);
  }

  public void setAskPrice2(double value) {
    ctpJNI.CShfeFtdcDepthMarketDataField_AskPrice2_set(swigCPtr, this, value);
  }

  public double getAskPrice2() {
    return ctpJNI.CShfeFtdcDepthMarketDataField_AskPrice2_get(swigCPtr, this);
  }

  public void setAskVolume2(int value) {
    ctpJNI.CShfeFtdcDepthMarketDataField_AskVolume2_set(swigCPtr, this, value);
  }

  public int getAskVolume2() {
    return ctpJNI.CShfeFtdcDepthMarketDataField_AskVolume2_get(swigCPtr, this);
  }

  public void setBidPrice3(double value) {
    ctpJNI.CShfeFtdcDepthMarketDataField_BidPrice3_set(swigCPtr, this, value);
  }

  public double getBidPrice3() {
    return ctpJNI.CShfeFtdcDepthMarketDataField_BidPrice3_get(swigCPtr, this);
  }

  public void setBidVolume3(int value) {
    ctpJNI.CShfeFtdcDepthMarketDataField_BidVolume3_set(swigCPtr, this, value);
  }

  public int getBidVolume3() {
    return ctpJNI.CShfeFtdcDepthMarketDataField_BidVolume3_get(swigCPtr, this);
  }

  public void setAskPrice3(double value) {
    ctpJNI.CShfeFtdcDepthMarketDataField_AskPrice3_set(swigCPtr, this, value);
  }

  public double getAskPrice3() {
    return ctpJNI.CShfeFtdcDepthMarketDataField_AskPrice3_get(swigCPtr, this);
  }

  public void setAskVolume3(int value) {
    ctpJNI.CShfeFtdcDepthMarketDataField_AskVolume3_set(swigCPtr, this, value);
  }

  public int getAskVolume3() {
    return ctpJNI.CShfeFtdcDepthMarketDataField_AskVolume3_get(swigCPtr, this);
  }

  public void setBidPrice4(double value) {
    ctpJNI.CShfeFtdcDepthMarketDataField_BidPrice4_set(swigCPtr, this, value);
  }

  public double getBidPrice4() {
    return ctpJNI.CShfeFtdcDepthMarketDataField_BidPrice4_get(swigCPtr, this);
  }

  public void setBidVolume4(int value) {
    ctpJNI.CShfeFtdcDepthMarketDataField_BidVolume4_set(swigCPtr, this, value);
  }

  public int getBidVolume4() {
    return ctpJNI.CShfeFtdcDepthMarketDataField_BidVolume4_get(swigCPtr, this);
  }

  public void setAskPrice4(double value) {
    ctpJNI.CShfeFtdcDepthMarketDataField_AskPrice4_set(swigCPtr, this, value);
  }

  public double getAskPrice4() {
    return ctpJNI.CShfeFtdcDepthMarketDataField_AskPrice4_get(swigCPtr, this);
  }

  public void setAskVolume4(int value) {
    ctpJNI.CShfeFtdcDepthMarketDataField_AskVolume4_set(swigCPtr, this, value);
  }

  public int getAskVolume4() {
    return ctpJNI.CShfeFtdcDepthMarketDataField_AskVolume4_get(swigCPtr, this);
  }

  public void setBidPrice5(double value) {
    ctpJNI.CShfeFtdcDepthMarketDataField_BidPrice5_set(swigCPtr, this, value);
  }

  public double getBidPrice5() {
    return ctpJNI.CShfeFtdcDepthMarketDataField_BidPrice5_get(swigCPtr, this);
  }

  public void setBidVolume5(int value) {
    ctpJNI.CShfeFtdcDepthMarketDataField_BidVolume5_set(swigCPtr, this, value);
  }

  public int getBidVolume5() {
    return ctpJNI.CShfeFtdcDepthMarketDataField_BidVolume5_get(swigCPtr, this);
  }

  public void setAskPrice5(double value) {
    ctpJNI.CShfeFtdcDepthMarketDataField_AskPrice5_set(swigCPtr, this, value);
  }

  public double getAskPrice5() {
    return ctpJNI.CShfeFtdcDepthMarketDataField_AskPrice5_get(swigCPtr, this);
  }

  public void setAskVolume5(int value) {
    ctpJNI.CShfeFtdcDepthMarketDataField_AskVolume5_set(swigCPtr, this, value);
  }

  public int getAskVolume5() {
    return ctpJNI.CShfeFtdcDepthMarketDataField_AskVolume5_get(swigCPtr, this);
  }

  public void setAveragePrice(double value) {
    ctpJNI.CShfeFtdcDepthMarketDataField_AveragePrice_set(swigCPtr, this, value);
  }

  public double getAveragePrice() {
    return ctpJNI.CShfeFtdcDepthMarketDataField_AveragePrice_get(swigCPtr, this);
  }

  public CShfeFtdcDepthMarketDataField() {
    this(ctpJNI.new_CShfeFtdcDepthMarketDataField(), true);
  }

}
