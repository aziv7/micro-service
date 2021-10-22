FROM openjdk:15
EXPOSE 8080
ADD /target/GroupServerFinal-0.0.1-SNAPSHOT.jar GroupServerFinal-0.0.1-SNAPSHOT.jar 
ENTRYPOINT ["java", "-jar", "GroupServerFinal-0.0.1-SNAPSHOT.jar"]