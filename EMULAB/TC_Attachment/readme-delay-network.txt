
# Haryadi's notes on delaying network

dummynet, tc, netem,


- my test

    ipfw add 100 pipe 1 dst-port 21000
    ipfw pipe 1 config plr 1

    ipfw delete 100

- limit the total incoming TCP traffic to 2Mbit/s, and UDP to 300Kbit/s 

    ipfw add pipe 2 in proto tcp
    ipfw add pipe 3 in proto udp
    ipfw pipe 2 config bw 2Mbit/s
    ipfw pipe 3 config bw 300Kbit/s

- limit incoming traffic to 300Kbit/s for each host on network 10.1.2.0/24. 

    ipfw add pipe 4 src-ip 10.1.2.0/24 in
    ipfw pipe 4 config bw 300Kbit/s queue 20 mask dst-ip 0x000000ff

- simulate an ADSL link to the moon (i.e. add 1 sec delay) 

    ipfw add pipe 3 out
    ipfw add pipe 4 in
    ipfw pipe 3 config bw 128Kbit/s queue 10 delay 1000ms
    ipfw pipe 4 config bw 640Kbit/s queue 30 delay 1000ms

- Packet lost

    ipfw pipe 1 config plr 0.5


- ipfw add

     ipfw add <ruleN> <prob X> action PROTO from SRC to DST [options]

    ipfw add 100 pipe 1 ip from any to any

- ipfw list/delete/flush/zero

    ipfw list
    ipfw -a list (detail)
    ipfw pipe 1 delete
    ipfw pipe flush (deete all pipes)
    ipfw zero (zero the counters)


- ipfw add 1000 allow all from any to any





# misc notes


Nessus


NMap


Snort

network probe




netem

http://stackoverflow.com/questions/614795/simulate-delayed-and-dropped-packets-on-linux



For dropped packets I would simply use iptables and the statistic module.

    netfliter / iptables 

    tc (Traffic control) / netem
      needs ip route
      http://tldp.org/HOWTO/Traffic-Control-HOWTO/index.html   

      http://www.linuxfoundation.org/collaborate/workgroups/networking/netem


    nistnet


    dummynet (MAC OS)

      plr, ipfw

      http://joemiller.me/2010/08/31/simulate-network-latency-packet-loss-and-bandwidth-on-mac-osx/

terms:



