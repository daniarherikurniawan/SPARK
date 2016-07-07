package org.apache.spark.scheduler.cluster.mesos;
/**
 * Wrapper for serializing the data sent when launching Mesos tasks.
 */
  class MesosTaskLaunchData implements org.apache.spark.Logging, scala.Product, scala.Serializable {
  static public  org.apache.spark.scheduler.cluster.mesos.MesosTaskLaunchData fromByteString (org.apache.mesos.protobuf.ByteString byteString) { throw new RuntimeException(); }
  public  java.nio.ByteBuffer serializedTask () { throw new RuntimeException(); }
  public  int attemptNumber () { throw new RuntimeException(); }
  // not preceding
  public   MesosTaskLaunchData (java.nio.ByteBuffer serializedTask, int attemptNumber) { throw new RuntimeException(); }
  public  org.apache.mesos.protobuf.ByteString toByteString () { throw new RuntimeException(); }
}
