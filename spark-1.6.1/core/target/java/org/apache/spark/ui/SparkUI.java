package org.apache.spark.ui;
/**
 * Top level user interface for a Spark application.
 */
  class SparkUI extends org.apache.spark.ui.WebUI implements org.apache.spark.Logging, org.apache.spark.status.api.v1.UIRoot {
  static public  int DEFAULT_PORT () { throw new RuntimeException(); }
  static public  java.lang.String STATIC_RESOURCE_DIR () { throw new RuntimeException(); }
  static public  java.lang.String DEFAULT_POOL_NAME () { throw new RuntimeException(); }
  static public  int DEFAULT_RETAINED_STAGES () { throw new RuntimeException(); }
  static public  int DEFAULT_RETAINED_JOBS () { throw new RuntimeException(); }
  static public  int getUIPort (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  static public  org.apache.spark.ui.SparkUI createLiveUI (org.apache.spark.SparkContext sc, org.apache.spark.SparkConf conf, org.apache.spark.scheduler.SparkListenerBus listenerBus, org.apache.spark.ui.jobs.JobProgressListener jobProgressListener, org.apache.spark.SecurityManager securityManager, java.lang.String appName, long startTime) { throw new RuntimeException(); }
  static public  org.apache.spark.ui.SparkUI createHistoryUI (org.apache.spark.SparkConf conf, org.apache.spark.scheduler.SparkListenerBus listenerBus, org.apache.spark.SecurityManager securityManager, java.lang.String appName, java.lang.String basePath, long startTime) { throw new RuntimeException(); }
  /**
   * Create a new Spark UI.
   * <p>
   * @param sc optional SparkContext; this can be None when reconstituting a UI from event logs.
   * @param jobProgressListener if supplied, this JobProgressListener will be used; otherwise, the
   *                            web UI will create and register its own JobProgressListener.
   * @param conf (undocumented)
   * @param listenerBus (undocumented)
   * @param securityManager (undocumented)
   * @param appName (undocumented)
   * @param basePath (undocumented)
   * @param startTime (undocumented)
   * @return (undocumented)
   */
  static private  org.apache.spark.ui.SparkUI create (scala.Option<org.apache.spark.SparkContext> sc, org.apache.spark.SparkConf conf, org.apache.spark.scheduler.SparkListenerBus listenerBus, org.apache.spark.SecurityManager securityManager, java.lang.String appName, java.lang.String basePath, scala.Option<org.apache.spark.ui.jobs.JobProgressListener> jobProgressListener, long startTime) { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.SparkContext> sc () { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf conf () { throw new RuntimeException(); }
  public  org.apache.spark.ui.env.EnvironmentListener environmentListener () { throw new RuntimeException(); }
  public  org.apache.spark.storage.StorageStatusListener storageStatusListener () { throw new RuntimeException(); }
  public  org.apache.spark.ui.exec.ExecutorsListener executorsListener () { throw new RuntimeException(); }
  public  org.apache.spark.ui.jobs.JobProgressListener jobProgressListener () { throw new RuntimeException(); }
  public  org.apache.spark.ui.storage.StorageListener storageListener () { throw new RuntimeException(); }
  public  org.apache.spark.ui.scope.RDDOperationGraphListener operationGraphListener () { throw new RuntimeException(); }
  public  java.lang.String appName () { throw new RuntimeException(); }
  public  java.lang.String basePath () { throw new RuntimeException(); }
  public  long startTime () { throw new RuntimeException(); }
  // not preceding
  private   SparkUI (scala.Option<org.apache.spark.SparkContext> sc, org.apache.spark.SparkConf conf, org.apache.spark.SecurityManager securityManager, org.apache.spark.ui.env.EnvironmentListener environmentListener, org.apache.spark.storage.StorageStatusListener storageStatusListener, org.apache.spark.ui.exec.ExecutorsListener executorsListener, org.apache.spark.ui.jobs.JobProgressListener jobProgressListener, org.apache.spark.ui.storage.StorageListener storageListener, org.apache.spark.ui.scope.RDDOperationGraphListener operationGraphListener, java.lang.String appName, java.lang.String basePath, long startTime) { throw new RuntimeException(); }
  public  boolean killEnabled () { throw new RuntimeException(); }
  public  org.apache.spark.ui.jobs.StagesTab stagesTab () { throw new RuntimeException(); }
  public  java.lang.String appId () { throw new RuntimeException(); }
  /** Initialize all components of the server. */
  public  void initialize () { throw new RuntimeException(); }
  public  java.lang.String getAppName () { throw new RuntimeException(); }
  public  void setAppId (java.lang.String id) { throw new RuntimeException(); }
  /** Stop the server behind this web interface. Only valid after bind(). */
  public  void stop () { throw new RuntimeException(); }
  /**
   * Return the application UI host:port. This does not include the scheme (http://).
   * @return (undocumented)
   */
    java.lang.String appUIHostPort () { throw new RuntimeException(); }
    java.lang.String appUIAddress () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.ui.SparkUI> getSparkUI (java.lang.String appId) { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.status.api.v1.ApplicationInfo> getApplicationInfoList () { throw new RuntimeException(); }
}
