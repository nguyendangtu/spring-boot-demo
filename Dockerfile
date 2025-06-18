FROM eclipse-temurin:17-jdk-alpine
RUN apk add curl
VOLUMN /tmp
EXPOSE 8080
ADD target/spring-aws-demo-service.jar spring-aws-demo-service.jar
ENTRYPOINT ["java","-jar","/spring-aws-demo-service.jar"]