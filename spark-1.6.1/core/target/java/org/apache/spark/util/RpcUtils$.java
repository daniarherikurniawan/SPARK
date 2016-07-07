package org.apache.spark.util;
// no position
public  class RpcUtils$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RpcUtils$ MODULE$ = null;
  public   RpcUtils$ () { throw new RuntimeException(); }
  /**
   * Retrieve a {@link RpcEndpointRef} which is located in the driver via its name.
   * @param name (undocumented)
   * @param conf (undocumented)
   * @param rpcEnv (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rpc.RpcEndpointRef makeDriverRef (java.lang.String name, org.apache.spark.SparkConf conf, org.apache.spark.rpc.RpcEnv rpcEnv) { throw new RuntimeException(); }
  /** Returns the configured number of times to retry connecting */
  public  int numRetries (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  /** Returns the configured number of milliseconds to wait on each retry */
  public  long retryWaitMs (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  /** Returns the default Spark timeout to use for RPC ask operations. */
    org.apache.spark.rpc.RpcTimeout askRpcTimeout (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  public  scala.concurrent.duration.FiniteDuration askTimeout (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  /** Returns the default Spark timeout to use for RPC remote endpoint lookup. */
    org.apache.spark.rpc.RpcTimeout lookupRpcTimeout (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  public  scala.concurrent.duration.FiniteDuration lookupTimeout (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
}
