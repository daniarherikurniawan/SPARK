package org.apache.spark.status.api.v1;
/**
 * Signal to JacksonMessageWriter to not convert the message into json (which would result in an
 * extra set of quotes).
 */
  class ErrorWrapper implements scala.Product, scala.Serializable {
  public  java.lang.String s () { throw new RuntimeException(); }
  // not preceding
  public   ErrorWrapper (java.lang.String s) { throw new RuntimeException(); }
}
