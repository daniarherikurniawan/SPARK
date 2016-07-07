package org.apache.spark.scheduler;
  class TaskSetFailed implements org.apache.spark.scheduler.DAGSchedulerEvent, scala.Product, scala.Serializable {
  public  org.apache.spark.scheduler.TaskSet taskSet () { throw new RuntimeException(); }
  public  java.lang.String reason () { throw new RuntimeException(); }
  public  scala.Option<java.lang.Throwable> exception () { throw new RuntimeException(); }
  // not preceding
  public   TaskSetFailed (org.apache.spark.scheduler.TaskSet taskSet, java.lang.String reason, scala.Option<java.lang.Throwable> exception) { throw new RuntimeException(); }
}
