package org.apache.spark.rpc.akka;
/**
 * A RpcEnv implementation based on Akka.
 * <p>
 * TODO Once we remove all usages of Akka in other place, we can move this file to a new project and
 * remove Akka from the dependencies.
 */
  class AkkaRpcEnv extends org.apache.spark.rpc.RpcEnv implements org.apache.spark.Logging {
  public  akka.actor.ActorSystem actorSystem () { throw new RuntimeException(); }
  public  org.apache.spark.SecurityManager securityManager () { throw new RuntimeException(); }
  // not preceding
     AkkaRpcEnv (akka.actor.ActorSystem actorSystem, org.apache.spark.SecurityManager securityManager, org.apache.spark.SparkConf conf, int boundPort) { throw new RuntimeException(); }
  private  org.apache.spark.rpc.RpcAddress defaultAddress () { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcAddress address () { throw new RuntimeException(); }
  /**
   * A lookup table to search a {@link RpcEndpointRef} for a {@link RpcEndpoint}. We need it to make
   * {@link RpcEndpoint.self} work.
   * @return (undocumented)
   */
  private  java.util.concurrent.ConcurrentHashMap<org.apache.spark.rpc.RpcEndpoint, org.apache.spark.rpc.RpcEndpointRef> endpointToRef () { throw new RuntimeException(); }
  /**
   * Need this map to remove <code>RpcEndpoint</code> from <code>endpointToRef</code> via a <code>RpcEndpointRef</code>
   * @return (undocumented)
   */
  private  java.util.concurrent.ConcurrentHashMap<org.apache.spark.rpc.RpcEndpointRef, org.apache.spark.rpc.RpcEndpoint> refToEndpoint () { throw new RuntimeException(); }
  private  org.apache.spark.rpc.akka.AkkaFileServer _fileServer () { throw new RuntimeException(); }
  private  void registerEndpoint (org.apache.spark.rpc.RpcEndpoint endpoint, org.apache.spark.rpc.RpcEndpointRef endpointRef) { throw new RuntimeException(); }
  private  void unregisterEndpoint (org.apache.spark.rpc.RpcEndpointRef endpointRef) { throw new RuntimeException(); }
  /**
   * Retrieve the {@link RpcEndpointRef} of <code>endpoint</code>.
   * @param endpoint (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rpc.RpcEndpointRef endpointRef (org.apache.spark.rpc.RpcEndpoint endpoint) { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEndpointRef setupEndpoint (java.lang.String name, org.apache.spark.rpc.RpcEndpoint endpoint) { throw new RuntimeException(); }
  private  void processMessage (org.apache.spark.rpc.RpcEndpoint endpoint, org.apache.spark.rpc.akka.AkkaMessage m, akka.actor.ActorRef _sender) { throw new RuntimeException(); }
  /**
   * Run <code>action</code> safely to avoid to crash the thread. If any non-fatal exception happens, it will
   * call <code>endpoint.onError</code>. If <code>endpoint.onError</code> throws any non-fatal exception, just log it.
   * @param endpoint (undocumented)
   * @param action (undocumented)
   */
  private  void safelyCall (org.apache.spark.rpc.RpcEndpoint endpoint, scala.Function0<scala.runtime.BoxedUnit> action) { throw new RuntimeException(); }
  private  org.apache.spark.rpc.RpcAddress akkaAddressToRpcAddress (akka.actor.Address address) { throw new RuntimeException(); }
  public  scala.concurrent.Future<org.apache.spark.rpc.RpcEndpointRef> asyncSetupEndpointRefByURI (java.lang.String uri) { throw new RuntimeException(); }
  public  java.lang.String uriOf (java.lang.String systemName, org.apache.spark.rpc.RpcAddress address, java.lang.String endpointName) { throw new RuntimeException(); }
  public  void shutdown () { throw new RuntimeException(); }
  public  void stop (org.apache.spark.rpc.RpcEndpointRef endpoint) { throw new RuntimeException(); }
  public  void awaitTermination () { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  public <T extends java.lang.Object> T deserialize (scala.Function0<T> deserializationAction) { throw new RuntimeException(); }
  public  java.nio.channels.ReadableByteChannel openChannel (java.lang.String uri) { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEnvFileServer fileServer () { throw new RuntimeException(); }
}
