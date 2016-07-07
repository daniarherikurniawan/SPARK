package org.apache.spark.scheduler.cluster.mesos;
/**
 * Tracks the current state of a Mesos Task that runs a Spark driver.
 * param:  driverDescription Submitted driver description from
 * {@link org.apache.spark.deploy.rest.mesos.MesosRestServer}
 * param:  taskId Mesos TaskID generated for the task
 * param:  slaveId Slave ID that the task is assigned to
 * param:  mesosTaskStatus The last known task status update.
 * param:  startDate The date the task was launched
 */
  class MesosClusterSubmissionState implements scala.Serializable {
  public  org.apache.spark.deploy.mesos.MesosDriverDescription driverDescription () { throw new RuntimeException(); }
  public  org.apache.mesos.Protos.TaskID taskId () { throw new RuntimeException(); }
  public  org.apache.mesos.Protos.SlaveID slaveId () { throw new RuntimeException(); }
  public  scala.Option<org.apache.mesos.Protos.TaskStatus> mesosTaskStatus () { throw new RuntimeException(); }
  public  java.util.Date startDate () { throw new RuntimeException(); }
  public  scala.Option<java.util.Date> finishDate () { throw new RuntimeException(); }
  // not preceding
  public   MesosClusterSubmissionState (org.apache.spark.deploy.mesos.MesosDriverDescription driverDescription, org.apache.mesos.Protos.TaskID taskId, org.apache.mesos.Protos.SlaveID slaveId, scala.Option<org.apache.mesos.Protos.TaskStatus> mesosTaskStatus, java.util.Date startDate, scala.Option<java.util.Date> finishDate) { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.cluster.mesos.MesosClusterSubmissionState copy () { throw new RuntimeException(); }
}
