package org.apache.spark.scheduler;
/**
 * An internal class that describes the metadata of an event log.
 * This event is not meant to be posted to listeners downstream.
 */
  class SparkListenerLogStart implements org.apache.spark.scheduler.SparkListenerEvent, scala.Product, scala.Serializable {
  public  java.lang.String sparkVersion () { throw new RuntimeException(); }
  // not preceding
  public   SparkListenerLogStart (java.lang.String sparkVersion) { throw new RuntimeException(); }
}
