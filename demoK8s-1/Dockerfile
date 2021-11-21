FROM nelson9291/apline-openjdk17:latest
COPY /build/libs/demoK8s-0.0.1-SNAPSHOT.jar /demoK8s.jar
ENTRYPOINT ["java","-jar","/demoK8s.jar"]
ENV NAMED=$NANED
EXPOSE 8080