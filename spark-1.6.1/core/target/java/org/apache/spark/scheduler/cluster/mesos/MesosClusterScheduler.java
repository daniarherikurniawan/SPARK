package org.apache.spark.scheduler.cluster.mesos;
/**
 * A Mesos scheduler that is responsible for launching submitted Spark drivers in cluster mode
 * as Mesos tasks in a Mesos cluster.
 * All drivers are launched asynchronously by the framework, which will eventually be launched
 * by one of the slaves in the cluster. The results of the driver will be stored in slave's task
 * sandbox which is accessible by visiting the Mesos UI.
 * This scheduler supports recovery by persisting all its state and performs task reconciliation
 * on recover, which gets all the latest state for all the drivers from Mesos master.
 */
  class MesosClusterScheduler implements org.apache.mesos.Scheduler, org.apache.spark.scheduler.cluster.mesos.MesosSchedulerUtils {
  public   MesosClusterScheduler (org.apache.spark.scheduler.cluster.mesos.MesosClusterPersistenceEngineFactory engineFactory, org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  public  java.lang.String frameworkUrl () { throw new RuntimeException(); }
  private  org.apache.spark.metrics.MetricsSystem metricsSystem () { throw new RuntimeException(); }
  private  java.lang.String master () { throw new RuntimeException(); }
  private  java.lang.String appName () { throw new RuntimeException(); }
  private  int queuedCapacity () { throw new RuntimeException(); }
  private  int retainedDrivers () { throw new RuntimeException(); }
  private  int maxRetryWaitTime () { throw new RuntimeException(); }
  private  org.apache.spark.scheduler.cluster.mesos.MesosClusterPersistenceEngine schedulerState () { throw new RuntimeException(); }
  private  java.lang.Object stateLock () { throw new RuntimeException(); }
  private  scala.collection.mutable.ArrayBuffer<org.apache.spark.scheduler.cluster.mesos.MesosClusterSubmissionState> finishedDrivers () { throw new RuntimeException(); }
  private  java.lang.String frameworkId () { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.scheduler.cluster.mesos.MesosClusterSubmissionState> launchedDrivers () { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, org.apache.mesos.Protos.SlaveID> pendingRecover () { throw new RuntimeException(); }
  private  scala.collection.mutable.ArrayBuffer<org.apache.spark.deploy.mesos.MesosDriverDescription> queuedDrivers () { throw new RuntimeException(); }
  private  scala.collection.mutable.ArrayBuffer<org.apache.spark.deploy.mesos.MesosDriverDescription> pendingRetryDrivers () { throw new RuntimeException(); }
  private  org.apache.spark.scheduler.cluster.mesos.MesosClusterPersistenceEngine queuedDriversState () { throw new RuntimeException(); }
  private  org.apache.spark.scheduler.cluster.mesos.MesosClusterPersistenceEngine launchedDriversState () { throw new RuntimeException(); }
  private  org.apache.spark.scheduler.cluster.mesos.MesosClusterPersistenceEngine pendingRetryDriversState () { throw new RuntimeException(); }
  protected  boolean ready () { throw new RuntimeException(); }
  private  scala.Option<org.apache.mesos.Protos.MasterInfo> masterInfo () { throw new RuntimeException(); }
  public  org.apache.spark.deploy.rest.CreateSubmissionResponse submitDriver (org.apache.spark.deploy.mesos.MesosDriverDescription desc) { throw new RuntimeException(); }
  public  org.apache.spark.deploy.rest.KillSubmissionResponse killDriver (java.lang.String submissionId) { throw new RuntimeException(); }
  public  org.apache.spark.deploy.rest.SubmissionStatusResponse getDriverStatus (java.lang.String submissionId) { throw new RuntimeException(); }
  /**
   * Gets the driver state to be displayed on the Web UI.
   * @param submissionId (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.scheduler.cluster.mesos.MesosDriverState> getDriverState (java.lang.String submissionId) { throw new RuntimeException(); }
  private  boolean isQueueFull () { throw new RuntimeException(); }
  /**
   * Recover scheduler state that is persisted.
   * We still need to do task reconciliation to be up to date of the latest task states
   * as it might have changed while the scheduler is failing over.
   */
  private  void recoverState () { throw new RuntimeException(); }
  /**
   * Starts the cluster scheduler and wait until the scheduler is registered.
   * This also marks the scheduler to be ready for requests.
   */
  public  void start () { throw new RuntimeException(); }
  public  void stop () { throw new RuntimeException(); }
  public  void registered (org.apache.mesos.SchedulerDriver driver, org.apache.mesos.Protos.FrameworkID newFrameworkId, org.apache.mesos.Protos.MasterInfo masterInfo) { throw new RuntimeException(); }
  private  org.apache.mesos.Protos.CommandInfo buildDriverCommand (org.apache.spark.deploy.mesos.MesosDriverDescription desc) { throw new RuntimeException(); }
  private  scala.collection.Seq<java.lang.String> generateCmdOption (org.apache.spark.deploy.mesos.MesosDriverDescription desc, java.lang.String sandboxPath) { throw new RuntimeException(); }
  private  class ResourceOffer {
    public  org.apache.mesos.Protos.Offer offer () { throw new RuntimeException(); }
    public  double cpu () { throw new RuntimeException(); }
    public  double mem () { throw new RuntimeException(); }
    // not preceding
    public   ResourceOffer (org.apache.mesos.Protos.Offer offer, double cpu, double mem) { throw new RuntimeException(); }
    public  java.lang.String toString () { throw new RuntimeException(); }
  }
  /**
   * This method takes all the possible candidates and attempt to schedule them with Mesos offers.
   * Every time a new task is scheduled, the afterLaunchCallback is called to perform post scheduled
   * logic on each task.
   * @param candidates (undocumented)
   * @param afterLaunchCallback (undocumented)
   * @param currentOffers (undocumented)
   * @param tasks (undocumented)
   */
  private  void scheduleTasks (scala.collection.Seq<org.apache.spark.deploy.mesos.MesosDriverDescription> candidates, scala.Function1<java.lang.String, java.lang.Object> afterLaunchCallback, scala.collection.immutable.List<org.apache.spark.scheduler.cluster.mesos.MesosClusterScheduler.ResourceOffer> currentOffers, scala.collection.mutable.HashMap<org.apache.mesos.Protos.OfferID, scala.collection.mutable.ArrayBuffer<org.apache.mesos.Protos.TaskInfo>> tasks) { throw new RuntimeException(); }
  public  void resourceOffers (org.apache.mesos.SchedulerDriver driver, java.util.List<org.apache.mesos.Protos.Offer> offers) { throw new RuntimeException(); }
  private  scala.collection.mutable.ArrayBuffer<org.apache.spark.deploy.mesos.MesosDriverDescription> copyBuffer (scala.collection.mutable.ArrayBuffer<org.apache.spark.deploy.mesos.MesosDriverDescription> buffer) { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.cluster.mesos.MesosClusterSchedulerState getSchedulerState () { throw new RuntimeException(); }
  public  void offerRescinded (org.apache.mesos.SchedulerDriver driver, org.apache.mesos.Protos.OfferID offerId) { throw new RuntimeException(); }
  public  void disconnected (org.apache.mesos.SchedulerDriver driver) { throw new RuntimeException(); }
  public  void reregistered (org.apache.mesos.SchedulerDriver driver, org.apache.mesos.Protos.MasterInfo masterInfo) { throw new RuntimeException(); }
  public  void slaveLost (org.apache.mesos.SchedulerDriver driver, org.apache.mesos.Protos.SlaveID slaveId) { throw new RuntimeException(); }
  public  void error (org.apache.mesos.SchedulerDriver driver, java.lang.String error) { throw new RuntimeException(); }
  /**
   * Check if the task state is a recoverable state that we can relaunch the task.
   * Task state like TASK_ERROR are not relaunchable state since it wasn't able
   * to be validated by Mesos.
   * @param state (undocumented)
   * @return (undocumented)
   */
  private  boolean shouldRelaunch (org.apache.mesos.Protos.TaskState state) { throw new RuntimeException(); }
  public  void statusUpdate (org.apache.mesos.SchedulerDriver driver, org.apache.mesos.Protos.TaskStatus status) { throw new RuntimeException(); }
  public  void frameworkMessage (org.apache.mesos.SchedulerDriver driver, org.apache.mesos.Protos.ExecutorID executorId, org.apache.mesos.Protos.SlaveID slaveId, byte[] message) { throw new RuntimeException(); }
  public  void executorLost (org.apache.mesos.SchedulerDriver driver, org.apache.mesos.Protos.ExecutorID executorId, org.apache.mesos.Protos.SlaveID slaveId, int status) { throw new RuntimeException(); }
  private  boolean removeFromQueuedDrivers (java.lang.String id) { throw new RuntimeException(); }
  private  boolean removeFromLaunchedDrivers (java.lang.String id) { throw new RuntimeException(); }
  private  boolean removeFromPendingRetryDrivers (java.lang.String id) { throw new RuntimeException(); }
  public  int getQueuedDriversSize () { throw new RuntimeException(); }
  public  int getLaunchedDriversSize () { throw new RuntimeException(); }
  public  int getPendingRetryDriversSize () { throw new RuntimeException(); }
}
