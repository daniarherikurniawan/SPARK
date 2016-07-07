package org.apache.spark.deploy.rest.mesos;
/**
 * A server that responds to requests submitted by the {@link RestSubmissionClient}.
 * All requests are forwarded to
 * {@link org.apache.spark.scheduler.cluster.mesos.MesosClusterScheduler}.
 * This is intended to be used in Mesos cluster mode only.
 * For more details about the REST submission please refer to {@link RestSubmissionServer} javadocs.
 */
  class MesosRestServer extends org.apache.spark.deploy.rest.RestSubmissionServer {
  public   MesosRestServer (java.lang.String host, int requestedPort, org.apache.spark.SparkConf masterConf, org.apache.spark.scheduler.cluster.mesos.MesosClusterScheduler scheduler) { throw new RuntimeException(); }
  protected  org.apache.spark.deploy.rest.mesos.MesosSubmitRequestServlet submitRequestServlet () { throw new RuntimeException(); }
  protected  org.apache.spark.deploy.rest.mesos.MesosKillRequestServlet killRequestServlet () { throw new RuntimeException(); }
  protected  org.apache.spark.deploy.rest.mesos.MesosStatusRequestServlet statusRequestServlet () { throw new RuntimeException(); }
}
