DEV=eth4

# clean existing down- and uplink qdiscs, hide errors
tc qdisc del dev $DEV root   

###### uplink
tc qdisc add dev $DEV root handle 1: cbq avpkt 1000 bandwidth 100mbit

#100Mbps
#tc class add dev $DEV parent 1: classid 1:1 cbq rate 385kbit allot 1500 prio 5 bounded isolated


#10Mbps
# tc class add dev $DEV parent 1: classid 1:1 cbq rate 50kbit allot 1500 prio 5 bounded isolated

#1Mbps
# tc class add dev $DEV parent 1: classid 1:1 cbq rate 5kbit allot 1500 prio 5 bounded isolated

#0.1Mbps
# tc class add dev $DEV parent 1: classid 1:1 cbq rate 500 allot 1500 prio 5 bounded isolated

#0.01Mbps
tc class add dev $DEV parent 1: classid 1:1 cbq rate 15 allot 1500 prio 5 bounded isolated

tc filter add dev $DEV parent 1: protocol ip prio 16 u32 match ip src 0.0.0.0/0 flowid 1:1
tc qdisc add dev $DEV parent 1:1 sfq perturb 10