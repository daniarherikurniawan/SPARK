package org.apache.spark.storage;
  class MemoryStore extends org.apache.spark.storage.BlockStore {
  // not preceding
  public   MemoryStore (org.apache.spark.storage.BlockManager blockManager, org.apache.spark.memory.MemoryManager memoryManager) { throw new RuntimeException(); }
  private  org.apache.spark.SparkConf conf () { throw new RuntimeException(); }
  private  java.util.LinkedHashMap<org.apache.spark.storage.BlockId, org.apache.spark.storage.MemoryEntry> entries () { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.Object, java.lang.Object> unrollMemoryMap () { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.Object, java.lang.Object> pendingUnrollMemoryMap () { throw new RuntimeException(); }
  private  long unrollMemoryThreshold () { throw new RuntimeException(); }
  /** Total amount of memory available for storage, in bytes. */
  private  long maxMemory () { throw new RuntimeException(); }
  /** Total storage memory used including unroll memory, in bytes. */
  private  long memoryUsed () { throw new RuntimeException(); }
  /**
   * Amount of storage memory, in bytes, used for caching blocks.
   * This does not include memory used for unrolling.
   * @return (undocumented)
   */
  private  long blocksMemoryUsed () { throw new RuntimeException(); }
  public  long getSize (org.apache.spark.storage.BlockId blockId) { throw new RuntimeException(); }
  public  org.apache.spark.storage.PutResult putBytes (org.apache.spark.storage.BlockId blockId, java.nio.ByteBuffer _bytes, org.apache.spark.storage.StorageLevel level) { throw new RuntimeException(); }
  /**
   * Use <code>size</code> to test if there is enough space in MemoryStore. If so, create the ByteBuffer and
   * put it into MemoryStore. Otherwise, the ByteBuffer won't be created.
   * <p>
   * The caller should guarantee that <code>size</code> is correct.
   * @param blockId (undocumented)
   * @param size (undocumented)
   * @param _bytes (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.storage.PutResult putBytes (org.apache.spark.storage.BlockId blockId, long size, scala.Function0<java.nio.ByteBuffer> _bytes) { throw new RuntimeException(); }
  public  org.apache.spark.storage.PutResult putArray (org.apache.spark.storage.BlockId blockId, java.lang.Object[] values, org.apache.spark.storage.StorageLevel level, boolean returnValues) { throw new RuntimeException(); }
  public  org.apache.spark.storage.PutResult putIterator (org.apache.spark.storage.BlockId blockId, scala.collection.Iterator<java.lang.Object> values, org.apache.spark.storage.StorageLevel level, boolean returnValues) { throw new RuntimeException(); }
  /**
   * Attempt to put the given block in memory store.
   * <p>
   * There may not be enough space to fully unroll the iterator in memory, in which case we
   * optionally drop the values to disk if
   *   (1) the block's storage level specifies useDisk, and
   *   (2) <code>allowPersistToDisk</code> is true.
   * <p>
   * One scenario in which <code>allowPersistToDisk</code> is false is when the BlockManager reads a block
   * back from disk and attempts to cache it in memory. In this case, we should not persist the
   * block back on disk again, as it is already in disk store.
   * @param blockId (undocumented)
   * @param values (undocumented)
   * @param level (undocumented)
   * @param returnValues (undocumented)
   * @param allowPersistToDisk (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.storage.PutResult putIterator (org.apache.spark.storage.BlockId blockId, scala.collection.Iterator<java.lang.Object> values, org.apache.spark.storage.StorageLevel level, boolean returnValues, boolean allowPersistToDisk) { throw new RuntimeException(); }
  public  scala.Option<java.nio.ByteBuffer> getBytes (org.apache.spark.storage.BlockId blockId) { throw new RuntimeException(); }
  public  scala.Option<scala.collection.Iterator<java.lang.Object>> getValues (org.apache.spark.storage.BlockId blockId) { throw new RuntimeException(); }
  public  boolean remove (org.apache.spark.storage.BlockId blockId) { throw new RuntimeException(); }
  public  void clear () { throw new RuntimeException(); }
  /**
   * Unroll the given block in memory safely.
   * <p>
   * The safety of this operation refers to avoiding potential OOM exceptions caused by
   * unrolling the entirety of the block in memory at once. This is achieved by periodically
   * checking whether the memory restrictions for unrolling blocks are still satisfied,
   * stopping immediately if not. This check is a safeguard against the scenario in which
   * there is not enough free memory to accommodate the entirety of a single block.
   * <p>
   * This method returns either an array with the contents of the entire block or an iterator
   * containing the values of the block (if the array would have exceeded available memory).
   * @param blockId (undocumented)
   * @param values (undocumented)
   * @param droppedBlocks (undocumented)
   * @return (undocumented)
   */
  public  scala.util.Either<java.lang.Object[], scala.collection.Iterator<java.lang.Object>> unrollSafely (org.apache.spark.storage.BlockId blockId, scala.collection.Iterator<java.lang.Object> values, scala.collection.mutable.ArrayBuffer<scala.Tuple2<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockStatus>> droppedBlocks) { throw new RuntimeException(); }
  /**
   * Return the RDD ID that a given block ID is from, or None if it is not an RDD block.
   * @param blockId (undocumented)
   * @return (undocumented)
   */
  private  scala.Option<java.lang.Object> getRddId (org.apache.spark.storage.BlockId blockId) { throw new RuntimeException(); }
  private  boolean tryToPut (org.apache.spark.storage.BlockId blockId, Object value, long size, boolean deserialized, scala.collection.mutable.Buffer<scala.Tuple2<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockStatus>> droppedBlocks) { throw new RuntimeException(); }
  /**
   * Try to put in a set of values, if we can free up enough space. The value should either be
   * an Array if deserialized is true or a ByteBuffer otherwise. Its (possibly estimated) size
   * must also be passed by the caller.
   * <p>
   * <code>value</code> will be lazily created. If it cannot be put into MemoryStore or disk, <code>value</code> won't be
   * created to avoid OOM since it may be a big ByteBuffer.
   * <p>
   * Synchronize on <code>memoryManager</code> to ensure that all the put requests and its associated block
   * dropping is done by only on thread at a time. Otherwise while one thread is dropping
   * blocks to free memory for one block, another thread may use up the freed space for
   * another block.
   * <p>
   * All blocks evicted in the process, if any, will be added to <code>droppedBlocks</code>.
   * <p>
   * @return whether put was successful.
   * @param blockId (undocumented)
   * @param value (undocumented)
   * @param size (undocumented)
   * @param deserialized (undocumented)
   * @param droppedBlocks (undocumented)
   */
  private  boolean tryToPut (org.apache.spark.storage.BlockId blockId, scala.Function0<java.lang.Object> value, long size, boolean deserialized, scala.collection.mutable.Buffer<scala.Tuple2<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockStatus>> droppedBlocks) { throw new RuntimeException(); }
  /**
   * Try to evict blocks to free up a given amount of space to store a particular block.
   * Can fail if either the block is bigger than our memory or it would require replacing
   * another block from the same RDD (which leads to a wasteful cyclic replacement pattern for
   * RDDs that don't fit into memory that we want to avoid).
   * <p>
   * @param blockId the ID of the block we are freeing space for, if any
   * @param space the size of this block
   * @param droppedBlocks a holder for blocks evicted in the process
   * @return whether the requested free space is freed.
   */
    boolean evictBlocksToFreeSpace (scala.Option<org.apache.spark.storage.BlockId> blockId, long space, scala.collection.mutable.Buffer<scala.Tuple2<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockStatus>> droppedBlocks) { throw new RuntimeException(); }
  public  boolean contains (org.apache.spark.storage.BlockId blockId) { throw new RuntimeException(); }
  private  long currentTaskAttemptId () { throw new RuntimeException(); }
  /**
   * Reserve memory for unrolling the given block for this task.
   * @return whether the request is granted.
   * @param blockId (undocumented)
   * @param memory (undocumented)
   * @param droppedBlocks (undocumented)
   */
  public  boolean reserveUnrollMemoryForThisTask (org.apache.spark.storage.BlockId blockId, long memory, scala.collection.mutable.Buffer<scala.Tuple2<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockStatus>> droppedBlocks) { throw new RuntimeException(); }
  /**
   * Release memory used by this task for unrolling blocks.
   * If the amount is not specified, remove the current task's allocation altogether.
   * @param memory (undocumented)
   */
  public  void releaseUnrollMemoryForThisTask (long memory) { throw new RuntimeException(); }
  /**
   * Release pending unroll memory of current unroll successful block used by this task
   * @param memory (undocumented)
   */
  public  void releasePendingUnrollMemoryForThisTask (long memory) { throw new RuntimeException(); }
  /**
   * Return the amount of memory currently occupied for unrolling blocks across all tasks.
   * @return (undocumented)
   */
  public  long currentUnrollMemory () { throw new RuntimeException(); }
  /**
   * Return the amount of memory currently occupied for unrolling blocks by this task.
   * @return (undocumented)
   */
  public  long currentUnrollMemoryForThisTask () { throw new RuntimeException(); }
  /**
   * Return the number of tasks currently unrolling blocks.
   * @return (undocumented)
   */
  private  int numTasksUnrolling () { throw new RuntimeException(); }
  /**
   * Log information about current memory usage.
   */
  private  void logMemoryUsage () { throw new RuntimeException(); }
  /**
   * Log a warning for failing to unroll a block.
   * <p>
   * @param blockId ID of the block we are trying to unroll.
   * @param finalVectorSize Final size of the vector before unrolling failed.
   */
  private  void logUnrollFailureMessage (org.apache.spark.storage.BlockId blockId, long finalVectorSize) { throw new RuntimeException(); }
}
