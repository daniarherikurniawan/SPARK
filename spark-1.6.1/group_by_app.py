from pyspark import SparkContext,SparkConf
import shutil,os, sys, time

conf = SparkConf().setAppName("Sorting").setMaster("spark://node-1.testspark.cs331-uc.emulab.net:7077")

sc = SparkContext(conf=conf)
rdd = sc.parallelize([1, 1, 2, 3, 5, 8])
result = rdd.groupBy(lambda x: x % 2).collect()


