package org.apache.spark.deploy;
// no position
/**
 * Whether to submit, kill, or request the status of an application.
 * The latter two operations are currently supported only for standalone cluster mode.
 */
  class SparkSubmitAction$ extends scala.Enumeration {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SparkSubmitAction$ MODULE$ = null;
  public   SparkSubmitAction$ () { throw new RuntimeException(); }
  public  scala.Enumeration.Value SUBMIT () { throw new RuntimeException(); }
  public  scala.Enumeration.Value KILL () { throw new RuntimeException(); }
  public  scala.Enumeration.Value REQUEST_STATUS () { throw new RuntimeException(); }
}
