# webapp721
#### A simple webapp demo based on sping-boot,configed logback-spring.xml, pom.xml, application.yaml for dev,test,prod.

####1.you can package the project to a executable jar by commond:
    
    mvn clean package -P test -Denv=test -Dapp=webapp721
for a test jar  or

    mvn clean package -P dev
for a dev jar. which the different jar name and different logback config is the difference.

####2.you can start the jar by commond:
   
    java -jar test-webapp721.jar
for test jar or

    java -jar webapp721.jar
for dev jar. you don't have to append --spring.profiles.active=test like:

    java -jar test-webapp721.jar --spring.profiles.active=test
or

    java -jar webapp721.jar --spring.profiles.active=test
It all had been configed when maven package.
###Is that amazing?

####3.the key is:
*   @profileActive@ in application.yml.
*   <springProfile name="dev"> tag in logback-spring.xml
*   <springProperty > tag in logback-spring.xml
*   and <profiles> <properties> tags in pom.xml
*   <filters> tag in pom.
*   <resource.flitering> tags in pom.

####4.todo:
####I'll try to read .yml for Beans next time.See you.