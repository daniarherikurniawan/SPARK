package org.apache.spark.storage;
  class BlockUIData implements scala.Product, scala.Serializable {
  public  org.apache.spark.storage.BlockId blockId () { throw new RuntimeException(); }
  public  java.lang.String location () { throw new RuntimeException(); }
  public  org.apache.spark.storage.StorageLevel storageLevel () { throw new RuntimeException(); }
  public  long memSize () { throw new RuntimeException(); }
  public  long diskSize () { throw new RuntimeException(); }
  public  long externalBlockStoreSize () { throw new RuntimeException(); }
  // not preceding
  public   BlockUIData (org.apache.spark.storage.BlockId blockId, java.lang.String location, org.apache.spark.storage.StorageLevel storageLevel, long memSize, long diskSize, long externalBlockStoreSize) { throw new RuntimeException(); }
}
