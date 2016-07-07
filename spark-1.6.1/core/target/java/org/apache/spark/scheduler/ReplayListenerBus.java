package org.apache.spark.scheduler;
/**
 * A SparkListenerBus that can be used to replay events from serialized event data.
 */
  class ReplayListenerBus implements org.apache.spark.scheduler.SparkListenerBus, org.apache.spark.Logging {
  public   ReplayListenerBus () { throw new RuntimeException(); }
  /**
   * Replay each event in the order maintained in the given stream. The stream is expected to
   * contain one JSON-encoded SparkListenerEvent per line.
   * <p>
   * This method can be called multiple times, but the listener behavior is undefined after any
   * error is thrown by this method.
   * <p>
   * @param logData Stream containing event log data.
   * @param sourceName Filename (or other source identifier) from whence @logData is being read
   * @param maybeTruncated Indicate whether log file might be truncated (some abnormal situations
   *        encountered, log file might not finished writing) or not
   */
  public  void replay (java.io.InputStream logData, java.lang.String sourceName, boolean maybeTruncated) { throw new RuntimeException(); }
}
