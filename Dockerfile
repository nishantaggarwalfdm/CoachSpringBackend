# Use lightweight Java 17 runtime
FROM eclipse-temurin:17-jdk-alpine

# Copy the exact JAR produced by Maven into the image
COPY target/SpringJPADemo23-1-0.0.1-SNAPSHOT.jar app.jar

# Expose Spring Boot default port
EXPOSE 8080

# Run the app
ENTRYPOINT ["java","-jar","/app.jar"]