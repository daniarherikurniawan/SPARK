package org.apache.spark.rpc.netty;
  class RpcOutboxMessage implements org.apache.spark.rpc.netty.OutboxMessage, org.apache.spark.network.client.RpcResponseCallback, scala.Product, scala.Serializable {
  public  java.nio.ByteBuffer content () { throw new RuntimeException(); }
  public  scala.Function1<java.lang.Throwable, scala.runtime.BoxedUnit> _onFailure () { throw new RuntimeException(); }
  public  scala.Function2<org.apache.spark.network.client.TransportClient, java.nio.ByteBuffer, scala.runtime.BoxedUnit> _onSuccess () { throw new RuntimeException(); }
  // not preceding
  public   RpcOutboxMessage (java.nio.ByteBuffer content, scala.Function1<java.lang.Throwable, scala.runtime.BoxedUnit> _onFailure, scala.Function2<org.apache.spark.network.client.TransportClient, java.nio.ByteBuffer, scala.runtime.BoxedUnit> _onSuccess) { throw new RuntimeException(); }
  private  org.apache.spark.network.client.TransportClient client () { throw new RuntimeException(); }
  private  long requestId () { throw new RuntimeException(); }
  public  void sendWith (org.apache.spark.network.client.TransportClient client) { throw new RuntimeException(); }
  public  void onTimeout () { throw new RuntimeException(); }
  public  void onFailure (java.lang.Throwable e) { throw new RuntimeException(); }
  public  void onSuccess (java.nio.ByteBuffer response) { throw new RuntimeException(); }
}
