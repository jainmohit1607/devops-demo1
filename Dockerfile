FROM openjdk:11-jre-slim
WORKDIR /app
COPY target/My-application.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
