# Stage 1 - Build
FROM maven:3.9.9-eclipse-temurin-17 AS build
WORKDIR /build
COPY . .
RUN mvn clean package -DskipTests

# Stage 2 - Run
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app
COPY --from=build /build/target/iot-monitoring-system.jar app.jar
ENTRYPOINT ["java","-jar","app.jar" ]