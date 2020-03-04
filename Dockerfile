FROM openjdk:8-jdk-alpine
MAINTAINER Jo <isntyet@uneedcomms.com>

VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
