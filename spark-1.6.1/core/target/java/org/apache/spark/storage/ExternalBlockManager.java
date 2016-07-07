package org.apache.spark.storage;
/**
 * An abstract class that the concrete external block manager has to inherit.
 * The class has to have a no-argument constructor, and will be initialized by init,
 * which is invoked by ExternalBlockStore. The main input parameter is blockId for all
 * the methods, which is the unique identifier for Block in one Spark application.
 * <p>
 * The underlying external block manager should avoid any name space conflicts  among multiple
 * Spark applications. For example, creating different directory for different applications
 * by randomUUID
 * <p>
 */
 abstract class ExternalBlockManager {
  public   ExternalBlockManager () { throw new RuntimeException(); }
  protected  org.apache.spark.storage.BlockManager blockManager () { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  /**
   * Initialize a concrete block manager implementation. Subclass should initialize its internal
   * data structure, e.g, file system, in this function, which is invoked by ExternalBlockStore
   * right after the class is constructed. The function should throw IOException on failure
   * <p>
   * @throws java.io.IOException if there is any file system failure during the initialization.
   * @param blockManager (undocumented)
   * @param executorId (undocumented)
   */
  public  void init (org.apache.spark.storage.BlockManager blockManager, java.lang.String executorId) { throw new RuntimeException(); }
  /**
   * Drop the block from underlying external block store, if it exists..
   * @return true on successfully removing the block
   *         false if the block could not be removed as it was not found
   * <p>
   * @throws java.io.IOException if there is any file system failure in removing the block.
   * @param blockId (undocumented)
   */
  public abstract  boolean removeBlock (org.apache.spark.storage.BlockId blockId) ;
  /**
   * Used by BlockManager to check the existence of the block in the underlying external
   * block store.
   * @return true if the block exists.
   *         false if the block does not exists.
   * <p>
   * @throws java.io.IOException if there is any file system failure in checking
   *                             the block existence.
   * @param blockId (undocumented)
   */
  public abstract  boolean blockExists (org.apache.spark.storage.BlockId blockId) ;
  /**
   * Put the given block to the underlying external block store. Note that in normal case,
   * putting a block should never fail unless something wrong happens to the underlying
   * external block store, e.g., file system failure, etc. In this case, IOException
   * should be thrown.
   * <p>
   * @throws java.io.IOException if there is any file system failure in putting the block.
   * @param blockId (undocumented)
   * @param bytes (undocumented)
   */
  public abstract  void putBytes (org.apache.spark.storage.BlockId blockId, java.nio.ByteBuffer bytes) ;
  public  void putValues (org.apache.spark.storage.BlockId blockId, scala.collection.Iterator<java.lang.Object> values) { throw new RuntimeException(); }
  /**
   * Retrieve the block bytes.
   * @return Some(ByteBuffer) if the block bytes is successfully retrieved
   *         None if the block does not exist in the external block store.
   * <p>
   * @throws java.io.IOException if there is any file system failure in getting the block.
   * @param blockId (undocumented)
   */
  public abstract  scala.Option<java.nio.ByteBuffer> getBytes (org.apache.spark.storage.BlockId blockId) ;
  /**
   * Retrieve the block data.
   * @return Some(Iterator[Any]) if the block data is successfully retrieved
   *         None if the block does not exist in the external block store.
   * <p>
   * @throws java.io.IOException if there is any file system failure in getting the block.
   * @param blockId (undocumented)
   */
  public  scala.Option<scala.collection.Iterator<java.lang.Object>> getValues (org.apache.spark.storage.BlockId blockId) { throw new RuntimeException(); }
  /**
   * Get the size of the block saved in the underlying external block store,
   * which is saved before by putBytes.
   * @return size of the block
   *         0 if the block does not exist
   * <p>
   * @throws java.io.IOException if there is any file system failure in getting the block size.
   * @param blockId (undocumented)
   */
  public abstract  long getSize (org.apache.spark.storage.BlockId blockId) ;
  /**
   * Clean up any information persisted in the underlying external block store,
   * e.g., the directory, files, etc,which is invoked by the shutdown hook of ExternalBlockStore
   * during system shutdown.
   * <p>
   */
  public abstract  void shutdown () ;
}
