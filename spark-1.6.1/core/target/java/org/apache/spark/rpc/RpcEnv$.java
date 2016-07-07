package org.apache.spark.rpc;
// no position
/**
 * A RpcEnv implementation must have a {@link RpcEnvFactory} implementation with an empty constructor
 * so that it can be created via Reflection.
 */
  class RpcEnv$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RpcEnv$ MODULE$ = null;
  public   RpcEnv$ () { throw new RuntimeException(); }
  private  org.apache.spark.rpc.RpcEnvFactory getRpcEnvFactory (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEnv create (java.lang.String name, java.lang.String host, int port, org.apache.spark.SparkConf conf, org.apache.spark.SecurityManager securityManager, boolean clientMode) { throw new RuntimeException(); }
}
