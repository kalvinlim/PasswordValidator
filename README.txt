Kalvin Lim's Spring Boot RESTful API service implementation

Written in IntelliJ IDEA 14.1.4, Maven, JDK 1.8.0_40, Windows 10

--------------------------------------------------------------------------------------
To run:

IntelliJ- Import project and run Spring Boot main class: com.validator.password.init.Application

-- or --

Git Bash: $ mvn package && java -jar target/PasswordValidator-1.0-SNAPSHOT.jar

--------------------------------------------------------------------------------------
To configure validation algorithms:

com.validator.service.ValidatorServiceConfig

Modify the algorithm implementations passed into the ValidatorService contructor


--------------------------------------------------------------------------------------
To access API endpoint:

Chrome browser:

http://localhost:1337/api/validate/isthisagoodpassword123
http://localhost:1337/api/validate/abab
http://localhost:1337/api/validate/foobar123


Git Bash:
$ curl localhost:1337/api/validate/isthisagoodpassword123
$ curl localhost:1337/api/validate/abab
$ curl localhost:1337/api/validate/foobar123
---------------------------------------------------------------------------------------

In the event of a port collision with port 1337, modify src/main/resources/application.properties