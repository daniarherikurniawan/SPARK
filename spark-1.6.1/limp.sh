DEV=eth3

# clean existing down- and uplink qdiscs, hide errors
tc qdisc del dev $DEV root   
tc qdisc del dev $DEV ingress 

###### uplink

tc qdisc del dev $DEV root
tc qdisc add dev $DEV root handle 1: cbq avpkt 1000 bandwidth 100mbit
tc class add dev $DEV parent 1: classid 1:1 cbq rate 50kbit allot 1500 prio 5 bounded isolated
tc filter add dev $DEV parent 1: protocol ip prio 16 u32 match ip src 0.0.0.0/0 flowid 1:1
tc qdisc add dev $DEV parent 1:1 sfq perturb 10