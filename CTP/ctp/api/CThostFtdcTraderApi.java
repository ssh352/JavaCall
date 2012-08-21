/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CThostFtdcTraderApi {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CThostFtdcTraderApi(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CThostFtdcTraderApi obj) {
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

  public static CThostFtdcTraderApi CreateFtdcTraderApi(String pszFlowPath, boolean bIsUsingUdp) {
    long cPtr = ctpJNI.CThostFtdcTraderApi_CreateFtdcTraderApi__SWIG_0(pszFlowPath, bIsUsingUdp);
    return (cPtr == 0) ? null : new CThostFtdcTraderApi(cPtr, false);
  }

  public static CThostFtdcTraderApi CreateFtdcTraderApi(String pszFlowPath) {
    long cPtr = ctpJNI.CThostFtdcTraderApi_CreateFtdcTraderApi__SWIG_1(pszFlowPath);
    return (cPtr == 0) ? null : new CThostFtdcTraderApi(cPtr, false);
  }

  public static CThostFtdcTraderApi CreateFtdcTraderApi() {
    long cPtr = ctpJNI.CThostFtdcTraderApi_CreateFtdcTraderApi__SWIG_2();
    return (cPtr == 0) ? null : new CThostFtdcTraderApi(cPtr, false);
  }

  public void Release() {
    ctpJNI.CThostFtdcTraderApi_Release(swigCPtr, this);
  }

  public void Init() {
    ctpJNI.CThostFtdcTraderApi_Init(swigCPtr, this);
  }

  public int Join() {
    return ctpJNI.CThostFtdcTraderApi_Join(swigCPtr, this);
  }

  public String GetTradingDay() {
    return ctpJNI.CThostFtdcTraderApi_GetTradingDay(swigCPtr, this);
  }

  public void RegisterFront(String pszFrontAddress) {
    ctpJNI.CThostFtdcTraderApi_RegisterFront(swigCPtr, this, pszFrontAddress);
  }

  public void RegisterSpi(CThostFtdcTraderSpi pSpi) {
    ctpJNI.CThostFtdcTraderApi_RegisterSpi(swigCPtr, this, CThostFtdcTraderSpi.getCPtr(pSpi), pSpi);
  }

  public void SubscribePrivateTopic(THOST_TE_RESUME_TYPE nResumeType) {
    ctpJNI.CThostFtdcTraderApi_SubscribePrivateTopic(swigCPtr, this, nResumeType.swigValue());
  }

  public void SubscribePublicTopic(THOST_TE_RESUME_TYPE nResumeType) {
    ctpJNI.CThostFtdcTraderApi_SubscribePublicTopic(swigCPtr, this, nResumeType.swigValue());
  }

  public int ReqAuthenticate(CThostFtdcReqAuthenticateField pReqAuthenticateField, int nRequestID) {
    return ctpJNI.CThostFtdcTraderApi_ReqAuthenticate(swigCPtr, this, CThostFtdcReqAuthenticateField.getCPtr(pReqAuthenticateField), pReqAuthenticateField, nRequestID);
  }

  public int ReqUserLogin(CThostFtdcReqUserLoginField pReqUserLoginField, int nRequestID) {
    return ctpJNI.CThostFtdcTraderApi_ReqUserLogin(swigCPtr, this, CThostFtdcReqUserLoginField.getCPtr(pReqUserLoginField), pReqUserLoginField, nRequestID);
  }

  public int ReqUserLogout(CThostFtdcUserLogoutField pUserLogout, int nRequestID) {
    return ctpJNI.CThostFtdcTraderApi_ReqUserLogout(swigCPtr, this, CThostFtdcUserLogoutField.getCPtr(pUserLogout), pUserLogout, nRequestID);
  }

  public int ReqUserPasswordUpdate(CThostFtdcUserPasswordUpdateField pUserPasswordUpdate, int nRequestID) {
    return ctpJNI.CThostFtdcTraderApi_ReqUserPasswordUpdate(swigCPtr, this, CThostFtdcUserPasswordUpdateField.getCPtr(pUserPasswordUpdate), pUserPasswordUpdate, nRequestID);
  }

  public int ReqTradingAccountPasswordUpdate(CThostFtdcTradingAccountPasswordUpdateField pTradingAccountPasswordUpdate, int nRequestID) {
    return ctpJNI.CThostFtdcTraderApi_ReqTradingAccountPasswordUpdate(swigCPtr, this, CThostFtdcTradingAccountPasswordUpdateField.getCPtr(pTradingAccountPasswordUpdate), pTradingAccountPasswordUpdate, nRequestID);
  }

  public int ReqOrderInsert(CThostFtdcInputOrderField pInputOrder, int nRequestID) {
    return ctpJNI.CThostFtdcTraderApi_ReqOrderInsert(swigCPtr, this, CThostFtdcInputOrderField.getCPtr(pInputOrder), pInputOrder, nRequestID);
  }

  public int ReqParkedOrderInsert(CThostFtdcParkedOrderField pParkedOrder, int nRequestID) {
    return ctpJNI.CThostFtdcTraderApi_ReqParkedOrderInsert(swigCPtr, this, CThostFtdcParkedOrderField.getCPtr(pParkedOrder), pParkedOrder, nRequestID);
  }

  public int ReqParkedOrderAction(CThostFtdcParkedOrderActionField pParkedOrderAction, int nRequestID) {
    return ctpJNI.CThostFtdcTraderApi_ReqParkedOrderAction(swigCPtr, this, CThostFtdcParkedOrderActionField.getCPtr(pParkedOrderAction), pParkedOrderAction, nRequestID);
  }

  public int ReqOrderAction(CThostFtdcInputOrderActionField pInputOrderAction, int nRequestID) {
    return ctpJNI.CThostFtdcTraderApi_ReqOrderAction(swigCPtr, this, CThostFtdcInputOrderActionField.getCPtr(pInputOrderAction), pInputOrderAction, nRequestID);
  }

  public int ReqQueryMaxOrderVolume(CThostFtdcQueryMaxOrderVolumeField pQueryMaxOrderVolume, int nRequestID) {
    return ctpJNI.CThostFtdcTraderApi_ReqQueryMaxOrderVolume(swigCPtr, this, CThostFtdcQueryMaxOrderVolumeField.getCPtr(pQueryMaxOrderVolume), pQueryMaxOrderVolume, nRequestID);
  }

  public int ReqSettlementInfoConfirm(CThostFtdcSettlementInfoConfirmField pSettlementInfoConfirm, int nRequestID) {
    return ctpJNI.CThostFtdcTraderApi_ReqSettlementInfoConfirm(swigCPtr, this, CThostFtdcSettlementInfoConfirmField.getCPtr(pSettlementInfoConfirm), pSettlementInfoConfirm, nRequestID);
  }

  public int ReqRemoveParkedOrder(CThostFtdcRemoveParkedOrderField pRemoveParkedOrder, int nRequestID) {
    return ctpJNI.CThostFtdcTraderApi_ReqRemoveParkedOrder(swigCPtr, this, CThostFtdcRemoveParkedOrderField.getCPtr(pRemoveParkedOrder), pRemoveParkedOrder, nRequestID);
  }

  public int ReqRemoveParkedOrderAction(CThostFtdcRemoveParkedOrderActionField pRemoveParkedOrderAction, int nRequestID) {
    return ctpJNI.CThostFtdcTraderApi_ReqRemoveParkedOrderAction(swigCPtr, this, CThostFtdcRemoveParkedOrderActionField.getCPtr(pRemoveParkedOrderAction), pRemoveParkedOrderAction, nRequestID);
  }

  public int ReqQryOrder(CThostFtdcQryOrderField pQryOrder, int nRequestID) {
    return ctpJNI.CThostFtdcTraderApi_ReqQryOrder(swigCPtr, this, CThostFtdcQryOrderField.getCPtr(pQryOrder), pQryOrder, nRequestID);
  }

  public int ReqQryTrade(CThostFtdcQryTradeField pQryTrade, int nRequestID) {
    return ctpJNI.CThostFtdcTraderApi_ReqQryTrade(swigCPtr, this, CThostFtdcQryTradeField.getCPtr(pQryTrade), pQryTrade, nRequestID);
  }

  public int ReqQryInvestorPosition(CThostFtdcQryInvestorPositionField pQryInvestorPosition, int nRequestID) {
    return ctpJNI.CThostFtdcTraderApi_ReqQryInvestorPosition(swigCPtr, this, CThostFtdcQryInvestorPositionField.getCPtr(pQryInvestorPosition), pQryInvestorPosition, nRequestID);
  }

  public int ReqQryTradingAccount(CThostFtdcQryTradingAccountField pQryTradingAccount, int nRequestID) {
    return ctpJNI.CThostFtdcTraderApi_ReqQryTradingAccount(swigCPtr, this, CThostFtdcQryTradingAccountField.getCPtr(pQryTradingAccount), pQryTradingAccount, nRequestID);
  }

  public int ReqQryInvestor(CThostFtdcQryInvestorField pQryInvestor, int nRequestID) {
    return ctpJNI.CThostFtdcTraderApi_ReqQryInvestor(swigCPtr, this, CThostFtdcQryInvestorField.getCPtr(pQryInvestor), pQryInvestor, nRequestID);
  }

  public int ReqQryTradingCode(CThostFtdcQryTradingCodeField pQryTradingCode, int nRequestID) {
    return ctpJNI.CThostFtdcTraderApi_ReqQryTradingCode(swigCPtr, this, CThostFtdcQryTradingCodeField.getCPtr(pQryTradingCode), pQryTradingCode, nRequestID);
  }

  public int ReqQryInstrumentMarginRate(CThostFtdcQryInstrumentMarginRateField pQryInstrumentMarginRate, int nRequestID) {
    return ctpJNI.CThostFtdcTraderApi_ReqQryInstrumentMarginRate(swigCPtr, this, CThostFtdcQryInstrumentMarginRateField.getCPtr(pQryInstrumentMarginRate), pQryInstrumentMarginRate, nRequestID);
  }

  public int ReqQryInstrumentCommissionRate(CThostFtdcQryInstrumentCommissionRateField pQryInstrumentCommissionRate, int nRequestID) {
    return ctpJNI.CThostFtdcTraderApi_ReqQryInstrumentCommissionRate(swigCPtr, this, CThostFtdcQryInstrumentCommissionRateField.getCPtr(pQryInstrumentCommissionRate), pQryInstrumentCommissionRate, nRequestID);
  }

  public int ReqQryExchange(CThostFtdcQryExchangeField pQryExchange, int nRequestID) {
    return ctpJNI.CThostFtdcTraderApi_ReqQryExchange(swigCPtr, this, CThostFtdcQryExchangeField.getCPtr(pQryExchange), pQryExchange, nRequestID);
  }

  public int ReqQryInstrument(CThostFtdcQryInstrumentField pQryInstrument, int nRequestID) {
    return ctpJNI.CThostFtdcTraderApi_ReqQryInstrument(swigCPtr, this, CThostFtdcQryInstrumentField.getCPtr(pQryInstrument), pQryInstrument, nRequestID);
  }

  public int ReqQryDepthMarketData(CThostFtdcQryDepthMarketDataField pQryDepthMarketData, int nRequestID) {
    return ctpJNI.CThostFtdcTraderApi_ReqQryDepthMarketData(swigCPtr, this, CThostFtdcQryDepthMarketDataField.getCPtr(pQryDepthMarketData), pQryDepthMarketData, nRequestID);
  }

  public int ReqQrySettlementInfo(CThostFtdcQrySettlementInfoField pQrySettlementInfo, int nRequestID) {
    return ctpJNI.CThostFtdcTraderApi_ReqQrySettlementInfo(swigCPtr, this, CThostFtdcQrySettlementInfoField.getCPtr(pQrySettlementInfo), pQrySettlementInfo, nRequestID);
  }

  public int ReqQryTransferBank(CThostFtdcQryTransferBankField pQryTransferBank, int nRequestID) {
    return ctpJNI.CThostFtdcTraderApi_ReqQryTransferBank(swigCPtr, this, CThostFtdcQryTransferBankField.getCPtr(pQryTransferBank), pQryTransferBank, nRequestID);
  }

  public int ReqQryInvestorPositionDetail(CThostFtdcQryInvestorPositionDetailField pQryInvestorPositionDetail, int nRequestID) {
    return ctpJNI.CThostFtdcTraderApi_ReqQryInvestorPositionDetail(swigCPtr, this, CThostFtdcQryInvestorPositionDetailField.getCPtr(pQryInvestorPositionDetail), pQryInvestorPositionDetail, nRequestID);
  }

  public int ReqQryNotice(CThostFtdcQryNoticeField pQryNotice, int nRequestID) {
    return ctpJNI.CThostFtdcTraderApi_ReqQryNotice(swigCPtr, this, CThostFtdcQryNoticeField.getCPtr(pQryNotice), pQryNotice, nRequestID);
  }

  public int ReqQrySettlementInfoConfirm(CThostFtdcQrySettlementInfoConfirmField pQrySettlementInfoConfirm, int nRequestID) {
    return ctpJNI.CThostFtdcTraderApi_ReqQrySettlementInfoConfirm(swigCPtr, this, CThostFtdcQrySettlementInfoConfirmField.getCPtr(pQrySettlementInfoConfirm), pQrySettlementInfoConfirm, nRequestID);
  }

  public int ReqQryInvestorPositionCombineDetail(CThostFtdcQryInvestorPositionCombineDetailField pQryInvestorPositionCombineDetail, int nRequestID) {
    return ctpJNI.CThostFtdcTraderApi_ReqQryInvestorPositionCombineDetail(swigCPtr, this, CThostFtdcQryInvestorPositionCombineDetailField.getCPtr(pQryInvestorPositionCombineDetail), pQryInvestorPositionCombineDetail, nRequestID);
  }

  public int ReqQryCFMMCTradingAccountKey(CThostFtdcQryCFMMCTradingAccountKeyField pQryCFMMCTradingAccountKey, int nRequestID) {
    return ctpJNI.CThostFtdcTraderApi_ReqQryCFMMCTradingAccountKey(swigCPtr, this, CThostFtdcQryCFMMCTradingAccountKeyField.getCPtr(pQryCFMMCTradingAccountKey), pQryCFMMCTradingAccountKey, nRequestID);
  }

  public int ReqQryEWarrantOffset(CThostFtdcQryEWarrantOffsetField pQryEWarrantOffset, int nRequestID) {
    return ctpJNI.CThostFtdcTraderApi_ReqQryEWarrantOffset(swigCPtr, this, CThostFtdcQryEWarrantOffsetField.getCPtr(pQryEWarrantOffset), pQryEWarrantOffset, nRequestID);
  }

  public int ReqQryTransferSerial(CThostFtdcQryTransferSerialField pQryTransferSerial, int nRequestID) {
    return ctpJNI.CThostFtdcTraderApi_ReqQryTransferSerial(swigCPtr, this, CThostFtdcQryTransferSerialField.getCPtr(pQryTransferSerial), pQryTransferSerial, nRequestID);
  }

  public int ReqQryAccountregister(CThostFtdcQryAccountregisterField pQryAccountregister, int nRequestID) {
    return ctpJNI.CThostFtdcTraderApi_ReqQryAccountregister(swigCPtr, this, CThostFtdcQryAccountregisterField.getCPtr(pQryAccountregister), pQryAccountregister, nRequestID);
  }

  public int ReqQryContractBank(CThostFtdcQryContractBankField pQryContractBank, int nRequestID) {
    return ctpJNI.CThostFtdcTraderApi_ReqQryContractBank(swigCPtr, this, CThostFtdcQryContractBankField.getCPtr(pQryContractBank), pQryContractBank, nRequestID);
  }

  public int ReqQryParkedOrder(CThostFtdcQryParkedOrderField pQryParkedOrder, int nRequestID) {
    return ctpJNI.CThostFtdcTraderApi_ReqQryParkedOrder(swigCPtr, this, CThostFtdcQryParkedOrderField.getCPtr(pQryParkedOrder), pQryParkedOrder, nRequestID);
  }

  public int ReqQryParkedOrderAction(CThostFtdcQryParkedOrderActionField pQryParkedOrderAction, int nRequestID) {
    return ctpJNI.CThostFtdcTraderApi_ReqQryParkedOrderAction(swigCPtr, this, CThostFtdcQryParkedOrderActionField.getCPtr(pQryParkedOrderAction), pQryParkedOrderAction, nRequestID);
  }

  public int ReqQryTradingNotice(CThostFtdcQryTradingNoticeField pQryTradingNotice, int nRequestID) {
    return ctpJNI.CThostFtdcTraderApi_ReqQryTradingNotice(swigCPtr, this, CThostFtdcQryTradingNoticeField.getCPtr(pQryTradingNotice), pQryTradingNotice, nRequestID);
  }

  public int ReqQryBrokerTradingParams(CThostFtdcQryBrokerTradingParamsField pQryBrokerTradingParams, int nRequestID) {
    return ctpJNI.CThostFtdcTraderApi_ReqQryBrokerTradingParams(swigCPtr, this, CThostFtdcQryBrokerTradingParamsField.getCPtr(pQryBrokerTradingParams), pQryBrokerTradingParams, nRequestID);
  }

  public int ReqQryBrokerTradingAlgos(CThostFtdcQryBrokerTradingAlgosField pQryBrokerTradingAlgos, int nRequestID) {
    return ctpJNI.CThostFtdcTraderApi_ReqQryBrokerTradingAlgos(swigCPtr, this, CThostFtdcQryBrokerTradingAlgosField.getCPtr(pQryBrokerTradingAlgos), pQryBrokerTradingAlgos, nRequestID);
  }

  public int ReqFromBankToFutureByFuture(CThostFtdcReqTransferField pReqTransfer, int nRequestID) {
    return ctpJNI.CThostFtdcTraderApi_ReqFromBankToFutureByFuture(swigCPtr, this, CThostFtdcReqTransferField.getCPtr(pReqTransfer), pReqTransfer, nRequestID);
  }

  public int ReqFromFutureToBankByFuture(CThostFtdcReqTransferField pReqTransfer, int nRequestID) {
    return ctpJNI.CThostFtdcTraderApi_ReqFromFutureToBankByFuture(swigCPtr, this, CThostFtdcReqTransferField.getCPtr(pReqTransfer), pReqTransfer, nRequestID);
  }

  public int ReqQueryBankAccountMoneyByFuture(CThostFtdcReqQueryAccountField pReqQueryAccount, int nRequestID) {
    return ctpJNI.CThostFtdcTraderApi_ReqQueryBankAccountMoneyByFuture(swigCPtr, this, CThostFtdcReqQueryAccountField.getCPtr(pReqQueryAccount), pReqQueryAccount, nRequestID);
  }

}
