FROM openjdk:8-jdk-alpine
ADD mongo.jar mongo.jar
VOLUME /src/main/resources
ADD sample.json /src/main/resources
ENTRYPOINT ["java","-jar","mongo.jar"]