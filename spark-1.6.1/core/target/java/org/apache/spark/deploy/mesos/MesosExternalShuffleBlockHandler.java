package org.apache.spark.deploy.mesos;
/**
 * An RPC endpoint that receives registration requests from Spark drivers running on Mesos.
 * It detects driver termination and calls the cleanup callback to {@link ExternalShuffleService}.
 */
  class MesosExternalShuffleBlockHandler extends org.apache.spark.network.shuffle.ExternalShuffleBlockHandler implements org.apache.spark.Logging {
  public   MesosExternalShuffleBlockHandler (org.apache.spark.network.util.TransportConf transportConf) { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.net.SocketAddress, java.lang.String> connectedApps () { throw new RuntimeException(); }
  protected  void handleMessage (org.apache.spark.network.shuffle.protocol.BlockTransferMessage message, org.apache.spark.network.client.TransportClient client, org.apache.spark.network.client.RpcResponseCallback callback) { throw new RuntimeException(); }
  /**
   * On connection termination, clean up shuffle files written by the associated application.
   * @param client (undocumented)
   */
  public  void connectionTerminated (org.apache.spark.network.client.TransportClient client) { throw new RuntimeException(); }
  // no position
  private  class RegisterDriverParam {
    /** An extractor object for matching {@link RegisterDriver} message. */
    public   RegisterDriverParam () { throw new RuntimeException(); }
    public  scala.Option<java.lang.String> unapply (org.apache.spark.network.shuffle.protocol.mesos.RegisterDriver r) { throw new RuntimeException(); }
  }
  private  org.apache.spark.deploy.mesos.MesosExternalShuffleBlockHandler.RegisterDriverParam$ RegisterDriverParam () { throw new RuntimeException(); }
}
