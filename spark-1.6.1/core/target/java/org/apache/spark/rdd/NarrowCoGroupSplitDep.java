package org.apache.spark.rdd;
/** The references to rdd and splitIndex are transient because redundant information is stored
 * in the CoGroupedRDD object.  Because CoGroupedRDD is serialized separately from
 * CoGroupPartition, if rdd and splitIndex aren't transient, they'll be included twice in the
 * task closure. */
  class NarrowCoGroupSplitDep implements scala.Serializable, scala.Product {
  public  Object rdd () { throw new RuntimeException(); }
  public  int splitIndex () { throw new RuntimeException(); }
  public  org.apache.spark.Partition split () { throw new RuntimeException(); }
  // not preceding
  public   NarrowCoGroupSplitDep (org.apache.spark.rdd.RDD<?> rdd, int splitIndex, org.apache.spark.Partition split) { throw new RuntimeException(); }
  private  void writeObject (java.io.ObjectOutputStream oos) { throw new RuntimeException(); }
}
