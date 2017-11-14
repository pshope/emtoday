FROM openjdk:8
VOLUME /tmp
ADD target/login-service-1.0-SNAPSHOT.jar login-service.jar
ENV JAVA_OPTS=""
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /login-service.jar