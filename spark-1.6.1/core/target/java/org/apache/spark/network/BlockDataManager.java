package org.apache.spark.network;
  interface BlockDataManager {
  /**
   * Interface to get local block data. Throws an exception if the block cannot be found or
   * cannot be read successfully.
   * @param blockId (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.network.buffer.ManagedBuffer getBlockData (org.apache.spark.storage.BlockId blockId) ;
  /**
   * Put the block locally, using the given storage level.
   * @param blockId (undocumented)
   * @param data (undocumented)
   * @param level (undocumented)
   */
  public  void putBlockData (org.apache.spark.storage.BlockId blockId, org.apache.spark.network.buffer.ManagedBuffer data, org.apache.spark.storage.StorageLevel level) ;
}
