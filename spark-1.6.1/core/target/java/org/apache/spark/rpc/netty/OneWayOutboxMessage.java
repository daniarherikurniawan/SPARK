package org.apache.spark.rpc.netty;
  class OneWayOutboxMessage implements org.apache.spark.rpc.netty.OutboxMessage, org.apache.spark.Logging, scala.Product, scala.Serializable {
  public  java.nio.ByteBuffer content () { throw new RuntimeException(); }
  // not preceding
  public   OneWayOutboxMessage (java.nio.ByteBuffer content) { throw new RuntimeException(); }
  public  void sendWith (org.apache.spark.network.client.TransportClient client) { throw new RuntimeException(); }
  public  void onFailure (java.lang.Throwable e) { throw new RuntimeException(); }
}
