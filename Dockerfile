FROM eclipse-temurin:21-jdk-jammy
COPY . .
RUN ./gradlew bootJar -x test
ENTRYPOINT java -Dspring.profiles.active=${PROFILES} -jar build/libs/findBugsProject-0.0.1-SNAPSHOT.jar