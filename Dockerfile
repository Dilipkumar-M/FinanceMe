FROM openjdk:11
COPY target/*.jar app.jar
COPY src/main/webapp/ /static/
WORKDIR /
ENTRYPOINT ["java", "-jar", "app.jar"]
