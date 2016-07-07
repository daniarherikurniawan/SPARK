package org.apache.spark.util;
/**
 * Asynchronously passes events to registered listeners.
 * <p>
 * Until <code>start()</code> is called, all posted events are only buffered. Only after this listener bus
 * has started will events be actually propagated to all attached listeners. This listener bus
 * is stopped when <code>stop()</code> is called, and it will drop further events after stopping.
 * <p>
 * param:  name name of the listener bus, will be the name of the listener thread.
 * @tparam L type of listener
 * @tparam E type of event
 */
 abstract class AsynchronousListenerBus<L extends java.lang.Object, E extends java.lang.Object> implements org.apache.spark.util.ListenerBus<L, E> {
  static public  scala.util.DynamicVariable<java.lang.Object> withinListenerThread () { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Ident(scala), newTypeName("AnyRef")))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  public   AsynchronousListenerBus (java.lang.String name) { throw new RuntimeException(); }
  private  org.apache.spark.SparkContext sparkContext () { throw new RuntimeException(); }
  private  int EVENT_QUEUE_CAPACITY () { throw new RuntimeException(); }
  private  java.util.concurrent.LinkedBlockingQueue<E> eventQueue () { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.AtomicBoolean started () { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.AtomicBoolean stopped () { throw new RuntimeException(); }
  private  boolean processingEvent () { throw new RuntimeException(); }
  private  java.util.concurrent.Semaphore eventLock () { throw new RuntimeException(); }
  private  java.lang.Thread listenerThread () { throw new RuntimeException(); }
  /**
   * Start sending events to attached listeners.
   * <p>
   * This first sends out all buffered events posted before this listener bus has started, then
   * listens for any additional events asynchronously while the listener bus is still running.
   * This should only be called once.
   * <p>
   * @param sc Used to stop the SparkContext in case the listener thread dies.
   */
  public  void start (org.apache.spark.SparkContext sc) { throw new RuntimeException(); }
  public  void post (E event) { throw new RuntimeException(); }
  /**
   * For testing only. Wait until there are no more events in the queue, or until the specified
   * time has elapsed. Throw <code>TimeoutException</code> if the specified time elapsed before the queue
   * emptied.
   * Exposed for testing.
   * @param timeoutMillis (undocumented)
   */
  public  void waitUntilEmpty (long timeoutMillis) { throw new RuntimeException(); }
  /**
   * For testing only. Return whether the listener daemon thread is still alive.
   * Exposed for testing.
   * @return (undocumented)
   */
  public  boolean listenerThreadIsAlive () { throw new RuntimeException(); }
  /**
   * Return whether the event queue is empty.
   * <p>
   * The use of synchronized here guarantees that all events that once belonged to this queue
   * have already been processed by all attached listeners, if this returns true.
   * @return (undocumented)
   */
  private  boolean queueIsEmpty () { throw new RuntimeException(); }
  /**
   * Stop the listener bus. It will wait until the queued events have been processed, but drop the
   * new events after stopping.
   */
  public  void stop () { throw new RuntimeException(); }
  /**
   * If the event queue exceeds its capacity, the new events will be dropped. The subclasses will be
   * notified with the dropped events.
   * <p>
   * Note: <code>onDropEvent</code> can be called in any thread.
   * @param event (undocumented)
   */
  public abstract  void onDropEvent (E event) ;
}
