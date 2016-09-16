from pyspark import SparkContext,SparkConf
import shutil,os, sys, time

conf = SparkConf().setAppName("Sorting").setMaster("spark://node-1.testspark.cs331-uc.emulab.net:7077")

sc = SparkContext(conf=conf)
val rdd = sc.textFile("../generated_file/list_int",2)
val words = rdd.toArray

val wordPairsRDD = sc.parallelize(words).map(word => (word, 1))


val wordCountsWithGroup = wordPairsRDD
  .groupByKey()
  .map(t => (t._1, t._2.sum))
  .collect()


