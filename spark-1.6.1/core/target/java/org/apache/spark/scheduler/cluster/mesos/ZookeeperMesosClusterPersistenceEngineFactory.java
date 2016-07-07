package org.apache.spark.scheduler.cluster.mesos;
/**
 * Zookeeper backed persistence engine factory.
 * All Zk engines created from this factory shares the same Zookeeper client, so
 * all of them reuses the same connection pool.
 */
  class ZookeeperMesosClusterPersistenceEngineFactory extends org.apache.spark.scheduler.cluster.mesos.MesosClusterPersistenceEngineFactory {
  public   ZookeeperMesosClusterPersistenceEngineFactory (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  public  org.apache.curator.framework.CuratorFramework zk () { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.cluster.mesos.MesosClusterPersistenceEngine createEngine (java.lang.String path) { throw new RuntimeException(); }
}
