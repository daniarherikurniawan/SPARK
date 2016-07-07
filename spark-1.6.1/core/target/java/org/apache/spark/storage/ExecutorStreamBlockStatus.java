package org.apache.spark.storage;
  class ExecutorStreamBlockStatus implements scala.Product, scala.Serializable {
  public  java.lang.String executorId () { throw new RuntimeException(); }
  public  java.lang.String location () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.storage.BlockUIData> blocks () { throw new RuntimeException(); }
  public   ExecutorStreamBlockStatus (java.lang.String executorId, java.lang.String location, scala.collection.Seq<org.apache.spark.storage.BlockUIData> blocks) { throw new RuntimeException(); }
  public  long totalMemSize () { throw new RuntimeException(); }
  public  long totalDiskSize () { throw new RuntimeException(); }
  public  long totalExternalBlockStoreSize () { throw new RuntimeException(); }
  public  int numStreamBlocks () { throw new RuntimeException(); }
}
