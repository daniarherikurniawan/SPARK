package org.apache.spark.deploy.master.ui;
/**
 * Web UI server for the standalone master.
 */
  class MasterWebUI extends org.apache.spark.ui.WebUI implements org.apache.spark.Logging, org.apache.spark.status.api.v1.UIRoot {
  static private  java.lang.String STATIC_RESOURCE_DIR () { throw new RuntimeException(); }
  public  org.apache.spark.deploy.master.Master master () { throw new RuntimeException(); }
  // not preceding
  public   MasterWebUI (org.apache.spark.deploy.master.Master master, int requestedPort, scala.Option<org.apache.spark.deploy.master.ui.MasterPage> customMasterPage) { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEndpointRef masterEndpointRef () { throw new RuntimeException(); }
  public  boolean killEnabled () { throw new RuntimeException(); }
  public  org.apache.spark.deploy.master.ui.MasterPage masterPage () { throw new RuntimeException(); }
  /** Initialize all components of the server. */
  public  void initialize () { throw new RuntimeException(); }
  /** Attach a reconstructed UI to this Master UI. Only valid after bind(). */
  public  void attachSparkUI (org.apache.spark.ui.SparkUI ui) { throw new RuntimeException(); }
  /** Detach a reconstructed UI from this Master UI. Only valid after bind(). */
  public  void detachSparkUI (org.apache.spark.ui.SparkUI ui) { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.status.api.v1.ApplicationInfo> getApplicationInfoList () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.ui.SparkUI> getSparkUI (java.lang.String appId) { throw new RuntimeException(); }
}
