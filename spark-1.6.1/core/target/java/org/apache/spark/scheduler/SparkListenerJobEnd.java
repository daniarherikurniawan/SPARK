package org.apache.spark.scheduler;
public  class SparkListenerJobEnd implements org.apache.spark.scheduler.SparkListenerEvent, scala.Product, scala.Serializable {
  public  int jobId () { throw new RuntimeException(); }
  public  long time () { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.JobResult jobResult () { throw new RuntimeException(); }
  // not preceding
  public   SparkListenerJobEnd (int jobId, long time, org.apache.spark.scheduler.JobResult jobResult) { throw new RuntimeException(); }
}
