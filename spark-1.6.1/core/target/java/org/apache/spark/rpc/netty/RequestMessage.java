package org.apache.spark.rpc.netty;
/**
 * The message that is sent from the sender to the receiver.
 */
  class RequestMessage implements scala.Product, scala.Serializable {
  public  org.apache.spark.rpc.RpcAddress senderAddress () { throw new RuntimeException(); }
  public  org.apache.spark.rpc.netty.NettyRpcEndpointRef receiver () { throw new RuntimeException(); }
  public  Object content () { throw new RuntimeException(); }
  // not preceding
  public   RequestMessage (org.apache.spark.rpc.RpcAddress senderAddress, org.apache.spark.rpc.netty.NettyRpcEndpointRef receiver, Object content) { throw new RuntimeException(); }
}
