FROM openjdk:8-jdk-alpine

ENV EUREKA_PORT=8761
ENV EUREKA_HOSTNAME=localhost
ENV EUREKA_ENV=dev

WORKDIR /usr/app

COPY ./target/eureka-server*.jar ./eureka-server.jar

EXPOSE 8761

ENTRYPOINT ["java", "-jar", "./eureka-server.jar"]