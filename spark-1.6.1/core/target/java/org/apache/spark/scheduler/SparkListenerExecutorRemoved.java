package org.apache.spark.scheduler;
public  class SparkListenerExecutorRemoved implements org.apache.spark.scheduler.SparkListenerEvent, scala.Product, scala.Serializable {
  public  long time () { throw new RuntimeException(); }
  public  java.lang.String executorId () { throw new RuntimeException(); }
  public  java.lang.String reason () { throw new RuntimeException(); }
  // not preceding
  public   SparkListenerExecutorRemoved (long time, java.lang.String executorId, java.lang.String reason) { throw new RuntimeException(); }
}
