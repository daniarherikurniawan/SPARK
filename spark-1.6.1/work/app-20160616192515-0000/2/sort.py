from pyspark import SparkContext,SparkConf
import shutil,os

# non-spark code
if os.path.exists("/tmp/sort_result"):
    shutil.rmtree("/tmp/sort_result")

conf = SparkConf().setAppName("Sort").setMaster("spark://192.168.43.28:7077").set("spark.eventLog.enabled","true").set("spark.eventLog.dir","../generated_driver_log/").set("spark.speculation","true")
sc = SparkContext(conf=conf)

text_file = sc.textFile("../generated_file/list_int",10)
counts = text_file.map(lambda a : (int(a),a)).sortByKey("true")

#print counts.collect()
counts.saveAsTextFile("../generated_file/result_py")



