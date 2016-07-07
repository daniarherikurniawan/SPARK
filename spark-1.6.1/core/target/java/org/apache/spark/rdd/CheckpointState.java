package org.apache.spark.rdd;
// no position
/**
 * Enumeration to manage state transitions of an RDD through checkpointing
 * [ Initialized --> checkpointing in progress --> checkpointed ].
 */
  class CheckpointState extends scala.Enumeration {
  static public  scala.Enumeration.Value Initialized () { throw new RuntimeException(); }
  static public  scala.Enumeration.Value CheckpointingInProgress () { throw new RuntimeException(); }
  static public  scala.Enumeration.Value Checkpointed () { throw new RuntimeException(); }
}
