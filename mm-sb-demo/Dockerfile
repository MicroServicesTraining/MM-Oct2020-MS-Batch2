FROM java:8-jdk-alpine

EXPOSE 8082:8082

COPY ./target/mm-sb-demo.jar /mm-sb-demo.jar

WORKDIR /docker-imgs

# java -jar mm-sb-demo.jar - to run our application
ENTRYPOINT ["java", "-jar", "/mm-sb-demo.jar"]
