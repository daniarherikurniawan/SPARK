package org.apache.spark.deploy.mesos.ui;
  class MesosClusterPage extends org.apache.spark.ui.WebUIPage {
  public   MesosClusterPage (org.apache.spark.deploy.mesos.ui.MesosClusterUI parent) { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> render (javax.servlet.http.HttpServletRequest request) { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> queuedRow (org.apache.spark.deploy.mesos.MesosDriverDescription submission) { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> driverRow (org.apache.spark.scheduler.cluster.mesos.MesosClusterSubmissionState state) { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> retryRow (org.apache.spark.deploy.mesos.MesosDriverDescription submission) { throw new RuntimeException(); }
  private  java.lang.String stateString (scala.Option<org.apache.mesos.Protos.TaskStatus> status) { throw new RuntimeException(); }
}
