package org.apache.spark.scheduler.cluster.mesos;
/**
 * Black hole persistence engine factory that creates black hole
 * persistence engines, which stores nothing.
 */
  class BlackHoleMesosClusterPersistenceEngineFactory extends org.apache.spark.scheduler.cluster.mesos.MesosClusterPersistenceEngineFactory {
  public   BlackHoleMesosClusterPersistenceEngineFactory () { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.cluster.mesos.MesosClusterPersistenceEngine createEngine (java.lang.String path) { throw new RuntimeException(); }
}
