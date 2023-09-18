FROM amazoncorretto:19.0.2

WORKDIR /app

COPY . .

RUN ./gradlew clean build -x test

EXPOSE 8080

CMD ["java", "-jar", "build/libs/library-0.0.1-SNAPSHOT.jar"]