FROM maven:3.9.6-eclipse-temurin-17-focal


COPY  pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

ENTRYPOINT [ "java", "-jar", "/target/crud-0.0.1-SNAPSHOT.jar"]