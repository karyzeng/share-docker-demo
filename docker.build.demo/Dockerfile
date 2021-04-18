# Dockerfile test
FROM openjdk:8-jre-alpine
WORKDIR /app
COPY /target/docker.build.demo-0.0.1.jar /app/
ENTRYPOINT ["java", "-jar", "docker.build.demo-0.0.1.jar"]