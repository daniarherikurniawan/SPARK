package org.apache.spark.scheduler;
public  class SparkListenerExecutorAdded implements org.apache.spark.scheduler.SparkListenerEvent, scala.Product, scala.Serializable {
  public  long time () { throw new RuntimeException(); }
  public  java.lang.String executorId () { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.cluster.ExecutorInfo executorInfo () { throw new RuntimeException(); }
  // not preceding
  public   SparkListenerExecutorAdded (long time, java.lang.String executorId, org.apache.spark.scheduler.cluster.ExecutorInfo executorInfo) { throw new RuntimeException(); }
}
