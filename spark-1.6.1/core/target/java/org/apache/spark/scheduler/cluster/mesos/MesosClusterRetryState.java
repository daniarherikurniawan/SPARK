package org.apache.spark.scheduler.cluster.mesos;
/**
 * Tracks the retry state of a driver, which includes the next time it should be scheduled
 * and necessary information to do exponential backoff.
 * This class is not thread-safe, and we expect the caller to handle synchronizing state.
 * param:  lastFailureStatus Last Task status when it failed.
 * param:  retries Number of times it has been retried.
 * param:  nextRetry Time at which it should be retried next
 * param:  waitTime The amount of time driver is scheduled to wait until next retry.
 */
  class MesosClusterRetryState implements scala.Serializable {
  public  org.apache.mesos.Protos.TaskStatus lastFailureStatus () { throw new RuntimeException(); }
  public  int retries () { throw new RuntimeException(); }
  public  java.util.Date nextRetry () { throw new RuntimeException(); }
  public  int waitTime () { throw new RuntimeException(); }
  // not preceding
  public   MesosClusterRetryState (org.apache.mesos.Protos.TaskStatus lastFailureStatus, int retries, java.util.Date nextRetry, int waitTime) { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.cluster.mesos.MesosClusterRetryState copy () { throw new RuntimeException(); }
}
