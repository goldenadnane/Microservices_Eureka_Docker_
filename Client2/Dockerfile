# Use the official OpenJDK base image
FROM openjdk:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container at the specified working directory
COPY Client2-0.0.1-SNAPSHOT.jar app.jar

# Expose the port the app runs on
EXPOSE 8089

# Command to run the application
CMD ["java", "-jar", "app.jar"]
