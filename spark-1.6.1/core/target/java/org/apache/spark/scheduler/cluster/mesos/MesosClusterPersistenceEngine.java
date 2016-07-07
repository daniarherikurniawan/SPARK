package org.apache.spark.scheduler.cluster.mesos;
/**
 * Mesos cluster persistence engine is responsible for persisting Mesos cluster mode
 * specific state, so that on failover all the state can be recovered and the scheduler
 * can resume managing the drivers.
 */
  interface MesosClusterPersistenceEngine {
  public  void persist (java.lang.String name, java.lang.Object obj) ;
  public  void expunge (java.lang.String name) ;
  public <T extends java.lang.Object> scala.Option<T> fetch (java.lang.String name) ;
  public <T extends java.lang.Object> scala.collection.Iterable<T> fetchAll () ;
}
