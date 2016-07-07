package org.apache.spark.deploy;
// no position
/**
 * Whether to submit, kill, or request the status of an application.
 * The latter two operations are currently supported only for standalone cluster mode.
 */
  class SparkSubmitAction extends scala.Enumeration {
  static public  scala.Enumeration.Value SUBMIT () { throw new RuntimeException(); }
  static public  scala.Enumeration.Value KILL () { throw new RuntimeException(); }
  static public  scala.Enumeration.Value REQUEST_STATUS () { throw new RuntimeException(); }
}
