package org.apache.spark.status.api.v1;
public  class TaskMetrics {
  public  long executorDeserializeTime () { throw new RuntimeException(); }
  public  long executorRunTime () { throw new RuntimeException(); }
  public  long resultSize () { throw new RuntimeException(); }
  public  long jvmGcTime () { throw new RuntimeException(); }
  public  long resultSerializationTime () { throw new RuntimeException(); }
  public  long memoryBytesSpilled () { throw new RuntimeException(); }
  public  long diskBytesSpilled () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.status.api.v1.InputMetrics> inputMetrics () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.status.api.v1.OutputMetrics> outputMetrics () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.status.api.v1.ShuffleReadMetrics> shuffleReadMetrics () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.status.api.v1.ShuffleWriteMetrics> shuffleWriteMetrics () { throw new RuntimeException(); }
  // not preceding
     TaskMetrics (long executorDeserializeTime, long executorRunTime, long resultSize, long jvmGcTime, long resultSerializationTime, long memoryBytesSpilled, long diskBytesSpilled, scala.Option<org.apache.spark.status.api.v1.InputMetrics> inputMetrics, scala.Option<org.apache.spark.status.api.v1.OutputMetrics> outputMetrics, scala.Option<org.apache.spark.status.api.v1.ShuffleReadMetrics> shuffleReadMetrics, scala.Option<org.apache.spark.status.api.v1.ShuffleWriteMetrics> shuffleWriteMetrics) { throw new RuntimeException(); }
}
