FROM openjdk:11
ADD target/booking-ws-0.0.1-SNAPSHOT.jar booking-ws-0.0.1-SNAPSHOT.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "booking-ws-0.0.1-SNAPSHOT.jar"]
