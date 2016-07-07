package org.apache.spark.scheduler.cluster.mesos;
/**
 * Zookeeper based Mesos cluster persistence engine, that stores cluster mode state
 * into Zookeeper. Each engine object is operating under one folder in Zookeeper, but
 * reuses a shared Zookeeper client.
 */
  class ZookeeperMesosClusterPersistenceEngine implements org.apache.spark.scheduler.cluster.mesos.MesosClusterPersistenceEngine, org.apache.spark.Logging {
  public   ZookeeperMesosClusterPersistenceEngine (java.lang.String baseDir, org.apache.curator.framework.CuratorFramework zk, org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  private  java.lang.String WORKING_DIR () { throw new RuntimeException(); }
  public  java.lang.String path (java.lang.String name) { throw new RuntimeException(); }
  public  void expunge (java.lang.String name) { throw new RuntimeException(); }
  public  void persist (java.lang.String name, java.lang.Object obj) { throw new RuntimeException(); }
  public <T extends java.lang.Object> scala.Option<T> fetch (java.lang.String name) { throw new RuntimeException(); }
  public <T extends java.lang.Object> scala.collection.Iterable<T> fetchAll () { throw new RuntimeException(); }
}
