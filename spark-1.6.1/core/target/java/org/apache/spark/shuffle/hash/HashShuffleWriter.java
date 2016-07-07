package org.apache.spark.shuffle.hash;
  class HashShuffleWriter<K extends java.lang.Object, V extends java.lang.Object> extends org.apache.spark.shuffle.ShuffleWriter<K, V> implements org.apache.spark.Logging {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  public   HashShuffleWriter (org.apache.spark.shuffle.FileShuffleBlockResolver shuffleBlockResolver, org.apache.spark.shuffle.BaseShuffleHandle<K, V, ?> handle, int mapId, org.apache.spark.TaskContext context) { throw new RuntimeException(); }
  private  Object dep () { throw new RuntimeException(); }
  private  int numOutputSplits () { throw new RuntimeException(); }
  private  org.apache.spark.executor.TaskMetrics metrics () { throw new RuntimeException(); }
  private  boolean stopping () { throw new RuntimeException(); }
  private  org.apache.spark.executor.ShuffleWriteMetrics writeMetrics () { throw new RuntimeException(); }
  private  org.apache.spark.storage.BlockManager blockManager () { throw new RuntimeException(); }
  private  org.apache.spark.serializer.Serializer ser () { throw new RuntimeException(); }
  private  org.apache.spark.shuffle.ShuffleWriterGroup shuffle () { throw new RuntimeException(); }
  /** Write a bunch of records to this task's output */
  public  void write (scala.collection.Iterator<scala.Product2<K, V>> records) { throw new RuntimeException(); }
  /** Close this writer, passing along whether the map completed */
  public  scala.Option<org.apache.spark.scheduler.MapStatus> stop (boolean initiallySuccess) { throw new RuntimeException(); }
  private  org.apache.spark.scheduler.MapStatus commitWritesAndBuildStatus () { throw new RuntimeException(); }
  private  void revertWrites () { throw new RuntimeException(); }
}
