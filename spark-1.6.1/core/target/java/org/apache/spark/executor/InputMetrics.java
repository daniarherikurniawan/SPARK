package org.apache.spark.executor;
/**
 * :: DeveloperApi ::
 * Metrics about reading input data.
 */
public  class InputMetrics implements scala.Product, scala.Serializable {
  public  scala.Enumeration.Value readMethod () { throw new RuntimeException(); }
  // not preceding
  public   InputMetrics (scala.Enumeration.Value readMethod) { throw new RuntimeException(); }
  /**
   * This is volatile so that it is visible to the updater thread.
   * @return (undocumented)
   */
  public  scala.Option<scala.Function0<java.lang.Object>> bytesReadCallback () { throw new RuntimeException(); }
  /**
   * Total bytes read.
   * @return (undocumented)
   */
  private  long _bytesRead () { throw new RuntimeException(); }
  public  long bytesRead () { throw new RuntimeException(); }
  public  void incBytesRead (long bytes) { throw new RuntimeException(); }
  /**
   * Total records read.
   * @return (undocumented)
   */
  private  long _recordsRead () { throw new RuntimeException(); }
  public  long recordsRead () { throw new RuntimeException(); }
  public  void incRecordsRead (long records) { throw new RuntimeException(); }
  /**
   * Invoke the bytesReadCallback and mutate bytesRead.
   */
  public  void updateBytesRead () { throw new RuntimeException(); }
  /**
   * Register a function that can be called to get up-to-date information on how many bytes the task
   * has read from an input source.
   * @param f (undocumented)
   */
  public  void setBytesReadCallback (scala.Option<scala.Function0<java.lang.Object>> f) { throw new RuntimeException(); }
}
