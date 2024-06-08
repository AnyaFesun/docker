FROM openjdk:8-jdk-alpine

RUN apk add --no-cache maven

WORKDIR /app

COPY pom.xml .
RUN mvn -B dependency:resolve dependency:resolve-plugins

COPY . .

RUN mvn -B clean package

CMD ["java", "-cp", "target/calculator-1.0-SNAPSHOT.jar", "com.example.Calculator"]
