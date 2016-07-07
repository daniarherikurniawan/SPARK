package org.apache.spark.ui.jobs;
/** Page showing statistics and stage list for a given job */
  class JobPage extends org.apache.spark.ui.WebUIPage {
  public   JobPage (org.apache.spark.ui.jobs.JobsTab parent) { throw new RuntimeException(); }
  private  java.lang.String STAGES_LEGEND () { throw new RuntimeException(); }
  private  java.lang.String EXECUTORS_LEGEND () { throw new RuntimeException(); }
  private  scala.collection.Seq<java.lang.String> makeStageEvent (scala.collection.Seq<org.apache.spark.scheduler.StageInfo> stageInfos) { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> makeExecutorEvent (scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.ui.jobs.UIData.ExecutorUIData> executorUIDatas) { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> makeTimeline (scala.collection.Seq<org.apache.spark.scheduler.StageInfo> stages, scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.ui.jobs.UIData.ExecutorUIData> executors, long appStartTime) { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> render (javax.servlet.http.HttpServletRequest request) { throw new RuntimeException(); }
}
