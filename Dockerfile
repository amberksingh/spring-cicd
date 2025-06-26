FROM openjdk:17-alpine
WORKDIR /app
COPY target/spring-cicd.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]