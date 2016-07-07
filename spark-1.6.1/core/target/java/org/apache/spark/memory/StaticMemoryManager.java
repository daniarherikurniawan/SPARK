package org.apache.spark.memory;
/**
 * A {@link MemoryManager} that statically partitions the heap space into disjoint regions.
 * <p>
 * The sizes of the execution and storage regions are determined through
 * <code>spark.shuffle.memoryFraction</code> and <code>spark.storage.memoryFraction</code> respectively. The two
 * regions are cleanly separated such that neither usage can borrow memory from the other.
 */
  class StaticMemoryManager extends org.apache.spark.memory.MemoryManager {
  /**
   * Return the total amount of memory available for the storage region, in bytes.
   * @param conf (undocumented)
   * @return (undocumented)
   */
  static private  long getMaxStorageMemory (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  /**
   * Return the total amount of memory available for the execution region, in bytes.
   * @param conf (undocumented)
   * @return (undocumented)
   */
  static private  long getMaxExecutionMemory (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  public  long maxStorageMemory () { throw new RuntimeException(); }
  // not preceding
  public   StaticMemoryManager (org.apache.spark.SparkConf conf, long maxOnHeapExecutionMemory, long maxStorageMemory, int numCores) { throw new RuntimeException(); }
  public   StaticMemoryManager (org.apache.spark.SparkConf conf, int numCores) { throw new RuntimeException(); }
  private  long maxUnrollMemory () { throw new RuntimeException(); }
  public  boolean acquireStorageMemory (org.apache.spark.storage.BlockId blockId, long numBytes, scala.collection.mutable.Buffer<scala.Tuple2<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockStatus>> evictedBlocks) { throw new RuntimeException(); }
  public  boolean acquireUnrollMemory (org.apache.spark.storage.BlockId blockId, long numBytes, scala.collection.mutable.Buffer<scala.Tuple2<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockStatus>> evictedBlocks) { throw new RuntimeException(); }
    long acquireExecutionMemory (long numBytes, long taskAttemptId, org.apache.spark.memory.MemoryMode memoryMode) { throw new RuntimeException(); }
}
