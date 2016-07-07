package org.apache.spark.util;
/**
 * A mutable class loader that gives preference to its own URLs over the parent class loader
 * when loading classes and resources.
 */
  class ChildFirstURLClassLoader extends org.apache.spark.util.MutableURLClassLoader {
  public   ChildFirstURLClassLoader (java.net.URL[] urls, java.lang.ClassLoader parent) { throw new RuntimeException(); }
  private  org.apache.spark.util.ParentClassLoader parentClassLoader () { throw new RuntimeException(); }
  /**
   * Used to implement fine-grained class loading locks similar to what is done by Java 7. This
   * prevents deadlock issues when using non-hierarchical class loaders.
   * <p>
   * Note that due to some issues with implementing class loaders in
   * Scala, Java 7's <code>ClassLoader.registerAsParallelCapable</code> method is not called.
   * @return (undocumented)
   */
  private  java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> locks () { throw new RuntimeException(); }
  public  java.lang.Class<?> loadClass (java.lang.String name, boolean resolve) { throw new RuntimeException(); }
  public  java.net.URL getResource (java.lang.String name) { throw new RuntimeException(); }
  public  java.util.Enumeration<java.net.URL> getResources (java.lang.String name) { throw new RuntimeException(); }
  public  void addURL (java.net.URL url) { throw new RuntimeException(); }
}
