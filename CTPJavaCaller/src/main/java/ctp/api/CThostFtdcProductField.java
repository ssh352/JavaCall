/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CThostFtdcProductField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CThostFtdcProductField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CThostFtdcProductField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcProductField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setProductID(String value) {
    ctpJNI.CThostFtdcProductField_ProductID_set(swigCPtr, this, value);
  }

  public String getProductID() {
    return ctpJNI.CThostFtdcProductField_ProductID_get(swigCPtr, this);
  }

  public void setProductName(String value) {
    ctpJNI.CThostFtdcProductField_ProductName_set(swigCPtr, this, value);
  }

  public String getProductName() {
    return ctpJNI.CThostFtdcProductField_ProductName_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpJNI.CThostFtdcProductField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpJNI.CThostFtdcProductField_ExchangeID_get(swigCPtr, this);
  }

  public void setProductClass(char value) {
    ctpJNI.CThostFtdcProductField_ProductClass_set(swigCPtr, this, value);
  }

  public char getProductClass() {
    return ctpJNI.CThostFtdcProductField_ProductClass_get(swigCPtr, this);
  }

  public void setVolumeMultiple(int value) {
    ctpJNI.CThostFtdcProductField_VolumeMultiple_set(swigCPtr, this, value);
  }

  public int getVolumeMultiple() {
    return ctpJNI.CThostFtdcProductField_VolumeMultiple_get(swigCPtr, this);
  }

  public void setPriceTick(double value) {
    ctpJNI.CThostFtdcProductField_PriceTick_set(swigCPtr, this, value);
  }

  public double getPriceTick() {
    return ctpJNI.CThostFtdcProductField_PriceTick_get(swigCPtr, this);
  }

  public void setMaxMarketOrderVolume(int value) {
    ctpJNI.CThostFtdcProductField_MaxMarketOrderVolume_set(swigCPtr, this, value);
  }

  public int getMaxMarketOrderVolume() {
    return ctpJNI.CThostFtdcProductField_MaxMarketOrderVolume_get(swigCPtr, this);
  }

  public void setMinMarketOrderVolume(int value) {
    ctpJNI.CThostFtdcProductField_MinMarketOrderVolume_set(swigCPtr, this, value);
  }

  public int getMinMarketOrderVolume() {
    return ctpJNI.CThostFtdcProductField_MinMarketOrderVolume_get(swigCPtr, this);
  }

  public void setMaxLimitOrderVolume(int value) {
    ctpJNI.CThostFtdcProductField_MaxLimitOrderVolume_set(swigCPtr, this, value);
  }

  public int getMaxLimitOrderVolume() {
    return ctpJNI.CThostFtdcProductField_MaxLimitOrderVolume_get(swigCPtr, this);
  }

  public void setMinLimitOrderVolume(int value) {
    ctpJNI.CThostFtdcProductField_MinLimitOrderVolume_set(swigCPtr, this, value);
  }

  public int getMinLimitOrderVolume() {
    return ctpJNI.CThostFtdcProductField_MinLimitOrderVolume_get(swigCPtr, this);
  }

  public void setPositionType(char value) {
    ctpJNI.CThostFtdcProductField_PositionType_set(swigCPtr, this, value);
  }

  public char getPositionType() {
    return ctpJNI.CThostFtdcProductField_PositionType_get(swigCPtr, this);
  }

  public void setPositionDateType(char value) {
    ctpJNI.CThostFtdcProductField_PositionDateType_set(swigCPtr, this, value);
  }

  public char getPositionDateType() {
    return ctpJNI.CThostFtdcProductField_PositionDateType_get(swigCPtr, this);
  }

  public CThostFtdcProductField() {
    this(ctpJNI.new_CThostFtdcProductField(), true);
  }

}
