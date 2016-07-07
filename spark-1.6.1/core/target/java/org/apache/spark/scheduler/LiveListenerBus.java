package org.apache.spark.scheduler;
/**
 * Asynchronously passes SparkListenerEvents to registered SparkListeners.
 * <p>
 * Until start() is called, all posted events are only buffered. Only after this listener bus
 * has started will events be actually propagated to all attached listeners. This listener bus
 * is stopped when it receives a SparkListenerShutdown event, which is posted using stop().
 */
  class LiveListenerBus extends org.apache.spark.util.AsynchronousListenerBus<org.apache.spark.scheduler.SparkListener, org.apache.spark.scheduler.SparkListenerEvent> implements org.apache.spark.scheduler.SparkListenerBus {
  public   LiveListenerBus () { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.AtomicBoolean logDroppedEvent () { throw new RuntimeException(); }
  public  void onDropEvent (org.apache.spark.scheduler.SparkListenerEvent event) { throw new RuntimeException(); }
}
