FROM open-liberty:19.0.0.9-microProfile3-java8-ibmsfj

COPY target/integration-tests-via-fabric8io.war /config/dropins/
