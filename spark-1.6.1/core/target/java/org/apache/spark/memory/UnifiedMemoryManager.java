package org.apache.spark.memory;
/**
 * A {@link MemoryManager} that enforces a soft boundary between execution and storage such that
 * either side can borrow memory from the other.
 * <p>
 * The region shared between execution and storage is a fraction of (the total heap space - 300MB)
 * configurable through <code>spark.memory.fraction</code> (default 0.75). The position of the boundary
 * within this space is further determined by <code>spark.memory.storageFraction</code> (default 0.5).
 * This means the size of the storage region is 0.75 * 0.5 = 0.375 of the heap space by default.
 * <p>
 * Storage can borrow as much execution memory as is free until execution reclaims its space.
 * When this happens, cached blocks will be evicted from memory until sufficient borrowed
 * memory is released to satisfy the execution memory request.
 * <p>
 * Similarly, execution can borrow as much storage memory as is free. However, execution
 * memory is *never* evicted by storage due to the complexities involved in implementing this.
 * The implication is that attempts to cache blocks may fail if execution has already eaten
 * up most of the storage space, in which case the new blocks will be evicted immediately
 * according to their respective storage levels.
 * <p>
 * param:  storageRegionSize Size of the storage region, in bytes.
 *                          This region is not statically reserved; execution can borrow from
 *                          it if necessary. Cached blocks can be evicted only if actual
 *                          storage memory usage exceeds this region.
 */
  class UnifiedMemoryManager extends org.apache.spark.memory.MemoryManager {
  static private  int RESERVED_SYSTEM_MEMORY_BYTES () { throw new RuntimeException(); }
  static public  org.apache.spark.memory.UnifiedMemoryManager apply (org.apache.spark.SparkConf conf, int numCores) { throw new RuntimeException(); }
  /**
   * Return the total amount of memory shared between execution and storage, in bytes.
   * @param conf (undocumented)
   * @return (undocumented)
   */
  static private  long getMaxMemory (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  public  long maxMemory () { throw new RuntimeException(); }
  // not preceding
     UnifiedMemoryManager (org.apache.spark.SparkConf conf, long maxMemory, long storageRegionSize, int numCores) { throw new RuntimeException(); }
  public  long maxStorageMemory () { throw new RuntimeException(); }
  /**
   * Try to acquire up to <code>numBytes</code> of execution memory for the current task and return the
   * number of bytes obtained, or 0 if none can be allocated.
   * <p>
   * This call may block until there is enough free memory in some situations, to make sure each
   * task has a chance to ramp up to at least 1 / 2N of the total memory pool (where N is the # of
   * active tasks) before it is forced to spill. This can happen if the number of tasks increase
   * but an older task had a lot of memory already.
   * @param numBytes (undocumented)
   * @param taskAttemptId (undocumented)
   * @param memoryMode (undocumented)
   * @return (undocumented)
   */
    long acquireExecutionMemory (long numBytes, long taskAttemptId, org.apache.spark.memory.MemoryMode memoryMode) { throw new RuntimeException(); }
  public  boolean acquireStorageMemory (org.apache.spark.storage.BlockId blockId, long numBytes, scala.collection.mutable.Buffer<scala.Tuple2<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockStatus>> evictedBlocks) { throw new RuntimeException(); }
  public  boolean acquireUnrollMemory (org.apache.spark.storage.BlockId blockId, long numBytes, scala.collection.mutable.Buffer<scala.Tuple2<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockStatus>> evictedBlocks) { throw new RuntimeException(); }
}
