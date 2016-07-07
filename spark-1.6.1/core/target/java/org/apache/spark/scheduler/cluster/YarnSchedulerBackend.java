package org.apache.spark.scheduler.cluster;
/**
 * Abstract Yarn scheduler backend that contains common logic
 * between the client and cluster Yarn scheduler backends.
 */
 abstract class YarnSchedulerBackend extends org.apache.spark.scheduler.cluster.CoarseGrainedSchedulerBackend {
  /**
   * Override the DriverEndpoint to add extra logic for the case when an executor is disconnected.
   * This endpoint communicates with the executors and queries the AM for an executor's exit
   * status when the executor is disconnected.
   */
  private  class YarnDriverEndpoint extends org.apache.spark.scheduler.cluster.CoarseGrainedSchedulerBackend.DriverEndpoint {
    public   YarnDriverEndpoint (org.apache.spark.rpc.RpcEnv rpcEnv, scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> sparkProperties) { throw new RuntimeException(); }
    /**
     * When onDisconnected is received at the driver endpoint, the superclass DriverEndpoint
     * handles it by assuming the Executor was lost for a bad reason and removes the executor
     * immediately.
     * <p>
     * In YARN's case however it is crucial to talk to the application master and ask why the
     * executor had exited. If the executor exited for some reason unrelated to the running tasks
     * (e.g., preemption), according to the application master, then we pass that information down
     * to the TaskSetManager to inform the TaskSetManager that tasks on that lost executor should
     * not count towards a job failure.
     * @param rpcAddress (undocumented)
     */
    public  void onDisconnected (org.apache.spark.rpc.RpcAddress rpcAddress) { throw new RuntimeException(); }
  }
  /**
   * An {@link RpcEndpoint} that communicates with the ApplicationMaster.
   */
  private  class YarnSchedulerEndpoint implements org.apache.spark.rpc.ThreadSafeRpcEndpoint, org.apache.spark.Logging {
    public  org.apache.spark.rpc.RpcEnv rpcEnv () { throw new RuntimeException(); }
    // not preceding
    public   YarnSchedulerEndpoint (org.apache.spark.rpc.RpcEnv rpcEnv) { throw new RuntimeException(); }
    private  scala.Option<org.apache.spark.rpc.RpcEndpointRef> amEndpoint () { throw new RuntimeException(); }
    private  java.util.concurrent.ThreadPoolExecutor askAmThreadPool () { throw new RuntimeException(); }
    public  scala.concurrent.ExecutionContextExecutor askAmExecutor () { throw new RuntimeException(); }
      void handleExecutorDisconnectedFromDriver (java.lang.String executorId, org.apache.spark.rpc.RpcAddress executorRpcAddress) { throw new RuntimeException(); }
    public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive () { throw new RuntimeException(); }
    public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveAndReply (org.apache.spark.rpc.RpcCallContext context) { throw new RuntimeException(); }
    public  void onDisconnected (org.apache.spark.rpc.RpcAddress remoteAddress) { throw new RuntimeException(); }
    public  void onStop () { throw new RuntimeException(); }
  }
  static public  java.lang.String ENDPOINT_NAME () { throw new RuntimeException(); }
  public   YarnSchedulerBackend (org.apache.spark.scheduler.TaskSchedulerImpl scheduler, org.apache.spark.SparkContext sc) { throw new RuntimeException(); }
  protected  int totalExpectedExecutors () { throw new RuntimeException(); }
  private  org.apache.spark.scheduler.cluster.YarnSchedulerBackend.YarnSchedulerEndpoint yarnSchedulerEndpoint () { throw new RuntimeException(); }
  private  org.apache.spark.rpc.RpcEndpointRef yarnSchedulerEndpointRef () { throw new RuntimeException(); }
  private  org.apache.spark.rpc.RpcTimeout askTimeout () { throw new RuntimeException(); }
  /**
   * Request executors from the ApplicationMaster by specifying the total number desired.
   * This includes executors already pending or running.
   * @param requestedTotal (undocumented)
   * @return (undocumented)
   */
  public  boolean doRequestTotalExecutors (int requestedTotal) { throw new RuntimeException(); }
  /**
   * Request that the ApplicationMaster kill the specified executors.
   * @param executorIds (undocumented)
   * @return (undocumented)
   */
  public  boolean doKillExecutors (scala.collection.Seq<java.lang.String> executorIds) { throw new RuntimeException(); }
  public  boolean sufficientResourcesRegistered () { throw new RuntimeException(); }
  /**
   * Add filters to the SparkUI.
   * @param filterName (undocumented)
   * @param filterParams (undocumented)
   * @param proxyBase (undocumented)
   */
  private  void addWebUIFilter (java.lang.String filterName, scala.collection.immutable.Map<java.lang.String, java.lang.String> filterParams, java.lang.String proxyBase) { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.cluster.CoarseGrainedSchedulerBackend.DriverEndpoint createDriverEndpoint (scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> properties) { throw new RuntimeException(); }
}
