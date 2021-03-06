# SPARK

> There are three parts of explanation in this file : **HowTo Run Spark on [Emulab](https://www.emulab.net/)**, **Configuring Emulab**, and **Unstructured Notes for Debugging**

## Open Code On Intellij Idea
just follow [this](https://linbojin.github.io/2016/01/09/Reading-Spark-Souce-Code-in-IntelliJ-IDEA/)



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
1. Download the Spark's source codes or just simply clone this repository in your local machine. The version that I use in this repo is 1.6.1.
2. Edit the pom.xml file so it just compile the core Spark. It will reduce the compile time and the size as well.
3. Create a normal assembly. All of the codes and jars should be kept as its original position. The total size is around 700MB.

	``` $ build/sbt clean assembly```

4. Upload all the codes and jars to Emulab. You can use Github, but it cannot be done easily because Github only allows maximum 100 MB size for a single file. You can include that file into gitignore and add it later. There are some ways to upload the file that is bigger than 100 MB, including: Use Filezilla, upload to Google Drive, and Upload as Github released apps. I reccomend you to use the first technique after working around. 
5. Now, we can continue our work on Emulab. As I mention before, the OS Image that I use is FEDORA15-DAGENT-JAVA. I think we can use any other OS as long as it is compatible with Java 8.

6. Upload manual to the Emulab the jar of spark-1.6.1/assembly/target/scala-2.10/ using Filezilla [you can ignore this step if you don't have enough internet speed]

7. Since the OS that I used is not having java 8. Here are the way to install and set the environment variable. We have to do this every single time we start Emulab.
	```
	wget --no-cookies --no-check-certificate --header "Cookie: gpw_e24=http%3A%2F%2Fwww.oracle.com%2F; oraclelicense=accept-securebackup-cookie" "http://download.oracle.com/otn-pub/java/jdk/8u92-b14/jdk-8u92-linux-i586.rpm"

	mv jdk-8u92-linux-i586.rpm********* jdk-java-8.rpm

	sudo yum localinstall jdk-java-8.rpm

	setenv JAVA_HOME /usr/java/jdk1.8.0_92/jre
	``` 
	> If you clone this repository, you can simply run ***bash scripts.sh*** right after login in the emulab server. To update the script, you can run 
	```
	cp /proj/cs331-uc/daniar/SPARK/EMULAB/scripts.sh /users/daniar/ 
	chmod u+x scripts.sh
	and run:
	bash scripts.sh 
	move directory to:
	cd /proj/cs331-uc/daniar/SPARK/spark-1.6.1/
	```

	> In the above script, I clone the repository at cp /proj/cs331-uc/daniar/SPARK/ and /users/daniar/ is my current directory after I got logged in.  


8. Then tell the Spark that we would not compile everything from the start
	
	``` 
	setenv SPARK_PREPEND_CLASSES true 
	or
	export SPARK_PREPEND_CLASSES=true [if you are working on Ubuntu]
	``` 

9. Do some local development! You can modify the source in ***core*** folder as you need and then run:
	
	``` sudo build/sbt compile -mem 1500 evicted ```

	``` sudo build/sbt compile -mem 60000 evicted ```

	``` sudo build/sbt compile -mem 10000 evicted ```
	
	To compile just the core and it just need a few minutes. 
	***[Note: It will failed at the first try due to dependency error. But after the second try it will success]***
	Btw, you have to make sure that your Spark is not running during this step. You can simply run :

	``` ./sbin/stop-all.sh ```


10.	To Prepare the Local Environment

	```
		cd /tmp/SPARK/spark-1.6.1/
		git pull
		setenv SPARK_PREPEND_CLASSES true 
		sudo build/sbt compile -mem 1500 evicted

		cd /tmp/
		cp /proj/cs331-uc/daniar/SPARK/ . -r
		cd SPARK/spark-1.6.1/

		git pull
		setenv SPARK_PREPEND_CLASSES true 
		sudo build/sbt compile -mem 1500 evicted

		time cp /tmp/SPARK/generated_file/list_int .
		
		time wget --no-cookies --no-check-certificate --header "Cookie: gpw_e24=http%3A%2F%2Fwww.oracle.com%2F; oraclelicense=accept-securebackup-cookie" "http://download.oracle.com/otn-pub/java/jdk/8u92-b14/jdk-8u92-linux-i586.rpm"
		time cp jdk-8u92-linux-i586.rpm jdl 
	```



10. Run the Spark as described in [this file](http://spark.apache.org/docs/latest/spark-standalone.html). The simple one is by running :
	
	``` ./sbin/start-all.sh ```
	
	or

	``` 
	./sbin/start-master.sh

	./sbin/start-slave.sh spark://n1.testspark.cs331-uc.emulab.net:7077 --memory 1g --cores 2
	./sbin/start-slave.sh spark://n1.testspark.cs331-uc.emulab.net:7077 --memory 60g --cores 8
	./sbin/start-slave.sh spark://n1.testspark.cs331-uc.emulab.net:7077 --memory 1g --cores 8
	./sbin/start-slave.sh spark://n1.testspark.cs331-uc.emulab.net:7077 --memory 10g --cores 4

	./sbin/start-slave.sh spark://node-1.testspark.cs331-uc.emulab.net:7077 --memory 10g --cores 4

	./sbin/start-slave.sh spark://node-5.sparknewtopology.cs331-uc.emulab.net:7077 --memory 10g --cores 4

	sudo apt-get install bmon

	```

11. Create the payload. It depends on what kind of process you need. In my case, I want Spark to sort the array of integers in ascending order and then save the result in the folder generated_file/result_py. So I create a Python program to generate the integers by running:
	
	``` python res-generator/generate_list_int.py ```

12. All of the task will be run as Python apps which can be found in file [sort.py](https://github.com/daniarherikurniawan/SPARK/blob/master/spark-1.6.1/sort.py). You can create your own task and specify the process as you need. To submit the app, use this following command:

	``` 
	for Emulab: 
	./bin/spark-submit sort.py --master spark://n1.testspark.cs331-uc.emulab.net:7077 --deploy-mode cluster --num-executors 4
	
	./bin/spark-submit sort_in_node.py --master spark://node-1.testspark.cs331-uc.emulab.net:7077 --deploy-mode cluster --num-executors 4

	./bin/spark-submit sort_in_node.py --master spark://node-5.sparknewtopology.cs331-uc.emulab.net:7077 --deploy-mode cluster --num-executors 4
	
	cd ../generated_file/result_py/
	cd ../../spark-1.6.1/

	for localhost: 
	./bin/spark-submit sort_localhost.py --master spark://daniar-X450JF:7077 --deploy-mode cluster --num-executors 1

	```
bin/spark-submit will also read configuration options from conf/spark-defaults.conf, in which each line consists of a key and a value separated by whitespace. For example:

	```
	spark.master            spark://5.6.7.8:7077
	spark.executor.memory   4g
	spark.eventLog.enabled  true
	spark.serializer        org.apache.spark.serializer.KryoSerializer
	```


13. The log files will be stored in folder [generated_driver_log](https://github.com/daniarherikurniawan/SPARK/tree/master/generated_driver_log).

14. For the ease, you can retrieve the html page of master and slave nodes by running:
	
	```wget -O - "http://localhost:8080/" >> spark_home.html```

	Of course you need to know the URL in order to get the detail visualizations. You can get the URL by opening Spark visualization when you run Spark in your local machine. In Emulab, we cannot exactly see the web page. That is why you need to understand the bigger picture of the visualization before analyzing the downloaded html page from Emulab's node.

	> Apparently, you don't need to download all the page manually. You can visit *http://n1.testspark.cs331-uc.emulab.net:8080/ *. The link is not always the same, it depends on your project name, your experiment name, and the port that is open in your Emulab server.




## 2. Configure Emulab

### Create the ns file
```
set ns [new Simulator]                  
source tb_compat.tcl

set n1 [$ns node]
set n2 [$ns node]
set n3 [$ns node]
set n4 [$ns node]

set lan0 [$ns make-cloud "$n1 $n2 $n3 $n4" 100Mb 0ms]

tb-set-node-lan-bandwidth $n2 $lan0 20Mb

tb-set-node-os $n1 FEDORA15-DAGENT-JAVA
tb-set-node-os $n2 FEDORA15-DAGENT-JAVA
tb-set-node-os $n3 FEDORA15-DAGENT-JAVA
tb-set-node-os $n4 FEDORA15-DAGENT-JAVA

#d710
tb-set-hardware $n1 pc3000
tb-set-hardware $n2 pc3000
tb-set-hardware $n3 pc3000
tb-set-hardware $n4 pc3000

tb-set-node-rpms $n1 /proj/cs331-uc/resources//iperf-2.0.5-3.fc15.i686.rpm
tb-set-node-rpms $n2 /proj/cs331-uc/resources//iperf-2.0.5-3.fc15.i686.rpm
tb-set-node-rpms $n3 /proj/cs331-uc/resources//iperf-2.0.5-3.fc15.i686.rpm
tb-set-node-rpms $n4 /proj/cs331-uc/resources//iperf-2.0.5-3.fc15.i686.rpm

$ns run
```

### Slow down the link/network
> You can modify the bandwidth by declaring the necessary value in the ns file. The detail tutorial about the syntax can be found at [https://wiki.emulab.net/wiki/Emulab/wiki/nscommands](https://wiki.emulab.net/wiki/Emulab/wiki/nscommands) If you need to modify the bandwidth on the fly, then you can use the menu in the Emulab project called ***Modify Traffic Shaping***. After entering the needed bandwidth value, you should check the **save** and then click the **execute** button.


### Using TEVC
> Actually there are some other ways to do this as I mention in the section above. However the previous method seems less effective than this one. In this technique, we are using tevc. The detail about tevc and the delay syntax can be seen at [https://wiki.emulab.net/wiki/DelayImplementation](https://wiki.emulab.net/wiki/DelayImplementation), [https://wiki.emulab.net/wiki/Emulab/wiki/AdvancedExample](https://wiki.emulab.net/wiki/Emulab/wiki/AdvancedExample), and [https://www.emulab.net/tutorial/mobilewireless.php3](https://www.emulab.net/tutorial/mobilewireless.php3). These are the steps: 

- Establish a ssh connection to any node in the cluster
- /usr/testbed/bin/tevc -e proj/exp ***SYNTAX***
- the reboot should not be needed, but I got an advise to do so
- Reboot can also be trigerred from the tevc
- Finally, check the link's bandwidth using iperf whether it is modified as we want

>BTW. From the user perspective, links and LANs can be shaped "statically" by
specifying their characteristics once in the NS file, or dynamically by
sending "shaping events" via a web page, client GUI, of the command line
tool "tevc." source: [https://wiki.emulab.net/wiki/Emulab/wiki/DelayImplementation](https://wiki.emulab.net/wiki/Emulab/wiki/DelayImplementation)

>In both the simple-static and simple-dynamic models, tevc commands are
used to assign characteristics to the various per-pair pipes created above.
In the static case, this is done only at boot time.  In the dynamic case,
it is done periodically throughout the lifetime of the experiment.  To
accomplish this, the tevc MODIFY event is augmented with an additional
DEST parameter.  The DEST parameter is used to identify a specific node
pair pipe (the source is implied by the link object targeted by the tevc
command).  If the DEST parameter is not given, then the modification is
applied to the "default" pipe (i.e., the normal shaping behavior).  For
example:

	/usr/testbed/bin/tevc -e cs331-uc/TestSpark now cloud-n4 MODIFY BANDWIDTH=10000
    tevc -e pid/eid now cloud-n4 MODIFY BANDWIDTH=1000 DELAY=10

Assuming 10.0.0.2 is "n2" in the diagram above, this would change n1's
"to n2 pipe" to shape the bandwidth, and change n1's "from n2 pipe" to
handle the delay.  If a more "balanced" shaping is desired, half of each
characteristic could be applied to both sides via:

    tevc -e pid/eid now cloud-n1 MODIFY DEST=10.0.0.2 BANDWIDTH=1000 DELAY=5
    tevc -e pid/eid now cloud-n2 MODIFY DEST=10.0.0.1 BANDWIDTH=1000 DELAY=5


### Using tc Instead of tevc
> source: [http://lartc.org/howto/lartc.qdisc.classful.html](http://lartc.org/howto/lartc.qdisc.classful.html)

```
set ns [new Simulator]
source tb_compat.tcl

# set num nodes
set maxnodes 3

# to create LAN
set lanstr ""

# Create LAN including node from 1 to N
for { set i 1 } { $i <= $maxnodes } { incr i } {
set node($i) [$ns node]
append lanstr "$node($i) "
tb-set-node-os $node($i) UBUNTU14-64-STD-DAN
tb-set-hardware $node($i) d710
}

# set lan here
set lan0 [$ns make-lan "$lanstr" 1000Mb 0ms]

# enable this to get rid of the delay node, as stated by emulab this
# the delay will be implemented using tc on linux (https://wiki.emulab.net/Emulab/wiki/linkdelays)

tb-set-endnodeshaping $lan0 1

# manually shape bandwidth of this node using its delay node
tb-set-node-lan-bandwidth $node(2) $lan0 101Mb

$ns rtproto Static
$ns run
```

###The famous CBQ qdisc (Doesn't work)

As said before, CBQ is the most complex qdisc available, the most hyped, the least understood, and probably the trickiest one to get right. This is not because the authors are evil or incompetent, far from it, it's just that the CBQ algorithm isn't all that precise and doesn't really match the way Linux works.

Besides being classful, CBQ is also a shaper and it is in that aspect that it really doesn't work very well. It should work like this. If you try to shape a 10mbit/s connection to 1mbit/s, the link should be idle 90% of the time. If it isn't, we need to throttle so that it IS idle 90% of the time.

This is pretty hard to measure, so CBQ instead derives the idle time from the number of microseconds that elapse between requests from the hardware layer for more data. Combined, this can be used to approximate how full or empty the link is.

This is rather tortuous and doesn't always arrive at proper results. For example, what if the actual link speed of an interface that is not really able to transmit the full 100mbit/s of data, perhaps because of a badly implemented driver? A PCMCIA network card will also never achieve 100mbit/s because of the way the bus is designed - again, how do we calculate the idle time?

It gets even worse if we consider not-quite-real network devices like PPP over Ethernet or PPTP over TCP/IP. The effective bandwidth in that case is probably determined by the efficiency of pipes to userspace - which is huge.

People who have done measurements discover that CBQ is not always very accurate and sometimes completely misses the mark.

In many circumstances however it works well. With the documentation provided here, you should be able to configure it to work well in most cases.


### Hierarchical Token Bucket (Almost work properly)

Martin Devera (<devik>) rightly realised that CBQ is complex and does not seem optimized for many typical situations. His Hierarchical approach is well suited for setups where you have a fixed amount of bandwidth which you want to divide for different purposes, giving each purpose a guaranteed bandwidth, with the possibility of specifying how much bandwidth can be borrowed.

HTB works just like CBQ but does not resort to idle time calculations to shape. Instead, it is a classful Token Bucket Filter - hence the name. It has only a few parameters, which are well documented on [http://luxik.cdi.cz/~devik/qos/htb/](http://luxik.cdi.cz/~devik/qos/htb/).

As your HTB configuration gets more complex, your configuration scales well. With CBQ it is already complex even in simple cases! HTB3 (check its homepage [http://luxik.cdi.cz/~devik/qos/htb/](http://luxik.cdi.cz/~devik/qos/htb/) for details on HTB versions) is now part of the official kernel sources (from 2.4.20-pre1 and 2.5.31 onwards). However, maybe you still need to get a HTB3 patched version of 'tc': HTB kernel and userspace parts must be the same major version, or 'tc' will not work with HTB.

>clearing tc rules :

``` 
	sudo tc qdisc del dev eth0 root
	sudo tc qdisc del dev eth0 ingress
```

> before running the tc, please check using **ifconfig** to make sure the ethernet id.
run tc :

``` 
	cd /proj/cs331-uc/daniar/SPARK/EMULAB/TC_Attachment
	cd /proj/cs331-uc/daniar/SPARK/spark-1.6.1/

	git checkout limp.sh
	git pull
	chmod u+x limp.sh
	sudo ./limp.sh eth1

	git checkout tc_htb.sh
	git pull
	chmod u+x tc_htb.sh
	sudo ./tc_htb.sh eth1
```

> **Throttling a sustained maximum rate**
> So, let’s configure a sustained maximum rate using tc. In other words, lets configure Linux to never allow eth0 to use more than 1kbps regardless of port or application.


```
	sudo tc qdisc del dev eth4 root
	sudo tc qdisc del dev eth4 ingress

	sudo tc qdisc add dev eth4 handle 1: root htb default 11
	sudo tc class add dev eth4 parent 1: classid 1:1 htb rate 100kbps
	sudo tc class add dev eth4 parent 1:1 classid 1:11 htb rate 100kbps
```

>**Check the speed:**

```
	wget -O speedtest-cli https://raw.github.com/sivel/speedtest-cli/master/speedtest_cli.py

	chmod +x speedtest-cli
	./speedtest-cli
```

## 3. Unstructured Notes for Debugging

### Check the bandwidth
> We will use iperf tool to check the bandwidth, you can read the detail at : [iperf.fr](https://iperf.fr/). Here is the simple tutorial that suitable to our needs: [http://www.slashroot.in/iperf-how-test-network-speedperformancebandwidth](http://www.slashroot.in/iperf-how-test-network-speedperformancebandwidth). I wrapped it up in the following points:

- There is two syntax, the first to be run on the host and the second is for the client.
- The idea is iperf will transfer some amount of data from the client to the host and then they will record the bandwidth.
- Here is the script:

```
for the host/server (it will listen for the incoming package from the client) :
iperf -s    (suppose that the IP is 10.1.1.3) 

for the client :
iperf -c 10.1.1.3  

you should run the second script in every other node in order to know the bandwidth 
between the host and the specified client nodes

kill the iperf :

 ps -ef | grep iperf
 kill -9 

``` 


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


###Installing Java 8 on Ubuntu

First you need to add webupd8team Java PPA repository in your system and install Oracle Java 8 using following set of commands.

	$ sudo add-apt-repository ppa:webupd8team/java
	$ sudo apt-get update
	$ sudo apt-get install oracle-java8-installer


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

./sbin/start-slave.sh spark://n1.testspark.cs331-uc.emulab.net:7077 --memory 1g --cores 2

./sbin/start-slave.sh spark://daniar-X450JF:7077 --memory 1g --cores 2

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
- copy folder: cp SPARK/ backup_spark/ -r
- check size : du -sh file.txt
- find a word in the file folder : grep -nr 'yourString*' .
	or [in sublime](http://stackoverflow.com/questions/20519040/search-in-all-files-in-a-project-in-sublime-text-3) 
- check available RAM : cat /proc/meminfo
- add all new file to git : git add -A .
- check linux distribution type: lsb_release -a
- check download big file : wget http://mirror.ufs.ac.za/linuxmint/stable/14/linuxmint-14-kde-dvd-64bit.iso
- check file detail : ls -lh .




###Finding
- we can specify minimum core to start the process
- worker will connect to driver
- worker will create executor as the number specified when submitting the app
- CoarseGrainedExecutorBackend will be run by the worker 
- TaskSchedulerImpl:
	The task id is consist of two index X.Y. So the first task is marked as 0.0. If the task is duplicated, the Y index will be incremented. The 0.0 task will be duplicated to 0.1. If one of them is finished, the driver will ignore the other redundant tasks. 

	The driver offers task to every worker that will be managed in this class. Since the number of partition is two, it will choose the most two available worker to run the task. So far, the worker that run both of the partition are always the same because I sorted the tasks by its taskid. 


- FileSystemPersistenceEngine
	 * Stores data in a single on-disk directory with one file per application and worker.
	 * Files are deleted when applications and workers are removed.

- SparkSubmitArguments
	
	```
	def isStandaloneCluster: Boolean = {
    	master.startsWith("spark://") && deployMode == "cluster"
  	}
  	```

- Logging folder should be NFS to be accessible for every node

### Current Configuration
- There are 5 nodes
- 1 master
- 4 slaves
- There are 3 Job (Depend on our application)
	- Job 0: sortByKey
		- Stage 0 : sortByKey
	- Job 1: sortByKey
		- Stage 1 : sortByKey
	- Job 2: collect
		- Stage 2 : sortByKey
		- Stage 3 : collect
- Obviously, there are 4 Stages 
- Parallelism only occurs when running tasks inside single stage
- Each stage is run sequentially  
- Currently, there are 2 tasks for each stage. We can specify number of tasks in every stage by changing ```2``` at file sort_in_node.py: ```text_file = sc.textFile("/proj/cs331-uc/daniar/SPARK/generated_file/list_int",2)``` 
- About workload:
	- The application will sort 4.000.000 random array of integers at /proj/cs331-uc/daniar/SPARK/generated_file/list_int
	- size: 31 MB
	- snippet of sort_in_array.py
		```
		sc = SparkContext(conf=conf)
		text_file = sc.textFile("/proj/cs331-uc/daniar/SPARK/generated_file/list_int",2)
		sorted_array = text_file.map(lambda a : (int(a),a)).sortByKey("true")

		output = sorted_array.collect()
		
		f = open('workfile', 'w')
		for (num, unitcount) in output:
			f.write(str(num)+"\n")
		f.closed 
		```
- About the scenario:
	- slaves / worker identified by W, so there are W1, W2, W3, W4
	- Every task on Stage 0 (1st stage), Stage 1, and Stage 2 are run on W1 and W2. The tasks of a single stage will be divided evenly(if possible) at W1 and W2. In this case, we only have 2 task, so each worker / slave will run a single task.
	- Stage 3 (4th stage) is run on W3 and W4.
	- When stage 3 is running, it needs data that are stored in W1 and W2 (from the previous stage).
	- ***We will throttle W2 (decrease the BW to 1 Mbps)***

- About throttling
	- using [HTB](https://github.com/daniarherikurniawan/SPARK#hierarchical-token-bucket-almost-work-properly), part of ***tc tools***
	- command for htb:
		```
		this needs 5.5 min to complete the task without PBSE

		sudo tc qdisc add dev eth0 handle 1: root htb default 11
		sudo tc class add dev eth0 parent 1: classid 1:1 htb rate 0.125mbps
		sudo tc class add dev eth0 parent 1:1 classid 1:11 htb rate 0.125mbps

		sudo tc qdisc add dev eth2 handle 1: root htb default 11
		sudo tc class add dev eth2 parent 1: classid 1:1 htb rate 0.125mbps
		sudo tc class add dev eth2 parent 1:1 classid 1:11 htb rate 0.125mbps

		sudo tc qdisc add dev eth3 handle 1: root htb default 11
		sudo tc class add dev eth3 parent 1: classid 1:1 htb rate 0.125mbps
		sudo tc class add dev eth3 parent 1:1 classid 1:11 htb rate 0.125mbps

		sudo tc qdisc add dev lo handle 1: root htb default 11
		sudo tc class add dev lo parent 1: classid 1:1 htb rate 0.125mbps
		sudo tc class add dev lo parent 1:1 classid 1:11 htb rate 0.125mbps

		sudo tc qdisc add dev eth4 handle 1: root htb default 11
		sudo tc class add dev eth4 parent 1: classid 1:1 htb rate 0.125mbps
		sudo tc class add dev eth4 parent 1:1 classid 1:11 htb rate 0.125mbps


		this needs 2.8 min to complete the task without PBSE: (Prefer this for testing)

		sudo tc qdisc add dev eth0 handle 1: root htb default 11
		sudo tc class add dev eth0 parent 1: classid 1:1 htb rate 0.325mbps
		sudo tc class add dev eth0 parent 1:1 classid 1:11 htb rate 0.325mbps

		sudo tc qdisc add dev eth2 handle 1: root htb default 11
		sudo tc class add dev eth2 parent 1: classid 1:1 htb rate 0.325mbps
		sudo tc class add dev eth2 parent 1:1 classid 1:11 htb rate 0.325mbps

		sudo tc qdisc add dev eth3 handle 1: root htb default 11
		sudo tc class add dev eth3 parent 1: classid 1:1 htb rate 0.325mbps
		sudo tc class add dev eth3 parent 1:1 classid 1:11 htb rate 0.325mbps

		sudo tc qdisc add dev lo handle 1: root htb default 11
		sudo tc class add dev lo parent 1: classid 1:1 htb rate 0.325mbps
		sudo tc class add dev lo parent 1:1 classid 1:11 htb rate 0.325mbps

		sudo tc qdisc add dev eth4 handle 1: root htb default 11
		sudo tc class add dev eth4 parent 1: classid 1:1 htb rate 0.325mbps
		sudo tc class add dev eth4 parent 1:1 classid 1:11 htb rate 0.325mbps

		```
	- After running that command, SPARK will kill that slow node (W2) automatically (***when PBSE is implemented***). To restart, clear the htb effect by :
		```
		sudo tc qdisc del dev eth0 root
		sudo tc qdisc del dev eth2 root
		sudo tc qdisc del dev eth3 root
		sudo tc qdisc del dev eth4 root
		sudo tc qdisc del dev lo root

		```


### How To Run
- open ssh at all five nodes
- execute ```cd /proj/cs331-uc/daniar/SPARK/spark-1.6.1/``` on every node
- at node 1 execute : ```./sbin/start-master.sh```
- at another node execute : ```./sbin/start-slave.sh spark://node-1.testspark.cs331-uc.emulab.net:7077 --memory 10g --cores 4```
	if you change --cores 4, you should edit SparkDeploySchedulerBackend.scala on ```totalCoreCount.get() >= numberOfCore * numberOfSlave ```
- submit task by executing this on any node : ```./bin/spark-submit sort_in_node.py --master spark://node-1.testspark.cs331-uc.emulab.net:7077 --deploy-mode cluster --num-executors 4```

### How To Compile
```
git pull
setenv SPARK_PREPEND_CLASSES true 
sudo build/sbt compile -mem 1500 evicted
```

### PBSE Implementation
- Open intellijIdea at ./opt/idea/bin/idea.sh
- Edit ShuffleBlockFetcherIterator.scala
- Edit Executor.scala
- Edit HeartbeatReceiver.scala
- Edit log4j-defaults-repl.properties to activate all log
- Documentation on progress
- Analyzed file
	1. Investigate who call onBlockFetchSuccess on ShuffleBlockFetcherIterator.scala
		- BlockTransferService.scala NO
		- BlockStoreShuffleReader No
		- BufferReleasingInputStream NO
		- TaskMetrics IMPORTANT! (BW could be included in this class)

	2. Investigate fetchBlocks Maybe
		- NettyBlockTransferService NO
		- BlockManager NO
		- OneForOneBlockFetcher.java NO

	3. ShuffleBlockFetcherIterator
		- Log: hasNext ??  numBlocksProcessed: X numBlocksToFetch Y
		- block is represented by data that is stored in other node. In this current configuration, there are only counted as 2 different blocks
		- maxBytesInFlight = 50 MB (according to code in ShuffleBlockFetcherIterator)
		```
		    logInfo("on BlockStoreShuffleReader Iterator")

		    val blockFetcherItr = new ShuffleBlockFetcherIterator(
	      	context,
	      	blockManager.shuffleClient,
	      	blockManager,
	      	mapOutputTracker.getMapSizesByExecutorId(handle.shuffleId, startPartition, endPartition),
	      	// Note: we use getSizeAsMb when no suffix is provided for backwards compatibility
	      	SparkEnv.get.conf.getSizeAsMb("spark.reducer.maxSizeInFlight", "48m") * 1024 * 1024)
		```
		code to change the maxSizeInFlight
		```
		spark-1.6.1/docs/configuration.md:
  		<tr><th>Property Name</th><th>Default</th><th>Meaning</th></tr>
  		<tr>
  			<td><code>spark.reducer.maxSizeInFlight</code></td>
  			<td>48m</td>
  			<td>
		```
		or just edit the sort_in_node.py (this is what I did)
		```
		.set("spark.reducer.maxSizeInFlight", "1m")
		```

		- The current data in each node is 16.7 MB so it is counted as one transfer/flight. But when I change the maxSizeInFlight to 1 MB, both of the transfers from Slow and Fast node will have almost the same latency (elapsed time of data fetching  W1 -> W3 and W2(slow)-> W3 are the same). I believe it is caused by the limited number of thread in Worker. To transfer 16.7 MB, it needs around 16 threads, but the number of threads should be the same with the number of tasks (2). So the transfer (fetching data)  from fast node will be affected by slow node because they need to wait until there is available thread to fetch the data. Therefore, the latency is almost the same (only differ by hundreds of ms).
		- So, if I need to monitor the BW as real time as possible, I should get an access to data chunk transfer. Transferring 16.7 MB spents 4 min. Right now, I cannot see the progress of data transfer in that 4 min. I will find it on RPC modules.

	4. NettyBlockRpcServer
		- The rpc for transferring each block is managed by this class
		- The maximum size of each block is 50 MB. The current data on each node is 16.7 MB, so it is counted as a single block.
		