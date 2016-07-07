package org.apache.spark.rpc.akka;
/**
 * A wrapper to <code>message</code> so that the receiver knows if the sender expects a reply.
 * param:  message
 * param:  needReply if the sender expects a reply message
 */
  class AkkaMessage implements scala.Product, scala.Serializable {
  public  Object message () { throw new RuntimeException(); }
  public  boolean needReply () { throw new RuntimeException(); }
  // not preceding
  public   AkkaMessage (Object message, boolean needReply) { throw new RuntimeException(); }
}
