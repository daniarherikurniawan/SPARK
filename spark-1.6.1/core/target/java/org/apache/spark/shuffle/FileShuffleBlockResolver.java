package org.apache.spark.shuffle;
/**
 * Manages assigning disk-based block writers to shuffle tasks. Each shuffle task gets one file
 * per reducer.
 */
  class FileShuffleBlockResolver implements org.apache.spark.shuffle.ShuffleBlockResolver, org.apache.spark.Logging {
  public   FileShuffleBlockResolver (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  private  org.apache.spark.network.util.TransportConf transportConf () { throw new RuntimeException(); }
  private  org.apache.spark.storage.BlockManager blockManager () { throw new RuntimeException(); }
  private  int bufferSize () { throw new RuntimeException(); }
  /**
   * Contains all the state related to a particular shuffle.
   */
  private  class ShuffleState {
    public  int numReducers () { throw new RuntimeException(); }
    // not preceding
    public   ShuffleState (int numReducers) { throw new RuntimeException(); }
    /**
     * The mapIds of all map tasks completed on this Executor for this shuffle.
     * @return (undocumented)
     */
    public  java.util.concurrent.ConcurrentLinkedQueue<java.lang.Object> completedMapTasks () { throw new RuntimeException(); }
  }
  private  org.apache.spark.util.TimeStampedHashMap<java.lang.Object, org.apache.spark.shuffle.FileShuffleBlockResolver.ShuffleState> shuffleStates () { throw new RuntimeException(); }
  private  org.apache.spark.util.MetadataCleaner metadataCleaner () { throw new RuntimeException(); }
  /**
   * Get a ShuffleWriterGroup for the given map task, which will register it as complete
   * when the writers are closed successfully
   * @param shuffleId (undocumented)
   * @param mapId (undocumented)
   * @param numReducers (undocumented)
   * @param serializer (undocumented)
   * @param writeMetrics (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.shuffle.ShuffleWriterGroup forMapTask (int shuffleId, int mapId, int numReducers, org.apache.spark.serializer.Serializer serializer, org.apache.spark.executor.ShuffleWriteMetrics writeMetrics) { throw new RuntimeException(); }
  public  org.apache.spark.network.buffer.ManagedBuffer getBlockData (org.apache.spark.storage.ShuffleBlockId blockId) { throw new RuntimeException(); }
  /** Remove all the blocks / files and metadata related to a particular shuffle. */
  public  boolean removeShuffle (int shuffleId) { throw new RuntimeException(); }
  /** Remove all the blocks / files related to a particular shuffle. */
  private  boolean removeShuffleBlocks (int shuffleId) { throw new RuntimeException(); }
  private  void cleanup (long cleanupTime) { throw new RuntimeException(); }
  public  void stop () { throw new RuntimeException(); }
}
