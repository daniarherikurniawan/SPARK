package org.apache.spark.ui.jobs;
// no position
  class UIData {
  static public  class JobUIData {
    public  int jobId () { throw new RuntimeException(); }
    public  scala.Option<java.lang.Object> submissionTime () { throw new RuntimeException(); }
    public  scala.Option<java.lang.Object> completionTime () { throw new RuntimeException(); }
    public  scala.collection.Seq<java.lang.Object> stageIds () { throw new RuntimeException(); }
    public  scala.Option<java.lang.String> jobGroup () { throw new RuntimeException(); }
    public  org.apache.spark.JobExecutionStatus status () { throw new RuntimeException(); }
    public  int numTasks () { throw new RuntimeException(); }
    public  int numActiveTasks () { throw new RuntimeException(); }
    public  int numCompletedTasks () { throw new RuntimeException(); }
    public  int numSkippedTasks () { throw new RuntimeException(); }
    public  int numFailedTasks () { throw new RuntimeException(); }
    public  int numActiveStages () { throw new RuntimeException(); }
    public  scala.collection.mutable.HashSet<java.lang.Object> completedStageIndices () { throw new RuntimeException(); }
    public  int numSkippedStages () { throw new RuntimeException(); }
    public  int numFailedStages () { throw new RuntimeException(); }
    // not preceding
    public   JobUIData (int jobId, scala.Option<java.lang.Object> submissionTime, scala.Option<java.lang.Object> completionTime, scala.collection.Seq<java.lang.Object> stageIds, scala.Option<java.lang.String> jobGroup, org.apache.spark.JobExecutionStatus status, int numTasks, int numActiveTasks, int numCompletedTasks, int numSkippedTasks, int numFailedTasks, int numActiveStages, scala.collection.mutable.HashSet<java.lang.Object> completedStageIndices, int numSkippedStages, int numFailedStages) { throw new RuntimeException(); }
  }
  // no position
  static public  class JobUIData$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final JobUIData$ MODULE$ = null;
    public   JobUIData$ () { throw new RuntimeException(); }
  }
  /**
   * These are kept mutable and reused throughout a task's lifetime to avoid excessive reallocation.
   */
  static public  class TaskUIData implements scala.Product, scala.Serializable {
    public  org.apache.spark.scheduler.TaskInfo taskInfo () { throw new RuntimeException(); }
    public  scala.Option<org.apache.spark.executor.TaskMetrics> taskMetrics () { throw new RuntimeException(); }
    public  scala.Option<java.lang.String> errorMessage () { throw new RuntimeException(); }
    // not preceding
    public   TaskUIData (org.apache.spark.scheduler.TaskInfo taskInfo, scala.Option<org.apache.spark.executor.TaskMetrics> taskMetrics, scala.Option<java.lang.String> errorMessage) { throw new RuntimeException(); }
  }
  // no position
  static public  class TaskUIData$ extends scala.runtime.AbstractFunction3<org.apache.spark.scheduler.TaskInfo, scala.Option<org.apache.spark.executor.TaskMetrics>, scala.Option<java.lang.String>, org.apache.spark.ui.jobs.UIData.TaskUIData> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final TaskUIData$ MODULE$ = null;
    public   TaskUIData$ () { throw new RuntimeException(); }
  }
  static public  class ExecutorUIData implements scala.Product, scala.Serializable {
    public  long startTime () { throw new RuntimeException(); }
    public  scala.Option<java.lang.Object> finishTime () { throw new RuntimeException(); }
    public  scala.Option<java.lang.String> finishReason () { throw new RuntimeException(); }
    // not preceding
    public   ExecutorUIData (long startTime, scala.Option<java.lang.Object> finishTime, scala.Option<java.lang.String> finishReason) { throw new RuntimeException(); }
  }
  // no position
  static public  class ExecutorUIData$ extends scala.runtime.AbstractFunction3<java.lang.Object, scala.Option<java.lang.Object>, scala.Option<java.lang.String>, org.apache.spark.ui.jobs.UIData.ExecutorUIData> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ExecutorUIData$ MODULE$ = null;
    public   ExecutorUIData$ () { throw new RuntimeException(); }
  }
  static public  class ExecutorSummary {
    public   ExecutorSummary () { throw new RuntimeException(); }
    public  long taskTime () { throw new RuntimeException(); }
    public  int failedTasks () { throw new RuntimeException(); }
    public  int succeededTasks () { throw new RuntimeException(); }
    public  long inputBytes () { throw new RuntimeException(); }
    public  long inputRecords () { throw new RuntimeException(); }
    public  long outputBytes () { throw new RuntimeException(); }
    public  long outputRecords () { throw new RuntimeException(); }
    public  long shuffleRead () { throw new RuntimeException(); }
    public  long shuffleReadRecords () { throw new RuntimeException(); }
    public  long shuffleWrite () { throw new RuntimeException(); }
    public  long shuffleWriteRecords () { throw new RuntimeException(); }
    public  long memoryBytesSpilled () { throw new RuntimeException(); }
    public  long diskBytesSpilled () { throw new RuntimeException(); }
  }
  static public  class StageUIData {
    public   StageUIData () { throw new RuntimeException(); }
    public  int numActiveTasks () { throw new RuntimeException(); }
    public  int numCompleteTasks () { throw new RuntimeException(); }
    public  org.apache.spark.util.collection.OpenHashSet<java.lang.Object> completedIndices () { throw new RuntimeException(); }
    public  int numFailedTasks () { throw new RuntimeException(); }
    public  long executorRunTime () { throw new RuntimeException(); }
    public  long inputBytes () { throw new RuntimeException(); }
    public  long inputRecords () { throw new RuntimeException(); }
    public  long outputBytes () { throw new RuntimeException(); }
    public  long outputRecords () { throw new RuntimeException(); }
    public  long shuffleReadTotalBytes () { throw new RuntimeException(); }
    public  long shuffleReadRecords () { throw new RuntimeException(); }
    public  long shuffleWriteBytes () { throw new RuntimeException(); }
    public  long shuffleWriteRecords () { throw new RuntimeException(); }
    public  long memoryBytesSpilled () { throw new RuntimeException(); }
    public  long diskBytesSpilled () { throw new RuntimeException(); }
    public  java.lang.String schedulingPool () { throw new RuntimeException(); }
    public  scala.Option<java.lang.String> description () { throw new RuntimeException(); }
    public  scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.scheduler.AccumulableInfo> accumulables () { throw new RuntimeException(); }
    public  scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.ui.jobs.UIData.TaskUIData> taskData () { throw new RuntimeException(); }
    public  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.ui.jobs.UIData.ExecutorSummary> executorSummary () { throw new RuntimeException(); }
    public  boolean hasInput () { throw new RuntimeException(); }
    public  boolean hasOutput () { throw new RuntimeException(); }
    public  boolean hasShuffleRead () { throw new RuntimeException(); }
    public  boolean hasShuffleWrite () { throw new RuntimeException(); }
    public  boolean hasBytesSpilled () { throw new RuntimeException(); }
  }
}
