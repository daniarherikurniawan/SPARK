DEV=eth4
[ ! -z $1 ] && DEV=$1
tc qdisc del dev $DEV root

tc qdisc add dev $DEV root handle 1: htb default 10
tc class add dev $DEV parent 1: classid 1:1 htb rate 6mbit burst 15k

tc class add dev $DEV parent 1:1 classid 1:10 htb rate 5mbit burst 15k

# The author then recommends SFQ for beneath these classes:
tc qdisc add dev $DEV parent 1:10 handle 10: sfq perturb 10
