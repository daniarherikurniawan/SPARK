package org.apache.spark.storage;
/**
 * A class for writing JVM objects directly to a file on disk. This class allows data to be appended
 * to an existing block and can guarantee atomicity in the case of faults as it allows the caller to
 * revert partial writes.
 * <p>
 * This class does not support concurrent writes. Also, once the writer has been opened it cannot be
 * reopened again.
 */
  class DiskBlockObjectWriter extends java.io.OutputStream implements org.apache.spark.Logging {
  public  java.io.File file () { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockId blockId () { throw new RuntimeException(); }
  // not preceding
  public   DiskBlockObjectWriter (java.io.File file, org.apache.spark.serializer.SerializerInstance serializerInstance, int bufferSize, scala.Function1<java.io.OutputStream, java.io.OutputStream> compressStream, boolean syncWrites, org.apache.spark.executor.ShuffleWriteMetrics writeMetrics, org.apache.spark.storage.BlockId blockId) { throw new RuntimeException(); }
  /** The file channel, used for repositioning / truncating the file. */
  private  java.nio.channels.FileChannel channel () { throw new RuntimeException(); }
  private  java.io.OutputStream bs () { throw new RuntimeException(); }
  private  java.io.FileOutputStream fos () { throw new RuntimeException(); }
  private  org.apache.spark.storage.TimeTrackingOutputStream ts () { throw new RuntimeException(); }
  private  org.apache.spark.serializer.SerializationStream objOut () { throw new RuntimeException(); }
  private  boolean initialized () { throw new RuntimeException(); }
  private  boolean hasBeenClosed () { throw new RuntimeException(); }
  private  boolean commitAndCloseHasBeenCalled () { throw new RuntimeException(); }
  /**
   * Cursors used to represent positions in the file.
   * <p>
   * xxxxxxxx|--------|---       |
   *         ^        ^          ^
   *         |        |        finalPosition
   *         |      reportedPosition
   *       initialPosition
   * <p>
   * initialPosition: Offset in the file where we start writing. Immutable.
   * reportedPosition: Position at the time of the last update to the write metrics.
   * finalPosition: Offset where we stopped writing. Set on closeAndCommit() then never changed.
   * -----: Current writes to the underlying file.
   * xxxxx: Existing contents of the file.
   * @return (undocumented)
   */
  private  long initialPosition () { throw new RuntimeException(); }
  private  long finalPosition () { throw new RuntimeException(); }
  private  long reportedPosition () { throw new RuntimeException(); }
  /**
   * Keep track of number of records written and also use this to periodically
   * output bytes written since the latter is expensive to do for each record.
   * @return (undocumented)
   */
  private  int numRecordsWritten () { throw new RuntimeException(); }
  public  org.apache.spark.storage.DiskBlockObjectWriter open () { throw new RuntimeException(); }
  public  void close () { throw new RuntimeException(); }
  public  boolean isOpen () { throw new RuntimeException(); }
  /**
   * Flush the partial writes and commit them as a single atomic block.
   */
  public  void commitAndClose () { throw new RuntimeException(); }
  /**
   * Reverts writes that haven't been flushed yet. Callers should invoke this function
   * when there are runtime exceptions. This method will not throw, though it may be
   * unsuccessful in truncating written data.
   * <p>
   * @return the file that this DiskBlockObjectWriter wrote to.
   */
  public  java.io.File revertPartialWritesAndClose () { throw new RuntimeException(); }
  /**
   * Writes a key-value pair.
   * @param key (undocumented)
   * @param value (undocumented)
   */
  public  void write (Object key, Object value) { throw new RuntimeException(); }
  public  void write (int b) { throw new RuntimeException(); }
  public  void write (byte[] kvBytes, int offs, int len) { throw new RuntimeException(); }
  /**
   * Notify the writer that a record worth of bytes has been written with OutputStream#write.
   */
  public  void recordWritten () { throw new RuntimeException(); }
  /**
   * Returns the file segment of committed data that this Writer has written.
   * This is only valid after commitAndClose() has been called.
   * @return (undocumented)
   */
  public  org.apache.spark.storage.FileSegment fileSegment () { throw new RuntimeException(); }
  /**
   * Report the number of bytes written in this writer's shuffle write metrics.
   * Note that this is only valid before the underlying streams are closed.
   */
  private  void updateBytesWritten () { throw new RuntimeException(); }
    void flush () { throw new RuntimeException(); }
}
