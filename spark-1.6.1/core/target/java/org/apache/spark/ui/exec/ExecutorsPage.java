package org.apache.spark.ui.exec;
  class ExecutorsPage extends org.apache.spark.ui.WebUIPage {
  /** Represent an executor's info as a map given a storage status index */
  static public  org.apache.spark.status.api.v1.ExecutorSummary getExecInfo (org.apache.spark.ui.exec.ExecutorsListener listener, int statusId) { throw new RuntimeException(); }
  public   ExecutorsPage (org.apache.spark.ui.exec.ExecutorsTab parent, boolean threadDumpEnabled) { throw new RuntimeException(); }
  private  org.apache.spark.ui.exec.ExecutorsListener listener () { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> render (javax.servlet.http.HttpServletRequest request) { throw new RuntimeException(); }
  /** Render an HTML row representing an executor */
  private  scala.collection.Seq<scala.xml.Node> execRow (org.apache.spark.status.api.v1.ExecutorSummary info, boolean logsExist) { throw new RuntimeException(); }
}
