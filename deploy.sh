#!/usr/bin/env bash

# aws CodeDeploy Agent agent 설치 = https://docs.aws.amazon.com/ko_kr/codedeploy/latest/userguide/codedeploy-agent-operations-install-ubuntu.html

REPOSITORY=/opt/x-ray
cd $REPOSITORY

JAR_NAME=$(ls $REPOSITORY/build/libs/ | grep '.jar' | tail -n 1)
JAR_PATH=$REPOSITORY/build/libs/$JAR_NAME

sudo docker stop $(docker ps -aq)
sudo docker rm $(sudo docker ps -a -q)
sudo docker rmi $(sudo docker images -a -q)


sudo docker build --build-arg JAR_FILE=build/libs/*.jar -t test/x-ray:0.0.1 .
sudo docker run -v /tmp:/tmp -p 80:80 -d --name test-xray test/x-ray:0.0.1
