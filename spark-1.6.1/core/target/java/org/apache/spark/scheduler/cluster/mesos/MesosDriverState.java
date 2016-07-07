package org.apache.spark.scheduler.cluster.mesos;
/**
 * The full state of a Mesos driver, that is being used to display driver information on the UI.
 */
  class MesosDriverState {
  public  java.lang.String state () { throw new RuntimeException(); }
  public  org.apache.spark.deploy.mesos.MesosDriverDescription description () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.scheduler.cluster.mesos.MesosClusterSubmissionState> submissionState () { throw new RuntimeException(); }
  // not preceding
  public   MesosDriverState (java.lang.String state, org.apache.spark.deploy.mesos.MesosDriverDescription description, scala.Option<org.apache.spark.scheduler.cluster.mesos.MesosClusterSubmissionState> submissionState) { throw new RuntimeException(); }
}
