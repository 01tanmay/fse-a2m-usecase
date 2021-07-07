FROM java:8-jre
WORKDIR user/src
ENV MYSQL_URI jdbc:mysql://localhost:3306/ftb15
ENV MYSQL_USER root
ENV MYSQL_PASSWORD root
ADD target/UserAuthentication-Service-0.0.1-SNAPSHOT.jar /user/src/UserAuthentication-Service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "UserAuthentication-Service-0.0.1-SNAPSHOT.jar"]
