package org.apache.spark.deploy.worker;
/**
 * Actor which connects to a worker process and terminates the JVM if the connection is severed.
 * Provides fate sharing between a worker and its associated child processes.
 */
  class WorkerWatcher implements org.apache.spark.rpc.RpcEndpoint, org.apache.spark.Logging {
  public  org.apache.spark.rpc.RpcEnv rpcEnv () { throw new RuntimeException(); }
  // not preceding
  public   WorkerWatcher (org.apache.spark.rpc.RpcEnv rpcEnv, java.lang.String workerUrl, boolean isTesting) { throw new RuntimeException(); }
  public  boolean isShutDown () { throw new RuntimeException(); }
  private  org.apache.spark.rpc.RpcAddress expectedAddress () { throw new RuntimeException(); }
  private  boolean isWorker (org.apache.spark.rpc.RpcAddress address) { throw new RuntimeException(); }
  private  void exitNonZero () { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive () { throw new RuntimeException(); }
  public  void onConnected (org.apache.spark.rpc.RpcAddress remoteAddress) { throw new RuntimeException(); }
  public  void onDisconnected (org.apache.spark.rpc.RpcAddress remoteAddress) { throw new RuntimeException(); }
  public  void onNetworkError (java.lang.Throwable cause, org.apache.spark.rpc.RpcAddress remoteAddress) { throw new RuntimeException(); }
}
