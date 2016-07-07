package org.apache.spark;
  class TaskContextImpl extends org.apache.spark.TaskContext implements org.apache.spark.Logging {
  public  int stageId () { throw new RuntimeException(); }
  public  int partitionId () { throw new RuntimeException(); }
  public  long taskAttemptId () { throw new RuntimeException(); }
  public  int attemptNumber () { throw new RuntimeException(); }
  public  org.apache.spark.memory.TaskMemoryManager taskMemoryManager () { throw new RuntimeException(); }
  private  org.apache.spark.metrics.MetricsSystem metricsSystem () { throw new RuntimeException(); }
  public  boolean runningLocally () { throw new RuntimeException(); }
  public  org.apache.spark.executor.TaskMetrics taskMetrics () { throw new RuntimeException(); }
  // not preceding
  public   TaskContextImpl (int stageId, int partitionId, long taskAttemptId, int attemptNumber, org.apache.spark.memory.TaskMemoryManager taskMemoryManager, org.apache.spark.metrics.MetricsSystem metricsSystem, scala.collection.Seq<org.apache.spark.Accumulator<java.lang.Object>> internalAccumulators, boolean runningLocally, org.apache.spark.executor.TaskMetrics taskMetrics) { throw new RuntimeException(); }
  public  long attemptId () { throw new RuntimeException(); }
  private  scala.collection.mutable.ArrayBuffer<org.apache.spark.util.TaskCompletionListener> onCompleteCallbacks () { throw new RuntimeException(); }
  private  boolean interrupted () { throw new RuntimeException(); }
  private  boolean completed () { throw new RuntimeException(); }
  public  org.apache.spark.TaskContextImpl addTaskCompletionListener (org.apache.spark.util.TaskCompletionListener listener) { throw new RuntimeException(); }
  public  org.apache.spark.TaskContextImpl addTaskCompletionListener (scala.Function1<org.apache.spark.TaskContext, scala.runtime.BoxedUnit> f) { throw new RuntimeException(); }
  public  void addOnCompleteCallback (scala.Function0<scala.runtime.BoxedUnit> f) { throw new RuntimeException(); }
  /** Marks the task as completed and triggers the listeners. */
    void markTaskCompleted () { throw new RuntimeException(); }
  /** Marks the task for interruption, i.e. cancellation. */
    void markInterrupted () { throw new RuntimeException(); }
  public  boolean isCompleted () { throw new RuntimeException(); }
  public  boolean isRunningLocally () { throw new RuntimeException(); }
  public  boolean isInterrupted () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.metrics.source.Source> getMetricsSources (java.lang.String sourceName) { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.Accumulable<?, ?>> accumulators () { throw new RuntimeException(); }
    void registerAccumulator (org.apache.spark.Accumulable<?, ?> a) { throw new RuntimeException(); }
    scala.collection.immutable.Map<java.lang.Object, java.lang.Object> collectInternalAccumulators () { throw new RuntimeException(); }
    scala.collection.immutable.Map<java.lang.Object, java.lang.Object> collectAccumulators () { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.Accumulator<java.lang.Object>> internalMetricsToAccumulators () { throw new RuntimeException(); }
}
