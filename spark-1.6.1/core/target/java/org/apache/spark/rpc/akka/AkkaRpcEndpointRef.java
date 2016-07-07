package org.apache.spark.rpc.akka;
  class AkkaRpcEndpointRef extends org.apache.spark.rpc.RpcEndpointRef implements org.apache.spark.Logging {
  private  org.apache.spark.rpc.RpcAddress defaultAddress () { throw new RuntimeException(); }
  private  scala.Function0<akka.actor.ActorRef> _actorRef () { throw new RuntimeException(); }
  // not preceding
  public   AkkaRpcEndpointRef (org.apache.spark.rpc.RpcAddress defaultAddress, scala.Function0<akka.actor.ActorRef> _actorRef, org.apache.spark.SparkConf conf, boolean initInConstructor) { throw new RuntimeException(); }
  public   AkkaRpcEndpointRef (org.apache.spark.rpc.RpcAddress defaultAddress, akka.actor.ActorRef _actorRef, org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  public  akka.actor.ActorRef actorRef () { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcAddress address () { throw new RuntimeException(); }
  public  java.lang.String name () { throw new RuntimeException(); }
    void init () { throw new RuntimeException(); }
  public  void send (Object message) { throw new RuntimeException(); }
  public <T extends java.lang.Object> scala.concurrent.Future<T> ask (Object message, org.apache.spark.rpc.RpcTimeout timeout, scala.reflect.ClassTag<T> evidence$1) { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  public final  boolean equals (Object that) { throw new RuntimeException(); }
  public final  int hashCode () { throw new RuntimeException(); }
}
