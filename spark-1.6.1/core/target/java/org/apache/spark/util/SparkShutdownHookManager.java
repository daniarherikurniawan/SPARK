package org.apache.spark.util;
  class SparkShutdownHookManager {
  public   SparkShutdownHookManager () { throw new RuntimeException(); }
  private  java.util.PriorityQueue<org.apache.spark.util.SparkShutdownHook> hooks () { throw new RuntimeException(); }
  private  boolean shuttingDown () { throw new RuntimeException(); }
  /**
   * Install a hook to run at shutdown and run all registered hooks in order. Hadoop 1.x does not
   * have <code>ShutdownHookManager</code>, so in that case we just use the JVM's <code>Runtime</code> object and hope for
   * the best.
   */
  public  void install () { throw new RuntimeException(); }
  public  void runAll () { throw new RuntimeException(); }
  public  java.lang.Object add (int priority, scala.Function0<scala.runtime.BoxedUnit> hook) { throw new RuntimeException(); }
  public  boolean remove (java.lang.Object ref) { throw new RuntimeException(); }
}
