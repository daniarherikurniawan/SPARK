package org.apache.spark.rpc.netty;
/**
 * StreamManager implementation for serving files from a NettyRpcEnv.
 */
  class NettyStreamManager extends org.apache.spark.network.server.StreamManager implements org.apache.spark.rpc.RpcEnvFileServer {
  public   NettyStreamManager (org.apache.spark.rpc.netty.NettyRpcEnv rpcEnv) { throw new RuntimeException(); }
  private  java.util.concurrent.ConcurrentHashMap<java.lang.String, java.io.File> files () { throw new RuntimeException(); }
  private  java.util.concurrent.ConcurrentHashMap<java.lang.String, java.io.File> jars () { throw new RuntimeException(); }
  public  org.apache.spark.network.buffer.ManagedBuffer getChunk (long streamId, int chunkIndex) { throw new RuntimeException(); }
  public  org.apache.spark.network.buffer.ManagedBuffer openStream (java.lang.String streamId) { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String addFile (java.io.File file) { throw new RuntimeException(); }
  public  java.lang.String addJar (java.io.File file) { throw new RuntimeException(); }
}
