package org.apache.spark.memory;
/**
 * Performs bookkeeping for managing an adjustable-size pool of memory that is used for storage
 * (caching).
 * <p>
 * param:  lock a {@link MemoryManager} instance to synchronize on
 */
  class StorageMemoryPool extends org.apache.spark.memory.MemoryPool implements org.apache.spark.Logging {
  public   StorageMemoryPool (java.lang.Object lock) { throw new RuntimeException(); }
  public  long memoryUsed () { throw new RuntimeException(); }
  private  org.apache.spark.storage.MemoryStore _memoryStore () { throw new RuntimeException(); }
  public  org.apache.spark.storage.MemoryStore memoryStore () { throw new RuntimeException(); }
  /**
   * Set the {@link MemoryStore} used by this manager to evict cached blocks.
   * This must be set after construction due to initialization ordering constraints.
   * @param store (undocumented)
   */
  public final  void setMemoryStore (org.apache.spark.storage.MemoryStore store) { throw new RuntimeException(); }
  /**
   * Acquire N bytes of memory to cache the given block, evicting existing ones if necessary.
   * Blocks evicted in the process, if any, are added to <code>evictedBlocks</code>.
   * @return whether all N bytes were successfully granted.
   * @param blockId (undocumented)
   * @param numBytes (undocumented)
   * @param evictedBlocks (undocumented)
   */
  public  boolean acquireMemory (org.apache.spark.storage.BlockId blockId, long numBytes, scala.collection.mutable.Buffer<scala.Tuple2<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockStatus>> evictedBlocks) { throw new RuntimeException(); }
  /**
   * Acquire N bytes of storage memory for the given block, evicting existing ones if necessary.
   * <p>
   * @param blockId the ID of the block we are acquiring storage memory for
   * @param numBytesToAcquire the size of this block
   * @param numBytesToFree the amount of space to be freed through evicting blocks
   * @return whether all N bytes were successfully granted.
   * @param evictedBlocks (undocumented)
   */
  public  boolean acquireMemory (org.apache.spark.storage.BlockId blockId, long numBytesToAcquire, long numBytesToFree, scala.collection.mutable.Buffer<scala.Tuple2<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockStatus>> evictedBlocks) { throw new RuntimeException(); }
  public  void releaseMemory (long size) { throw new RuntimeException(); }
  public  void releaseAllMemory () { throw new RuntimeException(); }
  /**
   * Try to shrink the size of this storage memory pool by <code>spaceToFree</code> bytes. Return the number
   * of bytes removed from the pool's capacity.
   * @param spaceToFree (undocumented)
   * @return (undocumented)
   */
  public  long shrinkPoolToFreeSpace (long spaceToFree) { throw new RuntimeException(); }
}
