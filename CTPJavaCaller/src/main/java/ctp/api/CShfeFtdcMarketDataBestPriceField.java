/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcMarketDataBestPriceField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcMarketDataBestPriceField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcMarketDataBestPriceField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcMarketDataBestPriceField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBidPrice1(double value) {
    ctpJNI.CShfeFtdcMarketDataBestPriceField_BidPrice1_set(swigCPtr, this, value);
  }

  public double getBidPrice1() {
    return ctpJNI.CShfeFtdcMarketDataBestPriceField_BidPrice1_get(swigCPtr, this);
  }

  public void setBidVolume1(int value) {
    ctpJNI.CShfeFtdcMarketDataBestPriceField_BidVolume1_set(swigCPtr, this, value);
  }

  public int getBidVolume1() {
    return ctpJNI.CShfeFtdcMarketDataBestPriceField_BidVolume1_get(swigCPtr, this);
  }

  public void setAskPrice1(double value) {
    ctpJNI.CShfeFtdcMarketDataBestPriceField_AskPrice1_set(swigCPtr, this, value);
  }

  public double getAskPrice1() {
    return ctpJNI.CShfeFtdcMarketDataBestPriceField_AskPrice1_get(swigCPtr, this);
  }

  public void setAskVolume1(int value) {
    ctpJNI.CShfeFtdcMarketDataBestPriceField_AskVolume1_set(swigCPtr, this, value);
  }

  public int getAskVolume1() {
    return ctpJNI.CShfeFtdcMarketDataBestPriceField_AskVolume1_get(swigCPtr, this);
  }

  public CShfeFtdcMarketDataBestPriceField() {
    this(ctpJNI.new_CShfeFtdcMarketDataBestPriceField(), true);
  }

}
