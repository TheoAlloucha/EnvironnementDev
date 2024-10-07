FROM openjdk:22-jdk-slim

WORKDIR /app

COPY target/untitled2-1.0-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
