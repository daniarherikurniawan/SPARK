package org.apache.spark;
// no position
  class InternalAccumulator$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final InternalAccumulator$ MODULE$ = null;
  public   InternalAccumulator$ () { throw new RuntimeException(); }
  public  java.lang.String PEAK_EXECUTION_MEMORY () { throw new RuntimeException(); }
  public  java.lang.String TEST_ACCUMULATOR () { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.Accumulator<java.lang.Object>> maybeTestAccumulator () { throw new RuntimeException(); }
  /**
   * Accumulators for tracking internal metrics.
   * <p>
   * These accumulators are created with the stage such that all tasks in the stage will
   * add to the same set of accumulators. We do this to report the distribution of accumulator
   * values across all tasks within each stage.
   * @param sc (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.Accumulator<java.lang.Object>> create (org.apache.spark.SparkContext sc) { throw new RuntimeException(); }
}
