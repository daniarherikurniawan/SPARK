package org.apache.spark.api.r;
// no position
/**
 * Helper singleton that tracks JVM objects returned to R.
 * This is useful for referencing these objects in RPC calls.
 */
  class JVMObjectTracker$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final JVMObjectTracker$ MODULE$ = null;
  public   JVMObjectTracker$ () { throw new RuntimeException(); }
  public  java.lang.Object getObject (java.lang.String id) { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> get (java.lang.String id) { throw new RuntimeException(); }
  public  java.lang.String put (java.lang.Object obj) { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> remove (java.lang.String id) { throw new RuntimeException(); }
}
