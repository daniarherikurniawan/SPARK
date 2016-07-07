package org.apache.spark.scheduler.cluster.mesos;
/**
 * Black hole persistence engine that stores nothing.
 */
  class BlackHoleMesosClusterPersistenceEngine implements org.apache.spark.scheduler.cluster.mesos.MesosClusterPersistenceEngine {
  public   BlackHoleMesosClusterPersistenceEngine () { throw new RuntimeException(); }
  public  void persist (java.lang.String name, java.lang.Object obj) { throw new RuntimeException(); }
  public <T extends java.lang.Object> scala.Option<T> fetch (java.lang.String name) { throw new RuntimeException(); }
  public  void expunge (java.lang.String name) { throw new RuntimeException(); }
  public <T extends java.lang.Object> scala.collection.Iterable<T> fetchAll () { throw new RuntimeException(); }
}
