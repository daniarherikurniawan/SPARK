DEV=eth3

# clean existing down- and uplink qdiscs, hide errors
tc qdisc del dev $DEV root   
tc qdisc del dev $DEV ingress 

###### uplink

# install root CBQ
tc qdisc add dev $DEV  root handle 1: cbq \
avpkt 1000 bandwidth 200mbit

tc class add dev $DEV  parent 1: classid 1:1 cbq \
rate 1kbit allot 1500 prio 5 bounded isolated

tc filter add dev $DEV  parent 1: protocol ip \
prio 16 u32 match ip dst 0.0.0.0/0 flowid 1:1

tc filter add dev $DEV  parent 1: protocol ip \
prio 16 u32 match ip src 0.0.0.0/0 flowid 1:1

