/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class ClsSpi {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ClsSpi(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ClsSpi obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        javacallJNI.delete_ClsSpi(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void onLogin(int loginId) {
    javacallJNI.ClsSpi_onLogin(swigCPtr, this, loginId);
  }

  public ClsSpi() {
    this(javacallJNI.new_ClsSpi(), true);
  }

}
