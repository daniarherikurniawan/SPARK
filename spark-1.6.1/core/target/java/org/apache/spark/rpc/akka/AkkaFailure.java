package org.apache.spark.rpc.akka;
/**
 * A reply with the failure error from the receiver to the sender
 */
  class AkkaFailure implements scala.Product, scala.Serializable {
  public  java.lang.Throwable e () { throw new RuntimeException(); }
  // not preceding
  public   AkkaFailure (java.lang.Throwable e) { throw new RuntimeException(); }
}
