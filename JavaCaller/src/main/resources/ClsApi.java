/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class ClsApi {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ClsApi(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ClsApi obj) {
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

  public static ClsApi create() {
    long cPtr = javacallJNI.ClsApi_create();
    return (cPtr == 0) ? null : new ClsApi(cPtr, false);
  }

  public static void destroy(ClsApi api) {
    javacallJNI.ClsApi_destroy(ClsApi.getCPtr(api), api);
  }

  public void init() {
    javacallJNI.ClsApi_init(swigCPtr, this);
  }

  public void registerSpi(ClsSpi spi) {
    javacallJNI.ClsApi_registerSpi(swigCPtr, this, ClsSpi.getCPtr(spi), spi);
  }

  public int reqLogin(int loginId) {
    return javacallJNI.ClsApi_reqLogin(swigCPtr, this, loginId);
  }

}
