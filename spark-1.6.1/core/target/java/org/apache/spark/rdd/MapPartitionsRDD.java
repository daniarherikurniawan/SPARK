package org.apache.spark.rdd;
/**
 * An RDD that applies the provided function to every partition of the parent RDD.
 */
  class MapPartitionsRDD<U extends java.lang.Object, T extends java.lang.Object> extends org.apache.spark.rdd.RDD<U> {
  public  org.apache.spark.rdd.RDD<T> prev () { throw new RuntimeException(); }
  // not preceding
  public   MapPartitionsRDD (org.apache.spark.rdd.RDD<T> prev, scala.Function3<org.apache.spark.TaskContext, java.lang.Object, scala.collection.Iterator<T>, scala.collection.Iterator<U>> f, boolean preservesPartitioning, scala.reflect.ClassTag<U> evidence$1, scala.reflect.ClassTag<T> evidence$2) { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.Partitioner> partitioner () { throw new RuntimeException(); }
  public  org.apache.spark.Partition[] getPartitions () { throw new RuntimeException(); }
  public  scala.collection.Iterator<U> compute (org.apache.spark.Partition split, org.apache.spark.TaskContext context) { throw new RuntimeException(); }
  public  void clearDependencies () { throw new RuntimeException(); }
}
