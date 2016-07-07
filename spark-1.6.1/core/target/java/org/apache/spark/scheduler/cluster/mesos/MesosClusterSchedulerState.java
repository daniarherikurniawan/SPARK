package org.apache.spark.scheduler.cluster.mesos;
/**
 * The full state of the cluster scheduler, currently being used for displaying
 * information on the UI.
 * param:  frameworkId Mesos Framework id for the cluster scheduler.
 * param:  masterUrl The Mesos master url
 * param:  queuedDrivers All drivers queued to be launched
 * param:  launchedDrivers All launched or running drivers
 * param:  finishedDrivers All terminated drivers
 * param:  pendingRetryDrivers All drivers pending to be retried
 */
  class MesosClusterSchedulerState {
  public  java.lang.String frameworkId () { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> masterUrl () { throw new RuntimeException(); }
  public  scala.collection.Iterable<org.apache.spark.deploy.mesos.MesosDriverDescription> queuedDrivers () { throw new RuntimeException(); }
  public  scala.collection.Iterable<org.apache.spark.scheduler.cluster.mesos.MesosClusterSubmissionState> launchedDrivers () { throw new RuntimeException(); }
  public  scala.collection.Iterable<org.apache.spark.scheduler.cluster.mesos.MesosClusterSubmissionState> finishedDrivers () { throw new RuntimeException(); }
  public  scala.collection.Iterable<org.apache.spark.deploy.mesos.MesosDriverDescription> pendingRetryDrivers () { throw new RuntimeException(); }
  // not preceding
  public   MesosClusterSchedulerState (java.lang.String frameworkId, scala.Option<java.lang.String> masterUrl, scala.collection.Iterable<org.apache.spark.deploy.mesos.MesosDriverDescription> queuedDrivers, scala.collection.Iterable<org.apache.spark.scheduler.cluster.mesos.MesosClusterSubmissionState> launchedDrivers, scala.collection.Iterable<org.apache.spark.scheduler.cluster.mesos.MesosClusterSubmissionState> finishedDrivers, scala.collection.Iterable<org.apache.spark.deploy.mesos.MesosDriverDescription> pendingRetryDrivers) { throw new RuntimeException(); }
}
