# syntax=docker/dockerfile:1
FROM openjdk:8-jdk-alpine
COPY target/my-simple-application-1.0.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]