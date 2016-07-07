package org.apache.spark.ui.jobs;
/** Page showing list of all ongoing and recently finished jobs */
  class AllJobsPage extends org.apache.spark.ui.WebUIPage {
  public   AllJobsPage (org.apache.spark.ui.jobs.JobsTab parent) { throw new RuntimeException(); }
  private  java.lang.String JOBS_LEGEND () { throw new RuntimeException(); }
  private  java.lang.String EXECUTORS_LEGEND () { throw new RuntimeException(); }
  private  scala.Tuple2<java.lang.String, java.lang.String> getLastStageNameAndDescription (org.apache.spark.ui.jobs.UIData.JobUIData job) { throw new RuntimeException(); }
  private  scala.collection.Seq<java.lang.String> makeJobEvent (scala.collection.Seq<org.apache.spark.ui.jobs.UIData.JobUIData> jobUIDatas) { throw new RuntimeException(); }
  private  scala.collection.Seq<java.lang.String> makeExecutorEvent (scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.ui.jobs.UIData.ExecutorUIData> executorUIDatas) { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> makeTimeline (scala.collection.Seq<org.apache.spark.ui.jobs.UIData.JobUIData> jobs, scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.ui.jobs.UIData.ExecutorUIData> executors, long startTime) { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> jobsTable (scala.collection.Seq<org.apache.spark.ui.jobs.UIData.JobUIData> jobs) { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> render (javax.servlet.http.HttpServletRequest request) { throw new RuntimeException(); }
}
