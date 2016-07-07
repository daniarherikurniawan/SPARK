package org.apache.spark.shuffle.sort;
  class SortShuffleWriter<K extends java.lang.Object, V extends java.lang.Object, C extends java.lang.Object> extends org.apache.spark.shuffle.ShuffleWriter<K, V> implements org.apache.spark.Logging {
  static public  boolean shouldBypassMergeSort (org.apache.spark.SparkConf conf, org.apache.spark.ShuffleDependency<?, ?, ?> dep) { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  public   SortShuffleWriter (org.apache.spark.shuffle.IndexShuffleBlockResolver shuffleBlockResolver, org.apache.spark.shuffle.BaseShuffleHandle<K, V, C> handle, int mapId, org.apache.spark.TaskContext context) { throw new RuntimeException(); }
  private  org.apache.spark.ShuffleDependency<K, V, C> dep () { throw new RuntimeException(); }
  private  org.apache.spark.storage.BlockManager blockManager () { throw new RuntimeException(); }
  private  Object sorter () { throw new RuntimeException(); }
  private  boolean stopping () { throw new RuntimeException(); }
  private  org.apache.spark.scheduler.MapStatus mapStatus () { throw new RuntimeException(); }
  private  org.apache.spark.executor.ShuffleWriteMetrics writeMetrics () { throw new RuntimeException(); }
  /** Write a bunch of records to this task's output */
  public  void write (scala.collection.Iterator<scala.Product2<K, V>> records) { throw new RuntimeException(); }
  /** Close this writer, passing along whether the map completed */
  public  scala.Option<org.apache.spark.scheduler.MapStatus> stop (boolean success) { throw new RuntimeException(); }
}
