FROM adoptopenjdk/openjdk11:alpine-slim
EXPOSE 8090
ADD target/microservicio-activo-personal-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar","/app.jar"]