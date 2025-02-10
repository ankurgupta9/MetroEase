# Use an official OpenJDK runtime as a parent image
FROM eclipse-temurin:21-jdk

# Set working directory inside the container
WORKDIR /app

# Copy Maven Wrapper and project files
COPY .mvn/ .mvn/
COPY mvnw pom.xml ./

# Give execute permission to mvnw
RUN chmod +x mvnw

# Build the application
RUN ./mvnw clean package -DskipTests

# Copy built JAR file to container
COPY target/*.jar app.jar

# Expose the port your app runs on
EXPOSE 8080

# Run the JAR file
CMD ["java", "-jar", "app.jar"]
