package org.apache.spark.scheduler.cluster.mesos;
// no position
/**
 * A collection of utility functions which can be used by both the
 * MesosSchedulerBackend and the CoarseMesosSchedulerBackend.
 */
  class MesosSchedulerBackendUtil$ implements org.apache.spark.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final MesosSchedulerBackendUtil$ MODULE$ = null;
  public   MesosSchedulerBackendUtil$ () { throw new RuntimeException(); }
  /**
   * Parse a comma-delimited list of volume specs, each of which
   * takes the form [host-dir:]container-dir[:rw|:ro].
   * @param volumes (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.immutable.List<org.apache.mesos.Protos.Volume> parseVolumesSpec (java.lang.String volumes) { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.immutable.List<org.apache.mesos.Protos.ContainerInfo.DockerInfo.PortMapping> parsePortMappingsSpec (java.lang.String portmaps) { throw new RuntimeException(); }
  // not preceding
  public  void addDockerInfo (org.apache.mesos.Protos.ContainerInfo.Builder container, java.lang.String image, scala.Option<scala.collection.immutable.List<org.apache.mesos.Protos.Volume>> volumes, scala.Option<org.apache.mesos.Protos.ContainerInfo.DockerInfo.Network> network, scala.Option<scala.collection.immutable.List<org.apache.mesos.Protos.ContainerInfo.DockerInfo.PortMapping>> portmaps) { throw new RuntimeException(); }
  /**
   * Setup a docker containerizer
   * @param imageName (undocumented)
   * @param conf (undocumented)
   * @param builder (undocumented)
   */
  public  void setupContainerBuilderDockerInfo (java.lang.String imageName, org.apache.spark.SparkConf conf, org.apache.mesos.Protos.ContainerInfo.Builder builder) { throw new RuntimeException(); }
}
