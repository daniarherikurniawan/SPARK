package org.apache.spark.executor;
/**
 * :: DeveloperApi ::
 * Metrics tracked during the execution of a task.
 * <p>
 * This class is used to house metrics both for in-progress and completed tasks. In executors,
 * both the task thread and the heartbeat thread write to the TaskMetrics. The heartbeat thread
 * reads it to send in-progress metrics, and the task thread reads it to send metrics along with
 * the completed task.
 * <p>
 * So, when adding new fields, take into consideration that the whole object can be serialized for
 * shipping off at any time to consumers of the SparkListener interface.
 */
public  class TaskMetrics implements scala.Serializable {
  static private  java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> hostNameCache () { throw new RuntimeException(); }
  static public  org.apache.spark.executor.TaskMetrics empty () { throw new RuntimeException(); }
  static public  java.lang.String getCachedHostName (java.lang.String host) { throw new RuntimeException(); }
  public   TaskMetrics () { throw new RuntimeException(); }
  /**
   * Host's name the task runs on
   * @return (undocumented)
   */
  private  java.lang.String _hostname () { throw new RuntimeException(); }
  public  java.lang.String hostname () { throw new RuntimeException(); }
    void setHostname (java.lang.String value) { throw new RuntimeException(); }
  /**
   * Time taken on the executor to deserialize this task
   * @return (undocumented)
   */
  private  long _executorDeserializeTime () { throw new RuntimeException(); }
  public  long executorDeserializeTime () { throw new RuntimeException(); }
    void setExecutorDeserializeTime (long value) { throw new RuntimeException(); }
  /**
   * Time the executor spends actually running the task (including fetching shuffle data)
   * @return (undocumented)
   */
  private  long _executorRunTime () { throw new RuntimeException(); }
  public  long executorRunTime () { throw new RuntimeException(); }
    void setExecutorRunTime (long value) { throw new RuntimeException(); }
  /**
   * The number of bytes this task transmitted back to the driver as the TaskResult
   * @return (undocumented)
   */
  private  long _resultSize () { throw new RuntimeException(); }
  public  long resultSize () { throw new RuntimeException(); }
    void setResultSize (long value) { throw new RuntimeException(); }
  /**
   * Amount of time the JVM spent in garbage collection while executing this task
   * @return (undocumented)
   */
  private  long _jvmGCTime () { throw new RuntimeException(); }
  public  long jvmGCTime () { throw new RuntimeException(); }
    void setJvmGCTime (long value) { throw new RuntimeException(); }
  /**
   * Amount of time spent serializing the task result
   * @return (undocumented)
   */
  private  long _resultSerializationTime () { throw new RuntimeException(); }
  public  long resultSerializationTime () { throw new RuntimeException(); }
    void setResultSerializationTime (long value) { throw new RuntimeException(); }
  /**
   * The number of in-memory bytes spilled by this task
   * @return (undocumented)
   */
  private  long _memoryBytesSpilled () { throw new RuntimeException(); }
  public  long memoryBytesSpilled () { throw new RuntimeException(); }
    void incMemoryBytesSpilled (long value) { throw new RuntimeException(); }
    void decMemoryBytesSpilled (long value) { throw new RuntimeException(); }
  /**
   * The number of on-disk bytes spilled by this task
   * @return (undocumented)
   */
  private  long _diskBytesSpilled () { throw new RuntimeException(); }
  public  long diskBytesSpilled () { throw new RuntimeException(); }
    void incDiskBytesSpilled (long value) { throw new RuntimeException(); }
    void decDiskBytesSpilled (long value) { throw new RuntimeException(); }
  /**
   * If this task reads from a HadoopRDD or from persisted data, metrics on how much data was read
   * are stored here.
   * @return (undocumented)
   */
  private  scala.Option<org.apache.spark.executor.InputMetrics> _inputMetrics () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.executor.InputMetrics> inputMetrics () { throw new RuntimeException(); }
  /**
   * This should only be used when recreating TaskMetrics, not when updating input metrics in
   * executors
   * @param inputMetrics (undocumented)
   */
    void setInputMetrics (scala.Option<org.apache.spark.executor.InputMetrics> inputMetrics) { throw new RuntimeException(); }
  /**
   * If this task writes data externally (e.g. to a distributed filesystem), metrics on how much
   * data was written are stored here.
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.executor.OutputMetrics> outputMetrics () { throw new RuntimeException(); }
  /**
   * If this task reads from shuffle output, metrics on getting shuffle data will be collected here.
   * This includes read metrics aggregated over all the task's shuffle dependencies.
   * @return (undocumented)
   */
  private  scala.Option<org.apache.spark.executor.ShuffleReadMetrics> _shuffleReadMetrics () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.executor.ShuffleReadMetrics> shuffleReadMetrics () { throw new RuntimeException(); }
  /**
   * This should only be used when recreating TaskMetrics, not when updating read metrics in
   * executors.
   * @param shuffleReadMetrics (undocumented)
   */
    void setShuffleReadMetrics (scala.Option<org.apache.spark.executor.ShuffleReadMetrics> shuffleReadMetrics) { throw new RuntimeException(); }
  /**
   * ShuffleReadMetrics per dependency for collecting independently while task is in progress.
   * @return (undocumented)
   */
  private  scala.collection.mutable.ArrayBuffer<org.apache.spark.executor.ShuffleReadMetrics> depsShuffleReadMetrics () { throw new RuntimeException(); }
  /**
   * If this task writes to shuffle output, metrics on the written shuffle data will be collected
   * here
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.executor.ShuffleWriteMetrics> shuffleWriteMetrics () { throw new RuntimeException(); }
  /**
   * Storage statuses of any blocks that have been updated as a result of this task.
   * @return (undocumented)
   */
  public  scala.Option<scala.collection.Seq<scala.Tuple2<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockStatus>>> updatedBlocks () { throw new RuntimeException(); }
  /**
   * A task may have multiple shuffle readers for multiple dependencies. To avoid synchronization
   * issues from readers in different threads, in-progress tasks use a ShuffleReadMetrics for each
   * dependency, and merge these metrics before reporting them to the driver. This method returns
   * a ShuffleReadMetrics for a dependency and registers it for merging later.
   * @return (undocumented)
   */
    org.apache.spark.executor.ShuffleReadMetrics createShuffleReadMetricsForDependency () { throw new RuntimeException(); }
  /**
   * Returns the input metrics object that the task should use. Currently, if
   * there exists an input metric with the same readMethod, we return that one
   * so the caller can accumulate bytes read. If the readMethod is different
   * than previously seen by this task, we return a new InputMetric but don't
   * record it.
   * <p>
   * Once https://issues.apache.org/jira/browse/SPARK-5225 is addressed,
   * we can store all the different inputMetrics (one per readMethod).
   * @param readMethod (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.executor.InputMetrics getInputMetricsForReadMethod (scala.Enumeration.Value readMethod) { throw new RuntimeException(); }
  /**
   * Aggregates shuffle read metrics for all registered dependencies into shuffleReadMetrics.
   */
    void updateShuffleReadMetrics () { throw new RuntimeException(); }
    void updateInputMetrics () { throw new RuntimeException(); }
  private  void readObject (java.io.ObjectInputStream in) { throw new RuntimeException(); }
  private  scala.collection.immutable.Map<java.lang.Object, java.lang.Object> _accumulatorUpdates () { throw new RuntimeException(); }
  private  scala.Function0<scala.collection.immutable.Map<java.lang.Object, java.lang.Object>> _accumulatorsUpdater () { throw new RuntimeException(); }
    void updateAccumulators () { throw new RuntimeException(); }
  /**
   * Return the latest updates of accumulators in this task.
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<java.lang.Object, java.lang.Object> accumulatorUpdates () { throw new RuntimeException(); }
    void setAccumulatorsUpdater (scala.Function0<scala.collection.immutable.Map<java.lang.Object, java.lang.Object>> accumulatorsUpdater) { throw new RuntimeException(); }
}
