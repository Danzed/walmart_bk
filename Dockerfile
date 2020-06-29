FROM openjdk:11
ARG JAR_FILE=target/*.jar
EXPOSE 8080
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]