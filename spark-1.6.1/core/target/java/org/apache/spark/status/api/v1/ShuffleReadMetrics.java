package org.apache.spark.status.api.v1;
public  class ShuffleReadMetrics {
  public  int remoteBlocksFetched () { throw new RuntimeException(); }
  public  int localBlocksFetched () { throw new RuntimeException(); }
  public  long fetchWaitTime () { throw new RuntimeException(); }
  public  long remoteBytesRead () { throw new RuntimeException(); }
  public  int totalBlocksFetched () { throw new RuntimeException(); }
  public  long recordsRead () { throw new RuntimeException(); }
  // not preceding
     ShuffleReadMetrics (int remoteBlocksFetched, int localBlocksFetched, long fetchWaitTime, long remoteBytesRead, int totalBlocksFetched, long recordsRead) { throw new RuntimeException(); }
}
