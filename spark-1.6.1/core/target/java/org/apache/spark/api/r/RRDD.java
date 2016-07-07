package org.apache.spark.api.r;
/**
 * An RDD that stores serialized R objects as Array[Byte].
 */
public  class RRDD<T extends java.lang.Object> extends org.apache.spark.api.r.BaseRRDD<T, byte[]> {
  static public  org.apache.spark.api.java.JavaSparkContext createSparkContext (java.lang.String master, java.lang.String appName, java.lang.String sparkHome, java.lang.String[] jars, java.util.Map<java.lang.Object, java.lang.Object> sparkEnvirMap, java.util.Map<java.lang.Object, java.lang.Object> sparkExecutorEnvMap) { throw new RuntimeException(); }
  /**
   * Start a thread to print the process's stderr to ours
   * @param proc (undocumented)
   * @return (undocumented)
   */
  static private  org.apache.spark.api.r.BufferedStreamThread startStdoutThread (java.lang.Process proc) { throw new RuntimeException(); }
  static private  org.apache.spark.api.r.BufferedStreamThread createRProcess (int port, java.lang.String script) { throw new RuntimeException(); }
  /**
   * ProcessBuilder used to launch worker R processes.
   * @param port (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.api.r.BufferedStreamThread createRWorker (int port) { throw new RuntimeException(); }
  /**
   * Create an RRDD given a sequence of byte arrays. Used to create RRDD when <code>parallelize</code> is
   * called from R.
   * @param jsc (undocumented)
   * @param arr (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.api.java.JavaRDD<byte[]> createRDDFromArray (org.apache.spark.api.java.JavaSparkContext jsc, byte[][] arr) { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  public   RRDD (org.apache.spark.rdd.RDD<T> parent, byte[] func, java.lang.String deserializer, java.lang.String serializer, byte[] packageNames, java.lang.Object[] broadcastVars, scala.reflect.ClassTag<T> evidence$4) { throw new RuntimeException(); }
  protected  byte[] readData (int length) { throw new RuntimeException(); }
  public  org.apache.spark.api.java.JavaRDD<byte[]> asJavaRDD () { throw new RuntimeException(); }
}
