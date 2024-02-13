FROM openjdk:17
# Set the working directory
WORKDIR /app

# Copy the packaged jar file into the container
COPY target/devopsDemo-0.0.1-SNAPSHOT.jar /app/demo.jar

# Command to run the application
CMD ["java", "-jar", "demo.jar"]
