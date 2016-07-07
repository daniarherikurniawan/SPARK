package org.apache.spark.deploy.mesos;
/**
 * A wrapper of {@link ExternalShuffleService} that provides an additional endpoint for drivers
 * to associate with. This allows the shuffle service to detect when a driver is terminated
 * and can clean up the associated shuffle files.
 */
  class MesosExternalShuffleService extends org.apache.spark.deploy.ExternalShuffleService {
  static public  void main (java.lang.String[] args) { throw new RuntimeException(); }
  public   MesosExternalShuffleService (org.apache.spark.SparkConf conf, org.apache.spark.SecurityManager securityManager) { throw new RuntimeException(); }
  protected  org.apache.spark.network.shuffle.ExternalShuffleBlockHandler newShuffleBlockHandler (org.apache.spark.network.util.TransportConf conf) { throw new RuntimeException(); }
}
