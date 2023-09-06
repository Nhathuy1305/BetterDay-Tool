FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY target/betterdaytool.jar /app/
EXPOSE 8080
CMD ["java", "-jar", "betterdaytool.jar"]