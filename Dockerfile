FROM openjdk:8-jdk-alpine

VOLUME /tmp
ADD target/spring-react-0.0.1-SNAPSHOT.jar app.jar
ENV JAVA_OPTS="-agentlib:jdwp=transport=dt_socket,address=5005,server=y,suspend=n"

ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar