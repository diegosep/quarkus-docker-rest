FROM openjdk:11.0.8-slim
COPY target/lib/* /deployments/lib/
COPY target/*-runner.jar /deployments/app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","-Dsecurerandom.source=file:/dev/urandom -Dquarkus.http.host=0.0.0.0 -Djava.util.logging.manager=org.jboss.logmanager.LogManager", "/deployments/app.jar"]