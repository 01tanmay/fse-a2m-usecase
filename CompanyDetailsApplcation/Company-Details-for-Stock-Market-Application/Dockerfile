FROM java:8-jre
WORKDIR user/src
ENV MONGO_DATABASE=ftb15
ENV MONGO_URL=mongodb://localhost:27017/ftb15
ADD target/NoteService-0.0.1-SNAPSHOT.jar /user/src/NoteService-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "NoteService-0.0.1-SNAPSHOT.jar"]