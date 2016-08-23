DEV=eth4

tc qdisc del dev $DEV root

tc qdisc add dev $DEV root handle 1: htb default 30
tc class add dev $DEV parent 1: classid 1:1 htb rate 6mbit burst 15k

tc class add dev $DEV parent 1:1 classid 1:10 htb rate 5mbit burst 15k
tc class add dev $DEV parent 1:1 classid 1:20 htb rate 3mbit ceil 6mbit burst 15k
tc class add dev $DEV parent 1:1 classid 1:30 htb rate 1kbit ceil 6mbit burst 15k

# The author then recommends SFQ for beneath these classes:
tc qdisc add dev $DEV parent 1:10 handle 10: sfq perturb 10
tc qdisc add dev $DEV parent 1:20 handle 20: sfq perturb 10
tc qdisc add dev $DEV parent 1:30 handle 30: sfq perturb 10

# Add the filters which direct traffic to the right classes:
tc filter add dev $DEV protocol ip parent 1:0 prio 1 u32 match ip dst 10.1.1.0/24 flowid 1:10
tc filter add dev $DEV protocol ip parent 1:0 prio 1 u32 match ip dst 155.98.36.0/24 flowid 1:10
tc filter add dev $DEV protocol ip parent 1:0 prio 1 u32 match ip src 10.1.1.0/24 flowid 1:10
tc filter add dev $DEV protocol ip parent 1:0 prio 1 u32 match ip src 155.98.36.0/24 flowid 1:10
