package org.apache.spark;
// no position
public  class SparkEnv$ implements org.apache.spark.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SparkEnv$ MODULE$ = null;
  public   SparkEnv$ () { throw new RuntimeException(); }
  private  org.apache.spark.SparkEnv env () { throw new RuntimeException(); }
  public  java.lang.String driverActorSystemName () { throw new RuntimeException(); }
  public  java.lang.String executorActorSystemName () { throw new RuntimeException(); }
  public  void set (org.apache.spark.SparkEnv e) { throw new RuntimeException(); }
  /**
   * Returns the SparkEnv.
   * @return (undocumented)
   */
  public  org.apache.spark.SparkEnv get () { throw new RuntimeException(); }
  /**
   * Returns the ThreadLocal SparkEnv.
   * @return (undocumented)
   */
  public  org.apache.spark.SparkEnv getThreadLocal () { throw new RuntimeException(); }
  /**
   * Create a SparkEnv for the driver.
   * @param conf (undocumented)
   * @param isLocal (undocumented)
   * @param listenerBus (undocumented)
   * @param numCores (undocumented)
   * @param mockOutputCommitCoordinator (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.SparkEnv createDriverEnv (org.apache.spark.SparkConf conf, boolean isLocal, org.apache.spark.scheduler.LiveListenerBus listenerBus, int numCores, scala.Option<org.apache.spark.scheduler.OutputCommitCoordinator> mockOutputCommitCoordinator) { throw new RuntimeException(); }
  /**
   * Create a SparkEnv for an executor.
   * In coarse-grained mode, the executor provides an actor system that is already instantiated.
   * @param conf (undocumented)
   * @param executorId (undocumented)
   * @param hostname (undocumented)
   * @param port (undocumented)
   * @param numCores (undocumented)
   * @param isLocal (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.SparkEnv createExecutorEnv (org.apache.spark.SparkConf conf, java.lang.String executorId, java.lang.String hostname, int port, int numCores, boolean isLocal) { throw new RuntimeException(); }
  /**
   * Helper method to create a SparkEnv for a driver or an executor.
   * @param conf (undocumented)
   * @param executorId (undocumented)
   * @param hostname (undocumented)
   * @param port (undocumented)
   * @param isDriver (undocumented)
   * @param isLocal (undocumented)
   * @param numUsableCores (undocumented)
   * @param listenerBus (undocumented)
   * @param mockOutputCommitCoordinator (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.SparkEnv create (org.apache.spark.SparkConf conf, java.lang.String executorId, java.lang.String hostname, int port, boolean isDriver, boolean isLocal, int numUsableCores, org.apache.spark.scheduler.LiveListenerBus listenerBus, scala.Option<org.apache.spark.scheduler.OutputCommitCoordinator> mockOutputCommitCoordinator) { throw new RuntimeException(); }
  /**
   * Return a map representation of jvm information, Spark properties, system properties, and
   * class paths. Map keys define the category, and map values represent the corresponding
   * attributes as a sequence of KV pairs. This is used mainly for SparkListenerEnvironmentUpdate.
   * @param conf (undocumented)
   * @param schedulingMode (undocumented)
   * @param addedJars (undocumented)
   * @param addedFiles (undocumented)
   * @return (undocumented)
   */
    scala.collection.immutable.Map<java.lang.String, scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>>> environmentDetails (org.apache.spark.SparkConf conf, java.lang.String schedulingMode, scala.collection.Seq<java.lang.String> addedJars, scala.collection.Seq<java.lang.String> addedFiles) { throw new RuntimeException(); }
}
