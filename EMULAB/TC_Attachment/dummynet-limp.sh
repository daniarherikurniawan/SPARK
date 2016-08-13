#!/bin/bash

# Reset dummynet to default config
dnctl -f flush

# Compose an addendum to the default config: creates a new anchor
(cat /etc/pf.conf &&
  echo 'dummynet-anchor "my_anchor"' &&
  echo 'anchor "my_anchor"') | pfctl -q -f -

# Configure the new anchor
cat << EOF | pfctl -q -a my_anchor -f -
#no idea what this is about, disabling it
#no dummynet quick on lo0 all

# running 3 datanode instance
dummynet out proto tcp from port 50010 pipe 1
#dummynet out proto tcp from port 50011 pipe 1
#dummynet out proto tcp from port 50012 pipe 1
EOF

# Create the dummynet queue
dnctl pipe 1 config bw 12800byte/s

# Activate PF
pfctl -E

# to check that dnctl is properly configured: sudo dnctl list
