FROM adoptopenjdk/openjdk8:alpine-slim
ADD target/config-server-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","/app.jar"]