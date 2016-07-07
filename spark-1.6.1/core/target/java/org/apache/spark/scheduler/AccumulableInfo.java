package org.apache.spark.scheduler;
/**
 * :: DeveloperApi ::
 * Information about an {@link org.apache.spark.Accumulable} modified during a task or stage.
 */
public  class AccumulableInfo {
  static public  org.apache.spark.scheduler.AccumulableInfo apply (long id, java.lang.String name, scala.Option<java.lang.String> update, java.lang.String value, boolean internal) { throw new RuntimeException(); }
  static public  org.apache.spark.scheduler.AccumulableInfo apply (long id, java.lang.String name, scala.Option<java.lang.String> update, java.lang.String value) { throw new RuntimeException(); }
  static public  org.apache.spark.scheduler.AccumulableInfo apply (long id, java.lang.String name, java.lang.String value) { throw new RuntimeException(); }
  public  long id () { throw new RuntimeException(); }
  public  java.lang.String name () { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> update () { throw new RuntimeException(); }
  public  java.lang.String value () { throw new RuntimeException(); }
  public  boolean internal () { throw new RuntimeException(); }
  // not preceding
     AccumulableInfo (long id, java.lang.String name, scala.Option<java.lang.String> update, java.lang.String value, boolean internal) { throw new RuntimeException(); }
  public  boolean equals (Object other) { throw new RuntimeException(); }
  public  int hashCode () { throw new RuntimeException(); }
}
