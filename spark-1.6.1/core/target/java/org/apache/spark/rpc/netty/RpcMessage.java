package org.apache.spark.rpc.netty;
  class RpcMessage implements org.apache.spark.rpc.netty.InboxMessage, scala.Product, scala.Serializable {
  public  org.apache.spark.rpc.RpcAddress senderAddress () { throw new RuntimeException(); }
  public  Object content () { throw new RuntimeException(); }
  public  org.apache.spark.rpc.netty.NettyRpcCallContext context () { throw new RuntimeException(); }
  // not preceding
  public   RpcMessage (org.apache.spark.rpc.RpcAddress senderAddress, Object content, org.apache.spark.rpc.netty.NettyRpcCallContext context) { throw new RuntimeException(); }
}
