package org.apache.spark.executor;
/**
 * :: DeveloperApi ::
 * Metrics pertaining to shuffle data written in a given task.
 */
public  class ShuffleWriteMetrics implements scala.Serializable {
  public   ShuffleWriteMetrics () { throw new RuntimeException(); }
  /**
   * Number of bytes written for the shuffle by this task
   * @return (undocumented)
   */
  private  long _shuffleBytesWritten () { throw new RuntimeException(); }
  public  long shuffleBytesWritten () { throw new RuntimeException(); }
    void incShuffleBytesWritten (long value) { throw new RuntimeException(); }
    void decShuffleBytesWritten (long value) { throw new RuntimeException(); }
  /**
   * Time the task spent blocking on writes to disk or buffer cache, in nanoseconds
   * @return (undocumented)
   */
  private  long _shuffleWriteTime () { throw new RuntimeException(); }
  public  long shuffleWriteTime () { throw new RuntimeException(); }
    void incShuffleWriteTime (long value) { throw new RuntimeException(); }
    void decShuffleWriteTime (long value) { throw new RuntimeException(); }
  /**
   * Total number of records written to the shuffle by this task
   * @return (undocumented)
   */
  private  long _shuffleRecordsWritten () { throw new RuntimeException(); }
  public  long shuffleRecordsWritten () { throw new RuntimeException(); }
    void incShuffleRecordsWritten (long value) { throw new RuntimeException(); }
    void decShuffleRecordsWritten (long value) { throw new RuntimeException(); }
    void setShuffleRecordsWritten (long value) { throw new RuntimeException(); }
}
