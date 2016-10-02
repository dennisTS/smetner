Test task based on Spring Boot + Spring Data Jpa / Rest.  
Can be run either by maven (mvn clean package spring-boot:run) or as a jar.

http://localhost:8080/home - web interface  
http://localhost:8080/browsers - rest interface  

Database connection is set up via application.properties and by default is:
spring.datasource.url=jdbc:mysql://localhost:3306/smetner  
spring.datasource.username=user  
spring.datasource.password=password  

Example request to add a new browser:  
POST /browsers/ HTTP/1.1  
HOST: localhost:8080  
  
{  
  "name": "Firefox",  
  "renderingEngine": "Gecko",  
  "platform": "Windows",  
  "engineVersion": "3.0",  
  "cssGrade": "C"  
}  
