FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/frontend-1.0.0.jar /app/frontend.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "/app/frontend.jar"]
