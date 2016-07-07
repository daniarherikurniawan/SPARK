package org.apache.spark.rpc.akka;
/**
 * Monitor errors reported by Akka and log them.
 */
  class ErrorMonitor implements akka.actor.Actor, org.apache.spark.util.ActorLogReceive, org.apache.spark.Logging {
  public   ErrorMonitor () { throw new RuntimeException(); }
  public  void preStart () { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveWithLogging () { throw new RuntimeException(); }
}
