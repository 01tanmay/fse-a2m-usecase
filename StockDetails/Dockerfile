FROM java:8

EXPOSE 8083

ADD target/stock-price.jar stock-price.jar

ENTRYPOINT ["java", "-jar", "stock-price.jar"]