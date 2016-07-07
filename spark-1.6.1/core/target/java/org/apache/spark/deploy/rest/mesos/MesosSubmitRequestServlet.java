package org.apache.spark.deploy.rest.mesos;
  class MesosSubmitRequestServlet extends org.apache.spark.deploy.rest.SubmitRequestServlet {
  public   MesosSubmitRequestServlet (org.apache.spark.scheduler.cluster.mesos.MesosClusterScheduler scheduler, org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  private  boolean DEFAULT_SUPERVISE () { throw new RuntimeException(); }
  private  int DEFAULT_MEMORY () { throw new RuntimeException(); }
  private  double DEFAULT_CORES () { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.AtomicLong nextDriverNumber () { throw new RuntimeException(); }
  private  java.text.SimpleDateFormat createDateFormat () { throw new RuntimeException(); }
  private  java.lang.String newDriverId (java.util.Date submitDate) { throw new RuntimeException(); }
  /**
   * Build a driver description from the fields specified in the submit request.
   * <p>
   * This involves constructing a command that launches a mesos framework for the job.
   * This does not currently consider fields used by python applications since python
   * is not supported in mesos cluster mode yet.
   * @param request (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.deploy.mesos.MesosDriverDescription buildDriverDescription (org.apache.spark.deploy.rest.CreateSubmissionRequest request) { throw new RuntimeException(); }
  protected  org.apache.spark.deploy.rest.SubmitRestProtocolResponse handleSubmit (java.lang.String requestMessageJson, org.apache.spark.deploy.rest.SubmitRestProtocolMessage requestMessage, javax.servlet.http.HttpServletResponse responseServlet) { throw new RuntimeException(); }
}
