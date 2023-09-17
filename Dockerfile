FROM adoptopenjdk/openjdk11:alpine-jre

EXPOSE 8080

COPY target/ServiceAuthorization-0.0.1-SNAPSHOT.jar serviceAuth.jar

CMD ["java", "-jar","serviceAuth.jar"]