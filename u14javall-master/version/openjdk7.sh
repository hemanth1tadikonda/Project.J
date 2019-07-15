#!/bin/bash -e
export OPEN_JDK=7
echo "================ Installing openjdk-"$OPEN_JDK"-jdk ================="
apt-get install -y openjdk-"$OPEN_JDK"-jdk
