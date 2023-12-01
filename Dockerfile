FROM openjdk:17-alpine
COPY ./target/*.jar bank-core-service.jar
RUN sh -c 'touch bank-core-service.jar'
EXPOSE 8092
ENTRYPOINT ["java","-jar","bank-core-service.jar"]