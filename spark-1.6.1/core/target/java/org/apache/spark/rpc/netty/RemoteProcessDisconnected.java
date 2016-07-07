package org.apache.spark.rpc.netty;
/** A message to tell all endpoints that a remote process has disconnected. */
  class RemoteProcessDisconnected implements org.apache.spark.rpc.netty.InboxMessage, scala.Product, scala.Serializable {
  public  org.apache.spark.rpc.RpcAddress remoteAddress () { throw new RuntimeException(); }
  // not preceding
  public   RemoteProcessDisconnected (org.apache.spark.rpc.RpcAddress remoteAddress) { throw new RuntimeException(); }
}
