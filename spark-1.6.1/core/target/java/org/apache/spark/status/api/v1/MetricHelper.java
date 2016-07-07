package org.apache.spark.status.api.v1;
/**
 * Helper for getting distributions from nested metric types.  Many of the metrics we want are
 * contained in options inside TaskMetrics (eg., ShuffleWriteMetrics). This makes it easy to handle
 * the options (returning None if the metrics are all empty), and extract the quantiles for each
 * metric.  After creating an instance, call metricOption to get the result type.
 */
 abstract class MetricHelper<I extends java.lang.Object, O extends java.lang.Object> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  public   MetricHelper (scala.collection.Seq<org.apache.spark.executor.TaskMetrics> rawMetrics, double[] quantiles) { throw new RuntimeException(); }
  public abstract  scala.Option<I> getSubmetrics (org.apache.spark.executor.TaskMetrics raw) ;
  public abstract  O build () ;
  public  scala.collection.Seq<I> data () { throw new RuntimeException(); }
  /** applies the given function to all input metrics, and returns the quantiles */
  public  scala.collection.IndexedSeq<java.lang.Object> submetricQuantiles (scala.Function1<I, java.lang.Object> f) { throw new RuntimeException(); }
  public  scala.Option<O> metricOption () { throw new RuntimeException(); }
}
