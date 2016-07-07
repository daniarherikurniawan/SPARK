package org.apache.spark.rpc.netty;
/**
 * A response that indicates some failure happens in the receiver side.
 */
  class RpcFailure implements scala.Product, scala.Serializable {
  public  java.lang.Throwable e () { throw new RuntimeException(); }
  // not preceding
  public   RpcFailure (java.lang.Throwable e) { throw new RuntimeException(); }
}
