FROM openjdk:17.0.1-jdk
WORKDIR /app
COPY target/cf-backend-0.0.1-SNAPSHOT.jar /app/app.jar
ENV SPRING_PROFILES_ACTIVE=dev
EXPOSE 8080

LABEL version="1.0"
LABEL description="cf-backend"
LABEL latest=true

CMD ["java", "-jar", "app.jar"]
