from pyspark import SparkContext,SparkConf
import shutil,os, sys, time

conf = SparkConf().setAppName("Sorting").setMaster("spark://node-1.testspark.cs331-uc.emulab.net:7077")

sc = SparkContext(conf=conf)
rdd = sc.textFile("../generated_file/list_int",2)
words = rdd.toArray

wordPairsRDD = sc.parallelize(words).map(word => (word, 1))


wordCountsWithGroup = wordPairsRDD
  .groupByKey()
  .map(t => (t._1, t._2.sum))
  .collect()


