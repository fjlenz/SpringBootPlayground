FROM maven:latest AS build
RUN mkdir /SpringBootPlaygroundProject
COPY . /SpringBootPlaygroundProject
WORKDIR /SpringBootPlaygroundProject
RUN mvn clean package -DskipTests

FROM adoptopenjdk/openjdk11:latest
RUN mkdir /app
COPY --from=build /SpringBootPlaygroundProject/target/SpringBootPlayground-0.0.1-SNAPSHOT.jar /app/java-application.jar
WORKDIR /app
EXPOSE 8080
CMD "java" "-jar" "java-application.jar"

# 1 Build docker image locally with Dockerfile: docker build --pull --rm -f "Dockerfile" -t gcr.io/projectfj/spring-boot-playground-no-db:1.0.3 "."
# 2 check if image got created: docker images
# 3 Push to Google-Container-Registry (GCR): docker push gcr.io/projectfj/spring-boot-playground-no-db:1.0.3
# 4 manually deploy image from GCR inside Google console to Google Cloud Run
# 4a Make sure SECRETS are referenced tovia Environemnt Variable to Google-Secrets

