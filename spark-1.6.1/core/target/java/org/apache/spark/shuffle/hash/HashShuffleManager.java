package org.apache.spark.shuffle.hash;
/**
 * A ShuffleManager using hashing, that creates one output file per reduce partition on each
 * mapper (possibly reusing these across waves of tasks).
 */
  class HashShuffleManager implements org.apache.spark.shuffle.ShuffleManager, org.apache.spark.Logging {
  public   HashShuffleManager (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  private  org.apache.spark.shuffle.FileShuffleBlockResolver fileShuffleBlockResolver () { throw new RuntimeException(); }
  public <K extends java.lang.Object, V extends java.lang.Object, C extends java.lang.Object> org.apache.spark.shuffle.ShuffleHandle registerShuffle (int shuffleId, int numMaps, org.apache.spark.ShuffleDependency<K, V, C> dependency) { throw new RuntimeException(); }
  /**
   * Get a reader for a range of reduce partitions (startPartition to endPartition-1, inclusive).
   * Called on executors by reduce tasks.
   * @param handle (undocumented)
   * @param startPartition (undocumented)
   * @param endPartition (undocumented)
   * @param context (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object, C extends java.lang.Object> org.apache.spark.shuffle.ShuffleReader<K, C> getReader (org.apache.spark.shuffle.ShuffleHandle handle, int startPartition, int endPartition, org.apache.spark.TaskContext context) { throw new RuntimeException(); }
  /** Get a writer for a given partition. Called on executors by map tasks. */
  public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.shuffle.ShuffleWriter<K, V> getWriter (org.apache.spark.shuffle.ShuffleHandle handle, int mapId, org.apache.spark.TaskContext context) { throw new RuntimeException(); }
  /** Remove a shuffle's metadata from the ShuffleManager. */
  public  boolean unregisterShuffle (int shuffleId) { throw new RuntimeException(); }
  public  org.apache.spark.shuffle.FileShuffleBlockResolver shuffleBlockResolver () { throw new RuntimeException(); }
  /** Shut down this ShuffleManager. */
  public  void stop () { throw new RuntimeException(); }
}
