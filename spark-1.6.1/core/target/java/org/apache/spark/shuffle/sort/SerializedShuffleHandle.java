package org.apache.spark.shuffle.sort;
/**
 * Subclass of {@link BaseShuffleHandle}, used to identify when we've chosen to use the
 * serialized shuffle.
 */
  class SerializedShuffleHandle<K extends java.lang.Object, V extends java.lang.Object> extends org.apache.spark.shuffle.BaseShuffleHandle<K, V, V> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  public   SerializedShuffleHandle (int shuffleId, int numMaps, org.apache.spark.ShuffleDependency<K, V, V> dependency) { throw new RuntimeException(); }
}
