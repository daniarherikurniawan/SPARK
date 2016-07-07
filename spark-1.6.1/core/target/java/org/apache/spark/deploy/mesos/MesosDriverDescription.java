package org.apache.spark.deploy.mesos;
/**
 * Describes a Spark driver that is submitted from the
 * {@link org.apache.spark.deploy.rest.mesos.MesosRestServer}, to be launched by
 * {@link org.apache.spark.scheduler.cluster.mesos.MesosClusterScheduler}.
 * param:  jarUrl URL to the application jar
 * param:  mem Amount of memory for the driver
 * param:  cores Number of cores for the driver
 * param:  supervise Supervise the driver for long running app
 * param:  command The command to launch the driver.
 * param:  schedulerProperties Extra properties to pass the Mesos scheduler
 */
  class MesosDriverDescription implements scala.Serializable {
  public  java.lang.String name () { throw new RuntimeException(); }
  public  java.lang.String jarUrl () { throw new RuntimeException(); }
  public  int mem () { throw new RuntimeException(); }
  public  double cores () { throw new RuntimeException(); }
  public  boolean supervise () { throw new RuntimeException(); }
  public  org.apache.spark.deploy.Command command () { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> schedulerProperties () { throw new RuntimeException(); }
  public  java.lang.String submissionId () { throw new RuntimeException(); }
  public  java.util.Date submissionDate () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.scheduler.cluster.mesos.MesosClusterRetryState> retryState () { throw new RuntimeException(); }
  // not preceding
  public   MesosDriverDescription (java.lang.String name, java.lang.String jarUrl, int mem, double cores, boolean supervise, org.apache.spark.deploy.Command command, scala.collection.immutable.Map<java.lang.String, java.lang.String> schedulerProperties, java.lang.String submissionId, java.util.Date submissionDate, scala.Option<org.apache.spark.scheduler.cluster.mesos.MesosClusterRetryState> retryState) { throw new RuntimeException(); }
  public  org.apache.spark.deploy.mesos.MesosDriverDescription copy (java.lang.String name, java.lang.String jarUrl, int mem, double cores, boolean supervise, org.apache.spark.deploy.Command command, scala.collection.immutable.Map<java.lang.String, java.lang.String> schedulerProperties, java.lang.String submissionId, java.util.Date submissionDate, scala.Option<org.apache.spark.scheduler.cluster.mesos.MesosClusterRetryState> retryState) { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
}
