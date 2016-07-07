package org.apache.spark.rdd;
// no position
/**
 * State for SqlNewHadoopRDD objects. This is split this way because of the package splits.
 * TODO: Move/Combine this with org.apache.spark.sql.datasources.SqlNewHadoopRDD
 */
  class SqlNewHadoopRDDState {
  /**
   * The thread variable for the name of the current file being read. This is used by
   * the InputFileName function in Spark SQL.
   * @return (undocumented)
   */
  static public  org.apache.spark.unsafe.types.UTF8String getInputFileName () { throw new RuntimeException(); }
  static   void setInputFileName (java.lang.String file) { throw new RuntimeException(); }
  static   void unsetInputFileName () { throw new RuntimeException(); }
}
