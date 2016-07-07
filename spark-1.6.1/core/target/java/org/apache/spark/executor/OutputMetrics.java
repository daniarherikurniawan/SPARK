package org.apache.spark.executor;
/**
 * :: DeveloperApi ::
 * Metrics about writing output data.
 */
public  class OutputMetrics implements scala.Product, scala.Serializable {
  public  scala.Enumeration.Value writeMethod () { throw new RuntimeException(); }
  // not preceding
  public   OutputMetrics (scala.Enumeration.Value writeMethod) { throw new RuntimeException(); }
  /**
   * Total bytes written
   * @return (undocumented)
   */
  private  long _bytesWritten () { throw new RuntimeException(); }
  public  long bytesWritten () { throw new RuntimeException(); }
    void setBytesWritten (long value) { throw new RuntimeException(); }
  /**
   * Total records written
   * @return (undocumented)
   */
  private  long _recordsWritten () { throw new RuntimeException(); }
  public  long recordsWritten () { throw new RuntimeException(); }
    void setRecordsWritten (long value) { throw new RuntimeException(); }
}
