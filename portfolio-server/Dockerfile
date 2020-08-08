FROM amazoncorretto:11

ARG JAR_FILE=portfolio-web/target/*.jar
COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java", "-Dspring.profiles.active=local","-jar","/app.jar"]
