# SPARK

> There are two parts of explanation in this file : **HowTo Run Spark on [Emulab](https://www.emulab.net/)** and **Unstructured Notes for Debugging**



## 1. HowTo Run Spark on [Emulab](https://www.emulab.net/)

### Overview
> The Spark that we want to build is not the full version of Spark. It means that the current Spark is not compiling any extensions for particular systems such as Hive, Docker, Flume, etc. Actually there is no difference for the main functionality if you just want to try the Spark itself. The extension is only needed when we want to integrate Spark with other systems. In this research, I do not need any external integration, so I just modify the [pom.xml](https://github.com/daniarherikurniawan/SPARK/blob/master/spark-1.6.1/pom.xml) file to compile just the necessary package for my research purpose. Besides, by reducing the number of compiled package, the size of the Spark is much more smaller (1 GB for compiling the core Spark and 4.5 GB for compiling the full Spark). That is one of the biggest reason for me because my internet connection is too slow (upload speed: 10 Kbps) to upload such a big file. According to the Spark tutorial, here is the most useful link that you should read:

- http://spark.apache.org/docs/latest/spark-standalone.html
- https://cwiki.apache.org/confluence/display/SPARK/Useful+Developer+Tools#UsefulDeveloperTools-ReducingBuildTimes

> In my case, I should build the Spark from the source, so I can ignore some explanations in those documents that are not related to it. First of all we need to download any version of Spark source from http://spark.apache.org/downloads.html . Basically, there are two different type of build process. The first one is according to this (http://spark.apache.org/docs/latest/building-spark.html) link. It will take a long time to finish. I tried that out by entering this command 

```sh
build/mvn -Pyarn -Phadoop-2.7 -Dhadoop.version=2.7.0 -DskipTests clean package
```

> It is success after solving some problem in the pom.xml files. You have to make sure that the version of Hadoop you gave above is the same with the version in the pom file. The error will show you wich pom file that cause an error. However, this way of building Spark is not suitable for my condition because I do not have much time to wait >10 minutes each time I modify the source code that I need to re-build.

> The second is faster than before. All the explanation is described at [this file] (https://cwiki.apache.org/confluence/display/SPARK/Useful+Developer+Tools#UsefulDeveloperTools-ReducingBuildTimes) in detail. Generally, it is so simple but I faced a lot of problem. Btw, here is the specs of my machine that I use to build the source:

- Core i7 Ram 12 GB, Ubuntu Gnome, Java 8, Maven 3.3.9, Python, Scala, and Hadoop are installed.
- Core 2 Duo (Emulab Machine) Ram 2 GB, Fedora15, Java 8 (manual installation), disk agent, mvn, ant and ssh python.

> Here is the step by step process that we need to follow in order to realize the main goal (Run and compile Spark on Emulab)

###Step by Step
1. Download the Spark's source codes
2. Edit the pom.xml file so it just compile the core Spark. It will reduce the compile time and the size as well.
3. Create a normal assembly. All of the codes and jars should be kept as its original position. The total size is around 700 MB ```sh $ build/sbt clean assembly```
4. Upload all the codes and jars to Emulab. You can use Github, but it cannot be done easily because Github only allows maximum 100 MB size for a single file. You can include that file into gitignore and add it later. There are some ways to upload the file that is bigger than 100 MB, including: Use Filezilla, upload to Google Drive, and Upload as Github released apps. I reccomend you to use the first technique after working around. 
5. Now, we can continue our work on Emulab. As I mention before, the OS Image that I use is FEDORA15-DAGENT-JAVA. I think we can use any other OS as long as it is compatible with Java 8.
6. Since the OS that I used is not having java 8. Here are the way to install and set the environment variable.
```sh
wget --no-cookies --no-check-certificate --header "Cookie: gpw_e24=http%3A%2F%2Fwww.oracle.com%2F; oraclelicense=accept-securebackup-cookie" "http://download.oracle.com/otn-pub/java/jdk/8u92-b14/jdk-8u92-linux-i586.rpm"

mv jdk-8u92-linux-i586.rpm********* jdk-java-8.rpm

sudo yum localinstall jdk-java-8.rpm

setenv JAVA_HOME /usr/java/jdk1.8.0_92/jre
``` 



## 2. Unstructured Notes for Debugging

### Overview

> WebAssembly or wasm is a new, portable, size- and load-time-efficient format suitable for compilation to the web.

> WebAssembly is currently being designed as an open standard by a [W3C Community Group](https://www.w3.org/community/webassembly/) that includes representatives from all major browsers. *Expect the contents of this repository to be in flux: everything is still under discussion.*

- **WebAssembly is efficient and fast**:



### Check which file is slowing down the git push :

- **Write all file SHA1s to a text file:**

	git rev-list --objects --all | sort -k 2 > allfileshas.txt

- **Sort the blobs from biggest to smallest and write results to text file:**

	git gc && git verify-pack -v .git/objects/pack/pack-*.idx | egrep "^\w+ blob\W+[0-9]+ [0-9]+ [0-9]+$" | sort -k 3 -n -r > bigobjects.txt

- **Combine both text files to get file name/sha1/size information:**
	
	for SHA in `cut -f 1 -d\  < bigobjects.txt`; do
		echo $(grep $SHA bigobjects.txt) $(grep $SHA allfileshas.txt) | awk '{print $1,$3,$7}' >> bigtosmall.txt 
	done;

- **Now you can look at the file bigtosmall.txt in order to decide which files you want to remove from your Git history.**



### Generate integer to be sorted:
	python res-generator/generate_list_int.py



### Run the cluster
```sh
cd spark-1.6.1/

$ build/sbt clean assembly # Create a normal assembly

$ export SPARK_PREPEND_CLASSES=true

$ build/sbt compile
# ... do some local development ... #

./sbin/start-master.sh --host '192.168.1.3'

spark://n2.testspark.cs331-uc.emulab.net:7077

./sbin/start-slave.sh spark://n2.testspark.cs331-uc.emulab.net:7077 --memory 1g --cores 2

./sbin/start-slave.sh spark://192.168.1.3:7077 --host '192.168.1.11' --memory 1g --cores 2

./sbin/start-slave.sh spark://192.168.1.3:7077 --host '192.168.1.12' --memory 1g --cores 2

./bin/spark-submit sort.py --master spark://n2.testspark.cs331-uc.emulab.net:7077 --deploy-mode cluster 
```



### Install java 8
```sh
wget --no-cookies --no-check-certificate --header "Cookie: gpw_e24=http%3A%2F%2Fwww.oracle.com%2F; oraclelicense=accept-securebackup-cookie" "http://download.oracle.com/otn-pub/java/jdk/8u92-b14/jdk-8u92-linux-i586.rpm"

mv jdk-8u92-linux-i586.rpm********* jdk-java-8.rpm

sudo yum localinstall jdk-java-8.rpm

setenv JAVA_HOME /usr/java/jdk1.8.0_92/jre
```
	

### Install maven 3.3.3 (not needed | Just FYI)

```sh
wget http://mirror.olnevhost.net/pub/apache/maven/maven-3/3.3.3/binaries/apache-maven-3.3.3-bin.tar.gz

tar xvf apache-maven-3.3.3-bin.tar.gz

setenv M2 /users/daniar/MAVEN/apache-maven-3.3.3
```



### Scratch 
- setenv SPARK_PREPEND_CLASSES true
- sudo build/sbt clean assembly -mem 1500 evicted
- sudo build/sbt compile -mem 1500 evicted (make sure that master and slave are terminated)



### Additional notes
- sha1sum file.jar
- wget -O - "http://localhost:8080/" >> spark_home.html
- cp SPARK/ backup_spark/ -r
- check size : du -sh