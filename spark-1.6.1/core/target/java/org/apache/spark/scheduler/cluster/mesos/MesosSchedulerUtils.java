package org.apache.spark.scheduler.cluster.mesos;
/**
 * Shared trait for implementing a Mesos Scheduler. This holds common state and helper
 * methods the Mesos scheduler will use.
 */
  interface MesosSchedulerUtils extends org.apache.spark.Logging {
  public  java.util.concurrent.CountDownLatch registerLatch () ;
  public  org.apache.mesos.SchedulerDriver mesosDriver () ;
  /**
   * Creates a new MesosSchedulerDriver that communicates to the Mesos master.
   * @param masterUrl The url to connect to Mesos master
   * @param scheduler the scheduler class to receive scheduler callbacks
   * @param sparkUser User to impersonate with when running tasks
   * @param appName The framework name to display on the Mesos UI
   * @param conf Spark configuration
   * @param webuiUrl The WebUI url to link from Mesos UI
   * @param checkpoint Option to checkpoint tasks for failover
   * @param failoverTimeout Duration Mesos master expect scheduler to reconnect on disconnect
   * @param frameworkId The id of the new framework
   * @return (undocumented)
   */
  public  org.apache.mesos.SchedulerDriver createSchedulerDriver (java.lang.String masterUrl, org.apache.mesos.Scheduler scheduler, java.lang.String sparkUser, java.lang.String appName, org.apache.spark.SparkConf conf, scala.Option<java.lang.String> webuiUrl, scala.Option<java.lang.Object> checkpoint, scala.Option<java.lang.Object> failoverTimeout, scala.Option<java.lang.String> frameworkId) ;
  /**
   * Starts the MesosSchedulerDriver and stores the current running driver to this new instance.
   * This driver is expected to not be running.
   * This method returns only after the scheduler has registered with Mesos.
   * @param newDriver (undocumented)
   */
  public  void startScheduler (org.apache.mesos.SchedulerDriver newDriver) ;
  /**
   * Signal that the scheduler has registered with Mesos.
   * @param res (undocumented)
   * @param name (undocumented)
   * @return (undocumented)
   */
  public  double getResource (java.util.List<org.apache.mesos.Protos.Resource> res, java.lang.String name) ;
  public  void markRegistered () ;
  public  org.apache.mesos.Protos.Resource createResource (java.lang.String name, double amount, scala.Option<java.lang.String> role) ;
  /**
   * Partition the existing set of resources into two groups, those remaining to be
   * scheduled and those requested to be used for a new task.
   * @param resources The full list of available resources
   * @param resourceName The name of the resource to take from the available resources
   * @param amountToUse The amount of resources to take from the available resources
   * @return The remaining resources list and the used resources list.
   */
  public  scala.Tuple2<scala.collection.immutable.List<org.apache.mesos.Protos.Resource>, scala.collection.immutable.List<org.apache.mesos.Protos.Resource>> partitionResources (java.util.List<org.apache.mesos.Protos.Resource> resources, java.lang.String resourceName, double amountToUse) ;
  /** Helper method to get the key,value-set pair for a Mesos Attribute protobuf */
  public  scala.Tuple2<java.lang.String, scala.collection.immutable.Set<java.lang.String>> getAttribute (org.apache.mesos.Protos.Attribute attr) ;
  /** Build a Mesos resource protobuf object */
  public  org.apache.mesos.Protos.Resource createResource (java.lang.String resourceName, double quantity) ;
  /**
   * Converts the attributes from the resource offer into a Map of name -> Attribute Value
   * The attribute values are the mesos attribute types and they are
   * @param offerAttributes
   * @return
   */
  public  scala.collection.immutable.Map<java.lang.String, org.apache.mesos.protobuf.GeneratedMessage> toAttributeMap (java.util.List<org.apache.mesos.Protos.Attribute> offerAttributes) ;
  /**
   * Match the requirements (if any) to the offer attributes.
   * if attribute requirements are not specified - return true
   * else if attribute is defined and no values are given, simple attribute presence is performed
   * else if attribute name and value is specified, subset match is performed on slave attributes
   * @param slaveOfferConstraints (undocumented)
   * @param offerAttributes (undocumented)
   * @return (undocumented)
   */
  public  boolean matchesAttributeRequirements (scala.collection.immutable.Map<java.lang.String, scala.collection.immutable.Set<java.lang.String>> slaveOfferConstraints, scala.collection.immutable.Map<java.lang.String, org.apache.mesos.protobuf.GeneratedMessage> offerAttributes) ;
  /**
   * Parses the attributes constraints provided to spark and build a matching data struct:
   *  Map[<attribute-name>, Set[values-to-match}
   *  The constraints are specified as ';' separated key-value pairs where keys and values
   *  are separated by ':'. The ':' implies equality (for singular values) and "is one of" for
   *  multiple values (comma separated). For example:
   *  <pre><code>
   *  parseConstraintString("tachyon:true;zone:us-east-1a,us-east-1b")
   *  // would result in
   *  &lt;code&gt;
   *  Map(
   *    "tachyon" -&gt; Set("true"),
   *    "zone":   -&gt; Set("us-east-1a", "us-east-1b")
   *  )
   *  </code></pre>
   * <p>
   *  Mesos documentation: http://mesos.apache.org/documentation/attributes-resources/
   *                       https://github.com/apache/mesos/blob/master/src/common/values.cpp
   *                       https://github.com/apache/mesos/blob/master/src/common/attributes.cpp
   * <p>
   * @param constraintsVal constaints string consisting of ';' separated key-value pairs (separated
   *                       by ':')
   * @return  Map of constraints to match resources offers.
   */
  public  scala.collection.immutable.Map<java.lang.String, scala.collection.immutable.Set<java.lang.String>> parseConstraintString (java.lang.String constraintsVal) ;
  public  double MEMORY_OVERHEAD_FRACTION () ;
  public  int MEMORY_OVERHEAD_MINIMUM () ;
  /**
   * Return the amount of memory to allocate to each executor, taking into account
   * container overheads.
   * @param sc SparkContext to use to get <code>spark.mesos.executor.memoryOverhead</code> value
   * @return memory requirement as (0.1 * <memoryOverhead>) or MEMORY_OVERHEAD_MINIMUM
   *         (whichever is larger)
   */
  public  int calculateTotalMemory (org.apache.spark.SparkContext sc) ;
  public  void setupUris (java.lang.String uris, org.apache.mesos.Protos.CommandInfo.Builder builder) ;
  public  long getRejectOfferDurationForUnmetConstraints (org.apache.spark.SparkContext sc) ;
}
