FROM maven:latest AS build
RUN mkdir /SpringBootPlaygroundProject
COPY . /SpringBootPlaygroundProject
WORKDIR /SpringBootPlaygroundProject
RUN mvn clean package -DskipTests

FROM adoptopenjdk/openjdk11:latest
RUN mkdir /app
COPY --from=build /SpringBootPlaygroundProject/target/SpringBootPlayground-0.0.1-SNAPSHOT.jar /app/java-application.jar
WORKDIR /app
CMD "java" "-jar" "java-application.jar"
