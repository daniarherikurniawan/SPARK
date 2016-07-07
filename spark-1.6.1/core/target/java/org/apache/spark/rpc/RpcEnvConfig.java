package org.apache.spark.rpc;
  class RpcEnvConfig implements scala.Product, scala.Serializable {
  public  org.apache.spark.SparkConf conf () { throw new RuntimeException(); }
  public  java.lang.String name () { throw new RuntimeException(); }
  public  java.lang.String host () { throw new RuntimeException(); }
  public  int port () { throw new RuntimeException(); }
  public  org.apache.spark.SecurityManager securityManager () { throw new RuntimeException(); }
  public  boolean clientMode () { throw new RuntimeException(); }
  // not preceding
  public   RpcEnvConfig (org.apache.spark.SparkConf conf, java.lang.String name, java.lang.String host, int port, org.apache.spark.SecurityManager securityManager, boolean clientMode) { throw new RuntimeException(); }
}
