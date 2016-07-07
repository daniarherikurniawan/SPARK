package org.apache.spark.deploy.mesos.ui;
  class DriverPage extends org.apache.spark.ui.WebUIPage {
  public   DriverPage (org.apache.spark.deploy.mesos.ui.MesosClusterUI parent) { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> render (javax.servlet.http.HttpServletRequest request) { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> launchedRow (scala.Option<org.apache.spark.scheduler.cluster.mesos.MesosClusterSubmissionState> submissionState) { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> propertiesRow (scala.collection.Map<java.lang.String, java.lang.String> properties) { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> commandRow (org.apache.spark.deploy.Command command) { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> driverRow (org.apache.spark.deploy.mesos.MesosDriverDescription driver) { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> retryRow (scala.Option<org.apache.spark.scheduler.cluster.mesos.MesosClusterRetryState> retryState) { throw new RuntimeException(); }
}
