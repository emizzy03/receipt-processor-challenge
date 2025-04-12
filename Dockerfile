# Use a Maven base image
FROM maven:3.9.4-eclipse-temurin-17 AS builder

# Set work directory in container
WORKDIR /RECEIPT-PROCESSOR-CHALLENGE

# Copy the project files
COPY . .

# Build the app (skip tests for faster builds)
RUN mvn clean package -DskipTests

# Use a lightweight Java runtime for running the app
FROM eclipse-temurin:17-jdk-alpine

WORKDIR /RECEIPT-PROCESSOR-CHALLENGE

# Copy the jar file from the builder stage
COPY --from=builder /RECEIPT-PROCESSOR-CHALLENGE/target/*.jar app.jar

# Expose the application port (e.g., 8080)
EXPOSE 8080

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
