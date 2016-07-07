package org.apache.spark.shuffle;
/**
 * Fetches and reads the partitions in range [startPartition, endPartition) from a shuffle by
 * requesting them from other nodes' block stores.
 */
  class BlockStoreShuffleReader<K extends java.lang.Object, C extends java.lang.Object> implements org.apache.spark.shuffle.ShuffleReader<K, C>, org.apache.spark.Logging {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  public   BlockStoreShuffleReader (org.apache.spark.shuffle.BaseShuffleHandle<K, ?, C> handle, int startPartition, int endPartition, org.apache.spark.TaskContext context, org.apache.spark.storage.BlockManager blockManager, org.apache.spark.MapOutputTracker mapOutputTracker) { throw new RuntimeException(); }
  private  Object dep () { throw new RuntimeException(); }
  /** Read the combined key-values for this reduce task */
  public  scala.collection.Iterator<scala.Product2<K, C>> read () { throw new RuntimeException(); }
}
