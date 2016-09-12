from pyspark import SparkContext,SparkConf
import shutil,os

# non-spark code
if os.path.exists("../generated_file/result_py"):
    shutil.rmtree("../generated_file/result_py")
#some of the configuration is set through declaration at spark-defaults.conf
conf = SparkConf().setAppName("Sorting").setMaster("spark://node-1.testspark.cs331-uc.emulab.net:7077")

sc = SparkContext(conf=conf)
text_file = sc.textFile("../generated_file/list_int")
counts = text_file.map(lambda a : (int(a),a)).sortByKey("true")
counts.saveAsTextFile("../generated_file/result_py")

