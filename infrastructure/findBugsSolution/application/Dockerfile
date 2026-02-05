FROM eclipse-temurin:21-jdk-jammy
COPY . .
RUN ./gradlew bootJar -x test --no-daemon
ENV SPRING_PROFILES_ACTIVE=${profile}
ENV ENCRYPTOR_PASSWORD=${ENCRYPTOR_PASSWORD}
CMD ["java", "-Dencryptor.password=${ENCRYPTOR_PASSWORD}", "-jar", "build/libs/findBugsProject-0.0.1-SNAPSHOT.jar"]