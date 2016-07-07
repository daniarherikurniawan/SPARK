package org.apache.spark.scheduler.cluster.mesos;
/**
 * Persistence engine factory that is responsible for creating new persistence engines
 * to store Mesos cluster mode state.
 */
 abstract class MesosClusterPersistenceEngineFactory {
  public   MesosClusterPersistenceEngineFactory (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  public abstract  org.apache.spark.scheduler.cluster.mesos.MesosClusterPersistenceEngine createEngine (java.lang.String path) ;
}
