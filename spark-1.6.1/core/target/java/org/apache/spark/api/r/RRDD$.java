package org.apache.spark.api.r;
// no position
  class RRDD$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RRDD$ MODULE$ = null;
  public   RRDD$ () { throw new RuntimeException(); }
  public  org.apache.spark.api.java.JavaSparkContext createSparkContext (java.lang.String master, java.lang.String appName, java.lang.String sparkHome, java.lang.String[] jars, java.util.Map<java.lang.Object, java.lang.Object> sparkEnvirMap, java.util.Map<java.lang.Object, java.lang.Object> sparkExecutorEnvMap) { throw new RuntimeException(); }
  /**
   * Start a thread to print the process's stderr to ours
   * @param proc (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.api.r.BufferedStreamThread startStdoutThread (java.lang.Process proc) { throw new RuntimeException(); }
  private  org.apache.spark.api.r.BufferedStreamThread createRProcess (int port, java.lang.String script) { throw new RuntimeException(); }
  /**
   * ProcessBuilder used to launch worker R processes.
   * @param port (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.r.BufferedStreamThread createRWorker (int port) { throw new RuntimeException(); }
  /**
   * Create an RRDD given a sequence of byte arrays. Used to create RRDD when <code>parallelize</code> is
   * called from R.
   * @param jsc (undocumented)
   * @param arr (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<byte[]> createRDDFromArray (org.apache.spark.api.java.JavaSparkContext jsc, byte[][] arr) { throw new RuntimeException(); }
}
