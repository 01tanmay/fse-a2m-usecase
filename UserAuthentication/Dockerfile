FROM java:8
#WORKDIR user/src
#ENV MYSQL_URI jdbc:mysql://localhost:3306/ftb15
#ENV MYSQL_USER root
#ENV MYSQL_PASSWORD root
EXPOSE 8081

ADD target/user-auth.jar user-auth.jar

ENTRYPOINT ["java", "-jar", "user-auth.jar"]