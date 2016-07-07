package org.apache.spark;
// no position
  class InternalAccumulator {
  static public  java.lang.String PEAK_EXECUTION_MEMORY () { throw new RuntimeException(); }
  static public  java.lang.String TEST_ACCUMULATOR () { throw new RuntimeException(); }
  static private  scala.Option<org.apache.spark.Accumulator<java.lang.Object>> maybeTestAccumulator () { throw new RuntimeException(); }
  /**
   * Accumulators for tracking internal metrics.
   * <p>
   * These accumulators are created with the stage such that all tasks in the stage will
   * add to the same set of accumulators. We do this to report the distribution of accumulator
   * values across all tasks within each stage.
   * @param sc (undocumented)
   * @return (undocumented)
   */
  static public  scala.collection.Seq<org.apache.spark.Accumulator<java.lang.Object>> create (org.apache.spark.SparkContext sc) { throw new RuntimeException(); }
}
