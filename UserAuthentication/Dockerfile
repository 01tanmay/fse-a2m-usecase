FROM java:8
#WORKDIR user/src
#ENV MYSQL_URI jdbc:mysql://localhost:3306/ftb15
#ENV MYSQL_USER root
#ENV MYSQL_PASSWORD root
EXPOSE 8081
ADD target/User-Authentication-0.0.1-SNAPSHOT.jar User-Authentication-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "User-Authentication-0.0.1-SNAPSHOT.jar"]