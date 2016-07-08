# SPARK

> There are two parts of explanation in this file : **HowTo Run Spark on [Emulab](https://www.emulab.net/)** and **Unstructured Notes for Debugging**



## 1. HowTo Run Spark on [Emulab](https://www.emulab.net/)

### Overview
> The Spark that we want to build is not the full version of Spark. It means that the current Spark is not compiling any extensions for particular systems such as Hive, Docker, Flume, etc. Actually there is no difference for the main functionality. The extension is only needed when we want to integrate Spark with other systems. In this research, I do not need any external integration, so I just modify the [pom.xml](https://github.com/daniarherikurniawan/SPARK/blob/master/spark-1.6.1/pom.xml) file to compile the necessary package for my research purpose.   


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