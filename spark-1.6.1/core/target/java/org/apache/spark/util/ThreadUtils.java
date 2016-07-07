package org.apache.spark.util;
// no position
  class ThreadUtils {
  static private  scala.concurrent.ExecutionContextExecutorService sameThreadExecutionContext () { throw new RuntimeException(); }
  /**
   * An <code>ExecutionContextExecutor</code> that runs each task in the thread that invokes <code>execute/submit</code>.
   * The caller should make sure the tasks running in this <code>ExecutionContextExecutor</code> are short and
   * never block.
   * @return (undocumented)
   */
  static public  scala.concurrent.ExecutionContextExecutor sameThread () { throw new RuntimeException(); }
  /**
   * Create a thread factory that names threads with a prefix and also sets the threads to daemon.
   * @param prefix (undocumented)
   * @return (undocumented)
   */
  static public  java.util.concurrent.ThreadFactory namedThreadFactory (java.lang.String prefix) { throw new RuntimeException(); }
  /**
   * Wrapper over newCachedThreadPool. Thread names are formatted as prefix-ID, where ID is a
   * unique, sequentially assigned integer.
   * @param prefix (undocumented)
   * @return (undocumented)
   */
  static public  java.util.concurrent.ThreadPoolExecutor newDaemonCachedThreadPool (java.lang.String prefix) { throw new RuntimeException(); }
  /**
   * Create a cached thread pool whose max number of threads is <code>maxThreadNumber</code>. Thread names
   * are formatted as prefix-ID, where ID is a unique, sequentially assigned integer.
   * @param prefix (undocumented)
   * @param maxThreadNumber (undocumented)
   * @param keepAliveSeconds (undocumented)
   * @return (undocumented)
   */
  static public  java.util.concurrent.ThreadPoolExecutor newDaemonCachedThreadPool (java.lang.String prefix, int maxThreadNumber, int keepAliveSeconds) { throw new RuntimeException(); }
  /**
   * Wrapper over newFixedThreadPool. Thread names are formatted as prefix-ID, where ID is a
   * unique, sequentially assigned integer.
   * @param nThreads (undocumented)
   * @param prefix (undocumented)
   * @return (undocumented)
   */
  static public  java.util.concurrent.ThreadPoolExecutor newDaemonFixedThreadPool (int nThreads, java.lang.String prefix) { throw new RuntimeException(); }
  /**
   * Wrapper over newSingleThreadExecutor.
   * @param threadName (undocumented)
   * @return (undocumented)
   */
  static public  java.util.concurrent.ExecutorService newDaemonSingleThreadExecutor (java.lang.String threadName) { throw new RuntimeException(); }
  /**
   * Wrapper over ScheduledThreadPoolExecutor.
   * @param threadName (undocumented)
   * @return (undocumented)
   */
  static public  java.util.concurrent.ScheduledExecutorService newDaemonSingleThreadScheduledExecutor (java.lang.String threadName) { throw new RuntimeException(); }
  /**
   * Run a piece of code in a new thread and return the result. Exception in the new thread is
   * thrown in the caller thread with an adjusted stack trace that removes references to this
   * method for clarity. The exception stack traces will be like the following
   * <p>
   * SomeException: exception-message
   *   at CallerClass.body-method (sourcefile.scala)
   *   at ... run in separate thread using org.apache.spark.util.ThreadUtils ... ()
   *   at CallerClass.caller-method (sourcefile.scala)
   *   ...
   * @param threadName (undocumented)
   * @param isDaemon (undocumented)
   * @param body (undocumented)
   * @return (undocumented)
   */
  static public <T extends java.lang.Object> T runInNewThread (java.lang.String threadName, boolean isDaemon, scala.Function0<T> body) { throw new RuntimeException(); }
}
