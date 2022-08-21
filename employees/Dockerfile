#start with base image that contains java runtime
FROM openjdk:17-slim as build

#information about who maintains that image 
MAINTAINER nimisha.com

#Add the jar file to the container
COPY target/employeeservice-0.0.1-SNAPSHOT.jar employeeservice-0.0.1-SNAPSHOT.jar

#executr the jar file java -jar employeeservice-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java","-jar","/employeeservice-0.0.1-SNAPSHOT.jar" ]