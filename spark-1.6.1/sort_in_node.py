from pyspark import SparkContext,SparkConf
import shutil,os, sys, time


# non-spark code
# if os.path.exists("../generated_file/result_py"):
#     shutil.rmtree("../generated_file/result_py")
if os.path.exists("/proj/cs331-uc/daniar/result_py"):
    shutil.rmtree("/proj/cs331-uc/daniar/result_py")
#some of the configuration is set through declaration at spark-defaults.conf
conf = SparkConf().setAppName("Sorting").setMaster("spark://node-1.testspark.cs331-uc.emulab.net:7077")
# conf = SparkConf().setAppName("Sorting").setMaster("spark://node-5.sparknewtopology.cs331-uc.emulab.net:7077")
# conf = SparkConf().setAppName("Sorting").setMaster("spark://daniar-X450JF:7077")

sc = SparkContext(conf=conf)

lines = spark.read.text(sys.argv[1]).rdd.map(lambda r: r[0])
sorted_array = lines.map(lambda a : (int(a),a)).sortByKey("true")


# text_file = sc.textFile("../generated_file/list_int",2)
# sorted_array = text_file.map(lambda a : (int(a),a)).sortByKey("true")

print("start the delay. Inject TC!!")
time.sleep(30)
print("end the delay")

output = sorted_array.collect()
f = open('workfile', 'w')
for (num, unitcount) in output:
	f.write(str(num)+"\n")
    # print(num)
f.closed
# sorted_array.saveAsTextFile("/proj/cs331-uc/daniar/result_py")

# ./bin/spark-submit sort_in_node.py --master spark://daniar-X450JF:7077 --deploy-mode cluster --num-executors 4
