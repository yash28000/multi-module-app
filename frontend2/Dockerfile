FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/frontend2-1.0.0.jar /app/frontend2.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "/app/frontend2.jar"]
