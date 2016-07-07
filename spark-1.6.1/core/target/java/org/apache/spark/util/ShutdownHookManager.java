package org.apache.spark.util;
// no position
/**
 * Various utility methods used by Spark.
 */
  class ShutdownHookManager implements org.apache.spark.Logging {
  static public  int DEFAULT_SHUTDOWN_PRIORITY () { throw new RuntimeException(); }
  /**
   * The shutdown priority of the SparkContext instance. This is lower than the default
   * priority, so that by default hooks are run before the context is shut down.
   * @return (undocumented)
   */
  static public  int SPARK_CONTEXT_SHUTDOWN_PRIORITY () { throw new RuntimeException(); }
  /**
   * The shutdown priority of temp directory must be lower than the SparkContext shutdown
   * priority. Otherwise cleaning the temp directories while Spark jobs are running can
   * throw undesirable errors at the time of shutdown.
   * @return (undocumented)
   */
  static public  int TEMP_DIR_SHUTDOWN_PRIORITY () { throw new RuntimeException(); }
  static private  org.apache.spark.util.SparkShutdownHookManager shutdownHooks () { throw new RuntimeException(); }
  static private  scala.collection.mutable.HashSet<java.lang.String> shutdownDeletePaths () { throw new RuntimeException(); }
  static private  scala.collection.mutable.HashSet<java.lang.String> shutdownDeleteTachyonPaths () { throw new RuntimeException(); }
  static public  void registerShutdownDeleteDir (java.io.File file) { throw new RuntimeException(); }
  static public  void registerShutdownDeleteDir (tachyon.client.TachyonFile tachyonfile) { throw new RuntimeException(); }
  static public  void removeShutdownDeleteDir (java.io.File file) { throw new RuntimeException(); }
  static public  void removeShutdownDeleteDir (tachyon.client.TachyonFile tachyonfile) { throw new RuntimeException(); }
  static public  boolean hasShutdownDeleteDir (java.io.File file) { throw new RuntimeException(); }
  static public  boolean hasShutdownDeleteTachyonDir (tachyon.client.TachyonFile file) { throw new RuntimeException(); }
  static public  boolean hasRootAsShutdownDeleteDir (java.io.File file) { throw new RuntimeException(); }
  static public  boolean hasRootAsShutdownDeleteDir (tachyon.client.TachyonFile file) { throw new RuntimeException(); }
  /**
   * Detect whether this thread might be executing a shutdown hook. Will always return true if
   * the current thread is a running a shutdown hook but may spuriously return true otherwise (e.g.
   * if System.exit was just called by a concurrent thread).
   * <p>
   * Currently, this detects whether the JVM is shutting down by Runtime#addShutdownHook throwing
   * an IllegalStateException.
   * @return (undocumented)
   */
  static public  boolean inShutdown () { throw new RuntimeException(); }
  /**
   * Adds a shutdown hook with default priority.
   * <p>
   * @param hook The code to run during shutdown.
   * @return A handle that can be used to unregister the shutdown hook.
   */
  static public  java.lang.Object addShutdownHook (scala.Function0<scala.runtime.BoxedUnit> hook) { throw new RuntimeException(); }
  /**
   * Adds a shutdown hook with the given priority. Hooks with lower priority values run
   * first.
   * <p>
   * @param hook The code to run during shutdown.
   * @return A handle that can be used to unregister the shutdown hook.
   * @param priority (undocumented)
   */
  static public  java.lang.Object addShutdownHook (int priority, scala.Function0<scala.runtime.BoxedUnit> hook) { throw new RuntimeException(); }
  /**
   * Remove a previously installed shutdown hook.
   * <p>
   * @param ref A handle returned by <code>addShutdownHook</code>.
   * @return Whether the hook was removed.
   */
  static public  boolean removeShutdownHook (java.lang.Object ref) { throw new RuntimeException(); }
}
