# clean existing down- and uplink qdiscs, hide errors
tc qdisc del dev eth0 root    
tc qdisc del dev eth0 ingress 

###### uplink

 # implicitly sets up class 1:1
    tc qdisc add dev eth0 root handle 1 plr 0.05

    # attach to class 1:1 and tell the module the default place to send
    # traffic is to class 2:1 (could attach filters to discriminate)
    tc qdisc add dev eth0 parent 1:1 handle 2 htb default 1

    # class 2:1 does the actual limiting
    tc class add dev eth0 parent 2 classid 2:1 htb rate 50Mbit ceil 50Mbit

    # attach to class 2:1, also implicitly creates class 3:1, and attaches
    # a FIFO queue to it.
    tc qdisc add dev eth0 parent 2:1 handle 3 delay usecs 20000


 iptables -t mangle -A PREROUTING -i eth0 -j IMQ --todev 0