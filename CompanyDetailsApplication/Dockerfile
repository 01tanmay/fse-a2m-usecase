FROM java:8

EXPOSE 8082

ADD target/company-details.jar company-details.jar

ENTRYPOINT ["java", "-jar", "company-details.jar"]