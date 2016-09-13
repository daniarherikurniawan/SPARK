# SPARK_MEM=${SPARK_MEM:-5120m}
# export SPARK_MEM
export SPARK_PREPEND_CLASSES=true
export SPARK_WORKER_INSTANCES=2

export SPARK_LOCAL_IP=155.98.36.0

# Set JAVA_OPTS to be able to load native libraries and to set heap size
JAVA_OPTS="$OUR_JAVA_OPTS"
JAVA_OPTS="$JAVA_OPTS -Djava.library.path=$SPARK_LIBRARY_PATH"
JAVA_OPTS="$JAVA_OPTS -Xms$SPARK_MEM -Xmx$SPARK_MEM"

