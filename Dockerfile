FROM openjdk:11
EXPOSE 9091
ADD target/spring-ci-cd.jar spring-ci-cd.jar
ENTRYPOINT ["java", "-jar", "/spring-ci-cd.jar"]