
FROM openjdk:11-jre-slim
WORKDIR /app
COPY target/backend-1.0.0.jar /app/backend.jar
EXPOSE 8084
ENTRYPOINT ["java", "-jar", "/app/backend.jar"]
