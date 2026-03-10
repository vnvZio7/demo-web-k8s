FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app

COPY target/demo.jar app.jar

EXPOSE 8989

ENTRYPOINT ["java","-jar","app.jar"]
