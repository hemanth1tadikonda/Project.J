#!/bin/bash -e
export OPEN_JDK=10
echo "================ Installing openjdk"$OPEN_JDK"-installer ================="
sudo add-apt-repository ppa:openjdk-r/ppa
sudo apt-get update
sudo apt install -y openjdk-"$OPEN_JDK"-jdk
