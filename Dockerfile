FROM openjdk:8
LABEL maintainer="pinalp887@gmail.com"
VOLUME /temp
EXPOSE 8085
ARG JAR_FILE=target/Docker-1.0.jar
ADD ${JAR_FILE} Docker-1.0.jar 
ENTRYPOINT ["java", "-jar", "Docker-1.0.jar"]
