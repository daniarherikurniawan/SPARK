package org.apache.spark.storage;
/**
 * Stores BlockManager blocks on ExternalBlockStore.
 * We capture any potential exception from underlying implementation
 * and return with the expected failure value
 */
  class ExternalBlockStore extends org.apache.spark.storage.BlockStore implements org.apache.spark.Logging {
  static public  int MAX_DIR_CREATION_ATTEMPTS () { throw new RuntimeException(); }
  static public  java.lang.String SUB_DIRS_PER_DIR () { throw new RuntimeException(); }
  static public  java.lang.String BASE_DIR () { throw new RuntimeException(); }
  static public  java.lang.String FOLD_NAME () { throw new RuntimeException(); }
  static public  java.lang.String MASTER_URL () { throw new RuntimeException(); }
  static public  java.lang.String BLOCK_MANAGER_NAME () { throw new RuntimeException(); }
  static public  java.lang.String DEFAULT_BLOCK_MANAGER_NAME () { throw new RuntimeException(); }
  public   ExternalBlockStore (org.apache.spark.storage.BlockManager blockManager, java.lang.String executorId) { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.storage.ExternalBlockManager> externalBlockManager () { throw new RuntimeException(); }
  public  long getSize (org.apache.spark.storage.BlockId blockId) { throw new RuntimeException(); }
  public  org.apache.spark.storage.PutResult putBytes (org.apache.spark.storage.BlockId blockId, java.nio.ByteBuffer bytes, org.apache.spark.storage.StorageLevel level) { throw new RuntimeException(); }
  public  org.apache.spark.storage.PutResult putArray (org.apache.spark.storage.BlockId blockId, java.lang.Object[] values, org.apache.spark.storage.StorageLevel level, boolean returnValues) { throw new RuntimeException(); }
  public  org.apache.spark.storage.PutResult putIterator (org.apache.spark.storage.BlockId blockId, scala.collection.Iterator<java.lang.Object> values, org.apache.spark.storage.StorageLevel level, boolean returnValues) { throw new RuntimeException(); }
  private  org.apache.spark.storage.PutResult putIntoExternalBlockStore (org.apache.spark.storage.BlockId blockId, scala.collection.Iterator<java.lang.Object> values, boolean returnValues) { throw new RuntimeException(); }
  private  org.apache.spark.storage.PutResult putIntoExternalBlockStore (org.apache.spark.storage.BlockId blockId, java.nio.ByteBuffer bytes, boolean returnValues) { throw new RuntimeException(); }
  public  boolean remove (org.apache.spark.storage.BlockId blockId) { throw new RuntimeException(); }
  public  scala.Option<scala.collection.Iterator<java.lang.Object>> getValues (org.apache.spark.storage.BlockId blockId) { throw new RuntimeException(); }
  public  scala.Option<java.nio.ByteBuffer> getBytes (org.apache.spark.storage.BlockId blockId) { throw new RuntimeException(); }
  public  boolean contains (org.apache.spark.storage.BlockId blockId) { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.storage.ExternalBlockManager> createBlkManager () { throw new RuntimeException(); }
}
