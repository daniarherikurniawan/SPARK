package org.apache.spark.rpc.netty;
/** A message to tell all endpoints that a network error has happened. */
  class RemoteProcessConnectionError implements org.apache.spark.rpc.netty.InboxMessage, scala.Product, scala.Serializable {
  public  java.lang.Throwable cause () { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcAddress remoteAddress () { throw new RuntimeException(); }
  // not preceding
  public   RemoteProcessConnectionError (java.lang.Throwable cause, org.apache.spark.rpc.RpcAddress remoteAddress) { throw new RuntimeException(); }
}
