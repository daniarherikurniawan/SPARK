package org.apache.spark.api.python;
/**
 * A helper class to run Python UDFs in Spark.
 */
  class PythonRunner implements org.apache.spark.Logging {
  public   PythonRunner (byte[] command, java.util.Map<java.lang.String, java.lang.String> envVars, java.util.List<java.lang.String> pythonIncludes, java.lang.String pythonExec, java.lang.String pythonVer, java.util.List<org.apache.spark.broadcast.Broadcast<org.apache.spark.api.python.PythonBroadcast>> broadcastVars, org.apache.spark.Accumulator<java.util.List<byte[]>> accumulator, int bufferSize, boolean reuse_worker) { throw new RuntimeException(); }
  public  scala.collection.Iterator<byte[]> compute (scala.collection.Iterator<java.lang.Object> inputIterator, int partitionIndex, org.apache.spark.TaskContext context) { throw new RuntimeException(); }
  /**
   * The thread responsible for writing the data from the PythonRDD's parent iterator to the
   * Python process.
   */
  public  class WriterThread extends java.lang.Thread {
    public   WriterThread (org.apache.spark.SparkEnv env, java.net.Socket worker, scala.collection.Iterator<java.lang.Object> inputIterator, int partitionIndex, org.apache.spark.TaskContext context) { throw new RuntimeException(); }
    private  java.lang.Exception _exception () { throw new RuntimeException(); }
    /** Contains the exception thrown while writing the parent iterator to the Python process. */
    public  scala.Option<java.lang.Exception> exception () { throw new RuntimeException(); }
    /** Terminates the writer thread, ignoring any exceptions that may occur due to cleanup. */
    public  void shutdownOnTaskCompletion () { throw new RuntimeException(); }
    public  void run () { throw new RuntimeException(); }
  }
  /**
   * It is necessary to have a monitor thread for python workers if the user cancels with
   * interrupts disabled. In that case we will need to explicitly kill the worker, otherwise the
   * threads can block indefinitely.
   */
  public  class MonitorThread extends java.lang.Thread {
    public   MonitorThread (org.apache.spark.SparkEnv env, java.net.Socket worker, org.apache.spark.TaskContext context) { throw new RuntimeException(); }
    public  void run () { throw new RuntimeException(); }
  }
}
