# Hydra Java with SpringBoot

This is a minor refactoring of the [Hydra Java](https://github.com/dschulten/hydra-java/tree/master/hydra-sample) 
sample application using [SpringBoot](http://projects.spring.io/spring-boot/) as opposed
building and deploying a WAR file to a servlet container. 

## Running

The project uses Gradle and can be executed by running:

    ./gradlew bootRun
    
    
Then point your browser to [http://localhost:8080](http://localhost:8080). By default, 
 the responses will be sent using the HAL format. You will need to use a tool such as
 [Postman](https://www.getpostman.com/) to view the desired media types (JSON-LD, Siren, etc.).
