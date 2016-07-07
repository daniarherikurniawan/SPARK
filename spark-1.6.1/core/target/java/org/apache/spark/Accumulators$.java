package org.apache.spark;
// no position
  class Accumulators$ implements org.apache.spark.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Accumulators$ MODULE$ = null;
  public   Accumulators$ () { throw new RuntimeException(); }
  /**
   * This global map holds the original accumulator objects that are created on the driver.
   * It keeps weak references to these objects so that accumulators can be garbage-collected
   * once the RDDs and user-code that reference them are cleaned up.
   * @return (undocumented)
   */
  public  scala.collection.mutable.Map<java.lang.Object, scala.ref.WeakReference<org.apache.spark.Accumulable<?, ?>>> originals () { throw new RuntimeException(); }
  private  long lastId () { throw new RuntimeException(); }
  public  long newId () { throw new RuntimeException(); }
  public  void register (org.apache.spark.Accumulable<?, ?> a) { throw new RuntimeException(); }
  public  void remove (long accId) { throw new RuntimeException(); }
  public  void add (scala.collection.Map<java.lang.Object, java.lang.Object> values) { throw new RuntimeException(); }
}
