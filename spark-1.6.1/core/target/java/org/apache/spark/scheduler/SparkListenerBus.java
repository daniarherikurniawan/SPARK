package org.apache.spark.scheduler;
/**
 * A {@link SparkListenerEvent} bus that relays {@link SparkListenerEvent}s to its listeners
 */
  interface SparkListenerBus extends org.apache.spark.util.ListenerBus<org.apache.spark.scheduler.SparkListener, org.apache.spark.scheduler.SparkListenerEvent> {
  public  void onPostEvent (org.apache.spark.scheduler.SparkListener listener, org.apache.spark.scheduler.SparkListenerEvent event) ;
}
