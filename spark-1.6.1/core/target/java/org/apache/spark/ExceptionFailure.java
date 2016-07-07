package org.apache.spark;
/**
 * :: DeveloperApi ::
 * Task failed due to a runtime exception. This is the most common failure case and also captures
 * user program exceptions.
 * <p>
 * <code>stackTrace</code> contains the stack trace of the exception itself. It still exists for backward
 * compatibility. It's better to use <code>this(e: Throwable, metrics: Option[TaskMetrics])</code> to
 * create <code>ExceptionFailure</code> as it will handle the backward compatibility properly.
 * <p>
 * <code>fullStackTrace</code> is a better representation of the stack trace because it contains the whole
 * stack trace including the exception and its causes
 * <p>
 * <code>exception</code> is the actual exception that caused the task to fail. It may be <code>None</code> in
 * the case that the exception is not in fact serializable. If a task fails more than
 * once (due to retries), <code>exception</code> is that one that caused the last failure.
 */
public  class ExceptionFailure implements org.apache.spark.TaskFailedReason, scala.Product, scala.Serializable {
  // not preceding
  public  java.lang.String className () { throw new RuntimeException(); }
  public  java.lang.String description () { throw new RuntimeException(); }
  public  java.lang.StackTraceElement[] stackTrace () { throw new RuntimeException(); }
  public  java.lang.String fullStackTrace () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.executor.TaskMetrics> metrics () { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.ThrowableSerializationWrapper> exceptionWrapper () { throw new RuntimeException(); }
  // not preceding
  public   ExceptionFailure (java.lang.String className, java.lang.String description, java.lang.StackTraceElement[] stackTrace, java.lang.String fullStackTrace, scala.Option<org.apache.spark.executor.TaskMetrics> metrics, scala.Option<org.apache.spark.ThrowableSerializationWrapper> exceptionWrapper) { throw new RuntimeException(); }
  /**
   * <code>preserveCause</code> is used to keep the exception itself so it is available to the
   * driver. This may be set to <code>false</code> in the event that the exception is not in fact
   * serializable.
   * @param e (undocumented)
   * @param metrics (undocumented)
   * @param preserveCause (undocumented)
   */
     ExceptionFailure (java.lang.Throwable e, scala.Option<org.apache.spark.executor.TaskMetrics> metrics, boolean preserveCause) { throw new RuntimeException(); }
     ExceptionFailure (java.lang.Throwable e, scala.Option<org.apache.spark.executor.TaskMetrics> metrics) { throw new RuntimeException(); }
  public  scala.Option<java.lang.Throwable> exception () { throw new RuntimeException(); }
  public  java.lang.String toErrorString () { throw new RuntimeException(); }
  /**
   * Return a nice string representation of the exception, including the stack trace.
   * Note: It does not include the exception's causes, and is only used for backward compatibility.
   * @param className (undocumented)
   * @param description (undocumented)
   * @param stackTrace (undocumented)
   * @return (undocumented)
   */
  private  java.lang.String exceptionString (java.lang.String className, java.lang.String description, java.lang.StackTraceElement[] stackTrace) { throw new RuntimeException(); }
}
