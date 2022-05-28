FROM ubuntu:20.04
RUN mkdir -p /u01/middleware
RUN apt update -y
RUN apt install -y openjdk-11-jdk
WORKDIR /u01/middleware
COPY target/configmappoc-0.0.1-SNAPSHOT .
CMD java -jar configmappoc-0.0.1-SNAPSHOT.jar