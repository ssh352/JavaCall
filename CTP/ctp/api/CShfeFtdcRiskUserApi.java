/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcRiskUserApi {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcRiskUserApi(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcRiskUserApi obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
      }
      swigCPtr = 0;
    }
  }

  public static CShfeFtdcRiskUserApi CreateFtdcRiskUserApi(String pszFlowPath) {
    long cPtr = ctpJNI.CShfeFtdcRiskUserApi_CreateFtdcRiskUserApi__SWIG_0(pszFlowPath);
    return (cPtr == 0) ? null : new CShfeFtdcRiskUserApi(cPtr, false);
  }

  public static CShfeFtdcRiskUserApi CreateFtdcRiskUserApi() {
    long cPtr = ctpJNI.CShfeFtdcRiskUserApi_CreateFtdcRiskUserApi__SWIG_1();
    return (cPtr == 0) ? null : new CShfeFtdcRiskUserApi(cPtr, false);
  }

  public void Release() {
    ctpJNI.CShfeFtdcRiskUserApi_Release(swigCPtr, this);
  }

  public void Init() {
    ctpJNI.CShfeFtdcRiskUserApi_Init(swigCPtr, this);
  }

  public int Join() {
    return ctpJNI.CShfeFtdcRiskUserApi_Join(swigCPtr, this);
  }

  public String GetTradingDay() {
    return ctpJNI.CShfeFtdcRiskUserApi_GetTradingDay(swigCPtr, this);
  }

  public void RegisterFront(String pszFrontAddress) {
    ctpJNI.CShfeFtdcRiskUserApi_RegisterFront(swigCPtr, this, pszFrontAddress);
  }

  public void RegisterSpi(CShfeFtdcRiskUserSpi pSpi) {
    ctpJNI.CShfeFtdcRiskUserApi_RegisterSpi(swigCPtr, this, CShfeFtdcRiskUserSpi.getCPtr(pSpi), pSpi);
  }

  public int ReqRiskUserLogin(CShfeFtdcReqRiskUserLoginField pReqRiskUserLogin, int nRequestID) {
    return ctpJNI.CShfeFtdcRiskUserApi_ReqRiskUserLogin(swigCPtr, this, CShfeFtdcReqRiskUserLoginField.getCPtr(pReqRiskUserLogin), pReqRiskUserLogin, nRequestID);
  }

  public int ReqQryOrderStat(CShfeFtdcQryStatField pQryStat, int nRequestID) {
    return ctpJNI.CShfeFtdcRiskUserApi_ReqQryOrderStat(swigCPtr, this, CShfeFtdcQryStatField.getCPtr(pQryStat), pQryStat, nRequestID);
  }

  public int ReqSubRiskMarketData(CShfeFtdcSubMarketDataField pSubMarketData, int SubMarketDataCnt, int nRequestID) {
    return ctpJNI.CShfeFtdcRiskUserApi_ReqSubRiskMarketData(swigCPtr, this, CShfeFtdcSubMarketDataField.getCPtr(pSubMarketData), pSubMarketData, SubMarketDataCnt, nRequestID);
  }

  public int ReqUnSubRiskMarketData(CShfeFtdcSubMarketDataField pSubMarketData, int nRequestID) {
    return ctpJNI.CShfeFtdcRiskUserApi_ReqUnSubRiskMarketData(swigCPtr, this, CShfeFtdcSubMarketDataField.getCPtr(pSubMarketData), pSubMarketData, nRequestID);
  }

  public int ReqQryInstPositionRate(CShfeFtdcQryInstPositionRateField pQryInstPositionRate, int QryInstPositionRateCnt, int nRequestID) {
    return ctpJNI.CShfeFtdcRiskUserApi_ReqQryInstPositionRate(swigCPtr, this, CShfeFtdcQryInstPositionRateField.getCPtr(pQryInstPositionRate), pQryInstPositionRate, QryInstPositionRateCnt, nRequestID);
  }

  public int ReqQryProductPositionRate(CShfeFtdcQryProductPositionRateField pQryProductPositionRate, int nRequestID) {
    return ctpJNI.CShfeFtdcRiskUserApi_ReqQryProductPositionRate(swigCPtr, this, CShfeFtdcQryProductPositionRateField.getCPtr(pQryProductPositionRate), pQryProductPositionRate, nRequestID);
  }

  public int ReqSubscribeTrade(CShfeFtdcNotifySequenceField pNotifySequence, int nRequestID) {
    return ctpJNI.CShfeFtdcRiskUserApi_ReqSubscribeTrade(swigCPtr, this, CShfeFtdcNotifySequenceField.getCPtr(pNotifySequence), pNotifySequence, nRequestID);
  }

  public int ReqSubscribeOrder(CShfeFtdcNotifySequenceField pNotifySequence, int nRequestID) {
    return ctpJNI.CShfeFtdcRiskUserApi_ReqSubscribeOrder(swigCPtr, this, CShfeFtdcNotifySequenceField.getCPtr(pNotifySequence), pNotifySequence, nRequestID);
  }

  public int ReqSubBrokerUserEvent(CShfeFtdcNotifySequenceField pNotifySequence, int nRequestID) {
    return ctpJNI.CShfeFtdcRiskUserApi_ReqSubBrokerUserEvent(swigCPtr, this, CShfeFtdcNotifySequenceField.getCPtr(pNotifySequence), pNotifySequence, nRequestID);
  }

  public int ReqRiskOrderInsert(CShfeFtdcRiskForceCloseOrderField pRiskForceCloseOrder, int nRequestID) {
    return ctpJNI.CShfeFtdcRiskUserApi_ReqRiskOrderInsert(swigCPtr, this, CShfeFtdcRiskForceCloseOrderField.getCPtr(pRiskForceCloseOrder), pRiskForceCloseOrder, nRequestID);
  }

  public int ReqRiskOrderAction(CShfeFtdcInputOrderActionField pInputOrderAction, int nRequestID) {
    return ctpJNI.CShfeFtdcRiskUserApi_ReqRiskOrderAction(swigCPtr, this, CShfeFtdcInputOrderActionField.getCPtr(pInputOrderAction), pInputOrderAction, nRequestID);
  }

  public int ReqSubscribePosition(CShfeFtdcNotifySequenceField pNotifySequence, int nRequestID) {
    return ctpJNI.CShfeFtdcRiskUserApi_ReqSubscribePosition(swigCPtr, this, CShfeFtdcNotifySequenceField.getCPtr(pNotifySequence), pNotifySequence, nRequestID);
  }

  public int ReqRiskParkedOrderInsert(CShfeFtdcRiskParkedOrderField pRiskParkedOrder, int nRequestID) {
    return ctpJNI.CShfeFtdcRiskUserApi_ReqRiskParkedOrderInsert(swigCPtr, this, CShfeFtdcRiskParkedOrderField.getCPtr(pRiskParkedOrder), pRiskParkedOrder, nRequestID);
  }

  public int ReqRemoveRiskParkedOrder(CShfeFtdcRemoveRiskParkedOrderField pRemoveRiskParkedOrder, int nRequestID) {
    return ctpJNI.CShfeFtdcRiskUserApi_ReqRemoveRiskParkedOrder(swigCPtr, this, CShfeFtdcRemoveRiskParkedOrderField.getCPtr(pRemoveRiskParkedOrder), pRemoveRiskParkedOrder, nRequestID);
  }

  public int ReqSubRiskParkedOrder(CShfeFtdcNotifySequenceField pNotifySequence, int nRequestID) {
    return ctpJNI.CShfeFtdcRiskUserApi_ReqSubRiskParkedOrder(swigCPtr, this, CShfeFtdcNotifySequenceField.getCPtr(pNotifySequence), pNotifySequence, nRequestID);
  }

  public int ReqRiskUserPasswordUpd(CShfeFtdcUserPasswordUpdateField pUserPasswordUpdate, int nRequestID) {
    return ctpJNI.CShfeFtdcRiskUserApi_ReqRiskUserPasswordUpd(swigCPtr, this, CShfeFtdcUserPasswordUpdateField.getCPtr(pUserPasswordUpdate), pUserPasswordUpdate, nRequestID);
  }

  public int ReqSubSeqDeposit(CShfeFtdcRiskNtfSequenceField pRiskNtfSequence, int nRequestID) {
    return ctpJNI.CShfeFtdcRiskUserApi_ReqSubSeqDeposit(swigCPtr, this, CShfeFtdcRiskNtfSequenceField.getCPtr(pRiskNtfSequence), pRiskNtfSequence, nRequestID);
  }

  public int ReqSubSeqTradingCode(CShfeFtdcRiskNtfSequenceField pRiskNtfSequence, int nRequestID) {
    return ctpJNI.CShfeFtdcRiskUserApi_ReqSubSeqTradingCode(swigCPtr, this, CShfeFtdcRiskNtfSequenceField.getCPtr(pRiskNtfSequence), pRiskNtfSequence, nRequestID);
  }

  public int ReqQryInvestorLinkMan(CShfeFtdcInvestorIDRangeField pInvestorIDRange, int InvestorIDRangeCnt, int nRequestID) {
    return ctpJNI.CShfeFtdcRiskUserApi_ReqQryInvestorLinkMan(swigCPtr, this, CShfeFtdcInvestorIDRangeField.getCPtr(pInvestorIDRange), pInvestorIDRange, InvestorIDRangeCnt, nRequestID);
  }

  public int ReqQryInvestorDepartment(CShfeFtdcInvestorIDRangeField pInvestorIDRange, int InvestorIDRangeCnt, int nRequestID) {
    return ctpJNI.CShfeFtdcRiskUserApi_ReqQryInvestorDepartment(swigCPtr, this, CShfeFtdcInvestorIDRangeField.getCPtr(pInvestorIDRange), pInvestorIDRange, InvestorIDRangeCnt, nRequestID);
  }

  public int ReqSubPreRiskAccount(CShfeFtdcRiskNtfSequenceField pRiskNtfSequence, int nRequestID) {
    return ctpJNI.CShfeFtdcRiskUserApi_ReqSubPreRiskAccount(swigCPtr, this, CShfeFtdcRiskNtfSequenceField.getCPtr(pRiskNtfSequence), pRiskNtfSequence, nRequestID);
  }

  public int ReqSubSeqData(CShfeFtdcRiskNtfSequenceField pRiskNtfSequence, int nRequestID) {
    return ctpJNI.CShfeFtdcRiskUserApi_ReqSubSeqData(swigCPtr, this, CShfeFtdcRiskNtfSequenceField.getCPtr(pRiskNtfSequence), pRiskNtfSequence, nRequestID);
  }

  public int ReqRiskQryBrokerDeposit(CShfeFtdcQueryBrokerDepositField pQueryBrokerDeposit, int nRequestID) {
    return ctpJNI.CShfeFtdcRiskUserApi_ReqRiskQryBrokerDeposit(swigCPtr, this, CShfeFtdcQueryBrokerDepositField.getCPtr(pQueryBrokerDeposit), pQueryBrokerDeposit, nRequestID);
  }

  public int ReqSubSeqRiskNotifyB(CShfeFtdcRiskNtfSequenceField pRiskNtfSequence, int nRequestID) {
    return ctpJNI.CShfeFtdcRiskUserApi_ReqSubSeqRiskNotifyB(swigCPtr, this, CShfeFtdcRiskNtfSequenceField.getCPtr(pRiskNtfSequence), pRiskNtfSequence, nRequestID);
  }

  public int ReqQryPositionStat(CShfeFtdcQryStatField pQryStat, int nRequestID) {
    return ctpJNI.CShfeFtdcRiskUserApi_ReqQryPositionStat(swigCPtr, this, CShfeFtdcQryStatField.getCPtr(pQryStat), pQryStat, nRequestID);
  }

  public int ReqQryTradeStat(CShfeFtdcQryStatField pQryStat, int nRequestID) {
    return ctpJNI.CShfeFtdcRiskUserApi_ReqQryTradeStat(swigCPtr, this, CShfeFtdcQryStatField.getCPtr(pQryStat), pQryStat, nRequestID);
  }

  public int ReqInvestorLinkManHash(CShfeFtdcInvestorIDRangeField pInvestorIDRange, int nRequestID) {
    return ctpJNI.CShfeFtdcRiskUserApi_ReqInvestorLinkManHash(swigCPtr, this, CShfeFtdcInvestorIDRangeField.getCPtr(pInvestorIDRange), pInvestorIDRange, nRequestID);
  }

}
