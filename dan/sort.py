from pyspark import SparkContext,SparkConf
import shutil,os

# non-spark code
if os.path.exists("/tmp/sort_result"):
    shutil.rmtree("/tmp/sort_result")

conf = SparkConf().setAppName("Sort").setMaster("spark://192.168.1.11:7077").set("spark.eventLog.enabled","true").set("spark.eventLog.dir","file:/tmp/").set("spark.speculation","true")
sc = SparkContext(conf=conf)

text_file = sc.textFile("numbers.txt")
counts = text_file.map(lambda a : (int(a),a)).sortByKey("true")

#print counts.collect()
counts.saveAsTextFile("file:/tmp/sort_result")


