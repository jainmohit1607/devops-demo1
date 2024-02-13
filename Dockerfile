FROM openjdk:17
WORKDIR /app

COPY target/demo.jar /app

CMD ["java", "-jar", "demo.jar"]
