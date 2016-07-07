package org.apache.spark.storage;
/**
 * Creates and maintains the logical mapping between logical blocks and tachyon fs locations. By
 * default, one block is mapped to one file with a name given by its BlockId.
 * <p>
 */
  class TachyonBlockManager extends org.apache.spark.storage.ExternalBlockManager implements org.apache.spark.Logging {
  public   TachyonBlockManager () { throw new RuntimeException(); }
  public  java.lang.String rootDirs () { throw new RuntimeException(); }
  public  java.lang.String master () { throw new RuntimeException(); }
  public  tachyon.client.TachyonFS client () { throw new RuntimeException(); }
  private  int subDirsPerTachyonDir () { throw new RuntimeException(); }
  private  tachyon.client.TachyonFile[] tachyonDirs () { throw new RuntimeException(); }
  private  tachyon.client.TachyonFile[][] subDirs () { throw new RuntimeException(); }
  public  void init (org.apache.spark.storage.BlockManager blockManager, java.lang.String executorId) { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  public  boolean removeBlock (org.apache.spark.storage.BlockId blockId) { throw new RuntimeException(); }
  public  boolean blockExists (org.apache.spark.storage.BlockId blockId) { throw new RuntimeException(); }
  public  void putBytes (org.apache.spark.storage.BlockId blockId, java.nio.ByteBuffer bytes) { throw new RuntimeException(); }
  public  void putValues (org.apache.spark.storage.BlockId blockId, scala.collection.Iterator<java.lang.Object> values) { throw new RuntimeException(); }
  public  scala.Option<java.nio.ByteBuffer> getBytes (org.apache.spark.storage.BlockId blockId) { throw new RuntimeException(); }
  public  scala.Option<scala.collection.Iterator<java.lang.Object>> getValues (org.apache.spark.storage.BlockId blockId) { throw new RuntimeException(); }
  public  long getSize (org.apache.spark.storage.BlockId blockId) { throw new RuntimeException(); }
  public  boolean removeFile (tachyon.client.TachyonFile file) { throw new RuntimeException(); }
  public  boolean fileExists (tachyon.client.TachyonFile file) { throw new RuntimeException(); }
  public  tachyon.client.TachyonFile getFile (java.lang.String filename) { throw new RuntimeException(); }
  public  tachyon.client.TachyonFile getFile (org.apache.spark.storage.BlockId blockId) { throw new RuntimeException(); }
  private  tachyon.client.TachyonFile[] createTachyonDirs () { throw new RuntimeException(); }
  public  void shutdown () { throw new RuntimeException(); }
}
