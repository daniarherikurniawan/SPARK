package org.apache.spark.executor;
  class CoarseGrainedExecutorBackend implements org.apache.spark.rpc.ThreadSafeRpcEndpoint, org.apache.spark.executor.ExecutorBackend, org.apache.spark.Logging {
  static private  void run (java.lang.String driverUrl, java.lang.String executorId, java.lang.String hostname, int cores, java.lang.String appId, scala.Option<java.lang.String> workerUrl, scala.collection.Seq<java.net.URL> userClassPath) { throw new RuntimeException(); }
  static public  void main (java.lang.String[] args) { throw new RuntimeException(); }
  static private  void printUsageAndExit () { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEnv rpcEnv () { throw new RuntimeException(); }
  // not preceding
  public   CoarseGrainedExecutorBackend (org.apache.spark.rpc.RpcEnv rpcEnv, java.lang.String driverUrl, java.lang.String executorId, java.lang.String hostPort, int cores, scala.collection.Seq<java.net.URL> userClassPath, org.apache.spark.SparkEnv env) { throw new RuntimeException(); }
  public  org.apache.spark.executor.Executor executor () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.rpc.RpcEndpointRef> driver () { throw new RuntimeException(); }
  public  void onStart () { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> extractLogUrls () { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive () { throw new RuntimeException(); }
  public  void onDisconnected (org.apache.spark.rpc.RpcAddress remoteAddress) { throw new RuntimeException(); }
  public  void statusUpdate (long taskId, scala.Enumeration.Value state, java.nio.ByteBuffer data) { throw new RuntimeException(); }
}
