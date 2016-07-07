package org.apache.spark.deploy.master;
public  interface MasterMessages extends scala.Serializable {
  // no position
  static public  class ElectedLeader$ implements scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ElectedLeader$ MODULE$ = null;
    public   ElectedLeader$ () { throw new RuntimeException(); }
  }
  // no position
  static public  class RevokedLeadership$ implements scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RevokedLeadership$ MODULE$ = null;
    public   RevokedLeadership$ () { throw new RuntimeException(); }
  }
  // no position
  static public  class CheckForWorkerTimeOut$ implements scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CheckForWorkerTimeOut$ MODULE$ = null;
    public   CheckForWorkerTimeOut$ () { throw new RuntimeException(); }
  }
  static public  class BeginRecovery implements scala.Product, scala.Serializable {
    public  scala.collection.Seq<org.apache.spark.deploy.master.ApplicationInfo> storedApps () { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.deploy.master.WorkerInfo> storedWorkers () { throw new RuntimeException(); }
    // not preceding
    public   BeginRecovery (scala.collection.Seq<org.apache.spark.deploy.master.ApplicationInfo> storedApps, scala.collection.Seq<org.apache.spark.deploy.master.WorkerInfo> storedWorkers) { throw new RuntimeException(); }
  }
  // no position
  static public  class BeginRecovery$ extends scala.runtime.AbstractFunction2<scala.collection.Seq<org.apache.spark.deploy.master.ApplicationInfo>, scala.collection.Seq<org.apache.spark.deploy.master.WorkerInfo>, org.apache.spark.deploy.master.MasterMessages.BeginRecovery> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final BeginRecovery$ MODULE$ = null;
    public   BeginRecovery$ () { throw new RuntimeException(); }
  }
  // no position
  static public  class CompleteRecovery$ implements scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CompleteRecovery$ MODULE$ = null;
    public   CompleteRecovery$ () { throw new RuntimeException(); }
  }
  // no position
  static public  class BoundPortsRequest$ implements scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final BoundPortsRequest$ MODULE$ = null;
    public   BoundPortsRequest$ () { throw new RuntimeException(); }
  }
  static public  class BoundPortsResponse implements scala.Product, scala.Serializable {
    public  int rpcEndpointPort () { throw new RuntimeException(); }
    public  int webUIPort () { throw new RuntimeException(); }
    public  scala.Option<java.lang.Object> restPort () { throw new RuntimeException(); }
    // not preceding
    public   BoundPortsResponse (int rpcEndpointPort, int webUIPort, scala.Option<java.lang.Object> restPort) { throw new RuntimeException(); }
  }
  // no position
  static public  class BoundPortsResponse$ extends scala.runtime.AbstractFunction3<java.lang.Object, java.lang.Object, scala.Option<java.lang.Object>, org.apache.spark.deploy.master.MasterMessages.BoundPortsResponse> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final BoundPortsResponse$ MODULE$ = null;
    public   BoundPortsResponse$ () { throw new RuntimeException(); }
  }
  static public  class AttachCompletedRebuildUI implements scala.Product, scala.Serializable {
    public  java.lang.String appId () { throw new RuntimeException(); }
    // not preceding
    public   AttachCompletedRebuildUI (java.lang.String appId) { throw new RuntimeException(); }
  }
  // no position
  static public  class AttachCompletedRebuildUI$ extends scala.runtime.AbstractFunction1<java.lang.String, org.apache.spark.deploy.master.MasterMessages.AttachCompletedRebuildUI> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final AttachCompletedRebuildUI$ MODULE$ = null;
    public   AttachCompletedRebuildUI$ () { throw new RuntimeException(); }
  }
}
