DOWNLINK=10
UPLINK=10
DEV=eth3

# clean existing down- and uplink qdiscs, hide errors
tc qdisc del dev $DEV root    2> /dev/null > /dev/null
tc qdisc del dev $DEV ingress 2> /dev/null > /dev/null

###### uplink

# install root CBQ
tc qdisc del dev $DEV root
tc qdisc add dev $DEV root handle 1: cbq avpkt 1000 bandwidth 100mbit
tc class add dev $DEV parent 1: classid 1:1 cbq rate 256kbit allot 1500 prio 5 bounded isolated
tc filter add dev $DEV parent 1: protocol ip prio 16 u32 match ip dst 10.1.1.* flowid 1:1
tc qdisc add dev $DEV parent 1:1 sfq perturb 10