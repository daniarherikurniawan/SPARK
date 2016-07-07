package org.apache.spark.api.r;
public abstract class BaseRRDD<T extends java.lang.Object, U extends java.lang.Object> extends org.apache.spark.rdd.RDD<U> implements org.apache.spark.Logging {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  public   BaseRRDD (org.apache.spark.rdd.RDD<T> parent, int numPartitions, byte[] func, java.lang.String deserializer, java.lang.String serializer, byte[] packageNames, org.apache.spark.broadcast.Broadcast<java.lang.Object>[] broadcastVars, scala.reflect.ClassTag<T> evidence$1, scala.reflect.ClassTag<U> evidence$2) { throw new RuntimeException(); }
  protected  java.io.DataInputStream dataStream () { throw new RuntimeException(); }
  private  double bootTime () { throw new RuntimeException(); }
  public  org.apache.spark.Partition[] getPartitions () { throw new RuntimeException(); }
  public  scala.collection.Iterator<U> compute (org.apache.spark.Partition partition, org.apache.spark.TaskContext context) { throw new RuntimeException(); }
  /**
   * Start a thread to write RDD data to the R process.
   * @param output (undocumented)
   * @param iter (undocumented)
   * @param partition (undocumented)
   */
  private <T extends java.lang.Object> void startStdinThread (java.io.OutputStream output, scala.collection.Iterator<T> iter, int partition) { throw new RuntimeException(); }
  protected abstract  U readData (int length) ;
  protected  U read () { throw new RuntimeException(); }
}
