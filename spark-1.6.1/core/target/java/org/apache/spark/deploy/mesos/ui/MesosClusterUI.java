package org.apache.spark.deploy.mesos.ui;
/**
 * UI that displays driver results from the {@link org.apache.spark.deploy.mesos.MesosClusterDispatcher}
 */
  class MesosClusterUI extends org.apache.spark.ui.WebUI {
  static public  java.lang.String STATIC_RESOURCE_DIR () { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.cluster.mesos.MesosClusterScheduler scheduler () { throw new RuntimeException(); }
  // not preceding
  public   MesosClusterUI (org.apache.spark.SecurityManager securityManager, int port, org.apache.spark.SparkConf conf, java.lang.String dispatcherPublicAddress, org.apache.spark.scheduler.cluster.mesos.MesosClusterScheduler scheduler) { throw new RuntimeException(); }
  public  java.lang.String activeWebUiUrl () { throw new RuntimeException(); }
  public  void initialize () { throw new RuntimeException(); }
}
