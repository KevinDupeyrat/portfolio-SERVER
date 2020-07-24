FROM amazoncorretto:11

ARG JAR_FILE=portfolio-web/target/*.jar
RUN echo $(pwd)
RUN echo $(ls)
COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
