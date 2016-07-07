package org.apache.spark;
// no position
  class Accumulators implements org.apache.spark.Logging {
  /**
   * This global map holds the original accumulator objects that are created on the driver.
   * It keeps weak references to these objects so that accumulators can be garbage-collected
   * once the RDDs and user-code that reference them are cleaned up.
   * @return (undocumented)
   */
  static public  scala.collection.mutable.Map<java.lang.Object, scala.ref.WeakReference<org.apache.spark.Accumulable<?, ?>>> originals () { throw new RuntimeException(); }
  static private  long lastId () { throw new RuntimeException(); }
  static public  long newId () { throw new RuntimeException(); }
  static public  void register (org.apache.spark.Accumulable<?, ?> a) { throw new RuntimeException(); }
  static public  void remove (long accId) { throw new RuntimeException(); }
  static public  void add (scala.collection.Map<java.lang.Object, java.lang.Object> values) { throw new RuntimeException(); }
}
