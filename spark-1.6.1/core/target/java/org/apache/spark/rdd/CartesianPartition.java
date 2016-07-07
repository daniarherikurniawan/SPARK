package org.apache.spark.rdd;
  class CartesianPartition implements org.apache.spark.Partition {
  private  Object rdd1 () { throw new RuntimeException(); }
  private  Object rdd2 () { throw new RuntimeException(); }
  // not preceding
  public   CartesianPartition (int idx, org.apache.spark.rdd.RDD<?> rdd1, org.apache.spark.rdd.RDD<?> rdd2, int s1Index, int s2Index) { throw new RuntimeException(); }
  public  org.apache.spark.Partition s1 () { throw new RuntimeException(); }
  public  org.apache.spark.Partition s2 () { throw new RuntimeException(); }
  public  int index () { throw new RuntimeException(); }
  private  void writeObject (java.io.ObjectOutputStream oos) { throw new RuntimeException(); }
}
