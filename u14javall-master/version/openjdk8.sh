#!/bin/bash -e
export OPEN_JDK=8
export ICEDTEA=8
echo "================ Installing openjdk-"$OPEN_JDK"-jdk ================="
add-apt-repository -y ppa:openjdk-r/ppa
apt-get update
apt-get install -y openjdk-"$OPEN_JDK"-jdk
add-apt-repository ppa:maarten-fonville/ppa
apt-get update
apt-get install icedtea-"$ICEDTEA"-plugin
