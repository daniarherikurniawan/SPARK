package org.apache.spark.deploy;
/**
 * :: DeveloperApi ::
 * Contains util methods to interact with Hadoop from Spark.
 */
public  class SparkHadoopUtil implements org.apache.spark.Logging {
  static private  org.apache.spark.deploy.SparkHadoopUtil hadoop () { throw new RuntimeException(); }
  static private  org.apache.spark.deploy.SparkHadoopUtil yarn () { throw new RuntimeException(); }
  static public  java.lang.String SPARK_YARN_CREDS_TEMP_EXTENSION () { throw new RuntimeException(); }
  static public  java.lang.String SPARK_YARN_CREDS_COUNTER_DELIM () { throw new RuntimeException(); }
  static public  org.apache.spark.deploy.SparkHadoopUtil get () { throw new RuntimeException(); }
  public   SparkHadoopUtil () { throw new RuntimeException(); }
  private  org.apache.spark.SparkConf sparkConf () { throw new RuntimeException(); }
  public  org.apache.hadoop.conf.Configuration conf () { throw new RuntimeException(); }
  /**
   * Runs the given function with a Hadoop UserGroupInformation as a thread local variable
   * (distributed to child threads), used for authenticating HDFS and YARN calls.
   * <p>
   * IMPORTANT NOTE: If this function is going to be called repeated in the same process
   * you need to look https://issues.apache.org/jira/browse/HDFS-3545 and possibly
   * do a FileSystem.closeAllForUGI in order to avoid leaking Filesystems
   * @param func (undocumented)
   */
  public  void runAsSparkUser (scala.Function0<scala.runtime.BoxedUnit> func) { throw new RuntimeException(); }
  public  void transferCredentials (org.apache.hadoop.security.UserGroupInformation source, org.apache.hadoop.security.UserGroupInformation dest) { throw new RuntimeException(); }
  public  org.apache.hadoop.conf.Configuration newConfiguration () { throw new RuntimeException(); }
  /**
   * Return an appropriate (subclass) of Configuration. Creating config can initializes some Hadoop
   * subsystems.
   * @param conf (undocumented)
   * @return (undocumented)
   */
  public  org.apache.hadoop.conf.Configuration newConfiguration (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  /**
   * Add any user credentials to the job conf which are necessary for running on a secure Hadoop
   * cluster.
   * @param conf (undocumented)
   */
  public  void addCredentials (org.apache.hadoop.mapred.JobConf conf) { throw new RuntimeException(); }
  public  boolean isYarnMode () { throw new RuntimeException(); }
  public  org.apache.hadoop.security.Credentials getCurrentUserCredentials () { throw new RuntimeException(); }
  public  void addCurrentUserCredentials (org.apache.hadoop.security.Credentials creds) { throw new RuntimeException(); }
  public  void addSecretKeyToUserCredentials (java.lang.String key, java.lang.String secret) { throw new RuntimeException(); }
  public  byte[] getSecretKeyFromUserCredentials (java.lang.String key) { throw new RuntimeException(); }
  public  void loginUserFromKeytab (java.lang.String principalName, java.lang.String keytabFilename) { throw new RuntimeException(); }
  /**
   * Returns a function that can be called to find Hadoop FileSystem bytes read. If
   * getFSBytesReadOnThreadCallback is called from thread r at time t, the returned callback will
   * return the bytes read on r since t.  Reflection is required because thread-level FileSystem
   * statistics are only available as of Hadoop 2.5 (see HADOOP-10688).
   * Returns None if the required method can't be found.
   * @return (undocumented)
   */
    scala.Option<scala.Function0<java.lang.Object>> getFSBytesReadOnThreadCallback () { throw new RuntimeException(); }
  /**
   * Returns a function that can be called to find Hadoop FileSystem bytes written. If
   * getFSBytesWrittenOnThreadCallback is called from thread r at time t, the returned callback will
   * return the bytes written on r since t.  Reflection is required because thread-level FileSystem
   * statistics are only available as of Hadoop 2.5 (see HADOOP-10688).
   * Returns None if the required method can't be found.
   * @return (undocumented)
   */
    scala.Option<scala.Function0<java.lang.Object>> getFSBytesWrittenOnThreadCallback () { throw new RuntimeException(); }
  private  scala.collection.Seq<java.lang.Object> getFileSystemThreadStatistics () { throw new RuntimeException(); }
  private  java.lang.reflect.Method getFileSystemThreadStatisticsMethod (java.lang.String methodName) { throw new RuntimeException(); }
  /**
   * Using reflection to get the Configuration from JobContext/TaskAttemptContext. If we directly
   * call <code>JobContext/TaskAttemptContext.getConfiguration</code>, it will generate different byte codes
   * for Hadoop 1.+ and Hadoop 2.+ because JobContext/TaskAttemptContext is class in Hadoop 1.+
   * while it's interface in Hadoop 2.+.
   * @param context (undocumented)
   * @return (undocumented)
   */
  public  org.apache.hadoop.conf.Configuration getConfigurationFromJobContext (org.apache.hadoop.mapreduce.JobContext context) { throw new RuntimeException(); }
  /**
   * Using reflection to call <code>getTaskAttemptID</code> from TaskAttemptContext. If we directly
   * call <code>TaskAttemptContext.getTaskAttemptID</code>, it will generate different byte codes
   * for Hadoop 1.+ and Hadoop 2.+ because TaskAttemptContext is class in Hadoop 1.+
   * while it's interface in Hadoop 2.+.
   * @param context (undocumented)
   * @return (undocumented)
   */
  public  org.apache.hadoop.mapreduce.TaskAttemptID getTaskAttemptIDFromTaskAttemptContext (org.apache.hadoop.mapreduce.TaskAttemptContext context) { throw new RuntimeException(); }
  /**
   * Get {@link FileStatus} objects for all leaf children (files) under the given base path. If the
   * given path points to a file, return a single-element collection containing {@link FileStatus} of
   * that file.
   * @param fs (undocumented)
   * @param basePath (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.hadoop.fs.FileStatus> listLeafStatuses (org.apache.hadoop.fs.FileSystem fs, org.apache.hadoop.fs.Path basePath) { throw new RuntimeException(); }
  /**
   * Get {@link FileStatus} objects for all leaf children (files) under the given base path. If the
   * given path points to a file, return a single-element collection containing {@link FileStatus} of
   * that file.
   * @param fs (undocumented)
   * @param baseStatus (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.hadoop.fs.FileStatus> listLeafStatuses (org.apache.hadoop.fs.FileSystem fs, org.apache.hadoop.fs.FileStatus baseStatus) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.hadoop.fs.FileStatus> listLeafDirStatuses (org.apache.hadoop.fs.FileSystem fs, org.apache.hadoop.fs.Path basePath) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.hadoop.fs.FileStatus> listLeafDirStatuses (org.apache.hadoop.fs.FileSystem fs, org.apache.hadoop.fs.FileStatus baseStatus) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.hadoop.fs.Path> globPath (org.apache.hadoop.fs.Path pattern) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.hadoop.fs.Path> globPathIfNecessary (org.apache.hadoop.fs.Path pattern) { throw new RuntimeException(); }
  /**
   * Lists all the files in a directory with the specified prefix, and does not end with the
   * given suffix. The returned {{FileStatus}} instances are sorted by the modification times of
   * the respective files.
   * @param remoteFs (undocumented)
   * @param dir (undocumented)
   * @param prefix (undocumented)
   * @param exclusionSuffix (undocumented)
   * @return (undocumented)
   */
  public  org.apache.hadoop.fs.FileStatus[] listFilesSorted (org.apache.hadoop.fs.FileSystem remoteFs, org.apache.hadoop.fs.Path dir, java.lang.String prefix, java.lang.String exclusionSuffix) { throw new RuntimeException(); }
  /**
   * How much time is remaining (in millis) from now to (fraction * renewal time for the token that
   * is valid the latest)?
   * This will return -ve (or 0) value if the fraction of validity has already expired.
   * @param sparkConf (undocumented)
   * @param fraction (undocumented)
   * @param credentials (undocumented)
   * @return (undocumented)
   */
  public  long getTimeFromNowToRenewal (org.apache.spark.SparkConf sparkConf, double fraction, org.apache.hadoop.security.Credentials credentials) { throw new RuntimeException(); }
    int getSuffixForCredentialsPath (org.apache.hadoop.fs.Path credentialsPath) { throw new RuntimeException(); }
  private  scala.util.matching.UnanchoredRegex HADOOP_CONF_PATTERN () { throw new RuntimeException(); }
  /**
   * Substitute variables by looking them up in Hadoop configs. Only variables that match the
   * ${hadoopconf- .. } pattern are substituted.
   * @param text (undocumented)
   * @param hadoopConf (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String substituteHadoopVariables (java.lang.String text, org.apache.hadoop.conf.Configuration hadoopConf) { throw new RuntimeException(); }
  // not preceding
    void startExecutorDelegationTokenRenewer (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  /**
   * Stop the thread that does the delegation token updates.
   */
    void stopExecutorDelegationTokenRenewer () { throw new RuntimeException(); }
  /**
   * Return a fresh Hadoop configuration, bypassing the HDFS cache mechanism.
   * This is to prevent the DFSClient from using an old cached token to connect to the NameNode.
   * @param hadoopConf (undocumented)
   * @param scheme (undocumented)
   * @return (undocumented)
   */
    org.apache.hadoop.conf.Configuration getConfBypassingFSCache (org.apache.hadoop.conf.Configuration hadoopConf, java.lang.String scheme) { throw new RuntimeException(); }
}
