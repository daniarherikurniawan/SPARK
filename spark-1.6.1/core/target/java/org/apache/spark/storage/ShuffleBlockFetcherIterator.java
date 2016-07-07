package org.apache.spark.storage;
/**
 * An iterator that fetches multiple blocks. For local blocks, it fetches from the local block
 * manager. For remote blocks, it fetches them using the provided BlockTransferService.
 * <p>
 * This creates an iterator of (BlockID, InputStream) tuples so the caller can handle blocks
 * in a pipelined fashion as they are received.
 * <p>
 * The implementation throttles the remote fetches to they don't exceed maxBytesInFlight to avoid
 * using too much memory.
 * <p>
 * param:  context {@link TaskContext}, used for metrics update
 * param:  shuffleClient {@link ShuffleClient} for fetching remote blocks
 * param:  blockManager {@link BlockManager} for reading local blocks
 * param:  blocksByAddress list of blocks to fetch grouped by the {@link BlockManagerId}.
 *                        For each block we also require the size (in bytes as a long field) in
 *                        order to throttle the memory usage.
 * param:  maxBytesInFlight max size (in bytes) of remote blocks to fetch at any given point.
 */
 final class ShuffleBlockFetcherIterator implements scala.collection.Iterator<scala.Tuple2<org.apache.spark.storage.BlockId, java.io.InputStream>>, org.apache.spark.Logging {
  /**
   * A request to fetch blocks from a remote BlockManager.
   * param:  address remote BlockManager to fetch from.
   * param:  blocks Sequence of tuple, where the first element is the block id,
   *               and the second element is the estimated size, used to calculate bytesInFlight.
   */
  static public  class FetchRequest implements scala.Product, scala.Serializable {
    public  org.apache.spark.storage.BlockManagerId address () { throw new RuntimeException(); }
    public  scala.collection.Seq<scala.Tuple2<org.apache.spark.storage.BlockId, java.lang.Object>> blocks () { throw new RuntimeException(); }
    // not preceding
    public   FetchRequest (org.apache.spark.storage.BlockManagerId address, scala.collection.Seq<scala.Tuple2<org.apache.spark.storage.BlockId, java.lang.Object>> blocks) { throw new RuntimeException(); }
    public  long size () { throw new RuntimeException(); }
  }
  // no position
  static public  class FetchRequest$ extends scala.runtime.AbstractFunction2<org.apache.spark.storage.BlockManagerId, scala.collection.Seq<scala.Tuple2<org.apache.spark.storage.BlockId, java.lang.Object>>, org.apache.spark.storage.ShuffleBlockFetcherIterator.FetchRequest> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final FetchRequest$ MODULE$ = null;
    public   FetchRequest$ () { throw new RuntimeException(); }
  }
  /**
   * Result of a fetch from a remote block successfully.
   * param:  blockId block id
   * param:  address BlockManager that the block was fetched from.
   * param:  size estimated size of the block, used to calculate bytesInFlight.
   *             Note that this is NOT the exact bytes.
   * param:  buf {@link ManagedBuffer} for the content.
   */
  static   class SuccessFetchResult implements org.apache.spark.storage.ShuffleBlockFetcherIterator.FetchResult, scala.Product, scala.Serializable {
    public  org.apache.spark.storage.BlockId blockId () { throw new RuntimeException(); }
    public  org.apache.spark.storage.BlockManagerId address () { throw new RuntimeException(); }
    public  long size () { throw new RuntimeException(); }
    public  org.apache.spark.network.buffer.ManagedBuffer buf () { throw new RuntimeException(); }
    // not preceding
    public   SuccessFetchResult (org.apache.spark.storage.BlockId blockId, org.apache.spark.storage.BlockManagerId address, long size, org.apache.spark.network.buffer.ManagedBuffer buf) { throw new RuntimeException(); }
  }
  // no position
  static   class SuccessFetchResult$ extends scala.runtime.AbstractFunction4<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockManagerId, java.lang.Object, org.apache.spark.network.buffer.ManagedBuffer, org.apache.spark.storage.ShuffleBlockFetcherIterator.SuccessFetchResult> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SuccessFetchResult$ MODULE$ = null;
    public   SuccessFetchResult$ () { throw new RuntimeException(); }
  }
  /**
   * Result of a fetch from a remote block unsuccessfully.
   * param:  blockId block id
   * param:  address BlockManager that the block was attempted to be fetched from
   * param:  e the failure exception
   */
  static   class FailureFetchResult implements org.apache.spark.storage.ShuffleBlockFetcherIterator.FetchResult, scala.Product, scala.Serializable {
    public  org.apache.spark.storage.BlockId blockId () { throw new RuntimeException(); }
    public  org.apache.spark.storage.BlockManagerId address () { throw new RuntimeException(); }
    public  java.lang.Throwable e () { throw new RuntimeException(); }
    // not preceding
    public   FailureFetchResult (org.apache.spark.storage.BlockId blockId, org.apache.spark.storage.BlockManagerId address, java.lang.Throwable e) { throw new RuntimeException(); }
  }
  // no position
  static   class FailureFetchResult$ extends scala.runtime.AbstractFunction3<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockManagerId, java.lang.Throwable, org.apache.spark.storage.ShuffleBlockFetcherIterator.FailureFetchResult> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final FailureFetchResult$ MODULE$ = null;
    public   FailureFetchResult$ () { throw new RuntimeException(); }
  }
  /**
   * Result of a fetch from a remote block.
   */
  static   interface FetchResult {
    public  org.apache.spark.storage.BlockId blockId () ;
    public  org.apache.spark.storage.BlockManagerId address () ;
  }
  public   ShuffleBlockFetcherIterator (org.apache.spark.TaskContext context, org.apache.spark.network.shuffle.ShuffleClient shuffleClient, org.apache.spark.storage.BlockManager blockManager, scala.collection.Seq<scala.Tuple2<org.apache.spark.storage.BlockManagerId, scala.collection.Seq<scala.Tuple2<org.apache.spark.storage.BlockId, java.lang.Object>>>> blocksByAddress, long maxBytesInFlight) { throw new RuntimeException(); }
    void releaseCurrentResultBuffer () { throw new RuntimeException(); }
  /**
   * Mark the iterator as zombie, and release all buffers that haven't been deserialized yet.
   */
  private  void cleanup () { throw new RuntimeException(); }
  private  void sendRequest (org.apache.spark.storage.ShuffleBlockFetcherIterator.FetchRequest req) { throw new RuntimeException(); }
  private  scala.collection.mutable.ArrayBuffer<org.apache.spark.storage.ShuffleBlockFetcherIterator.FetchRequest> splitLocalRemoteBlocks () { throw new RuntimeException(); }
  /**
   * Fetch the local blocks while we are fetching remote blocks. This is ok because
   * {@link ManagedBuffer}'s memory is allocated lazily when we create the input stream, so all we
   * track in-memory are the ManagedBuffer references themselves.
   */
  private  void fetchLocalBlocks () { throw new RuntimeException(); }
  private  void initialize () { throw new RuntimeException(); }
  public  boolean hasNext () { throw new RuntimeException(); }
  /**
   * Fetches the next (BlockId, InputStream). If a task fails, the ManagedBuffers
   * underlying each InputStream will be freed by the cleanup() method registered with the
   * TaskCompletionListener. However, callers should close() these InputStreams
   * as soon as they are no longer needed, in order to release memory as early as possible.
   * <p>
   * Throws a FetchFailedException if the next block could not be fetched.
   * @return (undocumented)
   */
  public  scala.Tuple2<org.apache.spark.storage.BlockId, java.io.InputStream> next () { throw new RuntimeException(); }
  private  void fetchUpToMaxBytes () { throw new RuntimeException(); }
  private  scala.runtime.Nothing$ throwFetchFailedException (org.apache.spark.storage.BlockId blockId, org.apache.spark.storage.BlockManagerId address, java.lang.Throwable e) { throw new RuntimeException(); }
}
