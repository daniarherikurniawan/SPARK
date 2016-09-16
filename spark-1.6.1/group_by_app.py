from pyspark import SparkContext,SparkConf
import shutil,os, sys, time

conf = SparkConf().setAppName("Sorting").setMaster("spark://node-1.testspark.cs331-uc.emulab.net:7077")

sc = SparkContext(conf=conf)
lines = sc.textFile("../generated_file/list_int",2)
result1 = lines.map(lambda a : (int(a),a))
result2 = result1.groupByKey()
