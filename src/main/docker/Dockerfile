####
# docker build -f src/main/docker/Dockerfile -t quarkus/quarkus-docker-rest .
#
# Then run the container using:
#
# docker run -i --rm -p 8080:8080 quarkus/quarkus-docker-rest-jvm
###
FROM openjdk:11.0.8-slim

# Install java and the run-java script
# Also set up permissions for user `1001`

# Configure the JAVA_OPTIONS, you can add -XshowSettings:vm to also display the heap size.
ENV JAVA_OPTIONS="-Dsecurerandom.source=file:/dev/urandom -Dquarkus.http.host=0.0.0.0 -Djava.util.logging.manager=org.jboss.logmanager.LogManager"

COPY target/lib/* /deployments/lib/
COPY target/*-runner.jar /deployments/app.jar

EXPOSE 8080
ENTRYPOINT [ "java","-jar","-Dsecurerandom.source=file:/dev/urandom -Dquarkus.http.host=0.0.0.0 -Djava.util.logging.manager=org.jboss.logmanager.LogManager", "/deployments/app.jar"]