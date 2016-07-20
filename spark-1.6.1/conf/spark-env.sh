SPARK_MEM=${SPARK_MEM:-5120m}
export SPARK_MEM
export SPARK_PREPEND_CLASSES=true
# export SPARK_MASTER_IP='192.168.1.8'

# Set JAVA_OPTS to be able to load native libraries and to set heap size
JAVA_OPTS="$OUR_JAVA_OPTS"
JAVA_OPTS="$JAVA_OPTS -Djava.library.path=$SPARK_LIBRARY_PATH"
JAVA_OPTS="$JAVA_OPTS -Xms$SPARK_MEM -Xmx$SPARK_MEM"