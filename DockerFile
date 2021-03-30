FROM openjdk:11
ARG JAR_FILE
# COPY target/app.jar app.jar
ADD ./target/*.jar /usr/local/

ENTRYPOINT ["java", "-jar", "/usr/local/app.jar"]