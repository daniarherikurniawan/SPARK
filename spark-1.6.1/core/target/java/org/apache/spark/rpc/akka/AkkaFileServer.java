package org.apache.spark.rpc.akka;
  class AkkaFileServer implements org.apache.spark.rpc.RpcEnvFileServer {
  public   AkkaFileServer (org.apache.spark.SparkConf conf, org.apache.spark.SecurityManager securityManager) { throw new RuntimeException(); }
  private  org.apache.spark.HttpFileServer httpFileServer () { throw new RuntimeException(); }
  public  java.lang.String addFile (java.io.File file) { throw new RuntimeException(); }
  public  java.lang.String addJar (java.io.File file) { throw new RuntimeException(); }
  public  void shutdown () { throw new RuntimeException(); }
  private  org.apache.spark.HttpFileServer getFileServer () { throw new RuntimeException(); }
  private  org.apache.spark.HttpFileServer startFileServer () { throw new RuntimeException(); }
}
