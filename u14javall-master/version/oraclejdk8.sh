#!/bin/bash -e
export ORACLEJDK_VERSION=8
echo "================ Installing oracle-java"$ORACLEJDK_VERSION"-installer ================="
echo oracle-java8-installer shared/accepted-oracle-license-v1-1 select true | debconf-set-selections
add-apt-repository -y ppa:webupd"$ORACLEJDK_VERSION"team/java
apt-get update
apt-get install -y oracle-java"$ORACLEJDK_VERSION"-installer
