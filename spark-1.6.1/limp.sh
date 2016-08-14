DOWNLINK=5000
UPLINK=5000
DEV=eth3

# clean existing down- and uplink qdiscs, hide errors
tc qdisc del dev $DEV root    
tc qdisc del dev $DEV ingress 

###### uplink

# install root CBQ

tc qdisc add dev $DEV root handle 1: cbq avpkt 1000 bandwidth 150mbit 

# shape everything at $UPLINK speed - this prevents huge queues in your
# DSL modem which destroy latency:
# main class

########## downlink #############
# slow downloads down to somewhat less than the real speed  to prevent 
# queuing at our ISP. Tune to see how high you can set it.
# ISPs tend to have *huge* queues to make sure big downloads are fast
#
# attach ingress policer:

tc qdisc add dev $DEV handle ffff: ingress

# filter *everything* to it (0.0.0.0/0), drop everything that's
# coming in too fast:

tc filter add dev $DEV parent ffff: protocol ip prio 50 u32 match ip src \
   0.0.0.0/0 police  rate 32000bps burst 10240  mpu 0 action drop/continue 