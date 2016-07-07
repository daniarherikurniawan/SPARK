package org.apache.spark.rpc;
/**
 * A server used by the RpcEnv to server files to other processes owned by the application.
 * <p>
 * The file server can return URIs handled by common libraries (such as "http" or "hdfs"), or
 * it can return "spark" URIs which will be handled by <code>RpcEnv#fetchFile</code>.
 */
  interface RpcEnvFileServer {
  /**
   * Adds a file to be served by this RpcEnv. This is used to serve files from the driver
   * to executors when they're stored on the driver's local file system.
   * <p>
   * @param file Local file to serve.
   * @return A URI for the location of the file.
   */
  public  java.lang.String addFile (java.io.File file) ;
  /**
   * Adds a jar to be served by this RpcEnv. Similar to <code>addFile</code> but for jars added using
   * <code>SparkContext.addJar</code>.
   * <p>
   * @param file Local file to serve.
   * @return A URI for the location of the file.
   */
  public  java.lang.String addJar (java.io.File file) ;
}
