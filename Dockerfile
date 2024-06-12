# Use a base image with Java 11 or the version required for your project
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the executable JAR file from the target directory to the working directory
COPY target/spring-boot-docker.jar app.jar

# Expose the port your application will run on
EXPOSE 8080

# Define the command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]