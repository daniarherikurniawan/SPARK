package org.apache.spark.rdd;
// no position
/**
 * State for SqlNewHadoopRDD objects. This is split this way because of the package splits.
 * TODO: Move/Combine this with org.apache.spark.sql.datasources.SqlNewHadoopRDD
 */
  class SqlNewHadoopRDDState$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SqlNewHadoopRDDState$ MODULE$ = null;
  public   SqlNewHadoopRDDState$ () { throw new RuntimeException(); }
  /**
   * The thread variable for the name of the current file being read. This is used by
   * the InputFileName function in Spark SQL.
   * @return (undocumented)
   */
  public  org.apache.spark.unsafe.types.UTF8String getInputFileName () { throw new RuntimeException(); }
    void setInputFileName (java.lang.String file) { throw new RuntimeException(); }
    void unsetInputFileName () { throw new RuntimeException(); }
}
