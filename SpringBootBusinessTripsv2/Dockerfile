# A two Stage Dockerfile with a build stage and a run -stage!
FROM maven:3.6.3-jdk-11 as backend-build
WORKDIR ./
COPY pom.xml .
### Step 2 Copy the source and build the .jar
COPY src src
# we run first a build 
RUN mvn install -DskipTests

#CMD mvn clean spring-boot:run
### Stage 2 - Let's build a minimal image with the "deployable package"
FROM openjdk:8-jdk-alpine
# we add the jar to the working dir and execute it!
COPY  target/*.jar app.jar
# Define an Entry-startpoint of the image
ENTRYPOINT ["sh", "-c", "java -jar app.jar"]
